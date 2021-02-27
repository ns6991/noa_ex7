package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        WebView web = findViewById(R.id.web);
        EditText text=findViewById(R.id.address);
        web.getSettings().setJavaScriptEnabled(true);

        web.setWebViewClient(new MyWebViewClient());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = text.getText().toString();
                web.loadUrl(url);
                text.setEnabled(false);
                button.setEnabled(false);
            }
        });
    }
}