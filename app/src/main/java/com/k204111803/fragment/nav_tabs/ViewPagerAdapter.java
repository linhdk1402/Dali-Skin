package com.k204111803.fragment.nav_tabs;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.k204111803.fragment.nav_tabs.HoSoFragment;
import com.k204111803.fragment.nav_tabs.PhieuKhamFragment;
import com.k204111803.fragment.nav_tabs.TaiKhoanFragment;
import com.k204111803.fragment.nav_tabs.ThongBaoFragment;
import com.k204111803.fragment.nav_tabs.TrangChuFragment;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new TrangChuFragment();

            case 1:
                return new HoSoFragment();

            case 2:
                return new PhieuKhamFragment();

            case 3:
                return new ThongBaoFragment();

            case 4:
                return new TaiKhoanFragment();

            default:
                return new TrangChuFragment();
        }

    }

    @Override
    public int getCount() {
        return 5;
    }
}
