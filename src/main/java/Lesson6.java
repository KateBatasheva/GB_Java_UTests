import java.util.Arrays;

public class Lesson6 {

    // 1. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив. Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов, идущих после последней четверки. Входной массив должен содержать хотя бы одну четверку, иначе в методе необходимо выбросить RuntimeException.
    //Написать набор тестов для этого метода (по 3-4 варианта входных данных).
    //Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].

    public static void main (String[] args){

        int [] arrtest = {3,4,5,6,6,7};
        arrtest = after4(arrtest);
         System.out.println(Arrays.toString(arrtest));

    }

    public static int[] after4 (int[] arr){
        if (arr.length <1){
            throw new RuntimeException();
        }
        int count = 0;
        int i;
        for (i = 0; i < arr.length ; i++) {
            if (arr[i] == 4) {
                count++;
                break;
            }
        }
        if (count ==0) {
            throw new RuntimeException();
        }
        int [] arr2 = new int[arr.length-i-1];
        i++;

        for (int j = 0; j <arr2.length ; j++, i++) {
            arr2[j] = arr[i];
        }
        return arr2;
    }
}
