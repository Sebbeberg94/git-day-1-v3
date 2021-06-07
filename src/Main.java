public class Main {
    public static void main(String[] args) {
        System.out.println(returnInt(5));
        System.out.println(returnMulti(2, 5));
        System.out.println(returnIntUp(5));
        System.out.println(returnIntDown(5));
    }
    public static int returnInt(int x) {
        return x + 1;
    }
    public static int returnMulti(int x, int y) {
        return x * y;
    }
    public static int returnIntDown(int x) {
        return x - 1;
    }
}
