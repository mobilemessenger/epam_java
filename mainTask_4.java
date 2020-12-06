import java.util.Scanner;

public class mainTask_4 {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.print("Input a two number: "+"\n");
            int first = in.nextInt();
            int second = in.nextInt();

            System.out.println("You entered: "+ first+" and "+second);
            System.out.println("First + Second = "+ (first+second));
            System.out.println("First x Second = "+ (first*second));
            in.close();
        }




}
