public class PelindromicArr3 {
    public static void main(String[] args) {
        int array[]={1,2,3,4,3,2,1};
        int flag=0;
        int n=array.length;
        for(int i=0; i<n/2; i++){
            if(array[i] != array[n-i-1]){
                flag++;
                System.out.println("it is not a pelindromic array..");
            }
        }
        if(flag == 0){
            System.out.println("it is pelindromic array..");
        }
    }
}
