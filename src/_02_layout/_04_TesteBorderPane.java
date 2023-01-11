package _02_layout;

import javafx.scene.layout.BorderPane;

public class _04_TesteBorderPane extends BorderPane {
	
	
	public _04_TesteBorderPane() {
		_02_Caixa c1 = new _02_Caixa().comTexto("Topo");
		setTop(c1);
		
		_02_Caixa c2 = new _02_Caixa().comTexto("Esquerda");
		setLeft(c2);
		
		_02_Caixa c3 = new _02_Caixa().comTexto("Diretia");
		setRight(c3);
		
		_02_Caixa c4 = new _02_Caixa().comTexto("Fundo");
		setBottom(c4);
		
		_02_Caixa c5 = new _02_Caixa().comTexto("Área Central");
		setCenter(c5);
	}
}
