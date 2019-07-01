import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        String j = null;
        do {
            int fenshu;
            int sum = 0;
            double pingfen;
            Scanner scan = new Scanner(System.in);
            System.out.print("输入学生姓名：");
            String name = scan.next();
            for (int i = 0; i < 5; i++) {
                System.out.print("请输入5门功课中第" + (i + 1) + "门课的成绩：");
                fenshu = scan.nextInt();
                sum = sum + fenshu;
            }
            pingfen = sum / 5;
            System.out.println(name + "的平均分是：" + pingfen);
            System.out.print("要继续输入？（y/n):");
            j = scan.next();
        }while (j.equals("y")||j.equals("Y"));
        System.out.println("继续输入");
    }
}