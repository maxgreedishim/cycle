enum Colors {
    RED,
    GREEN,
    BLUE,
    UNKNOWN
}
public class EnumExample {
    private static Colors color = Colors.GREEN;
    public static void main(String[] args) {
        switch (color) {
            case RED -> System.out.println("Красный");
            case GREEN -> System.out.println("Зеленый");
            case BLUE -> System.out.println("Голубой");
            default -> System.out.println("Не определен");
        }
    }
}
