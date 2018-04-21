package com.awashingcompany.wewash.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.awashingcompany.wewash.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AccountsFragment extends Fragment {

    public static AccountsFragment newInstance() {
        AccountsFragment fragment = new AccountsFragment();
        return fragment;
    }

    public AccountsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_accounts, container, false);
    }

}
