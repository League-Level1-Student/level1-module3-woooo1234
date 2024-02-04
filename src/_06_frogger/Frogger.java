package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    
    public void draw() {
    background(145,56,49);
    fill(145,56,49);
    ellipse(100, 0, 200, 300);
    int speed;
    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
}
