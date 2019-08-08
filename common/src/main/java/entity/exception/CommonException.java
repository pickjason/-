package entity.exception;

/**
 * @program: classification
 * @description: 错误拦截
 * @author: wzz
 * @create: 2019-08-08 13:46
 */
public class CommonException extends  RuntimeException{
    /**
     * 错误编码
     */
    private int errorCode = 0;

    public CommonException(int errorCode, String msg){
        super(msg);
        this.errorCode = errorCode;
    }

    public CommonException(ExceptionConst exceptionConst){
        super(exceptionConst.getMsg());
        this.errorCode = exceptionConst.getErrorCode();
    }

    public CommonException(ExceptionConst exceptionConst, String extMsg){
        super(exceptionConst.getMsg() + ":" + extMsg);
        this.errorCode = exceptionConst.getErrorCode();
    }

    public CommonException(int errorCode, Throwable throwable){
        super(throwable);
        this.errorCode = errorCode;
    }
}
