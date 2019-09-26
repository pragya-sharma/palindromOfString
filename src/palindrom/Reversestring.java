package palindrom;
import java.util.Scanner;
public class Reversestring {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
           // int length = s.length();
            String reverse = "";
            for(int i = s.length()-1;i>=0;i--){
                reverse = reverse+ s.charAt(i);
            }
            System.out.println("Reverse of String : "+reverse);
        }

}
