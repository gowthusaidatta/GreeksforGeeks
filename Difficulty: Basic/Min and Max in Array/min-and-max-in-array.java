class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        int n = arr.length;
        int minVal = arr[0], maxVal = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < minVal) minVal = arr[i];
            if (arr[i] > maxVal) maxVal = arr[i];
        }

        ArrayList<Integer> res = new ArrayList<>();
        res.add(minVal);
        res.add(maxVal);

        return res;
    }
}
