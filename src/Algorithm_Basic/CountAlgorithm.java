package Algorithm_Basic;//[?] 1부터 1000까지의 정수 중 13의 배수의 개수(건수, 횟수)

//개수 알고리즘 : 주어진 범위에 주어진 조건에 해당하는 자료들의 개수

public class CountAlgorithm {

    public static void main(String[] args) {

        //input
        int cnt = 0;
        int num = 1000;

        //process(필터링)
        for(int i = 1;i<=num;i++){
            if(i%13==0){
                cnt++;
            }
        }


        //output
        System.out.println("cnt = " + cnt);
    }


}
