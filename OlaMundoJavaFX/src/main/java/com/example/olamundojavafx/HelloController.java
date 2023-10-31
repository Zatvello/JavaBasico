package com.example.olamundojavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label lblMensagem;
    private Button btnClick;

    @FXML
    protected void clicouBotao(ActionEvent event) {
        lblMensagem.setText("Olá, Mundo!");
    }
}