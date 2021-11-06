
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

    // Will need this if we create new accounts
    // Create a random string of 10 letters from A-Z
    // private String createHouseholdCode()
    // {
    // String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    // StringBuilder sb = new StringBuilder();
    // Random random = new Random();
    // int length = 10;
    // for(int i = 0; i < length; i++)
    // {
    // int index = random.nextInt(alphabet.length());
    // char randomChar = alphabet.charAt(index);
    // sb.append(randomChar);
    // }
    // return sb.toString();
    // }

    //returns TRUE if there is a member with disName in the memberList array
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

    //return the member list of this instance
    Member[] getMemList()
    {
        return this.memberList;
    }

    //returns member with display name dn
    //if no such member exists, return null
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

    //returns the householdd code of this instance
    String getHouseholdCode()
    {
        return this.householdCode;
    }
}
