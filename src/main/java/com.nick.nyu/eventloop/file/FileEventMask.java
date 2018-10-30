package com.nick.nyu.eventloop.file;

/**
 * @author chen.zhu
 * <p>
 * Oct 30, 2018
 */
public interface FileEventMask {

    int AE_NONE = 0;
    int AE_READABLE = 1;
    int AE_WRITABLE = 2;

    default boolean isReadable(int mask) {
        return (mask & AE_READABLE) != 0;
    }

    default boolean isWritable(int mask) {
        return (mask & AE_WRITABLE) != 0;
    }

}
