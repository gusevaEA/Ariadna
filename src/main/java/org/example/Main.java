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
/*
Дано несколько массивов
1,0,0,1
2,3,4,3,1
1000001000001
765828567
Задача : проверить каждый из них  на тот, что он палиндром, то есть зеркальный или нет
Результат вывести в форме boolean
По последнему если почитаете как сделать метод и просто вызвать его, передав в качестве параметра массив, будет шикарно)
 */

public class Main {




   static boolean isPalindrom(int[] mass){
        for (int i = 0, j = mass.length-1; i<=j;i++,j--){
            if (mass[i]!=mass[j])
                return false;
        }
        return true;
    }

    static int sum(int[] mass){
       int sum = 0;
       for(int i: mass){
           sum+=i;
       }
       return sum;
    }
    static int[] replaceMethod(int[] mass, int c){
       for (int i = 0; i < mass.length; i++){
           if (mass[i] % 2 == 0){
               mass[i] = c;
           }
       }
       return mass;
    }
    static void minus5(int i){
       i-=5; //i - 5
        System.out.println(i);
    }

    // Даны 3 массива, разной длинны, нужно в каждом массиве четные числа поменять на 11, а затем узнать среднее значение суммы всех элементов
    // и вывести ее на экран, а замет рахделить сумму на 10;

    static double var10 (int [] array_1, int [] array_2, int [] array_3, int q){
       int step = 11;
       double c = 0;
       int [][] full = {array_1,array_2,array_3};
       for (int i = 0; i <= full.length - 1;i++){
           replaceMethod(full[i], step);
       }
       c = avg(array_1) + avg(array_2) + avg(array_3);
       return c/q;
    }

    static double avg(int [] mass){
       return (double) sum(mass) / mass.length;
    }

    public static void main(String[] args) {
        int [] array_1 = {2,3,4,3,1};
        int [] array_2 = {1,1520,3000,6,3,1,71,0,0,0,0,1};
        int [] array_3 = {7,6,5,8,2,8,5,6,7};
        int num1 = 2;
        System.out.println(var10(array_1, array_2, array_3, num1));






//        System.out.println(array_1.length);
//        minus5(array_1.length);
//        System.out.println(array_1.length);

//        System.out.println(Arrays.toString(array_1));
//        System.out.println("Сумма " + sum(array_1));
//        System.out.println(Arrays.toString(array_4));
//        System.out.println("Поменяный массив " + Arrays.toString(replaceMethod(array_4)));
//        System.out.println(Arrays.toString(array_4));
//        System.out.println("Это палиндром? " + isPalindrom(array_1));
//        System.out.println(Arrays.toString(array_1));
//        System.out.println("Это палиндром? " + isPalindrom(array_2));
//        System.out.println("Это палиндром? " + isPalindrom(array_3));
//        System.out.println("Это палиндром? " + isPalindrom(array_4));





//        int sum = 0;
//        float average = 0;
//        int[] massive = {4, 7, 15, 73, 24, 2, 31, 53};
//        for (int i = 0; i < massive.length; i++) {
//            sum = sum + massive[i];
//        }
//        average = (float) sum / massive.length;
//        System.out.println(Arrays.toString(massive));
//        System.out.println("среднее значение:" + average);
//
//        float n = 0;
//        int closest = 0;
//        float b = Math.abs(massive[0]-average); //4-26
//        for (int i = 1;i < massive.length; i++) {
//            n = Math.abs(average - massive[i]); //26-4
//            if (b >= n) {
//                b = n;
//                closest = massive[i];
//            }
//        }
//        System.out.println("ближайшее число:" + closest);
//
//        System.out.println();
//        System.out.println();
//        /*
//        1)
//        i = 4, j = 53
//        {53, 7, 15, 73, 24, 2, 31, 4}
//        2) i = 7, j = 31
//        {53, 31, 15, 73, 24, 2, 7, 4}
//
//         */
//
////        System.out.println(Arrays.toString(massive));
////        for (int i = 0, j = massive.length-1; i <= j; i++, j--){
////            int w = 0;
////            w = massive[i];// 4
////            massive[i] = massive[j]; // 53
////            massive[j] = w;// 4
////            // [0] = 53, j = [4]
//////            System.out.println(Arrays.toString(massive));
////        }
////        System.out.println(Arrays.toString(massive));
//
//        int [] array = new int[massive.length];
//        int i = massive.length - 1;
//            for (int j = 0; j < array.length; j++){
//                array[j] = massive[i];
//                i--;
//            }
//        System.out.println(Arrays.toString(array));
    }

}