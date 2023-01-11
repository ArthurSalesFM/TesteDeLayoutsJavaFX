package _02_layout;

import javafx.application.Platform;
import javafx.scene.layout.StackPane;

public class _07_TesteStackPane extends StackPane {

	public _07_TesteStackPane() {

		_02_Caixa c1 = new _02_Caixa().comTexto("1");
		_02_Caixa c2 = new _02_Caixa().comTexto("2");
		_02_Caixa c3 = new _02_Caixa().comTexto("3");
		_02_Caixa c4 = new _02_Caixa().comTexto("4");
		_02_Caixa c5 = new _02_Caixa().comTexto("5");
		_02_Caixa c6 = new _02_Caixa().comTexto("6");
		
		getChildren().addAll(c2,c3,c4,c5,c6,c1);
		
		//clicando na parte direita da tela, chama a proxima caixa
		//clicando na parte esquerda da tela, chama a caixa anterior		
		this.setOnMouseClicked(e ->{
			if(e.getSceneX() > getScene().getWidth()/2) {
				getChildren().get(0).toFront();
			}
			else {
				getChildren().get(5).toBack();
			}
		});
		
		//altera as caixas depois de um determinado tempo, mesmo sem o usuário clicar com o mouse na tela
		// utilizando threads do javaFX		
		Thread t = new Thread(() -> {
			
			while(true) {
				try {
					Thread.sleep(3000);
					
					//para execultar uma thread deve-se utilizar o Plataform.runLater();
					Platform.runLater(() -> {
						getChildren().get(0).toFront();
					});
					
				} catch (Exception e1) {
					System.out.println(e1.getMessage());
				}				
			}
		});
		
		// se fechar a aplicação, a thread deve morre tbm
		t.setDaemon(true);		
		t.start();
		
	}

}
