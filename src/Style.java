import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class Style {
	
	public void style(BorderPane borderPane, GridPane gridPane, Label titles[], Button buttons[][], Label currentPlayer) {
		gridPane.add(titles[0], 0, 0);
		gridPane.add(titles[1], 1, 0);
		gridPane.add(titles[2], 2, 0);
		gridPane.add(buttons[0][0], 0, 1);
		gridPane.add(buttons[0][1], 1, 1);
		gridPane.add(buttons[0][2], 2, 1);
		gridPane.add(buttons[1][0], 0, 2);
		gridPane.add(buttons[1][1], 1, 2);
		gridPane.add(buttons[1][2], 2, 2);
		gridPane.add(buttons[2][0], 0, 3);
		gridPane.add(buttons[2][1], 1, 3);
		gridPane.add(buttons[2][2], 2, 3);
		gridPane.add(currentPlayer, 0, 4, 3, 1);
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		titles[0].setStyle("-fx-font-size: 30px");
		titles[1].setStyle("-fx-font-size: 30px");
		titles[2].setStyle("-fx-font-size: 30px");
		buttons[0][0].setStyle(
				"-fx-font-size: 20px;"
				+ "-fx-min-width: 100px;"
				+ "-fx-min-height:100px");
		buttons[0][1].setStyle(
				"-fx-font-size: 20px;"
				+ "-fx-min-width: 100px;"
				+ "-fx-min-height:100px");
		buttons[0][2].setStyle(
				"-fx-font-size: 20px;"
				+ "-fx-min-width: 100px;"
				+ "-fx-min-height:100px");
		buttons[1][0].setStyle(
				"-fx-font-size: 20px;"
				+ "-fx-min-width: 100px;"
				+ "-fx-min-height:100px");
		buttons[1][1].setStyle(
				"-fx-font-size: 20px;"
				+ "-fx-min-width: 100px;"
				+ "-fx-min-height:100px");
		buttons[1][2].setStyle(
				"-fx-font-size: 20px;"
				+ "-fx-min-width: 100px;"
				+ "-fx-min-height:100px");
		buttons[2][0].setStyle(
				"-fx-font-size: 20px;"
				+ "-fx-min-width: 100px;"
				+ "-fx-min-height:100px");
		buttons[2][1].setStyle(
				"-fx-font-size: 20px;"
				+ "-fx-min-width: 100px;"
				+ "-fx-min-height:100px");
		buttons[2][2].setStyle(
				"-fx-font-size: 20px;"
				+ "-fx-min-width: 100px;"
				+ "-fx-min-height:100px");
		currentPlayer.setStyle(
				"-fx-font-size: 25px;");
		GridPane.setHalignment(titles[0], HPos.CENTER);
		GridPane.setHalignment(titles[1], HPos.CENTER);
		GridPane.setHalignment(titles[2], HPos.CENTER);
		GridPane.setHalignment(currentPlayer, HPos.CENTER);
		borderPane.setCenter(gridPane);
		gridPane.setAlignment(Pos.CENTER);
	}
}
