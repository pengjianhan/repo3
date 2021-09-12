public class h {
    public static void main(int[] arr,int length) {
        for(int i = 1;i < length;i++){
            int j;
            int temp = arr[i];
            for(j=i-1;j >=0 && arr[j] > temp;j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }
    }

}
