import java.util.Scanner;
public class t1046 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(a & (a - 1));
    }
}
