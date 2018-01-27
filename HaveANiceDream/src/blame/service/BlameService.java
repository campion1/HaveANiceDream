package blame.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import blame.dto.BlameDTO;

public interface BlameService {
	int insert(BlameDTO dto);
	ArrayList<BlameDTO> list();
	ArrayList<BlameDTO> user_list(String userIdBlamere);
	int update(String blameType,String attachedFile,String blameTitle,String blameContent);
	BlameDTO select(int blameNo);

}
