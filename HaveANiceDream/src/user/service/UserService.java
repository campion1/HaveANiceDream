package user.service;

import java.util.ArrayList;

import user.MemberDTO;

public interface UserService {
	int userInsert(MemberDTO user);
	ArrayList<MemberDTO> userList();
	MemberDTO userSelect(String userId);
	MemberDTO userLogin(String userId, String userPw);

}
