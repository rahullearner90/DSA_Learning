import java.util.Scanner;

class Prefix{
    Scanner sc=new Scanner(System.in);
int[][] array;
    // Taking input from user
        Prefix(){
        System.out.print("Enter Row for matrix : ");
        int m=sc.nextInt();
        System.out.print("Enter Collum for matrix : ");
        int n=sc.nextInt();
        int[][] array=new int[m][n];
        System.out.println("Enter Elements for the Matrics : ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                array[i][j]=sc.nextInt();
            }
        }
        this.array = array;
    }

    // Prefix sum of the matrix by Row wise
    public void sumRow(){
        int m=array.length;
        int n=array[0].length;
        for(int i=0; i<m; i++){
            for(int j=1; j<n; j++){
                array[i][j]+=array[i][j-1];
            }
        }
    }

    // Prefix sum of the matrix by Collum wise
    public void sumCollum(){
        int m=array.length;
        int n=array[0].length;
        for(int i=1; i<m; i++){
            for(int j=0; j<n; j++){
                array[i][j]+=array[i-1][j];
            }
        }
    }

    // Prefix sum of the element
    public int prefixSum(int c1, int r1, int r2, int c2){
        int repeated_region=0, top_right=0, buttom_left=0, sum=0, result=0;
        repeated_region=array[r1-1][c1-1];
        buttom_left=array[r2][c1-1];
        // top_right=array[r1-1][c1+1];
        top_right=array[r1-1][c2];
        sum=array[r2][c2];
        
        result=sum-top_right-buttom_left+repeated_region;
        return result ;
    }
    
    // Calling methods
    public void sumCall(){
        sumRow();
        sumCollum();
    }

    public void disp(int result){
        System.out.println("Your Sum is : "+result);
    }
}
public class PracticePrifixSum {
    public static void main(String[] args) {
        Prefix p1=new Prefix();
        p1.sumCall();
        
        int result=p1.prefixSum(2, 2, 3, 3);

        p1.disp(result);
    }
    
}
