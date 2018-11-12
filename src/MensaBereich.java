public class MensaBereich {
	private int anzahlPersonen;

	public MensaBereich() {
		// TODO Auto-generated constructor stub
	}

	public void setAnzahlPersonen(String richtung) {

	}
	
	public void increaseAnzahlPersonen(){
		this.anzahlPersonen++;
	}
	
	public void decreaseAnzahlPersonen(){
		this.anzahlPersonen--;
	}

	public int getAnzahlPersonen() {
		return this.anzahlPersonen;
	}
	
	public String getAnzahlPersonenString() {
		return Integer.toString(this.anzahlPersonen);
	}
}