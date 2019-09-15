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
