int circleX;
int circleY;
void setup(){
size(500, 500);
background(80);

}
void draw(){
  circleX=(int)random(1,height);
  circleY=(int)random(0,width);
fill(random(1,255), random(1,255), random(1,255));
ellipse(circleX,circleY,24,24);

}
