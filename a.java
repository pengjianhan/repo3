import java.io.IOException;
import java.util.Scanner;
public class a {
    public static  void main(String[] args) throws IOException {
        Scanner input =new Scanner(System.in);
        System.out.println("请输入年份");
      int year =input.nextInt();
        int j=0;
       for(int i=year ;i<=year+100;i++ )
        {
            if ( (year % 4 == 0 && year % 100 != 0) ||year % 400 == 0) {
                j++;
               }
            };
        System.out.println("一生中有"+j+"个闰年");
        }

    }

