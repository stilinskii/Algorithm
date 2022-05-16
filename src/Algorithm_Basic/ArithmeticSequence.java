package Algorithm_Basic;
//등차수열(Arithmetic Sequence): 연속하는 두 수의 차이가 일정한 수열
//[?] 1부터 20까지의 정수 중 홀수의 합을 구하는 프로그램

public class ArithmeticSequence {

    public static void main(String[] args) {

        //me first
        int sum = 0;
        for(int i = 1;i<=20;i++){
            if(i%2==1){
                sum+=i;
            }
        }
        System.out.println("1부터 20까지 정수 중 홀수의 합 = " + sum);

//-----------------------------------------------------------------------

        //[1]input
        int sum2 = 0;

        //[2] process
        for(int i = 1;i<=20;i++){
            if(i%2==1){
                sum2+=i;
                System.out.print(i + " "); // SEQUENCE -> Arithmetic Sequence
            }
        }

        //[3]Output

        System.out.println("1부터 20까지 정수 중 홀수의 합 = " + sum);




    }
}
