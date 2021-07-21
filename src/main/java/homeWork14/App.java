package homeWork14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<Integer> primeNumbers;
        primeNumbers = primesListCalculator(10000000);


        for (int i=0;i<primeNumbers.size();i++) {
            if (i!=0 && i%10==0) System.out.print('\n');
            System.out.print(primeNumbers.get(i)+"; ");

        }
        System.out.println("Done! \n"+primeNumbers.size()+"-number Prime numbers Array printed");

        int randomNum = getRandomNumber(0,primeNumbers.size()-1);
        System.out.println((randomNum+1)+" element is: "+primeNumbers.get(randomNum));

    }

    public static List<Integer> primesListCalculator(Integer numberOfPrimes) {
        List<Integer> primesList = new ArrayList<>();
        for (int i=2;i<Integer.MAX_VALUE;i++) {
            if(isPrime(i)) primesList.add(i);
            if(primesList.size()==numberOfPrimes) break;
        }
        return primesList;
    }

    public static boolean isPrime(Integer number) {
        if (number==2||number==3) return true;
        if (number<=1||number%2==0||number%3==0) return false;
        for (int i = 5; i*i <= number; i+=2) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

}