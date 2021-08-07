package ConcreteCreator;

import ConcreteProducts.WindowsButton;
import Creator.Dialog;
import Product.Button;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

}
