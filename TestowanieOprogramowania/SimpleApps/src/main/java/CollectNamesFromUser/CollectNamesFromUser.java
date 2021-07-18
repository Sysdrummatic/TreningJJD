package CollectNamesFromUser;
import java.util.*;

public class CollectNamesFromUser {

    public static final String EndOfNames = "-";

    public static void main(String[] args) {
        String newUserName;
        Set<String> UserNameList = new HashSet<>();
        Scanner UserName = new Scanner(System.in);
        do{
            System.out.println("Sign new user's name:");
            newUserName = UserName.nextLine();
            if(!newUserName.equals(EndOfNames))
            {
                UserNameList.add(newUserName);
            }

        }while(!newUserName.equals(EndOfNames));

        System.out.println("Wprowadziłeś " + UserNameList.size() + "unikalnych imion.");



    }

}