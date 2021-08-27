package leetcode.reverseInteger;

public class ReverseInteger {
/*    public int reverse(int x) {
        boolean negative = false;
        long reversed = 0;
        if (x<0) {
            x=Math.abs(x);
            negative = true;
        } else if(x==0) return 0;
        while (x>0) {
            reversed = reversed * 10 + x % 10;
            x = x/10;
        }

        try {
            int solution = Math.toIntExact(reversed);
            if (negative) return -solution;
            else return solution;
        }
        catch (ArithmeticException e) {
            return 0;
        }
    }*/

    public int reverse(int x) {
//        boolean negative = false;
//        if (x<0) {
//            x=Math.abs(x);
//            negative = true;
//        }
        String strReversed = new StringBuilder().append(Math.abs(x)).reverse().toString();
        try {
            return x<0 ? -Integer.parseInt(strReversed) : Integer.parseInt(strReversed);
//            if (negative) return -Integer.parseInt(strReversed);
//            else return Integer.parseInt(strReversed);
        } catch(NumberFormatException e) {
            return 0;
        }
    }


    public static void main(String[] args) {
        ReverseInteger ri = new ReverseInteger();
        System.out.println(ri.reverse(1534236469));

    }
}
