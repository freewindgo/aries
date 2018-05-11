package com.cf.aries.common.dbrouter.configure;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * DruidProperties
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/11 17:05
 */

@Getter
@Setter
@ConfigurationProperties(prefix = "data-base-router")
public class DruidProperties {
    private List<DruidProperties.DataSourceConfig> single;
    private List<DruidProperties.DataSourceConfig> cluster;

    public String toString() {
        return "DruidProperties(single=" + this.getSingle() + ", cluster=" + this.getCluster() + ")";
    }

    @Getter
    @Setter
    @ToString
    public static class DataSourceConfig {
        private String alias;
        private String driverClassName;
        private String url;
        private String username;
        private String password;
        private Boolean testWhileIdle = true;
        private Boolean testOnBorrow;
        private String validationQuery = "SELECT 1";
        private Boolean useGlobalDataSourceStat;
        private String filters;
        private Long timeBetweenLogStatsMillis;
        private Integer maxSize;
        private Boolean clearFiltersEnable;
        private Boolean resetStatEnable;
        private Integer notFullTimeoutRetryCount;
        private Integer maxWaitThreadCount;
        private Boolean failFast;
        private Boolean phyTimeoutMillis;
        private Long minEvictableIdleTimeMillis = 300000L;
        private Long maxEvictableIdleTimeMillis;
        private Integer initialSize = 5;
        private Integer minIdle = 5;
        private Integer maxActive = 20;
        private Long maxWait = 60000L;
        private Long timeBetweenEvictionRunsMillis = 60000L;
        private Boolean poolPreparedStatements = true;
        private Integer maxPoolPreparedStatementPerConnectionSize = 20;

    }

}
