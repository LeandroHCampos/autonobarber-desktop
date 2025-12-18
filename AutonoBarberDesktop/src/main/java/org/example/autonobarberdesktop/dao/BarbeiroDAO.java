package org.example.autonobarberdesktop.dao;

import org.example.autonobarberdesktop.factory.Connector;
import org.example.autonobarberdesktop.model.Barbeiro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BarbeiroDAO {
    public Connection connection;
    public BarbeiroDAO() throws SQLException {
        this.connection = new Connector().getConnection();
    }

    public void cadastrarBarbeiro(Barbeiro barbeiro){
        String sql = "INSERT INTO barbeiro (nome, email, senha) VALUES (?, ?, ?)";
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, barbeiro.getNome());
            pst.setString(2, barbeiro.getEmail());
            pst.setString(3, barbeiro.getSenha());
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
