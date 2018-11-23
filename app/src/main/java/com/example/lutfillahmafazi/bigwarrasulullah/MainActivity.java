package com.example.lutfillahmafazi.bigwarrasulullah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void klikMasuk(View view) {
        Intent pindah = new Intent(new Intent(this,RecyleActivity.class));
        startActivity(pindah);
    }
}
