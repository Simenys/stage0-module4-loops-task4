package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bigger then the last");
            return;
        }
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
            return;
        }
        int sum = 0;
        int sumSkipped = 0;
        for (int i = 1; i <= lastInRow; i++) {
            if (i <= numberToSkip) {
                sumSkipped += i;
                continue;
            }
            sum += i;
        }
        System.out.println("skipped sum is " + sumSkipped);
        System.out.println("counted sum is " + sum);
    }
}


// 3.1. when numberToSkip is greater than lastInRow -> output is:"number to skip is bugger then the last"
//        3.2. when lastInRow is negative -> output is:"last number in row is negative"
//        3.3. for the rest cases output is:
//        "skipped sum is number" "counted sum is number",
//        where number is an actual sum of them:
