import processing.core.PApplet;
import processing.core.PImage;

public class Aliens {

	int x, y;

	// Alien
	private PImage ALIEN;

	
	public Aliens(PApplet app, int x, int y) {
		ALIEN = app.loadImage("data/ALIEN.png");
		this.x = x;
		this.y = y;
	}

	// PINTAR ALIENS
	public void pintar(PApplet app) {
		app.imageMode(app.CENTER);
		app.image(ALIEN, x, y);
		app.imageMode(app.CORNER);
	}

	public PImage getALIEN() {
		return ALIEN;
	}

	public void setALIEN(PImage aLIEN) {
		ALIEN = aLIEN;
	}

	
	
}
