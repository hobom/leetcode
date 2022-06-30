import org.w3c.dom.Node;

import java.util.*;
//81场双周赛
/*class Solution {
    public int countAsterisks(String s) {
        int ans=0;
//        .、$、|和*等转移字符，必须加\\，split尾随的空字符串不包含在结果数组中
        String[] strs = s.split("\\|");
        for (int i = 0; i < strs.length; i++) {
            if(i%2==0){
                for(int j=0;j<strs[i].length();j++){
                    if(strs[i].charAt(j)=='*'){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}*/

//并查集
/*class Solution {
    int[] par=new int[100010];
    int[] size=new int[100010];
    //寻找根节点
    int find(int x){
        if(x==par[x]){
            return x;
        }
        return find(par[x]);
    }
    public long countPairs(int n, int[][] edges) {

        //初始化
        for(int i=0;i<n;i++){
            par[i]=i;
            size[i]=1;
        }
        for (int[] edge : edges) {
            int x=find(edge[0]),y= find(edge[1]);
            //合并x、y为根节点的两集合
            if(x!=y){
                size[x]+=size[y];par[y]=x;
            }
        }
        long ans=1l*n*(n-1)/2;
        for(int i=0;i<n;i++){
            if(par[i]==i){
                ans-=1l*size[i]*(size[i]-1)/2;
            }
        }
        return ans;
    }
}*/

/*class Solution {
    public int maximumXOR(int[] nums) {
        int ans=0;
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                if((num&(1<<i))>0){
                    ans|=(1<<i);
                }
            }
        }
        return ans;
    }
}*/

/*class Solution {
    int[][][] f=new int[10001][7][7];
    int p=1000000007;
    int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public int distinctSequences(int n) {
        f[0][0][0]=1;
        for(int i=1;i<=n;i++) {
            for (int j = 0; j <= 6; j++) {
                for (int k = 0; k <= 6; k++) {
                    if (f[i - 1][j][k] > 0) {
                        for (int l = 1; l <= 6; l++) {
                            if (l != j && l != k && (k == 0 || gcd(k, l) == 1)) {
                                f[i][k][l] += f[i - 1][j][k];
                                f[i][k][l] %= p;
                            }
                        }
                    }
                }
            }
        }
        int ans=0;
        for(int i=1;i<=6;i++){
            for(int j=1;j<=6;j++){
                ans+=f[n][i][j];
                ans%=p;
            }
        }
        return ans;
    }
}*/

public class Test {
    public static void main(String[] args) {

    }
}