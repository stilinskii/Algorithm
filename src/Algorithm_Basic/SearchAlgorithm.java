package Algorithm_Basic;

//[?] 정렬되어있는 데이터를 이진검색(이분탐색)을 사용하여 반씩 나눠서 검색

public class SearchAlgorithm {
    public static void main(String[] args) {
        //input
        int[] data ={1,3,5,7,9};//오름차순으로 정렬되었다고 가정
        int N = data.length;
        int search = 7;
        boolean flag = false; // 찾았으면 true 그렇지않으면 false
        int index = -1; //찾은위치
        //process (Binary Search)
        int low = 0;
        int high = N-1;

        while(low <= high){
            int mid = (low+high)/2;
            if(data[mid]==search){
                flag = true;
                index = mid;
                break;
            }else if(data[mid]<search){
                low = mid +1;

            }else if(data[mid]>search){
                high = mid-1;

            }
        }


        //output
        if(flag){
        System.out.println(search+"는"+index+"번째 열에 있습니다");
        }else{
            throw new IllegalStateException("찾지못했습니다.");
        }
    }
}
