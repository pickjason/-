package entity;

/**
 * @program: classification
 * @description: 返回类
 * @author: wzz
 * @create: 2019-08-08 11:44
 */

public class Result {
   private String msg;

   private int code;

   private Object data;


   public  Result(String msg , int code , Object data){
       this.msg= msg;
       this.code=code;
       this.data =data;
   }
   public Result (String msg,int code){
       this.msg=msg;
       this.code =code;
   }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
