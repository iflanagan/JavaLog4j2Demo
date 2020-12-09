package org.example;


import com.rollbar.api.payload.data.Server;
import com.rollbar.notifier.provider.Provider;

class ServerProvider implements Provider<Server> {

    @Override
    public Server provide() {
        return new Server.Builder()
                //   .codeVersion(MyConfiguration.myCodeVersion)
                .branch("master")
                .host("localhost")
                .root("org.example")
                .codeVersion("d7f412f2f88cf2b938ed4011ddd6bfa8b3cf265b")
                .build();
    }
}