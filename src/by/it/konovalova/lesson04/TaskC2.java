package by.it.konovalova.lesson04;

import java.util.Scanner;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        switch (month){
            case 1:
                System.out.println(day);
                break;
            case 2:
                System.out.println(day+31);
                break;
            case 3:
                System.out.println(day+31+28);
                break;
            case 4:
                System.out.println(day+31+28+31);
                break;
            case 5:
                System.out.println(day+31+28+31+30);
                break;
            case 6:
                System.out.println(day+31+28+31+30+31);
                break;
            case 7:
                System.out.println(day+31+28+31+30+31+30);
                break;
            case 8:
                System.out.println(day+31+28+31+30+31+30+31);
                break;
            case 9:
                System.out.println(day+31+28+31+30+31+30+31+31);
                break;
            case 10:
                System.out.println(day+31+28+31+30+31+30+31+31+30);
                break;
            case 11:
                System.out.println(day+31+28+31+30+31+30+31+31+30+31);
                break;
            case 12:
                System.out.println(day+31+28+31+30+31+30+31+31+30+31+30);
                break;
        }


    }

}
