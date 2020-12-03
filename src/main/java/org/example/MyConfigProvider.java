package org.example;

import com.rollbar.notifier.config.Config;
import com.rollbar.notifier.config.ConfigBuilder;
import com.rollbar.notifier.config.ConfigProvider;
import com.rollbar.web.provider.RequestProvider;
import com.rollbar.web.filter.RollbarFilter;
import com.rollbar.web.listener.RollbarRequestListener;

public class MyConfigProvider implements ConfigProvider {

    @Override
    public Config provide(ConfigBuilder builder) {
        return builder.server(new ServerProvider()).build();
    }
}