package org.example;

import java.sql.SQLException;
import java.util.List;

public class MangaApp {

    private static final MangaRepositoryImpl mangaRepository = new MangaRepositoryImpl();
    public static void main(String[] args) throws SQLException {

        for(Manga m : mangaRepository.findAll()){
            System.out.println(m);
        }
    }
}
