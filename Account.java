
import java.util.Random;

/**
 *
 * @author joahp
 */
class Account
{

    private String householdCode;
    private Member[] memberList;

    //Account constructor that takes h as the household code and a Member array m
    public Account(String h, Member[] m)
    {
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
        for (Member mem : memberList)
        {
            if (mem != null)
            {
                if (mem.getDisplayName().equals(disName))
                {
                    return true;
                }
            }
        }
        return false;
    }

    Member[] getMemList()
    {
        return this.memberList;
    }

    Member getMember(String dn)
    {for (Member mem : memberList)
        {
            if (mem != null)
            {
                if (mem.getDisplayName().equals(dn))
                {
                    return mem;
                }
            }
        }
        return null;
    }

    String getHouseholdCode()
    {
        return this.householdCode;
    }

    void removeMember(String dn)
    {
        for (int i=0; i<this.memberList.length;i++)
        {
            if (this.memberList[i] != null && 
                this.memberList[i].getDisplayName().equals(dn));
            {
                this.memberList[i] = null;
                break;
            }
        }
    }
}