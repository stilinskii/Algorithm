package Algorithm_Basic;//[?] 주어진(지정한 범위) 데이터의 순위(등수)를 구하는 로직

//순위 알고리즘 : 점수 데이터에 대한 순위 구하기

public class RankAlgorithm {
    public static void main(String[] args) {

        //input
        int[] scores = {90,87,100,95,80};
        int[] rankings = {1, 1, 1, 1, 1}; // 모두 1로 초기화

        //process
        for(int i = 0;i<scores.length;i++){
           // rankings[i]=1;
            for (int j = 0; j < scores.length; j++) {
                if(scores[i]<scores[j]){
                    rankings[i]++;
                }
            }
        }


        //output
        for (int i = 0; i < scores.length; i++) {
            System.out.println("점수: "+scores[i]);
            System.out.println("등수: "+rankings[i]);
        }

    }
}
