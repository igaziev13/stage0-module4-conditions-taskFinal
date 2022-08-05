package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        boolean positive = firstSide > 0 && secondSide > 0 && thirdSide > 0;
        boolean checkTri = firstSide + secondSide <= thirdSide || firstSide + thirdSide <= secondSide || secondSide + thirdSide <= firstSide;
        if (!checkTri && positive)
            System.out.println("this is a valid triangle");
        else
            System.out.println("it's not a triangle");
    }
}
