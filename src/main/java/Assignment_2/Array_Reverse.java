package Assignment_2;

public class Array_Reverse {

    public static void main(String[] args){

        int arr[] = new int[5];
        arr[0]=54;
        arr[1]=43;
        arr[2]=2;
        arr[3]=1;
        arr[4]=5;
        System.out.println("the original array is : ");
        for(int i=0; i<arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("after reverse : ");
        //for traverse
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+ " ");
        }
    }
}
