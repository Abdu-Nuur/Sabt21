package com.company;

import java.util.Scanner;

import static com.company.Week.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                System.out.println(MONDAY + " Дуйшомбу куну жава окуйм");
                break;
            case 2:
                System.out.println(TUESDAY + " Шейшемби куну англис тили сабагын окуйм");
                break;
            case 3:
                System.out.println(WEDNESDAY + " Шаршенби куну практика сабагын окуйм");
                break;
            case 4:
                System.out.println( THURSDAY+ " Бейшемби куну жава сабагын окуйм");
                break;
            case 5:
                System.out.println(FRIDAY + " Жума куну англис тили сабагын окуйм");
                break;
            case 6:
                System.out.println(SATURDAY + " Ишемби куну практика сабагын окуйм");
                break;
            case 7:
                System.out.println(SUNDAY + " Жекшемби куну эс алам");
                break;

        }
    }
}
