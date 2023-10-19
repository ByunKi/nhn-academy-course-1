package exercise.unit_7;

public class Exercise7 {

    public static void main(String[] args) {
        int[] test = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5 };
        int[] test2 = { 1, 2, 3, 4, 5, 5, 6, 6, 7 };

        int[] result = removeDuplicates(test);
        printArray(result);
        System.out.println();

        result = removeDuplicates(test2);
        printArray(result);
        System.out.println();
    }

    public static int[] removeDuplicates(int[] array) {

        int index = 0;
        int[] tmp = Exercise6.init(array.length);
        for (int i = 0; i < array.length; i++) {
            if (!Exercise6.contains(tmp, array[i])) {
                tmp[index++] = array[i];
            }
        }

        int[] result = new int[index];
        System.arraycopy(tmp, 0, result, 0, index);
        return result;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}