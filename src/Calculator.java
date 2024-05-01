import java.util.Stack;

public class Calculator {
    static final float r = 3.14f;   //공유가능한 상수
    private int result;
    float circleArea;
    Stack<Integer> stackInt;
    private Stack<Float> stackCircle;

    public void setCircle(Stack<Float> stackCircle){
        this.stackCircle=stackCircle;
    }

    public Stack<Float> getStackCircle(){
        return stackCircle;
    }

    public float calculateCircleArea(int radius){
        circleArea=radius*radius*r;
        stackCircle.push(circleArea);
        return circleArea;
    }
    Calculator(){
         stackInt= new Stack<>();
         stackCircle=new Stack<>();
    }
    public Stack<Integer> getResult(){  //
        return stackInt;
    }

    public void setResult(Stack<Integer> stackInt){
        this.stackInt=stackInt;
    }

    public void removeResult(){
        stackInt.pop();
    }
    public void inquiryResult(){
        System.out.println(stackInt);
    }
    public void inquiryResultCircle(){
        System.out.println(stackCircle);
    }
    public double calculate(int firstNum, int secondNum, char sign){
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
