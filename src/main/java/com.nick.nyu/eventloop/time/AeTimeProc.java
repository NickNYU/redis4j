package com.nick.nyu.eventloop.time;

import com.nick.nyu.eventloop.AeEventLoop;

/**
 * @author chen.zhu
 * <p>
 * Oct 30, 2018
 */
public interface AeTimeProc<T> {

    void handle(AeEventLoop eventLoop, long id, T clientData);

}
