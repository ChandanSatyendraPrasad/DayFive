import java.util.Scanner;


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
                case 3:
                    System.out.println("Welcome to Square Operation");
                    System.out.println("Enter the side :: ");
                    int rr=scanner.nextInt();
                    dayFiveZero.area(rr);
                    break;

                case 2:
                    System.out.println("Welcome to Rectangle Operation");
                    System.out.println("Enter the length :: ");
                    int rrr_1=scanner.nextInt();
                    System.out.println("Enter the breadth :: ");
                    int rrr_2=scanner.nextInt();
                    dayFiveZero.area(rrr_1,rrr_2);
                    break;
               /* case 0:
                    exit(0);
                    break;*/
            }
        }while (ch!=0);
    }
}
