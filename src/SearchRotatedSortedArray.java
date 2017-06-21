/**
 * Created by Mia on 6/21/17.
 */
class SearchRotatedSortedArray {
    public static int searchRotatedArray(int[] A, int target) {
        if (A == null || A.length == 0) {
            return -1;
        }
        int low = 0;
        int high = A.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (A[mid] == target) return mid;

            if (A[low] <= A[mid]) {
                if (target >= A[low] && target < A[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target > A[mid] && target <=A[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return A[low] == target ? low : -1;

    }
}
