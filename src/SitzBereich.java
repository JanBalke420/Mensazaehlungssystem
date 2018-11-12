
public class SitzBereich extends MensaBereich {
	private int sitzPlaetze;

	public SitzBereich() {
		this.sitzPlaetze = 100;
	}

	public void setSitzPlaetze(int sitzPlaetze) {
		this.sitzPlaetze = sitzPlaetze;
	}

	public int getSitzPlaetze() {
		return this.sitzPlaetze;
	}
}