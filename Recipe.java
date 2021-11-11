/*
    Recipe Class
    Defines the Recipe class which contains a name for the recipe, the description of the recipe, and a list of ingredients for the recipe
    User does not access this class, used for backend purposes
    Constructor (which is mostly called in the RecipeDBH) takes the the name, array of description, and array of ingredients and stores them
    Has getter methods
    overwrites toString which prints the recipe as a string
*/
import java.util.Objects;

//Recipe class, recipes have a name, description, and ingredients.
public class Recipe {
    String name;
    String[] description;
    Item[] ingredients;       //will be Item[] once finished

    public Recipe(String n, String[] d, Item[] i){
        this.name = n;
        this.description = d;
        this.ingredients = i;
    }

    public String getName(){
        return name;
    }

    public String[] getDescription(){
        return description;
    }

    public Item[] getIngredients(){
        return ingredients;
    }

    public String toString(){
        StringBuilder temp = new StringBuilder();
        temp.append(getName())
                .append("\n").append(getDescription()[0])
                .append("\n").append(getDescription()[1])
                .append("\n").append(getDescription()[2])
                .append("\n");
        for (int y = 0; y < getIngredients().length; y++) {
            if (!Objects.equals(getIngredients()[y], null))
                temp.append(getIngredients()[y].getName()).append("\n");
        }
        return temp.toString();
    }
}
