package org.example;

import java.sql.SQLException;
import java.util.List;

public class MangaApp {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    private static final MangaRepositoryImpl mangaRepository = new MangaRepositoryImpl();
    public static void main(String[] args) throws SQLException {

        System.out.println(ANSI_GREEN + "     e    e           e      888b    |  e88~~\\       e      ,d88~~\\\n" +
                ANSI_PURPLE + "    d8b  d8b         d8b     |Y88b   | d888         d8b     8888   \n" +
                ANSI_CYAN + "   d888bdY88b       /Y88b    | Y88b  | 8888 __     /Y88b    `Y88b  \n" +
                ANSI_RED + "  / Y88Y Y888b     /  Y88b   |  Y88b | 8888   |   /  Y88b    `Y88b,\n" +
                ANSI_YELLOW + " /   YY   Y888b   /____Y88b  |   Y88b| Y888   |  /____Y88b     8888\n" +
                ANSI_BLUE + "/          Y888b /      Y88b |    Y888  \"88__/  /      Y88b \\__88P'" + ANSI_RESET);

        System.out.println("");
        System.out.println("");

        for(Manga m : mangaRepository.findAll()){
            System.out.println(m);
        }
    }
}
