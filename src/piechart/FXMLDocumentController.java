/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piechart;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;

/**
 *
 * @author Onyekachukwu
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private PieChart pieChart;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("Women",60),
                new PieChart.Data("Men",25),
                new PieChart.Data("Children",30)
        );
        pieChart.setData(pieChartData);
        pieChart.setAnimated(true);
        pieChart.setClockwise(true);
        pieChart.setTitle("Statistics");
    }

}
