import java.awt.Color;
public class Square {
   private int x, y, length, width;
   private Color col;
   public Square(int x, int y, int length, int width, Color col) {
      this.x = x;
      this.y = y;
      this.length = length;
      this.width = width;
      this.col = col;
   }
   
   //Method to move?
   public int getX() {
      return this.x;
   }
   
   public int getY() {
      return this.y;
   }
   
   public int getLength() {
      return this.length;
   }
   
   public int getWidth() {
      return this.width;
   }
   
   public void moveSquareX(int xChange) {
      this.x += xChange;
   }
   public void moveSquareY(int yChange) {
      this.y += yChange;
   }
   
   
   public String toString(){
      return ("X: " + x +"; Y: " + y);
   }
}
