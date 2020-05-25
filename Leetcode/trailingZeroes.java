class Solution {
    public int trailingZeroes(int n) {
        if (n == 0) return 0;

        int cnt = n/5 + trailingZeroes(n/5);
/*        long num = 30;
        for (int i = n; i > 1; i--){
            num *= i;
        }

        int cnt = 0;
        System.out.println(num);

        while (num != 0){
            if (num % 10 == 0) {
                cnt ++;
                num /= 10;
            } else {
                break;
            }
        }*/

        return cnt;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.trailingZeroes(13));
        System.out.println(obj.trailingZeroes(5));
    }
}