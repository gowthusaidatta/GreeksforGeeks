class Solution {
    public int missingNumber(int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (num > 0)
                set.add(num);
        }
        int i = 1;
        while (true) {
            if (!set.contains(i))
                return i;
            i++;
        }
    }
}
