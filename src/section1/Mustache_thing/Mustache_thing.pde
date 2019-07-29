PImage mustache;
PImage DonaldTrump;
void setup () {
  mustache = loadImage("Mustache.jpg");
  DonaldTrump = loadImage ("Donald Trump.jpg");
  size(800, 600);
  DonaldTrump.resize (width, height);
}
void draw () {
  background(DonaldTrump); 
    image(mustache, mouseX, mouseY);
    /*if (mousePressed) {
      
    }8*/
}
