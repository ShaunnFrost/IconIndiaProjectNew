package com.frantic.icon_india.project.ui;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.frantic.icon_india.project.R;
import com.frantic.icon_india.project.ui.fragment.HomePage;
import com.frantic.icon_india.project.ui.fragment.Transactions;


public class MainActivity extends ActionBarActivity {

    private FloatingActionButton fab;
    private int fragCount;
    public static BottomNavigationView navigation;
    private Fragment fragmenthome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar topToolBar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);


        topToolBar.setTitleTextColor(getResources().getColor(R.color.white));
        navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

       /* CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) navigation.getLayoutParams();
        layoutParams.setBehavior(new BottomNavigationViewBehavior());*/
        fragmenthome = new HomePage();
        loadFragment(fragmenthome);
        setTitle("Home");

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.action_refresh){
            Toast.makeText(MainActivity.this, "Notification", Toast.LENGTH_LONG).show();
        }
        if(id == R.id.action_new){
/*
            LeaveManagements leaveManagements = new LeaveManagements();
            loadFragment(leaveManagements);*/
            return true;
        }
        if(id ==R.id.action_profile)
        {
            Toast.makeText(MainActivity.this, "Profile", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
               case R.id.navigation_shop:
                   fragmenthome = new HomePage();
                    loadFragment(fragmenthome);
                    setTitle("Home");
                    return true;

                case R.id.navigation_gifts:

                    fragment = new Transactions();
                   loadFragment(fragment);
                    setTitle("Projects");
                    return true;
                case R.id.navigation_cart:
                  /*  fragment = new TaskManagement();
                    loadFragment(fragment);*/
                    setTitle("Tasks");
                    return true;
                case R.id.navigation_profile:
                  /*fragment = new AttendanceManagement();
                    loadFragment(fragment);
                  */  setTitle("Attendance");
                    return true;

                case R.id.navigation_leave:
                   /* fragment = new EmloyeeManagement();*/
                    setTitle("Employee");
                    /*loadFragment(fragment);*/
                    return true;
            }

            return false;
        }
    };


   public void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
    public void loadFragmentNew(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }


}