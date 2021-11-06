import java.time.LocalDate;    

public class Item {

    String name;
    int quantity;
    LocalDate expDate;
    boolean favorite;

    public Item() {

        this.name = "initalfoodname";
        this.quantity = 0;
        this.expDate = 2021-03-13;
        this.favorite = false;
    }

    public LocalDate getexpDate() {
        return expDate;
    }

    public void setexpDate(LocalDate expDate) {
        this.expDate = expDate;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
