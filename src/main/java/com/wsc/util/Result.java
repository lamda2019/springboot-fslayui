package com.wsc.util;

import java.io.Serializable;

public class Result<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private int errorNo;
    private T results;

    public Result() {
    }

    public Result(int errorNo) {
        this.errorNo = errorNo;
    }

    public T getResults() {
        return results;
    }

    public void setResults(T results) {
        this.results = results;
    }

    public int getErrorNo() {
        return errorNo;
    }

    public void setErrorNo(int errorNo) {
        this.errorNo = errorNo;
    }

    @Override
    public String toString() {
        return "Result{" +
                "errorNo=" + errorNo +
                ", results=" + results +
                '}';
    }
}
