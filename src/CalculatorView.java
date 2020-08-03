
import javafx.application.Application;
import javafx.event.Event;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CalculatorView
{

	TextField tfNum1 = new TextField();
	TextField tfNum2 = new TextField();
	Button btnDivide = new Button("/");
	Button btnMultiply= new Button("*");
	Button btnAddition = new Button("+");
	Button btnSubtraction = new Button("-");
	Button btnClear = new Button("Clear");
	Label lblAnswer = new Label("");
	GridPane root = new GridPane();

	 public void CalculatorView()
	 {
		lblAnswer.setAlignment(Pos.CENTER);

		 root.getChildren().add(btnDivide);
		 root.getChildren().add(btnMultiply);
		 root.getChildren().add(btnAddition);
		 root.getChildren().add(btnSubtraction);
		 root.getChildren().add(btnClear);
		        
		 root.getChildren().add(tfNum1);
		 root.getChildren().add(tfNum2);
		 root.getChildren().add(lblAnswer);
	 
	 }
	 
	 public double getFirstNumber(){
			
			return Double.parseDouble(tfNum1.getText());
			
	}
		
	 public double getSecondNumber(){
			
			return Double.parseDouble(tfNum2.getText());
			
	}
	
	
}
