package ConcreteProducts;

import Product.Button;

import javax.swing.*;

public class WindowsHellButton extends WindowsButton implements Button {

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void onClick() {
        button = new JButton("Go to hell");
        button.addActionListener(e -> {
            frame.setVisible(false);
            System.exit(0);
        });

    }
}
