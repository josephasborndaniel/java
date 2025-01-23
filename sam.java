import java.util.Scanner;

public class sam{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("enter two numbers");
       int num1 = sc.nextInt();
       int num2 = sc.nextInt();
       System.out.print("what operation your going to do");

       System.out.print(" 1 for addtion,2 for subtraction , 3 multiplication,4 division , 5 average");
       int num3 = sc.nextInt();
       double result = 0;
       switch(num3)
       {
        case 1:
             result =num1+num2;
             break;
        case 2:
             result = num1-num2;
             break;
        case 3:
             result =num1*num2;
             break;
        case 4:
            result = num1/num2;
            break;
        case 5:
        if (num2 != 0) {
            result = num1 / num2;
        } else {
            System.out.println("Error! Division by zero.");
            return;
        }
            break;
        default:
        System.out.print("invalid operation");
        break;

               }
       
      System.out.print("the result is = "+result);

    } 
   
}