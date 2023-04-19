public class Q1337_The_K_Weakest_Rows_in_a_Matrix {
}
/*
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int row = mat.length; int col = mat[0].length;
        int[] cnts = new int[row];
        for(int i = 0; i < row; i++){
            int cnt = 0;
            for(int j = 0; j < col; j++){
                if(mat[i][j] == 1) cnt++;
            }
            cnts[i] = cnt;
        }
        int[] ans = new int[row];
        for(int i = 0; i < row; i++)
            ans[i] = i;
        for(int i = 0; i < k; i++){
            for(int j = row - 1; j > i; j--){
                if(cnts[j] < cnts[j - 1]){
                    // 交换cnts
                    int p = cnts[j];
                    cnts[j] = cnts[j - 1];
                    cnts[j - 1] = p;
                    // 交换ans，位置
                    int q = ans[j];
                    ans[j] = ans[j - 1];
                    ans[j - 1] = q;
                }
            }
        }
        int[] ret = new int[k];
        for(int i = 0; i < k; i++){
            ret[i] = ans[i];
        }
        return ret;
    }
}*/
