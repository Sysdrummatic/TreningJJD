package ConcreteProducts;

import Product.Button;

public class HtmlButton implements Button {
    public String label = "<button>Test Button</button>";
    @Override
    public void render(String label) {
        this.label = label;
        System.out.println(label);
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
