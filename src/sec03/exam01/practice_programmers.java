/*
package sec03.exam01;

import org.w3c.dom.ls.LSOutput;

import java.util.*;


public class practice_programmers {
    static List<List<Integer>> gamepath;
    static boolean [] visited;
    static int count=0;

    public static void main(String[] args) {
        int [][] maps= {
                {1,0,1,1,1},
                {1,0,1,0,1},
                {1,0,1,1,1},
                {1,1,1,0,1},
                {0,0,0,0,1}
        };
        int node_n=;
        visited= new boolean[node_n];
        for(int i=0; i< maps.length; i++) {
            for (int j = 0; j < maps[i].length; j++) {
                if (maps[i][j] == 1) {
                    gamepath.get(i).add(j);
                }
            }
        }


            }
    static void addEdge(int a, int b) {
        adjList.get(a).add(b);
        adjList.get(b).add(a);
    }
static void location(int i, int j){
    int [] dx= {-1,1,0,0};
    int [] dy = {0,0,-1,1};
    for(int d=0; d<4; d++){
        int target_i = i+dx[d];
        int target_j = j+dy[d];
        if(target_i>=1 && target_i<=3 && target_j>=1 && target_j<=5){
            ;

}
static int bfs(int start, int end) {
    Queue<Integer> queue = new LinkedList<>();
    visited[start] = true;
    queue.add(start);
    while (!queue.isEmpty()) {
        int next = queue.poll();
        for (int target : adjList.get(next)) {
            if (visited[target] == false) {
                queue.add(target);
                distance[target] = distance[next] + 1;
                visited[target] = true;
                if (target == end) {
                    return distance[end];
                }
            }
        }
    }
    return -1;
}








      */
/*  int [][] maps= {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        for(int i=0; i<maps.length; i++){
            map_list.add(new ArrayList<>());
        }
        for(int [] a: maps){
           addEdge(a[],a[])
            }
        }


    }
    static void addEdge(int a, int b) {
        map_list.get(a).add(b);
        map_list.get(b).add(a);
    }
}
*//*


    }
}
*/
