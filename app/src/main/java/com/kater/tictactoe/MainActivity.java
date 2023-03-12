package com.kater.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Player currentPlayer;
    private int filledSquaresCount = 0;

    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }

    public void onButtonPressed(View view) {
        Button button = (Button) view;
        if (button.getText() != "" || filledSquaresCount == 9) {
            return;
        }
        if (currentPlayer == Player.X) {
            button.setText("X");
            currentPlayer = Player.O;
        } else {
            button.setText("O");
            currentPlayer = Player.X;
        }
        filledSquaresCount++;
    }

}