import ConcreteCreator.HtmlDialog;
import ConcreteCreator.WindowsDialog;
import ConcreteCreator.WindowsHellDialog;
import Creator.Dialog;

import java.util.Scanner;

public class Main {

    private static Dialog dialog;
    private static final Scanner BUTTON_SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        final String ONE = "1";
        final String TWO = "2";
        final String THREE = "3";

        String buttonType = BUTTON_SCANNER.nextLine();
        configure(buttonType);
            if(buttonType.equals(ONE)||buttonType.equals(TWO)||buttonType.equals(THREE))
            {
                runBussinesLogic();
            } else{
                System.out.println("Try again and pick correct button");
            }

    }
    static void configure(String buttonType){
        switch (buttonType) {
            case "1":
                dialog = new HtmlDialog();
                break;
            case "2":
                dialog = new WindowsDialog();
                break;
            case "3":
                dialog = new WindowsHellDialog();
                break;
            case "help":
                System.out.println("Type 1 for HTML button, 2 for Windows button or 3 for WindowsHellButton!");
                break;
            default:
                System.out.println("You type wrong number. Type 'help' for instructions");
                break;
        }
    }

    static void runBussinesLogic() {
        dialog.renderWindow();
    }
}
