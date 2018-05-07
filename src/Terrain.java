package unlur;

import java.util.ArrayList;

public class Terrain {

	int taille;
	Case [][][] terrain;	
	//Config du tableau : de 0 à t-1 les coord pos
	//					  de t+1 à 2*t les coord négatifs 
	// Example: pour t=4 on a terrain[1][3][-2] -> terrain[1][3][-2]
	
	public Terrain(int t) {
		int x,y,z;
		this.taille = t;
		terrain = new Case[2*t][2*t][2*t];
		for(int i=0;i<2*t;i++) {
			for(int j=0;j<2*t;j++) {
				for(int k=0;k<2*t;k++) {
					if(i!=t && j!=t && k!=t) {
						x= coordCube(i);
						y= coordCube(j);
						z= coordCube(k);
						if(x+y+z==0) {
							//System.out.print(x+","+y+","+z);
							//System.out.println("    "+i+","+j+","+k);
							terrain[i][j][k]= new Case(x,y,z);
						}else {
							terrain[i][j][k]=new Case();
						}
					}else {
						terrain[i][j][k]=new Case();
					}
				}
			}
		}
	}
	
	public ArrayList <Case> getVoisins(int x, int y, int z) {
		ArrayList<Case>voisins = new ArrayList<Case>();
		if(coordPos(x)>0) {
			if(terrain[coordPos(x-1)][coordPos(y)][coordPos(z+1)].getCouleur()!=-1) {
				voisins.add(terrain[coordPos(x-1)][coordPos(y)][coordPos(z+1)]);
			}
			if(terrain[coordPos(x-1)][coordPos(y+1)][coordPos(z)].getCouleur()!=-1) {
				voisins.add(terrain[coordPos(x-1)][coordPos(y+1)][coordPos(z)]);
			}
		}
		if(coordPos(y)>0) {
			if(terrain[coordPos(x)][coordPos(y-1)][coordPos(z+1)].getCouleur()!=-1) {
				voisins.add(terrain[coordPos(x)][coordPos(y-1)][coordPos(z+1)]);
			}
			if(terrain[coordPos(x+1)][coordPos(y-1)][coordPos(z)].getCouleur()!=-1) {
				voisins.add(terrain[coordPos(x+1)][coordPos(y-1)][coordPos(z)]);
			}
		}
		if(coordPos(z)>0) {
			if(terrain[coordPos(x)][coordPos(y)+1][coordPos(z)-1].getCouleur()==1) {
				voisins.add(terrain[coordPos(x)][coordPos(y)+1][coordPos(z)-1]);
			}
			if(terrain[coordPos(x+1)][coordPos(y)][coordPos(z-1)].getCouleur()!=-1) {
				voisins.add(terrain[coordPos(x+1)][coordPos(y)][coordPos(z-1)]);
			}			
		}
		return voisins;
	}
	
	public ArrayList <Case> getVoisinsCouleur(int x, int y, int z, int couleur) {
		ArrayList<Case>voisins = new ArrayList<Case>();
		if(coordPos(x)>0) {
			if(terrain[coordPos(x-1)][coordPos(y)][coordPos(z+1)].getCouleur()==couleur) {
				voisins.add(terrain[coordPos(x-1)][coordPos(y)][coordPos(z+1)]);
			}
			if(terrain[coordPos(x-1)][coordPos(y+1)][coordPos(z)].getCouleur()==couleur) {
				voisins.add(terrain[coordPos(x-1)][coordPos(y+1)][coordPos(z)]);
			}
		}
		if(coordPos(y)>0) {
			if(terrain[coordPos(x)][coordPos(y-1)][coordPos(z+1)].getCouleur()==couleur) {
				voisins.add(terrain[coordPos(x)][coordPos(y-1)][coordPos(z+1)]);
			}
			if(terrain[coordPos(x+1)][coordPos(y-1)][coordPos(z)].getCouleur()==couleur) {
				voisins.add(terrain[coordPos(x+1)][coordPos(y-1)][coordPos(z)]);
			}
		}
		if(coordPos(z)>0) {
			if(terrain[coordPos(x)][coordPos(y)+1][coordPos(z)-1].getCouleur()==couleur) {
				voisins.add(terrain[coordPos(x)][coordPos(y)+1][coordPos(z)-1]);
			}
			if(terrain[coordPos(x+1)][coordPos(y)][coordPos(z-1)].getCouleur()==couleur) {
				voisins.add(terrain[coordPos(x+1)][coordPos(y)][coordPos(z-1)]);
			}			
		}
		return voisins;
	}
	
	public int coordCube(int c) {
		if(c>taille) {
			return taille-c;
		}else {
			return c;
		}
	}
	public int coordPos(int c) {
		if(c<0) {
			return taille-c;
		}else {
			return c;
		}
	}
	
}
