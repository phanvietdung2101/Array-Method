public class Main {
    public static void main(String[] args) {
        int [][]arr = {
                {1,2,3},
                {4,5,6},
                {7,8}
        };
        System.out.println(sumOfCol(arr,2));
    }
    public static int sumOfCol(int[][] arr,int col){
        int sum = 0, i = 0;
        while(i <  arr.length){
            if(col < arr[i].length){
                sum += arr[i][col];
            }
            i++;
        }
        return sum;
    }
}
