import processing.core.*; 

import java.applet.*; 
import java.awt.*; 
import java.awt.image.*; 
import java.awt.event.*; 
import java.io.*; 
import java.net.*; 
import java.text.*; 
import java.util.*; 
import java.util.zip.*; 
import java.util.regex.*; 

public class SetupDraw extends PApplet {

/**
 * Setup and Draw. 
 * 
 * The draw() function creates a structure in which
 * to write programs that change with time. 
 */

// The statements in the setup() function 
// execute once when the program begins
public void setup() 
{
  size(200, 200);  // Size should be the first statement
  stroke(255);     // Set line drawing color to white
  frameRate(30);
}

float y = 100;

// The statements in draw() are executed until the 
// program is stopped. Each statement is executed in 
// sequence and after the last line is read, the first 
// line is executed again.
public void draw() 
{ 
  background(0);   // Set the background to black
  y = y - 1; 
  if (y < 0) { y = height; } 
  line(0, y, width, y);  
} 


  static public void main(String args[]) {
    PApplet.main(new String[] { "SetupDraw" });
  }
}
