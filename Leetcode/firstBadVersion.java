class Solution {
    boolean isBadVersion(int version) {
        boolean[] m = new boolean[]{false, false, false, true, true};
        return m[version];
    }

    public int firstBadVersion(int n) {
        int min = 1;
        int max = n;

        while (min < max) {
            int mid = min + (max - min) / 2;  // https://ai.googleblog.com/2006/06/extra-extra-read-all-about-it-nearly.html
            if (isBadVersion(mid)) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        return min;
    }
}