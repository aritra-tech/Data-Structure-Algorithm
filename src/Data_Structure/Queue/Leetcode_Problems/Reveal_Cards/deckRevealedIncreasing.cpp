class Solution {
public:
    vector<int> deckRevealedIncreasing(vector<int>& deck) {
        //Sorting the array
        sort(deck.begin(),deck.end());
        queue<int> q;
        vector<int> temp;
        for(int i=0;i<deck.size();i++){
            q.push(i);}

        while(!q.empty()){
            //Card index that will be revealed
            int indexCardRevealed=q.front();
            temp.push_back(indexCardRevealed);
            q.pop();
         if(!q.empty()){
            //Card index that will move to bottom
            int indexCardBottom=q.front();
            q.pop();
            //Pushing Card Index to Bottom
            q.push(indexCardBottom);}}

        int j=0;
        vector<int> result(deck.size());
        for(int i=0;i<temp.size();i++){
            result[temp[i]]=deck[j];
            j++;}
        return result;}};
