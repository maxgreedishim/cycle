public class Work {
    private final int age; // поле field

    public Work(int _age) { // параметр age
        int x = 10; // переменая
        this.age = _age + x; // присваивание полю значения

    }
    @Override
    public String toString (){

        return "age = " + this.age;
    }
    static int привет = 10;
    static int sеннен = 23;
    static int $for = 132;


    public static void main(String[] args) {

        System.out.println(привет + $for + sеннен );
    }
}
