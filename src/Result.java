import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        a.add(11);
        a.add(2);
        a.add(4);
        // b
        b.add(4);
        b.add(5);
        b.add(6);
        // c
        c.add(10);
        c.add(8);
        c.add(-12);

        List<List<Integer>> lInt = new ArrayList<>();
        lInt.add(a);
        lInt.add(b);
        lInt.add(c);

        System.out.println(Result.diagonalDifference(lInt));


    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        List<Integer> results = new ArrayList<>();
        int aPoint = 0;
        int bPoint = 0;
        for (int i= 0; i < a.size(); i++) {
            if (a.get(i) > (b.get(i))) {
                aPoint++;
            }
            if (b.get(i) > a.get(i)) {
                bPoint++;
            }
        }

        results.add(aPoint);
        results.add(bPoint);

        return results;
    }

    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long results = 0;
        for (Long aLong : ar) {
            results += aLong;
        }

        return results;

    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int leftToRightVal = 0;
        int rightToLeftVal = 0;
        int lTorResult;
        int finalResult = 0;
        int lastRIndex;
        List<Integer> arrVal;

        for (int i= 0; i < arr.size(); i++) {
            lastRIndex = arr.size() - 1 - i;
            arrVal = arr.get(i);
            leftToRightVal += arrVal.get(i);
            rightToLeftVal += arrVal.get(lastRIndex);
        }

        //  System.out.println("I am here");
        System.out.println("LtoR= " + leftToRightVal);
        int rightToLeftFinal = rightToLeftVal;
        System.out.println("RtoL= " + rightToLeftFinal);
        lTorResult = leftToRightVal - rightToLeftVal;
        if (lTorResult < 0) {
            finalResult = lTorResult * -1;
        }

        return finalResult;

    }

}
