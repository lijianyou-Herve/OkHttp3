package com.okhttplib.bean;

import com.okhttplib.HttpInfo;
import com.okhttplib.callback.ProgressCallback;

/**
 * 下载响应回调信息体
 */
public class DownloadMessage extends OkMessage{

    public String filePath;
    public HttpInfo info;
    public ProgressCallback progressCallback;

    public DownloadMessage(int what, String filePath, HttpInfo info, ProgressCallback progressCallback) {
        this.what = what;
        this.filePath = filePath;
        this.info = info;
        this.progressCallback = progressCallback;
    }
}