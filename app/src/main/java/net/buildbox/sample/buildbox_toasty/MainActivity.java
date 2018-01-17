package net.buildbox.sample.buildbox_toasty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onShowToast(View view) {
        Toasty.success(this, "成功しました。", Toast.LENGTH_SHORT, true).show();
    }
}
