
import java.io.File;
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

    public String printAccounts(){
        StringBuilder temp = new StringBuilder();
        for (Account acc : accounts) {
            if (acc != null) {
                temp.append(acc.getHouseholdCode()).append("\n");
                for (int y = 0; y < acc.getMemList().length; y++) {
                    if (!Objects.equals(acc.getMemList()[y], null))
                        temp.append("\t\t").append(acc.getMemList()[y].getDisplayName()).append("\n");
                }
            }
        }
        return temp.toString();
    }
    
    boolean isValidAccount(String hhc)
    {
        for (Account acc : accounts)
            if (acc != null)
                if (acc.getHouseholdCode().equals(hhc))
                    return true;
        return false;
    }
    
    Account getAccount(String hhc)
    {
        for (Account acc : accounts)
            if (acc != null)
                if (acc.getHouseholdCode().equals(hhc))
                    return acc;
        return null;
    }
}
