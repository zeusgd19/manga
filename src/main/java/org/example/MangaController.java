package org.example;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Logger;

public class MangaController {
    private static final MangaRepositoryImpl mangaRepository = new MangaRepositoryImpl();

    public static void addManga() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println(AnsiColor.BLUE.getCode() + "NOMBRE DEL MANGA: ");
        String nombre = sc.nextLine();

        System.out.println(AnsiColor.BLUE.getCode() + "FECHA PUBLICACION (01/01/01): ");
        String fecha_pub = sc.nextLine();

        System.out.println(AnsiColor.BLUE.getCode() + "PAGINAS: ");
        int paginas = sc.nextInt();

        Manga manga = new Manga(nombre,fecha_pub,paginas);
        mangaRepository.save(manga);
    }
}
