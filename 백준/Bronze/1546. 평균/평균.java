import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    int count=sc.nextInt();
    sc.nextLine(); // 개행 문자 소비

    String line=sc.nextLine();
    String[] numbers=line.split(" ");

    int[] nums=new int[1000];
    for(int i=0;i<count;i++){
        nums[i]=Integer.parseInt(numbers[i]);
    }

    //최댓값 선택
    int max= Arrays.stream(nums).max().getAsInt();
    double sum=0;//double로 바꿔줘야함 ㅠㅠ
    //평균 구하기
    for(int j=0;j<count;j++){
        sum+=(double) nums[j]/max*100;

    }
    double avg=sum/count;
    System.out.println(avg);



}
}