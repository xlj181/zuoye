public class Demo14 {
    public static void main(String[] args) {
        //行数
        for (int i = 1; i <= 5; i++) {
            //空格
            for (int j = 1; j <= 5- i; j++) {
                System.out.print(" ");
            }
            //列数；星星
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
                 System.out.println();
        }
        //再补一个4行的倒三角形
        for(int i=1;i<=4;i++){
            //空格
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            //星星
            for(int j=1;j<=2*(5-i)-1;j++){

                System.out.print("*");
            }

                    System.out.println();
        }

    }
}