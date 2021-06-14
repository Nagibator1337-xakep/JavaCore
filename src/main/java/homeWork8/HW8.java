package homeWork8;

public class HW8 {
    public static void main(String[] args) {
        int[] arrayOne = {6, 5, 4, 3, 2, 1};
        int[] arrayTwo = {3, 9, 1, 8, 4, 8, 5, -80, 60, 7, 3, 5, 15, 41, 4, 3, 0, 88, 400, 2, -8, -31, -14, 58, 6, 16, 33, -21, -1, 0, 0, 4};

        printArray(sort(arrayOne));
        printArray(arrayOne,arrayOne.length);
        printArray(arrayTwo, 10, ' ');
        System.out.println(arrayMin(arrayTwo));

        System.out.println("Sum of all elements in Array is: "+sum(arrayTwo));

//        Bicycle myBicycle = new Bicycle();
//        myBicycle.brand = "Stark";
//        myBicycle.model = "Temper";
//        myBicycle.gearsBack = 7;
//        myBicycle.gearsFront = 3;
//        myBicycle.size = "M";
//        myBicycle.type = "MTB";
//
//        Bicycle oldBicycle = new Bicycle();
//        oldBicycle.brand = "Ural";
//        oldBicycle.type = "Fixed Road";
//
//        myBicycle.gearsUpFront(2);
//
//        oldBicycle.getTotalGears();
//        oldBicycle.setBackGear(1);
//        oldBicycle.setFrontGear(1);
//
//        myBicycle.getTotalGears();
//        myBicycle.gearUpBack();
//        myBicycle.gearUpBack();
//        myBicycle.gearUpBack();
//        myBicycle.gearUpBack();
//        myBicycle.getCurrentGearFront();
//        myBicycle.getCurrentGearBack();
//        myBicycle.gearsUpBack(2);
//        myBicycle.gearUpBack();
//        myBicycle.gearsUpBack(1);

    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int v : array) {
            sum += v;
        }
        return sum;
    }

    //    int[] arrayTwo = {3,9,1,8,4,8,5};
    public static int[] sort(int[] array) {
        int[] sortedArray = new int[array.length];
        System.arraycopy(array, 0, sortedArray, 0, array.length);

        int j = array.length;
        while (j > 1) {
            for (int i = 0; i < j - 1; i++) {
                if (sortedArray[i] > sortedArray[i + 1]) {
                    sortedArray = swap(sortedArray, i, i + 1);
                }
            }
            j--;
        }
        return sortedArray;
    }

    /**
     * Method swapping two elements in a selected Array
     * and returning a copy of source Array with swapped
     * elements, thus not changing source Array.
     *
     * @param array Source array
     * @param a1    Index of a first element to be switched with second
     * @param a2    Index of a second element to be switched with first
     */
    public static int[] swap(int[] array, int a1, int a2) {
        int[] tempArray = new int[array.length];
//        for (int i=0;i< array.length;i++) {
//            tempArray[i]=array[i];
//        }
        System.arraycopy(array, 0, tempArray, 0, array.length);
        tempArray[a2] = array[a1];
        tempArray[a1] = array[a2];
        return tempArray;
    }

    // Method for printing Array
    public static void printArray(int[] array) {
        System.out.print("|");
        for (int v : array) {
            System.out.printf(" %d |", v);
        }
        System.out.print("\r\n");
    }


    // Method for printing Array in rows
    public static void printArray(int[] array, int rows) {
        int index = 0;
        System.out.print("|");
        for (int v : array) {
            index++;
            System.out.printf(" %d |", v);
            if (index % rows == 0 && index != 0 && index < array.length) System.out.print("\r\n|");

        }
        System.out.print("\r\n");
    }

    // Method for printing Array in rows with selected divider
    public static void printArray(int[] array, int rows, char divider) {
        int index = 0;
        System.out.print(divider);
        for (int v : array) {
            index++;
            System.out.printf(" %d %c", v, divider);
            if (index % rows == 0 && index != 0 && index < array.length) System.out.printf("\r\n%c", divider);

        }
        System.out.print("\r\n");
    }

    public static int arrayMin(int[] array) {
        int minElement = array[0];
        for (int v:array) {
            if (v<minElement) minElement=v;
        }
        return minElement;
    }
}