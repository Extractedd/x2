//////// Exercise x2:  modularize exercise x1, and add dog to chase hero.
//////// BAM:5925a

String author=  "Prof. BAM";
String title=  " X2a -- Dog, animation, etc. ";
String help=  " Click to relocate hero \n 'q' to quit; 'r' to reset. ";


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
  heroX += heroDX;
  heroY += heroDY;
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
  text( int(heroX) +", "+ int(heroY), 10,10 );
}
void showHero( float x, float y ) {
  fill( 255,0,0 );
  rect( x,y, 50,80 );
  float hipY=  y+80;
  if ( (frameCount/30) % 2 == 0) {
    line( x,hipY, x-10, hipY+25 );
  } else {
    line( x+50,hipY, x+60, hipY+25 );
  } 
}



void dog() {
  dogX=  dogX + (heroX - dogX)/30;
  dogY=  dogY + (heroY-dogY)/40;
  /* INSERT YOUR CODE HERE! */
  /* REPLACE THIS STUB! */  text( "woof, woof!!!", dogX, dogY );
  text( dogX+","+dogY, 10,40 );
  showDog( dogX, dogY );
}
void showDog( float x, float y ) {
  fill( 127, random(50,100), random(0,50) );
  rect( x,y, 40,20 );
  rect( x+30,y-10, 20,10 );
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
   
   

