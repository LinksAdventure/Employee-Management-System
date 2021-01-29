package com.x5.domain;

import java.util.HashMap;

public class Msg {
    private Integer code;
    private String msg;
    private HashMap<String, Object> extend;

    public Msg() {
        this.extend = new HashMap<>();
    }

    public static Msg success(){
        Msg msg= new Msg();
        msg.setCode(100);
        msg.setMsg("成功");
        return msg;
    }
    public static Msg fail(){
        Msg msg= new Msg();
        msg.setCode(200);
        msg.setMsg("失败");
        return msg;
    }

    public Msg add(String key, Object value){
        this.getExtend().put(key, value);
        return this;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", extend=" + extend +
                '}';
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setExtend(HashMap<String, Object> extend) {
        this.extend = extend;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public HashMap<String, Object> getExtend() {
        return extend;
    }
}
