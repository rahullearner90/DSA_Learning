public class DuplicateEle {
    public static void main(String[] args) {
        int array[]={1,2,3,3,4,5,6,6,7,8,9};
        int n=array.length;
        for(int i=0; i<n; i++){
            for(int j=1+i; j<n; j++){
                if(array[i]==array[j]){
                    System.out.println("Dublicate is :"+array[i]);
                }
            }
        }
    }
}
