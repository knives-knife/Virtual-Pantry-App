import java.io.File;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Scanner;

//handles the files of all household pantries and fridges. Includes get, add, delete, and update methods.
public class AccountDBH
{
    Account[] accounts;

    //takes in string for the account code to find the file to read write from, and gets everything from the database to arrays.
    public AccountDBH() throws Exception
    {
        Scanner inA;
        File accountsFile;
        try
        {
            accountsFile = new File("accounts.txt");
            inA = new Scanner(accountsFile);
            accounts = new Account[100];
            int index = 0;
            while (inA.hasNextLine())
            {
                String hhCode = inA.nextLine();
                int index2 = 0;
                String temp = inA.nextLine();
                Member[] mems = new Member[100];
                while(inA.hasNextLine() && !temp.equals("*")){
                    mems[index2] = new Member(temp);
                    temp = inA.nextLine();
                    index2++;
                }
                accounts[index] = new Account(hhCode, mems);
                index++;
            }
            inA.close();

        }
        catch (Exception e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    //returns a string of accounts... yea i need to name stuff better mb
    public String printAccounts(){
        StringBuilder temp = new StringBuilder();
        for (Account recipe : accounts) {
            if (recipe != null) {
                temp.append(recipe.getHouseholdCode()).append("\n");
                for (int y = 0; y < recipe.getMemList().length; y++) {
                    if (!Objects.equals(recipe.getMemList()[y], null))
                        temp.append("\t\t").append(recipe.getMemList()[y].getDisplayName()).append("\n");
                }
            }
        }
        return temp.toString();
    }

    public void addMember(Member[] m){

    }

    public void deleteMember(String a, String name){
        for (Account account : accounts) {
            if (account != null && account.getHouseholdCode().equals(a)) {
                for (int y = 0; y < account.getMemList().length; y++) {
                    if (account.getMemList()[y] != null && account.getMemList()[y].getDisplayName().equals(name)) {
                        account.getMemList()[y] = null;
                    }
                }
            }
        }
        updateAccountFile();
    }

    public void updateAccountFile(){
        try {
            File hhFridgeF = new File("accounts.txt");
            PrintWriter out = new PrintWriter(hhFridgeF);
            String asterisk = "";
            for (Account s : accounts) {
                if (s != null) {
                    out.print(asterisk);
                    asterisk = "*\n";
                    out.println(s.getHouseholdCode());
                    for(int x = 0; x < s.getMemList().length; x++){
                        if(s.getMemList()[x] != null){
                            out.println(s.getMemList()[x].getDisplayName());
                        }
                    }
                }
            }
            out.close();

        }catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }

}