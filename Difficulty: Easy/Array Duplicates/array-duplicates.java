class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) - 1; // get corresponding index

            if (arr[index] < 0) {
                // already negative → duplicate found
                res.add(Math.abs(arr[i]));
            } else {
                // mark the element as visited
                arr[index] = -arr[index];
            }
        }

        // optional: sort result if needed
        Collections.sort(res);

        return res;
    }
}