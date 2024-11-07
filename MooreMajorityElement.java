public class MooreMajorityElement {
    public static void main(String args[]) {
        int[] arr = {1, 1, 2, 1, 3, 5, 1};
        int maj = findMajority(arr);
        if (isMajority(arr, maj)) {
            System.out.println("Majority is " + maj);
        } else {
            System.out.println("Majority doesnt exist");
        }
    }

    public static int findMajority(int[] arr) {
        int count = 0;
        int element = -1;

        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                element = arr[i];
            } else if (element == arr[i]) {
                count++;
            } else {
                count--;
            }
        }
        return element;
    }

    public static boolean isMajority(int[] arr, int n) {
        int count = 0;
        for (int elem : arr) {
            if (elem == n) {
                count++;
            }
        }

        return count > (arr.length / 2);
    }
}
