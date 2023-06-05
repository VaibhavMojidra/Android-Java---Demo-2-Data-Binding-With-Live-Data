package com.vaibhavmojidra.androidjavademo2databindingwithlivedata;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    private MutableLiveData<Integer> count=new MutableLiveData<Integer>(0);

    public LiveData<Integer> getCountData() {
        return count;
    }


    public void incrementCount(){
        count.setValue(count.getValue()+1);
    }

}
