package randomizedtest;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hug.
 */
public class TestBuggyAList {
    // YOUR TESTS HERE
    @Test
    public void testThreeAddThreeRemove() {
        AListNoResizing<Integer> aListNoResizing = new AListNoResizing<>();
        BuggyAList<Integer> buggyAList = new BuggyAList<>();
        aListNoResizing.addLast(4);
        buggyAList.addLast(4);
        aListNoResizing.addLast(5);
        buggyAList.addLast(5);
        aListNoResizing.addLast(6);
        buggyAList.addLast(6);

        assertEquals(aListNoResizing.removeLast(), buggyAList.removeLast());

        assertEquals(aListNoResizing.removeLast(), buggyAList.removeLast());

        assertEquals(aListNoResizing.removeLast(), buggyAList.removeLast());

    }


    @Test
    public void randomizedTest() {
        AListNoResizing<Integer> L = new AListNoResizing<>();
        BuggyAList<Integer> B = new BuggyAList<>();

        int N = 5000;
        for (int i = 0; i < N; i += 1) {
            int operationNumber = StdRandom.uniform(0, 4);
            if (operationNumber == 0) {
                // addLast
                int randVal = StdRandom.uniform(0, 100);
                L.addLast(randVal);
                B.addLast(randVal);
                System.out.println("addLast(" + randVal + ")");
            } else if (operationNumber == 1) {
                // size
                int size = L.size();
                System.out.println("L size: " + size);
                System.out.println("B size: " + size);
            } else if (operationNumber == 2) {
                if (L.size() > 0 && B.size() > 0) {
                    System.out.println("L getLast:" + L.getLast());
                    System.out.println("B getLast:" + B.getLast());
                    System.out.println("getLast L is equals B:" + (L.getLast() == B.getLast()));
                }
            } else if (operationNumber == 3) {
                if (L.size() > 0 && B.size() > 0) {
                    System.out.println("remote L is equals B:" + (L.removeLast() == B.removeLast()));
                }
            }
        }
    }

}
