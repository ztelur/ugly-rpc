package com.remcarpediem.ugly.client.form;

import lombok.Data;

@Data
public class TestForm {
    private int concurrents;
    private int timeout;
    private int requestSize;
    private int runtime;
    private int endtime;
    private int clientNums;


    public int getConcurrents() {
        return concurrents;
    }

    public void setConcurrents(int concurrents) {
        this.concurrents = concurrents;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public int getRequestSize() {
        return requestSize;
    }

    public void setRequestSize(int requestSize) {
        this.requestSize = requestSize;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public int getEndtime() {
        return endtime;
    }

    public void setEndtime(int endtime) {
        this.endtime = endtime;
    }

    public int getClientNums() {
        return clientNums;
    }

    public void setClientNums(int clientNums) {
        this.clientNums = clientNums;
    }
}
