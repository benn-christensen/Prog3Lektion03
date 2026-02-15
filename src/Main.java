import com.google.common.base.Stopwatch;
import examples.generator.RandomNumbersGenerator;
import examples.other.Fibbonacci;
import examples.other.Permutation;
import examples.searching.BinarySearch;
import examples.searching.LinearSearch;
import examples.sorting.BubbleSort;
import examples.sorting.QuickSort;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Main {
    private static final int NUMBER = 100_000;
    static void main() {
        long[] numbers = RandomNumbersGenerator.generate(NUMBER);
        Stopwatch stopwatch = Stopwatch.createStarted();
        //SumNumbers.sum(numbers);
        //BinarySearch.contains(105734, numbers);
        //LinearSearch.contains(105734, numbers);
        //BubbleSort.bubbleSort(numbers);
        //QuickSort.quickSort(numbers);

        //System.out.println("Fibbonacci.fibonacci(10) = " + Fibbonacci.fibonacci(10));
        //Permutation.permute("Hello World");
        stopwatch.stop();
        long durationMillis = stopwatch.elapsed(TimeUnit.MILLISECONDS);
        System.out.println("Antal tal: " + NUMBER + " udførselstid: " + durationMillis + " ms.");
    }
}
