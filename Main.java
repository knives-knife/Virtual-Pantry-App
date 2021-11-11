/*
    The Main executable file of the program, contains the main method
    Runs the program by creating a Login GUI from which the user Logs in
*/

public class Main 
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
