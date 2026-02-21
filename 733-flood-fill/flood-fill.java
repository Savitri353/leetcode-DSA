class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image;
        int startPix = image[sr][sc];

        dfs(image, sr, sc, color, startPix);
        return image;
    }

    public void dfs(int[][] image, int sr, int sc, int color, int startPix) {
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length||image[sr][sc] == color || image[sr][sc] != startPix) return;

        image[sr][sc] = color;

        dfs(image, sr+1, sc, color, startPix);
        dfs(image, sr-1, sc, color, startPix);
        dfs(image, sr, sc-1, color, startPix);
        dfs(image, sr, sc+1, color, startPix);
    }
}