package foreach;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // for-each문 예제
        int []n={1,2,3,4,5};
        int sum=0;
        for(int k:n){ //배열을 사용하는 경우는 기존의 for문보다 간단함
            sum+=k;
        }
        System.out.println("합은 "+sum);
        
    }

}
