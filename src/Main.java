import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {

	public static void main(String[] args) {
		PApplet.main("Main");
	}

	@Override
	public void settings() {
		size(1000, 800);
	}

	int estado;

	// Pantallas img

	private PImage PRINCIPAL;
	private PImage INSTRUCCIONES;
	private PImage ESCENARIO;
	private PImage RESUMEN;

	@Override
	public void setup() {

		// FONDOS
		PRINCIPAL = loadImage("data/PRINCIPAL.png");
		INSTRUCCIONES = loadImage("data/INSTRUCCIONES.png");
		ESCENARIO = loadImage("data/ESCENARIO.png");
		RESUMEN = loadImage("data/RESUMEN.png");

	}

	@Override
	public void draw() {
		background(255);

		// Pantalla Principal
		if (estado == 0) {

			// Fondo
			// imageMode(CENTER);
			image(PRINCIPAL, 0, 0);
			imageMode(CORNER);

		}

		// Pantalla Instrucciones
		if (estado == 1) {

			// Fondo
			// imageMode(CENTER);
			image(INSTRUCCIONES, 0, 0);
			imageMode(CORNER);

		}

		// Pantalla juego
		if (estado == 2) {

			// Fondo
			// imageMode(CENTER);
			image(ESCENARIO, 0, 0);
			imageMode(CORNER);

		}

		// Pantalla Resumen
		if (estado == 3) {

			// Fondo
			// imageMode(CENTER);
			image(RESUMEN, 0, 0);
			imageMode(CORNER);

		}

		System.out.println(mouseX + "," + mouseY);

	}

	@Override
	public void mousePressed() {

		// Boton de jugar principal
		if (dist(mouseX, mouseY, 502, 638) < 30) {
			estado = 1;
		}

		// Boton de jugar instrucciones
		if (dist(mouseX, mouseY, 785, 717) < 30) {
			estado = 2;
		}

	}
}
