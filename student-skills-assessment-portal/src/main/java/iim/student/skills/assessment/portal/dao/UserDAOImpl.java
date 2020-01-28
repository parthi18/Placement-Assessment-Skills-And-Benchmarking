package iim.student.skills.assessment.portal.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.parsing.EmptyReaderEventListener;
import org.springframework.jdbc.core.JdbcTemplate;
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
		
	@Autowired
	public UserDAOImpl(DataSource dataSource) {
		this.setDataSource(dataSource);
	}

	@Override
	public boolean authenticationSuccess(String loginname,String password)
	{
		String sql="SELECT COUNT(Num_login_id) AS CNT FROM Tbl_mst_login WHERE Vch_user_name ='"+loginname+"' AND Vch_password ='"+password+"'";
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
				"("+questions.getQuestionId()+","+questions.getQuestionTypeId()+",'"+questions.getQuestion()+"','"+questions.getChoice1()+"','"+questions.getChoice2()+"','"+questions.getChoice3()+"','"+questions.getChoice4()+"',"+questions.getAnswer()+",'"+questions.getStrAnswer()+"','Y',"+questions.getCreatedBy()+")";
		System.out.print(sql);
		jDBCTemplate.update(sql);
		
	}	

	/*@Override
	public ArrayList<E> ShowQuestions(int questionId)
	{
		String sql="SELECT * FROM tbl_mst_question ";
		if(questionId > 0)
		{
			sql += " WHERE num_question_id ="+questionId;
		}
		System.out.print(sql);
		ResultSet rs;
		///int cnt = jDBCTemplate.queryForObject(sql, RowMapp
		System.out.println(cnt);
		if(cnt>0)
			return true;
		else
		return false;
	}
*/
}
		