package com.example.mastercodingnestedjsonretrofit.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.mastercodingnestedjsonretrofit.MyApi;
import com.example.mastercodingnestedjsonretrofit.R;
import com.example.mastercodingnestedjsonretrofit.models.SuperModel;
import com.example.mastercodingnestedjsonretrofit.models.UserDataModel;

import java.util.ArrayList;
import java.util.Arrays;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    ArrayList<UserDataModel> listData;
    TextView textView;

    String value = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.IdTexView);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://run.mocky.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        MyApi myApi = retrofit.create(MyApi.class);

        Call<SuperModel> call = myApi.getData();

        call.enqueue(new Callback<SuperModel>() {
            @Override
            public void onResponse(Call<SuperModel> call, Response<SuperModel> response) {

                if(response.isSuccessful())
                {
                   SuperModel superModel =  response.body();

                     listData = new ArrayList<>(Arrays.asList(superModel.getMoviz()));

                     for(UserDataModel userDataModel : listData)
                     {
                         value +=""+userDataModel.getId()+"\n"+userDataModel.getName()+"\n"
                                 +userDataModel.getDetails().getBehaviour()+"\n"+userDataModel.getDetails().getHairColor()+"\n\n";

                     }

                     textView.setText(value);


                }


            }

            @Override
            public void onFailure(Call<SuperModel> call, Throwable t) {

            }
        });


    }
}