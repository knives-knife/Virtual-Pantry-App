

/*
ShoppingListGUI
    The GUI has a bottom banner that allows the user to navigate to other pages.
        The Fridge button navigates the user to the FridgeGUI
        The Pantry button navigates the user the the PantryGUI
        The Dashboard button navigates the user the the DashboardGUI
        The Recipes button navigates the user to the RecipesGUI
        The Household button navigates the user to the HouseholdGUI
        The Shopping List button is disabled since the user is already in the ShoppingListGUI
    The ShoppingListGUI shows the user the items in the Account's shopping list
    When the add item button is clicked, the user will be navigated to the AddItemGUI
    When the remove item button is clicked, if an item is selected in the list, the
        selected item is removed from the Account's shopiing list
 */
/**
 *
 * @author joahp
 */
public class ShoppingListGUI extends javax.swing.JFrame
{

    private Account account;
    private Member member;
    private javax.swing.DefaultListModel<String> itemModel;

    public ShoppingListGUI()
    {
        initComponents();
        botBanSLButton.setEnabled(false);
    }

    public ShoppingListGUI(Account acc, Member mem)
    {
        initComponents();
        botBanSLButton.setEnabled(false);
        errorLabel.setVisible(false);
        account = acc;
        member = mem;
        itemModel = new javax.swing.DefaultListModel<String>();
        itemJList.setModel(itemModel);
        populateItemModel();

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
        itemsLabel = new javax.swing.JLabel();
        botBanPanel = new javax.swing.JPanel();
        botBanFridgeButton = new javax.swing.JButton();
        botBanPantryButton = new javax.swing.JButton();
        botBanDashboardButton = new javax.swing.JButton();
        botBanRecipesButton = new javax.swing.JButton();
        botBanHHButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        botBanSLButton = new javax.swing.JButton();
        itemScrollPane = new javax.swing.JScrollPane();
        itemJList = new javax.swing.JList<>();
        addItemButton = new javax.swing.JButton();
        removeItemButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Shopping List");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        itemsLabel.setText("Items:");

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
                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(botBanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botBanFridgeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botBanPantryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(botBanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botBanSLButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botBanDashboardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botBanRecipesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botBanHHButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        botBanPanelLayout.setVerticalGroup(
            botBanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botBanPanelLayout.createSequentialGroup()
                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
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

        itemJList.setModel(new javax.swing.AbstractListModel<String>()
        {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        itemJList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        itemJList.addMouseWheelListener(new java.awt.event.MouseWheelListener()
        {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt)
            {
                itemJListMouseWheelMoved(evt);
            }
        });
        itemScrollPane.setViewportView(itemJList);

        addItemButton.setText("Add an Item");
        addItemButton.setPreferredSize(new java.awt.Dimension(45, 23));
        addItemButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addItemButtonActionPerformed(evt);
            }
        });

        removeItemButton.setText("Remove Item");
        removeItemButton.setPreferredSize(new java.awt.Dimension(45, 23));
        removeItemButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                removeItemButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(botBanPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(bodyLayout.createSequentialGroup()
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(itemsLabel))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(itemScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addComponent(addItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(removeItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(18, 18, 18)
                .addComponent(itemsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botBanPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemJListMouseWheelMoved(java.awt.event.MouseWheelEvent evt)//GEN-FIRST:event_itemJListMouseWheelMoved
    {//GEN-HEADEREND:event_itemJListMouseWheelMoved
        //intentionally left blank
    }//GEN-LAST:event_itemJListMouseWheelMoved

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

    //switch to AddItemGUI when the add an item button is clicked
    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        this.dispose();
        AddItemGUI addItem = new AddItemGUI(account, member);
        addItem.setVisible(true);
    }

    //remove the selected item from the pantry of the account
    private void removeItemButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        errorLabel.setVisible(false);
        //get the name of the item to be removed
        String itemToRemoveName = itemJList.getSelectedValue();
        //if no item was selected, tell user
        if (itemToRemoveName == null)
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
                //remove the item from the accounts pantry
                sldbh.deleteFromSL(itemToRemoveName);
                itemModel.removeElement(itemToRemoveName);
            }
            //catch error making the DatabaseHandler
            //tell user item was not removed
            catch (Exception ex)
            {
                errorLabel.setText("There was a problem with removing your item");
                errorLabel.setVisible(true);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItemButton;
    private javax.swing.JPanel body;
    private javax.swing.JButton botBanDashboardButton;
    private javax.swing.JButton botBanFridgeButton;
    private javax.swing.JButton botBanHHButton;
    private javax.swing.JPanel botBanPanel;
    private javax.swing.JButton botBanPantryButton;
    private javax.swing.JButton botBanRecipesButton;
    private javax.swing.JButton botBanSLButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JList<String> itemJList;
    private javax.swing.JScrollPane itemScrollPane;
    private javax.swing.JLabel itemsLabel;
    private javax.swing.JButton removeItemButton;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    private void populateItemModel()
    {
        ShoppingListDBH sldbh = null;
        //try to make the DatabasHandler
        try
        {
            sldbh = new ShoppingListDBH(account.getHouseholdCode());
        }
        //catch error
        //return user to LogInGUI
        catch (Exception ex)
        {
            this.dispose();
            LogInGUI logIn = new LogInGUI(account, member);
            logIn.setVisible(true);
            return;
        }

        //get pantry from DatabasHandler
        Item[] sl = sldbh.getSL();
        //add non-null items' names to the GUI list
        for (Item i : sl)
        {
            if (i != null)
            {
                this.itemModel.addElement(i.getName());
            }
        }
    }
}
