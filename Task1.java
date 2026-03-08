public class Task1 {
    public static boolean isPointInsideCircle(double centerX, double centerY, double radius, double pointX, double pointY) {
        double dx = pointX - centerX;
        double dy = pointY - centerY;
        return dx * dx + dy * dy <= radius * radius;
    }

    public static void main(String[] args) {
        double centerX = 0, centerY = 0, radius = 5;
        double pointX = 3, pointY = 4;
        boolean inside = isPointInsideCircle(centerX, centerY, radius, pointX, pointY);
        System.out.println("Точка (" + pointX + ", " + pointY + ") " +
                (inside ? "внутри" : "вне") + " круга.");
    }
}
