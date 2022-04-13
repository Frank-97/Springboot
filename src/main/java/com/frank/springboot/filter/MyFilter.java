package com.frank.springboot.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Package: com.frank.springboot.filter
 * @ClassName: MyFilter
 * @Author Frank
 * @Data 2022-03-15-11:06
 * @Description:
 */
@WebFilter(urlPatterns = "/*",filterName = "myFilter")
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("-----------doFilter------------");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
