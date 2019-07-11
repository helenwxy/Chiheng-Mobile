package dev.helenwang.chcoursetest2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
//    public ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView list = (ListView) findViewById(R.id.courseTopics);
        Log.d(TAG, "onCreate: Started.");

        final String[] names = {
                "基础急救",
                "心血管疾病",
                "呼吸类疾病",
                "消化道疾病",
                "泌尿类疾病",
                "脑部疾病",
                "跌倒",
                "其他疾病",
                "关于"
        };

        ArrayAdapter<String> adaptor = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
        list.setAdapter(adaptor);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Log.d(TAG, "onItemClick: name: " + names[position]);
                Intent intent = new Intent(MainActivity.this, DisplayContentActivity.class);
                intent.putExtra("name",position);
                startActivity(intent);

            }

        });

    }
}
