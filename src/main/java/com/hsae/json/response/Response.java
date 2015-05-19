package com.hsae.json.response;

/**
 * JSON-返回值顶层抽象类
 * 
 * @author shishun
 *
 */
public abstract class Response {
    public static final String CODE_FAILED = "0"; // 失败编码
    public static final String MSG_FAILED = "failed"; // 失败默认信息
    public static final String CODE_SUCCESS = "1"; // 成功编码
    public static final String MSG_SUCCESS = "success"; // 成功默认信息
    public static final String CODE_EMPTY = "-1"; // 结果为空编码
    public static final String MSG_EMPTY = "empty"; // 结果为空默认信息

    protected String code;// 返回编码
    protected String msg; // 返回信息

    /**
     * 获取结果编码
     * 
     * @return
     */
    String getCode() {
        return code;
    }

    /**
     * 获取结果信息
     * 
     * @return
     */
    String getMsg() {
        return msg;
    }
}
