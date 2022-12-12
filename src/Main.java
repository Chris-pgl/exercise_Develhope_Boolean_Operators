public class Main {
    public static void main(String[] args) {
        // A
        int x = 2;
        boolean result = x <= x && !true;
        System.out.println(result);

        //B
        int y = 3;

        boolean result2 = !false && y > x;
        System.out.println(result2);

        //C
        boolean result3 = (!false || true);
        System.out.println(result3);

        //D
        int c = 6;
        boolean result4 = c > c ^ !(true && true);
        System.out.println(result4);




    }
}