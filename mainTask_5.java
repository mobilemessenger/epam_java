import java.util.Scanner;

public class mainTask_5 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Input a number: \n");
            int numbMonth= in.nextInt();
            if (numbMonth>12){System.out.print("FALSE.Entered not a number");
              }else{System.out.print("SUCCESS it is a number");}
                switch(numbMonth)     {
                    case 1:System.out.print("Selected Jan");break;
                    case 2:System.out.print("Selected Feb");break;
                    case 3:System.out.print("Selected March");break;
                    case 4:System.out.print("Selected Apr");break;
                    case 5:System.out.print("Selected May");break;
                    case 6:System.out.print("Selected June");break;
                    case 7:System.out.print("Selected Jul");break;
                    case 8:System.out.print("Selected Aug");break;
                    case 9:System.out.print("Selected Sept");break;
                    case 10:System.out.print("Selected Octo");break;
                    case 11:System.out.print("Selected Nov");break;
                    case 12:System.out.print("Selected Dec");break;



            }

         }
        }


