/*
DashboardGUI
    The DashboardGUI has a bottom banner that allows the user to navigate to other pages.
        The Fridge button navigates the user to the FridgeGUI
        The Pantry button navigates the user to the PantryGUI
        The Dashboard button is disabled since the user is already in the DashboardGUI
        The Recipes button navigates the user to the RecipesGUI
        The Household button navigates the user to the HouseholdGUI
        The Shopping List button navigates the user to the ShoppingListGUI
    The DashboardGUI provides a GUI for the user to show the nearest expiration date in the accounts
        pantry and fridge, at most 3 available recipes , at most 3 members in the same household 
    When a recipe is clicked on, the ViewRecipeGUI will be called to view the recipes clicked on
    When a member is clicked on, the ViewMemberGUI will be called to view the member clicked on
*/

import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joahp
 */
public class DashboardGUI extends javax.swing.JFrame
{
    private Account account;
    private Member member;

    public DashboardGUI()
    {
        initComponents();
        botBanDashboardButton.setEnabled(false);
    }

    public DashboardGUI(Account acc, Member mem)
    {
        initComponents();
        botBanDashboardButton.setEnabled(false);
        account = acc;
        member = mem;
        DatabaseHandler dbh = null;
        RecipeDBH rdbh = null;
        //try to make the DatabaseHandler and RecipeDatabaseHandler
        try
        {
            dbh = new DatabaseHandler(account.getHouseholdCode());
            rdbh = new RecipeDBH();
        }
        //if error, catch and return to LogIn GUI
        catch (Exception ex)
        {
            this.dispose();
            LogInGUI logIn = new LogInGUI(account, member);
            logIn.setVisible(true);
            return;
        }

        //get the pantry items and fridge items of the account
        //show the next expiration date
        setNextExp(dbh.getPantry(), dbh.getFridge());

        //get the availabe recipes from the RecipesDBHandler
        //set the recipes buttons text with the name of the first three recipes
        setRecipeButtons(rdbh.getRecipes(dbh.getPantry(), dbh.getFridge()));
        
        //get member array from DatabaseHandler
        //set the member buttons text with the display name of the first three members
        setMemberButtons(account.getMemList());

    }

     private void setRecipeButtons(Recipe[] recipes)
     {
        //initialize recipe buttons to be blank and invisible
        recipeButton1.setText("");
        recipeButton1.setVisible(false);
        recipeButton2.setText("");
        recipeButton2.setVisible(false);
        recipeButton3.setText("");
        recipeButton3.setVisible(false);
         for (Recipe r : recipes)
         {
             if (r != null)
             {
                 //set first button to first recipe
                 if (recipeButton1.getText().equals(""))
                 {
                     recipeButton1.setText(r.getName());
                     recipeButton1.setVisible(true);
                 }
                 //set second button to second recipe
                 else if (recipeButton2.getText().equals(""))
                 {
                     recipeButton2.setText(r.getName());
                     recipeButton2.setVisible(true);
                 }
                 //set third button to third recipe
                 //break out of loop since 
                 //no more buttons need to be set
                 else
                 {
                     recipeButton3.setText(r.getName());
                     recipeButton3.setVisible(true);
                     break;
                 }
             }
         }
     }
    private void setMemberButtons(Member[] mems)
    {
        //initialize recipe buttons to be blank and invisible
        hhMemButton1.setText("");
        hhMemButton1.setVisible(false);
        hhMemButton2.setText("");
        hhMemButton2.setVisible(false);
        hhMemButton3.setText("");
        hhMemButton3.setVisible(false);
        for (Member m : mems)
        {
            if (m != null)
            {
                //set first button to first member
                if (hhMemButton1.getText().equals(""))
                {
                    hhMemButton1.setText(m.getDisplayName());
                    hhMemButton1.setVisible(true);
                }
                //set second button to second member
                else if (hhMemButton2.getText().equals(""))
                {
                    hhMemButton2.setText(m.getDisplayName());
                    hhMemButton2.setVisible(true);
                }
                //set third button to third member
                //break out of loop since 
                //no more buttons need to be set
                else
                {
                    hhMemButton3.setText(m.getDisplayName());
                    hhMemButton3.setVisible(true);
                    break;
                }
            }
        }
    }
    
   void setNextExp(Item[] pantry, Item[] fridge)
   {
       
       // find next expiration date for pantry and 
       // fridge separately and store the indices
       int pExpDateIndex = 0;
       int fExpDateIndex = 0;
       for (int i = 0; i < pantry.length; i++)
       {
           if (pantry[i] != null && pantry[i].getExpDate() != null)
           {
                if (pantry[i].getExpDate().isBefore(pantry[pExpDateIndex].getExpDate()))
                {
                    pExpDateIndex = i;
                }
            }
       }
       for (int i = 0; i < fridge.length; i++)
       {
            if (fridge[i] != null && fridge[i].getExpDate() != null)
            {
                if (fridge[i].getExpDate().isBefore(fridge[fExpDateIndex].getExpDate()))
                {
                    fExpDateIndex = i;
                }
            }   
       }

       // create a format for the date
       DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH);

       if (pantry[pExpDateIndex].getExpDate() == null && 
            fridge[fExpDateIndex].getExpDate() == null)
        {
            expDateLabel.setText("None");
            expItemLabel.setText("None");
        }
        else
        {
            //pantry item has exp date and fridge does not
            if (pantry[pExpDateIndex].getExpDate() != null && fridge[fExpDateIndex].getExpDate() == null) 
            {
                expDateLabel.setText(format1.format((TemporalAccessor) pantry[pExpDateIndex].getExpDate()));
                expItemLabel.setText(pantry[pExpDateIndex].getName());
            } 
            //fridge item has exp date and pantry does not
            else if (pantry[pExpDateIndex].getExpDate() == null && fridge[fExpDateIndex].getExpDate() != null) 
            {
                expDateLabel.setText(format1.format((TemporalAccessor) fridge[fExpDateIndex].getExpDate()));
                expItemLabel.setText(fridge[fExpDateIndex].getName());
            }
            //both have exp dates
            else 
            {
                // if the pantry item expires before the fridge item,
                // display the pantry item
                if (pantry[pExpDateIndex].getExpDate().isBefore(fridge[fExpDateIndex].getExpDate())) 
                {
                    expDateLabel.setText(format1.format((TemporalAccessor) pantry[pExpDateIndex].getExpDate()));
                    expItemLabel.setText(pantry[pExpDateIndex].getName());
                }

                // otherwise the fridge item expires before the pantry item,
                // so display the fridge item
                else 
                {
                    expDateLabel.setText(format1.format((TemporalAccessor) fridge[fExpDateIndex].getExpDate()));
                    expItemLabel.setText(fridge[fExpDateIndex].getName());
                }
            }
        }
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        body = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        nextExpLabel = new javax.swing.JLabel();
        expDateLabel = new javax.swing.JLabel();
        expItemLabel = new javax.swing.JLabel();
        avRecipesLabel = new javax.swing.JLabel();
        recipeButton1 = new javax.swing.JButton();
        recipeButton2 = new javax.swing.JButton();
        recipeButton3 = new javax.swing.JButton();
        recipeSeeMoreButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        hhMemButton1 = new javax.swing.JButton();
        hhMemButton2 = new javax.swing.JButton();
        hhMemButton3 = new javax.swing.JButton();
        hhSeeMoreButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        botBanFridgeButton = new javax.swing.JButton();
        botBanPantryButton = new javax.swing.JButton();
        botBanDashboardButton = new javax.swing.JButton();
        botBanRecipesButton = new javax.swing.JButton();
        botBanHHButton = new javax.swing.JButton();
        botBanSLButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Dashboard");

        nextExpLabel.setText("Next Expiration:");

        expDateLabel.setText("Date");

        expItemLabel.setText("Item");

        avRecipesLabel.setText("Available Reipes:");

        recipeButton1.setText("Recipe 1");
        recipeButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                recipeButton1ActionPerformed(evt);
            }
        });

        recipeButton2.setText("Recipe 2");
        recipeButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                recipeButton2ActionPerformed(evt);
            }
        });

        recipeButton3.setText("Recipe 3");
        recipeButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                recipeButton3ActionPerformed(evt);
            }
        });

        recipeSeeMoreButton.setText("See More");
        recipeSeeMoreButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                recipeSeeMoreButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Your Household");

        hhMemButton1.setText("hhMem 1");
        hhMemButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                hhMemButton1ActionPerformed(evt);
            }
        });

        hhMemButton2.setText("hhMem 2");
        hhMemButton2.setToolTipText("");
        hhMemButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                hhMemButton2ActionPerformed(evt);
            }
        });

        hhMemButton3.setText("hhMem 3");
        hhMemButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                hhMemButton3ActionPerformed(evt);
            }
        });

        hhSeeMoreButton.setText("See More");
        hhSeeMoreButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                hhSeeMoreButtonActionPerformed(evt);
            }
        });

        botBanFridgeButton.setText("Fridge");
        botBanFridgeButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                botBanFridgeButtonActionPerformed(evt);
            }
        });

        botBanPantryButton.setText("Pantry");
        botBanPantryButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                botBanPantryButtonActionPerformed(evt);
            }
        });

        botBanDashboardButton.setText("Dashboard");
        botBanDashboardButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                botBanDashboardButtonActionPerformed(evt);
            }
        });

        botBanRecipesButton.setText("Recipes");
        botBanRecipesButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                botBanRecipesButtonActionPerformed(evt);
            }
        });

        botBanHHButton.setText("Household");
        botBanHHButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                botBanHHButtonActionPerformed(evt);
            }
        });

        botBanSLButton.setText("Shopping List");
        botBanSLButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                botBanSLButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botBanFridgeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botBanPantryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botBanDashboardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botBanSLButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botBanRecipesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botBanHHButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botBanFridgeButton)
                    .addComponent(botBanPantryButton)
                    .addComponent(botBanDashboardButton)
                    .addComponent(botBanRecipesButton)
                    .addComponent(botBanHHButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botBanSLButton)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(avRecipesLabel)
                            .addComponent(nextExpLabel)
                            .addComponent(jLabel1)
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bodyLayout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(expItemLabel))
                                    .addComponent(expDateLabel)
                                    .addComponent(recipeButton2)
                                    .addComponent(recipeButton1)
                                    .addComponent(recipeButton3)
                                    .addComponent(recipeSeeMoreButton)
                                    .addComponent(hhMemButton2)
                                    .addComponent(hhMemButton1)
                                    .addComponent(hhMemButton3)
                                    .addComponent(hhSeeMoreButton)))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(18, 18, 18)
                .addComponent(nextExpLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(expDateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(expItemLabel)
                .addGap(25, 25, 25)
                .addComponent(avRecipesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recipeButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recipeButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recipeButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recipeSeeMoreButton)
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hhMemButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hhMemButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hhMemButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hhSeeMoreButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //switch to ShoppingListGUI when the shopping list button is clicked
    private void botBanSLButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_botBanSLButtonActionPerformed
    {//GEN-HEADEREND:event_botBanSLButtonActionPerformed
        this.dispose();
        ShoppingListGUI sl = new ShoppingListGUI(account, member);
        sl.setVisible(true);
    }//GEN-LAST:event_botBanSLButtonActionPerformed

    //go to viewRecipeGUI for that Recipe
    private void recipeButton1ActionPerformed(java.awt.event.ActionEvent evt)
    {
        RecipeDBH rdbh;
        try
        {
            rdbh = new RecipeDBH();
        }
        catch (Exception ex)
        {
            this.dispose();
            LogInGUI logIn = new LogInGUI(account, member);
            logIn.setVisible(true);
            return;
        }
        this.dispose();
        ViewRecipeGUI viewRecipe = new ViewRecipeGUI(account, member, 
                rdbh.search(recipeButton1.getText()));
        viewRecipe.setVisible(true);
    }

    //go to viewRecipeGUI for that Recipe
    private void recipeButton2ActionPerformed(java.awt.event.ActionEvent evt)
    {
        RecipeDBH rdbh;
        try
        {
            rdbh = new RecipeDBH();
        }
        catch (Exception ex)
        {
            this.dispose();
            LogInGUI logIn = new LogInGUI(account, member);
            logIn.setVisible(true);
            return;
        }
        this.dispose();
        ViewRecipeGUI viewRecipe = new ViewRecipeGUI(account, member, 
                rdbh.search(recipeButton2.getText()));
        viewRecipe.setVisible(true);
    }

    //go to viewRecipeGUI for that Recipe
    private void recipeButton3ActionPerformed(java.awt.event.ActionEvent evt)
    {
        RecipeDBH rdbh;
        try
        {
            rdbh = new RecipeDBH();
        }
        catch (Exception ex)
        {
            this.dispose();
            LogInGUI logIn = new LogInGUI(account, member);
            logIn.setVisible(true);
            return;
        }
        this.dispose();
        ViewRecipeGUI viewRecipe = new ViewRecipeGUI(account, member, 
                rdbh.search(recipeButton3.getText()));
        viewRecipe.setVisible(true);
    }

    //switch to RecipesGUI
    private void recipeSeeMoreButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        this.dispose();
        RecipesGUI recipes = new RecipesGUI(account, member);
        recipes.setVisible(true);
    }

    //go to viewMembeGUI for that member
    private void hhMemButton1ActionPerformed(java.awt.event.ActionEvent evt)
    {
            this.dispose();
            ViewMemberGUI viewMember = new ViewMemberGUI(account, member, 
                    account.getMember(hhMemButton1.getText()));
            viewMember.setVisible(true);
    }

    //go to viewMembeGUI for that member
    private void hhMemButton2ActionPerformed(java.awt.event.ActionEvent evt)
    {
            this.dispose();
            ViewMemberGUI viewMember = new ViewMemberGUI(account, member, 
                    account.getMember(hhMemButton2.getText()));
            viewMember.setVisible(true);
    }

    //go to viewMembeGUI for that member
    private void hhMemButton3ActionPerformed(java.awt.event.ActionEvent evt)
    {
            this.dispose();
            ViewMemberGUI viewMember = new ViewMemberGUI(account, member, 
                    account.getMember(hhMemButton3.getText()));
            viewMember.setVisible(true);
    }

    //switch to HouseholdGUI when the see more under household is clicked
    private void hhSeeMoreButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        this.dispose();
        HouseholdGUI hh = new HouseholdGUI(account, member);
        hh.setVisible(true);
    }

    //switch to FridgeGUI when the fridge button is clicked
    private void botBanFridgeButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        this.dispose();
        FridgeGUI fridge = new FridgeGUI(account, member);
        fridge.setVisible(true);
    }

    //switch to PantryGUI when the pantry button is clicked
    private void botBanPantryButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        this.dispose();
        PantryGUI pantry = new PantryGUI(account, member);
        pantry.setVisible(true);
    }

    //switch to DashboardGUI when the dashboard button is clicked
    private void botBanDashboardButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        this.dispose();
        DashboardGUI dashboard = new DashboardGUI(account, member);
        dashboard.setVisible(true);
    }

    //switch to RecipesGUI when the recipes button is clicked
    private void botBanRecipesButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        this.dispose();
        RecipesGUI recipes = new RecipesGUI(account, member);
        recipes.setVisible(true);
    }

    //switch to HouseholdGUI when the household button is clicked
    private void botBanHHButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        this.dispose();
        HouseholdGUI hh = new HouseholdGUI(account, member);
        hh.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avRecipesLabel;
    private javax.swing.JPanel body;
    private javax.swing.JButton botBanDashboardButton;
    private javax.swing.JButton botBanFridgeButton;
    private javax.swing.JButton botBanHHButton;
    private javax.swing.JButton botBanPantryButton;
    private javax.swing.JButton botBanRecipesButton;
    private javax.swing.JButton botBanSLButton;
    private javax.swing.JLabel expDateLabel;
    private javax.swing.JLabel expItemLabel;
    private javax.swing.JButton hhMemButton1;
    private javax.swing.JButton hhMemButton2;
    private javax.swing.JButton hhMemButton3;
    private javax.swing.JButton hhSeeMoreButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nextExpLabel;
    private javax.swing.JButton recipeButton1;
    private javax.swing.JButton recipeButton2;
    private javax.swing.JButton recipeButton3;
    private javax.swing.JButton recipeSeeMoreButton;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

}
