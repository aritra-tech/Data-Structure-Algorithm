// Russian Doll Envelopes

class Solution{
public:
    static bool helper(vector<int> &a, vector<int> &b){
        // Sort the envelopes in decreasing height and increasing breadth order.
        if (a[0] == b[0]){
            return (a[1] > b[1]);
        }
        return a[0] < b[0];
    }
    int maxEnvelopes(vector<vector<int>>& envelopes){
        /* Apply LIS to heights next.
        a) To save the sequence, make a tmp_arr.
        b) Append curr_elem to tmp_arr if curr_elem in arr exceeds tmp_arr.back().
        c) Replace the elem in tmp_arr if necessary so that curr_elem equals tmp_elem and the increasing nature of tmp_arr is not broken.
        d) (Tmp_arr's binary search for curr_elem will yield the correct index.) Bring back the length of tmp_arr.
        */
        sort(envelopes.begin(), envelopes.end(), helper);
        vector<int> tmp;
        tmp.push_back(envelopes[0][1]);
        for (int i = 1; i < envelopes.size(); i++)
            {
            int curr_elem = envelopes[i][1];
            if (tmp.back() < curr_elem)
            {
                tmp.push_back(curr_elem);
            }
            else
            {
                int idx = lower_bound(tmp.begin(), tmp.end(), curr_elem) - tmp.begin();
                tmp[idx] = curr_elem;
            }
        }
        return tmp.size();
    }
};

/*
Time Complexity: O(n log n)
Space Complexity: O(n)
*/
