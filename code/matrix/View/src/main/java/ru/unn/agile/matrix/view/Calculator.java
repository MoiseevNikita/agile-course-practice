package ru.unn.agile.matrix.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.control.ComboBox;
import ru.unn.agile.matrix.viewmodel.Operation;
import ru.unn.agile.matrix.viewmodel.ViewModel;

public class Calculator {
    @FXML
    private ViewModel viewModel;
    @FXML
    private TextField matrixA;
    @FXML
    private TextField matrixB;
    @FXML
    private ComboBox<Operation> operation;
    @FXML
    private Button calculateButton;
    @FXML
    private TextField result;
    @FXML
    private Text status;

    @FXML
    void initialize() {
        viewModel = new ViewModel();

        matrixA.textProperty().bindBidirectional(viewModel.matrixAProperty());
        matrixB.textProperty().bindBidirectional(viewModel.matrixBProperty());
        operation.setItems(viewModel.operationsProperty().getValue());
        operation.valueProperty().bindBidirectional(viewModel.operationProperty());
        result.textProperty().bindBidirectional(viewModel.resultProperty());
        status.textProperty().bindBidirectional(viewModel.statusProperty());

        calculateButton.disableProperty().bindBidirectional(
                viewModel.calculateButtonDisabledProperty()
        );

        calculateButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent event) {
                viewModel.calculate();
            }
        });
    }
}