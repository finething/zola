package packageed;


import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.security.web.header.writers.frameoptions.AllowFromStrategy;
import org.springframework.stereotype.Component;
@Component
public class Listen implements ApplicationListener<ApplicationEvent>{

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("this is"+event.toString());
		
	}

}
