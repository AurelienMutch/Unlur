import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;

public class Affichage {

	public Scene scene;
	
	public Affichage(Scene s) {
		this.scene = s;
	}
	
	public Scene getS(){
		return this.scene;
	}
	
	
	public void Menu(){
		
	       String[] Levels = {"1 Joueur","2 Joueurs","En Ligne", "Aide", "Credits", "Quitter"};
	       HBox hbTitle = new HBox();
	       Label title1 = new Label("UNLUR");
	       HBox hbBot = new HBox();
	       GridPane gridSound = new GridPane();
	       BorderPane br = new BorderPane();
	       GridPane Menus = new GridPane();
	       VBox vb = new VBox();
	       VBox vb2= new VBox();
           HBox hb = new HBox();
           HBox hb2 = new HBox();
	       HBox hb3 = new HBox();
	       Button sound = new Button();
	       Button sfx = new Button();
           Label lab = new Label("          ");
           Label lab2 = new Label("          ");
           Label lab3 = new Label("          ");
           
	       for(int i=0;i < Levels.length; i++) {
	           int level = i;
	           GridPane SubMenu = new GridPane();
	           Button SubButton = new Button(Levels[i]);
	          /* SubButton.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
	               @Override
	               public void handle(MouseEvent e) {

	                   type_joueur2 = level;

	                   scene_type =1;

	                   afficheStage();

	               }});*/
	           SubMenu.add(SubButton,4,6);
	           if (i < 2) {
	        	   hb.getChildren().add(SubButton);
	           } else {
	        	   Menus.add(SubMenu,0,i,2,1);   
	           }
		   SubButton.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
	               @Override
	               public void handle(MouseEvent e) {
	                   if (SubButton.getText() == "Quitter") {
	                	   System.exit(0);
	                   }
	               }});    
	       }
	       
	       Menus.setVgap(10);
	       hbTitle.getChildren().add(title1);
	       hbTitle.setAlignment(Pos.CENTER);
	       gridSound.add(sfx, 0,0);
	       gridSound.add(sound, 1, 0);
	       gridSound.setAlignment(Pos.BOTTOM_RIGHT);
	       hb.setSpacing(10);
	       hb2.getChildren().add(lab);
	       hb3.getChildren().add(lab2);
	       hb3.getChildren().add(Menus);
	       hb3.getChildren().add(lab3);
	       vb2.setSpacing(10);
	       vb2.getChildren().add(hb2);
	       vb2.getChildren().add(hb);
	       vb.getChildren().add(vb2);
	       vb.getChildren().add(hb3);
	       HBox hbcore = new HBox();
	       hbcore.getChildren().add(vb);
	       hbcore.setAlignment(Pos.CENTER);
	       br.setTop(hbTitle);
	       br.setCenter(hbcore);
	       br.setBottom(gridSound);
	       
	       this.scene = new Scene(br, 400, 300);
	       
	}
	
	
	public void Credit(){
			
	}
	
	public void Tuto(){
		
	}
	
	
	public void ConfigJcJ(){
		
	}
	
	
	public void ConfigJcC(){
		
	}
	
	public void JeuPhase1(){
		
	}
	
	public void JeuPhase2(){
		
	}
	
	
	
}
