package unlur;

import java.util.ArrayList;

public class Terrain {

	int taille;
	Case [][][] terrain;
	
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
	
	public ArrayList <Case> getVoisins(Case c) {
		ArrayList<Case>voisins = new ArrayList<Case>();
		if(terrain[c.getX()][c.getY()+1][c.getZ()-1]!=null) {
			voisins.add(terrain[c.getX()][c.getY()-1][c.getZ()-1]);
		}
		if(terrain[c.getX()][c.getY()-1][c.getZ()+1]!=null) {
			voisins.add(terrain[c.getX()][c.getY()-1][c.getZ()-1]);
		}
		if(terrain[c.getX()+1][c.getY()-1][c.getZ()+1]!=null) {
			voisins.add(terrain[c.getX()][c.getY()-1][c.getZ()-1]);
		}
		if(terrain[c.getX()+1][c.getY()][c.getZ()-1]!=null) {
			voisins.add(terrain[c.getX()][c.getY()-1][c.getZ()-1]);
		}
		if(terrain[c.getX()-1][c.getY()+1][c.getZ()]!=null) {
			voisins.add(terrain[c.getX()][c.getY()-1][c.getZ()-1]);
		}
		if(terrain[c.getX()+1][c.getY()-1][c.getZ()]!=null) {
			voisins.add(terrain[c.getX()][c.getY()-1][c.getZ()-1]);
		}
		return voisins;
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
			System.out.println(coordPos(x)+","+coordPos(y)+","+coordPos(z));
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
		for (int i =0;i<voisins.size()-1;i++) {
			System.out.println(voisins.get(i).getX()+","+voisins.get(i).getY()+","+voisins.get(i).getZ());
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
