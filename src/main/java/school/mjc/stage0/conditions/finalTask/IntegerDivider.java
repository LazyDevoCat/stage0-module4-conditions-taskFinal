package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        double result;

        if (divider == 0) {
            System.out.println("division by zero");
        }
        else if ( (result = (double) (dividend / divider) * (double) divider ) == (double) dividend ) {
            System.out.println("can be divided completely");
        }
        else {
            System.out.println("cannot be divided completely");
        }
    }
}
