public class mishingElement {
    public static void main(String[] args) {
        int array[]={1,2,3,5,6,7};
        int n=array.length;
        int sum_of_natural=(n+1)*(n+2)/2;
        int sum_of_element=0;
        for(int i=0; i<n; i++){
            sum_of_element += array[i];
        }
        System.out.println("Sum of element : "+sum_of_element);
        System.out.println("sum of natural : "+sum_of_natural);
        System.out.println("mishing element is : ");
        System.out.println(sum_of_natural-sum_of_element);
    }
}
