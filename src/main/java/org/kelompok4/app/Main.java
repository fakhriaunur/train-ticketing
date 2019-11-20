package org.kelompok4.app;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public Main(){

	}
	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner scanner = new Scanner(System.in);

		//instansiasi objek objek
		Driver driver = new Driver();
		LoginModel loginModel = new LoginModel(null, null);
		LoginView loginView = new LoginView();
		LoginController loginController = new LoginController(loginModel, loginView);
		UserModel userModel = new UserModel("erwin@gmail.com","123123as","Erwin", "1231231231231231", "123123123123");
		RegisterView registerView = new RegisterView();
		RegisterController registerController = new RegisterController(userModel,registerView);
		CustomerController customerController = new CustomerController(userModel, registerView);
//		driver.login(loginController,loginModel,loginView);
//		driver.register(registerController,userModel,registerView);
		driver.updateinfouser(customerController,userModel,registerView);

	}


}


