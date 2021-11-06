
/**
 *
 * @author joahp
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
