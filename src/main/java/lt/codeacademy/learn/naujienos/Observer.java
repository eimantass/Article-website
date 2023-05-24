package lt.codeacademy.learn.naujienos;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

import lt.codeacademy.learn.naujienos.entities.Straipsnis;
import lt.codeacademy.learn.naujienos.repository.StraipsnisRep;
import lt.codeacademy.learn.naujienos.service.StraipsnisService;

@Configuration
public class Observer {

	
	@Autowired
	StraipsnisRep straipsnisRep;
	//@EventListener
	void seedStraipsniai(ContextRefreshedEvent event) {
	seedStraipsniaiTable();
	}
	private void seedStraipsniaiTable() {
		// TODO Auto-generated method stub
		ArrayList<Straipsnis> straipsniai = new ArrayList<>();
		straipsniai.add(new Straipsnis("Mesa 22.3.7 has been released","According to phoronix.com, Mesa verion 22.3.7 has been released as the final release for Q4'2022 driver series and includes several RADV Vulkan and RadeonSI Opengl fixes designed for AMD Linux users"));
		straipsniai.add(new Straipsnis("Intel is working on Linux kernel networking optimizations","According to phoronix.com, intel continues to develop Linux kernel patches, that are designed to improve networking performance."));
		straipsnisRep.saveAll(straipsniai);
	}
}
