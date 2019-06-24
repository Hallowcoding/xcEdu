package com.xuecheng.framework.model.response;

import java.util.List;

/**
 * QueryResult
 *
 * @author th
 * 2019/6/25 1:14
 **/
public class QueryResult<T> {

    /** 数据列表*/
    private List<T> list;

    /** 数据总数*/
    private long total;
}
