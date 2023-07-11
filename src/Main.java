public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        arr = reverseArray(arr);
        for(int arrayElement:arr){
            System.out.println(arrayElement);
        }
    }
    public static int[] reverseArray(int[] array) {
        int arrayLength = array.length;
        int[] returnArray = new int[arrayLength];
        int returnIndex = 0;
        for(int i = arrayLength -1; i>=0; i--){
            returnArray[returnIndex] = array[i];
            returnIndex++;
        }
        return returnArray;
    }
}