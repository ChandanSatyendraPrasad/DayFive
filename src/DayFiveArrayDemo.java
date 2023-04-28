public class DayFiveArrayDemo {
    static int a;
    public static void main(String[] args) {
        int bas[] =new int[5];
        int hua[]={};
        int ab[]={2,6,8,1,66,-1};

        System.out.println("SIZE 0 "+bas.length);
        System.out.println("SIZE 1 "+hua.length);

        a= ab.length;
        System.out.println("SIZE 2 "+a);
        int i=0;
        while (i!=a)
        {
            System.out.println("JELA = "+ab[i] +" NAHI JA RAHA HAI ::"+i);
            i++;
        }


    }
}
