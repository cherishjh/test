package sec03.exam01;

import java.math.BigInteger;
import java.util.PriorityQueue;
import java.util.Queue;

public class programmers_mostRecentValue {
    public static void main(String[] args) {
        /* if (make.size() == 1) {
                if (make.peek() < K) {
                    answer = -1;
                    break;
                } else {
                    answer = 0;
                    break;
                }
            }*/
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        int answer = 0;
        Queue<Integer> make = new PriorityQueue<>();
        for (int i : scoville) {
            make.add(i);
        }
        int count = 0;
        while (true) {
            int a = make.poll();
            if (a< K && make.isEmpty()) {
                answer = -1;
                break;
            } else if (a>=K) {
                answer=count;
                break;
            } else {
                int b= make.poll();
                int lowest_scoville = a + b * 2;
                count++;
                make.add(lowest_scoville);
            }
                }
        System.out.println(answer);
            }
        }




       /* if (lowest_scoville < K) {
            for (int i = 0; i < make.size(); i++) {
                lowest_scoville =  lowest_scoville + make.poll() * 2;
                count++;
                make.add(lowest_scoville);
                }
            }
        answer = count;
        System.out.println(answer);*/


