
public class Score extends Plante {
	private boolean bon;
	private int val;
	
	public Score() {
		if(Math.random() < 0.2) {
			val = 2;
		} else {
			val = 1;
		}
		if(Math.random() < 0.7) {
			bon = true;
		} else {
			bon = false;
		}
	}
	
	public boolean getBon() {
		return bon;
	}
	
	public int getVal() {
		return val;
	}
}
