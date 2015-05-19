package com.hsae.json.response;

/**
 * JSON-操作失败返回结果
 * 
 * @author shishun
 *
 */
public class FailedResponse extends Response {
    /**
     * 默认无参构造方法,初始化数据
     */
    public FailedResponse() {
        this.code = Response.CODE_FAILED;
        this.msg = Response.MSG_FAILED;
    }

    /**
     * 有参构造方法
     * 
     * @param code
     * @param msg
     */
    public FailedResponse(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
