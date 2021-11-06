
public class RecipesGUI extends javax.swing.JFrame
{

    /**
     * Creates new form DashboardGUI
     */
    private Account account;
    private Member member;
    private javax.swing.DefaultListModel<String> itemModel;

    public RecipesGUI()
    {
        initComponents();
        botBanRecipesButton.setEnabled(false);
    }

    public RecipesGUI(Account acc, Member mem)
    {
        initComponents();
        botBanRecipesButton.setEnabled(false);
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
        itemScrollPane = new javax.swing.JScrollPane();
        itemJList = new javax.swing.JList<>();
        addItemButton = new javax.swing.JButton();
        removeItemButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Recipes");
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

        botBanHHButton.setText("Hosuehold");
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
                .addComponent(botBanDashboardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botBanRecipesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botBanHHButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
            .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(46, 46, 46))
        );

        itemJList.setModel(new javax.swing.AbstractListModel<String>()
        {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        itemJList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        
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
    }//</editor-fold>//GEN-END:initComponents

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
            DatabaseHandler dbh;
            //try to create DatabaseHandler
            try
            {
                dbh = new DatabaseHandler(account.getHouseholdCode());
                //remove the item from the accounts pantry
                dbh.deleteFromPantry(itemToRemoveName);
            }
            //catch error making the DatabaseHandler
            //tell user item was not removed
            catch (Exception ex)
            {
                errorLabel.setText("There was a problem with removing your item");
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
    private javax.swing.JLabel errorLabel;
    private javax.swing.JList<String> itemJList;
    private javax.swing.JScrollPane itemScrollPane;
    private javax.swing.JLabel itemsLabel;
    private javax.swing.JButton removeItemButton;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    //fill the list with available recipes
    private void populateItemModel()
    {
        //TODO uncomment
//        RecipeDBH rdbh = null;
//        //try to make the RecipeDBH
//        try
//        {
//            rdbh = new RecipeDBH();
//        }
//        //catch error
//        //return user to LogInGUI
//        catch (Exception ex)
//        {
//            this.dispose();
//            LogInGUI logIn = new LogInGUI(account, member);
//            logIn.setVisible(true);
//            return;
//        }
//        
//            //get available recipes from RecipeDBH
//            Item[] recipes = rdbh.getRecipes();
//            //add non-null recipe's names to the GUI list
//            for (String r : recipes)
//            {
//                if (r != null)
//                {
//                    this.itemModel.addElement(r.getName());
//                }
//            }
    }
}
