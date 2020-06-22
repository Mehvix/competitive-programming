import java.util.*;

class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int lo = 0, hi = n - 1;
        while (lo <= hi) {  // doesn't fail [0,0]
            int mid = lo + ((hi - lo) / 2);
            if (citations[mid] == n - mid) return n - mid;
            else if (citations[mid] < n - mid) lo = mid + 1;
            else hi = mid - 1;
        }
        return n - lo;
    }


    public static void main(String[] args) {
        Solution obj = new Solution();
    }


}
