package manager_blame.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;import blame.query.BlameQuery;
import fw.DBUtil;
import manager_blame.dto.Manager_BlameDTO;
import manager_blame.query.Manager_BlameQuery;

public class Manager_BlameDAOimpl implements Manager_BlameDAO {

	public int insert(Manager_BlameDTO dto, Connection con) throws SQLException {
		int result = 0;
		PreparedStatement ptmt = null;
		ptmt = con.prepareStatement(Manager_BlameQuery.BLAME_INSERT);
		
		ptmt.setInt(1, dto.getAnswerNo());
		ptmt.setString(2, dto.getAnswerTitle());
		ptmt.setString(3, dto.getAnswerContent());
		ptmt.setDate(4, dto.getAnswerDate());
		
		result = ptmt.executeUpdate();
		return result;
	}

	public Manager_BlameDTO select(int answerNo, Connection con) throws SQLException {
		Manager_BlameDTO dto = null;
		PreparedStatement ptmt=null;
		ResultSet rs = null;
		ptmt = con.prepareStatement(Manager_BlameQuery.BLAME_SELECT);
		ptmt.setInt(1, answerNo);
		
		rs = ptmt.executeQuery();
		if(rs.next()){
			dto = new Manager_BlameDTO(
					rs.getInt(1),
					rs.getString(2),
					rs.getString(3),
					rs.getDate(4)
					);
		}
		DBUtil.close(rs);
		DBUtil.close(ptmt);
		return dto;
	}

}