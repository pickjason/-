package entity.exception;

/**
 * @program: classification
 * @description: 错误信息
 * @author: wzz
 * @create: 2019-08-08 13:50
 */

public enum  ExceptionConst {

    SYSTEM_ERROR(1000, "系统错误，联系管理员"),
    PARAM_ERROR(1001, "未知异常"),
    NO_TARGET_DATA(1002, "找不到目标信息");
    private int errorCode;

    private String msg;

    ExceptionConst(int errorCode, String msg) {
        this.errorCode = errorCode;
        this.msg = msg;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
