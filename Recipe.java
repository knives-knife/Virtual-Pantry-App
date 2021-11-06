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
