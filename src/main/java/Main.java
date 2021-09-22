public class Main {
    public static void main(String[] args) {
        int age = 6;
        switch (age){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Вы младенец");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Вы ребенок");
                break;
            default:
                System.out.println("Вы взрослый");
        }

    }
}
