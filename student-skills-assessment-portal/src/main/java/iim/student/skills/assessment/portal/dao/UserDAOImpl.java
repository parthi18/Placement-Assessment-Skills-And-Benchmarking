package iim.student.skills.assessment.portal.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import iim.student.skills.assessment.portal.Model.Questions;

@Repository
@Transactional
public class UserDAOImpl extends JdbcDaoSupport implements UserDAO
{
	@Autowired
	JdbcTemplate jDBCTemplate;

	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
			
	@Autowired
	public void setjDBCTemplate(JdbcTemplate jDBCTemplate) {
		this.jDBCTemplate = jDBCTemplate;
	}

	@Autowired
	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	@Autowired
	public UserDAOImpl(DataSource dataSource) {
		this.setDataSource(dataSource);
	}

	@Override
	public boolean authenticationSuccess(String username,String password)
	{
		String sql="SELECT COUNT(Num_login_id) AS CNT FROM Tbl_mst_login WHERE Vch_user_name ='"+username+"' AND Vch_password ='"+password+"'";
		System.out.print(sql);
		int cnt = jDBCTemplate.queryForObject(sql, Integer.TYPE);
		System.out.println(cnt);
		if(cnt>0)
			return true;
		else
		return false;
	}
	
	@Override
	public void addQuestions(Questions questions)
	{
		String sql="insert into tbl_mst_question (num_question_id, num_question_type_id, vch_question, vch_choice1, vch_choice2, vch_choice3, vch_choice4, num_answer, vch_strAnswer, chr_active_status, num_created_by) values "+
				"("+questions.getQuestionId()+","+questions.getQuestionTypeId()+",'"+questions.getQuestion()+"','"+questions.getChoice1()+"','"+questions.getChoice2()+"','"+questions.getChoice3()+"','"+questions.getChoice4()+"',"+questions.getAnswer()+",'"+questions.getStrAnswer()+"','Y',1)";
		System.out.print(sql);
		jDBCTemplate.update(sql);
		
	}	

	@Override
	public List<Questions> ShowQuestions(int questionId)
	{
	List<Questions> questList = null;
	String sql="SELECT num_question_id, num_question_type_id, vch_question, vch_choice1, vch_choice2, vch_choice3, vch_choice4 FROM tbl_mst_question  ";
	/*if(questionId > 0)
	{
		sql += " WHERE num_question_id ="+questionId;
	}*/
	System.out.print(sql);
	try {
		questList = jDBCTemplate.query(sql, new RowMapper<Questions>(){
		public Questions mapRow(ResultSet rs, int rowNum) throws SQLException {
		Questions questions = new Questions();
		questions.setQuestionId(rs.getInt("NUM_Question_ID"));
		questions.setQuestionTypeId(rs.getInt("num_question_type_id"));
		questions.setQuestion(rs.getString("vch_question")); 
	    questions.setChoice1(rs.getString("vch_choice1"));
		questions.setChoice2(rs.getString("vch_choice2"));
		questions.setChoice3(rs.getString("vch_choice3"));
	    questions.setChoice4(rs.getString("vch_choice4"));
	    
	    
	System.out.println(" question type id "+rs.getString("num_question_type_id"));
	System.out.println("-------------------------------------------------------");
	System.out.println(" question id "+rs.getInt("NUM_Question_ID"));
	System.out.println("-------------------------------------------------------");
	System.out.println(" question "+rs.getString("vch_question"));	
		return questions;
		}
		});
	} 
	catch (Exception e) {
		System.out.print(e.toString());
	}
	return questList;
	}
}
		