import com.google.common.base.Stopwatch;
import examples.generator.RandomNumbersGenerator;
import examples.searching.BinarySearch;

import java.util.concurrent.TimeUnit;

public class Main {
    private static final int NUMBER = 100_000_000;
    static void main() {
        long[] numbers = RandomNumbersGenerator.generate(NUMBER);
        Stopwatch stopwatch = Stopwatch.createStarted();
        //SumNumbers.sum(numbers);
        BinarySearch.contains(105734, numbers);
        stopwatch.stop();
        long durationMillis = stopwatch.elapsed(TimeUnit.MILLISECONDS);
        System.out.println("Antal tal: " + NUMBER + " udførselstid: " + durationMillis + " ms.");
    }
}
