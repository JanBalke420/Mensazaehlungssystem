import java.awt.Color;

public class CoffeeToGo extends Mensch {

	private int[] position = { 0, 0 };
	private int x = 0;
	private String name = "CoffeeToGo-Objekt";
	private Color farbe = new Color(255, 0, 0);
	private boolean fertig = false;

	public CoffeeToGo() {
		position[0] = 150;
		position[1] = 800;
		name = "CoffeeToGo-Objekt";
	}

	public int getPosition(String orientation) {
		if (orientation.equals("x")) {
			return this.position[0];
		} else if (orientation.equals("y")) {
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

	public void grafikBewegen() {
		if (x < 250) {
			moveUp();
		} else if (x > 250 && x < 750) {
			moveRight();
		} else if (x > 750 && x < 800) {
			moveDown();
		} else if (x > 1050 && x < 1100) {
			moveUp();
		} else if (x > 1100 && x < 1600) {
			moveLeft();
		} else if (x > 1600 && x < 1850) {
			moveDown();
		}
		x++;
	}

	public void bewegen(MensaBereich zwischenBereich, MensaBereich essensAusgabe, MensaBereich sitzBereich,
			LichtschrankenGruppe enteringZwischenBereich, LichtschrankenGruppe enteringEssensAusgabe1,
			LichtschrankenGruppe enteringEssensAusgabe2, LichtschrankenGruppe enteringSitzBereich) {

		System.out.println();
		System.out.println("Personen im Zwischenbereich: " + zwischenBereich.getAnzahlPersonen());
		System.out.println("Personen in der Essensausgabe: " + essensAusgabe.getAnzahlPersonen());
		System.out.println("Personen im Sitzbereich: " + sitzBereich.getAnzahlPersonen());
		System.out.println();

		System.out.println("CoffeeToGo-Mensch holt sich einen Kaffee...");

		enteringZwischenBereich.lichtschranke1unterbrechen(zwischenBereich, essensAusgabe, sitzBereich);
		enteringZwischenBereich.lichtschranke2unterbrechen(zwischenBereich, essensAusgabe, sitzBereich);
		System.out.print(enteringZwischenBereich.getName() + "-richtung: ");
		System.out.println(enteringZwischenBereich.getRichtung());
		enteringZwischenBereich.setRichtung("");

		System.out.println();
		System.out.println("Personen im Zwischenbereich: " + zwischenBereich.getAnzahlPersonen());
		System.out.println("Personen in der Essensausgabe: " + essensAusgabe.getAnzahlPersonen());
		System.out.println("Personen im Sitzbereich: " + sitzBereich.getAnzahlPersonen());
		System.out.println();

		System.out.println("...und geht wieder raus!");
		enteringZwischenBereich.lichtschranke2unterbrechen(zwischenBereich, essensAusgabe, sitzBereich);
		enteringZwischenBereich.lichtschranke1unterbrechen(zwischenBereich, essensAusgabe, sitzBereich);
		System.out.print(enteringZwischenBereich.getName() + "-richtung: ");
		System.out.println(enteringZwischenBereich.getRichtung());
		enteringZwischenBereich.setRichtung("");

		System.out.println();
		System.out.println("Personen im Zwischenbereich: " + zwischenBereich.getAnzahlPersonen());
		System.out.println("Personen in der Essensausgabe: " + essensAusgabe.getAnzahlPersonen());
		System.out.println("Personen im Sitzbereich: " + sitzBereich.getAnzahlPersonen());
		System.out.println();
	}
}
