package _02_layout;

import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.TilePane;

public class _08_TesteTilePane extends TilePane {

	public _08_TesteTilePane() {

		List<_02_Quadrado> quadrados = new ArrayList<>();

		for (int i = 1; i < 10; i++) {
			quadrados.add(new _02_Quadrado(i * 10));
		}

		setPadding(new Insets(20, 10, 20, 10));
		
		// expassamento da borda vertical
		setVgap(10);
		setHgap(10);

		// orientação
		setOrientation(Orientation.VERTICAL);

		// expassamento da borda horizontal
		setTileAlignment(Pos.TOP_LEFT);

		getChildren().addAll(quadrados);
	}
}
