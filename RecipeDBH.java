/*
    RecipeDBH class
    Handles the database files which contains the recipes, their description, and the ingredients.
    Reads froma a file from recipes.txt, which will not be accessed or changed through out the program
    Stores content of file as Recipe objects, and stores them into the array
    Methods:
        printRecipes: returns the recipes array as a string
        printRecipes: overloaded method, if given with input of Recipe[], returns the recipe array of the parameter as a string
        getRecipes: takes a pantry and fridge array as parameters, and returns an array of all the recipes that can be made from the
            ingredients in the pantry and fridge.
        search: takes string of recipe name as parameter, returns the Recipe object that the name belongs to, or null if no recipe found.
*/

import java.util.*;

public class RecipeDBH {
    Recipe[] recipes;
    int rSize;

    public RecipeDBH(){
        Scanner in;
        try {
            in = new Scanner(getClass().getResourceAsStream("recipes.txt"));
            rSize = 0;

            recipes = new Recipe[100];

            int index = 0;
            while(in.hasNextLine()){
                String recipeName = in.nextLine();
                String desc1 = in.nextLine();
                String desc2 = in.nextLine();
                String desc3 = in.nextLine();
                String temp = in.nextLine();
                int index2 = 0;
                Item[] recipeIngredients = new Item[100];
                while(in.hasNextLine() && !temp.equals("*")){
                    recipeIngredients[index2] = new Item(temp);
                    temp = in.nextLine();
                    index2++;
                }
                recipes[index] = new Recipe(recipeName, new String[]{desc1, desc2, desc3}, recipeIngredients);
                index++;
            }
            in.close();

        }catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }

    //this returns a string of recipes (does not print, ik I suck at naming) of the recipes IN THE DATABASE
    public String printRecipes(){
        StringBuilder temp = new StringBuilder();
        for (Recipe recipe : recipes) {
            if (recipe != null) {
                temp.append(recipe.getName())
                        .append("\n").append("\t").append(recipe.getDescription()[0])
                        .append("\n").append("\t").append(recipe.getDescription()[1])
                        .append("\n").append("\t").append(recipe.getDescription()[2])
                        .append("\n");
                for (int y = 0; y < recipe.getIngredients().length; y++) {
                    if (!Objects.equals(recipe.getIngredients()[y], null))
                        temp.append("\t\t").append(recipe.getIngredients()[y]).append("\n");
                }
            }
        }
        return temp.toString();
    }

    //returns a string for the recipes, THE RECIPES IN THE PARAMETER, NOT THE RECIPES IN DATABASE
    public String printRecipes(Recipe[] recipes){
        StringBuilder temp = new StringBuilder();
        for (Recipe recipe : recipes) {
            if (recipe != null) {
                temp.append(recipe.getName())
                        .append("\n").append("\t").append(recipe.getDescription()[0])
                        .append("\n").append("\t").append(recipe.getDescription()[1])
                        .append("\n").append("\t").append(recipe.getDescription()[2])
                        .append("\n");
                for (int y = 0; y < recipe.getIngredients().length; y++) {
                    if (!Objects.equals(recipe.getIngredients()[y], null))
                        temp.append("\t\t").append(recipe.getIngredients()[y]).append("\n");
                }
            }
        }
        return temp.toString();
    }

    //returns a Recipe[] of every recipe you can make given the items in pantry and fridge. it has 100 elements, so check for null
    public Recipe[] getRecipes(Item[] pantry, Item[] fridge){
        Recipe[] availableRecipes = new Recipe[100];
        String[] ingredients = new String[200];
        //two for loops to store both
        for(int x = 0; x < pantry.length; x++){
            if(pantry[x] != null){
                ingredients[x] = pantry[x].getName();
            }
        }
        for(int x = 0; x < fridge.length; x++){
            if(fridge[x] != null){
                ingredients[100+x] = fridge[x].getName();
            }
        }

        //for loop to compare What recipes can you make
        for(int x = 0; x < recipes.length; x++){
            if(recipes[x] != null){
                boolean canMake = true;
                //for loop to check each ingredient
                for(int y = 0; y < recipes[x].getIngredients().length; y++){
                    List<String> ingList = new ArrayList<>(Arrays.asList(ingredients));
                    if (recipes[x].getIngredients()[y] != null)
                    {
                        canMake = ingList.contains(recipes[x].getIngredients()[y].getName());
                        if(!canMake) break;
                    }
                }
                //went through whole ingredient list with no missing
                if(canMake){
                    availableRecipes[x] = recipes[x];
                }
            }
        }
        return availableRecipes;
    }

    public Recipe search(String name){
        for (Recipe recipe : recipes) {
            if (recipe != null && recipe.getName().equals(name)) {
                return recipe;
            }
        }
        return null;
    }
}
