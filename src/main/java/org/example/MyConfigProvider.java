package org.example;

import com.rollbar.notifier.config.Config;
import com.rollbar.notifier.config.ConfigBuilder;
import com.rollbar.notifier.config.ConfigProvider;

public class MyConfigProvider implements ConfigProvider {

    @Override
    public Config provide(ConfigBuilder builder) {
        return builder.server(new ServerProvider()).build();
    }

}
