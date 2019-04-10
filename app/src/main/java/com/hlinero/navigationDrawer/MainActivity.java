package com.hlinero.navigationDrawer;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

	// Variables
	private DrawerLayout drawerLayout;
	private NavigationView navigationView;
	private TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Initialize variables
		drawerLayout = findViewById(R.id.drawerLayout);
		navigationView = findViewById(R.id.navigationView);
		textView = findViewById(R.id.textview);

		// Setting the navigation view listener
		navigationView.setNavigationItemSelectedListener(this);
	}

	// Listening to clicks on navigation drawer items
	@Override public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

		// Show toast with name of selected item
		Toast.makeText(this,menuItem.getTitle(),Toast.LENGTH_SHORT).show();

		// Set the name of the menu item in the textview
		textView.setText(menuItem.getTitle());

		// Closing the drawer after clicking the item
		drawerLayout.closeDrawers();

		return true;
	}
}
