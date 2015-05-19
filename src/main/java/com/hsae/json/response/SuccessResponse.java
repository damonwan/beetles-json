package com.hsae.json.response;

/**
 * JSON-操作成功返回结果
 * 
 * @author shishun
 *
 */
public class SuccessResponse extends Response {

    /**
     * 无参构造方法，初始化数据
     */
    public SuccessResponse() {
        this.code = CODE_SUCCESS;
        this.msg = MSG_SUCCESS;
    }

    /**
     * 有参构造方法，初始化数据
     */
    public SuccessResponse(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
