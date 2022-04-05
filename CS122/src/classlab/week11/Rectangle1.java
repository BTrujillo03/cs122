package classlab.week11;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Rectangle1 extends Application  {
	Rectangle[] rectangles;
	Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW }
	
	public void start( Stage primarystage) throws Exception {
		rectangles = new Rectanlge [5];
		for (int i=0;i<5;i++) {
			rectangles[i] = new Rectangle(r.nextInt(500) + 10, r.nextInt(500) + 10, r.nextInt (91)+10) {
				rectangles[i].setFill(Color.White);

			}
			Button change - new Button( "Change color");
			change.setOnAction(this::processChangeColor);
			
	
		Group root = new Group();
		for(Rectangle x: rectangles) {
			root.getChildren().add(x);
		}
		root.getChildren().add(change);
		Scene scene = new Scene (root, 600, 600, Color.BEIGE);
		
		primaryStage.setTitle ("Random Rectangles");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
		
		public static void processChangeColor(ActionEvent e) {
			Random r = new Random();
			Color newColor= colors[r.nextInt(4)] ;
			for(Rectangle x: rectangles) {
				x.setfill(newColor);
		}
			
		}
	public static void main (String[] args) {
		launch(args);
		
		
	
	
		}

}
