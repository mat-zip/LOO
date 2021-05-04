package loo.sqlite_ormlite_swing.aulas_23_e_24_sqlite_gui.src.view;

import loo.sqlite_ormlite_swing.aulas_23_e_24_sqlite_gui.src.controller.MainController;
import loo.sqlite_ormlite_swing.aulas_23_e_24_sqlite_gui.src.model.Book;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {
    private JPanel rootPanel;
    private MainController mw;

    private JButton saveButton;
    private JTextField textFieldTitle;
    private JTextField textFieldID;
    private JButton showAllButton;

    public MainWindow(MainController mw) {
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Book b = new Book(
                        Integer.parseInt(textFieldID.getText()),
                        textFieldTitle.getText()
                );

                mw.createBook(b);
            }
        });

        showAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mw.showListWindow();
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }




}
