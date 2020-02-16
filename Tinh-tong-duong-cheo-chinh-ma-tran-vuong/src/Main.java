public class Main {
    public static void main(String[] args) {
        int[][] matrix= {
                {1,2,3,4,5},
                {3,4,9,6,4},
                {4,2,1,6,0},
                {3,3,7,8,8},
                {5,4,1,3,7}
        };
        int sum = 0;

        for(int i = 0; i < matrix.length; i++){
            sum += matrix[i][i];
        }

        System.out.println("Tong duong cheo chinh ma tran vuong: " + sum);
    }
}
