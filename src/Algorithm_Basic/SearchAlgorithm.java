package Algorithm_Basic;

//[?] 정렬되어있는 데이터를 이진검색(이분탐색)을 사용하여 반씩 나눠서 검색

import java.util.Arrays;

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


        //selection sort and binary search
        //input
        int[] nums = {2,4,5,6,7,1,10};
        int searchNum = 0;
        int indexfound=-1;
        boolean isexist = false;

        //process

        //process1 sort
        for(int i = 0; i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        Arrays.stream(nums).forEach(System.out::println);

        //process2 search
        int lowNum = 0;
        int highNum = nums.length-1;

        while(lowNum <= highNum){
            int midNum = (lowNum+highNum)/2;
            if(nums[midNum]==searchNum){
                indexfound = midNum;
                isexist = true;
                break;
            }else if(nums[midNum]>searchNum){
                highNum = midNum-1;
            }else if(nums[midNum]<searchNum){
                lowNum = midNum+1;
            }
        }

        //output
        if(isexist){
        System.out.println(searchNum+"는 인덱스"+indexfound+"에 있습니다.");
        }else {
            System.out.println(searchNum+"이/가 존재하지 않습니다.");
        }


    }
}
