import java.io.IOException;

import javax.swing.SwingUtilities;

/**
 * This is the main Class for the program all the things needed to run the
 * program will be called from within this Class
 * 
 * @author rafal
 * @return nothing
 */
public class Driver {
    /**
     * @param args
     */
    public static void main(String[] args) throws IOException {

        // Initialize the GUI and run it
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                
                    try
                    {
                        new MesonetFrame("Mesonet Data Calculator");
                    }
                    catch (IOException e)
                    {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                } 

                    
                
            
        });
    }
}