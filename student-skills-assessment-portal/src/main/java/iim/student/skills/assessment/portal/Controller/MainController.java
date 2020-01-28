package iim.student.skills.assessment.portal.Controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import iim.student.skills.assessment.portal.Model.Questions;
import iim.student.skills.assessment.portal.dao.UserDAO;

@Controller
public class MainController {
	@Autowired
	private UserDAO userDao;
	  
	@RequestMapping("/home")
	  public String home(Map<String,Object> model) {      
		  	model.put("message", "HowToDoInJava Reader !!");
		  	if(userDao.authenticationSuccess("TEST", "TEST"))
		  		System.out.print("JDBC success");
		  	
		  	//file stream -n read excel file
		  	
		  	//for loop
		  	
		  	//Questions questions = new Questions(1, 1, 'what', '', '', '', '', '', '', 'Y', null, 1);
		  	Questions questions = new Questions();
		  	questions.setQuestionId(1);
		    questions.setQuestionTypeId(1);
		  	questions.setQuestion("WHazt");
		    questions.setChoice1("ch1");
		    questions.setChoice2("ch2");
		  	questions.setChoice3("ch3");
		  	questions.setChoice4("ch4");
		  	questions.setAnswer(1);
		  	questions.setStrAnswer("null");
		  	questions.setActiveStatus("y");
		  	questions.setCreationDate(null);
		      questions.setCreatedBy(1);
		  	
		  	
		  	userDao.addQuestions(questions);
		    return "index";
	    }

	@RequestMapping("/parthi")
	  public String AddQuestionPage(Map<String,Object> model) {      
		  	
		    return "parthi";
	    }
	
	@RequestMapping("/AddQuestion")
	  public String AddQuestion(Questions questions) {      
		  	
		  	userDao.addQuestions(questions);
		    return "index";
	    }

}
