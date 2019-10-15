package com.example.classa2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
TextView main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main=findViewById(R.id.main);
        GetDataService_Interface service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService_Interface.class);
      Call<Mainbook> call= service.getMainbookCall();
      call.enqueue(new Callback<Mainbook>() {
          @Override
          public void onResponse(Call<Mainbook> call, Response<Mainbook> response) {
              Mainbook mainbook=response.body();
              mainbook.getResult();
              main.setText(mainbook.getResult().getPrimaryTopic().getDescription());
          }

          @Override
          public void onFailure(Call<Mainbook> call, Throwable t) {

          }
      });

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }
}
