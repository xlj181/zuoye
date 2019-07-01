import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("合格了吗？（y/n):");
        String result = scan.next();
        while (result.equalsIgnoreCase("n")) {
            System.out.println("上午阅读教材！");
            System.out.println("下午上机编程！");
            System.out.println();

            System.out.print("合格了吗？（y/n):");
            result=scan.next();
    }
            System.out.println("完成学习任务！");
    }
}
