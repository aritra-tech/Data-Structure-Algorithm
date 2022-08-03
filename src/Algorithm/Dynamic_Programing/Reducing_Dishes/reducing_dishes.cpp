/*
Just like 0/1 Knapsack Problem, we have 2 options for each dish -
    Take the current dish or
    Not take the current dish
*/

class Solution {
public:
    int solve(int index, int currenttime, vector<int>& satisfaction, vector<vector<int>>& mem){
		// if index is out of bound, return 0
        if(index == satisfaction.size())
            return 0;

	    // return if already computed
        if(mem[index][currenttime - 1] != -1)
            return mem[index][currenttime - 1];

        // sum of like-time coefficients if we take the current dish.
        // Also, increment the time counter.
		int take = satisfaction[index] * currenttime + solve(index + 1, currenttime + 1, satisfaction, mem);

		// sum of like-time coefficients if we don't take the current dish
		int notTake = solve(index + 1, currenttime, satisfaction, mem);

		// return max of both the options
        return mem[index][currenttime - 1] = max(take, notTake);
    }

    int maxSatisfaction(vector<int>& satisfaction) {
        int n = satisfaction.size();
        sort(satisfaction.begin(), satisfaction.end());
        vector<vector<int>> mem(n, vector<int> (n, -1));

		// starting from index 0 and time instance 1
        return solve(0, 1, satisfaction, mem);
    }
};
