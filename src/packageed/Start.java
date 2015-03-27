package packageed;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller

public class Start {
	@Autowired
	UserDao dao;
	@Autowired
	private PasswordEncoder encoder;

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	public PasswordEncoder getEncoder() {
		return encoder;
	}

	public void setEncoder(PasswordEncoder encoder) {
		this.encoder = encoder;
	}

//	@RequestMapping("/")
//	public String start(){
//		return "index";
//	}
	
	@RequestMapping("/first")
	public String startFirst(){
		return "first";
	}
	@RequestMapping("/second")
	public String startSecond(){
		return "second";
	}
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	
	@RequestMapping("/register")
	public String register(){
		return "register";
	}
	
	
	@RequestMapping("/validate")
	public String validate(User user){
		user.setPassword(encoder.encode(user.getPassword()));	
		dao.saveUser(user);
		return "successful";
	}
	@RequestMapping(value="/rest")
	public @ResponseBody String rest(){
		String one= "I am getting out here";
		System.out.println(one+ " this point is reached");
		return one;
	}
	
	
}
