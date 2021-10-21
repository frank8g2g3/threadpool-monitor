package com.yunzhi.xiaoyuanhao.threadpool.monitor.dashboard.pojo;

import lombok.Data;

/**
 * @author francis
 * @version 2021-10-20
 */
@Data
public class ThreadpoolVO {
    private String ip;
    private String port;
    private String threadPoolName;
    private String threadPoolHashCode;
    private Integer coreSize;
    private Integer maximumPoolSize;
    private String queueType;
    private Integer queueCapacity;
}
