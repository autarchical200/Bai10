package org.coolstyles.mvp;

public class LoginPresenter {
    private UserModel userModel;
    private LoginView loginView;

    public LoginPresenter(LoginView loginView) {
        this.userModel = new UserModel();
        this.loginView = loginView;
    }

    public void login(String username, String password) {
        loginView.showLoading();
        boolean result = userModel.login(username, password);
        loginView.hideLoading();
        if (result) {
            loginView.showLoginSuccessMessage();
        } else {
            loginView.showLoginErrorMessage();
        }
    }
}
