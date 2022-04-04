package com.example.foody;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView =(BottomNavigationView) findViewById(R.id.bottomNavigationViewId);


        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment_container);
        NavController navController = navHostFragment.getNavController();

        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.recipesFragment,
                R.id.favouriteRecipiesFragment,
                R.id.foodJokeFragment
        ).build();

        NavigationUI.setupWithNavController(bottomNavigationView,navController);
        NavigationUI.setupActionBarWithNavController(this,navController,appBarConfiguration);
    }

    @Override
    public boolean onSupportNavigateUp() {
        return super.onSupportNavigateUp() || navController.navigateUp();
    }
}