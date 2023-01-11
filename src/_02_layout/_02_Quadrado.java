package _02_layout;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class _02_Quadrado extends Rectangle {

	private static int i = 0;

	private String[] cores = { "#c33c5e", "#39aac6", "#28d79a", "#fb750e", "#6657a8", "#f9060e" };

	public _02_Quadrado() {
		this(100);
	}

	public _02_Quadrado(int tamanho) {
		
		setWidth(tamanho);
		setHeight(tamanho);
		
		setFill(Color.web(cores[i]));
		
		i++;
		if(i == 6) i = 0;		
	}

//	public Caixa comTexto(String texto) {
//		Label label = new Label(texto);
//		getChildren().add(label);
//		return this;
//	}
}
