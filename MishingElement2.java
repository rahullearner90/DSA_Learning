public class MishingElement2 {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6,7,8,9,10};
        int n=arr.length;   
        int sum$of$natural=(n+1)*(n+2)/2;
        int sum$of$nums=0;
        for(int i=0; i<n; i++){
            sum$of$nums+=arr[i];
        }
        System.out.print("mishing element is : ");
        System.out.print(sum$of$natural-sum$of$nums);
    }
}
