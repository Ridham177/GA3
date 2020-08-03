import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculatorController 
{
	
	private CalculatorView view;
	private CalculatorModel model;
	
	public CalculatorController(CalculatorView theView, CalculatorModel theModel, Stage arg0) {
		this.view = theView;
		this.model = theModel;
        attachCode();
        Scene scene = new Scene(this.view.root);
        arg0.setScene(scene);
        arg0.show();
	}
	
	public void btncode(ActionEvent e)
	{
		double num1, num2, answer;
		char symbol;
		//e tells us which button was clicked
		if (e.getSource() == this.view.btnClear) 
		{
		   this.view.tfNum1.setText("");
		   this.view.tfNum2.setText("");
		   this.view.lblAnswer.setText("?");
		   return;
		}
		
		 num1 = this.view.getFirstNumber();
		 num2 = this.view.getSecondNumber();
	        if (e.getSource() == this.view.btnAddition) 
	        {
	            symbol = '+';
	            answer = num1 + num2;
	        }
	        else if (e.getSource() == this.view.btnSubtraction) 
	        {
	            symbol = '-';
	            answer = num1 - num2;
	        }
	        else if (e.getSource() == this.view.btnMultiply) 
	        {
	            symbol = 'x';
	            answer = num1 * num2;
	        }
	        else if (e.getSource() == this.view.btnDivide)
	        {
	            symbol = '/';
	            answer = num1 / num2;
	        }
	        else
	        {
	        	symbol = 'l';
	        	answer = Math.log(num1);
	        }
	        //display answer
	        if (symbol == 'l')
	        {
		        this.view.lblAnswer.setText("" + symbol+ "og(" + num1 + ")" + "=" + answer);
	        }
	        else
	        {
	        	this.view.lblAnswer.setText("" + num1 + symbol + num2 + "=" + answer);
	
	        }
		}
	
	public void attachCode() 
	{
		   this.view.btnAddition.setOnAction(e -> btncode(e));
		   this.view.btnSubtraction.setOnAction(e -> btncode(e));
		   this.view.btnMultiply.setOnAction(e -> btncode(e));
		   this.view.btnDivide.setOnAction(e -> btncode(e));
		   this.view.btnClear.setOnAction(e -> btncode(e));
	}
	
	
}
	