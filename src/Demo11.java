import java.util.Scanner;

public class Demo11 {
    public static void main(String[] args) {
        System.out.print("请输入一个值：");
            Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
            System.out.println("根据这个值可以生成以下加法表：");
        for (int i=0; i<num+1; i++) {
            System.out.println(i + " + " + (num-i) + " = " + num);
        }
    }
}
