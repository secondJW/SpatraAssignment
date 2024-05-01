import java.util.Stack;

public class Calculator {
    private int result;
    Stack<Integer> stackInt = new Stack<>();
    public Stack<Integer> getResult(){
        return stackInt;
    }

    public void setResult(Stack<Integer> stackInt){
        this.stackInt=stackInt;
    }

    public double calculate(int firstNum, int secondNum, char sign){
        //level2-1
        result=0;
        try {

            switch (sign) {
                case '+'-> result = firstNum + secondNum;
                case '-'-> result = firstNum - secondNum;
                case '*'-> result = firstNum * secondNum;
                case '/'-> result = firstNum / secondNum;  //throw ArtithmeticException
                case '%'-> result = firstNum % secondNum;
                default-> throw new CalException();
            }
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (CalException e){
            System.out.println(e.getMessage());
        }
        stackInt.push(result);

        return result;
    }
}
