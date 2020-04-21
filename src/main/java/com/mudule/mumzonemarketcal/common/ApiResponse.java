package com.mudule.mumzonemarketcal.common;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description 响应API实体
 * @ClassName ApiResponse
 * @Autor DZT
 * @Date 2019/3/13 10:29
 * @Version 1.0
 */
@AllArgsConstructor
@Data
public class ApiResponse<T> {
    /**
     * The constant SUCCESS.
     */
    public static final int SUCCESS_CODE = 200;
    /**
     * The constant FAIL.
     */
    public static final int FAIL_CODE = 500;
    /**
     * The Code.
     */
    private Integer code;
    /**
     * The Message.
     */
    private String msg;
    /**
     * The Exception.
     */
    private String exception;
    /**
     * The Result.
     */
    private T data;

    public static ApiResponse getApiResponse(int count, String successMessage, String errorMessage) {
        if (count > 0) {
            return new ApiResponse(ApiResponse.SUCCESS_CODE, successMessage, null, null);
        } else {
            return new ApiResponse(ApiResponse.FAIL_CODE, errorMessage, null, null);
        }
    }
    /**
     * Fail base response.
     *
     * @param message the message
     * @return the base response
     */
    public static ApiResponse fail(String message) {
        return new ApiResponse(ApiResponse.FAIL_CODE, message, null, null);
    }

    /**
     * Fail base response.
     *
     * @param errCode the code
     * @param message the message
     * @return
     */
    public static ApiResponse fail(int errCode,String message) {
        return new ApiResponse(errCode, message, null, null);
    }

    /**
     * Fail base response.
     *
     * @param message   the message
     * @param exception the exception
     * @return the base response
     */
    public static ApiResponse fail(String message, String exception) {
        return new ApiResponse(ApiResponse.FAIL_CODE, message, exception, null);
    }

    /**
     * Success base response.
     *
     * @param <T> the type parameter
     * @param t   the t
     * @return the base response
     */
    public static <T> ApiResponse<T> success(T t) {
        return new ApiResponse(ApiResponse.SUCCESS_CODE, "成功", null, t);
    }

    /**
     * Success base response.
     *
     * @param <T>     the type parameter
     * @param t       the t
     * @param message the message
     * @return the base response
     */
    public static <T> ApiResponse<T> success(T t, String message) {
        return new ApiResponse(ApiResponse.SUCCESS_CODE, message, null, t);
    }

}
