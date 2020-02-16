import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,0,0,0,0};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phan tu can xoa: ");
        int ele = sc.nextInt();
        deleteElement(arr,ele);

        for(int element:arr){
            System.out.println(element);
        };


    }
    public static void deleteElement(int[] arr,int ele){
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == ele){
                index = i;
                break;
            }
        }
        if(index >= 0) {
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
        }
    }
}
