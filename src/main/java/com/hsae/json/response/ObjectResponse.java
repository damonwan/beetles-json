package com.hsae.json.response;

/**
 * JSON-Object返回结果
 * 
 * @author shishun
 *
 * @param <T>
 */
public class ObjectResponse<T> extends Response {
    private T datas;// 返回数据

    /**
     * 有参构造方法
     * 
     * @param datas
     */
    public ObjectResponse(T datas) {
        this.code = CODE_SUCCESS;
        this.msg = MSG_SUCCESS;
        this.datas = datas;
    }

    /**
     * 有参构造方法
     * 
     * @param code
     * @param msg
     * @param datas
     */
    public ObjectResponse(String code, String msg, T datas) {
        this.code = code;
        this.msg = msg;
        this.datas = datas;
    }

    /**
     * 获取数据
     * 
     * @return
     */
    public T getDatas() {
        return datas;
    }
}
