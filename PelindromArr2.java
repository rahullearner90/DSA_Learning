// 
public class PelindromArr2 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3,2,1};
        for(int i=0; i<arr.length/2; i++){
            if(arr[i]!=arr[arr.length-i-1]){
                System.out.println("it is not pelindromic array..");
            }else{
                System.out.println("it is pelindromic array");
            }
        }
    }
}
