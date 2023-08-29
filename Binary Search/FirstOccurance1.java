import java.util.Scanner;

class FirstOccurance1{
    public static int findFirstOccurance(int[] array, int target){
        int low=0, high=array.length-1, result=-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(array[mid]==target){
                result=mid;
                high=mid-1;
            }else if(array[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int[] array=new int[sc.nextInt()];
        System.out.println("Enter values of an array");
        for(int i=0; i<array.length; i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the target value");
        int target=sc.nextInt();

        // calling function
        int result=findFirstOccurance(array, target);
        if(result == -1){
            System.out.println("Target value not found");
        }else{
            System.out.println("The target value is present at index : "+result);
        }
    }
}