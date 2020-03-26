package huhyun;

import java.util.Scanner;

/**
* @author halfdev
* @since 2020-03-25
* Bubble Sort
*/
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j;
        int k;
        System.out.println("Input number: ");
        int h = sc.nextInt();

        int[] input = new int[h];
        int temp;

        for(int i = 0; i < h; i++){
            input[i]=(int)(Math.random() * h) + 1;
            if(i > 0){
                for(int r = i-1; r >= 0; r--){
                    if(input[i] == input[r]){
                        i--;
                        continue;
                    }
                }
            }}

        System.out.println(" == BEFORE == ");
        for(int abc : input) System.out.print(abc+" ");
        System.out.println("\n" + " == BEFORE == ");

        for(j = 0; j < h-1; j++){
            for(k = j; k < h; k++){
                if(input[j] > input[k]){
                    temp = input[j];
                    input[j] = input[k];
                    input[k] = temp;
                }
            }
        }

        System.out.println(" == AFTER == ");
        for(int abc : input) System.out.print(abc + " ");
        System.out.println("\n" + " == AFTER == ");
    }
}