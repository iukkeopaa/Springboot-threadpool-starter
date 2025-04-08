package org.wqz;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "threadpool")
public class ThreadPoolProperties {
    private int corePoolSize = 10;
    private int maximumPoolSize = 20;
    private long keepAliveTime = 60;

    public int getCorePoolSize() {
        return corePoolSize;
    }

    public void setCorePoolSize(int corePoolSize) {
        this.corePoolSize = corePoolSize;
    }

    public int getMaximumPoolSize() {
        return maximumPoolSize;
    }

    public void setMaximumPoolSize(int maximumPoolSize) {
        this.maximumPoolSize = maximumPoolSize;
    }

    public long getKeepAliveTime() {
        return keepAliveTime;
    }

    public void setKeepAliveTime(long keepAliveTime) {
        this.keepAliveTime = keepAliveTime;
    }
}

//threadpool.corePoolSize=15
//threadpool.maximumPoolSize=30
//threadpool.keepAliveTime=120