package com.example.mcccafe.customimagelistview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList prgmName;
        int [] prgmImages={R.drawable.abc,R.drawable.ic_add_shopping_cart_black_24dp,R.drawable.ic_android_black_24dp,R.drawable.ic_assignment_turned_in_black_24dp,R.drawable.abc,R.drawable.ic_add_shopping_cart_black_24dp,R.drawable.ic_assignment_turned_in_black_24dp,R.drawable.ic_android_black_24dp,R.drawable.abc};
        String [] prgmNameList={"Let Us C","c++","JAVA","Jsp","Microsoft .Net","Android","PHP","Jquery","JavaScript"};
      ListView listView=(ListView)findViewById(R.id.cs_imgListview);
        listView.setAdapter(new CustomList(this,prgmNameList,prgmImages));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
