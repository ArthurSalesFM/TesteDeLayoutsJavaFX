package _02_layout;

import javafx.geometry.Pos;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class _03_TesteAnchorPane extends AnchorPane{

	public _03_TesteAnchorPane() {
		
		_02_Quadrado q1 = new _02_Quadrado();
		setTopAnchor(q1, 10.0);
		setLeftAnchor(q1, 10.0);
		
		_02_Quadrado q2 = new _02_Quadrado();
		//setando a posição
		setTopAnchor(q2, 10.0);
		setRightAnchor(q2, 10.0);
		
		_02_Quadrado q3 = new _02_Quadrado();
		setBottomAnchor(q3, 10.0);
		setLeftAnchor(q3, 10.0);
		
		_02_Quadrado q4 = new _02_Quadrado();
		setBottomAnchor(q4, 10.0);
		setRightAnchor(q4, 10.0);
				
		HBox centro = new HBox();
		centro.setAlignment(Pos.CENTER);
		setTopAnchor(centro, 110.0);
		setBottomAnchor(centro, 110.0);
		setLeftAnchor(centro, 110.0);
		setRightAnchor(centro, 110.0);
		
		_02_Quadrado q5 = new _02_Quadrado();
		
		centro.getChildren().add(q5);
		
		getChildren().addAll(q1,q2,q3,q4,centro);
	}
}
