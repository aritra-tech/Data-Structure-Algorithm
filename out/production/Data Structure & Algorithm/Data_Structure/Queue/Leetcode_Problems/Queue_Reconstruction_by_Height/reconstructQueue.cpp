// Process the people in the decreasing order of heights and build solution incrementally (greedily)
// Insert the current person into the result built so far to build the new result.
// We can handle people with equal heights gracefully by giving preference to lower k in (h, k) while sorting.

class Solution {
public:
    static bool compare(vector<int> &a, vector<int> &b)
    {
        if(a[0]!=b[0]) return a[0] > b[0];
        return a[1] < b[1];
    }

    vector<vector<int>> reconstructQueue(vector<vector<int>>& people)
    {
        sort(people.begin(), people.end(), compare);
        int i=0, j;
        while(i<people.size())
            {
            j=i;
            while(people[j][1]!=j)
            {
                swap(people[j], people[j-1]);
                j--;
            }
            i++;
        }
        return people;
    }
};
