package com.hsae.json.response;

import java.util.List;

/**
 * JSON-分页返回结果
 * 
 * @author shishun
 *
 */
public class PageListResponse<T> extends ListResponse<T> {
    private int pageNumber;// 第几页
    private int pageSize;// 每页显示多少条
    private long totalSize;// 总共多少条记录
    private int totalPage;// 总共多少页

    /**
     * 有参构造方法
     * 
     * @param pageNumber
     * @param pageSize
     * @param totalSize
     * @param datas
     */
    public PageListResponse(int pageNumber, int pageSize, long totalSize, List<T> datas) {
        super(datas);
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.totalSize = totalSize;
        this.totalPage = getTotalPage();// 转JSON时可能只认属性不认get方法，特在此赋值
    }

    /**
     * 有参构造方法
     * 
     * @param code
     * @param msg
     * @param pageNumber
     * @param pageSize
     * @param totalSize
     * @param datas
     */
    public PageListResponse(String code, String msg, int pageNumber, int pageSize, long totalSize, List<T> datas) {
        super(code, msg, datas);
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.totalSize = totalSize;
        this.totalPage = getTotalPage();// 转JSON时可能只认属性不认get方法，特在此赋值
    }

    /**
     * 获取当前页码
     * 
     * @return
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * 获取每页显示的记录条数
     * 
     * @return
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * 获取总记录条数
     * 
     * @return
     */
    public long getTotalSize() {
        return totalSize;
    }

    /**
     * 获取分页总页数
     * 
     * @return
     */
    public int getTotalPage() {
        if (pageSize > 0 && totalSize > 0) {
            totalPage = (int) ((totalSize + pageSize - 1) / pageSize);
        }
        return totalPage;
    }
}
