import java.util.Random;
import java.util.ArrayList;

public class Randomizer {
	public Randomizer(MensaBereich zwischenBereich,
						MensaBereich essensAusgabe,
						MensaBereich sitzBereich,
						LichtschrankenGruppe enteringZwischenBereich,
						LichtschrankenGruppe enteringEssensAusgabe1,
						LichtschrankenGruppe enteringEssensAusgabe2,
						LichtschrankenGruppe enteringSitzBereich,
						Simulation simulationsInstanz1) {
		int anzahlPersonen = (int) (Math.random() * 5 + 30);
		System.out.println("Zufallszahl: " + anzahlPersonen);

		int kaffe = 0;
		int snack = 0;
		int seat = 0;

		int x = 1;
		while (x <= anzahlPersonen) {
			int verhalten = (int) (Math.random() * 3);

			Mensch human = null;

			if (verhalten == 0) {
				human = new CoffeeToGo();
				kaffe++;
			}
			if (verhalten == 1) {
				human = new SnackToGo();
				snack++;
			}
			if (verhalten == 2) {
				human = new Seating();
				seat++;
			}
			simulationsInstanz1.addMensch(human);
			x++;
		}
		// System.out.println("ArrayList-laenge: " + menschen.size());
		System.out.println("CoffeeToGo: " + kaffe);
		System.out.println("SnackToGo: " + snack);
		System.out.println("Seating: " + seat);

		/*
		 * for(Mensch e:menschen) { e.bewegen(zwischenBereich, essensAusgabe,
		 * sitzBereich, enteringZwischenBereich, enteringEssensAusgabe1,
		 * enteringEssensAusgabe2, enteringSitzBereich); }
		 */
	}
}