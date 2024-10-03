package com.example.taptaptap;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.text.Text;

import java.util.Timer;
import java.util.TimerTask;

public class HelloController {
    long count = 10;
    long points = 0;
    @FXML
    Text addPoints = null;
    long upPoints = 1;
    @FXML
    private Text point;
    long secPoints = 10;

    @FXML
    protected void tap() {
        points += upPoints;
        point.setText(String.valueOf(points));
    }
    @FXML
    protected void upDateTap(){
        if (points >= count) {
            points -= count;
            count += 10;
            upPoints += 1;
            point.setText(String.valueOf(points));
            addPoints.setText(String.valueOf(upPoints));
        }
    }

    @FXML
    public void upDateSec(ActionEvent actionEvent) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                points += secPoints;
                point.setText(String.valueOf(points));
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}