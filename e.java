public class e {
    public static void main(String[] args){
        int[] b={51,32,9,49,54,98,15,74};
        double temp=0,arr=0;
        for(int i=0;i<b.length;i++){
            temp+=b[i];
            arr=temp/b.length;
        }
        System.out.println("该数列的平均数为"+arr);
        System.out.println("数列中大于该数列平均值的元素有");
        for(int i=0;i<b.length;i++){
            if(b[i]>arr){
                System.out.print(b[i]+",");
            }
        }

    }
}


