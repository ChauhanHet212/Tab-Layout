package com.example.tablayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ScorecardFragment extends Fragment {

    boolean b1 = false, b2 = false;

    LinearLayout team1, team2, linear1, linear2;
    ImageView team1_b, team2_b;
    TextView team1_n, team1_s, team2_n, team2_s;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_scorecard, container, false);

        team1 = view.findViewById(R.id.team1);
        team2 = view.findViewById(R.id.team2);
        linear1 = view.findViewById(R.id.linear1);
        linear2 = view.findViewById(R.id.linear2);
        team1_b = view.findViewById(R.id.team1_b);
        team2_b = view.findViewById(R.id.team2_b);
        team1_n = view.findViewById(R.id.team1_n);
        team2_n = view.findViewById(R.id.team2_n);
        team1_s = view.findViewById(R.id.team1_s);
        team2_s = view.findViewById(R.id.team2_s);

        team1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b1){
                    b1 = false;
                    team1.setBackgroundColor(getResources().getColor(R.color.white));
                    team1_n.setTextColor(getResources().getColor(R.color.black));
                    team1_s.setTextColor(getResources().getColor(R.color.black));
                    team1_b.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                    linear1.setVisibility(View.GONE);
                } else {
                    b1 = true;
                    team1.setBackgroundColor(getResources().getColor(R.color.teal_200));
                    team1_n.setTextColor(getResources().getColor(R.color.white));
                    team1_s.setTextColor(getResources().getColor(R.color.white));
                    team1_b.setImageResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
                    linear1.setVisibility(View.VISIBLE);
                }
            }
        });

        team2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b2){
                    b2 = false;
                    team2.setBackgroundColor(getResources().getColor(R.color.white));
                    team2_n.setTextColor(getResources().getColor(R.color.black));
                    team2_s.setTextColor(getResources().getColor(R.color.black));
                    team2_b.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                    linear2.setVisibility(View.GONE);
                } else {
                    b2 = true;
                    team2.setBackgroundColor(getResources().getColor(R.color.teal_200));
                    team2_n.setTextColor(getResources().getColor(R.color.white));
                    team2_s.setTextColor(getResources().getColor(R.color.white));
                    team2_b.setImageResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
                    linear2.setVisibility(View.VISIBLE);
                }
            }
        });

        return view;
    }
}
