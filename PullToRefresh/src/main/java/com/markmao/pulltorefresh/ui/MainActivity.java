package com.markmao.pulltorefresh.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.markmao.pulltorefresh.R;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button listBrn;
    private Button scrollBrn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);

        listBrn = (Button) findViewById(R.id.list_view_btn);
        listBrn.setOnClickListener(this);
        scrollBrn = (Button) findViewById(R.id.scroll_view_btn);
        scrollBrn.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        if (v == listBrn) {
            XListViewActivity.launch(this);
        }
        else if (v == scrollBrn) {
            XScrollViewActivity.launch(this);
        }
    }
}
