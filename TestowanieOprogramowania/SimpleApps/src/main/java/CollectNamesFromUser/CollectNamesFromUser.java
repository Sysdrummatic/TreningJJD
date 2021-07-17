package CollectNamesFromUser;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CollectNamesFromUser {

    public static final String EndOfNames = "-";

    public static void main(String[] args) {

        String newUserName;
        List<String> UserNameList = new LinkedList<>();
        Scanner UserName = new Scanner(System.in);
        do{

            System.out.println("Sign new user's name:");
            newUserName = UserName.nextLine();
        if(!newUserName.equals(EndOfNames))
        {
            UserNameList.add(newUserName);
        }


        }while(!newUserName.equals(EndOfNames));
        System.out.println(UserNameList.get(0));



    }

}