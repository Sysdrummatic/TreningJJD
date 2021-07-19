package CollectNamesFromUser;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CollectPairsOfNamesFromUser {

public static final String END_OF_NAMES = "-";

    public static void main(String[] args) {

        String newUserName1;
        String newUserName2;
        String firstUserName;
        Map<String, String> pairOfUsersName = new HashMap<>();
        Scanner UserName = new Scanner(System.in);

        while(true)
        {
            System.out.println("Type first user name:");
            newUserName1 = UserName.nextLine();
            if(newUserName1.equals(END_OF_NAMES))
                break;
            System.out.println("Type second user name:");
            newUserName2 = UserName.nextLine();
            if (newUserName2.equals(END_OF_NAMES))
                break;
            pairOfUsersName.put(newUserName1, newUserName2);
        }
        System.out.println("Type first user name to display it's pair");
        firstUserName = UserName.nextLine();
        System.out.println("The pair for " + firstUserName + " is " +pairOfUsersName.get(firstUserName));
    }

}
