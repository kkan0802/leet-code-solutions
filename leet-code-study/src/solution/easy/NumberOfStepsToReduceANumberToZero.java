package solution.easy;

public class NumberOfStepsToReduceANumberToZero {

    /*
     * 1342. Number of Steps to Reduce a Number to Zero
     */
    public int numberOfSteps(int num) {
        int countSteps = 0;
        while (num != 0) {
            countSteps++;
            if (num % 2 == 0) {
                num = num /2;
            } else {
                num--;
            }
        }
        return countSteps;
    }
}
