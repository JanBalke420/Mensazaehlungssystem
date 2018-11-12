import java.util.ArrayList;

public class Simulation {

	private ArrayList<Mensch> menschen = new ArrayList<Mensch>();

	public void addMensch(Mensch mensch) {
		menschen.add(mensch);
	}

	public ArrayList<Mensch> getMenschen() {
		return menschen;
	}

	public static void main(String[] args) {
		Simulation simulationInstanz1 = new Simulation();
	}

	public Simulation() {
		MensaBereich zwischenBereich = new MensaBereich();
		System.out.println("Zwischenbereich wurde erstellt");
		MensaBereich essensAusgabe = new MensaBereich();
		System.out.println("Essensausgabe wurde erstellt");
		MensaBereich sitzBereich = new SitzBereich();
		System.out.println("SitzBereich wurde erstellt");
		System.out.println();

		LichtschrankenGruppe enteringZwischenBereich = new LichtschrankenGruppe("enteringZwischenBereich");
		System.out.println("Lichtschrankengruppe enteringZwischenBereich wurde erstellt");
		System.out.println("Lichtschranke 1 wurde erstellt");
		System.out.println("Lichtschranke 2 wurde erstellt");
		enteringZwischenBereich.getLichtschranke1().setPosition(0, 660, 390, 660);
		enteringZwischenBereich.getLichtschranke2().setPosition(0, 680, 390, 680);
		System.out.println();
		LichtschrankenGruppe enteringEssensAusgabe1 = new LichtschrankenGruppe("enteringEssensAusgabe1");
		System.out.println("Lichtschrankengruppe enteringEssensAusgabe1 wurde erstellt");
		System.out.println("Lichtschranke 1 wurde erstellt");
		System.out.println("Lichtschranke 2 wurde erstellt");
		enteringEssensAusgabe1.getLichtschranke1().setPosition(390, 700, 550, 700);
		enteringEssensAusgabe1.getLichtschranke2().setPosition(390, 720, 550, 720);
		System.out.println();
		LichtschrankenGruppe enteringEssensAusgabe2 = new LichtschrankenGruppe("enteringEssensAusgabe2");
		System.out.println("Lichtschrankengruppe enteringEssensAusgabe2 wurde erstellt");
		System.out.println("Lichtschranke 1 wurde erstellt");
		System.out.println("Lichtschranke 2 wurde erstellt");
		enteringEssensAusgabe2.getLichtschranke1().setPosition(840, 700, 1000, 700);
		enteringEssensAusgabe2.getLichtschranke2().setPosition(840, 720, 1000, 720);
		System.out.println();
		LichtschrankenGruppe enteringSitzBereich = new LichtschrankenGruppe("enteringSitzBereich");
		System.out.println("Lichtschrankengruppe enteringSitzBereich wurde erstellt");
		System.out.println("Lichtschranke 1 wurde erstellt");
		System.out.println("Lichtschranke 2 wurde erstellt");
		enteringSitzBereich.getLichtschranke1().setPosition(0, 440, 1000, 440);
		enteringSitzBereich.getLichtschranke2().setPosition(0, 460, 1000, 460);
		System.out.println();

		new Randomizer(zwischenBereich, essensAusgabe, sitzBereich, enteringZwischenBereich, enteringEssensAusgabe1,
				enteringEssensAusgabe2, enteringSitzBereich, this);

		System.out.println("simulations-ArrayList-laenge: " + menschen.size());

		GUI Gui1 = new GUI(this, enteringSitzBereich, enteringZwischenBereich, enteringEssensAusgabe1,
				enteringEssensAusgabe2, zwischenBereich, essensAusgabe, sitzBereich);

		/*
		 * for(Mensch e:menschen) { e.bewegen(zwischenBereich, essensAusgabe,
		 * sitzBereich, enteringZwischenBereich, enteringEssensAusgabe1,
		 * enteringEssensAusgabe2, enteringSitzBereich); }
		 */

		for (int i = 0; i < menschen.size()*75+2000; i++) {

			for (Mensch e : menschen) {
				if (menschen.indexOf(e)*75 > i) {
					e.waitAMoment();
				} else {
					e.grafikBewegen();
					if (e.getPosition("x") > enteringZwischenBereich.getLichtschranke1().getStartX()
							&& e.getPosition("x") < enteringZwischenBereich.getLichtschranke1().getEndX()
							&& e.getPosition("y") == enteringZwischenBereich.getLichtschranke1().getStartY()) {
						enteringZwischenBereich.lichtschranke1unterbrechen(zwischenBereich, essensAusgabe, sitzBereich);
					}

					if (e.getPosition("x") > enteringZwischenBereich.getLichtschranke2().getStartX()
							&& e.getPosition("x") < enteringZwischenBereich.getLichtschranke2().getEndX()
							&& e.getPosition("y") == enteringZwischenBereich.getLichtschranke2().getStartY()) {
						enteringZwischenBereich.lichtschranke2unterbrechen(zwischenBereich, essensAusgabe, sitzBereich);
					}
					
					if (e.getPosition("x") > enteringSitzBereich.getLichtschranke1().getStartX()
							&& e.getPosition("x") < enteringSitzBereich.getLichtschranke1().getEndX()
							&& e.getPosition("y") == enteringSitzBereich.getLichtschranke1().getStartY()) {
						enteringSitzBereich.lichtschranke1unterbrechen(zwischenBereich, essensAusgabe, sitzBereich);
					}

					if (e.getPosition("x") > enteringSitzBereich.getLichtschranke2().getStartX()
							&& e.getPosition("x") < enteringSitzBereich.getLichtschranke2().getEndX()
							&& e.getPosition("y") == enteringSitzBereich.getLichtschranke2().getStartY()) {
						enteringSitzBereich.lichtschranke2unterbrechen(zwischenBereich, essensAusgabe, sitzBereich);
					}
					
					if (e.getPosition("x") > enteringEssensAusgabe1.getLichtschranke1().getStartX()
							&& e.getPosition("x") < enteringEssensAusgabe1.getLichtschranke1().getEndX()
							&& e.getPosition("y") == enteringEssensAusgabe1.getLichtschranke1().getStartY()) {
						enteringEssensAusgabe1.lichtschranke1unterbrechen(zwischenBereich, essensAusgabe, sitzBereich);
					}

					if (e.getPosition("x") > enteringEssensAusgabe1.getLichtschranke2().getStartX()
							&& e.getPosition("x") < enteringEssensAusgabe1.getLichtschranke2().getEndX()
							&& e.getPosition("y") == enteringEssensAusgabe1.getLichtschranke2().getStartY()) {
						enteringEssensAusgabe1.lichtschranke2unterbrechen(zwischenBereich, essensAusgabe, sitzBereich);
					}
					
					if (e.getPosition("x") > enteringEssensAusgabe2.getLichtschranke1().getStartX()
							&& e.getPosition("x") < enteringEssensAusgabe2.getLichtschranke1().getEndX()
							&& e.getPosition("y") == enteringEssensAusgabe2.getLichtschranke1().getStartY()) {
						enteringEssensAusgabe2.lichtschranke1unterbrechen(zwischenBereich, essensAusgabe, sitzBereich);
					}

					if (e.getPosition("x") > enteringEssensAusgabe2.getLichtschranke2().getStartX()
							&& e.getPosition("x") < enteringEssensAusgabe2.getLichtschranke2().getEndX()
							&& e.getPosition("y") == enteringEssensAusgabe2.getLichtschranke2().getStartY()) {
						enteringEssensAusgabe2.lichtschranke2unterbrechen(zwischenBereich, essensAusgabe, sitzBereich);
					}
				}

			}
			Gui1.setMenschenListe(menschen);
			Gui1.frame.repaint();
			// System.out.println("Schleifen-Durchgang: " + i);
			// System.out.println(zwischenBereich.getAnzahlPersonen());
			try {
				Thread.sleep(5);
			} catch (Exception e) {
			}
		}

	}

}