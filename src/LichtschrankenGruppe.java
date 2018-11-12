
public class LichtschrankenGruppe {
	private String name;
	private Lichtschranke lichtschranke1;
	private Lichtschranke lichtschranke2;
	private String richtung = "";

	public LichtschrankenGruppe(String name) {
		this.name = name;
		this.lichtschranke1 = new Lichtschranke("a");
		this.lichtschranke2 = new Lichtschranke("b");
	}

	public void setRichtung(String richtung) {
		this.richtung = richtung;
	}

	public String getRichtung() {
		return this.richtung;
	}

	public String getName() {
		return this.name;
	}

	public Lichtschranke getLichtschranke1() {
		return lichtschranke1;
	}

	public Lichtschranke getLichtschranke2() {
		return lichtschranke2;
	}

	public void lichtschranke1unterbrechen(MensaBereich zwischenBereich, MensaBereich essensAusgabe,
			MensaBereich sitzBereich) {

		this.richtung = this.richtung + this.lichtschranke1.unterbrechen();

		if (this.richtung.length() == 2) {
			switch (name) {
			case "enteringZwischenBereich":
				if (richtung.equals("ab")) {
					zwischenBereich.decreaseAnzahlPersonen();
					 richtung = "";
				} else if (richtung.equals("ba")) {
					zwischenBereich.increaseAnzahlPersonen();
					 richtung = "";
				}
				break;
			case "enteringEssensAusgabe1":
				if (richtung.equals("ab")) {
					zwischenBereich.decreaseAnzahlPersonen();
					essensAusgabe.increaseAnzahlPersonen();
					 richtung = "";
				} else if (richtung.equals("ba")) {
					zwischenBereich.increaseAnzahlPersonen();
					essensAusgabe.decreaseAnzahlPersonen();
					 richtung = "";
				}
				break;
			case "enteringEssensAusgabe2":
				if (richtung.equals("ab")) {
					zwischenBereich.decreaseAnzahlPersonen();
					essensAusgabe.increaseAnzahlPersonen();
					 richtung = "";
				} else if (richtung.equals("ba")) {
					zwischenBereich.increaseAnzahlPersonen();
					essensAusgabe.decreaseAnzahlPersonen();
					 richtung = "";
				}
				break;
			case "enteringSitzBereich":
				if (richtung.equals("ab")) {
					zwischenBereich.increaseAnzahlPersonen();
					sitzBereich.decreaseAnzahlPersonen();
					 richtung = "";
				} else if (richtung.equals("ba")) {
					zwischenBereich.decreaseAnzahlPersonen();
					sitzBereich.increaseAnzahlPersonen();
					 richtung = "";
				}
				break;
			}
		}
	}

	public void lichtschranke2unterbrechen(MensaBereich zwischenBereich, MensaBereich essensAusgabe,
			MensaBereich sitzBereich) {

		this.richtung = this.richtung + this.lichtschranke2.unterbrechen();

		if (this.richtung.length() == 2) {
			switch (name) {
			case "enteringZwischenBereich":
				if (richtung.equals("ab")) {
					zwischenBereich.decreaseAnzahlPersonen();
					 richtung = "";
				} else if (richtung.equals("ba")) {
					zwischenBereich.increaseAnzahlPersonen();
					 richtung = "";
				}
				break;
			case "enteringEssensAusgabe1":
				if (richtung.equals("ab")) {
					zwischenBereich.decreaseAnzahlPersonen();
					essensAusgabe.increaseAnzahlPersonen();
					 richtung = "";
				} else if (richtung.equals("ba")) {
					zwischenBereich.increaseAnzahlPersonen();
					essensAusgabe.decreaseAnzahlPersonen();
					 richtung = "";
				}
				break;
			case "enteringEssensAusgabe2":
				if (richtung.equals("ab")) {
					zwischenBereich.decreaseAnzahlPersonen();
					essensAusgabe.increaseAnzahlPersonen();
					 richtung = "";
				} else if (richtung.equals("ba")) {
					zwischenBereich.increaseAnzahlPersonen();
					essensAusgabe.decreaseAnzahlPersonen();
					 richtung = "";
				}
				break;
			case "enteringSitzBereich":
				if (richtung.equals("ab")) {
					zwischenBereich.increaseAnzahlPersonen();
					sitzBereich.decreaseAnzahlPersonen();
					 richtung = "";
				} else if (richtung.equals("ba")) {
					zwischenBereich.decreaseAnzahlPersonen();
					sitzBereich.increaseAnzahlPersonen();
					 richtung = "";
				}
				break;
			}
		}
	}

}
