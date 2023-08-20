// time complexity is O(m*n)
// space complexity is O(1)
import java.util.Arrays;

public class Array2D {
    public static void rotateMethod(int[][] array){
        int m=array.length;
        int n=array[0].length;

        // trnaspose rows<=>collums
        for(int i=0; i<m; i++){
            for(int j=i; j<n; j++){
                int temp=array[i][j];
                array[i][j]=array[j][i];
                array[j][i]=temp;
            }
        }
        // swap of colums
        for(int i=0; i<m; i++){
            int li=0;
            int ri=n-1;
            while(li<ri){
                int temp=array[i][li];
                array[i][li]=array[i][ri];
                array[i][ri]=temp;
            li++;
            ri--;
            }
        }

    }
    public static void main(String[] args) {
        int array[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("........................");

        rotateMethod(array);
        for(var mat : array){
            System.out.println(Arrays.toString(mat));
        }

        // for(int i=0; i<array.length; i++){
        //     for(int j=0; j<array[i].length; j++){
        //         System.out.print(array[i][j]+" ");
        //     }
        //     System.out.println();
        // }
    }
}
