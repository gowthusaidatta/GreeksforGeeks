class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        int n = arr.length;
        Arrays.sort(arr);
        Arrays.sort(dep);

        int i = 1, j = 0;
        int platNeeded = 1, maxPlat = 1;

        while (i < n && j < n) {
            // If next train arrives before previous one departs → need more platforms
            if (arr[i] <= dep[j]) {
                platNeeded++;
                i++;
            } 
            // If train departs before next arrives → free one platform
            else {
                platNeeded--;
                j++;
            }

            maxPlat = Math.max(maxPlat, platNeeded);
        }

        return maxPlat;
    }
}
