package com.nick.nyu.eventloop;

import com.nick.nyu.eventloop.file.AeFileProc;

/**
 * @author chen.zhu
 * <p>
 * Oct 30, 2018
 */
public interface AeFileEvent<T> {

    int getMask();

    T getClientData();

    AeFileProc<T> getReadFileProc();

    AeFileProc<T> getWriteFileProc();

}
