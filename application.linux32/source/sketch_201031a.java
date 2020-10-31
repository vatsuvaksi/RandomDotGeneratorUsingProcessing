import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class sketch_201031a extends PApplet {

int circleX;
int circleY;
public void setup(){

background(80);

}
public void draw(){
  circleX=(int)random(1,height);
  circleY=(int)random(0,width);
fill(random(1,255), random(1,255), random(1,255));
ellipse(circleX,circleY,24,24);

}
  public void settings() { 
size(500, 500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_201031a" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
