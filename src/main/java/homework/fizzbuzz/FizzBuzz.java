package homework.fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();
        for(int i = 3; i <=100; i++ ) {
            if(i%3==0) output.append("Fizz");
            if(i%5==0) output.append("Buzz");
            if(output.toString().equals("")) output.append(i);
            System.out.println(output);
            output.delete(0,output.length());
        }
    }
}