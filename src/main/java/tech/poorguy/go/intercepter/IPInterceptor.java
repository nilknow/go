package tech.poorguy.go.intercepter;

import org.springframework.web.servlet.HandlerInterceptor;
import tech.poorguy.go.util.IPUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author poorguy.tech
 * @Date 2019/5/27 16:35
 * @Mail 494939649@qq.com / maxwangein@gmail.com
 **/
public class IPInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
//        System.out.println(IPUtil.getRemortIP(request));
        return true;
    }
}