public class Main {
    public static void main(String[] args) {

        Object[] array = {
                new Object[]{3, 6, 4, 76, 4},
                new Object[]{1, new Object[]{4, 3}, 6},
                4,
                new Object[]{new Object[]{12, 43}, 5, 43}
        };

        printArray(array, "");

    }

    public static void printArray(Object[] arr, String prefix) {

        for (int i = 0; i < arr.length; i++) {
            String newPrefix = String.format("%s -> %d ", prefix, i);
            if (arr[i] instanceof Object[]) {
                printArray((Object[]) arr[i], newPrefix);
            }
            else System.out.printf("[%s] %d %n", newPrefix, (int) arr[i]);
        }

    }
}
