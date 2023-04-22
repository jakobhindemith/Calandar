package kalender;



import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

//This class is thre to create the GUI and load the FXML file and set the scene

public class KalenderGUI extends Application {
	
	
	public void start(Stage primaryStage) {
		try {
		
		//laedt die FXML datei 
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(KalenderGUI.class.getResource("MainWindow.fxml"));
		AnchorPane anchor;
		anchor = loader.load();
		
		
	//Scene erstellen
	Scene scene = new Scene(anchor);
	
	//Stage anpassen
	primaryStage.centerOnScreen();
	//primaryStage.setFullScreen(true);
    primaryStage.setScene(scene);
    primaryStage.show();
	
		} catch (IOException e) {
		// TODO Auto-generated catch block
			System.out.println("fehler");
		e.printStackTrace();
	}
		
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launch();
	}
	
}
