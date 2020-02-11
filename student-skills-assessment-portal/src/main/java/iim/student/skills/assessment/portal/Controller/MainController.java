package iim.student.skills.assessment.portal.Controller;


import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import iim.student.skills.assessment.portal.Model.Questions;
import iim.student.skills.assessment.portal.dao.UserDAO;


@Controller
public class MainController {
	@Autowired
	private UserDAO userDao;
	  
	@RequestMapping("/home")
	  public String home(Model model) {      
		  	//model.put("message", "HowToDoInJava Reader !!");
		  	if(userDao.authenticationSuccess("TEST", "TEST"))
		  		System.out.print("JDBC success");
		  	
		  	//file stream -n read excel file
		  	
		  	//for loop
		  	
		  	//Questions questions = new Questions(1, 1, 'what', '', '', '', '', '', '', 'Y', null, 1);
		  	/*Questions questions = new Questions();
		  	questions.setQuestionId(1);
		    questions.setQuestionTypeId(1);
		  	questions.setQuestion("What is life?");
		    questions.setChoice1("life");
		    questions.setChoice2("love");
		  	questions.setChoice3("feel");
		  	questions.setChoice4("alone");
		  	questions.setAnswer(1);
		  	questions.setStrAnswer("life");
		  	questions.setActiveStatus("y");
		  	questions.setCreationDate(null);
		    questions.setCreatedBy(1);
		  	
		  	
		  	userDao.addQuestions(questions);*/
		  	List<Questions> questionsList =userDao.ShowQuestions(1);

		  	StringBuffer sb = new StringBuffer();
		    sb.append("[");
	    	Questions questions = new Questions();
	    	int i=0;
	    	String s = null;
	    	for (Iterator<Questions> iterator = questionsList.iterator(); iterator.hasNext();) {
	    		i=i+1;
				questions = (Questions) iterator.next();
				sb.append("").append(questions.getQuestion()).append("");
				s += questions.getQuestion();
				if(i+1 < questionsList.size()){
		            sb.append(",");
		            s += ",";
		        }
			}       
	    
		    sb.append("]");

	        model.addAttribute("strQuestArray", sb);
	        model.addAttribute("Questions", questionsList);
	        System.out.println("new"+s);

		    return "quiz";
	    }
	/*public String toJavascriptArray(String[] arr){
	    StringBuffer sb = new StringBuffer();
	    sb.append("[");
	    for(int i=0; i<arr.length; i++){
	        sb.append("\"").append(arr[i]).append("\"");
	        if(i+1 < arr.length){
	            sb.append(",");
	        }
	    }
	    sb.append("]");
	    return sb.toString();
	}*/

	@RequestMapping("/parthi")
	  public String AddQuestionPage(Map<String,Object> model) {      
		  	
		    return "parthi";
	    }
	
	@RequestMapping("/AddQuestion")
	  public String AddQuestion(Questions questions) {      
		  	
		  	userDao.addQuestions(questions);
		    return "index";
	    }
	
	  @RequestMapping(value="/showQuestion", method=RequestMethod.GET)
	    public String ShowQuestions(Model model) {
		  
		  List<Questions> questionsList =userDao.ShowQuestions(2);

	        model.addAttribute("questionsList", questionsList);
	        
	        return "index";
       
	    }


}
