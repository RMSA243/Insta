package com.example.instapage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class bottom_frag extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_bottom_frag, container, false);

        RecyclerView recyclerView = rootView.findViewById(R.id.postsRecyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3)); // 3 columns

        List<Integer> posts = new ArrayList<>();
        posts.add(R.drawable.post1);
        posts.add(R.drawable.post2);
        posts.add(R.drawable.post3);
        posts.add(R.drawable.post4);

        PostsAdapter adapter = new PostsAdapter(requireContext(), posts);
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}

