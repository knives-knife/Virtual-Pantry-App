/*
    DatabaseHandler class
    Handles the database files for all the household pantries and fridges
    Contstructor takes in string household code input to see which household's pantry/fridge to access.
    Reads files and stores the ingredients in pantry and fridge as an array
    Backend, has methods to allow access to the database
    Methods:
        printPantry: prints pantry
        printFridge: prints fridge
        addToPantry: takes Item object as parameter and adds it to the pantry array of the household
        addToFridge: takes Item object as parameter and adds it to the fridge array of the household
        removeFromPantry: takes String of item name as parameter and remove from pantry array of the household
        removeFromFridge: takes String of item name as parameter and removes from fridge array of the household
        get methods: return the respective objects asked for
        writeToPantry/Fridge: updates the pantry and fridge files for respective household after changes have been made to the array.
*/
import java.util.*;
import java.io.*;

//handles the files of all household pantries and fridges. Includes get, add, delete, and update methods.
public class DatabaseHandler {
    String hhCode;              //household code
    Item[]  pantry, fridge;   //array ingredients in the pantry and fridge of household
    int  pSize, fSize;          //size of pantry and fridge, max value is 100

    //takes in string for the account code to find the file to read write from, and gets everything from the database to arrays.
    public DatabaseHandler(String x) throws Exception{
        Scanner inP;
        Scanner inF;
        String hhPantryF;
        String hhFridgeF;

        hhCode = x;
        pSize = fSize = 0;

        try {
            //the string equals the household code
            switch (hhCode) {
                case "ABCDEFGHI":
                    hhPantryF = "householdPantry1.txt";
                    hhFridgeF = "householdFridge1.txt";
                    break;
                case "JKLMNOPQR":
                    hhPantryF = "householdPantry2.txt";
                    hhFridgeF = "householdFridge2.txt";
                    break;
                case "STUVWXYZA":
                    hhPantryF = "householdPantry3.txt";
                    hhFridgeF = "householdFridge3.txt";
                    break;
                default:
                    throw new Exception("Invalid String");
            }

            inP = new Scanner(getClass().getResourceAsStream(hhPantryF));
            inF = new Scanner(getClass().getResourceAsStream(hhFridgeF));

            pantry = new Item[100];       //maximum value hardcoded to 100
            fridge = new Item[100];

            int index = 0;
            int index2 = 0;
            while(inP.hasNextLine()){
                String temp = inP.nextLine();
                pantry[index] = new Item(temp);
                index++;
                pSize++;
            }
            while(inF.hasNextLine()){
                String temp = inF.nextLine();
                fridge[index2] = new Item(temp);
                index2++;
                fSize++;
            }

            inP.close();
            inF.close();

        }catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }

    //prints the pantry as "itemname" + " itemname2" ...etc
    public void printPantry(){
        for (Item s : pantry) {
            if (s != null)
                System.out.print(s.getName() + " ");
        }
        System.out.println();
    }

    //prints the fridge as "itemname" + " itemname2" ...etc
    public void printFridge(){
        for (Item s : fridge) {
            if (s != null)
                System.out.print(s.getName() + " ");
        }
        System.out.println();
    }

    //takes in an item as parameter and adds it to the array, then calls the write method to update pantry
    public void addToPantry(Item item) throws Exception {
        for(int x = 0; x < pantry.length; x++){
            if(pantry[x] == null){
                pantry[x] = item;
                pSize++;
                break;
            }
        }
        writeToPantry();
    }

    //takes in an item as parameter and adds it to the array, then calls the write method to update fridge
    public void addToFridge(Item item) throws Exception {
        for(int x = 0; x < fridge.length; x++){
            if(fridge[x] == null){
                fridge[x] = item;
                fSize++;
                break;
            }
        }
        writeToFridge();
    }

    //takes in item as parameter and deletes it from array, then updates the file
    public void deleteFromPantry(String item) throws Exception {
        for(int x = 0; x < pantry.length; x++){
            if(pantry[x] != null && pantry[x].getName().equals(item)){
                pantry[x] = null;
                pSize--;
                break;
            }
        }
        writeToPantry();
    }

    //takes in item as parameter and deletes it from array, then updates the file
    public void deleteFromFridge(String item) throws Exception {
        for(int x = 0; x < fridge.length; x++){
            if(fridge[x] != null && fridge[x].getName().equals(item)){
                fridge[x] = null;
                fSize--;
                break;
            }
        }
        writeToFridge();
    }

    //returns size of pantry
    public int getPantrySize(){return pSize;}

    //returns size of fridge
    public int getFridgeSize(){return fSize;}

    //returns pantry array
    public Item[] getPantry(){return pantry;}

    //returns fridge array
    public Item[] getFridge(){return fridge;}

    //updates the fridge file of the appropriate household, takes values in the array and stores them back into the file
    public void writeToFridge() throws Exception{
        try {
            File hhFridgeF;
            //the string equals the household code
            switch (hhCode) {
                case "ABCDEFGHI":
                    hhFridgeF = new File("householdFridge1.txt");
                    break;
                case "JKLMNOPQR":
                    hhFridgeF = new File("householdFridge2.txt");
                    break;
                case "STUVWXYZA":
                    hhFridgeF = new File("householdFridge3.txt");
                    break;
                default:
                    throw new Exception("Invalid String");
            }

            PrintWriter out = new PrintWriter(hhFridgeF);
            for (Item s : fridge) {
                if (s != null) {
                    out.println(s.getName());
                }
            }
            out.close();

        }catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }

    //updates the pantry file of the appropriate household, takes values in the array and stores them back into the file
    public void writeToPantry() throws Exception{
        try {
            File hhPantryF;
            //the string equals the household code
            switch (hhCode) {
                case "ABCDEFGHI":
                    hhPantryF = new File("householdPantry1.txt");
                    break;
                case "JKLMNOPQR":
                    hhPantryF = new File("householdPantry2.txt");
                    break;
                case "STUVWXYZA":
                    hhPantryF = new File("householdPantry3.txt");
                    break;
                default:
                    throw new Exception("Invalid String");
            }
            PrintWriter out = new PrintWriter(hhPantryF);
            for (Item s : pantry) {
                if (s != null) {
                    out.println(s.getName());
                }
            }
            out.close();

        }catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
