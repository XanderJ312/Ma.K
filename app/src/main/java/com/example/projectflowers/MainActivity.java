package com.example.projectflowers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;

import com.example.projectflowers.adapter.CategoryAdapter;
import com.example.projectflowers.databinding.ActivityMainBinding;
import com.example.projectflowers.model.Category;



public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        if (savedInstanceState==null) {
            replaceFragment(new Home_Fragment());
        }


        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.home:
                    replaceFragment(new Home_Fragment());
                    break;
                case R.id.favorites:
                    replaceFragment(new Favorites_Fragment());
                    break;
                case R.id.koszyk:
                    replaceFragment(new ShoppingCart_Fragment());
                    break;
                case R.id.profileSettings:
                    replaceFragment(new ProfileSettings_Fragment());
                    break;
            }
            return true;
        });


    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();
    }



}