package loo.sqlite_ormlite_swing.aulas_23_e_24_sqlite_gui.src.view;

import loo.sqlite_ormlite_swing.aulas_23_e_24_sqlite_gui.src.model.Book;

import javax.swing.*;
import java.util.List;

public class ListWindow {
    private JList listBooks;
    private JPanel rootPanel;

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public void updateList(List<Book> allBooks) {
        DefaultListModel listModel = new DefaultListModel();
        listModel.addAll(allBooks);

        listBooks.setModel(listModel);
    }
}
