package Companywise_Questions.Microsoft.Maximum_Subarray_Min-Product;

public class Maximum_Subarray_Min-Product {

        static int MOD = (int)(1e9 + 7);
        public int maxSumMinProduct(int[] nums) {
            int n = nums.length;
            //leftMin[i] = give the index(left direction) which value is less than nums[i] 
            int[] leftMin  = getLeftMinIndex(nums);
            
            //rightMin[i] = give the index(right direction) which value is less than nums[i]
            int[] rightMin = getRightMinIndex(nums);
            
            long[] prefixSum = getPrefixSum(nums);
            
    
            long maxProduct = 0l;
            
            for(int i = 0; i < n; i++){
                long sum = leftMin[i] == -1 ? prefixSum[rightMin[i] - 1] :  prefixSum[rightMin[i] - 1] -  prefixSum[leftMin[i]];
                long product = sum * nums[i];
                
                //update max product
                maxProduct = Math.max(product, maxProduct);
            }
            
            return (int) (maxProduct % MOD);
        }
        
        private int[] getLeftMinIndex(int[] nums){
            int n = nums.length;
            
            int[] arr = new int[n];
            Arrays.fill(arr, -1);
            
            Stack<Integer> stack = new Stack();
            
            for(int i = 0; i < n; i++){
                
                //remove all the index which value is greater or equal to current number
                while(!stack.isEmpty() && nums[i] <= nums[stack.peek()]){
                    stack.pop();
                }
                
    
                //check is any index which is less than current number
                if(!stack.isEmpty() && nums[i] > nums[stack.peek()]){
                    arr[i] = stack.peek();
                }
                
                stack.push(i);
            }
            
            
            return arr;
        }
        
        private int[] getRightMinIndex(int[] nums){
            int n = nums.length;
            
            int[] arr = new int[n];
            Arrays.fill(arr, n);
            
            Stack<Integer> stack = new Stack();
            
            for(int i = n - 1; i >= 0; i--){
                
                //remove all the index which value is greater or equal to current number
                while(!stack.isEmpty() && nums[i] <= nums[stack.peek()]){
                    stack.pop();
                }
                
                //check is any index which is less than current number
                if(!stack.isEmpty() && nums[i] > nums[stack.peek()]){
                    arr[i] = stack.peek();
                }
                
                stack.push(i);
            }
            
            
            return arr;
        }
        
        private long[] getPrefixSum(int[] nums){
            int n = nums.length;
            
            long[] arr = new long[n];
            arr[0] = nums[0];
            
            for(int i = 1; i < n; i++){
                arr[i] = nums[i] + arr[i - 1];
            }
            
            return  arr;
        }
}
