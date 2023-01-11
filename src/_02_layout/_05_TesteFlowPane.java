package _02_layout;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;

public class _05_TesteFlowPane extends FlowPane {

	public  _05_TesteFlowPane () {
		
		_02_Quadrado q1 = new _02_Quadrado();
		_02_Quadrado q2 = new _02_Quadrado();
		_02_Quadrado q3 = new _02_Quadrado();
		_02_Quadrado q4 = new _02_Quadrado();
		_02_Quadrado q5 = new _02_Quadrado();
	
		//espaço no eixo horizontal entre os elementos
		setHgap(10);
		
		setVgap(10);
		
		//espaçamento do layout interno
		setPadding(new Insets(10));
		
		//orientando os quadrados de forma vertical, um abaixo do outro
		setOrientation(Orientation.VERTICAL);
		
		//centralizando na parte direita da tela
		setAlignment(Pos.CENTER_RIGHT);
		
		getChildren().addAll(q1,q2,q3,q4,q5);
	}
}
