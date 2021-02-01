
public class SignUpManager {
	private IUserCheckService �userCheckService;
	
	public SignUpManager(IUserCheckService iuserCheckService) {
		super();
		�userCheckService = iuserCheckService;
	}

	public void signup(User user) {
		if(�userCheckService.checkUser(user)) {
			System.out.println("Kullanici kayit edildi:"+ user.getName());
		}
		else {
		
			System.out.println("Kullanici kayit olamadi!");
		}
	
		
	}

}
