class Solution
{
public:
    void dfs(vector<vector<int>> &image, int i, int j, int newColor, int initialcolor)
    {
        int n = image.size();
        int m = image[0].size();
        // edge cases
        if (i < 0 || j < 0 || i >= n || j >= m)
            return;
        // if image[i][j]  is not equal to the initialcolor which we have to change then we will return
        if (image[i][j] != initialcolor)
            return;

        // otherwise we will assign the new color to image[i][j]
        image[i][j] = newColor;

        dfs(image, i - 1, j, newColor, initialcolor);
        dfs(image, i + 1, j, newColor, initialcolor);
        dfs(image, i, j - 1, newColor, initialcolor);
        dfs(image, i, j + 1, newColor, initialcolor);
    }
    vector<vector<int>> floodFill(vector<vector<int>> &image, int sr, int sc, int newColor)
    {
        // assign the pixel to initialcolor
        int initialcolor = image[sr][sc];
        // if the color in which we have to change pixel is not same the we will call for recursion
        if (initialcolor != newColor)
        {
            dfs(image, sr, sc, newColor, initialcolor);
        }
        return image;
    }
};

/*
Time Complexity: O(N)
Space Complexity: O(N)
*/