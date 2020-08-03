import javafx.application.*;
import javafx.stage.Stage;

public class MVCCalculator extends Application
{

	public static void main (String[] args)
	{
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception
	{
		// TODO Auto-generated method stub
		CalculatorView theView = new CalculatorView();
        
    	CalculatorModel theModel = new CalculatorModel();
        
        CalculatorController theController = new CalculatorController(theView,theModel, arg0);
        
	}

}
