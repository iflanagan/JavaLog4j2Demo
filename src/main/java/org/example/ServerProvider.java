package org.example;


import com.rollbar.api.payload.data.Server;
import com.rollbar.notifier.provider.Provider;

import com.rollbar.web.provider.RequestProvider;
import com.rollbar.web.filter.RollbarFilter;
import com.rollbar.web.listener.RollbarRequestListener;

public class ServerProvider implements Provider<Server> {


    @Override
    public Server provide() {
        return new Server.Builder()
                .codeVersion("1.0.0")
                .branch("master")
                .host("localhost")
                .build();
    }
}