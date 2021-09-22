public class LoopsExample {
    public static void main(String[] args) {

      /*  for (int i = 0; i < 5; i++) {
            System.out.println(i + " Цикл фор");
        }
*/
        double w = 0.3;
        while (w < 0.9) {
            System.out.println(w);
            w = Math.random();
        }
        w = 0.3;
        while (true) {
            System.out.println(w);
            w = Math.random();
            if (w > .9) {
                return;
            }
        }
      /*  for (int i = 0; i <= 30; i++) {
            if (i % 3 != 0) {
                continue;
            }
            System.out.println(i);
        }*/

      /*  int b = (int) Math.round (Math.random() * 100);
        System.out.println(b);*/
    }



}
