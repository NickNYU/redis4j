package com.nick.nyu.eventloop;

import com.nick.nyu.eventloop.core.ApiData;

import java.util.List;

public interface AeEventLoop {

    List<AeFiredEvent> getFiredEvents();

    List<AeFileEvent> getFileEvents();

    List<AeTimeEvent> getTimeEvents();

    AeTimeEvent getNearestTimeEvent();

    long nextTimeEventId();

    long maxFd();

    long setSize();

    ApiData getApiData();

    boolean isStopped();
}