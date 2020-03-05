package com.example.sayali.farmerauction;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sayali.farmerauction.Prevalent.Prevalent;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;
import io.paperdb.Paper;

public class FarmerHomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    ImageView cereals ,vegetables;
    ImageView fruits,pulses;
    ImageView spices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmer_home);

        cereals=findViewById(R.id.cereals);
        vegetables=findViewById(R.id.vegetables);
        fruits=findViewById(R.id.fruits);
        pulses=findViewById(R.id.pulses);
        spices=findViewById(R.id.spices);

        cereals.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        Intent a=new Intent(FarmerHomeActivity.this,AdminAddNPActivity.class);
        a.putExtra("category","cereals");
        startActivity(a);
        }
        });
        vegetables.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        Intent a=new Intent(FarmerHomeActivity.this,AdminAddNPActivity.class);
        a.putExtra("category","vegetables");
        startActivity(a);
        }
        });
        fruits.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        Intent a=new Intent(FarmerHomeActivity.this,AdminAddNPActivity.class);
        a.putExtra("category","fruits");
        startActivity(a);
        }
        });
        pulses.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        Intent a=new Intent(FarmerHomeActivity.this,AdminAddNPActivity.class);
        a.putExtra("category","pulses");
        startActivity(a);
        }
        });
        spices.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        Intent a=new Intent(FarmerHomeActivity.this,AdminAddNPActivity.class);
        a.putExtra("category","spices");
        startActivity(a);
        }
        });


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Home");
        setSupportActionBar(toolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        View headerView=navigationView.getHeaderView(0);
        TextView usernameTextView=headerView.findViewById(R.id.tvUsernameHeader);
        CircleImageView profileImageView=headerView.findViewById(R.id.ivImageHeader);

        usernameTextView.setText(Prevalent.currentOnlineUser.getName());
        Picasso.get().load(Prevalent.currentOnlineUser.getImage()).placeholder(R.drawable.profile).into(profileImageView);
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
        getMenuInflater().inflate(R.menu.farmer_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
       // int id = item.getItemId();

        //noinspection SimplifiableIfStatement
      //  if (id == R.id.action_settings) {
          //  return true;
       // }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.navCart) {
            // Handle the camera action
           Intent a=new Intent(FarmerHomeActivity.this,CartActivity.class);
            startActivity(a);

        } else if (id == R.id.navOrders) {

        } else if (id == R.id.navCategories) {

        } else if (id == R.id.navSettings) {

            Intent a=new Intent(FarmerHomeActivity.this,SettingsFarmerActivity.class);
            startActivity(a);

        } else if (id == R.id.navLogout) {

            Paper.book().destroy();
            Intent a= new Intent(FarmerHomeActivity.this,MainActivity.class);
            a.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(a);
            finish();


        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
