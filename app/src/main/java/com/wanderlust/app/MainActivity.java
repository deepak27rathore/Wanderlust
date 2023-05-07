package com.wanderlust.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.wanderlust.app.adapter.RecentsAdapter;
import com.wanderlust.app.model.RecentsData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recentRecycler;
    RecentsAdapter recentsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("Dal Lake","India","From Rs.2000",R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Himalaya Hills","India","From Rs.3000",R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("Nilgiri Lake","India","From Rs.4000",R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Udaygiri Hills","India","From Rs.3000",R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("Rajsamand Lake","India","From Rs.3500",R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Arawali Hills","India","From Rs.1500",R.drawable.recentimage2));

        setRecentRecycler(recentsDataList);

    }
    private  void setRecentRecycler(List<RecentsData> recentsDataList){

        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);

    }
}