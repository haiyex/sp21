package timingtest;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */
public class TimeSLList {
    private static void printTimingTable(AList<Integer> Ns, AList<Double> times, AList<Integer> opCounts) {
        System.out.printf("%12s %12s %12s %12s\n", "N", "time (s)", "# ops", "microsec/op");
        System.out.printf("------------------------------------------------------------\n");
        for (int i = 0; i < Ns.size(); i += 1) {
            int N = Ns.get(i);
            double time = times.get(i);
            int opCount = opCounts.get(i);
            double timePerOp = time / opCount * 1e6;
            System.out.printf("%12d %12.2f %12d %12.2f\n", N, time, opCount, timePerOp);
        }
    }

    public static void main(String[] args) {
        timeGetLast();
    }

    public static void timeGetLast() {
        System.out.println("Timing table for getLast");
        SLList<Integer> itemSLList = new SLList<>();
        AList<Integer> Ns = new AList<>();
        AList<Double> times = new AList<>();
        AList<Integer> opCounts = new AList<>();
        for (int i = 1; i <= 128; i*= 2) {
            for (int j = 0; j < i * 1000; j++) {
                itemSLList.addLast(j);
            }
            Stopwatch stopwatch = new Stopwatch();
            for (int j = 0; j < 1000; j++) {
                itemSLList.getLast();
            }
            times.addLast(stopwatch.elapsedTime());
            Ns.addLast(i * 1000);
            opCounts.addLast(1000);
        }
        printTimingTable(Ns, times, opCounts);
    }

}
