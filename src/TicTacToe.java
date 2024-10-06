import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToe {
	
	static final int row = 3;
	static final int column = 3;
	Stage stage;
	Scene scene;
	BorderPane borderPane;
	GridPane gridPane;
	Button[][] buttons = new Button[row+1][column];
	Label currentPlayer;
	Label[] titles = new Label[3];
	Style styling = new Style();
	Event event = new Event();
	String[] playerLetters = {"X", "O"};
	String currentLetter;
	int[] moveList = {0};
	
	public TicTacToe(Stage stage) {
		stage = new Stage();
		this.stage = stage;
		stage.setTitle("TTT");
		randomPlayer();
		initialize();
		styling.style(borderPane, gridPane, titles, buttons, currentPlayer);
		event.eventTrigger(buttons, row, column, playerLetters, currentPlayer, moveList);
		this.scene = new Scene(borderPane, 600, 600);
	}
	
	public Scene getScene() {
		return this.scene;
	}
	
	public void randomPlayer() {
		int random = (int) ((Math.random()*100) + 1);
		if(random > 50) {
			moveList[0]++;
		}
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
		buttons[3][0] = new Button("RESET");
		currentPlayer = new Label("Current Player = " + playerLetters[moveList[0] % 2]);
	}
}