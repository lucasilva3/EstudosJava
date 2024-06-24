package views;

import dao.Functions;

import javax.swing.*;
import java.awt.*;

public class MainWindow {

    public MainWindow() {
        // Main Window
        JFrame mainWindow = new JFrame("Main"); // define uma nova instância da janela e já define o texto
        mainWindow.setSize(600, 400); // tamanho (largura - altura)
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // defini o que o X faz quando sair
        mainWindow.setResizable(false); // define se poderá ser alterado manualmente o tamanho da tela
        mainWindow.setLocationRelativeTo(null); // centraliza a janela no meio da tela quando iniciado o sistema

        // Panel with layout to organize components
        JPanel mainPanel = new JPanel(); // define uma nova instância do painel
        mainPanel.setLayout(null); // definindo layout nulo para o painel
        mainPanel.setBackground(Color.WHITE); // definindo a cor de fundo do painel

        // Label to identify which is username
        JLabel lbUsername = new JLabel("Username:"); // define uma nova instância do label e já define o texto
        lbUsername.setBounds(80, 40, 200, 30); // define tamanho e posição do botão (x - y - largura - altura)
        lbUsername.setFont(new Font("Arial", Font.BOLD, 30)); // define caracteristicas da fonte
        lbUsername.setForeground(Color.black); // define a cor da fonte
        lbUsername.setBackground(Color.white); // define a cor de fundo da fonte

        // Field to enter username
        JTextField inpUser = new JTextField(); // define uma nova instância do input
        inpUser.setBounds(80, 70, 450, 40); // define tamanho e posição do botão (x - y - largura - altura)
        inpUser.setFont(new Font("Arial", Font.PLAIN, 20)); // define caracteristicas da fonte
        inpUser.setForeground(Color.black); // define a cor da fonte
        inpUser.setBackground(Color.white); // define a cor de fundo da fonte
        inpUser.setHorizontalAlignment(JTextField.CENTER); // alinha o texto inserido no centro do input

        // Label to identify which is username
        JLabel lbPassword = new JLabel("Password:"); // define uma nova instância do label e já define o texto
        lbPassword.setBounds(80, 170, 200, 30);
        lbPassword.setFont(new Font("Arial", Font.BOLD, 30));
        lbPassword.setForeground(Color.black); // define a cor da fonte
        lbPassword.setBackground(Color.white); // define a cor de fundo da fonte

        // Field to enter password
        JPasswordField inpPassword = new JPasswordField(); // define uma nova instância do input
        inpPassword.setBounds(80, 200, 450, 40); // define tamanho e posição do botão (x - y - largura - altura)
        inpPassword.setFont(new Font("Arial", Font.PLAIN, 20)); // define caracteristicas da fonte
        inpPassword.setForeground(Color.black); // define a cor da fonte
        inpPassword.setBackground(Color.white); // define a cor de fundo da fonte
        inpPassword.setHorizontalAlignment(JTextField.CENTER); // alinha o texto inserido no centro do input

        // Login Button
        JButton btnLogin = new JButton("Login"); // define uma nova instância do botão e já define o texto
        btnLogin.setBounds(140, 300, 150, 30); // define tamanho e posição do botão (x - y - largura - altura)
        btnLogin.setFont(new Font("Arial", Font.BOLD, 15)); // define caracteristicas da fonte
        btnLogin.setForeground(new Color(0, 0, 0)); // define a cor da fonte
        btnLogin.setBackground(new Color(0, 255, 120)); // define a cor de fundo da fonte
        btnLogin.setCursor(new Cursor(Cursor.HAND_CURSOR)); // define o estilo do curso ao passar o mouse em cima
        btnLogin.addActionListener(e -> {
            String name = inpUser.getText();
            String password = new String(inpPassword.getText());
            Functions.login(name, password);
        }); // função para realizar login

        // Exit Button
        JButton btnExit = new JButton("Exit"); // define uma nova instância do botão e já define o texto
        btnExit.setBounds(310, 300, 150, 30); // define tamanho e posição do botão (x - y - largura - altura)
        btnExit.setFont(new Font("Arial", Font.BOLD, 15)); // define caracteristicas da fonte
        btnExit.setForeground(new Color(237, 0, 0)); // define a cor da fonte
        btnExit.setBackground(new Color(0, 0, 0)); // define a cor de fundo da fonte
        btnExit.setCursor(new Cursor(Cursor.HAND_CURSOR)); // define o estilo do curso ao passar o mouse em cima
        btnExit.addActionListener(e -> Functions.exit(mainWindow)); // adicionando uma função de finalizar a tela principal quando clicado no botão

        // Adding components to the MAIN WINDOW
        mainWindow.add(mainPanel);

        // Adding components to the MAIN PANEL
        mainPanel.add(lbUsername);
        mainPanel.add(inpUser);
        mainPanel.add(lbPassword);
        mainPanel.add(inpPassword);
        mainPanel.add(btnLogin);
        mainPanel.add(btnExit);

        // Sets the visibility of the window after adding components to it
        mainWindow.setVisible(true);
    }

}

