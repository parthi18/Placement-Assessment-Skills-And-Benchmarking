/**
 * 
 */
package iim.student.skills.assessment.portal.dao;

import java.util.List;

import iim.student.skills.assessment.portal.Model.Questions;

/**
 * @author PARTHIBAN P
 *
 */
public interface UserDAO {
	
	boolean authenticationSuccess(String username,String password);

	void addQuestions(Questions questions);
	
	//public ArrayList<E> ShowQuestions(int questionId);
	
	List<Questions> ShowQuestions(int questionId);
}
