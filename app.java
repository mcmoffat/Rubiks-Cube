package rubixCube_1;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class app  {
	private JFrame frame;
    private display display;
    
    //private JPanel panel;
     

    /*
    Constructs an App object which will set up and create the
    display as per passed width and height parameters representing 
    pixels.
    */
    public app(int width, int height) {
        this.frame = new JFrame("Rubix Cube");
         
        
        this.display = new display();
        display.setLayout(null);
    
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.getContentPane().add(display);

        this.frame.pack();
        this.frame.setSize(width, height);
        
        this.frame.setEnabled(true);
        this.frame.setVisible(true);
        frame.setLayout(null); 
     
    }  

    /*
    Creates an App object which will run the display.
    */
    public static void main(String[] args) {
        app app = new app(960, 540);
    }
 
    
}
