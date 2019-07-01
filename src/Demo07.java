public class Demo07 {
    public static void main(String[] args) {
        int sum=0;
        int a=2;
        do{
            sum=sum+a;
            a=a+2;
        }
        while (a<=100);
            System.out.print("100以内的偶数之和为："+sum);

    }
}
