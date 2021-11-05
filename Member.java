/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joahp
 */
class Member {
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
