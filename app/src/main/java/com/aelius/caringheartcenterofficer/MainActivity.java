package com.aelius.caringheartcenterofficer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListView;

import com.aelius.caringheartcenterofficer.Profile.ChangePasswordActivity;
import com.aelius.caringheartcenterofficer.Profile.ProfileActivity;

import com.aelius.caringheartcenterofficer.lead_nurture.fragment.NurtureListFragment;
import com.aelius.caringheartcenterofficer.lead_nurture.fragment.NurtureRegisterFragment;
import com.aelius.caringheartcenterofficer.register_chs.fragment.RegisterCHSFragment;
import com.aelius.caringheartcenterofficer.register_chs.fragment.ViewCHSFragment;
import com.aelius.caringheartcenterofficer.utils.PreferHelper;
import com.techatmosphere.expandablenavigation.model.ChildModel;
import com.techatmosphere.expandablenavigation.model.HeaderModel;
import com.techatmosphere.expandablenavigation.view.ExpandableNavigationListView;

public class MainActivity extends AppCompatActivity {

    Context context;

    Toolbar toolbar;
    DrawerLayout drawer;
    ActionBarDrawerToggle toggle;
    NavigationView navigationView;
    ExpandableNavigationListView navigationExpandableListView;
    String deviceId;
    PreferHelper prefHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        context = this;
        navigationExpandableListView = findViewById(R.id.expandable_navigation);

        prefHelp = new PreferHelper(this);

         drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
         toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        View header = navigationView.getHeaderView(0);

        setNavigationView();

    }

    private void setNavigationView() {

        navigationExpandableListView.init(this)
                .addHeaderModel(
                        new HeaderModel(getResources().getString(R.string.lead_nurture), R.drawable.ic_arrow_down))
                  .addHeaderModel(
                        new HeaderModel(getResources().getString(R.string.lead_nurture), R.drawable.ic_arrow_down,true)
                        .addChildModel(new ChildModel(getResources().getString(R.string.register)))
                        .addChildModel(new ChildModel(getResources().getString(R.string.view)))
                  ).addHeaderModel(
                        new HeaderModel(getResources().getString(R.string.registration), R.drawable.ic_arrow_down,true)
                        .addChildModel(new ChildModel(getResources().getString(R.string.register)))
                        .addChildModel(new ChildModel(getResources().getString(R.string.view)))
                  )
                .addHeaderModel(
                        new HeaderModel(getResources().getString(R.string.app_name), R.drawable.ic_doctor, true)

                )
                .build()
                .addOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
                    @Override
                    public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                        navigationExpandableListView.setSelected(groupPosition);
                        SelectParent(groupPosition);
                   /*     if (drawer.isDrawerOpen(GravityCompat.START)) {
                            drawer.closeDrawer(GravityCompat.START);
                        }   */
                        return false;
                    }
                })
                .addOnChildClickListener(new ExpandableListView.OnChildClickListener() {
                    @Override
                    public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                        navigationExpandableListView.setSelected(groupPosition, childPosition);

                        if (groupPosition == 1) {

                            if (childPosition == 0) {
                                NurtureRegisterFragment addFundFrag = new NurtureRegisterFragment();
                                FragmentReplace(addFundFrag, getString(R.string.reg_nurture));
                            }
                            if (childPosition == 1) {
                                NurtureListFragment addFrag = new NurtureListFragment();
                                FragmentReplace(addFrag, getString(R.string.view_nurture));
                            }


                        }if (groupPosition == 2) {

                            if (childPosition == 0) {
                                RegisterCHSFragment addFundFrag = new RegisterCHSFragment();
                                FragmentReplace(addFundFrag, getString(R.string.register));
                            }
                            if (childPosition == 1) {
                                ViewCHSFragment addFrag = new ViewCHSFragment();
                                FragmentReplace(addFrag, getString(R.string.view));
                            }


                        }


                        return false;
                    }
                });
    }

    public void SelectParent(int groupposi) {
        switch (groupposi) {
            case 0:

                break;
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;


        }

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_change_pass) {
            startActivity(new Intent(this,ChangePasswordActivity.class));
            return true;
        }else if(id==R.id.action_profile){
            startActivity(new Intent(this,ProfileActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void FragmentReplace(Fragment subfrag, String fragTitle) {
        getSupportActionBar().setTitle(fragTitle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_Containt, subfrag).addToBackStack(null).commit();
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }
    }

}
