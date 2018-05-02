package com.awashingcompany.wewash.Fragments;


import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.awashingcompany.wewash.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AccountsFragment extends Fragment{

    EditText phoneNumberET;
    Button continueButton;
    LinearLayout noLoggedInLL;

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
        View view =  inflater.inflate(R.layout.fragment_accounts, container, false);
        phoneNumberET = view.findViewById(R.id.phonenumber);
        continueButton = view.findViewById(R.id.enteredphonenumberbutton);
        noLoggedInLL = view.findViewById(R.id.notloggedIn);
        phoneNumberET.addTextChangedListener(textWatcher);
        return view;
    }


    private TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            Log.v("length" , String.valueOf(s.length()));

            //check the length of entered string
            if (s.length() == 10){
                //change button text
                continueButton.setText(getString(R.string.continuebutton));

            }
            else{
                continueButton.setText(getString(R.string.enterphonenumber));
            }
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

}
