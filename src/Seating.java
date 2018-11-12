import java.awt.Color;

public class Seating extends Mensch {

	private int[] position = { 0, 0 };
	private int x = 0;
	private String name = "Seating-Objekt";
	private Color farbe = new Color(0, 0, 255);
	private boolean fertig = false;

	public Seating() {
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
		} else if (x > 750 && x < 900) {
			moveDown();
		} else if (x > 900 && x < 1250) {
			moveRight();
		} else if (x > 1250 && x < 1600) {
			moveUp();
		} else if (x > 1600 && x < 1900) {
			moveUp();
			moveLeft();
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

		System.out.println("Seating-Mensch geht in die Mensa...");
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

		System.out.println("...holt sich etwas zu Essen...");
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

		System.out.println("...bezahlt ausnahmsweise mal...");
		enteringEssensAusgabe2.lichtschranke2unterbrechen(zwischenBereich, essensAusgabe, sitzBereich);
		enteringEssensAusgabe2.lichtschranke1unterbrechen(zwischenBereich, essensAusgabe, sitzBereich);
		System.out.print(enteringEssensAusgabe2.getName() + "-richtung: ");
		System.out.println(enteringEssensAusgabe2.getRichtung());
		enteringEssensAusgabe2.setRichtung("");

		System.out.println();
		System.out.println("Personen im Zwischenbereich: " + zwischenBereich.getAnzahlPersonen());
		System.out.println("Personen in der Essensausgabe: " + essensAusgabe.getAnzahlPersonen());
		System.out.println("Personen im Sitzbereich: " + sitzBereich.getAnzahlPersonen());
		System.out.println();

		System.out.println("...und setzt sich erstmal hin!");
		enteringSitzBereich.lichtschranke1unterbrechen(zwischenBereich, essensAusgabe, sitzBereich);
		enteringSitzBereich.lichtschranke2unterbrechen(zwischenBereich, essensAusgabe, sitzBereich);
		System.out.print(enteringSitzBereich.getName() + "-richtung: ");
		System.out.println(enteringSitzBereich.getRichtung());
		enteringSitzBereich.setRichtung("");

		System.out.println();
		System.out.println("Personen im Zwischenbereich: " + zwischenBereich.getAnzahlPersonen());
		System.out.println("Personen in der Essensausgabe: " + essensAusgabe.getAnzahlPersonen());
		System.out.println("Personen im Sitzbereich: " + sitzBereich.getAnzahlPersonen());
		System.out.println();
	}
}
