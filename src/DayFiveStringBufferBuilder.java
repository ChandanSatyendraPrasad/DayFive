public class DayFiveStringBufferBuilder {
    public static void main(String[] args) {
        System.out.println("===== String methods =====");
        System.out.println();
        String s = " hello everyone!!";
        System.out.println("s.length(): " + s.length());                    // 17
        System.out.println("s.contains(\"one\"): " + s.contains("one"));        // true
        System.out.println("s.isEmpty: " + s.isEmpty());                    // false
        System.out.println("s.isBlank: " + s.isBlank());                    // false
        System.out.println("s.toUpperCase(): " + s.toUpperCase());            //   HELLO EVERYONE!!
        System.out.println("s.startsWith(\"h\"): " + s.startsWith("h"));    // false
        System.out.println("s.startsWith(\"h\"): " + s.trim().startsWith("h"));    // false
        System.out.println("s.endsWith(\" \"): " + s.endsWith(" "));            // true
        System.out.println("s.replace(\"ll\", \"LL\"): " + s.replace("ll", "LL"));    // heLLo
        System.out.println("s.trim(): " + s.trim());                        // hello
        System.out.println("s.strip(): " + s.strip());                        // hello
        System.out.println("s.substring(0, 7): " + s.substring(0, 7));        //  hello

        // Sting Buffer
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println("stringBuffer length " + stringBuffer.length());
        System.out.println("stringBuffer" + stringBuffer);
        System.out.println("stringBuffer Capacity " + stringBuffer.capacity());


        StringBuffer stringBuffer1 = new StringBuffer("YASH");
        System.out.println("stringBuffer1 length " + stringBuffer1.length());
        System.out.println("stringBuffer1" + stringBuffer1);
        System.out.println("stringBuffer1 Capacity " + stringBuffer1.capacity());


        StringBuffer stringBuffer2 = new StringBuffer(1);
        System.out.println("stringBuffer2 length " + stringBuffer2.length());
        System.out.println("stringBuffer2" + stringBuffer2);
        System.out.println("stringBuffer2 Capacity " + stringBuffer2.capacity());
        stringBuffer2.append("Kushal");
        System.out.println("stringBuffer2 After Capacity " + stringBuffer2.capacity());
        System.out.println("stringBuffer2 " + stringBuffer2);
        stringBuffer2.append(" Choudhary");
        System.out.println("stringBuffer2 After After Capacity " + stringBuffer2.capacity());
        System.out.println("stringBuffer2 " + stringBuffer2);

        stringBuffer2.insert(0, "YASH  & ");

        System.out.println("stringBuffer2 " + stringBuffer2);
        System.out.println("stringBuffer2 After After After Capacity " + stringBuffer2.capacity());
        stringBuffer2.insert(1, "YASH  & ");

        System.out.println("stringBuffer2 " + stringBuffer2);
        System.out.println("stringBuffer2 After After After After Capacity " + stringBuffer2.capacity());
        System.out.println("Buffer Compare " + stringBuffer2.compareTo(stringBuffer1));

        //String Builder
        StringBuilder stringBuilder = new StringBuilder();

//A mutable sequence of characters. This class provides an API compatible with StringBuffer,
// but with no guarantee of synchronization.
// This class is designed for use as a drop-in replacement for StringBuffer in places
// where the string buffer was being used by a single thread (as is generally the case).
        System.out.println("stringBuilder length " + stringBuilder.length());
        System.out.println("stringBuilder" + stringBuilder);
        System.out.println("stringBuilder Capacity " + stringBuilder.capacity());


        StringBuilder stringBuilder1 = new StringBuilder("Jayanti Lal");
        stringBuilder1.insert(2, "YASH");
        StringBuffer stringBuffer3 = new StringBuffer("Jayanti Lal");
        stringBuffer3.insert(2, "YASH");
//A mutable sequence of characters. This class provides an API compatible with StringBuffer,
// but with no guarantee of synchronization.
// This class is designed for use as a drop-in replacement for StringBuffer in places
// where the string buffer was being used by a single thread (as is generally the case).
        System.out.println("stringBuilder1 length " + stringBuilder1.length());
        System.out.println("stringBuilder1 " + stringBuilder1);
        System.out.println("stringBuilder1 Capacity " + stringBuilder1.capacity());
        System.out.println("stringBuilder1 Capacity " + stringBuilder1.capacity());
        System.out.println("stringBuffer3 length " + stringBuffer3.length());
        System.out.println("stringBuffer3 " + stringBuffer3);
        System.out.println("stringBuffer3 Capacity " + stringBuffer3.capacity());
        System.out.println("stringBuilder1 Reverse " + stringBuilder1.reverse());
        System.out.println("stringBuffer3 Reverse " + stringBuffer3.reverse());
    }
}
