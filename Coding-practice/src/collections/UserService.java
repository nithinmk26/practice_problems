package collections;

public interface UserService {
	public String createAccount(int id);

}

class userServiceImpl implements UserService{

	@Override
	public String createAccount(int id) {
		validateId();
		validateName();
		return "User created.....!";
	}
	
	public boolean validateId() {
		return true;
	}
	public boolean validateName() {
		return true;
	}
	
}

