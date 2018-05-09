package com.plani.cms.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.plani.cms.dao.TestDAO;
import com.plani.cms.dto.TestVO;

public class testListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = "list.jsp";
		
		TestDAO tDao = TestDAO.getInstance();
		
		List<TestVO> tVoList = tDao.listTest();

		request.setAttribute("tVoList", tVoList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

	
	
}
