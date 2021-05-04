package loo.sqlite_ormlite_swing.aulas_23_e_24_sqlite_gui.src.controller;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import loo.sqlite_ormlite_swing.aulas_23_e_24_sqlite_gui.src.model.Book;
import loo.sqlite_ormlite_swing.aulas_23_e_24_sqlite_gui.src.model.SQLiteDatabase;
import loo.sqlite_ormlite_swing.aulas_23_e_24_sqlite_gui.src.view.ListWindow;
import loo.sqlite_ormlite_swing.aulas_23_e_24_sqlite_gui.src.view.MainWindow;

import javax.swing.*;
import java.sql.SQLException;
import java.util.List;

public class MainController {

    private Dao<Book, String> dao;
    private JFrame frameList;
    private ListWindow lw;


    public MainController() {
        setupGUI();

        try {
            dao = DaoManager.createDao(
                    SQLiteDatabase.getInstance().getConnection(),
                    Book.class
            );
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private void setupGUI() {
        MainWindow mw = new MainWindow(this);

        JFrame frame = new JFrame("APP LOO - CREATE");
        frame.setContentPane(mw.getRootPanel());

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        lw = new ListWindow();
        frameList = new JFrame("APP LOO - CREATE");
        frameList.setContentPane(lw.getRootPanel());

        frameList.setLocationRelativeTo(null);
        //frameList.setVisible(true);


    }

    public void createBook(Book b) {
        try {
            dao.create( b );
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void showListWindow() {
        try {
            List<Book> allBooks  = dao.queryForAll();
            lw.updateList(allBooks);

            frameList.pack();
            frameList.setVisible(true);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

}
