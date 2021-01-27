package com.imooc.course.filter;

import com.imooc.thrift.user.dto.UserDTO;
import com.imooc.user.client.LoginFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CourseFilter extends LoginFilter {

    @Override
    public void login(HttpServletRequest request, HttpServletResponse response, UserDTO userDTO) {
        request.setAttribute("user",userDTO);
    }
}
