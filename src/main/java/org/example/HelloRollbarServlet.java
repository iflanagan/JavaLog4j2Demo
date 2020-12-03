package org.example;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static java.lang.String.format;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Servlet that rises an error every even request number.
 */

public class HelloRollbarServlet extends HttpServlet {

    private static final Logger LOG = LogManager.getLogger(HelloRollbarServlet.class);

    private static final AtomicInteger counter = new AtomicInteger(1);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        System.out.println("Calling method  doGet() in HelloRollbarServlet class");
        LOG.warn("Entering method doGet() in HelloRollbarServlet class");

        int value = 1 / 0;

        int current = counter.getAndAdd(1);
        if (current % 2 == 0) {
            throw new RuntimeException("Fatal error at greeting number: " + current);
        }
        resp.getWriter().write(format("Hello Rollbar number %d", current));
    }
}