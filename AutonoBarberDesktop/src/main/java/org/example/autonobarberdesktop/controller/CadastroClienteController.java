package org.example.autonobarberdesktop.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.autonobarberdesktop.dao.ClienteDAO;
import org.example.autonobarberdesktop.model.Cliente;

import java.sql.SQLException;

public class CadastroClienteController {
    @FXML
    public TextField txtNome, txtTelefone;

    @FXML
    private void cadastrarCliente(){
        Cliente cliente = new Cliente(txtNome.getText(), txtTelefone.getText());
        try {
            ClienteDAO dao = new ClienteDAO();
            dao.cadastrarCliente(cliente);
            txtNome.clear();
            txtTelefone.clear();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
