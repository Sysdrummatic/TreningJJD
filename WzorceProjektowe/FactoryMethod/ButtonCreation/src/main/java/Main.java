import ConcreteCreator.HtmlDialog;
import ConcreteCreator.WindowsDialog;
import Creator.Dialog;

public class Main {

    private static Dialog dialog;

    public static void main(String[] args) {

        configure();
        runBussinesLogic();

    }
    static void configure(){
        if (System.getProperty("os.name").equals("Windows 10")){
            dialog = new WindowsDialog();

        }else{
            dialog = new HtmlDialog();
        }
    }

    static void runBussinesLogic() {
        dialog.renderWindow();
    }
}
