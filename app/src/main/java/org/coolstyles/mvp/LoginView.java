package org.coolstyles.mvp;

public interface LoginView {
    void showLoading();
    void hideLoading();
    void showLoginSuccessMessage();
    void showLoginErrorMessage();
}
