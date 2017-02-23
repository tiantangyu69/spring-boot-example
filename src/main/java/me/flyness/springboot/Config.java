package me.flyness.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bjlizhitao on 2017/2/23.
 * YAML 配置
 */
@ConfigurationProperties(prefix = "my")
public class Config {
    private List<String> servers = new ArrayList<String>();

    public List<String> getServers() {
        return this.servers;
    }
}
