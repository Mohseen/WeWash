package com.awashingcompany.wewash.Activities;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.awashingcompany.wewash.Adapters.MainActivityLabelAdapter;
import com.awashingcompany.wewash.Fragments.AccountsFragment;
import com.awashingcompany.wewash.Fragments.CartFragment;
import com.awashingcompany.wewash.Fragments.ExplorerFragment;
import com.awashingcompany.wewash.Fragments.NearMeFragment;
import com.awashingcompany.wewash.Models.MainActivityLabels;
import com.awashingcompany.wewash.R;
import com.awashingcompany.wewash.Utils.BottomNavigationViewHelper;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        applyFont(MainActivity.this,findViewById(R.id.baselayout_mainactivity));


        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.navigationView);

        BottomNavigationViewHelper.removeShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Fragment selectedFragment = null;
                        switch (item.getItemId()) {
                            case R.id.navigation_nearme:
                                selectedFragment = NearMeFragment.newInstance();
                                break;
                            case R.id.navigation_explore:
                                selectedFragment = ExplorerFragment.newInstance();
                                break;
                            case R.id.navigation_cart:
                                selectedFragment = CartFragment.newInstance();
                                break;

                            case R.id.navigation_account:
                                selectedFragment = AccountsFragment.newInstance();
                                break;
                        }
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.container, selectedFragment);
                        transaction.commit();
                        return true;
                    }
                });


        //Manually displaying the first fragment - one time only
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, NearMeFragment.newInstance());
        transaction.commit();

        //Used to select an item programmatically
        //bottomNavigationView.getMenu().getItem(2).setChecked(true);
    }


}
