package loo.sqlite_ormlite_swing.aulas_23_e_24_sqlite_gui.src.model;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.io.IOException;
import java.sql.SQLException;

public class SQLiteDatabase {

    //SINGLETON
    private static SQLiteDatabase instance;

    private SQLiteDatabase() {
        createConnection();
    }
    public static SQLiteDatabase getInstance(){
        if ( instance == null)
            instance = new SQLiteDatabase();

        return instance;
    }

    //SINGLETON END

    //DATABASE ORMLITE CONFIG
    private ConnectionSource connectionSource;
    private void createConnection() {
        try {
            connectionSource = new JdbcConnectionSource("jdbc:sqlite:loodatabase.db");

            initializeTables();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private void initializeTables() {
        try {
            TableUtils.createTableIfNotExists(connectionSource, Book.class);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public ConnectionSource getConnection() {
        return connectionSource;
    }

    public void closeConnection(){
        try {
            connectionSource.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
