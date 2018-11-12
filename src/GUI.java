import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Line2D;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {

	ArrayList<Mensch> menschen;
	JFrame frame;
	LichtschrankenGruppe enteringSitzBereich;
	LichtschrankenGruppe enteringZwischenBereich;
	LichtschrankenGruppe enteringEssensAusgabe1;
	LichtschrankenGruppe enteringEssensAusgabe2;
	MensaBereich zwischenBereich;
	MensaBereich essensAusgabe;
	MensaBereich sitzBereich;

	public GUI(Simulation simulationInstanz1, LichtschrankenGruppe enteringSitzBereich,
			LichtschrankenGruppe enteringZwischenBereich, LichtschrankenGruppe enteringEssensAusgabe1,
			LichtschrankenGruppe enteringEssensAusgabe2, MensaBereich zwischenBereich, MensaBereich essensAusgabe,
			MensaBereich sitzBereich) {
		this.enteringSitzBereich = enteringSitzBereich;
		this.enteringZwischenBereich = enteringZwischenBereich;
		this.enteringEssensAusgabe1 = enteringEssensAusgabe1;
		this.enteringEssensAusgabe2 = enteringEssensAusgabe2;
		this.zwischenBereich = zwischenBereich;
		this.essensAusgabe = essensAusgabe;
		this.sitzBereich = sitzBereich;
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MeinZeichenPanel zeichenPanel = new MeinZeichenPanel();

		frame.getContentPane().add(zeichenPanel);
		frame.setSize(1024, 1024);
		frame.setVisible(true);
	}

	public void setMenschenListe(ArrayList<Mensch> menschenListe) {
		menschen = menschenListe;
	}

	public void drawGrid(Graphics2D g2) {
		Line2D line00a = new Line2D.Double(0, 100, 1000, 100);
		Line2D line01 = new Line2D.Double(0, 200, 1000, 200);
		Line2D line02 = new Line2D.Double(0, 300, 1000, 300);
		Line2D line03 = new Line2D.Double(0, 400, 1000, 400);
		Line2D line04 = new Line2D.Double(0, 500, 1000, 500);
		Line2D line05 = new Line2D.Double(0, 600, 1000, 600);
		Line2D line06 = new Line2D.Double(0, 700, 1000, 700);
		Line2D line07 = new Line2D.Double(0, 800, 1000, 800);
		Line2D line08 = new Line2D.Double(0, 900, 1000, 900);
		Line2D line09 = new Line2D.Double(0, 1000, 1000, 1000);

		Line2D line00b = new Line2D.Double(100, 0, 100, 1000);
		Line2D line10 = new Line2D.Double(200, 0, 200, 1000);
		Line2D line20 = new Line2D.Double(300, 0, 300, 1000);
		Line2D line30 = new Line2D.Double(400, 0, 400, 1000);
		Line2D line40 = new Line2D.Double(500, 0, 500, 1000);
		Line2D line50 = new Line2D.Double(600, 0, 600, 1000);
		Line2D line60 = new Line2D.Double(700, 0, 700, 1000);
		Line2D line70 = new Line2D.Double(800, 0, 800, 1000);
		Line2D line80 = new Line2D.Double(900, 0, 900, 1000);
		Line2D line90 = new Line2D.Double(1000, 0, 1000, 1000);

		g2.setStroke(new BasicStroke(1));

		g2.draw(line00a);
		g2.draw(line01);
		g2.draw(line02);
		g2.draw(line03);
		g2.draw(line04);
		g2.draw(line05);
		g2.draw(line06);
		g2.draw(line07);
		g2.draw(line08);
		g2.draw(line09);

		g2.draw(line00b);
		g2.draw(line10);
		g2.draw(line20);
		g2.draw(line30);
		g2.draw(line40);
		g2.draw(line50);
		g2.draw(line60);
		g2.draw(line70);
		g2.draw(line80);
		g2.draw(line90);
	}

	public void drawLichtschranken(Graphics2D g2) {
		g2.setStroke(new BasicStroke(5));
		Line2D enteringSitzBereichSchranke1 = new Line2D.Double(enteringSitzBereich.getLichtschranke1().getStartX(),
				enteringSitzBereich.getLichtschranke1().getStartY(), enteringSitzBereich.getLichtschranke1().getEndX(),
				enteringSitzBereich.getLichtschranke1().getEndY());
		Line2D enteringSitzBereichSchranke2 = new Line2D.Double(enteringSitzBereich.getLichtschranke2().getStartX(),
				enteringSitzBereich.getLichtschranke2().getStartY(), enteringSitzBereich.getLichtschranke2().getEndX(),
				enteringSitzBereich.getLichtschranke2().getEndY());
		Line2D enteringZwischenBereichSchranke1 = new Line2D.Double(
				enteringZwischenBereich.getLichtschranke1().getStartX(),
				enteringZwischenBereich.getLichtschranke1().getStartY(),
				enteringZwischenBereich.getLichtschranke1().getEndX(),
				enteringZwischenBereich.getLichtschranke1().getEndY());
		Line2D enteringZwischenBereichSchranke2 = new Line2D.Double(
				enteringZwischenBereich.getLichtschranke2().getStartX(),
				enteringZwischenBereich.getLichtschranke2().getStartY(),
				enteringZwischenBereich.getLichtschranke2().getEndX(),
				enteringZwischenBereich.getLichtschranke2().getEndY());
		Line2D enteringEssensAusgabe1Schranke1 = new Line2D.Double(
				enteringEssensAusgabe1.getLichtschranke1().getStartX(),
				enteringEssensAusgabe1.getLichtschranke1().getStartY(),
				enteringEssensAusgabe1.getLichtschranke1().getEndX(),
				enteringEssensAusgabe1.getLichtschranke1().getEndY());
		Line2D enteringEssensAusgabe1Schranke2 = new Line2D.Double(
				enteringEssensAusgabe1.getLichtschranke2().getStartX(),
				enteringEssensAusgabe1.getLichtschranke2().getStartY(),
				enteringEssensAusgabe1.getLichtschranke2().getEndX(),
				enteringEssensAusgabe1.getLichtschranke2().getEndY());
		Line2D enteringEssensAusgabe2Schranke1 = new Line2D.Double(
				enteringEssensAusgabe2.getLichtschranke1().getStartX(),
				enteringEssensAusgabe2.getLichtschranke1().getStartY(),
				enteringEssensAusgabe2.getLichtschranke1().getEndX(),
				enteringEssensAusgabe2.getLichtschranke1().getEndY());
		Line2D enteringEssensAusgabe2Schranke2 = new Line2D.Double(
				enteringEssensAusgabe2.getLichtschranke2().getStartX(),
				enteringEssensAusgabe2.getLichtschranke2().getStartY(),
				enteringEssensAusgabe2.getLichtschranke2().getEndX(),
				enteringEssensAusgabe2.getLichtschranke2().getEndY());

		g2.draw(enteringSitzBereichSchranke1);
		g2.draw(enteringSitzBereichSchranke2);
		g2.draw(enteringZwischenBereichSchranke1);
		g2.draw(enteringZwischenBereichSchranke2);
		g2.draw(enteringEssensAusgabe1Schranke1);
		g2.draw(enteringEssensAusgabe1Schranke2);
		g2.draw(enteringEssensAusgabe2Schranke1);
		g2.draw(enteringEssensAusgabe2Schranke2);
	}

	public void drawMenschenAnzahlen(Graphics2D g2) {
		SitzBereich finalSitzBereich = (SitzBereich) (sitzBereich);
		g2.drawString("Personen im Sitzbereich: " + sitzBereich.getAnzahlPersonenString(),25, 50);
		g2.drawString("Personen im Zwischenbereich: " + zwischenBereich.getAnzahlPersonenString(), 25, 75);
		g2.drawString("Personen in der Essensausgabe: " + essensAusgabe.getAnzahlPersonenString(), 25, 100);
		g2.drawString("Freie Sitzplaetze: " + (finalSitzBereich.getSitzPlaetze() - sitzBereich.getAnzahlPersonen()), 25, 150);
	}

	class MeinZeichenPanel extends JPanel {
		Image mensaImage = new ImageIcon("mensaBlank.jpg").getImage();

		public void paintComponent(Graphics g) {
			g.drawImage(mensaImage, 0, 0, this);

			for (Mensch e : menschen) {
				g.setColor(e.getFarbe());
				g.fillOval(e.getPosition("x"), e.getPosition("y"), 50, 50);
			}
			Graphics2D g2 = (Graphics2D) g;

			g.setColor(Color.black);
			//drawGrid(g2);

			g.setColor(Color.red);
			drawLichtschranken(g2);

			Font stringFont = new Font("Arial", Font.PLAIN, 20);
			g.setFont(stringFont);

			g.setColor(Color.black);
			drawMenschenAnzahlen(g2);
		}
	}
}
