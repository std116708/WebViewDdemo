package com.example.webviewddemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class WebViewFragment extends Fragment {
    private WebView webView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //Connect to layout
        View view = inflater.inflate(R.layout.webview_fragment_layout, container,false);
        webView = (WebView) view.findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //use Android Object in javascript to call the function WebAppInterface.showToast("message String")
        webView.addJavascriptInterface(new WebAppInterface(getActivity()), "Android");

        webView.setWebChromeClient(new WebChromeClient());

        //load the URL
        webView.loadUrl(MainActivity.weburl);

        return view;
    }
}
