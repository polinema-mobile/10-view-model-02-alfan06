package id.putraprima.mvvmlogin.viewmodels;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.navigation.Navigation;

import id.putraprima.mvvmlogin.R;
import id.putraprima.mvvmlogin.models.User;

public class LoginViewModels extends ViewModel{
    private MutableLiveData<User> userMutableLiveData = new MutableLiveData<>();
    private User user;

    public LoginViewModels(User user){
        this.user = user;
        this.userMutableLiveData.setValue(this.user);
    }

    public LiveData<User> userLiveData(){
        return userMutableLiveData;
    }

    private boolean checkCredential(String username, String password){
        if(username.equals("alfannoufal@gmail.com") && password.equals("alfan12")){
            return true;
        }else{
            return false;
        }
    }

    public boolean login(){
        boolean loginCorrect = checkCredential(user.getUsername(),user.getPassword());
        if(loginCorrect){
            return true;
        }else{
            return false;
        }
    }
}
