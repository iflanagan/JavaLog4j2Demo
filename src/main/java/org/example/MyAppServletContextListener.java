package org.example;

import com.rollbar.notifier.Rollbar;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import static com.rollbar.notifier.config.ConfigBuilder.withAccessToken;

public class MyAppServletContextListener
        implements ServletContextListener{

    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
        System.out.println("ServletContextListener destroyed");
    }

    //Run this before web application is started
    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        System.out.println("ServletContextListener started");

        Rollbar rollbar = Rollbar.init(withAccessToken("3935058d1fe44d61a4dfe82385e9e792").environment("PROD").codeVersion("1.2").handleUncaughtErrors(true).build());
        rollbar.log("Called from MyAppServletContextListener class() ");
        try {
            rollbar.close(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
