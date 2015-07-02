/**
 * Created by emil.saghatelyan on 7/3/15.
 */
public class UserConfiguration {
	private User user;
	private MailSender mailSender;
	private UserDao userDao;

	public UserConfiguration(User user, MailSender mailSender, UserDao userDao) {
		this.user = user;
		this.mailSender = mailSender;
		this.userDao = userDao;
	}

	public void forgotPassword(){
		//generate new password
		boolean isSaved = userDao.saveMessage("new generated passdord", "new Password", user);
		if(isSaved){
			mailSender.sendMail("new generated passdord", "new Password", user);
		}

	}

	public void registerNewUser(){
		boolean isSaved = userDao.saveMessage("new user has been created", "User created", user);
		if(isSaved){
			mailSender.sendMail("new user has been created", "User created", user);
		}
	}

}
