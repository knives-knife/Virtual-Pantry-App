/*
    Member class
    Defines the Member class, which is the class for people in household
    Members have a name and a boolean which indicate if they are the head of household or not
    Methods:
        getters and setters for name and boolean HoH
        isHoH: returns whether the user is the household head.
*/
class Member 
{
    private String displayName;
    private boolean HoH;
    
    public Member()
    {
        displayName = "John Smith";
    }
    
    public Member(String dn)
    {
        displayName = dn;
    }

    String getDisplayName() 
    {
        return this.displayName;
    }
    
    void setHoH(boolean b)
    {
        this.HoH = b;
    }
    
    boolean isHoH()
    {
        return this.HoH;
    }
    
}
