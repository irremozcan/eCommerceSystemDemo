package core;

import Google.GoogleLogin;

public class GoogleLoginAdapter implements GoogleEmail{

	@Override
	public void send(String email, String message) {
		GoogleLogin googleLogin=new GoogleLogin();
		googleLogin.googleLogin(email, message);
	}

}
