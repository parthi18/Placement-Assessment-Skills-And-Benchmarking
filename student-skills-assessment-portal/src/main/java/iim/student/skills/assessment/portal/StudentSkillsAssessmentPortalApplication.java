package iim.student.skills.assessment.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;



@SpringBootApplication
public class StudentSkillsAssessmentPortalApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(StudentSkillsAssessmentPortalApplication.class);
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(StudentSkillsAssessmentPortalApplication.class, args);
	}
	

}
