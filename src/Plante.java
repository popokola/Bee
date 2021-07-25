
public class Plante {
	private boolean existe;
	private boolean vie;
	
	public Plante() {
		if(Math.random() < 0.4) {
			existe = true;
			System.out.println(existe);
			if(Math.random() < 0.1) {
				vie = true;
				System.out.println("vie1");
				System.out.println(vie);
			} else {
				vie = false;
				System.out.println("vie2");
				System.out.println(vie);
			}
		} else {
			existe = false;
			System.out.println("existe");
			System.out.println(existe);
		}
	}
	
	public boolean getExiste() {
		return existe;
	}
	
	public boolean getVie() {
		return vie;
	}

}

