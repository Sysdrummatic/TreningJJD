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

        do {
            System.out.println("Type first user name:");
            newUserName1 = UserName.nextLine();
            System.out.println("Type second user name:");
            newUserName2 = UserName.nextLine();
            if(!newUserName1.equals(END_OF_NAMES))
            {
                pairOfUsersName.put(newUserName1, newUserName2);
            }
        }
        while(!newUserName1.equals(END_OF_NAMES));

        System.out.println("Type first user name to display it's pair");
        firstUserName = UserName.nextLine();
        System.out.println(pairOfUsersName.get(firstUserName));
    }

}
