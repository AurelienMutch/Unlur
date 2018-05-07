import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;


public class Main extends Application {
	
	////
	// les variables pour selectionner les fenetres et les affichers
	////
	private static Stage MainStage;
	public int scene_type = 0;
	
	
	////
	// les variables 
	////
	public String nom_joueur1="Franky";
	public String nom_joueur2="Vincent";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	
	
	
	  public void start(Stage primaryStage) throws Exception{
		  MainStage = primaryStage;
		  
		  
		  afficheStage();
		  
	  }
	  
	  public void afficheStage()
	   {
	       //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
	      
				  
	       Scene scenee = null;

		   Affichage affichage = new Affichage(scenee);

					  
	       switch(scene_type) {
	           case 0:
	        	   MainStage.setTitle("Menu");
	        	   affichage.Menu();
	               break;
	           case 1:
	        	   MainStage.setTitle("Credit");
	               affichage.Credit();
	               break;
	           case 2:
	        	   MainStage.setTitle("Tuto");
	        	   affichage.Tuto();
	        	   break;
	           case 3:
	        	   MainStage.setTitle("Configuration de Partie");
	        	   affichage.ConfigJcJ();
	        	   break;
	           case 4:
	        	   MainStage.setTitle("Configuration de Partie");
	        	   affichage.ConfigJcC();
	        	   break;
	           case 5:
	        	   MainStage.setTitle("Jeu Phase 1");
	        	   affichage.JeuPhase1();
	        	   break;
	           case 6:
	        	   MainStage.setTitle("Jeu pahse 2");
	        	   affichage.JeuPhase2();
	        	   break;
	       }
	       

	       MainStage.setScene(affichage.getS());
	       MainStage.show();
	   }
	  
	  
	  

}
