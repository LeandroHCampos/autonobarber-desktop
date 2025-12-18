package org.example.autonobarberdesktop.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.example.autonobarberdesktop.dao.BarbeiroDAO;
import org.example.autonobarberdesktop.model.Barbeiro;

import java.sql.SQLException;

public class CadastroBarbeiroController {
    @FXML
    public TextField txtNome, txtEmail, txtSenha;
    @FXML
    private void cadastrarBarbeiro(){
        Barbeiro barbeiro = new Barbeiro(txtNome.getText(), txtEmail.getText(), txtSenha.getText());
        try {
            BarbeiroDAO dao = new BarbeiroDAO();
            dao.cadastrarBarbeiro(barbeiro);
            txtNome.clear();
            txtEmail.clear();
            txtSenha.clear();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
