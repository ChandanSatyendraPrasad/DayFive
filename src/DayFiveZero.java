import java.util.Scanner;

import static java.lang.System.exit;


public class DayFiveZero extends DayFiveInput implements SirCumFace{
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
            System.out.println("9. Exit");
            System.out.println("Entre your choice :: ");
            ch=scanner.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Welcome to Circle Operation");
                    System.out.println("Enter the radius :: ");
                    float r=scanner.nextFloat();
                    dayFiveZero.area(r);
                    dayFiveZero.circumference(r);
                    break;
                case 3:
                    System.out.println("Welcome to Square Operation");
                    System.out.println("Enter the side :: ");
                    int rr=scanner.nextInt();
                    dayFiveZero.area(rr);
                    dayFiveZero.perimeter(rr);
                    break;

                case 2:
                    System.out.println("Welcome to Rectangle Operation");
                    System.out.println("Enter the length :: ");
                    int rrr_1=scanner.nextInt();
                    System.out.println("Enter the breadth :: ");
                    int rrr_2=scanner.nextInt();
                    dayFiveZero.area(rrr_1,rrr_2);
                    dayFiveZero.perimeter(rrr_1,rrr_2);
                    break;
              /*  default:
                    exit(0);*/
            }
        }while (ch!=9);
    }


    @Override
    public void perimeter(int a, int b) {
        System.out.println("Perimeter :: "+(2*(a+b)));
    }

    @Override
    public void circumference(float a) {
        System.out.println("Circumference :: "+(2*a*3.14));
    }

    @Override
    public void perimeter(int a) {
        System.out.println("Perimeter :: "+(4*a));
    }
}
