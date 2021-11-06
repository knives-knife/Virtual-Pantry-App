//Recipe class, recipes have a name, description, and ingredients.
public class Recipe {
    String name;
    String[] description;
    String[] ingredients;       //will be Item[] once finished

    public Recipe(String n, String[] d, String[] i){
        this.name = n;
        this.description = d;
        this.ingredients = i;

        for(int x = 0; x < description.length; x++){
            if(description[x] == null){
                description[x] = "#";
            }
        }

        for(int x = 0; x < ingredients.length; x++){
            if(ingredients[x] == null){
                ingredients[x] = "#";
            }
        }
    }

    public String getName(){
        return name;
    }

    public String[] getDescription(){
        return description;
    }

    public String[] getIngredients(){
        return ingredients;
    }
}
