Input : 12345
Output : 12421

class Solution {
        Vector<Integer> generateNextPalindrome(int num[], int n) 
       {
        Vector<Integer> v = new Vector<>();
        int m = n / 2;
        int l = m - 1;
        int r = (n % 2 == 1) ? m + 1 : m;
        while (l >= 0 && num[l] == num[r]) {
            l--;
            r++;
        }
        int carry = 0;
        if (l < 0 || num[l] < num[r]) {
            carry = 1;
        }
        l = m;
        if (n % 2 == 0) {
            l = m - 1;
        }
        r = m;
        while (l >= 0) {
            num[l] = num[l] + carry;
            carry = num[l] / 10;
            num[l] = num[l] % 10;
            num[r] = num[l];
            l--;
            r++;
        }
        if (carry == 1) {
            num[n - 1] = 1;
            v.addElement(1);
        }
        for (int ele : num) {
            v.add(ele);
        }
        return v;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num = {1, 2, 3, 4, 5};
        int n = num.length;
        System.out.println("Original number:");
        for (int digit : num) {
            System.out.print(digit);
        }
        System.out.println();
        Vector<Integer> result = solution.generateNextPalindrome(num, n);
        System.out.println("Next palindrome:");
        for (int digit : result) {
            System.out.print(digit);
        }
    }
}
