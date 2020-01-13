package com.example.mooveioldwey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lis = findViewById(R.id.am_listviw);

        mooveisAdapter adapter = new mooveisAdapter(this,arryListMooveis());

        lis.setAdapter(adapter);

        lis.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                dataMoovei thisMoovei = (dataMoovei) arryListMooveis().get(position);

                Log.d(thisMoovei.getTitel(), thisMoovei.getText());
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(thisMoovei.getUu()));
                startActivity(intent);


            }
        });
    }

    private ArrayList arryListMooveis() {
        ArrayList<dataMoovei> arr = new ArrayList<dataMoovei>();
        arr.add(new dataMoovei("cars", "1",R.drawable.cars,"https://www.youtube.com/watch?v=UND7XDWgLF0"));
        arr.add(new dataMoovei("code", "2",R.drawable.code_8,"https://www.youtube.com/watch?v=DqO90q0WZ0M"));
        arr.add(new dataMoovei("forzon", "3",R.drawable.frozen_2,"https://www.youtube.com/watch?v=bwzLiQZDw2I"));
        arr.add(new dataMoovei("interstellar", "4",R.drawable.interstellar,"https://www.youtube.com/watch?v=UDVtMYqUAyw"));
        arr.add(new dataMoovei("jurassic_world", "5",R.drawable.jurassic_world,"https://www.youtube.com/watch?v=vJ0BB9nRS_I&t=1827s"));

        arr.add(new dataMoovei("rabbi_jacob", "6",R.drawable.rabbi_jacob,"https://www.youtube.com/watch?v=dFZHMHjdB8w"));
        arr.add(new dataMoovei("rick_and_morty", "7",R.drawable.rick_and_morty,"https://www.youtube.com/watch?v=dFZHMHjdB8w"));
        arr.add(new dataMoovei("spider_man", "8",R.drawable.spider_man,"https://www.youtube.com/watch?v=dFZHMHjdB8w"));
        arr.add(new dataMoovei("the_lion_king", "9",R.drawable.the_lion_king,"https://www.youtube.com/watch?v=dFZHMHjdB8w"));
        arr.add(new dataMoovei("the_simpsons", "10",R.drawable.the_simpsons,"https://www.youtube.com/watch?v=dFZHMHjdB8w"));
        arr.add(new dataMoovei("toy_story_4", "11",R.drawable.toy_story_4,"https://www.youtube.com/watch?v=dFZHMHjdB8w"));
        arr.add(new dataMoovei("young_sheldon", "12",R.drawable.young_sheldon,"https://www.youtube.com/watch?v=dFZHMHjdB8w"));

        return arr;
    }
}
