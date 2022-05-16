package Algorithm_Basic;
//[?]원본 데이터 중에서 대상 데이터와 가장 가까운 값

//근삿값 알고리즘 : 차잇값의 절댓값의 최솟값

import java.util.Arrays;

public class NearAlgorithm {

    public static int abs(int number) {
        return number < 0 ? -number : number;
    }

    public static void main(String[] args) {

        //initialize
        int min = Integer.MAX_VALUE;// 차잇값의 절댓값의 최솟값이 담길 그릇

        //input
        int[] numbers = {10, 20, 30, 27, 17};
        int target = 25; //target과 가장 가까운 값.
        int near =0; // 가까운 값

        //process
        for(int i = 0;i<numbers.length;i++){
            int abs = abs(numbers[i]-target);
            if(abs<min){
               min=abs;
               near = numbers[i];
           }
        }

        //output
        System.out.println(target +"와/과 가장 가까운 값: " + near +"\n차이는 "+min);
    }


}
