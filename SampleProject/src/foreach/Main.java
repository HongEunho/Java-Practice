package foreach;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // for-each�� ����
        int []n={1,2,3,4,5};
        int sum=0;
        for(int k:n){ //�迭�� ����ϴ� ���� ������ for������ ������
            sum+=k;
        }
        System.out.println("���� "+sum);
        
    }

}
