import java.util.Scanner;

public class b {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("输出几个斐波那契数？");
        int n=input.nextInt();
                int num1 = 1;
                int num2 = 1;
                int count = 1;
                System.out.print("1 1 ");
                while(count <=n){
                    int temp = num1;
                    num1 = num2;
                    num2 += temp;
                    System.out.print(num2 + " ");
                    count +=1;
                }
            }
        }


