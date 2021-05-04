package loo.sqlite_ormlite_swing.aulas_23_e_24_sqlite_gui.src.model;

import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;

@DatabaseTable(tableName = "books")
public class Book {

    @DatabaseField(id = true)
    private int id;

    @DatabaseField
    private String title;

    public Book() {

    }

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
