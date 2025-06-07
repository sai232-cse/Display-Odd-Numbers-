import java.util.Scanner;
public class DisplayOddNumbers{
    public static void main(String args[]){
        Scanner snr=new Scanner(System.in);
	System.out.println("Enter start value");
        int start=snr.nextInt();
	System.out.println("Enter end value");
        int end=snr.nextInt();
        for(int i=start;i<=end;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}