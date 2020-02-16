import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Khoi tao 1 ma tran 2 chieu voi x hang y cot");
        System.out.println("Nhap x");
        int x = sc.nextInt();
        System.out.println("Nhap y");
        int y = sc.nextInt();

        int[][] matrix = new int[x][y];
        // Duyet ma tran gan gia tri cho cac phan tu
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.printf("Nhap phan tu o hang %d cot %d : ",i,j);
                matrix[i][j] = sc.nextInt();
            }
        }
        // In ra ma tran
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        // Phan tu lon nhat trong ma tran
        int max = matrix[0][0];
        int index_x = 0, index_y = 0 ;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] > max) {
                    max = matrix[i][j];
                    index_x = i;
                    index_y = j;
                }
            }
        }
        System.out.printf("Phan tu lon nhat cua ma tran la %d tai hang %d cot %d",max,index_x,index_y);
    }
}
