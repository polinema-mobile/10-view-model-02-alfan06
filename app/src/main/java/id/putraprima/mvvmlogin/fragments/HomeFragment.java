package id.putraprima.mvvmlogin.fragments;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.putraprima.mvvmlogin.R;
import id.putraprima.mvvmlogin.databinding.FragmentHomeBinding;
import id.putraprima.mvvmlogin.viewmodels.HomeViewModels;
import id.putraprima.mvvmlogin.viewmodels.LoginViewModels;

public class HomeFragment extends Fragment {

    private HomeViewModels homeVieModel;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentHomeBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        View view = binding.getRoot();
//        binding.textView.setText(getArguments().getString("username"));
        binding.setLifecycleOwner(this);
        return view;
    }
}