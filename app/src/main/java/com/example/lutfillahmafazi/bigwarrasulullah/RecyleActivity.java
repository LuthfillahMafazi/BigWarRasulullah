package com.example.lutfillahmafazi.bigwarrasulullah;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.lutfillahmafazi.bigwarrasulullah.Adapter.Adapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecyleActivity extends AppCompatActivity {

    @BindView(R.id.myRecyle)
    RecyclerView myRecyle;

    String[] namaPerang,detailPerang;
    int[] gambarPerang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyle);
        ButterKnife.bind(this);

        namaPerang = getResources().getStringArray(R.array.NamaPerang);
        detailPerang = getResources().getStringArray(R.array.DetailPerang);
        gambarPerang = new int[]{R.drawable.badar,R.drawable.uhud,R.drawable.khandaq,R.drawable.mutah
        ,R.drawable.tabuk};

        Adapter adapter = new Adapter(this,namaPerang,detailPerang,gambarPerang);
        myRecyle.setHasFixedSize(true);
        myRecyle.setLayoutManager(new LinearLayoutManager(this));
        myRecyle.setAdapter(adapter);
    }
}
