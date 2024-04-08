package org.example;

import java.sql.SQLException;

public class MangaService {
    static java.sql.Connection connection;

    public static java.sql.Connection getConnection(){
        String host = "jdbc:sqlite:src/main/resources/manga";
        if(connection == null){
            try{
                connection = java.sql.DriverManager.getConnection(host);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                System.exit(0);
            }
        }
        return connection;
    }
}
