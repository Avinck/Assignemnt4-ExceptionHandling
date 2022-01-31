import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First Number");
        int a = sc.nextInt();
        System.out.println("Second Number");
        int b = sc.nextInt();
         try {
             int div =  (a/b);
             System.out.println(div);
         }
         catch (ArithmeticException e){
             System.out.println("ArithmeticException/n" + e);
         }
        System.out.println("End !!!");
    }
}
