package rubixCube_1;

import javax.swing.JButton;
import javax.swing.JPanel;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/*
Display represents a JPanel which implements the Runnable interface.
This class will handle creating, updating, and drawing the various objects 
within the game.
*/

public class display extends JPanel implements Runnable, ActionListener {
	private final int updatesPerSecond = 10;
    public static final int HEIGHT = 36;
    public static final int WIDTH = 64;
    //public static final int HEIGHT = 6;
    //public static final int WIDTH = 12;
    
    private int size = 3; 

    private Thread thread;
    private boolean running; 
    private Random r;
    public cube cube;
    
    private app a;
    private RectangleBorder border; 
    
    JButton b1;
    JButton b2; 
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    
    JButton b7; 
    JButton b8; 
    JButton b9;
    JButton b10;
    JButton b11;
    JButton b12;
    
  

    /*
    Constructs a Display object, which will initialize
    the necessary fields.
    */
    public display() {
        this.setFocusable(true);
        cube = new cube(size);
    
        this.r = new Random();
        border = new RectangleBorder(Color.black);
        this.start();
        //setBackground(Color.GRAY);
        
        b1 = new JButton("One Left");  
        b1.setBounds(40,20,80,40);  
        this.add(b1);
        
        b2 = new JButton("Two Left");  
        b2.setBounds(40,60,80,40);  
        this.add(b2);  
        
        b3 = new JButton("Three Left");  
        b3.setBounds(40,100,80,40);  
        this.add(b3);
        
        b4 = new JButton("Four Left");  
        b4.setBounds(40,140,80,40);  
        this.add(b4);
        
        b5 = new JButton("Five Left");  
        b5.setBounds(40,180,80,40);  
        this.add(b5);
        
        b6 = new JButton("Six Left");  
        b6.setBounds(40,220,80,40);  
        this.add(b6);
        
        
        
        b7 = new JButton("One Right");  
        b7.setBounds(340,20,90,40);  
        this.add(b7);
        
        
        b8 = new JButton("Two Right");  
        b8.setBounds(340,60,90,40);  
        this.add(b8);  
        
        b9 = new JButton("Three Right");  
        b9.setBounds(340,100,90,40);  
        this.add(b9);
        
        b10 = new JButton("Four Right");  
        b10.setBounds(340,140,90,40);  
        this.add(b10);
        
        b11 = new JButton("Five Right");  
        b11.setBounds(340,180,90,40);  
        this.add(b11);
        
        b12 = new JButton("Six Right");  
        b12.setBounds(340,220,90,40);  
        this.add(b12);
         
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);    
        
    }


    /*
    Sets running boolean
    */
    public void setRunning(boolean b) {
        this.running = b;
    }
    
    
    /*
    Initializes and begins the thread which
    handles updating and drawing.
    */
    public void start() {
        this.thread = new Thread(this);
        this.thread.start();
    }

    
    public static Color getColor(int x) { 
    	if (x == 1) { 
    		return Color.pink;
    	} else if ( x == 2) { 
    		return Color.green;
    	} else if (x == 3) { 
    		return Color.red;
    	} else if(x== 4) {
    		return Color.blue;
    	} else if (x == 5) {
    		return Color.orange;
    	} else if (x == 6){ 
    		return Color.yellow;
    	} else { 
    		return Color.black;
    	}
    }
    
    static void draw(Graphics g, int x, int y, int width, int height, Color c, int num) {
    	
        g.setColor(c);
        g.fillRect(x, y, width, height);
        //g.setColor(Color.black);
        //g.drawString(Integer.toString(num), x + (width / 2), y + (height / 2));
    }
    
    

    /*
    Draws the background and each object within the game
    on the JPanel.
    */
    @Override
    public void paintComponent(Graphics g) {
        if(this.running) {
            int sideLength = this.getHeight() / (size * 4) ;
            for(int i = 0; i < size; i++) {
            	for(int j = 0; j < size; j++) {  
            		int y = i * sideLength;
            		int x = (this.getHeight() / 3) + (j * sideLength) ;
            		Color c = getColor(cube.six.front[i][j]);
                draw(g, x, y, sideLength, sideLength, c, 6);
                border.paintBorder(this, g,  x, y, 
                        sideLength, sideLength); 
            	}
            }
            for(int i = 0; i < size; i++) {
            	for(int j = 0; j < size; j++) {  
            		int y = i * sideLength + (this.getHeight() / 4); 
            		int x = (this.getHeight() / 3) + (j * sideLength) ;
            		Color c = getColor(cube.four.front[i][j]);
                draw(g, x, y, sideLength, sideLength, c, 4);
                border.paintBorder(this, g,  x, y, 
                        sideLength, sideLength);
            	}
            }
            for(int i = 0; i < size; i++) {
            	for(int j = 0; j < size; j++) {  
            		int y = i * sideLength + (this.getHeight() / 2); 
            		int x = (this.getHeight() / 3) - (size * sideLength) + (j * sideLength) ;
            		Color c = getColor(cube.two.front[i][j]);
                draw(g, x, y, sideLength, sideLength, c, 2);
                border.paintBorder(this, g,  x, y, 
                        sideLength, sideLength);
            	}
            }
            for(int i = 0; i < size; i++) {
            	for(int j = 0; j < size; j++) {  
            		int y = i * sideLength + (this.getHeight() / 2); 
            		int x = (this.getHeight() / 3) + (j * sideLength) ;
            		Color c = getColor(cube.one.front[i][j]);
                draw(g, x, y, sideLength, sideLength, c, 1);
                border.paintBorder(this, g,  x, y, 
                        sideLength, sideLength);
            	}
            }
            for(int i = 0; i < size; i++) {
            	for(int j = 0; j < size; j++) {  
            		int y = i * sideLength + (this.getHeight() / 2); 
            		int x = (this.getHeight() / 3) + (size * sideLength) + (j * sideLength) ;
            		Color c = getColor(cube.three.front[i][j]);
                draw(g, x, y, sideLength, sideLength, c, 3);
                border.paintBorder(this, g,  x, y, 
                        sideLength, sideLength);
            	}
            }
            for(int i = 0; i < size; i++) {
            	for(int j = 0; j < size; j++) {  
            		int y = i * sideLength + (3 * this.getHeight() / 4); 
            		int x = (this.getHeight() / 3) + (j * sideLength) ;
            		Color c = getColor(cube.five.front[i][j]);
                draw(g, x, y, sideLength, sideLength, c, 5);
                border.paintBorder(this, g,  x, y, 
                        sideLength, sideLength);
            	}
            }  
          
        } else { 
            Font font = new Font("Serif", 200, 50);
            g.setFont(font);
            g.setColor(Color.RED);
            g.drawString("Click spacebar to begin", 145, this.getHeight()/2);
        }
    }

    /*
    Main loop of game which handles updating and repainting
    the JPanel.
    */
    @Override
    public void run() {
        long updateTime = 0;
        long targetUpdateTime = (long) 1000 / this.updatesPerSecond;
        this.running = true;
        while(this.running) { 
            if(System.currentTimeMillis() - updateTime >= targetUpdateTime) {
                //update snakes, food, etc.
                //this.update();
                this.repaint();
                 
            	
                updateTime = System.currentTimeMillis();
            }
            long waitTime = targetUpdateTime - (System.currentTimeMillis() - updateTime);
            if(waitTime > 0) {
                try {
                    Thread.sleep(waitTime);
                } catch(Exception e) { 
                    e.printStackTrace();
                }
            }
        }
    }


	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton)e.getSource();
		if (source == b1) { 
			this.cube.one.rotateLeft();
		} if (source == b2) { 
			this.cube.two.rotateLeft();
		} if (source == b3) { 
			this.cube.three.rotateLeft();
		} if (source == b4) { 
			this.cube.four.rotateLeft();
		} if (source == b5) { 
			this.cube.five.rotateLeft();
		} if (source == b6) { 
			this.cube.six.rotateLeft();
		} if (source == b7) { 
			this.cube.one.rotateRight();
		} if (source == b8) { 
			this.cube.two.rotateRight();
		} if (source == b9) { 
			this.cube.three.rotateRight();
		}if (source == b10) { 
			this.cube.four.rotateRight();
		}if (source == b11) { 
			this.cube.five.rotateRight();
		}if (source == b12) { 
			this.cube.two.rotateRight();
		}
		
	}

}
