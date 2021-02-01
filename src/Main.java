
public class Main {

	public static void main(String[] args) {
		SignUpManager signupmanager=new SignUpManager(new ComplexUserService());
		signupmanager.signup(new User(1,"rabia Demir",24));
	
	

	}

}
