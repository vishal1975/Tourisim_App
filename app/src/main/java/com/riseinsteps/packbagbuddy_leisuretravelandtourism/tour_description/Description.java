package com.riseinsteps.packbagbuddy_leisuretravelandtourism.tour_description;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.riseinsteps.packbagbuddy_leisuretravelandtourism.Adventure_Data;
import com.riseinsteps.packbagbuddy_leisuretravelandtourism.R;

import java.util.ArrayList;

public class Description extends AppCompatActivity {
    ViewPager2 pager;
    TabLayout tabLayout;
    FactsFragment factsFragment;
    PhotosFragment photosFragment;
    VideoFragment videoFragment;

    Adventure_Data adventure_data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        pager=findViewById(R.id.pager);
        adventure_data= (Adventure_Data) getIntent().getSerializableExtra("obj");
        setup_activity_views();
          setup_fragment();
         tabLayout = findViewById(R.id.tab);
         setup_pager();
        //passing_value();

    }


    public void setup_activity_views(){
        ImageView location=findViewById(R.id.location);
        location.setImageResource(adventure_data.getImage_id());
        TextView title=findViewById(R.id.title);
        title.setText(adventure_data.getTitle());
        TextView amount=findViewById(R.id.amount);
        amount.setText(adventure_data.getAmount());
        TextView tours=findViewById(R.id.tours);
        tours.setText(adventure_data.getTime());
    }

    public void setup_fragment(){
        factsFragment=FactsFragment.newInstance(adventure_data.getDescription(),"nothing");
        photosFragment= PhotosFragment.newInstance((ArrayList<Integer>) adventure_data.getPhotos());
        videoFragment=new VideoFragment();
    }
    public void setup_pager(){
        ArrayList<Fragment> fragments=new ArrayList<>();
        ArrayList<String> title=new ArrayList<>();
        title.add("Facts");
        title.add("Photos");
        title.add("Videos");
        fragments.add(factsFragment);
        fragments.add(photosFragment);
        fragments.add(videoFragment);
        FragmentAdapter fragmentAdapter=new FragmentAdapter(this,fragments);
       pager.setAdapter(fragmentAdapter);
        new TabLayoutMediator(tabLayout, pager,
                (tab, position) -> tab.setText(title.get(position))
        ).attach();

    }
    public void passing_value(){
        Bundle b=new Bundle();
        b.putString("key","vishal chaudhary");
        photosFragment.setArguments(b);
    }
}