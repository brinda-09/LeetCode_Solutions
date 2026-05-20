class Solution {

    public long calPow(long a, long base, long lim) {

        long ans = 1;

        if(a == 0)
            return 0;

        while(base > 0) {

            if(base % 2 == 1) {

                if(ans > lim / a)
                    return lim + 1;

                ans = ans * a;
            }

            base = base >> 1;

            if(base > 0) {

                if(a > lim / a)
                    return lim + 1;

                a = a * a;
            }
        }

        return ans;
    }

    public int leftVal(int l, int r, int k) {

        int lo = 0;
        int hi = 1000000000;
        int ans = -1;

        while(lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            long p = calPow(mid, k, r);

            if(p >= l) {
                ans = mid;
                hi = mid - 1;
            }
            else {
                lo = mid + 1;
            }
        }

        return ans;
    }

    public int rightVal(int l, int r, int k) {

        int lo = 0;
        int hi = 1000000000;
        int ans = -1;

        while(lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            long p = calPow(mid, k, r);

            if(p <= r) {
                ans = mid;
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
        }

        return ans;
    }

    public int countKthRoots(int l, int r, int k) {

        int a = leftVal(l, r, k);
        int b = rightVal(l, r, k);

        return (b - a + 1);
    }
}