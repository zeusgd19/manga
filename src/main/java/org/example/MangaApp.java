package org.example;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class MangaApp {

    private static final MangaRepositoryImpl mangaRepository = new MangaRepositoryImpl();
    public static void main(String[] args) throws SQLException {

        System.out.println(AnsiColor.GREEN.getCode() + "     e    e           e      888b    |  e88~~\\       e      ,d88~~\\\n" +
                AnsiColor.PURPLE.getCode() + "    d8b  d8b         d8b     |Y88b   | d888         d8b     8888   \n" +
                AnsiColor.CYAN.getCode() + "   d888bdY88b       /Y88b    | Y88b  | 8888 __     /Y88b    `Y88b  \n" +
                AnsiColor.RED.getCode() + "  / Y88Y Y888b     /  Y88b   |  Y88b | 8888   |   /  Y88b    `Y88b,\n" +
                AnsiColor.YELLOW.getCode() + " /   YY   Y888b   /____Y88b  |   Y88b| Y888   |  /____Y88b     8888\n" +
                AnsiColor.BLUE.getCode() + "/          Y888b /      Y88b |    Y888  \"88__/  /      Y88b \\__88P'" + AnsiColor.RESET.getCode());

        System.out.println("");
        System.out.println("");

        for(Manga m : mangaRepository.findAll()){
            System.out.println(m);
        }
        int option = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quieres añadir un manga? (0 No - 1 Si): ");
        option = sc.nextInt();
        while (option != 0){
            switch (option){
                case 0:
                    break;
                case 1:
                  MangaController.addManga();
                  break;
            }

            System.out.println("Quieres seguir añadiendo mangas?");
            option = sc.nextInt();
        }
    }
}
