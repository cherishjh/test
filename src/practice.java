//import java.util.Arrays;
//
//public class practice {
//    static int[][] computers={{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
//    static boolean[] connected;
//    static int count=0;
//    public static void main(String[] args) {
//        int n=3;
//        int start=0;
//        connected= new boolean[computers.length];
//        for(int i=0; i<computers.length; i++){
//            for(int j=0; j<computers[i].length; j++){
//                if(computers[i][j]==1){
//                    start=i;
//                    break;
//                }
//            }
//        }
//        dfs(start);
//        System.out.println(n-count);
//    }
//    static void dfs(int start){
//        connected[start]=true;
//        for (int i =0; i< computers.length; i++){
//            if(!connected[i] && computers[start][i]==1){
//                count++;
//                dfs(i);
//            }
//        }
//    }
//}
//
//
//
