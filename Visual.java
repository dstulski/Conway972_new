import apcs.Window; //needs apcs.jar to work; see apcs.io

public class Visual {
	
	final int WIDTH = 500;
	final int HEIGHT = 500;
	final int CELL_HORIZ = 100;
	final int CELL_VERT = 100;
	final int CELL_WIDTH = WIDTH/CELL_HORIZ;
	final int CELL_HEIGHT = HEIGHT/CELL_VERT;
	
	public void initWindow () {
		Window.size(WIDTH, HEIGHT);
		Window.out.background(00, 00, 00);
	}
	
	public void renderMatrix (boolean[][] lifeMatrix) {
		//cycles through the matrix of cells
		for (int i = 0; i < CELL_HORIZ; i++) {
			for (int j = 0; j < CELL_VERT; j++) {
				if (lifeMatrix[i][j]) {
					//If a cell is alive, it prints a black square in its place. The CELL_WIDTH/2 is used to center the cell.
					Window.out.color(00, 00, 00);
					Window.out.rectangle((CELL_WIDTH/2 + (i+1) * CELL_WIDTH), (CELL_HEIGHT/2 + (j+1) * CELL_HEIGHT), CELL_WIDTH, CELL_HEIGHT);
				} else {
					//If a cell is dead, it prints a white square in its place. The CELL_WIDTH/2 is used to center the cell.
					Window.out.color(255, 255, 255);
					Window.out.rectangle((CELL_WIDTH/2 + (i+1) * CELL_WIDTH), (CELL_HEIGHT/2 + (j+1) * CELL_HEIGHT), CELL_WIDTH, CELL_HEIGHT);
				}
			}
		}
	}
	
}
