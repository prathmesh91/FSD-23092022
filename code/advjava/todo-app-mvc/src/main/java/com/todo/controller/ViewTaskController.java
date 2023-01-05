package com.todo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.todo.dto.TaskBean;
import com.todo.model.ToDoModel;

@WebServlet("/view-task")
public class ViewTaskController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ToDoModel model = new ToDoModel();
		List<TaskBean> list = model.getAllTask();
		
		request.setAttribute("tasklist", list);
		
		RequestDispatcher dis = request.getRequestDispatcher("view-task.jsp");
		dis.forward(request, response);
	}

}
