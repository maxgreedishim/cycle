public class MyltiplayParams {
    public static String concat (String... args) {
        System.out.println(args.length);
        return args[0] + args [1] + args [2];

    }

    public static void main(String[] args) {
        System.out.println(concat("Hello", " word", "!!!"));
    }
}
