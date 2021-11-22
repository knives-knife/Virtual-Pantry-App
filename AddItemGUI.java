/*
AddItemGUI
    The AddItemGUi provides a GUI to add an item to an accounts pantry, fridge, or shopping list.
    Input: String itemName
        String itemQuantity
        String expirationDate
        One location selected:
            Pantry
            Fridge
            Shopping List
    Output: none
    Expected Result: The accounts pantry, fridge, or shopping list has a new Item with the specified input
 */

/**
 *
 * @author joahp
 */
public class AddItemGUI extends javax.swing.JFrame
{

    private Account account;
    private Member member;

    public AddItemGUI()
    {
        initComponents();
    }

    public AddItemGUI(Account acc, Member mem)
    {
        initComponents();
        errorLabel.setVisible(false);
        successLabel.setVisible(false);
        account = acc;
        member = mem;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        botBanPanel = new javax.swing.JPanel();
        botBanFridgeButton = new javax.swing.JButton();
        botBanPantryButton = new javax.swing.JButton();
        botBanDashboardButton = new javax.swing.JButton();
        botBanRecipesButton = new javax.swing.JButton();
        botBanHHButton = new javax.swing.JButton();
        bonBanSLButton = new javax.swing.JButton();
        body = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        itemNameLabel = new javax.swing.JLabel();
        itemExpLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        itemExpField = new javax.swing.JTextField();
        itemQuantityField = new javax.swing.JTextField();
        addItemButton = new javax.swing.JButton();
        pantryRadioButton = new javax.swing.JRadioButton();
        fridgeRadioButton = new javax.swing.JRadioButton();
        shoppingListRadioButton = new javax.swing.JRadioButton();
        errorLabel = new javax.swing.JLabel();
        reqFieldLabel = new javax.swing.JLabel();
        itemNameField = new javax.swing.JTextField();
        successLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        botBanHHButton.setText("Hosuehold");
        botBanHHButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                botBanHHButtonActionPerformed(evt);
            }
        });

        bonBanSLButton.setText("Shopping List");
        bonBanSLButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bonBanSLButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botBanPanelLayout = new javax.swing.GroupLayout(botBanPanel);
        botBanPanel.setLayout(botBanPanelLayout);
        botBanPanelLayout.setHorizontalGroup(
            botBanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botBanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botBanFridgeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botBanPantryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(botBanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botBanDashboardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bonBanSLButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botBanRecipesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botBanHHButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        botBanPanelLayout.setVerticalGroup(
            botBanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botBanPanelLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(botBanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botBanFridgeButton)
                    .addComponent(botBanPantryButton)
                    .addComponent(botBanDashboardButton)
                    .addComponent(botBanRecipesButton)
                    .addComponent(botBanHHButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bonBanSLButton)
                .addGap(16, 16, 16))
        );

        title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Add Item");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        itemNameLabel.setText("Item Name*:");

        itemExpLabel.setText("Item Expiration Date (YYYYMMDD):");

        jLabel1.setText("Item Quantity:");

        itemQuantityField.setMinimumSize(new java.awt.Dimension(60, 20));
        itemQuantityField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                itemQuantityFieldActionPerformed(evt);
            }
        });

        addItemButton.setText("Add Item");
        addItemButton.setToolTipText("");
        addItemButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addItemButtonActionPerformed(evt);
            }
        });

        pantryRadioButton.setText("Pantry");
        pantryRadioButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                pantryRadioButtonActionPerformed(evt);
            }
        });

        fridgeRadioButton.setText("Fridge");
        fridgeRadioButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                fridgeRadioButtonActionPerformed(evt);
            }
        });

        shoppingListRadioButton.setText("Shopping List");
        shoppingListRadioButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                shoppingListRadioButtonActionPerformed(evt);
            }
        });

        errorLabel.setForeground(new java.awt.Color(255, 0, 0));
        errorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorLabel.setText("Invalid Options");

        reqFieldLabel.setForeground(new java.awt.Color(255, 0, 0));
        reqFieldLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reqFieldLabel.setText("*Required Field");

        itemNameField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                itemNameFieldActionPerformed(evt);
            }
        });

        successLabel.setForeground(new java.awt.Color(0, 255, 0));
        successLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        successLabel.setText("Success");

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(reqFieldLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(shoppingListRadioButton)
                            .addComponent(fridgeRadioButton)
                            .addComponent(pantryRadioButton)
                            .addComponent(itemNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemNameLabel)
                            .addComponent(itemExpLabel)
                            .addComponent(itemQuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(itemExpField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(addItemButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(successLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(successLabel)
                .addGap(40, 40, 40)
                .addComponent(itemNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemQuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(itemExpLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemExpField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(pantryRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fridgeRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shoppingListRadioButton)
                .addGap(12, 12, 12)
                .addComponent(addItemButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reqFieldLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorLabel))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botBanPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botBanPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemNameFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_itemNameFieldActionPerformed
    {//GEN-HEADEREND:event_itemNameFieldActionPerformed
        //intentionally left blank
    }//GEN-LAST:event_itemNameFieldActionPerformed

    private void itemQuantityFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_itemQuantityFieldActionPerformed
    {//GEN-HEADEREND:event_itemQuantityFieldActionPerformed
        //intentionally left blank
    }//GEN-LAST:event_itemQuantityFieldActionPerformed

    //switch to ShoppingListGUI when the shopping list button is clicked
    private void bonBanSLButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_bonBanSLButtonActionPerformed
    {//GEN-HEADEREND:event_bonBanSLButtonActionPerformed
        this.dispose();
        ShoppingListGUI sl = new ShoppingListGUI(account, member);
        sl.setVisible(true);
    }//GEN-LAST:event_bonBanSLButtonActionPerformed

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

    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        successLabel.setVisible(false);
        errorLabel.setVisible(false);

        DatabaseHandler dbh = null;
        //try making a DatabaseHandler
        //catch errors
        try
        {
            dbh = new DatabaseHandler(account.getHouseholdCode());
        }
        //if error, tell the user ERROR and exit function
        catch (Exception e)
        {
            errorLabel.setText("ERROR");
            errorLabel.setVisible(true);
            return;
        }

        //check for multiple radio buttons selected
        //if there are, tell the user and exit function
        if (!(pantryRadioButton.isSelected() || fridgeRadioButton.isSelected() || shoppingListRadioButton.isSelected()))
        {
            errorLabel.setText("Select exaclty one location to add the item");
            errorLabel.setVisible(true);
            return;
        }

        //get Strings form text fields
        String itemName = itemNameField.getText();
        String itemQuantity = itemQuantityField.getText();
        String itemExp = itemExpField.getText();

        //check if itemName is empty
        if (itemName.equals(""))
        {
            errorLabel.setText("Invalid Item Name");
            errorLabel.setVisible(true);
            return;
        }
//        //check if itemQuantity is empty
//        else if (itemQuantity.equals(""))
//        {
//
//            errorLabel.setText("Invalid Item Quantity");
//            errorLabel.setVisible(true);
//        }
//        //check if itemExp is empty or it is not exactly length 8
//        else if (itemExp.equals("") || itemExp.length() == 8)
//        {
//            errorLabel.setText("Invalid Item Expiration Date");
//            errorLabel.setVisible(true);
//        }
        else
        {
            int itemQ = 1;
            String itemE = null;
            //when all fields are provided
            if (!itemQuantity.equals(""))
            {
                try
                {
                    //TODO fix item quantity Parser
                    //try to parse the itemQuantity into integer
                    //if cannot, catch exception
                    itemQ = (int) java.lang.Integer.parseInt(itemQuantity);
                    if (itemQ < 1 || itemQ > 100)
                    {
                        errorLabel.setText("The quantitiy is not between 1-100");
                        errorLabel.setVisible(true);
                        return;
                    }
                }
                //catch the parse int error
                catch (Exception e)
                {
                    errorLabel.setText("The quantitiy is not between 1-100");
                    errorLabel.setVisible(true);
                    return;
                }
            }
            if (!itemExp.equals(""))
            {
                itemE = itemExp;
            }

            //if the location is pantry, 
            //add the item to the account's pantry
            if (pantryRadioButton.isSelected())
            {
                dbh.addToPantry(new Item(itemName.toLowerCase(),
                        itemQ, itemE));
            }

            //if the location is fridge, 
            //add the item to the account's fridge
            else if (fridgeRadioButton.isSelected())
            {
                dbh.addToFridge(new Item(itemName.toLowerCase(),
                        itemQ, itemE));
            }

            //if the location is shopping list, 
            //add the item to the account's shopping list
            else if (shoppingListRadioButton.isSelected())
            {
                ShoppingListDBH sldbh = new ShoppingListDBH(
                        account.getHouseholdCode());
                sldbh.addToSL(new Item(itemName.toLowerCase(),
                        itemQ, itemE));
            }

            //otherwise, no location was selected
            else
            {
                errorLabel.setText("No location was selected");
                errorLabel.setVisible(true);
                return;
            }

        }

        successLabel.setText("Item Successfully Added");
        successLabel.setVisible(true);
        itemNameField.setText("");
        itemExpField.setText("");
        itemQuantityField.setText("");
        
        pantryRadioButton.setSelected(false);
        fridgeRadioButton.setSelected(false);
        shoppingListRadioButton.setSelected(false);

    }

    private void pantryRadioButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        //when the pantry radio button is selected, unselect both the
        //fridge and the shopping list radio buttons
        fridgeRadioButton.setSelected(false);
        shoppingListRadioButton.setSelected(false);
        successLabel.setVisible(false);
    }

    private void fridgeRadioButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        //when the fridge radio button is selected, unselect both the
        //pantry and the shopping list radio buttons
        pantryRadioButton.setSelected(false);
        shoppingListRadioButton.setSelected(false);
        successLabel.setVisible(false);
    }

    private void shoppingListRadioButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        //when the shopping list radio button is selected, unselect both the
        //pantry and the fridge radio buttons
        pantryRadioButton.setSelected(false);
        fridgeRadioButton.setSelected(false);
        successLabel.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItemButton;
    private javax.swing.JPanel body;
    private javax.swing.JButton bonBanSLButton;
    private javax.swing.JButton botBanDashboardButton;
    private javax.swing.JButton botBanFridgeButton;
    private javax.swing.JButton botBanHHButton;
    private javax.swing.JPanel botBanPanel;
    private javax.swing.JButton botBanPantryButton;
    private javax.swing.JButton botBanRecipesButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JRadioButton fridgeRadioButton;
    private javax.swing.JTextField itemExpField;
    private javax.swing.JLabel itemExpLabel;
    private javax.swing.JTextField itemNameField;
    private javax.swing.JLabel itemNameLabel;
    private javax.swing.JTextField itemQuantityField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton pantryRadioButton;
    private javax.swing.JLabel reqFieldLabel;
    private javax.swing.JRadioButton shoppingListRadioButton;
    private javax.swing.JLabel successLabel;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

}
