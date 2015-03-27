/**
 * 
 */
package packageed;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Zole
 *
 */
@Component
public class UserDao {
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private PasswordEncoder encoder;

	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public PasswordEncoder getEncoder() {
		return encoder;
	}


	public void setEncoder(PasswordEncoder encoder) {
		this.encoder = encoder;
	}


	@Transactional(propagation=Propagation.REQUIRED)
	public void saveUser(User user){
		sessionFactory.getCurrentSession().save(user);
	}

}
