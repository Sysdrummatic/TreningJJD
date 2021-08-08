package Creator;

import Product.Button;

public abstract class Dialog {

    public void renderWindow(){
        String label = "";
        Button okButton = createButton();
        okButton.render(label);
    }
    public abstract Button createButton();
}


