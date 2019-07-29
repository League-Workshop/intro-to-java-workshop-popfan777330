void setup() {
  size(600, 600);
}
void draw() {
  noStroke();
  ellipse(300, 300, 100, 100);
  if (mousePressed) {
    fill(0,255,0);
  } else {
    fill(255, 0, 0);
  }
}
