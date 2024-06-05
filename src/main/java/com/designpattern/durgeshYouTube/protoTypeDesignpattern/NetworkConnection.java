package com.designpattern.durgeshYouTube.protoTypeDesignpattern;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {
    private String ip;
    private String importantData;
    private List<String> domains = new ArrayList<>();

    public NetworkConnection() {
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
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

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", importantData='" + importantData + '\'' +
                ", domains=" + domains +
                '}';
    }

    public void loadImportantData() throws InterruptedException {
        this.importantData = "this is very important data";
        Thread.sleep(4000);
    }

    public void loadDomains() {
        domains.add("dhirajrajput.in");
        domains.add("google.com");
        domains.add("facebook.com");
    }
/*====================Mind Here====================
* Commented method is used clone object with shallow copy
*
* */

/*    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/


    /*
    * This method is used to clone deep copy of object
    * */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp(this.getIp());
        networkConnection.setIp(this.getImportantData());
        this.domains.stream().forEach(element -> networkConnection.getDomains().add(element));
        return networkConnection;
    }
}
