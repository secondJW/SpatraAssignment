import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input="";
        //int index=0;
        Stack<Integer> stackInt=new Stack<>();

        while(!input.equals("exit")) {
            System.out.println("첫 번째 숫자를 입력하세요");
            int firstNum = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하세요");
            int secondNum = sc.nextInt();
            sc.nextLine(); //nextInt()가 남겨뒀던 개행(\n)을 가져옴
            System.out.println("사칙연산 기호를 입력하세요");
            char sign = sc.nextLine().charAt(0);

            int result = 0;


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
                    result = firstNum / secondNum;
                    break;
                case '%':
                    result = firstNum % secondNum;
                    break;
                default:
                    System.out.println("다시 입력");
            }
            if(stackInt.size()>10){
                stackInt.pop();
            }
            stackInt.push(result);
           // index++;
            System.out.println("결과: " + result);
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            input=sc.nextLine();
        }
    }
}
