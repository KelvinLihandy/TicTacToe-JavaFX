import javafx.scene.control.Button;

public class Event {
	
	public void eventTrigger(Button[][] button, int row, int column) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				int rowIndex = i;
				int columnIndex = j;
				button[i][j].setOnAction(handleButtonClick -> {
					System.out.println(rowIndex + " " + columnIndex);
				});
			}
		}
	}
}
