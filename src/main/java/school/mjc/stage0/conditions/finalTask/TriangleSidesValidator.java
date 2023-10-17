package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        double result = ((firstSide > secondSide && firstSide > thirdSide) ? firstSide :
                ((secondSide > firstSide && secondSide > thirdSide) ? secondSide : thirdSide));

        if (firstSide <= 0.0 || secondSide <= 0.0 || thirdSide <= 0.0) {
            System.out.println("it's not a triangle");
        } else if (firstSide + secondSide > result && firstSide + thirdSide > result && secondSide + thirdSide > result) {
            System.out.println("this is a valid triangle");
        }
        else {
            System.out.println("it's not a triangle");
        }


    }
}
