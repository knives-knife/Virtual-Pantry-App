import java.io.File;
import java.util.Objects;
import java.util.Scanner;

//yo i forgot the methods i need to do here

public class RecipeDBHandler {
    Recipe[] recipes;
    int rSize;

    public RecipeDBHandler(){
        Scanner in;
        try {
            File recipe_file = new File("recipes.txt");
            in = new Scanner(recipe_file);
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
                String[] recipeIngredients = new String[100];
                while(in.hasNextLine() && !temp.equals("*")){
                    recipeIngredients[index2] = temp;
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

    public String printRecipes(){
        StringBuilder temp = new StringBuilder();
        for (Recipe recipe : recipes) {
            if (recipe != null) {
                temp.append(recipe.getName()).append("\n")
                        .append("\t").append(recipe.getDescription()[0])
                        .append("\n").append("\t").append(recipe.getDescription()[1])
                        .append("\n").append("\t").append(recipe.getDescription()[2])
                        .append("\n");
                for (int y = 0; y < recipe.getIngredients().length; y++) {
                    if (!Objects.equals(recipe.getIngredients()[y], "#"))
                        temp.append("\t\t").append(recipe.getIngredients()[y]).append("\n");
                }
            }
        }
        return temp.toString();
    }
}
