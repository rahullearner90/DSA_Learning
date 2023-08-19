
class A{
    public int recursion(int n){
        if(n==0){
            return 0;
        }
        return n+recursion(n-1);
    }
}


class Recursion1{

    public static int rec1(int n){
        if(n==0){
            return 0;
        }
        return n + rec1(n-1);
    }

    public static void main(String[] args) {
        A a=new A();
        int x=a.recursion(10);
        System.out.println(x);

        int y=rec1(10);
        System.out.println(y);
    }
}