package timingtest;
import edu.princeton.cs.algs4.Stopwatch;

import java.util.ArrayList;

/**
 * Created by hug.
 */
public class TimeAList {
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
        timeAListConstruction();
    }

    public static void timeAListConstruction() {
        System.out.println("Timing table for addLast");
        AList<Integer> Ns = new AList<>();
        AList<Integer> test = new AList<>();
        AList<Double> times = new AList<>();
        AList<Integer> opCounts = new AList<>();
        Stopwatch timer = new Stopwatch();

        for (int i = 1; i <= 128; i*=2) {
            for (int j = 0; j < i * 1000; j++) {
                test.addLast(j);
            }
            Ns.addLast(i * 1000);
            opCounts.addLast(i * 1000);
            times.addLast(timer.elapsedTime());
        }

        printTimingTable(Ns, times, opCounts);
    }
}
