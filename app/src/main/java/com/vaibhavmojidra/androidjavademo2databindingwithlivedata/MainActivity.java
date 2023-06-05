package com.vaibhavmojidra.androidjavademo2databindingwithlivedata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.vaibhavmojidra.androidjavademo2databindingwithlivedata.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MainActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        viewModel=new ViewModelProvider(this).get(MainActivityViewModel.class);
        binding.setMyViewModel(viewModel);
        binding.setLifecycleOwner(this);
    }
}