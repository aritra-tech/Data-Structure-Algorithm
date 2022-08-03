class Solution
{
public:
    int ladderLength(string &beginWord, string &endWord, vector<string> &wordList)
    {
    	unordered_set<string> s(wordList.begin(), wordList.end());

    	if(s.find(endWord) == s.end()) return 0;
    	int cnt = 0;
    	queue<string> q;
    	// pushing the starting node into queue
    	q.push(beginWord);
    	while(!q.empty())
            {
    		auto size = q.size();
    		cnt++;
    		while(size--)
    		{
    			auto currWord = q.front(); q.pop();
    			// finding the next word which can be formed after currWord
    			for(int i = 0; i < currWord.size(); ++i)
    			{
    				string tmp = currWord;
    				for(char ch = 'a'; ch <= 'z'; ++ch)
    				{
    					tmp[i] = ch;
    					// if new word is same as curr word, ignore
    					if(tmp.compare(currWord) == 0) continue;
    					if(tmp.compare(endWord) == 0) return cnt + 1;
                        if(s.find(tmp) != s.end())
                        {
                        	q.push(tmp);
                        	s.erase(tmp);
                        }
    				}
    			}
    		}
    	}
    	return 0;
    }
};
