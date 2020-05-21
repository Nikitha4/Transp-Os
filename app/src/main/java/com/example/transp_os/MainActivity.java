package com.example.transp_os;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import org.jfugue.player.Player;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void main(String[] args) {
        Player player = new Player();
        player.play("C D E F G A B");
    }
}
