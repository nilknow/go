package tech.poorguy.go.util;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author poorguy.tech
 * @Date 2019/5/27 16:32
 * @Mail 494939649@qq.com / maxwangein@gmail.com
 **/
public class IPUtil {
    public static String getRemortIP(HttpServletRequest request) {
        if (request.getHeader("x-forwarded-for") == null) {
            if(request.getRemoteAddr()!="0:0:0:0:0:0:0:1"){
                return request.getRemoteAddr();//如果用户使用代理，则获取的是代理的ip
            }else return null;
        }
        return request.getHeader("x-forwarded-for");
    }
}
