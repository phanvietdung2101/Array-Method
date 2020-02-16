public class Main {
    public static void main(String[] args) {
        int []arr = {1,3,5,6,7,4,-3,-5,-7};
        int min = minValueOfArray(arr);
        System.out.printf("Gia tri nho nhat cua mang la: %d",min);
    }
    public static int minValueOfArray(int []array){
        int min = array[0];
        for(int element:array){
            if(element < min){
                min = element;
            }
        }
        return min;
    }
}
