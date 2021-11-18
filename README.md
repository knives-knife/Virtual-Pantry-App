# Virtual-Pantry-App
**Note: This is better viewed as source. Click the "<>" button to view this as source in the top right 

To start the program, run the Main.java. 
This will put you into the Log In screen.
A successful log in can be achieved with "M 1" as the display name
  and "ABCDEFGHI" as the household code. 
These should be automatically input to the text fields when the 
  Log In screen is started until the project is finished
 After logging in, the dashboard will be shown
 
**DashboardGUI**
    - The DashboardGUI has a bottom banner that allows the user to navigate to other pages.
      - The Fridge button navigates the user to the FridgeGUI
      - The Pantry button navigates the user to the PantryGUI
      - The Dashboard button is disabled since the user is already in the DashboardGUI
      - The Recipes button navigates the user to the RecipesGUI
      - The Household button navigates the user to the HouseholdGUI
    - The DashboardGUI provides a GUI for the user to show the nearest expiration date in the accounts pantry and fridge, at most 3 available recipes , at most 3 members in the same household 
    - When a recipe is clicked on, the ViewRecipeGUI will be called to view the recipes clicked on
    - When a member is clicked on, the ViewMemberGUI will be called to view the member clicked on
    
**FridgeGUI**
    - The FridgeGUI has a bottom banner that allows the user to navigate to other pages.
        - The Fridge button is disabled since the user is already in the FridgeGUI
        - The Pantry button navigates the user to the PantryGUI
        - The Dashboard button navigates the user to the DashboardGUI
        - The Recipes button navigates the user to the RecipesGUI
        - The Household button navigates the user to the HouseholdGUI
    - The FridgeGUI shows the user the items in the Account's fridge
    - When the add item button is clicked, the user will be navigated to the AddItemGUI
    - When the remove item button is clicked, if an item is selected in the list, the
        selected item is removed from the Account's fridge
        **Note: currently does not refresh list in the GUI, but does successfully
            remove from fridge
            
**HouseholdGUI**
    - The HouseholodGUI has a bottom banner that allows the user to navigate to other pages.
      - The Fridge button navigates the user to the FridgeGUI
      - The Pantry button navigates the user to the PantryGUI
      - The Dashboard button navigates the user to the DashboardGUI
      - The Recipes button navigates the user to the RecipesGUI
      - The Household button is disabled since the user is already in the HouseholdGUI
    - The GUI shows the user the items in the Account's 
    - When the view member button is clicked, the user will be navigated to the ViewMemberGUI
    - When the remove item button is clicked, if a member is selected in the list, the
      - selected member is removed from the Account's member list
        **Note: currently does not refresh list in the GUI, but does successfully
            remove from member list
            
**PantryGUI**
   - The GUI has a bottom banner that allows the user to navigate to other pages.
     - The Fridge button navigates the user to the FridgeGUI
     - The Pantry button is disabled since the user is already in the PantryGUI
     - The Dashboard button navigates the user the the DashboardGUI
     - The Recipes button navigates the user to the RecipesGUI
     - The Household button navigates the user to the HouseholdGUI
   - The PantryGUI shows the user the items in the Account's pantry
   - When the add item button is clicked, the user will be navigated to the AddItemGUI
   - When the remove item button is clicked, if an item is selected in the list, the
        selected item is removed from the Account's pantry
        **Note: currently does not refresh list in the GUI, but does successfully
            remove from pantry
            
**RecipesGUI**
   - The RecipesGUI has a bottom banner that allows the user to navigate to other pages.
     - The Fridge button navigates the user to the FridgeGUI
     - The Pantry button navigates the user to the PantryGUI
     - The Dashboard button navigates the user to the DashboardGUI
     - The Recipes button is disabled since the user is already in the RecipesGUI
     - The Household button navigates the user to the HouseholdGUI
   - The RecipesGUI shows the user the recipes that can be made from the Account's
        pantry and fridge 
    When the view recipe button is clicked, the user will be navigated to the ViewRecipeGUI
    
**ViewMemberGUI**
   - The ViewMemberGUI has a bottom banner that allows the user to navigate to other pages.
     - The Fridge button navigates the user to the FridgeGUI
     - The Pantry button navigates the user to the PantryGUI
     - The Dashboard button navigates the user to the DashboardGUI
     - The Recipes button navigates the user to the RecipesGUI
     - The Household button navigates the user to the HouseholdGUI
   - The ViewMemberGUI will display the member's display name at the top of the screen
   - The ViewMemberGUI will display the member's household code under the household code label
   - The ViewMemberGUI will display if the member is the head of household or not
 
**ViewRecipeGUI**
   - The ViewRecipeGUI has a bottom banner that allows the user to navigate to other pages.
     - The Fridge button navigates the user to the FridgeGUI
     - The Pantry button navigates the user to the PantryGUI
     - The Dashboard button navigates the user to the DashboardGUI
     - The Recipes button navigates the user to the RecipesGUI
     - The Household button navigates the user to the HouseholdGUI
   - The ViewRecipeGUI will display the recipes's name at the top of the screen
   - The ViewRecipeGUI will display the description under the description label
   - The ViewRecipeGUI will display a list of ingredients under the ingredients label
   - When the add item to shopping list button is clicked, if an item is selected in the 
        list, the selected item is added to the Account's shopping list
        **Note: not implemented yet 
