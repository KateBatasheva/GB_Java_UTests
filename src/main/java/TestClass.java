public class TestClass {

    public int[] after4(int[] arr) {
        if (arr.length < 1) {
            throw new RuntimeException();
        }
        int count = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                count++;
                break;
            }
        }
        if (count == 0) {
            throw new RuntimeException();
        }
        int[] arr2 = new int[arr.length - i - 1];
        i++;

        for (int j = 0; j < arr2.length; j++, i++) {
            arr2[j] = arr[i];
        }
        return arr2;
    }

    public boolean test14(int[] arr) {
        int i;
        int conut4 = 0;
        int count1 = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                conut4++;
            }
            if (arr[i] == 1) {
                count1++;
            }
            if (arr[i] != 4) {
                if (arr[i] != 1) {
                    return false;
                }
            }
        }
        if (conut4 == 0 || count1 == 0) {
            return false;
        }
        return true;
    }
}