package com.example.tablayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HighlightsFragment extends Fragment {

    Spinner spin1, spin2;
    ArrayAdapter adapter1, adapter2;
    String[] arr1 = {"DCW", "MIW"};
    String[] arr2 = {"All", "Fours", "Sixes", "Wickets", "Fifties", "Hundreds", "Dropped Catches", "UDRS", "Others"};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_highlights, container, false);

        spin1 = view.findViewById(R.id.spin1);
        spin2 = view.findViewById(R.id.spin2);

        adapter1 = new ArrayAdapter(getContext(), android.R.layout.simple_list_item_1, arr1);
        adapter2 = new ArrayAdapter(getContext(), android.R.layout.simple_list_item_1, arr2);

        spin1.setAdapter(adapter1);
        spin2.setAdapter(adapter2);

        return view;
    }
}
