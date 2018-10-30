package com.nick.nyu.eventloop.core;

import com.nick.nyu.eventloop.AeEventLoop;

/**
 * @author chen.zhu
 * <p>
 * Oct 30, 2018
 */
public interface AeSocketApi {

    int aeApiPoll(AeEventLoop eventLoop, TimeVal tv);

    void aeApiCreate(AeEventLoop eventLoop);

    void aeApiAddEvent(AeEventLoop eventLoop, int fd, int mask);

    void aeApiDelEvent(AeEventLoop eventLoop, int fd, int mask);
}
