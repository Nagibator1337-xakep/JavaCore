package lessons.Lesson15;

public class App1 {
    public static void main(String[] args) {
        int a = 5;
        Integer b;
        Integer c = 69;

        b = c;
        System.out.println(b);
        System.out.println(c);
        b = b+1;
        c = c+1;
        System.out.println(b);
        System.out.println(c);

        //String aa = " you";
        String bb = "fuck";
        String cc = "frick";
        bb = cc;
        bb = bb + " you bitch";
        cc = cc+" you cunt";
        System.out.println(bb);
        System.out.println(cc);

        //int[] aaa = {1,1};
        int[] bbb = {2,2};
        int[] ccc = {3,3};
        bbb = ccc;
        bbb[0] = 69;
        ccc[0] = 420;
        System.out.println(bbb[0]);
        System.out.println(ccc[0]);

    }
}
