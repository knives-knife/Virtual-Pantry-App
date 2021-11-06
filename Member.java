
class Member 
{
    private String displayName;
    
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
    
}
