package com.mudule.mumzonemarketcal.exception;

/**
 * @Description: 营销计算异常类
 * @ClassName: MarketException
 * @Author: dzt
 * @CreateDate: 2019/2/24 21:06
 * @UpdateUser: dzt
 * @UpdateDate: 2019/2/24 21:06
 * @UpdateRemark: 修改备注
 * @Version: 1.0
 */
public class MarketException extends RuntimeException{

    //默认错误码
    private Integer errCode;
    private String message;

    /**
     * 自定义异常信息
     *
     * @param message
     */
    public MarketException(String message) {
        this.message = message;
    }

    /**
     * 自定义状态码
     *
     * @param errCode
     */
    public MarketException(Integer errCode) {
        this.errCode = errCode;
    }

    /**
     * 自定义状态码和msg
     *
     * @param errCode
     * @param message 注意格式
     */
    public MarketException(Integer errCode, String message) {
        this.message = message;
        this.errCode = errCode;
    }

    public Integer getErrCode() {
        return errCode;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
