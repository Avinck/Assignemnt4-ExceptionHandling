import java.util.Scanner;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        int result = (a/b);
        System.out.println("The Value after divide" +a+ "/" +b+ "is:"+ result);
        if(result==0){
            try{
                throw new UnsupportedOperationException();
            } catch (UnsupportedOperationException e) {
                System.out.println("\n ArithmeticException"+e);
            }
        }
        System.out.println("\n Done !!!");
    }
}
