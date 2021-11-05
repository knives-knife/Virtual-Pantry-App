public class VirtualPantryApp 
{
    public static void main(String[] args)
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInGUI().setVisible(true);
            }
        });
    }
}
