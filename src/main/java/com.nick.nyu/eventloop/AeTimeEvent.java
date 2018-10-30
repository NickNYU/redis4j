package com.nick.nyu.eventloop;

import com.nick.nyu.eventloop.time.AeEventFinalizerProc;
import com.nick.nyu.eventloop.time.AeTimeProc;

/**
 * @author chen.zhu
 * <p>
 * Oct 30, 2018
 */
public interface AeTimeEvent<T> {

    AeTimeEvent next();

    AeTimeProc<T> getAeTimeProc();

    AeEventFinalizerProc<T> getAeEventFinalizerProc();

    long getId();

    long whenSec();

    long whenMs();

    T getClientData();
}
