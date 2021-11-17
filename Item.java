/*
Item
    The Item Class is a structure to hold and get information about an Item. 
    Instances of the Item Class are used in the pantry, fridge, shopping list,
        and recipes. 
    An instance of the Item class has a name - the name of the item - a quantity - 
        how much of the item (could be null) - an expiration date - initially 
        given as a string and parsed into a LocalDate type - and if that item is
        a favorite - a boolean that is true for favorite and false otherwise. 
    Methods - 
        All methods are getters or setters for the describes attributes. 
 */

import java.time.LocalDate;

public class Item
{

    String name;
    int quantity;
    LocalDate expDate;
    boolean favorite;

    public Item()
    {
        this.name = "initalfoodname";
        this.quantity = 0;
        this.favorite = false;
    }

    public Item(String s, int q, String d)
    {
        this.name = s;
        this.quantity = q;

        if (d != null)
        {
            String[] chars = d.split("");
            String temp = chars[0] + chars[1] + chars[2] + chars[3] + "-" + chars[4] + chars[5] + "-" + chars[6] + chars[7];
            expDate = LocalDate.parse(temp);
        }
        favorite = false;
    }

    public Item(String s)
    {
        this.name = s;
        this.quantity = 999;        //if the value is 999, it never runs out?
        this.expDate = null;
    }

    public LocalDate getExpDate()
    {
        return expDate;
    }

    public void setExpDate(String expD)
    {
        String[] chars = expD.split("");
        String temp = chars[0] + chars[1] + chars[2] + chars[3] + "-" + chars[4] + chars[5] + "-" + chars[6] + chars[7];
        this.expDate = LocalDate.parse(temp);
    }

    public void setExpDate(LocalDate expD)
    {
        this.expDate = expD;
    }

    public LocalDate getexpDate()
    {
        return expDate;
    }

    public void setexpDate(LocalDate expDate)
    {

        this.expDate = expDate;
    }

    public Boolean getFavorite()
    {
        return favorite;
    }

    public void setFavorite(boolean favorite)
    {
        this.favorite = favorite;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

}
