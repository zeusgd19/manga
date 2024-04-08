package org.example;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MangaRepositoryImpl implements IRepository<Manga> {
    private java.sql.Connection con;

    public MangaRepositoryImpl(){
        this.con = MangaService.getConnection();
    }
    @Override
    public List<Manga> findAll() throws SQLException {
        List<Manga> mangas = new ArrayList<>();

        Statement st = this.con.createStatement();

        ResultSet rs = st.executeQuery("SELECT * FROM manga");

        while (rs.next()){
            Manga manga = bdToEntity(rs);
            mangas.add(manga);
        }
        return mangas;
    }

    @Override
    public Manga findById(int id) throws SQLException {
        Manga manga = null;

        String sql = "SELECT * FROM manga WHERE id = ?";
        PreparedStatement st = this.con.prepareStatement(sql);
        st.setInt(1,id);
        ResultSet rs = st.executeQuery();
        if(rs.next()){
            manga = bdToEntity(rs);
        }
        return manga;
    }

    @Override
    public void save(Manga manga) throws SQLException {
        ResultSet rs;
        PreparedStatement st = null;
        if(manga.getId() == -1){
            String query = "INSERT INTO manga (nombre,fecha_pub,paginas) VALUES (?,?,?)";
            st = this.con.prepareStatement(query);
            st.setString(1,manga.getNombre());
            st.setString(2,manga.getFecha_pub());
            st.setInt(3,manga.getPaginas());
            st.executeUpdate();

            rs = st.getGeneratedKeys();

            if(rs.next()){
                manga.setId(rs.getInt(1));
            }
        }
    }

    @Override
    public void delete(Manga manga) throws SQLException {
        PreparedStatement st = this.con.prepareStatement("DELETE FROM manga WHERE id = ?");
        st.setInt(1,manga.getId());
        st.executeUpdate();
        st.close();
    }

    @Override
    public Manga bdToEntity(ResultSet rs) throws SQLException {
        return new Manga(rs.getInt("id"),rs.getString("nombre"),rs.getString("fecha_pub"),rs.getInt("paginas"));
    }
}
