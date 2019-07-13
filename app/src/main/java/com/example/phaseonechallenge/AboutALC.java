package com.example.phaseonechallenge;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        setupToolbar();


        WebView view = findViewById(R.id.webview_alc_website);
        view.getSettings().setJavaScriptEnabled(true);
        view.setWebViewClient(new WebViewClient() {
                                  @Override
                                  public boolean shouldOverrideUrlLoading(WebView view, String url) {
                                      view.loadUrl(url);
                                      return false;
                                  }

                                  @Override
                                  public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError er) {
                                      handler.proceed();
                                      // Ignore SSL certificate errors
                                  }
                              }
        );
        view.loadUrl(("https://www.andela.com/alc/"));
    }

    private void setupToolbar() {
        ActionBar toolbar = getSupportActionBar();
        assert toolbar != null;
        toolbar.setTitle(R.string.about_alc);
    }
}
