public class RevarsalArray2 {
    public static void main(String args[]){
        int arrray[]={1,2,3,4,5,6,7,8,};
        int n=arrray.length;
        int flag=0;
        for(int i=0; i<n; i++){
            int temp=arrray[i];
            arrray[i]=arrray[n-i-1];
            arrray[n-i-1]=temp;
        }
        System.out.println("Revarsal array is : \n[");
        for (int i = 0; i < n; i++) {
            System.out.print(arrray[i]);
        }
        System.out.print("]");
    }
}
