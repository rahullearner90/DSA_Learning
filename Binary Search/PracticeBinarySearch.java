import java.util.Scanner;

public class PracticeBinarySearch {

public static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int arr[]=new int[sc.nextInt()];
        System.out.println("Enter Element of the array : ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
    return arr;        
}

public static int findValue(int[] array, int target){
    int low=0, high=array.length-1, result=-1, mid=0;
    while(low<=high){
        mid=low+(high-low)/2;
        if(array[mid]<target){
            high=mid+1;
        }else if(array[mid]>target){
            low=mid-1;
        }else{
            return mid;
        }
    }
    return result;
}

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] array= takeInput();
        System.out.print("Enter Target Value : ");
        int target=sc.nextInt();

        int result=findValue(array, target);

        if(result==-1){
            System.out.println("Target Value not found : ");
        }else{
            System.out.println("Target Value is "+ result);
        }

    }
}
