public class main {
     public static void main(String[] args) {
         CalculatorInputView inputView = new CalculatorInputView();
        CalculatorOutputView outputView = new CalculatorOutputView();
}
 CalculatorModel model = new CalculatorModel();
private Object inputView;
private Object outputView;
 CalculatorPresenter presenter = (CalculatorPresenter) new CalculatorPresenterImpl(inputView, outputView, model);

        presenter.calculate();
    }

 