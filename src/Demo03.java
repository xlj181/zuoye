import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
      System.out.println("**************************************");
        System.out.println("请选择购买的商品编号;");

        String q="1.T恤",w="2.网球鞋",e="3.网球拍";
        System.out.println(q+"    "+w+"    "+e);
        System.out.println("**************************************");
        Scanner scan=new Scanner(System.in);
        System.out.print("请输入商品编号：");
        int u=scan.nextInt();
        switch (u){
            case 1:
                System.out.println(q+"   "+"￥245.0");
                break;
            case 2:
                System.out.println(w+"    "+"￥400.0");
                break;
            case 3:
                System.out.println(e+"    "+"￥500.0");
        }
        System.out.println();

        System.out.print("是否继续(y/n):");
        String qq=scan.next();
        while (qq.equals("y")){

            System.out.println();
            System.out.print("是否继续(y/n):");
            qq=scan.next();
        }
        System.out.println("程序结束！");


    }
}

