package id.putraprima.mvvmlogin.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import id.putraprima.mvvmlogin.models.User;

public class LoginViewModels extends ViewModel{
    private MutableLiveData<User> userMutableLiveData = new MutableLiveData<>();
    private User user;
    private String username="alfannoufal@gmail.com",password ="alfan123";

    public LoginViewModels(User user){
        this.user = user;
        this.userMutableLiveData.setValue(this.user);
    }

    public LiveData<User> userLiveData(){
        return userMutableLiveData;
    }

    private boolean checkCredential(){
        if(username.equals(user.getUsername()) && password.equals(user.getPassword())){
            return true;
        }else{
            return false;
        }
    }
}
