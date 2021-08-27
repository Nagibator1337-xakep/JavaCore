package homework.randomizer;

public class RandomIndex {

    public RandomIndex() {}

    public int getRandomIndex(int min, int max) {
        return (int) Math.floor(Math.random()*(max-min+1)+min);
    }

    public int[] getRandomIndexArray(int size, int minValue, int maxValue) {
        int[] array = new int[size];
        for(int i=0; i<size;i++) {
            array[i] = getRandomIndex(minValue, maxValue);
        }
        return array;
    }
}
