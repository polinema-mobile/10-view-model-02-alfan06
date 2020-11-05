package id.putraprima.mvvmlogin.viewmodels;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import id.putraprima.mvvmlogin.models.User;

public class HomeViewModels extends ViewModel{
    private MutableLiveData<User> userMutableLiveData = new MutableLiveData<>();
    private User user;

    public HomeViewModels(User user){
        this.user = user;
        this.userMutableLiveData.setValue(this.user);
    }

    public LiveData<User> userLiveData(){
        return userMutableLiveData;
    }
}
