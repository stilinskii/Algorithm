package Algorithm_Basic;//[?]무작위 데이터를 순서대로 [오름차순|내림차순] 정렬

import java.util.Arrays;

//selection sort 가장 작은/큰 데이터를 왼쪽으로 순서대로 이동
public class SortAlgorithm {

    public static void main(String[] args) {
        //input : data structure (Array, List, Stack, Queue, Tree, DB)
        int[] data = {3, 2, 1, 5, 4};
        int N = data.length; // 의사코드 형태로 알고리즘을 표현하기 위함

        //process : selection sort ASC
        for (int i = 0; i < N-1; i++) {
            for (int j = i+1; j < N; j++) {
                if(data[i] > data[j]){
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }

        //output : Console, Desktop, Web, Mobile, ...
        Arrays.stream(data).forEach(System.out::println);
    }
}
