class A{
    public static void main(String[] args) {
        // if(1){
        //     System.out.println("ok");
        // }
        // int a[]=new int[5];
        // System.out.println(a);

        StringBuilder sb1=new StringBuilder("123");
        String s1 = "123";
        sb1.append("abc");
        // s1.concat("abc");
        s1=s1.concat("abc");
        System.out.println(sb1+" "+s1);
    }
}