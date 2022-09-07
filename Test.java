import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        double[] point1 = new double[2];
        point1[0] = 0.0;
        point1[1] = 0.0;
        double[] point2 = new double[2];
        point2[0] = 2.0;
        point2[1] = 2.0;
        double[] point3 = new double[2];
        point3[0] = 0.0;
        point3[1] = 2.0;
        double[] point = new double[2];
        point[0] = 0.0;
        point[1] = 0.0;
        System.out.println(judge(point1, point2, point3, point));
    }
    public static boolean judge (double[] point1, double[] point2, double[] point3, double[] point) {
        double s1 = getArea(point1, point2, point);
        double s2 = getArea(point1, point3, point);
        double s3 = getArea(point3, point2, point);
        double s = getArea(point1, point2, point3);
        System.out.println(s);
        System.out.println(s1 + s2 + s3);
        return s1 + s2 + s3 == s;
    }
    public static double getDist(double[] p1, double[] p2){
        return Math.sqrt(Math.pow(p1[0] - p2[0], 2) + Math.pow(p1[1] - p2[1], 2));
    }
    public static double getArea(double[] p1, double[] p2, double[] p3){
        double a = getDist(p1, p2);
        double b = getDist(p2, p3);
        double c = getDist(p1, p3);
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
