/*
ViewRecipeGUI
    The ViewRecipeGUI has a bottom banner that allows the user to navigate to other pages.
        The Fridge button navigates the user to the FridgeGUI
        The Pantry button navigates the user to the PantryGUI
        The Dashboard button navigates the user to the DashboardGUI
        The Recipes button navigates the user to the RecipesGUI
        The Household button navigates the user to the HouseholdGUI
        The Shopping List button navigates the user to the ShoppingListGUI
    The ViewRecipeGUI will display the recipes's name at the top of the screen
    The ViewRecipeGUI will display the description under the description label
    The ViewRecipeGUI will display a list of ingredients under the ingredients label
    When the add item to shopping list button is clicked, if an item is selected in the 
        list, the selected item is added to the Account's shopping list
        **Note: not implemented yet 
*/
/**
 *
 * @author joahp
 */
public class ViewRecipeGUI extends javax.swing.JFrame
{

    /**
     * Creates new form DashboardGUI
     */
    private Account account;
    private Member member;
    private Recipe recipe;
    private javax.swing.DefaultListModel<String> itemModel;

    public ViewRecipeGUI()
    {
        initComponents();
    }

    public ViewRecipeGUI(Account acc, Member mem, Recipe rec)
    {
        initComponents();
        addToSLButton.setEnabled(false);
        errorLabel.setVisible(false);
        account = acc;
        member = mem;
        recipe = rec;
        itemModel = new javax.swing.DefaultListModel<String>();
        ingredientsJList.setModel(itemModel);
        populateItemModel();
        recipeNameLabel.setText(recipe.getName());
        setDescLabels();

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
        recipeNameLabel = new javax.swing.JLabel();
        descLabel = new javax.swing.JLabel();
        botBanPanel = new javax.swing.JPanel();
        botBanFridgeButton = new javax.swing.JButton();
        botBanPantryButton = new javax.swing.JButton();
        botBanDashboardButton = new javax.swing.JButton();
        botBanRecipesButton = new javax.swing.JButton();
        botBanHHButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        botBanSLButton = new javax.swing.JButton();
        itemScrollPane = new javax.swing.JScrollPane();
        ingredientsJList = new javax.swing.JList<>();
        addToSLButton = new javax.swing.JButton();
        ingredientsLabel = new javax.swing.JLabel();
        descLine1Label = new javax.swing.JLabel();
        descLine2Label = new javax.swing.JLabel();
        descLine3Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        recipeNameLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        recipeNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recipeNameLabel.setText("Recipe Name");
        recipeNameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        descLabel.setText("Description:");

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

        errorLabel.setForeground(new java.awt.Color(255, 0, 0));
        errorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorLabel.setText("Invalid Selection");

        botBanSLButton.setText("Shopping List");
        botBanSLButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                botBanSLButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botBanPanelLayout = new javax.swing.GroupLayout(botBanPanel);
        botBanPanel.setLayout(botBanPanelLayout);
        botBanPanelLayout.setHorizontalGroup(
            botBanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botBanPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(botBanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botBanFridgeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botBanPantryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(botBanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botBanDashboardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botBanSLButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botBanRecipesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botBanHHButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        botBanPanelLayout.setVerticalGroup(
            botBanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botBanPanelLayout.createSequentialGroup()
                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(botBanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botBanFridgeButton)
                    .addComponent(botBanPantryButton)
                    .addComponent(botBanDashboardButton)
                    .addComponent(botBanRecipesButton)
                    .addComponent(botBanHHButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botBanSLButton)
                .addGap(16, 16, 16))
        );

        ingredientsJList.setModel(new javax.swing.AbstractListModel<String>()
        {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ingredientsJList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ingredientsJList.addMouseWheelListener(new java.awt.event.MouseWheelListener()
        {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt)
            {
                ingredientsJListMouseWheelMoved(evt);
            }
        });
        itemScrollPane.setViewportView(ingredientsJList);

        addToSLButton.setText("Add Item to Shoping List");
        addToSLButton.setPreferredSize(new java.awt.Dimension(45, 23));
        addToSLButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addToSLButtonActionPerformed(evt);
            }
        });

        ingredientsLabel.setText("Ingredients:");

        descLine1Label.setText("Desc Line 1");

        descLine2Label.setText("Desc Line 2");

        descLine3Label.setText("Desc Line 3");

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(recipeNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(descLine3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descLine2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descLine1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemScrollPane)
                            .addComponent(addToSLButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descLabel)
                            .addComponent(ingredientsLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(73, 73, 73))
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(botBanPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(recipeNameLabel)
                .addGap(18, 18, 18)
                .addComponent(descLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descLine1Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descLine2Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descLine3Label)
                .addGap(18, 18, 18)
                .addComponent(ingredientsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addToSLButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botBanPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //adds the selected item to the accounts shopping list
    private void addToSLButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addToSLButtonActionPerformed
    {//GEN-HEADEREND:event_addToSLButtonActionPerformed
        String itemToAddName = ingredientsJList.getSelectedValue();
        if (itemToAddName == null)
        {
            errorLabel.setText("There is no item selected");
            errorLabel.setVisible(true);
        }
        //there is an item that was selected
        else
        {
            ShoppingListDBH sldbh;
            //try to create DatabaseHandler
            try
            {
                sldbh = new ShoppingListDBH(account.getHouseholdCode());
                
                Item[] ingredients = recipe.getIngredients();
                for (Item i : ingredients)
                {
                    if (i != null && i.getName().equals(itemToAddName))
                    {
                        sldbh.addToSL(i);
                        break;
                    }
                }
                errorLabel.setText("The item was successfully added to your"
                        + "shopping cart");
                errorLabel.setVisible(true);
            }
            //catch error making the DatabaseHandler
            //tell user item was not removed
            catch (Exception ex)
            {
                errorLabel.setText("There was a problem with removing your item");
                errorLabel.setVisible(true);
            }
        }
    }//GEN-LAST:event_addToSLButtonActionPerformed

    //this has no function, but needs to be here for the JList to function properly
    private void ingredientsJListMouseWheelMoved(java.awt.event.MouseWheelEvent evt)//GEN-FIRST:event_ingredientsJListMouseWheelMoved
    {//GEN-HEADEREND:event_ingredientsJListMouseWheelMoved
        //intentionally left blank
    }//GEN-LAST:event_ingredientsJListMouseWheelMoved

    //switch to ShoppingListGUI when the shopping list button is clicked
    private void botBanSLButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_botBanSLButtonActionPerformed
    {//GEN-HEADEREND:event_botBanSLButtonActionPerformed
        this.dispose();
        ShoppingListGUI sl = new ShoppingListGUI(account, member);
        sl.setVisible(true);
    }//GEN-LAST:event_botBanSLButtonActionPerformed

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
    private javax.swing.JButton addToSLButton;
    private javax.swing.JPanel body;
    private javax.swing.JButton botBanDashboardButton;
    private javax.swing.JButton botBanFridgeButton;
    private javax.swing.JButton botBanHHButton;
    private javax.swing.JPanel botBanPanel;
    private javax.swing.JButton botBanPantryButton;
    private javax.swing.JButton botBanRecipesButton;
    private javax.swing.JButton botBanSLButton;
    private javax.swing.JLabel descLabel;
    private javax.swing.JLabel descLine1Label;
    private javax.swing.JLabel descLine2Label;
    private javax.swing.JLabel descLine3Label;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JList<String> ingredientsJList;
    private javax.swing.JLabel ingredientsLabel;
    private javax.swing.JScrollPane itemScrollPane;
    private javax.swing.JLabel recipeNameLabel;
    // End of variables declaration//GEN-END:variables

    private void populateItemModel()
    {
       //get ingredients from recipe
       Item[] ingredients = recipe.getIngredients();
       //add non-null items' names to the GUI list
       for (Item i : ingredients)
       {
           if (i != null)
           {
               this.itemModel.addElement(i.getName());
           }
       }
    }

    private void setDescLabels()
    {
        String [] description = recipe.getDescription();
        descLine1Label.setText(description[0]);
        descLine2Label.setText(description[1]);
        descLine3Label.setText(description[2]);
    }
}
