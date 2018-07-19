public class Main {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 101; i <= 200; i += 2) {
            int j;
            for (j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    System.out.print(i+"  ");
                    break;
                }
            }
        }
        System.out.println("101-200之间素数的个数为：" + count);
    }
}