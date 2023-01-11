package _02_layout;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class _01_MainLayouts extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Parent raiz = null;
		
		/*
		 * Para testar cada um das layouts, descomente cada raiz = new *** para visualizar.
		 * 
		 */
		
		raiz = new _03_TesteAnchorPane();
		//raiz = new _03_TesteBorderPane();
		//raiz = new _04_TesteFlowPane();
		//raiz = new _05_TesteGridPane();
		//raiz = new _06_TesteStackPane();
		//raiz = new _07_TesteTilePane();
		
		//Scene principal = new Scene(new _02_TesteAnchorPane(), 800, 600);
		Scene principal = new Scene(raiz, 800, 600);
		
		primaryStage.setScene(principal);
		
		primaryStage.setTitle("Gerenciador de Layout");

		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
