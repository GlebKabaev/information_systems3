package com.example.repository;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.model.ShortBook;
import com.example.view.MainView;

public class ExtendRep extends RepositoryDecorator{
    private static ExtendRep instance;
    
    private ExtendRep(Repository repository){
        super(repository);
    }
    public static ExtendRep getInstance(Repository repository){
        if(instance==null){
            instance=new ExtendRep(repository);
        }
        return instance;
    }
    public List<ShortBook> sort_get_k_n_shortList(int k, int n) throws IOException {
        MainView mainView =MainView.getInstance();
        String sort = (String) mainView.getSortComboBox().getSelectedItem(); // Выпадающий список сортировки
        String query = "SELECT id, title, author, genre FROM Books ORDER BY " +sort+" LIMIT ? OFFSET ?";
        List<ShortBook> shortBooks = new ArrayList<>();
        String url = "jdbc:postgresql://localhost:5432/Library_DB";
        String user = "myuser";
        String password = "mypassword";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, n); // Лимит на количество записей
            stmt.setInt(2, k * n); // Сдвиг для выборки
    
            ResultSet rs = stmt.executeQuery();
    
            while (rs.next()) {
                shortBooks.add(new ShortBook(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getString("genre")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
        return shortBooks;
    }
    @Override
    public List<ShortBook> get_k_n_shortList(int k, int n) throws IOException{
        return sort_get_k_n_shortList( k,  n);
    }
}
