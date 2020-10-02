package com.example.custom_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    List_View datamodals;
    ArrayList<dataModal> data;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.lv);
        data = new ArrayList<dataModal>();
        data.add(new dataModal(R.drawable.sachhaydacnhantam, "Đắc Nhân Tâm"));
        data.add(new dataModal(R.drawable.sachhaynhagiakim, "Nhà giả kim"));
        data.add(new dataModal(R.drawable.truongthanh, "Mỗi lần vấp ngã là một lần Trưởng Thành"));
        data.add(new dataModal(R.drawable.sachhay, "Tuổi Trẻ Đáng Gía Bao Nhiêu? "));
        data.add(new dataModal(R.drawable.thaydoi, "Đời thay đổi khi chúng ta thay đổi"));
        data.add(new dataModal(R.drawable.sachhaydaycolamgiau, "Dạy Con Làm Giàu"));
        datamodals = new List_View(data,this);
        lv.setAdapter(datamodals);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <? > parent, View view, int position, long id)
            {
                dataModal data_= data.get(position);
                Toast.makeText(MainActivity.this, data_.getName() , Toast.LENGTH_SHORT).show();
            }
        });
    }
}