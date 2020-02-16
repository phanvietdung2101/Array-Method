import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10,4,6,7,8,0,0,0,0,0};
        Scanner sc = new Scanner(System.in);

        int index, element;
        System.out.println("Nhap vi tri can them: ");
        index = sc.nextInt();
        System.out.println("Nhap gia tri phan tu can them: ");
        element = sc.nextInt();

        addElement(arr,element,index);
        for(int x:arr){
            System.out.print( x + "\t");
        }
    }
    public static void addElement(int []arr, int element, int index ){
        if(index <= 1 || index >= arr.length - 1)
            return;
        for(int i = arr.length - 1; i > index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = element;
    }
}
