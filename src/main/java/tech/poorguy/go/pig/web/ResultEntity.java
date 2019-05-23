package tech.poorguy.go.pig.web;

import com.alibaba.fastjson.JSONArray;

import java.io.Serializable;

/**
 * @author poorguy
 * @version 0.0.1
 * @E-mail 494939649@qq.com
 * @created 2019/5/22 14:33
 * @description
 */
public class ResultEntity<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    public ResultEntity() {
    }

    public ResultEntity(FlagEnum flag, T data) {
        this.flag = flag;
        this.data = data;
        this.msg.add(flag.getDesc());
    }

    public ResultEntity(FlagEnum flag, T data, String message) {
        this.flag = flag;
        this.data = data;
        this.msg.add(message);
    }

    public ResultEntity(FlagEnum flag) {
        this.flag = flag;
        this.data = null;
        this.msg.add(flag.getDesc());
    }

    public ResultEntity(FlagEnum flag, String message) {
        this.flag = flag;
        this.data = null;
        this.msg.add(message);
    }

    public ResultEntity(FlagEnum flag, JSONArray messageArray) {
        this.flag = flag;
        this.data = null;
        this.msg.addAll(messageArray);
    }

    /**
     * 状态码
     */
    private FlagEnum flag;

    /**
     * 数据实体
     */
    private T data;


    /**
     * 提示信息
     */
    private JSONArray msg = new JSONArray();

    public void setFlag(FlagEnum flag) {
        this.flag = flag;
    }

    public int getFlag() {
        return flag.getFlag();
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public JSONArray getMsg() {
        return msg;
    }

    public void setMsg(JSONArray msg) {
        this.msg = msg;
    }

}