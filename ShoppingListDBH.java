
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ShoppingListDBH {
    String hhCode;
    String[] shoppingList;
    int slSize;

    public ShoppingListDBH(String x){
        Scanner in;
        File hhSLF;

        hhCode = x;
        slSize = 0;

        try {
            //the string equals the household code
            switch (hhCode) {
                case "ABCDEFGHI":
                    hhSLF = new File("householdSL1.txt");
                    break;
                case "JKLMNOPQR":
                    hhSLF = new File("householdSL2.txt");
                    break;
                case "STUVWXYZA":
                    hhSLF = new File("householdSL3.txt");
                    break;
                default:
                    throw new Exception("Invalid String");
            }

            in = new Scanner(hhSLF);
            shoppingList = new String[100];       //maximum value hardcoded to 100

            int index = 0;
            while(in.hasNextLine()){
                String temp = in.nextLine();
                shoppingList[index] = temp;
                index++;
                slSize++;
            }
            in.close();

        }catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public void printSL(){
        for (String s : shoppingList) {
            if (s != null)
                System.out.print(s + " ");
        }
        System.out.println();
    }

    public void addToSL(String item){
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
            if(shoppingList[x] != null && shoppingList[x].equals(item)){
                shoppingList[x] = null;
                slSize--;
                break;
            }
        }
        writeToSL();
    }

    public void writeToSL(){
        try {
            File hhFridgeF;
            //the string equals the household code
            switch (hhCode) {
                case "ABCDEFGHI":
                    hhFridgeF = new File("householdSL1.txt");
                    break;
                case "JKLMNOPQR":
                    hhFridgeF = new File("householdSL2.txt");
                    break;
                case "STUVWXYZA":
                    hhFridgeF = new File("householdSL3.txt");
                    break;
                default:
                    throw new Exception("Invalid String");
            }

            PrintWriter out = new PrintWriter(hhFridgeF);
            for (String s : shoppingList) {
                if (s != null) {
                    out.println(s);
                }
            }
            out.close();

        }catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }


}
