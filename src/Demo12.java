import java.util.Scanner;

public class Demo12 {
    public static void main(String[] args) {
           int a=0;
           double fenshu;
        Scanner scan=new Scanner(System.in);
        System.out.print("输入班级总人数：");
        int b=scan.nextInt();

        for (int i = 0; i < 3; i++) {
            System.out.print("请输入3门功课中第" + (i + 1) + "门课的成绩：");
            fenshu = scan.nextInt();
            if(fenshu>=80){
                a+=1;
                continue;
            }
            System.out.println("80分以上的学生人数是："+a);
       }
        scan.close();
        double pj=(a/ 3.0)*100;
        System.out.println("80分以上的学生所占的比例为："+pj+"%");
  }

}