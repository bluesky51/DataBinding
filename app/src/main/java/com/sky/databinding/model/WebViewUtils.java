package com.sky.databinding.model;

import android.databinding.BindingAdapter;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by bluesky on 16/11/1.
 */

public class WebViewUtils {
    @BindingAdapter({"webUrl"})
    public static void loadWeb(WebView webView, String url) {
        if (url == null) {
            return;
        } else {
            webView.setWebViewClient(new WebViewClient());
            webView.loadUrl(url);
        }
    }
}
