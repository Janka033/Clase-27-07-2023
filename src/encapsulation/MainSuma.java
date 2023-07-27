package encapsulation;

import javax.swing.*;

public class MainSuma {
    public static void main(String[] args) {
        Suma suma = new Suma();
        suma.setNum1(Integer.parseInt(JOptionPane.showInputDialog("Enter the number 1: ")));
        suma.setNum2(Integer.parseInt(JOptionPane.showInputDialog("Enter the number 2: ")));
        JOptionPane.showMessageDialog(null,"The addition is :"+suma.sum());
    }
}
