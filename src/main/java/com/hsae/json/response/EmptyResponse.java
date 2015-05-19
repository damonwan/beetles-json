package com.hsae.json.response;

/**
 * JSON-空返回结果
 * 
 * @author shishun
 *
 */
public class EmptyResponse extends Response {

    /**
     * 无参构造方法，初始化数据
     */
    public EmptyResponse() {
        this.code = CODE_EMPTY;
        this.msg = MSG_EMPTY;
    }

    /**
     * 有参构造方法
     * 
     * @param code
     * @param msg
     */
    public EmptyResponse(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
