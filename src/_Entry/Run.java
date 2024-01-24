package _Entry;

import GUI.MainMenu;

import javax.swing.*;
public class Run {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new MainMenu().setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
