package ConcreteCreator;

import ConcreteProducts.WindowsHellButton;
import Creator.Dialog;
import Product.Button;

public class WindowsHellDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsHellButton();
    }
}
