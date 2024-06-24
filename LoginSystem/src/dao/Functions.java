package dao;

import javax.swing.*;

public class Functions extends JFrame {

    public static final String nameRegister = "abc";
    private static final String passwordRegister = "123";

    public static void exit(JFrame _jframe) {
        _jframe.dispose();
    }

    public static void login(String _name, String _password) {
        if (nameRegister.equals(_name) && passwordRegister.equals(_password)) {
            JOptionPane.showMessageDialog(null, "Welcome!");
        }
        else {
            JOptionPane.showMessageDialog(null, "Error when logging in!");
        }
    }

}
