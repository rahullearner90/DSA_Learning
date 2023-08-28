import java.util.Scanner;

public class BinarySearch2 {
    public static int[] createArray(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size Of The Array : ");
        int[] array=new int[sc.nextInt()];
        System.out.println("Enter Values For The Matrix : ");
        for(int i=0; i<array.length; i++){
            array[i]=sc.nextInt();
        }
        return array;
    }
    public static int binarySearch(int[] array ,int x){
        int low=0, high=array.length, mid=0 ;
        while(low<=high){
            mid=low+(high-low)/2;
            if(array[mid]==x){
                return mid;
            }else if(x<array[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array=createArray();
        System.out.print("Enter target Value : ");
        int x=sc.nextInt();
        int v=binarySearch(array, x);
        
        if(v==0){
            System.out.println("Element not found ");
        }else{
            System.out.println("Element found at index : "+v);
            System.out.println("Which is "+array[v]);
        }



        // for(int i=0; i<array.length; i++){
        //     System.out.println(array[i]);
        // }
    }
}
