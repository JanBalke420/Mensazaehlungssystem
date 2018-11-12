
public class Lichtschranke {
	private String identifikation;
	private int[] startPunkt = {0, 0};
	private int[] endPunkt = {0, 0};

	public Lichtschranke(String identifikation) {
		this.identifikation = identifikation;
	}
	
	public String unterbrechen() {
		return this.identifikation;
	}
	
	public void setPosition(int startX, int startY, int endX, int endY) {
		startPunkt[0] = startX;
		startPunkt[1] = startY;
		endPunkt[0] = endX;
		endPunkt[1] = endY;
	}
	
	public int getStartX() {
		return startPunkt[0];
	}
	
	public int getStartY() {
		return startPunkt[1];
	}
	
	public int getEndX() {
		return endPunkt[0];
	}
	
	public int getEndY() {
		return endPunkt[1];
	}

}
