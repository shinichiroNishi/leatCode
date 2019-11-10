object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
      var ret:Array[Int] = Array.empty
      for( i <- 0 until nums.length; j <- i+1 until nums.length){
        if( nums(i) + nums(j) == target) {
            return Array(i,j)
        }
      }
      ret
    }
}
