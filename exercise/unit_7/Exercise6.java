package exercise.unit_7;

public class Exercise6 {
    public static void main(String[] args) {
        int[] test = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5 };
        int[] test2 = { 1, 2, 3, 4, 5, 6, 5, 6 };

        System.out.println(numberOfDuplicates(test));
        System.out.println(numberOfDistinctValues(test));

        System.out.println(numberOfDuplicates(test2));
        System.out.println(numberOfDistinctValues(test2));
    }

    public static int numberOfDuplicates(int[] array) {
        int count = 0;
        int index = 0;
        int[] tmp = init(array.length);

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j] && contains(tmp, array[i])) {
                    count++;
                }

                if (!contains(tmp, array[i])) {
                    tmp[index++] = array[i];
                }
            }
        }

        return count;
    }

    public static int numberOfDistinctValues(int[] array) {
        int[] tmp = init(array.length);
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (!contains(tmp, array[i])) {
                tmp[index++] = array[i];
            }
        }

        int[] result = new int[index];
        System.arraycopy(tmp, 0, result, 0, index);
        return result.length;
    }

    public static int[] init(int size) {
        int[] tmpArray = new int[size];
        for (int i = 0; i < tmpArray.length; i++) {
            tmpArray[i] = -1;
        }

        return tmpArray;
    }

    public static boolean contains(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return true;
            }
        }

        return false;
    }
}
