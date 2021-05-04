package loo.sqlite_ormlite_swing.aulas_23_e_24_sqlite_gui.src.controller;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import loo.sqlite_ormlite_swing.aulas_23_e_24_sqlite_gui.src.model.Book;
import loo.sqlite_ormlite_swing.aulas_23_e_24_sqlite_gui.src.model.SQLiteDatabase;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        new MainController();

//        SQLiteDatabase.getInstance().getConnection();
//
//
//        Book b1 = new Book(1, "LOO");
//
//        try {
//            Dao<Book, String> dao = DaoManager.createDao(
//                    SQLiteDatabase.getInstance().getConnection(),
//                    Book.class
//            );
//
//            //dao.create( b1 );
//            //dao.delete(b1);
//            //dao.queryForAll();
//
//            //dao.update(b1);
//
//            for (Book l: dao.queryForAll()){
//                System.out.println(l);
//            }
//
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//
//
//        SQLiteDatabase.getInstance().closeConnection();



    }
}
