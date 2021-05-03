import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    }

    public static int[] arrTaskOne(int[] arr){
        for (int i = arr.length - 1; i >=0 ; i--) {
            if(arr[i] == 4){
                return Arrays.copyOfRange(arr,i + 1, arr.length);
            }
        }throw new RuntimeException("В массиве нет четверки");
    }

    public static boolean arrTaskTwo(int[] arr){
        boolean numberOne = false;
        boolean numberFour = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 1 && arr[i] != 4){
                return false;
            }
            if(arr[i] == 1){
                numberOne = true;
            }
            if(arr[i] == 4){
                numberFour = true;
            }
        }
        return numberOne && numberFour;
    }
}
