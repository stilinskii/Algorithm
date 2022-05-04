
//[?]주어진 데이터 중에서 가장 큰 값
//최댓값알고리즘(Max Algorithm : (주어진 범위 + 주어진 조건)의 자료들의 가장 큰 값

public class MaxAlgorithm {
    public static void main(String[] args) {

        //[1] initialize
        int max = Integer.MIN_VALUE;// 정수 형식의 데이터 중 가장 작은 값으로 초기화

        //[2] input
        int[] numbers = {-2, -5, -3, -7, -1};

        //[3] process: MAX
        for (int number : numbers) {
            if (max < number) {
                max = number;
            }
        }
        //[4] output
        System.out.println("max = " + max);

    }
}
