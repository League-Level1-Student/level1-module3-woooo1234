package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = 100;
    int hopDistance;
    int y = 55;
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
    ellipse(x, y, WIDTH, HEIGHT);
    int speed;
    display();
    }
    private void display() {
		// TODO Auto-generated method stub
		
	}

	static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
    public void keyPressed()
    {
        if(key == CODED){
            if(keyCode == UP)
            {
              y -= 30;
            }
            else if(keyCode == DOWN)
            {
                y += 20;
            }
            else if(keyCode == RIGHT)
            {
                x += 20;
            }
            else if(keyCode == LEFT)
            {
                x -= 20;
            }
        }
       
    }
    public void keepBounds() {
    	
		if (x < 0) {
			x = 0;
		}
		if (y < 0) {
			y = 0;
		}
		if (width < 800) {
			width = 800;
		}
		if (height < 600) {
			width = 600;
		}
		
    }
    

}
