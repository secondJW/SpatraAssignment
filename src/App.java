import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input1="";
        String input2="";
        String input3="";

        Calculator cal=new Calculator();


        while(!input2.equals("exit")) {
            System.out.println("첫 번째 숫자를 입력하세요");
            int firstNum = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하세요");
            int secondNum = sc.nextInt();
            sc.nextLine(); //nextInt()가 남겨뒀던 개행(\n)을 가져옴
            System.out.println("사칙연산 기호를 입력하세요");
            char sign = sc.nextLine().charAt(0);
            cal.calculate(firstNum,secondNum,sign);

            System.out.println("결과: " + cal.getResult());
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (reomve 입력 시 삭제)");
            input1=sc.nextLine();
            if(input1.equals("remove")){
                cal.removeResult();
            }
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            input3=sc.nextLine();
            if(input3.equals("inquiry")){
                System.out.println(cal.stackInt);
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            input2=sc.nextLine();
            //
        }
    }
}
