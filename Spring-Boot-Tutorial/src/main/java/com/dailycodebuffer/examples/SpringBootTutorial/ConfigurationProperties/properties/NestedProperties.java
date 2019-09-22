package com.dailycodebuffer.examples.SpringBootTutorial.ConfigurationProperties.properties;

import com.dailycodebuffer.examples.SpringBootTutorial.ConfigurationProperties.util.Credential;

import java.util.List;
import java.util.Map;

public class NestedProperties {

    private String appName;
    private int port;
    private List<String> user;
    private Map<String, String> additionalHeaders;
    private Credential credential;

    @Override
    public String toString() {
        return "NestedProperties{" +
                "appName='" + appName + '\'' +
                ", port=" + port +
                ", user=" + user +
                ", additionalHeaders=" + additionalHeaders +
                ", credential=" + credential +
                '}';
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public List<String> getUser() {
        return user;
    }

    public void setUser(List<String> user) {
        this.user = user;
    }

    public Map<String, String> getAdditionalHeaders() {
        return additionalHeaders;
    }

    public void setAdditionalHeaders(Map<String, String> additionalHeaders) {
        this.additionalHeaders = additionalHeaders;
    }

    public Credential getCredential() {
        return credential;
    }

    public void setCredential(Credential credential) {
        this.credential = credential;
    }
}
