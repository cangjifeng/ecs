package org.jerfan.ecs.common;

/**
 * @author jerfan cang
 * @since 2021/5/19 22:51
 */
public abstract class CB<T> {



    protected T data;



    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CB{");
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }
}
