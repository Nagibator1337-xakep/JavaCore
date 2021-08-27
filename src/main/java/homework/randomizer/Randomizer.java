package homework.randomizer;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Randomizer {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(Path.of("src/resources/config.txt"), StandardCharsets.UTF_8);
        PrintWriter writer = new PrintWriter("src/resources/output.txt", StandardCharsets.UTF_8);
        int size = scanner.nextInt();
        int minValue = scanner.nextInt();
        int maxValue = scanner.nextInt();

        RandomIndex index = new RandomIndex();
        int[] randomArray = index.getRandomIndexArray(size,minValue,maxValue);

        writer.println("===============");
        System.out.println("===============");
        try {
            System.out.println(Arrays.stream(randomArray).max().orElseThrow());

            double realAverage = Arrays.stream(randomArray).average().orElseThrow();
            double rangeAverage = Math.abs(((double)(maxValue-minValue))/2);
            double delta = ((Math.abs(rangeAverage-realAverage))*2/maxValue)*100;

            writer.printf("Delta: %.4f%% \n", delta);
            System.out.printf("Delta: %.4f%% \n", delta);

            writer.println(Arrays.stream(randomArray).min().orElseThrow());
            System.out.println(Arrays.stream(randomArray).min().orElseThrow());
        } catch (NoSuchElementException ignored) {}
        writer.println("===============");
        System.out.println("===============");

        Arrays.sort(randomArray);
        int elementBuffer = randomArray[0];
        for(int element: randomArray) {
            if (elementBuffer!=element) {
                writer.println();
                System.out.println();
            }
            writer.print(element+" ");
            System.out.print(element+" ");
            elementBuffer=element;
        }
        writer.flush();
        writer.close();
    }
}