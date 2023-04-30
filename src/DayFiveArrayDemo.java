public class DayFiveArrayDemo {
    static int a;//Global

    public static void main(String[] args) {
        int bas[] = new int[5];//Local
        int hua[] = {};
        int ab[] = {2, 6, 8, 1, 66, -1};

        System.out.println("SIZE 0 " + bas.length);
        System.out.println("SIZE 1 " + hua.length);

        a = ab.length;
        System.out.println("SIZE 2 " + a);
        int i = 0;
        while (i != a) {
            System.out.println("JELA = " + ab[i] + " NAHI JA RAHA HAI ::" + i);
            i++;
        }
        char test[] = {'A', 'B', 'C'};
        int cl = test.length;
        System.out.println("Length " + cl);
        for (int ia = 0; ia < cl; ia++) {
            System.out.println("POSITION = " + ia + " & AND VALUE = " + test[ia]);
            System.out.println("POSITION = " + ia + " & AND VALUE = " + (int) test[ia]);
        }
        float ft[] = {2.4f, 4.3f, 55f, 6.99f};
        for (int j = 0; j < ft.length; j++) {
            System.out.println("POSITION = " + j + " & AND VALUE = " + ft[j]);
        }



    }
}
