#include <iostream>
#include <vector>

using namespace std;

// DFS
class Solution {

private:
    int d[4][2] = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    int n, m;

public:
    vector<vector<int>> floodFill(vector<vector<int>>& image, int sr, int sc, int newColor) {

        n = image.size();
        m = image[0].size();

        if(image[sr][sc] != newColor)
            floodfill(image, sr, sc, image[sr][sc], newColor);

        return image;
    }

private:
    void floodfill(vector<vector<int>>& image, int x, int y, int oldColor, int newColor){

        if(image[x][y] != newColor) {
            image[x][y] = newColor;

            for (int i = 0; i < 4; i++) {
                int newX = x + d[i][0];
                int newY = y + d[i][1];
                if (inArea(newX, newY) && image[newX][newY] == oldColor)
                    floodfill(image, newX, newY, oldColor, newColor);
            }
        }
    }

    bool inArea(int x, int y){
        return x >= 0 && x < n && y >= 0 && y < m;
    }
};


void printImage(const vector<vector<int>>& image){
    for(vector<int> row: image){
        for(int pixel: row)
            cout << pixel << "\t";
        cout << endl;
    }
}

int main() {

    vector<vector<int>> image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
    printImage(Solution().floodFill(image, 1, 1, 2));

    return 0;
}

// Time Complexity: O(n*m)
// Space Complexity: O(n*m)
