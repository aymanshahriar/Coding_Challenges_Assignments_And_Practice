import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class GUIDemo extends Application{
	
	Scene scene1;
	Scene scene2;


	public static void main(String[] args) {
		launch(args);
	}


	public void start(Stage primaryStage) {
		Label label1 = new Label("This is the first scene");
		Button button1 = new Button("click to go to second scene");
		button1.setOnAction(e -> primaryStage.setScene(scene2));

		VBox layout1 = new VBox(20);
		layout1.getChildren().addAll(label1, button1);
		scene1 = new Scene(layout1, 200, 200);

		
		Label label2 = new Label("This is the second scene");
		Button button2 = new Button("click to go to the first scene");
		button2.setOnAction(e -> primaryStage.setScene(scene1));
		
		VBox layout2 = new VBox(20);
		layout2.getChildren().addAll(label2, button2);
		scene2 = new Scene(layout2, 600, 300);

		
		primaryStage.setScene(scene1);
		primaryStage.show();		


	
	}










}
