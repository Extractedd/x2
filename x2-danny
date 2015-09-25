//////// Exercise x2:  modularize exercise x1, and add dog to chase hero.
//////// Whoever Whoever  (CST 112; today's date?)

//////// Please change these to your name and today's date.
String author=  "Danny R."; 
String title=  " Come On B ";
String help=  " Click to relocate hero \n 'q' to quit; 'r' to reset. ";
int count=0;

//// GLOBALS:  coordinates, speed, etc.
float horizon;
float x, y;       // Position.
float dx, dy;     // Speed.
float dogX, dogY;

//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size( 640,480);
  horizon=  height/4;
  x=  width/2;
  y=  height/2;
  dx=  3;
  dy=  2;
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  count= count + 1;
  scene();
  hero();
  dog();
  messages();
  
}

//// SCENE:  sky, sun, tree, house, etc.
void scene() {  
  /* INSERT YOUR CODE HERE! */    background( 200,255,255 );
  fill(0);
  /* REPLACE THIS STUB! */  text( "scene", 100, 100 );
 
  //// SCENE:  sky, sun, tree, house, etc.
  background( 50,200,255 );                // sky
  stroke(0);
  fill( 255,255,0 );
  ellipse( width*3/4, height/8, 50,50 );    // sun
  // Grass
  stroke(0);
  fill(200,150,100);
  rect(125,horizon/1.5,30,100);
  fill( 100,200,100 );
  rect( 0,horizon, width,height*3/4 );      // grass.
  
  /* INSERT YOUR CODE HERE! */
  triangle( 140,horizon/2, 100,horizon-20/2, 180,horizon-20/2  );
  triangle( 140,horizon/2, 90,horizon-25, 180,horizon-25  );  // tree
 
 
 stroke(0);
  //not an iglo
 fill(255,255,155);
rect(110,150,50/2,50);
rect(60,150, 50/2,50);
 fill(255,255,155);
 arc(100,250,150,150,PI,TWO_PI); 
fill(0,0,0); 
arc(100,250,20,50,PI,TWO_PI);  
fill(0);
text("CAPSULE CORP.", 50,210);  // house
  fill(0);
}

void messages() {
  text( title, width/3, 20 );
  text( help, width*2/3, 30 );
  text( author, 10,height-20 );
}

//// ACTION:  move (x,y) coordinates of hero & dog; show them.
void hero() {
  /* INSERT YOUR CODE HERE! */
  /* REPLACE THIS STUB! */  text( "Majin Buu", 200, 200 );
  fill(255,100,100);
   ellipse( x,y, 70,80 );
  x= x+dx; 
  if(x< 50 || x>width-50) dx= -dx;
  y= y+dy; 
  if(y< 0 || y> height-50) dy= -dy;
}
void dog() {
  float dogDX= (dogX-x)/30;
  dogX=  dogX - (dogX-x)/30;
  dogY=  dogY - (dogY-y)/40;
  text( dogX, 10, 10 );
  text( dogY, 10, 20 );
  //
  fill( 250,180,120);
  rect(dogX,dogY, 60,30 );
  /* INSERT YOUR CODE HERE! */
  /* REPLACE THIS STUB! */  text( "woof, woof!!!", 150, 150 );
float headX= dogX-10;
if(dogDX > 0) {
  headX= dogX+50;
}
rect( headX,dogY-15,25,15);
strokeWeight(6);
if(count/30 % 2 == 0){
line(dogX,dogY+30, dogX, dogY+30+20);
line(dogX,dogY+30, dogX+20, dogY+30+20);
} else{
  line(dogX,dogY+30, dogX, dogY+30+20);
line(dogX,dogY+30, dogX-20, dogY+30+20);
}
strokeWeight(1);
}





//////// HANDLERS:  mouse clicks, keys
void mousePressed() {
  x=  mouseX;                             // Set (x,y) to mouse
  y=  mouseY;
  //
  dx=  random( -6, +6 );                  // random speed.
  dy=  random( -4, +4 );
}

void keyPressed() {
  if (key == 'q') {
    exit();                           // press 'q' key to QUIT.
  }
  /* INSERT YOUR CODE HERE! */
}
   
   

