import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Event {
	
	public void eventTrigger(Button[][] button, int row, int column, String[] playerLetters, Label currentPlayer, int[] moveList) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				int rowIndex = i;
				int columnIndex = j;
				button[rowIndex][columnIndex].setOnAction(handleButtonClick -> {
					if(moveList[0] % 2 == 0) {
						button[rowIndex][columnIndex].setText(playerLetters[0]);
						button[rowIndex][columnIndex].setDisable(true);
						moveList[0]++;
						currentPlayer.setText("Current Player = " + playerLetters[1]);
					}else if(moveList[0] % 2 == 1) {
						button[rowIndex][columnIndex].setText(playerLetters[1]);
						button[rowIndex][columnIndex].setDisable(true);
						moveList[0]++;
						currentPlayer.setText("Current Player = " + playerLetters[0]);
					}
					if(button[rowIndex][0].getText().equals(button[rowIndex][1].getText()) && button[rowIndex][0].getText().equals(button[rowIndex][2].getText())) {
						disableAll(button, row, column);
						currentPlayer.setText("Player " + button[rowIndex][0].getText() + " Won");
					}
					else if(button[0][columnIndex].getText().equals(button[1][columnIndex].getText()) && button[0][columnIndex].getText().equals(button[2][columnIndex].getText())) {
						disableAll(button, row, column);
						currentPlayer.setText("Player " + button[0][columnIndex].getText() + " Won");
					}
					else if(button[0][0].getText().equals(button[1][1].getText()) && button[0][0].getText().equals(button[2][2].getText())) {
						disableAll(button, row, column);
						currentPlayer.setText("Player " + button[0][0].getText() + " Won");
					}
					else if(button[0][2].getText().equals(button[1][1].getText()) && button[0][2].getText().equals(button[2][0].getText())) {
						disableAll(button, row, column);
						currentPlayer.setText("Player " + button[0][2].getText() + " Won");
					}
				});
			}
		}
		button[3][0].setOnAction(handleButtonClick -> {
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < column; j++) {
					button[i][j].setText("" + (i*3 + j + 1));
					button[i][j].setDisable(false);
					currentPlayer.setText("Current Player = " + playerLetters[moveList[0] % 2]);
				}
			}
		});
	}
	
	private void disableAll(Button[][] button, int row, int column) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				button[i][j].setDisable(true);
			}
		}
	}
}
