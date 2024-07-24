class MaximumSubarray {
  public static int maxSubArray(int[] arr) {
      int maxSoFar = arr[0];
      int maxEndingHere = arr[0];

      for (int i = 1; i < arr.length; i++) {
          maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
          maxSoFar = Math.max(maxSoFar, maxEndingHere);
      }

      return maxSoFar;
  }

  public static void main(String[] args) {
      int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
      int maxSum = maxSubArray(arr);
      System.out.println("Maximum contiguous sum is " + maxSum);
  }
}