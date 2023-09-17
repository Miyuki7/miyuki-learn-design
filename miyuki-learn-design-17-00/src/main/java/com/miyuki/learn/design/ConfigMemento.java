package com.miyuki.learn.design;

/**
 * @author: miyuki
 * @description: 配置文件备忘录
 * @date: 2023/9/17 21:02
 * @version: 1.0
 */
public class ConfigMemento {

    private ConfigFile configFile;

    public ConfigMemento(ConfigFile configFile) {
        this.configFile = configFile;
    }

    public ConfigFile getConfigFile() {
        return configFile;
    }

    public void setConfigFile(ConfigFile configFile) {
        this.configFile = configFile;
    }
}
