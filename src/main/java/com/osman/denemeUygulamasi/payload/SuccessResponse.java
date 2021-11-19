package com.osman.denemeUygulamasi.payload;

public class SuccessResponse<T> {

    private Long timestamp;
    private boolean success;
    private T data;

    public SuccessResponse(T data) {
        this.timestamp = System.currentTimeMillis();
        this.success = true;
        this.data = data;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
