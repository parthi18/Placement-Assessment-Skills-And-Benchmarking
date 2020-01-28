package iim.student.skills.assessment.portal.Model;

import java.util.Date;

public class Questions {
	
	int questionId;
	int questionTypeId; 
	String question; 
	String choice1; 
	String choice2;
	String choice3; 
	String choice4; 
	int answer; 
	String strAnswer; 
	String activeStatus;
	Date creationDate; 
	int createdBy;
	
	public Questions()
	{
		
	}
	
	public Questions(int questionId, int questionTypeId, String question, String choice1, String choice2,
			String choice3, String choice4, int answer, String strAnswer, String activeStatus, Date creationDate,
			int createdBy) {
		super();
		this.questionId = questionId;
		this.questionTypeId = questionTypeId;
		this.question = question;
		this.choice1 = choice1;
		this.choice2 = choice2;
		this.choice3 = choice3;
		this.choice4 = choice4;
		this.answer = answer;
		this.strAnswer = strAnswer;
		this.activeStatus = activeStatus;
		this.creationDate = creationDate;
		this.createdBy = createdBy;
	}
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public int getQuestionTypeId() {
		return questionTypeId;
	}
	public void setQuestionTypeId(int questionTypeId) {
		this.questionTypeId = questionTypeId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getChoice1() {
		return choice1;
	}
	public void setChoice1(String choice1) {
		this.choice1 = choice1;
	}
	public String getChoice2() {
		return choice2;
	}
	public void setChoice2(String choice2) {
		this.choice2 = choice2;
	}
	public String getChoice3() {
		return choice3;
	}
	public void setChoice3(String choice3) {
		this.choice3 = choice3;
	}
	public String getChoice4() {
		return choice4;
	}
	public void setChoice4(String choice4) {
		this.choice4 = choice4;
	}
	public int getAnswer() {
		return answer;
	}
	public void setAnswer(int answer) {
		this.answer = answer;
	}
	public String getStrAnswer() {
		return strAnswer;
	}
	public void setStrAnswer(String strAnswer) {
		this.strAnswer = strAnswer;
	}
	public String getActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	
	
}
