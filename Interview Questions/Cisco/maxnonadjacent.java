
/**
 * Max non adjacent
 * 1,8,0,4,1
 * MAX = 8 + 4 = 12
 */

public static int maxNonAdjacent(int[] nums){
	int include = 0;
	int exclude = 0;

	for(int i=0; i<nums.length; i++){
		int tmp = Math.max(include,exclude);
		include = nums[i] + exclude;
		exclude = tmp;
	}

	return Math.max(include,exclude);
}
