import javax.swing.*;


//Joey Massoni and Maximiliano Castrillon
//We used drawHorizLine to create the Indonesian flag.
//We used drawVerticalLine twice to create the Italian flag.
//We stuck around until around 11:30 to get the diagnal lines to work.


public class DrawFlag {
   static public void main(String[] args) {
      /* ======================================================
         This section of the program defines color values and
         make a canvas variable (named 'pic') for drawing

         Do NOT change these values,
         but you can add more if you wish
      ====================================================== */
      final int RED    = 0xFF0000;         // Color code for red
      final int GREEN  = 0x00FF00;         // Color code for green
      final int BLUE   = 0x0000FF;         // Color code for blue
      final int YELLOW = 0xFFFF00;         // Color code for yellow
      final int WHITE  = 0xFFFFFF;         // Color code for white
      final int BLACK  = 0x000000;         // Color code for black

      //Setup the GUI components
      JFrame f = new JFrame( "My Flag" );    // Create a Frame
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //create a new flag object
      Flag flag = new Flag(400,300);         // Make a 400x300 flag
      f.getContentPane().add("Center", flag);                 // Put the flag in the window

      f.pack();
      f.setSize(430,380);                 // Set window size including window decorations!
      f.setVisible(true);                   // Make window visible 

     
      /* -----------------------------------------------------------
         YOUR CODE HERE
         call your methods here when you have written the methods
      -----------------------------------------------------------*/
      
      flag.setBackground(WHITE);
      
      //EXTRA CREDIT (Woo!)
      
      //flag.drawHorizLine(0, 150, RED); //Indonesian Flag
     
      //flag.drawVerticalLine(0, 133, GREEN);
      //flag.drawVerticalLine(266, 133, RED); //Italian Flag
      
      //flag.drawRightDiagonal(BLUE); //Rightward Diagonal Line
      
      flag.drawLeftDiagonal(YELLOW); //Leftward Diagonal Linen
      
      
        
      /* -----------------------------------------------------------
         END OF YOUR CODE
         -----------------------------------------------------------*/
      
      //draw the picture
      flag.draw( );
      flag.repaint();   // Repaint the frame
   }
}