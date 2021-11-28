import Point.Point;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        float a = sc.nextFloat();

        Point p1 = new Point();
        p1.setabsicces(a);
        System.out.println("l abssicces est kima haka " + p1.getAbsicces());

    }
}
