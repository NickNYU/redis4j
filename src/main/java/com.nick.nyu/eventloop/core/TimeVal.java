package com.nick.nyu.eventloop.core;

/**
 * @author chen.zhu
 * <p>
 * Oct 30, 2018
 */
public class TimeVal {

    private int tvSec;

    private int tvMilli;

    public int getTvSec() {
        return tvSec;
    }

    public TimeVal setTvSec(int tvSec) {
        this.tvSec = tvSec;
        return this;
    }

    public int getTvMilli() {
        return tvMilli;
    }

    public TimeVal setTvMilli(int tvMilli) {
        this.tvMilli = tvMilli;
        return this;
    }
}
