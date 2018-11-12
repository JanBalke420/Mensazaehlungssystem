import java.awt.Color;

public class SnackToGo extends Mensch {

	private int[] position = { 0, 0 };
	private int x = 0;
	private String name = "SnackToGo-Objekt";
	private Color farbe = new Color(0, 255, 0);
	private boolean fertig = false;

	public SnackToGo() {
		position[0] = 150;
		position[1] = 800;
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
		} else if (x > 250 && x < 550) {
			moveRight();
		} else if (x > 550 && x < 700) {
			moveDown();
		} else if (x > 700 && x < 750) {
			moveRight();
			moveDown();
		} else if (x > 750 && x < 800) {
			moveDown();
		} else if (x > 800 && x < 825) {
			moveLeft();
		} else if (x > 825 && x < 850) {
			moveRight();
		} else if (x > 850 && x < 900) {
			moveUp();
		} else if (x > 900 && x < 950) {
			moveLeft();
			moveUp();
		} else if (x > 950 && x < 1100) {
			moveUp();
		} else if (x > 1100 && x < 1400) {
			moveLeft();
		} else if (x > 1400 && x < 1650) {
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

		System.out.println("SnackToGo-Mensch geht in die Mensa...");
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

		System.out.println("...holt sich einen Snack...");
		enteringEssensAusgabe1.lichtschranke1unterbrechen(zwischenBereich, essensAusgabe, sitzBereich);
		enteringEssensAusgabe1.lichtschranke2unterbrechen(zwischenBereich, essensAusgabe, sitzBereich);
		System.out.print(enteringEssensAusgabe1.getName() + "-richtung: ");
		System.out.println(enteringEssensAusgabe1.getRichtung());
		enteringEssensAusgabe1.setRichtung("");

		System.out.println();
		System.out.println("Personen im Zwischenbereich: " + zwischenBereich.getAnzahlPersonen());
		System.out.println("Personen in der Essensausgabe: " + essensAusgabe.getAnzahlPersonen());
		System.out.println("Personen im Sitzbereich: " + sitzBereich.getAnzahlPersonen());
		System.out.println();

		System.out.println("...geht wieder raus...");
		enteringEssensAusgabe1.lichtschranke2unterbrechen(zwischenBereich, essensAusgabe, sitzBereich);
		enteringEssensAusgabe1.lichtschranke1unterbrechen(zwischenBereich, essensAusgabe, sitzBereich);
		System.out.print(enteringEssensAusgabe1.getName() + "-richtung: ");
		System.out.println(enteringEssensAusgabe1.getRichtung());
		enteringEssensAusgabe1.setRichtung("");

		System.out.println();
		System.out.println("Personen im Zwischenbereich: " + zwischenBereich.getAnzahlPersonen());
		System.out.println("Personen in der Essensausgabe: " + essensAusgabe.getAnzahlPersonen());
		System.out.println("Personen im Sitzbereich: " + sitzBereich.getAnzahlPersonen());
		System.out.println();

		System.out.println("...und aus der Mensa!");
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
