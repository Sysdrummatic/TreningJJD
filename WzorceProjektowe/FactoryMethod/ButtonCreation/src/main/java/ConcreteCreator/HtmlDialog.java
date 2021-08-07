package ConcreteCreator;

import ConcreteProducts.HtmlButton;
import Creator.Dialog;
import Product.Button;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
