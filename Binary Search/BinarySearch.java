class BinarySearch{
    public static int  binarySearch(int[] array, int x){
        int mid=0;
        int low=0;
        int high=array.length-1;
        while (low<=high) { 
            mid=low+(high-low)/2;
            if(array[mid]==x){
                return mid;
            }else if (array[mid]<x){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return 0;
    }
    public static void main(String args[]){
        int[] array={1,2,3,4,5,6,7,8,9,10};
        int x=binarySearch(array, 0);
        if(x==0){
            System.out.println("Element not Found");
        }else{
            System.out.println("Element Found at index no : "+x);
        }
    }
}