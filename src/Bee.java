import java.util.*;

public class Bee {
	private int vie;
	private int score;
	private int posx;
	private String nom;
	
	public Bee(String nom) {
		this.nom = nom;
		vie = 3;
		score = 0;
		posx = 5;
	}
	
	public void bouger() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez d ou q :");
		String str = sc.nextLine();
		System.out.println(str);
		if (str.equals("q")) {
			posx--;
			System.out.println("cou");
			return;
		} 
		if (str.compareTo("d") ==  0) {
			posx++;
			System.out.println("couc");
		}
	}
	
	public void nextStep() {
		this.bouger();
	}
	
	public boolean mourir() {
		if(vie == 0) {
			return true;
		}
		return false;
	}
	
	public void setVie(int v) {
		vie = vie + v;
	}
	
	public void setScore(int s) {
		score += s;
	}
	
	public int getPosx() {
		return posx;
	}
	
	
	public void deplacerBee(int direction) {
        // deuxieme possibiliter pour bouger la Bee
        switch(direction) {
             
        // Gauche
        case 1:
             
            this.posx++;
            break;
             
        // Droite
        case 2:
             
            this.posx--; 
            break;  
            default:
                 
                System.out.println("Ceci n'est pas une direction valide.");
        }

	}
}