import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		Terrain t = new Terrain(3);
		ArrayList<Case> oui = t.getVoisins(1,-1,0);
		for (int i =0;i<oui.size();i++) {
			System.out.println(oui.get(i).getX()+","+oui.get(i).getY()+","+oui.get(i).getZ());
		}
	}
}
