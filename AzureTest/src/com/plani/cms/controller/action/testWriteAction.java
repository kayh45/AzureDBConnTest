package com.plani.cms.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.plani.cms.dao.TestDAO;
import com.plani.cms.dto.TestVO;

public class testWriteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = "result.jsp";
		TestVO tVo = new TestVO();
		
		tVo.setTestName(request.getParameter("testName"));
		tVo.setTestNum(Integer.parseInt(request.getParameter("testNum")));
		
		TestDAO tDao = TestDAO.getInstance();
		tDao.writeTest(tVo);
		
		System.out.println("testName = " + tVo.getTestName());
		System.out.println("testNum = " + tVo.getTestNum());
		
		request.setAttribute("testName", tVo.getTestName());
		request.setAttribute("testNum", tVo.getTestNum());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
