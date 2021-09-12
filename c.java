import java.util.Scanner;
    public class c{
        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            System.out.println("求最大公因数：");
            int b=reader.nextInt();
            System.out.println("请输入第一个数="+b);
            int a=reader.nextInt();
            System.out.println("请输入第二个数="+a);
            int k;
            System.out.print("gcd("+b+","+a+")=");
            do {
                k=b%a;
                b=a;
                a=k;
            } while (k!=0);
            System.out.println(b);
        }
    }


