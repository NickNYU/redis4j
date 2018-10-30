package com.nick.nyu.eventloop.core;

import com.nick.nyu.eventloop.AeEventLoop;

/**
 * @author chen.zhu
 * <p>
 * Oct 30, 2018
 */
public interface EventLoopProcesser {

    void processEvents(AeEventLoop eventLoop);

    void processTimeEvents(AeEventLoop eventLoop);

}
