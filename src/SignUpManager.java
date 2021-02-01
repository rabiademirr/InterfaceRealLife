
public class SignUpManager {
	private IUserCheckService ýuserCheckService;
	
	public SignUpManager(IUserCheckService iuserCheckService) {
		super();
		ýuserCheckService = iuserCheckService;
	}

	public void signup(User user) {
		if(ýuserCheckService.checkUser(user)) {
			System.out.println("Kullanici kayit edildi:"+ user.getName());
		}
		else {
		
			System.out.println("Kullanici kayit olamadi!");
		}
	
		
	}

}
