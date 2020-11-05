package id.putraprima.mvvmlogin.viewmodels;
import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import  id.putraprima.mvvmlogin.models.User;

public class HomeViewModelFactory implements ViewModelProvider.Factory{
    private User user;

    public HomeViewModelFactory(User user) {
        this.user = user;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if(modelClass.isAssignableFrom(HomeViewModels.class)){
            return (T) new LoginViewModels(user);
        }
        throw new IllegalArgumentException("Viewmodel Yang Diminta LoginViewModel");
    }
}
