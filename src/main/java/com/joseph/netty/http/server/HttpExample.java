package com.joseph.netty.http.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by dys09435 on 2017/4/24.
 */
public class HttpExample {
    private static final Logger logger = LoggerFactory.getLogger(HttpExample.class);

    public static void main(String[] args) {
        logger.info("Http server starting...");
        new Server(8888).start();
    }
}
