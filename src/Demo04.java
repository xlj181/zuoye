import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String a=" ";
        do{
            System.out.println("上机编程程序！");
            System.out.print("合格了吗？(y/n)");
             a=scan.next();
            System.out.println();
        }
        while (a.equalsIgnoreCase("n"));
        System.out.println("恭喜你通过了测试！");
    }
}
