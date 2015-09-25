//////// Exercise x2:  modularize exercise x1, and add dog to chase hero.
//////// BAM:5925a

String author=  "Prof. BAM";
String title=  " X2a -- Dog, animation, etc. ";
String help=  " Click to relocate hero \n 'q' to quit; 'r' to reset. "
  + "\n Press 'p' key to pause action" ;


//// GLOBALS:  coordinates, speed, etc.
float horizon;
float heroX, heroY;       // Position.
float heroDX, heroDY;     // Speed.
float dogX, dogY;


//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size( 640,480);
  horizon=  height/4;
  heroX=  width/2;
  heroY=  height/2;
  heroDX=  3;
  heroDY=  2;
  dogX= 100;
  dogY=100;
}

//// NEXT FRAME:  scene, action, show.
void draw() {
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
}

void messages() {
  text( title, width/3, 20 );
  text( help, width*2/3, 30 );
  text( author, 10,height-20 );
}

//// ACTION:  move (x,y) coordinates of hero & dog; show them.
void hero() {
  /* INSERT YOUR CODE HERE! */
  //--  /* REPLACE THIS STUB! */  text( "[[[[ Zoog. ]]]]", 200, 200 );

  // Move & draw.
  if (key != 'p') {
    heroX += heroDX;
    heroY += heroDY;
  }
  // Bounce.
  if (heroX < 0 || heroX > width) {
    heroDX = -heroDX;
  }
  // Also force below horizon.
  if (heroY < horizon ) {
    heroY=   horizon;         // Cannot go above horizon.
    heroDY=  abs(heroDY);    // Force it downward.
  }
  if (heroY < horizon || heroY > height-30) {
    heroDY = -heroDY;
  }
  // Show.
  showHero( heroX, heroY );  
  //--  text( int(heroX) +", "+ int(heroY), 10,10 );
}
void showHero( float x, float y ) {
  fill( 255,0,0 );
  rect( x,y, 50,80 );
  // head & legs.
  fill( 255,200,150 );
  ellipse( x+25,y-20, 40,40 );
  fill( 255 );
  arc( x+25, y-12, 25,12, 0, PI );
  fill( 127,0,0 );
  ellipse( x+25,y-20, 8,8 );
  eye( x+15,y-30 );
  eye( x+35,y-30 );
  legs( x+5, y+80 );
}
void legs( float x, float hip ) {
  // Animated legs.  
  strokeWeight( 8 );
  float toe;
  int k=  (frameCount/30) % 4;
  
  if ( k == 0) 
  {
    toe= x-10;
    line( x,hip,      toe, hip+40 );
    line( x+40,hip,   toe+40, hip+40 );
    text( k, toe, hip+60 );
  } 
  else if ( k == 1) 
  {
    toe=  x+20;
    line( x,hip,     toe, hip+40 );
    line( x+40,hip,  toe+40, hip+40 );
    text( k, toe, hip+60 );
  } 
  else if ( k == 2) 
  {
    toe=  x+10;
    line( x,hip,     toe, hip+40 );
    line( x+40,hip,  toe+40, hip+40 );
    text( k, toe, hip+60 );
  } 
  else if ( k == 3) 
  {
    toe=  x-20;
    line( x,hip,     toe, hip+40 );
    line( x+40,hip,  toe+40, hip+40 );
    text( k, toe, hip+60 );
  } 
  else { text( "ERROR", x, hip+20 ); } 
  strokeWeight( 1 );
}


// Dog chases hero.
void dog() {
  if (key != 'p') {
    dogX=  dogX + (heroX - dogX)/60;
    dogY=  dogY + (heroY-dogY)/80;
  }
  /* INSERT YOUR CODE HERE! */
  showDog( dogX, dogY );
}
void showDog( float x, float y ) {
  fill( 127, 50, 0 );
  rect( x,y, 60,30 );

/*
  if (dogX > heroX) {  rect( x-10,y-10, 20,10 ); }
  else { rect( x+30,y-10, 20,10); }
*/

  // Make head (and jaws, etc.) face in correct direction.
  float headX=  x+50, mouthX=x+64;
  if (dogX > heroX) { headX= x-20; mouthX=x-20; } 

  rect( headX,y-20, 30,20 ); 
  text( "woof, woof!!!", headX, dogY-40 );

  // Mouth & eyes.  
  fill(255,200,200);
  rect( mouthX,y-7, 16,4 );
  eye( mouthX+10, y-16 );

}

void eye( float x, float y ) {
  fill( 255 );
  ellipse( x,y, 12,12 );      // eye
  if (frameCount % 60 != 0) {    // (blink)
    fill( 0,0,255 );
    ellipse( x,y, 6,6 );      // eyeball
  }
}



//////// HANDLERS:  mouse clicks, keys
void mousePressed() {
  heroX=  mouseX;                             // Set (x,y) to mouse
  heroY=  mouseY;
  //
  heroDX=  random( -6, +6 );                  // random speed.
  heroDY=  random( -4, +4 );
}

void keyPressed() {
  if (key == 'q') {
    exit();                           // press 'q' key to QUIT.
  }
  /* INSERT YOUR CODE HERE! */
}
   
   

