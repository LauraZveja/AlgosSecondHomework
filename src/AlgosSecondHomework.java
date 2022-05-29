import java.util.Arrays;
import java.util.Random;

public class AlgosSecondHomework {

    public static void main(String[] args) {

        //create 6 arrays, 3 with small inputs, 3 with large inputs
        int firstSmallArray[] = new int[30];
        int secondSmallArray[] = new int[80];
        int thirdSmallArray[] = new int[140];

        int firstLargeArray[] = new int[11000];
        int secondLargeArray[] = new int[22000];
        int thirdLargeArray[] = new int[31000];

        //create 6 arrays that will contain the time in nanoseconds that was needed to perform bubble sort

        long firstSmallArrayTime[] = new long[10];
        long secondSmallArrayTime[] = new long[10];
        long thirdSmallArrayTime[] = new long[10];

        long firstLargeArrayTime[] = new long[10];
        long secondLargeArrayTime[] = new long[10];
        long thirdLargeArrayTime[] = new long[10];

        //the position at which it will start filling time array with bubble sort execution times in nanoseconds
        int firstArrayPositionInTime = 0;
        int secondArrayPositionInTime = 0;
        int thirdArrayPositionInTime = 0;
        int fourthArrayPositionInTime = 0;
        int fifthArrayPositionInTime = 0;
        int sixthArrayPositionInTime = 0;


        //the number with which the total sum of nanoseconds will be divided
        long divide = 10;

        //populate all 6 arrays with random numbers
        for (int i = 0; i < firstSmallArray.length; i++) {
            firstSmallArray[i] = randomIntegerNumber(20, 150);
        }

        for (int i = 0; i < secondSmallArray.length; i++) {
            secondSmallArray[i] = randomIntegerNumber(20, 150);
        }

        for (int i = 0; i < thirdSmallArray.length; i++) {
            thirdSmallArray[i] = randomIntegerNumber(20, 150);
        }

        for (int i = 0; i < firstLargeArray.length; i++) {
            firstLargeArray[i] = randomIntegerNumber(10001, 100000);
        }

        for (int i = 0; i < secondLargeArray.length; i++) {
            secondLargeArray[i] = randomIntegerNumber(10001, 100000);
        }

        for (int i = 0; i < thirdLargeArray.length; i++) {
            thirdLargeArray[i] = randomIntegerNumber(10001, 100000);
        }
        //System.out.println("Input data for array with the size 30: \n" + Arrays.toString(firstSmallArray));
        System.out.println("\n\nN represents the count of random numbers that will be bubble sorted in ascending order.\n");
        System.out.printf("%-9s %-9s %-11s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", "N = XX", "Test 1", " Test 2", "Test 3", "Test 4", "Test 5", "Test 6", "Test 7", "Test 8", "Test 9", "Test 10", "The average time in nanoseconds for 10 tests");

        //running 10 tests and tracking time in nanoseconds for n = 30
        System.out.printf("%-10s", "N = 30");
        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            sortingBubble(firstSmallArray, firstSmallArray.length);
            long end = System.nanoTime();
            long duration = end - start;
            firstSmallArrayTime[firstArrayPositionInTime] = duration;
            firstArrayPositionInTime++;
            System.out.printf("%-11s", duration);
        }
        long sum = 0;
        for (int i = 0; i < firstSmallArrayTime.length; i++) {
            sum += firstSmallArrayTime[i];
        }
        long firstAverage = sum / divide;
        System.out.printf("%-11s", firstAverage);

        //running 10 tests and tracking time in nanoseconds for n = 80
        System.out.printf("\n%-10s", "N = 80");
        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            sortingBubble(secondSmallArray, secondSmallArray.length);
            long end = System.nanoTime();
            long duration = end - start;
            secondSmallArrayTime[secondArrayPositionInTime] = duration;
            secondArrayPositionInTime++;
            System.out.printf("%-11s", duration);
        }
        long secSum = 0;
        for (int i = 0; i < secondSmallArrayTime.length; i++) {
            secSum += secondSmallArrayTime[i];
        }
        long secondAverage = secSum / divide;
        System.out.printf("%-11s", secondAverage);

        //running 10 tests and tracking time in nanoseconds for n = 140
        System.out.printf("\n%-10s", "N = 140");
        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            sortingBubble(thirdSmallArray, thirdSmallArray.length);
            long end = System.nanoTime();
            long duration = end - start;
            thirdSmallArrayTime[thirdArrayPositionInTime] = duration;
            thirdArrayPositionInTime++;
            System.out.printf("%-11s", duration);
        }
        long thirdSum = 0;
        for (int i = 0; i < thirdSmallArrayTime.length; i++) {
            thirdSum += thirdSmallArrayTime[i];
        }
        long thirdAverage = thirdSum / divide;
        System.out.printf("%-11s", thirdAverage);

        //running 10 tests and tracking time in nanoseconds for n = 11000
        System.out.printf("\n%-10s", "N = 11000");
        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            sortingBubble(firstLargeArray, firstLargeArray.length);
            long end = System.nanoTime();
            long duration = end - start;
            firstLargeArrayTime[fourthArrayPositionInTime] = duration;
            fourthArrayPositionInTime++;
            System.out.printf("%-11s", duration);
        }
        long fourthSum = 0;
        for (int i = 0; i < firstLargeArrayTime.length; i++) {
            fourthSum += firstLargeArrayTime[i];
        }
        long fourthAverage = fourthSum / divide;
        System.out.printf("%-11s", fourthAverage);

        //running 10 tests and tracking time in nanoseconds for n = 21000
        System.out.printf("\n%-10s", "N = 22000");
        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            sortingBubble(secondLargeArray, secondLargeArray.length);
            long end = System.nanoTime();
            long duration = end - start;
            secondLargeArrayTime[fifthArrayPositionInTime] = duration;
            fifthArrayPositionInTime++;
            System.out.printf("%-11s", duration);
        }
        long fifthSum = 0;
        for (int i = 0; i < secondLargeArrayTime.length; i++) {
            fifthSum += secondLargeArrayTime[i];
        }
        long fifthAverage = fifthSum / divide;
        System.out.printf("%-11s", fifthAverage);

        //running 10 tests and tracking time in nanoseconds for n = 31000
        System.out.printf("\n%-10s", "N = 31000");
        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            sortingBubble(thirdLargeArray, thirdLargeArray.length);
            long end = System.nanoTime();
            long duration = end - start;
            thirdLargeArrayTime[sixthArrayPositionInTime] = duration;
            sixthArrayPositionInTime++;
            System.out.printf("%-11s", duration);
        }
        long sixthSum = 0;
        for (int i = 0; i < thirdLargeArrayTime.length; i++) {
            sixthSum += thirdLargeArrayTime[i];
        }
        long sixthAverage = sixthSum / divide;
        System.out.printf("%-11s\n", sixthAverage);
        //System.out.println("\nData for the array with size 30 after sortingBubble function was called: \n" + Arrays.toString(firstSmallArray));
    }

    //create function that will be used to Bubble sort arrays
    public static void sortingBubble(int[] arrayToSort, int length) {

        for (int i = 0; i < length - 1; i++) {

            for (int j = 0; j < length - i - 1; j++) {

                if (arrayToSort[j + 1] < arrayToSort[j]) {

                    int swapped = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = swapped;

                }
            }
        }
    }

    public static int randomIntegerNumber(int min, int max) {
        Random random = new Random();
        int randomNumber = random.nextInt((max - min) + 1) + min;
        return randomNumber;
    }
}

