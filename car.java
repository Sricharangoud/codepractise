import java.util.*;
public class car {
    public static void main(String[] args ) {
        Scanner sc = new Scanner (System.in);
        int tv = sc.nextInt();
        int tw = sc.nextInt();
        int cars = (tw-(2*tv))/2;
        int bikes = tv-cars;
        System.out.println("Car count =" + cars);
        System.out.println("Bikes count =" + bikes);
    }
}