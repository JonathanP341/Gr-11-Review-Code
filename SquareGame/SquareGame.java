import javax.swing.JFrame;

public class SquareGame extends JFrame{
   
   public static void main(String[] args) {
        
         new SquareGame();
    }
   
    public SquareGame(){
            
        this.add(new Game());
        this.setTitle("Move");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
    }
}
