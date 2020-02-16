

public class Main {
    public static void main(String[] args) {
        int []arr1 = {1,2,3};
        int []arr2 = {4,5,6,7};

        int totalLength = arr1.length + arr2.length;
        int[] arr = new int[totalLength];

        int i = 0;
        while(i < arr1.length){
            arr[i] = arr1[i];
            i++;
        }
        i = 0;
        int j = arr1.length;
        while(i < arr2.length){
            arr[j] = arr2[i];
            i++;
            j++;
        }

        for(int element:arr){
            System.out.println(element);
        }
    }
}
