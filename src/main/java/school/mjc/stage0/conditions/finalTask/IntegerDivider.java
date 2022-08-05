package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        String outputResult;
        if (divider != 0) {
            int result = dividend / divider;
            if (result * divider == dividend)
                outputResult = "can be divided completely";
            else
                outputResult = "cannot be divided completely";
        }
        else
            outputResult = "division by zero";
        System.out.println(outputResult);
    }
}
