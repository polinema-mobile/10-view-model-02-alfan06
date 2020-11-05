package id.putraprima.mvvmlogin.fragments;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.putraprima.mvvmlogin.R;
import id.putraprima.mvvmlogin.databinding.FragmentLoginBinding;
import id.putraprima.mvvmlogin.viewmodels.LoginViewModelFactory;
import id.putraprima.mvvmlogin.viewmodels.LoginViewModels;
import id.putraprima.mvvmlogin.models.User;


public class LoginFragment extends Fragment {
    private LoginViewModels loginVieModels;
    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentLoginBinding binding = DataBindingUtil.inflate(inflater,R.layout.fragment_login, container, false);
        LoginViewModelFactory viewModelLoginFactory = new LoginViewModelFactory(new User("alizarizqi@gmail.com","aliza"));
        loginVieModels = new ViewModelProvider(this, viewModelLoginFactory).get(LoginViewModels.class);
        View view = binding.getRoot();
        binding.setViewModel(loginVieModels);
        binding.setLifecycleOwner(this);
        return view;
    }
}