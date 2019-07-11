package dev.helenwang.chcoursetest2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.WebView;

public class DisplayContentActivity extends AppCompatActivity {

    private static final String TAG = "DisplayContentActivity";

//    TextView txtTitle;
//    TextView txtDescription;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.display_content);
        setContentView(R.layout.web_content_display);
        WebView contentWebView = (WebView) findViewById(R.id.webview);
        Log.d(TAG, "set content view complete");
        Bundle b = getIntent().getExtras();
        int id = b.getInt("name");
//
//
//        //set label text
//        txtTitle = (TextView) findViewById(R.id.topiclabel);
//        txtTitle.setText(id);
//        Log.d(TAG,"set topic label in layout");

        switch(id) {
            case 0:
                contentWebView.loadUrl("file:///android_asset/cpr.html");
                break;
            case 1:
                contentWebView.loadUrl("file:///android_asset/cardiovascular.html");
                break;
            case 2:
                contentWebView.loadUrl("file:///android_asset/respiratory.html");
                break;
            case 3:
                contentWebView.loadUrl("file:///android_asset/gi.html");
                break;
            case 4:
                contentWebView.loadUrl("file:///android_asset/gu.html");
                break;
            case 5:
                contentWebView.loadUrl("file:///android_asset/neuro.html");
                break;
            case 6:
                contentWebView.loadUrl("file:///android_asset/falls.html");
                break;
            case 7:
                contentWebView.loadUrl("file:///android_asset/other.html");
                break;
            case 8:
                contentWebView.loadUrl("file:///android_asset/about.html");
                break;

        }




//        int i = getResources().getIdentifier(id,"string",getPackageName());
//        getResources().getString(i);
//
//        txtDescription = (TextView) findViewById(R.id.content);
////        if (Build.VERSION.SDK_INT >= 24) {
////            Html.fromHtml(getResources().getString(i),Html.FROM_HTML_MODE_LEGACY); // for 24 api and more
////        } else {
////            Html.fromHtml(getResources().getString(i)); // or for older api
////        }
//        txtDescription.setText(Html.fromHtml(getResources().getString(i)));






    }
}
