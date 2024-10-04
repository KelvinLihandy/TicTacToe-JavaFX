import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToe {
	
	private static final int row = 3;
	private static final int column = 3;
	protected Stage stage;
	protected Scene scene;
	protected BorderPane borderPane;
	protected GridPane gridPane;
	protected Button[][] buttons = new Button[row][column];
	protected Label currentPlayer;
	protected Label[] titles = new Label[3];
	protected Style styling = new Style();
	protected Event event = new Event();
	
	public TicTacToe(Stage stage) {
		stage = new Stage();
		this.stage = stage;
		stage.setTitle("TTT");
		initialize();
		styling.style(borderPane, gridPane, titles, buttons, currentPlayer);
		event.eventTrigger(buttons, row, column);
		this.scene = new Scene(borderPane, 600, 600);
	}
	
	public Scene getScene() {
		return this.scene;
	}
	
	public void initialize() {
		stage = new Stage();
		borderPane = new BorderPane();
		gridPane = new GridPane();
		titles[0] = new Label("TIC");
		titles[1] = new Label("TAC");
		titles[2] = new Label("TOE");		
		buttons[0][0] = new Button("1");
		buttons[0][1] = new Button("2");
		buttons[0][2] = new Button("3");
		buttons[1][0] = new Button("4");
		buttons[1][1] = new Button("5");
		buttons[1][2] = new Button("6");
		buttons[2][0] = new Button("7");
		buttons[2][1] = new Button("8");
		buttons[2][2] = new Button("9");
		currentPlayer = new Label("Current Player = null");
	}
}