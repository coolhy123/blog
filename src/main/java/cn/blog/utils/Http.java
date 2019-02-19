package cn.blog.utils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2019/2/18.
 */
public class Http {


    public static HttpServletResponse  responseReturn( ServletResponse servletResponse){

        return (HttpServletResponse) servletResponse;
    }

    public static HttpServletRequest  requestReturn( ServletRequest servletRequest){
        return (HttpServletRequest) servletRequest;
    }



}
