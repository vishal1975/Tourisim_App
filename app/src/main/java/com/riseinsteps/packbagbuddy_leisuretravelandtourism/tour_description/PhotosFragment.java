package com.riseinsteps.packbagbuddy_leisuretravelandtourism.tour_description;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.riseinsteps.packbagbuddy_leisuretravelandtourism.R;
import com.riseinsteps.packbagbuddy_leisuretravelandtourism.VerticalSpaceItemDecoration;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PhotosFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PhotosFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    //private String mParam1;
   // private String mParam2;
    ArrayList<Integer> photo=new ArrayList<>();

    public PhotosFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param photo Parameter 1.
     *
     * @return A new instance of fragment PhotosFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PhotosFragment newInstance(ArrayList<Integer> photo) {
        PhotosFragment fragment = new PhotosFragment();
        Bundle args = new Bundle();

        args.putIntegerArrayList(ARG_PARAM1,photo);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            photo = getArguments().getIntegerArrayList(ARG_PARAM1);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_photos, container, false);
        RecyclerView photos=v.findViewById(R.id.photo);
        photos.addItemDecoration(new VerticalSpaceItemDecoration(10));
      photos.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
      PhotoAdapter photoAdapter=new PhotoAdapter(photo);
         photos.setAdapter(photoAdapter);
        return v;
    }


}