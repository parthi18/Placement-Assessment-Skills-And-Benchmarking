/**
 * 
 */
package iim.student.skills.assessment.portal.dao;

import java.util.ArrayList;

import iim.student.skills.assessment.portal.Model.Questions;

/**
 * @author PARTHIBAN P
 *
 */
public interface UserDAO {
	
	boolean authenticationSuccess(String loginname,String password);

	void addQuestions(Questions questions);
	
	//public ArrayList<E> ShowQuestions(int questionId);
}
