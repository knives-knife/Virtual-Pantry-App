/*
HouseholdGUI
    The HouseholodGUI has a bottom banner that allows the user to navigate to other pages.
        The Fridge button navigates the user to the FridgeGUI
        The Pantry button navigates the user to the PantryGUI
        The Dashboard button navigates the user to the DashboardGUI
        The Recipes button navigates the user to the RecipesGUI
        The Household button is disabled since the user is already in the HouseholdGUI
        The Shopping List button navigates the user to the ShoppingListGUI
    The GUI shows the user the items in the Account's 
    When the view member button is clicked, the user will be navigated to the ViewMemberGUI
    When the remove item button is clicked, if a member is selected in the list, the
        selected member is removed from the Account's member list
        **Note: currently does not refresh list in the GUI, but does successfully
            remove from member list
/**
 *
 * @author joahp
 */
public class HouseholdGUI extends javax.swing.JFrame
{
    private Account account;
    private Member member;
    private javax.swing.DefaultListModel<String> itemModel;

    public HouseholdGUI()
    {
        initComponents();
        botBanHHButton.setEnabled(false);
    }

    public HouseholdGUI(Account acc, Member mem)
    {
        initComponents();
        botBanHHButton.setEnabled(false);
        errorLabel.setVisible(false);
        account = acc;
        member = mem;
        itemModel = new javax.swing.DefaultListModel<String>();
        memberJList.setModel(itemModel);
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
        memberJList = new javax.swing.JList<>();
        viewMemberButton = new javax.swing.JButton();
        removeMemberButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Household");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        itemsLabel.setText("Members:");

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
            .addGroup(botBanPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        memberJList.setModel(new javax.swing.AbstractListModel<String>()
        {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        memberJList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        memberJList.addMouseWheelListener(new java.awt.event.MouseWheelListener()
        {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt)
            {
                memberJListMouseWheelMoved(evt);
            }
        });
        itemScrollPane.setViewportView(memberJList);

        viewMemberButton.setText("View Member");
        viewMemberButton.setPreferredSize(new java.awt.Dimension(45, 23));
        viewMemberButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                viewMemberButtonActionPerformed(evt);
            }
        });

        removeMemberButton.setText("Remove Member");
        removeMemberButton.setPreferredSize(new java.awt.Dimension(45, 23));
        removeMemberButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                removeMemberButtonActionPerformed(evt);
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
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemScrollPane)
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addComponent(viewMemberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(removeMemberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(73, 73, 73))
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
                    .addComponent(viewMemberButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeMemberButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void memberJListMouseWheelMoved(java.awt.event.MouseWheelEvent evt)//GEN-FIRST:event_memberJListMouseWheelMoved
    {//GEN-HEADEREND:event_memberJListMouseWheelMoved
        //intentionally left blank
    }//GEN-LAST:event_memberJListMouseWheelMoved

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
    private void viewMemberButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        //get the name of the member to be viewed
        String displayName = memberJList.getSelectedValue();
        //if no item was selected, tell user
        if (displayName == null)
        {
            errorLabel.setText("There is no member selected");
            errorLabel.setVisible(true);
        }
        //there is a member that was selected
        else
        {
            this.dispose();
            ViewMemberGUI viewMember = new ViewMemberGUI(account, member,account.getMember(displayName));
            viewMember.setVisible(true);
        }
    }

    //remove the selected member from the member list of the account
    private void removeMemberButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        //TODO update memberJList after removal
       //get the name of the member to be removed
       String memberToRemoveDN = memberJList.getSelectedValue();
       //if no member was selected, tell user
       if (memberToRemoveDN == null)
       {
           errorLabel.setText("There is no member selected");
           errorLabel.setVisible(true);
       }
       //there is a member that was selected
       else
       {
           //check if member trying to delete another member is HoH
           if (member.isHoH())
           {
               AccountDBH adbh;
               //try to create AccountDBH
               try
               {
                   adbh = new AccountDBH();
                   //remove the member from the account database
                   adbh.removeMember(account.getHouseholdCode(), 
                           memberToRemoveDN);
                   //remove the member from the member list in the account
                   account.removeMember(memberToRemoveDN);
               }
               //catch error making the AccountDBH
               //tell user member was not removed
               catch (Exception ex)
               {
                   errorLabel.setText("There was a problem with" 
                            + "removing the member");
                   errorLabel.setVisible(true);
               }
           }
           //member is not HoH
           else
           {
               errorLabel.setText("You cannot remove members");
               errorLabel.setVisible(true);

           }
       }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JButton botBanDashboardButton;
    private javax.swing.JButton botBanFridgeButton;
    private javax.swing.JButton botBanHHButton;
    private javax.swing.JPanel botBanPanel;
    private javax.swing.JButton botBanPantryButton;
    private javax.swing.JButton botBanRecipesButton;
    private javax.swing.JButton botBanSLButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JScrollPane itemScrollPane;
    private javax.swing.JLabel itemsLabel;
    private javax.swing.JList<String> memberJList;
    private javax.swing.JButton removeMemberButton;
    private javax.swing.JLabel title;
    private javax.swing.JButton viewMemberButton;
    // End of variables declaration//GEN-END:variables

    private void populateItemModel()
    {
        //get member list from account
        Member[] members = account.getMemList();
        //add non-null items' names to the GUI list
        for (Member m : members)
        {
            if (m != null)
            {
                this.itemModel.addElement(m.getDisplayName());
            }
        }
    }
}
