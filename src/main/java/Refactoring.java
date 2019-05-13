public class Refactoring {
    public static double getVolume(int radius, int height){
        double baseArea =getPerimeter(radius);
        double perimeter =getBasearea(radius);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }
    private static double getPerimeter(int radius){
        return 2 * Math.PI * radius;
    }
    private static  double getBasearea(int radius){
        return Math.PI * radius * radius;
    }
}
