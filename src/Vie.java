
public class Vie extends Plante {
	private boolean bon;
	
	public Vie() {
		if(Math.random() < 0.3) {
			bon = true;
		} else {
			bon = false;
		}
	}
	
	public boolean getBon() {
		return bon;
	}
}
