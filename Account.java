import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author joahp
 */
class Account {
    private String householdCode;
    private Member[] memberList;

    public Account(String h, Member[] m) {
        householdCode = h;
        memberList = m;
    }

    private String createHouseholdCode()
    {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int length = 10;
        for(int i = 0; i < length; i++)
        {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        return sb.toString();
    }

    boolean hasMember(String disName)
    {
        return true;
    }

    Member[] getMemList()
    {
        return this.memberList;
    }

    Member getMember(String dn)
    {
        return new Member();
    }

    String getHouseholdCode()
    {
        return this.householdCode;
    }
}