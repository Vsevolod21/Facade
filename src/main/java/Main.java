public class Main {
    public static void main(String[] args) {

        BinOps bins = new BinOps();

        String resultSum = bins.sum("10", "11"); // 2 + 3
        System.out.println(resultSum); // 5 - 101

        String resultMult = bins.mult("10", "11"); // 2 * 3
        System.out.println(resultMult); // 6 - 110
    }
}
