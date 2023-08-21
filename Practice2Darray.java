import java.util.Scanner;

public class Practice2Darray {
    public static int prefix(int[][] array,int r1,int c1, int r2, int c2){
        int sum=0;
        for(int i=r1; i<=r2; i++){
            for(int j=c1; j<=c2; j++){
                sum+=array[i][j];
            }
        }
        return sum;
    }
    public static int sum(int[][] array,int r, int c){
        int m=array.length;
        int sum=0;
        for(int i=r; i<m; i++){
            int n=array[i].length;
            for(int j=c; j<n; j++){
                sum+=array[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Rows For Matrix : ");
        int m=sc.nextInt();
        System.out.print("Enter Collum For Matrix : ");
        int n=sc.nextInt();

        // System.out.println("Enter Values one by one..");
        int[][] array= new int[m][n];
        for(int i=0; i<m; i++){
            System.out.println("Enter values for Row "+(i+1)+":");
            for(int j=0; j<n; j++){
                array[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the value of r1 coordinate : ");
        int r1=sc.nextInt();
        System.out.println("Enter the value of c1 coordinate : ");
        int c1=sc.nextInt();
        System.out.println("Enter the value of r2 coordinate : ");
        int r2=sc.nextInt();
        System.out.println("Enter the value of c2 coordinate : ");
        int c2=sc.nextInt();
        
        int sum=prefix(array, r1, c1, r2, c2)   ;
        System.out.println("Res : "+sum);
        

        // int sum1=sum(array, 0, 2);
        // System.out.println("row :0, collum :2 =>"+sum1);

        // int sum2=sum(array, 2, 2);
        // System.out.println("row :2, collumn :2 =>"+sum2);
    }
}
