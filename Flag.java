import java.awt.*;
import java.awt.image.*;


/* ========================================================
   Coordinate system of a Flag:

           0    1       col#
           +----+--------+----------+
           |                        |  ^
         1 |                        |  |
           |                        |  |
           |                        |  |  height
      row# |        (row#,col#)     |  |
           |                        |  |
           |                        |  |
           +------------------------+  v
            <---------------------->
                    width
   ======================================================== */

public class Flag extends Canvas {
   private int numCols;
   private int numRows;
   private int[][] pixels; 
   private BufferedImage image;   //GUI component for image

   /**        
      Constructor for the Flag object
      @param width the width (number of columns) in the image
      @param height the height (number of rows) in the image
   **/
   public Flag(int width, int height) {
      //set instance variables
      this.numCols = width;
      this.numRows = height;

      //create a 2D array of the specified size
      pixels = new int[this.numRows][this.numCols];

      //initialize the image object
      //DO NOT MODIFY THIS OBJECT
      image = new BufferedImage(this.numCols, this.numRows, 
				 BufferedImage.TYPE_INT_RGB);
   }


   /**
   method to set the background color of the image to a specified color
   
   @param color the integer value of the color
   **/
   public void setBackground(int color) {
      
      //code here
      
      for(int r = 0; r < pixels.length; r++) {
         for(int c = 0; c < pixels[r].length; c++) {
            pixels[r][c] = color;
         }

      }
      
   }

   /**
   method to draw a horizontal stripe on the flag
   
   @param row the row at which specifies the top/beginning of the stripe
   @param width how wide (in pixels) the stripe should be
   @param color the integer value of the color of the stripe
   **/
   public void drawHorizLine(int row, int width, int color) {
      
      //code here
      
       for(int r = row; r < row + width; r++) {
         
         for(int c = 0; c < numCols; c++) {
          
            pixels[r][c] = color;
          
      }

    }
      
   }
   
   
   public void drawVerticalLine(int col, int width, int color) {
   
      for(int c = col; c < col + width; c++) {
         
         for(int r = 0; r < numRows; r++) {
            
            pixels[r][c] = color;
         
         }   
      }
      
         
   }
   
   public void drawRightDiagonal(int color) {
      
      
     
      for(int col = 0;col  < numCols; col++) {
         
         for(int row = 0; row < numRows; row++) {
            
            int diag = 3*col - 4*row;
            if (-150 <= diag && diag <= 150) {
                  
               pixels[row][col] = color;
            }
         }   
      }
   }
   
   public void drawLeftDiagonal(int color) {
      
     
      for(int col = 0;col  < numCols; col++) {
         
         for(int row = 0; row < numRows; row++) {
            
            int diag = 3*col + 4*row;
            if (1050 <= diag && diag <= 1350) {
                  
               pixels[row][col] = color;
            }
         }   
      }
   }

      

   /* DO NOT EDIT THE BELOW METHODS */
     
   /** 
   This method copies the flag stored in the pixels onto the BufferedImage
   **/
   public void draw() {
      for ( int row = 0; row < numRows; row++ )
         for ( int col = 0; col < numCols; col++ )
            image.setRGB( col, row, pixels[row][col] );
   }

   /** 
       repaint will invoke paint() and will draw the pixels in
       the variable image onto the screen
   **/
   public void paint(Graphics g) {
       g.drawImage(image, 0, 0, Color.white, null);
   }

   /**
       This update() method will eliminate flicker
   **/
   public void update(Graphics g) {
       paint(g);
   }
}