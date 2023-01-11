package _02_layout;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class _06_TesteGridPane extends GridPane {

	public _06_TesteGridPane() {

		_02_Caixa c1 = new _02_Caixa().comTexto("1");
		_02_Caixa c2 = new _02_Caixa().comTexto("2");
		_02_Caixa c3 = new _02_Caixa().comTexto("3");
		_02_Caixa c4 = new _02_Caixa().comTexto("4");
		_02_Caixa c5 = new _02_Caixa().comTexto("5");
		_02_Caixa c6 = new _02_Caixa().comTexto("6");

		setGridLinesVisible(true);

		// adicionando as COnstrains
		getColumnConstraints().addAll(getColumnConst(), getColumnConst(), getFixoColumnConst(), getColumnConst(),
				getColumnConst());

		getRowConstraints().addAll(getRowConst(), getFixoRowConst(), getRowConst(), getRowConst(), getRowConst());

		setVgap(10);
		setHgap(10);

		// Adicionando a caixa ao grid, passando o objeto caixa,
		// a coluna e linha add(Objeto, Coluna, Linha);
		// para a caixa ocupar mais uma posição, passa-se os outros parametros
		// add(Objeto, Coluna, Linha, Quantas Colunas, Quantas Linhas)
		add(c1, 0, 0, 5, 5);
		add(c5, 0, 1, 1, 3);
		add(c2, 4, 1, 1, 1);
		add(c3, 4, 2, 1, 1);
		add(c4, 4, 3, 1, 1);
		add(c6, 0, 4, 5, 1);

	}

	private ColumnConstraints getColumnConst() {
		ColumnConstraints cc = new ColumnConstraints();
		cc.setPercentWidth(20);
		cc.setFillWidth(true);
		return cc;
	}

	private ColumnConstraints getFixoColumnConst() {
		ColumnConstraints cc = new ColumnConstraints();
		cc.setMinWidth(50);
		cc.setMaxWidth(50);
		cc.setFillWidth(true);
		return cc;
	}

	private RowConstraints getRowConst() {
		RowConstraints rc = new RowConstraints();
		rc.setPercentHeight(20);
		rc.setFillHeight(true);
		return rc;
	}

	private RowConstraints getFixoRowConst() {
		RowConstraints frc = new RowConstraints();
		frc.setMinHeight(50);
		frc.setMaxHeight(50);
		frc.setFillHeight(true);
		return frc;
	}
}
