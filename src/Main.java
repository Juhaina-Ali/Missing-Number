// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] arr1={1,2,4,6,3,7,8};
        System.out.println("Missing number from array : "+missingNumber(arr1));
    }
    public static int missingNumber(int[] arr){
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        int restSum=0;
        for (int i=0;i<arr.length;i++){
            restSum+=arr[i];
        }
        int missingNumber=sum-restSum;
        return missingNumber;
    }
}