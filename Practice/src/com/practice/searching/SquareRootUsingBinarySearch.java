package com.practice.searching;

public class SquareRootUsingBinarySearch {

    public int mySqrt(int x) {

        int l = 0;
        int r = x;
        int res = 0;

        while (l <= r) {

            int mid = l + (r - l) / 2;

            long target = (long) mid * mid;

            // Perfect square found
            if (target == x) {
                return mid;
            }

            // Mid square is greater than x
            if (target > x) {
                r = mid - 1;
            }
            // Mid square is smaller than x
            else {
                res = mid;
                l = mid + 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        SquareRootUsingBinarySearch obj =
                new SquareRootUsingBinarySearch();

        int x = 8;

        int result = obj.mySqrt(x);

        System.out.println("Square root of " + x + " is: " + result);
    }
}
