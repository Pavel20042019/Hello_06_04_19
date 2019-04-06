package hello_06_04_19;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
public class Hello extends Application {
	public void start (Stage stage) {
		Label enter = new Label ("Enter your name:"), hello = new Label ();
		enter.setFont (new Font ("Arial", 20));
		enter.setTextFill (Color.BLACK);
		hello.setFont (new Font ("Arial", 20));
		hello.setTextFill (Color.BLACK);
		TextField name = new TextField ();
		name.setFont (new Font ("Arial", 20));
		name.setStyle ("-fx-text-inner-color: black;");
		Button say = new Button ("Say Hello"), exit = new Button ("Exit");
		say.setFont (new Font ("Arial", 20));
		say.setStyle ("-fx-text-inner-color: black;");
		exit.setFont (new Font ("Arial", 20));
		exit.setStyle ("-fx-text-inner-color: black;");
		say.setOnAction (new EventHandler <ActionEvent> () {
		    public void handle (ActionEvent e) {
		    	if (name.getText ().length () != 0)
		    		hello.setText ("Hello " + name.getText ());
		    	else
		    		hello.setText ("Hello there");
		    }
		});
		exit.setOnAction (new EventHandler <ActionEvent> () {
		    public void handle (ActionEvent e) {
		    	stage.close ();
		    }
		});
		VBox root = new VBox ();
		root.setStyle ("-fx-background-color: white;");
		root.getChildren ().addAll (enter, name, hello, say, exit);
		stage.setScene (new Scene (root, 500, 500));
		stage.show ();
	}
	public static void main (String [] args) {
		launch (args);
	}
}