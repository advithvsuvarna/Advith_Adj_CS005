/*2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
your answer which one is better.
*/
package String;
public class PerformanceTest {
    public static void main(String[] args) {
        // Test with StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        long startBuffer = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            stringBuffer.append("AIET");
        }
        long endBuffer = System.nanoTime();
        long durationBuffer = endBuffer - startBuffer;
        // Test with StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        long startBuilder = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append("AIET");
        }
        long endBuilder = System.nanoTime();
        long durationBuilder = endBuilder - startBuilder;
        System.out.println("Time taken by StringBuffer: " + durationBuffer + " ns");
        System.out.println("Time taken by StringBuilder: " + durationBuilder + " ns");
        if (durationBuilder < durationBuffer) {
            System.out.println("StringBuilder is faster than StringBuffer for single-threaded operations.");
        } else {
            System.out.println("StringBuffer is more thread-safe, but slower than StringBuilder.");
        }
    }
}
