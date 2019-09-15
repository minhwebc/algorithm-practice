//Example 1
// Input: [2, 1, 5, 1, 3, 2], k=3 
// Output: 9
// Explanation: Subarray with maximum sum is [5, 1, 3].
//Example 2
// Input: [2, 3, 4, 1, 5], k=2 
// Output: 7
// Explanation: Subarray with maximum sum is [3, 4].

class MaxSumSubArrayOfSizeK {
  public static int findMaxSumSubArray(int k, int[] arr) {
    int maxSum = Integer.MIN_VALUE;
    int runningSum = 0;
    int initial = 1; 
    int removeIndex = 0;
    for(int i = 0; i < arr.length; i++){
      runningSum += arr[i];
      initial++;
      if(initial > k) {
        if(runningSum > maxSum){
          maxSum = runningSum;
        }
        runningSum = runningSum - arr[removeIndex];
        removeIndex++;
      }
    }
    return maxSum;
  }
}
