package com.hsae.json.response;

import java.util.List;

/**
 * JSON-List返回结果
 * 
 * @author shishun
 *
 * @param <T>
 */
public class ListResponse<T> extends Response {
    private List<T> datas;// 返回数据

    /**
     * 有参构造方法
     * 
     * @param datas
     */
    public ListResponse(List<T> datas) {
        this.code = Response.CODE_SUCCESS;
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
    public ListResponse(String code, String msg, List<T> datas) {
        this.code = code;
        this.msg = msg;
        this.datas = datas;
    }

    /**
     * 获取数据
     * 
     * @return
     */
    public List<T> getDatas() {
        return datas;
    }
}
