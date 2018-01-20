package blame.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import blame.dto.BlameDTO;


@WebServlet("/blame/Insert.do")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String blameType = request.getParameter("blameType");
		String userIdBlamere = request.getParameter("userIdBlamere");
		String userIdBlamee = request.getParameter("userIdBlamee");
		Integer productNo = parseint(request.getParameter("productNo"));
		String attachedFile = request.getParameter("attachedFile");
		String blameTitle = request.getParameter("blameTitle");
		String blameContent = request.getParameter("blameContent");
		
		BlameDTO blame = new BlameDTO(blameType,userIdBlamere,userIdBlamee,productNo,attachedFile,blameTitle,blameContent);
	
	}

}
