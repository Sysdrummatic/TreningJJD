import java.util.*;

public class FindAAndB {
        public static void main (String[] args) {

            Scanner sc= new Scanner(System.in);
            System.out.print("Enter a string: ");
            String s= sc.next();

            int l = s.length()-1;
            int i = 0;
            int stat=1;
            int x=1,y=0;
            while (l>=0) {
                if(s.charAt(i) == 'a')
                {
                    x=0;
                    i+=1;
                    l-=1;
                    if(x==0 && y==1) {
                        stat=0;
                        break;
                    }
                }
                else if(s.charAt(i) == 'b'){
                    y=1;
                    i+=1;
                    l-=1;
                }
            }
            if(stat == 0){
                System.out.println("false");
            }
            else{
                System.out.println("true");
            }
        }
}
