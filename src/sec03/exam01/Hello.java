package sec03.exam01;

import java.util.Arrays;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money_left = 4000;
        System.out.println("분실신고된 카드입니까?");
        String s = sc.nextLine();
        if (s.equals("네")) {
            System.out.println("사용하실 수 없습니다.");
        } else if (s.equals("아니오")) {
            System.out.println("잔액을 입력하세요.");
            int m= sc.nextInt();
            if (m>= 1500) {
                System.out.println("정상 처리 되었습니다.");
            } else {
                System.out.println("잔액이 부족합니다.");
            }
        }
    }
}


