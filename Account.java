/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author joahp
 */
class Account {
    private String householdCode;
    private ArrayList<Member> memberList;
    
    public Account()
    {
        this.memberList = new ArrayList<Member>();
        this.memberList.add(new Member());
        this.householdCode = "ABCDEFGHI";
    }
    
    public Account(Member mem)
    {
        this.memberList = new ArrayList<Member>();
        this.householdCode = createHouseholdCode();
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
    
    ArrayList<Member> getMemList()
    {
        return this.memberList;
    }

    Member getMember(String dn) 
    {
        return new Member();
    }
    
}
