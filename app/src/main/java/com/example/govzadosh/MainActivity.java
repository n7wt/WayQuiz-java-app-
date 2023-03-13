package com.example.govzadosh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
public ProgressBar loading;
public int value;
public Intent progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loading = findViewById(R.id.ProgressBar);
        loading.setMax(100);

        progress();
    }


    public void progress() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<=100; i++) {
                    value++;
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            loading.setProgress(value);
                            if (value == 100) {
                                try {
                                    progress = new Intent(MainActivity.this,menu.class);
                                    startActivity(progress);
                                    finish();
                                } catch (Exception e) {
                                System.out.println("Ошибка загрузки.");
                                }

                            }
                        }
                    });
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

}
