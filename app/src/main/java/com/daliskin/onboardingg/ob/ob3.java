package com.daliskin.onboardingg.ob;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.daliskin.onboardingg.R;
import com.daliskin.onboardingg.home.HomeNotSignupActivity;
import com.daliskin.onboardingg.signup.SignUpActivity;

public class ob3 extends Fragment {

    private Button btnVaoTrangChu;
    private TextView tvDangKy;
    private View mview;

    public ob3() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mview = inflater.inflate(R.layout.fragment_ob3, container, false);
        btnVaoTrangChu = mview.findViewById(R.id.btnVaoTrangChu);
        btnVaoTrangChu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), HomeNotSignupActivity.class);
                getActivity().startActivity(intent);
            }
        });

        tvDangKy = mview.findViewById(R.id.tvDangKy);
        tvDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SignUpActivity.class);
                getActivity().startActivity(intent);
            }
        });
        return mview;
    }
}
