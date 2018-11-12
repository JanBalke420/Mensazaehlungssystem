import java.awt.*;


public class Mensch {

	private int[] position = {0, 0};
	private int x = 0;
	private String name = "";
	private Color farbe = new Color(0, 0, 0);
	private boolean fertig = false;
	
	
	public Mensch() {
		position[0] = 0;
		position[1] = 0;
	}

	public void bewegen(MensaBereich zwischenBereich,
						MensaBereich essensAusgabe,
						MensaBereich sitzBereich,
						LichtschrankenGruppe enteringZwischenBereich,
						LichtschrankenGruppe enteringEssensAusgabe1,
						LichtschrankenGruppe enteringEssensAusgabe2,
						LichtschrankenGruppe enteringSitzBereich) {

	}
	
	public void grafikBewegen() {
		//position[0]--;
	}
	
	public boolean getFertig() {
		return this.fertig;
	}
	
	public void waitAMoment() {
		
	}
	
	public void moveUp() {
		position[1]--;
	}
	
	public void moveDown() {
		position[1]++;
	}
	
	public void moveLeft() {
		position[0]--;
	}
	
	public void moveRight() {
		position[0]++;
	}
	
	public int getPosition(String orientation) {
		if (orientation.equals("x")) {
			return this.position[0];
		} else if(orientation.equals("y")){
			return this.position[1];
		} else {
			return 0;
		}
	}

	public String getName() {
		return name;
	}

	public Color getFarbe() {
		return farbe;
	}
}
