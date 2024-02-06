import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game extends JPanel implements ActionListener {
   static final int SCREEN_WIDTH = 1300;
    static final int SCREEN_HEIGHT = 750;
    static final int UNIT = 5;
   static final int DELAY = 30;
   
   //Keys to Press
   static final int UP_KEY = KeyEvent.VK_UP;
   static final int LEFT_KEY = KeyEvent.VK_LEFT;
   static final int RIGHT_KEY = KeyEvent.VK_RIGHT;
   static final int DOWN_KEY = KeyEvent.VK_DOWN;
   
   
   //Determining whether a key is pressed
   boolean upPressed = false;
   boolean leftPressed = false;
   boolean rightPressed = false;
   boolean downPressed = false;
    
   Timer timer;
   
   //Declaring a square character
   public Square p1;
   
   public Game(){
      this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
      this.setBackground(Color.black);
      this.setFocusable(true);
      this.addKeyListener(new MyKeyAdapter());
      startGame();
    }
   
   
   /***
      Initializing the values of the game
   **/
   public void startGame() {
      p1 = new Square(0,0,50,50,Color.red);
        timer = new Timer(DELAY,this);
        timer.start();
    }
   
   public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }
   
   
   /***
   Drawing the Game
   ***/
    public void draw(Graphics g) {
      g.setColor(Color.red);
        g.fillRect(p1.getX(), p1.getY(), p1.getLength(), p1.getWidth());    
    }
   
   @Override
    public void actionPerformed(ActionEvent e) {
        move();
      checkCollision();
        repaint();
    }
   
   /**
      Movement Code
   */
   //ITS ALIVE
   public void move(){
      if (upPressed) {
         p1.moveSquareY(-20);
      }
      if (leftPressed) {
         p1.moveSquareX(-20);
      }
      if (rightPressed) {
         p1.moveSquareX(20);
      }
      if (downPressed) {
         p1.moveSquareY(20);
      }
   }
   
   
   /***
   Collision Code
   */
   public void checkCollision() {
      //can you make the square stay within bounds?
      //can you check if the square is in contact with another square?
      if ((p1.getY() > 0) || (p1.getY < SCREEN_HEIGHT)) {
         
      }
      
   }
   //For checking if different keys are pressed
   //don't change unless you're adding more keys
   public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
         if (e.getKeyCode() == UP_KEY) {
            upPressed = true;
         }
         if (e.getKeyCode() == LEFT_KEY) {
            leftPressed = true;
         } 
         if (e.getKeyCode() == RIGHT_KEY) {
            rightPressed = true;
         }
         if (e.getKeyCode() == DOWN_KEY) {
            downPressed = true;
         }
      }
      public void keyReleased(KeyEvent e) {
         if (e.getKeyCode() == UP_KEY) {
            upPressed = false;
         }
         if (e.getKeyCode() == LEFT_KEY) {
            leftPressed = false;
         }
         if (e.getKeyCode() == RIGHT_KEY) {
            rightPressed = false;
         }
         if (e.getKeyCode() == DOWN_KEY) {
            downPressed = false;
         }
      }
   }
}
