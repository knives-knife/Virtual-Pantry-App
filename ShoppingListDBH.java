/*
    ShoppingListDBH class
    Reads from household SL files, and stores information in file as Item array
    Constructor takes household code as parameter to know which file to access
    Methods:
        printSL: prints the ShoppingList array
        addToSL: takes Item as parameter and adds to the array of Shopping list
        removeFromSL: takes name of item as parameter and removes from shopping list array
        writeToSL: update ShoppingList file of respective hh code after a change to the shopping list array has been made.
*/

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ShoppingListDBH {
    String hhCode;
    Item[] shoppingList;
    int slSize;

    public ShoppingListDBH(String x){
        Scanner in;
        String hhSLF;

        hhCode = x;
        slSize = 0;

        try {
            //the string equals the household code
            switch (hhCode) {
                case "ABCDEFGHI":
                    hhSLF = "householdSL1.txt";
                    break;
                case "JKLMNOPQR":
                    hhSLF = "householdSL2.txt";
                    break;
                case "STUVWXYZA":
                    hhSLF = "householdSL3.txt";
                    break;
                default:
                    throw new Exception("Invalid String");
            }

            in = new Scanner(getClass().getResourceAsStream(hhSLF));
            shoppingList = new Item[100];       //maximum value hardcoded to 100

            int index = 0;
            while(in.hasNextLine()){
                String temp = in.nextLine();
                shoppingList[index] = new Item(temp);
                index++;
                slSize++;
            }
            in.close();

        }catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public void printSL(){
        for (Item s : shoppingList) {
            if (s != null)
                System.out.print(s.getName() + " ");
        }
        System.out.println();
    }

    public void addToSL(Item item){
        for(int x = 0; x < shoppingList.length; x++){
            if(shoppingList[x] == null){
                shoppingList[x] = item;
                slSize++;
                break;
            }
        }
        writeToSL();
    }

    public void deleteFromSL(String item){
        for(int x = 0; x < shoppingList.length; x++){
            if(shoppingList[x] != null && shoppingList[x].getName().equals(item)){
                shoppingList[x] = null;
                slSize--;
                break;
            }
        }
        writeToSL();
    }

    public void writeToSL(){
        try {
            String hhFridgeF;
            //the string equals the household code
            switch (hhCode) {
                case "ABCDEFGHI":
                    hhFridgeF = "householdSL1.txt";
                    break;
                case "JKLMNOPQR":
                    hhFridgeF = "householdSL2.txt";
                    break;
                case "STUVWXYZA":
                    hhFridgeF = "householdSL3.txt";
                    break;
                default:
                    throw new Exception("Invalid String");
            }

            String filePath = new File("").getAbsolutePath();
            filePath = filePath.concat("\\src\\" + hhFridgeF);
            PrintWriter out = new PrintWriter(filePath);
            for (Item s : shoppingList) {
                if (s != null) {
                    out.println(s.getName());
                }
            }
            out.close();

        }catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
    
    Item[] getSL()
    {
        return this.shoppingList;
    }

}
