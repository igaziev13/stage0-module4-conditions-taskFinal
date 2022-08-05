package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        String result = "zero";
        if (x>0 && y>0)
            result = "first";
        else if (x<0 && y>0)
            result = "second";
        else if (x<0 && y<0)
            result = "third";
        else if (x>0 && y<0)
            result = "fourth";
        System.out.println(result);
    }
}
