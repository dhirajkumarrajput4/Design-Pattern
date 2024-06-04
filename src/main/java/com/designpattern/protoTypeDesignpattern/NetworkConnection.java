package com.designpattern.protoTypeDesignpattern;

public class NetworkConnection {
    private String ip;
    private String importantData;

    public NetworkConnection() {
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }
}
