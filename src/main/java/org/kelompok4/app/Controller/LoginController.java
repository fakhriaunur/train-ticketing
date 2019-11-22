package org.kelompok4.app.Controller;

import org.kelompok4.app.Model.LoginModel;
import org.kelompok4.app.Model.UserModel;
import org.kelompok4.app.View.LoginView;

import java.util.ArrayList;

public class LoginController implements ICanLoginByEmail, ICanAuthByPassword, ICanValidateEmail {
	/*kelompok2.Viewlogin v = new kelompok2.Viewlogin();
	UserModel user = new UserModel();*/

    LoginModel model;
    LoginView view;


    public LoginController(LoginModel model, LoginView view) {
        this.model = model;
        this.view = view;

    }

    @Override
    public String getLoginPassword() {
        return model.getPassword();
    }

    @Override
    public void setLoginPassword(String password) {
        model.setPassword(password);
    }


    @Override
    public String getLoginEmail() {
        return model.getEmail();
    }

    @Override
    public void setLoginEmail(String email) {
        model.setEmail(email);
    }

    @Override
    public boolean validateEmail() {
        return ICanValidateEmail.EMAIL_ADDRESS_REGEX.matcher(getLoginEmail()).find();
    }


    //untuk pengecekan user dan password

    public boolean auth() {
        ArrayList<UserModel> usermodel = new ArrayList<>();

        for (UserModel user : usermodel) {
            System.out.println(user.getNama());
        }
        return true;
    }

    public void authResult() {
        if (auth()) {
            System.out.println("Login Sukses");
        } else {
            System.out.println("Login Gagal");
        }
    }


    public void updateView() {
        clearScreen();
        view.printLoginPage();
        view.printEmail(this.getLoginEmail());
        view.printPassword(this.getLoginPassword());
        authResult();
    }


    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


}