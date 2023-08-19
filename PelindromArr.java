class PelindromArr{
    public static void main(String[] args) {
// Trying self logic without studing actual logic 
// logic is good but time comlexity is worst and space complexity is also worst
        int count=1;


        int arr[]={1,2,3,4,3,2,1};

        int arr2[]=new int[arr.length];

        for(int i=0; i<arr.length; i++){
            arr2[i]=arr[i];
            System.out.println(arr2[i]);
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr[i]==arr2[j]){
                    count++;
                    if(count/2==arr.length){
                        System.out.println("It is pelindrome array..");
                    }
                }
            }
        }

        System.out.println("count : "+ count);
        System.out.println("Length : "+arr.length);
        // System.out.println(arr[0]==arr2[0]);

        

    }

}