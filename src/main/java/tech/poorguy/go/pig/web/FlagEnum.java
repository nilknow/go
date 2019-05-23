package tech.poorguy.go.pig.web;

/**
 * @author poorguy
 * @version 0.0.1
 * @E-mail 494939649@qq.com
 * @created 2019/5/22 14:33
 * @description
 */
public enum FlagEnum {

    FLAG_SUCCESS(1, "操作成功"),
    FLAG_ERROR(2, "操作失败"),
    FLAG_ERROR_9999(9999, "用户名已存在"),
    FLAG_ERROR_100(100, "操作失败,缺少主键"),
    FLAG_ERROR_200(200, "用户名密码错误!"),
    FLAG_ERROR_201(201, "验证码错误!"),
    FLAG_ERROR_202(202, "当前已为最大客户端连接!"),
    FLAG_ERROR_203(203, "登录超时请重新登录!"),
    FLAG_ERROR_400(400, "您没有当前菜单权限!"),
    //查询使用条件不存在或失效
    FLAG_ERROR_500(500, "当前用户不存在"),
    FLAG_ERROR_501(501, "无效的token"),


    FLAG_ERROR_600(600, "操作失败,缺少必要参数"),
    FLAG_ERROR_700(700, "操作失败,该用户已在课题成员中"),
    FLAG_ERROR_800(800, "操作失败,非法参数");

    /**
     * 状态码
     */
    private int flag;
    /**
     * 状态码描述
     */
    private String desc;

    private FlagEnum(int flag, String desc) {
        this.flag = flag;
        this.desc = desc;
    }

    public int getFlag() {
        return this.flag;
    }

    public String getDesc() {
        return this.desc;
    }
}
