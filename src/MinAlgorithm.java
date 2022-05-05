
//[?]주어진 데이터 중에서 가장 작은 짝수

import java.util.Arrays;

public class MinAlgorithm {
    public static void main(String[] args) {
        //initialize

        //input
        int[] numbers={ 0b0010, 5, 3, 7, 1};//0b0010 == 2
        int min = Integer.MAX_VALUE;

        //process
        for(int number:numbers){
            if (number<min && number%2==0){
                min = number;
            }
        }


        //output
        System.out.println("min = " + min);

    }

}
