package org.example.autonobarberdesktop.dao;

import org.example.autonobarberdesktop.factory.Connector;
import org.example.autonobarberdesktop.model.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {
    private Connection connection;

    public ClienteDAO() throws SQLException {
        this.connection = new Connector().getConnection();
    }
    public void cadastrarCliente(Cliente cliente){
        String sql = "INSERT INTO cliente (nome, telefone) VALUES (?, ?)";
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, cliente.getNome());
            pst.setString(2, cliente.getTelefone());
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}



