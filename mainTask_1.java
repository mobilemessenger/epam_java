import java.util.Scanner;
public class mainTask_1 {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.print("Input a name: ");
            String name = in.nextLine();

            System.out.println("Hello dear, - "+ name);
            in.close();
        }


}

