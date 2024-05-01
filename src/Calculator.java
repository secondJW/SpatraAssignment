public class Calculator {
    int result;
    public double calculate(int firstNum, int secondNum, char sign){
        //level2-1
        result=0;
        try {

            switch (sign) {
                case '+':
                    result = firstNum + secondNum;
                    break;
                case '-':
                    result = firstNum - secondNum;
                    break;
                case '*':
                    result = firstNum * secondNum;
                    break;
                case '/':
                    result = firstNum / secondNum;  //throw ArtithmeticException
                    break;
                case '%':
                    result = firstNum % secondNum;
                    break;
                default:
                    throw new CalException();
            }
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (CalException e){
            System.out.println(e.getMessage());
        }

        return result;
    }
}
