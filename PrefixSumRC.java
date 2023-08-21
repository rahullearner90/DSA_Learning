import java.util.Arrays;
// Row wise prefix sum
public class PrefixSumRC {
    public static void prefixSumR(int[][] array){
        int m=array.length;
        for(int i=0; i<m; i++){
            int n=array[i].length;
            for(int j=1; j<n; j++){
                array[i][j]+=array[i][j-1];
            }
        }
    }

    // collum wise prefix sum
    public static void prefixSumC(int[][] array){
        int m=array.length;
        for(int i=1; i<m; i++){
            int n=array[i].length;
            for(int j=0; j<n; j++){
                array[i][j]+=array[i-1][j];
            }
        }
    }
    // sum region here
    public static int sumRegion(int[][] array, int r1, int c1, int r2, int c2){
        int sum=0, left=0, up=0, repeated_region=0, result=0;
        sum=array[r2][c2];
        up=array[r1-1][c2];
        left=array[r2][c1-1];
        repeated_region=array[r1-1][c1-1];

        return  result=sum-left-up+repeated_region;
    }
    public static void main(String[] args) {
        int array[][]={
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1}
        };

        for(int[] v : array  ){
            System.out.println(Arrays.toString(v));
        }

        System.out.println("..................");

        prefixSumR(array);

        for(int[] v : array  ){
            System.out.println(Arrays.toString(v));
        }

        // for(int i=0; i<array.length; i++){
        //     for(int j=0; j<array[i].length; j++){
        //         System.out.print(array[i][j]);
        //     }
        //     System.out.println();
        // }

        System.out.println("......................");

        prefixSumC(array);

        for(int[] v : array  ){
            System.out.println(Arrays.toString(v));
        }

    }
}
