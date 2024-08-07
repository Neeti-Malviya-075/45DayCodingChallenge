class Solution{
    static void dfs(int row, int col,int vis[][],char mat[][],int dlrow[],int dlcol[]){
        vis[row][col]=1;
        int n=mat.length;
        int m=mat[0].length;
        
        for(int i=0; i<4; i++){
            int nrow=row+dlrow[i];
            int ncol=col+dlcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 &&mat[nrow][ncol]=='O'){
                dfs(nrow,ncol,vis,mat,dlrow,dlcol);
            }
        }
    }
    static char[][] fill(int n, int m, char a[][])
    {
        // code here
        int[] dlrow={-1,0,1,0};
        int[] dlcol={0,1,0,-1};
        int[][] vis = new int[n][m];
        
         for (int i = 0; i < n; i++) {
            if (vis[i][0] == 0 && a[i][0] == 'O') {
                dfs(i, 0, vis, a, dlrow, dlcol);
            }
            if (vis[i][m - 1] == 0 && a[i][m - 1] == 'O') {
                dfs(i, m - 1, vis, a, dlrow, dlcol);
            }
        }
        for (int i = 0; i < m; i++) {
            if (vis[0][i] == 0 && a[0][i] == 'O') {
                dfs(0, i, vis, a, dlrow, dlcol);
            }
            if (vis[n - 1][i] == 0 && a[n - 1][i] == 'O') {
                dfs(n - 1, i, vis, a, dlrow, dlcol);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (vis[i][j] == 0 && a[i][j] == 'O') {
                    a[i][j] = 'X';
                }
            }
        }
        return a;
    }
}
    