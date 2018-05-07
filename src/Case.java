public class Case {

	
	private int couleur;
	/* Couleur :    -1 -> case hors plateau
	 * 				0 -> case vide
	 *				1 -> case noir 
	 *				2 -> case blanche
	 */
	private int x;
	private int y;
	private int z;
	
	public Case(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.couleur = 0;
	}
	public Case() {
		this.x = -1;
		this.y = -1;
		this.z = -1;
		this.couleur = -1;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}

	public int getCouleur() {
		return couleur;
	}

	public void setCouleurNoir() {
		this.couleur = 1;
	}
	public void setCouleurBlanc() {
		this.couleur = 2;
	}
	
	
}
