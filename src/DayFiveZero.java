import java.util.Scanner;

import static java.lang.System.exit;

public class DayFiveZero extends DayFiveInput{
    public static void main(String[] args) {
        System.out.println("Welcome to my Systems");
        int ch;
        Scanner scanner = new Scanner(System.in);
        DayFiveZero dayFiveZero=new DayFiveZero();
        do {
            System.out.println("Select the shape");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("0. Exit");
            System.out.println("Entre your choice :: ");
            ch=scanner.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Welcome to Circle Operation");
                    System.out.println("Enter the radius :: ");
                    float r=scanner.nextFloat();
                    dayFiveZero.area(r);
                    break;
                case 2:
                    break;
                case 3:
                    break;
               /* case 0:
                    exit(0);
                    break;*/
            }
        }while (ch!=0);
    }
}
