 // Mean of array using recursion

public class Main {
    public static void main(String[] args) {
        int arr[]={1,2,3};

        int sum=0;
       int answer =recurrsion(arr , arr.length-1 , sum);
        System.out.println(answer/arr.length);
    }

    private static int recurrsion(int[] arr, int i , int sum) {
        if(i==-1){
            return sum;
        }
        sum=sum+arr[i];
        return recurrsion(arr , i-1 , sum);
    }
}