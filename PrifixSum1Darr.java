import java.util.Arrays;

class PrifixSum1Darr{
    public static void presum(int[] array){
        int m=array.length;
        int sum=0;
        for(int i=1; i<m; i++){
            sum=array[i]+array[i-1];
            array[i]=sum;
        }
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        System.out.println(Arrays.toString(arr));
        presum(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}