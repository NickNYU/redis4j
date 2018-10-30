package com.nick.nyu.eventloop.core;

import com.nick.nyu.eventloop.AeEventLoop;

import java.io.IOException;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.spi.SelectorProvider;

/**
 * @author chen.zhu
 * <p>
 * Oct 30, 2018
 */
public class NioAeSocketApi implements AeSocketApi {

    private static final Logger logger = LoggerFactory.getLogger(NioAeSocketApi.class);

    private Selector selector;

    public NioAeSocketApi() {
        try {
            ServerSocketChannel serverSocketChannel = SelectorProvider.provider().openServerSocketChannel();
        } catch (IOException e) {

        }
    }

    @Override
    public int aeApiPoll(AeEventLoop eventLoop, TimeVal tv) {
        return 0;
    }

    @Override
    public void aeApiCreate(AeEventLoop eventLoop) {

    }

    @Override
    public void aeApiAddEvent(AeEventLoop eventLoop, int fd, int mask) {

    }

    @Override
    public void aeApiDelEvent(AeEventLoop eventLoop, int fd, int mask) {

    }
}
