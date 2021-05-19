package org.jerfan.ecs.common;


/**
 * @author jerfan cang
 * @since 2021/5/19 22:54
 */
public final class OutCB extends CB{

    private String code;

    private String msg;

    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
