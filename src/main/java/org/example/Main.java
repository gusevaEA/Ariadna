package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
Дан массив целых чисел со следующими значениями:
4, 7, 15, 73, 24, 2, 31, 53
Задача : создать массив и про инициализировать его,
затем найти среднее значение
(подумать какого типа переменная будет среднего значения)
вывести его в консоль (Arrays.toString())
 */
/*
Взять тот же массив, что и в первом задании и найти число,
которое максимально близко расположено к среднему значению и вывести его в консоль
 */

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        float average = 0;
        int[] massive = {4, 7, 15, 73, 24, 2, 31, 53};
        for (int i = 0; i < massive.length; i++) {
            sum = sum + massive[i];
        }
        average = (float) sum / massive.length;
        System.out.println(Arrays.toString(massive));
        System.out.println("среднее значение:" + average);

        float n = 0;
        int closest = 0;
        float b = Math.abs(massive[0]-average); //4-26
        for (int i = 1;i < massive.length; i++) {
            n = Math.abs(average - massive[i]); //26-4
            if (b >= n) {
                b = n;
                closest = massive[i];
            }
        }
        System.out.println("ближайшее число:" + closest);
    }

}