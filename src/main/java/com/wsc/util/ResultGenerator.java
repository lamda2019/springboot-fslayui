package com.wsc.util;

/**
 * 响应结果生成工具
 */
public class ResultGenerator {
    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";
    private static final String DEFAULT_FAIL_MESSAGE = "FAIL";

    public static Result genSuccessResult() {
        Result result = new Result();
        result.setErrorNo(Constants.RESULT_CODE_SUCCESS);
        return result;
    }

    public static Result genSuccessResult(Object data) {
        Result result = new Result();
        result.setErrorNo(Constants.RESULT_CODE_SUCCESS);
        result.setResults(data);
        return result;
    }

    public static Result genFailResult(String message) {
        Result result = new Result();
        result.setErrorNo(Constants.RESULT_CODE_SERVER_ERROR);
        return result;
    }

}
