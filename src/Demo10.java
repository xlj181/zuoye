import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {

            int fenshu;
            int sum = 0;
            double pingfen;

            Scanner scan = new Scanner(System.in);
            System.out.print("输入学生姓名：");
            String name = scan.next();
            for (int i = 0; i < 5; i++) {
                System.out.print("请输入5门功课中第" + (i + 1) + "门课的成绩：");
                fenshu = scan.nextInt();
                if(fenshu<0){
                    System.out.println("抱歉，分数录入错误，请重新进行录入！");
                    break;
                }

            }


        }
    }
