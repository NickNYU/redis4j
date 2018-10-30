package com.nick.nyu.eventloop.file;

import com.nick.nyu.eventloop.AeEventLoop;

/**
 * @author chen.zhu
 * <p>
 * Oct 30, 2018
 */
public interface AeFileProc<T> {

    void handle(AeEventLoop eventLoop, int fd, T clientData, int mask);
}
