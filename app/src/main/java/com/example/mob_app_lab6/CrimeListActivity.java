package com.example.mob_app_lab6;

import androidx.fragment.app.Fragment;

public class CrimeListActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
