package com.xuexiang.xupdateservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author: wangzhongxing
 * @date: 2022/10/8 15:51
 * @description: app版本更新检查数据模型
 */
public class AppVersionCheckDTO {

    /**
     * 0代表请求成功，非0代表失败
     */
    @JsonProperty(value = "Code")
    private int Code = 0;
    /**
     * 请求出错的信息
     */
    @JsonProperty(value = "Msg")
    private String Msg;
    /**
     * 版本更新状态。0代表不更新，1代表有版本更新，不需要强制升级，2代表有版本更新，需要强制升级
     */
    @JsonProperty(value = "UpdateStatus")
    private Integer UpdateStatus;
    /**
     * 版本号，自增。本地会用于比较版本是否为最新版本
     */
    @JsonProperty(value = "VersionCode")
    private Integer VersionCode;
    /**
     * 版本的展示名称
     */
    @JsonProperty(value = "VersionName")
    private String VersionName;
    /**
     * 版本更新的内容
     */
    @JsonProperty(value = "ModifyContent")
    private String ModifyContent;
    /**
     * 应用apk文件的下载地址
     */
    @JsonProperty(value = "DownloadUrl")
    private String DownloadUrl;
    /**
     * 应用apk文件的文件大小，单位是KB
     */
    @JsonProperty(value = "ApkSize")
    private Integer ApkSize;
    /**
     * 应用apk文件的MD5值。如果没有的话，将无法保证apk是否完整，每次都会重新下载。框架默认使用的是MD5加密
     */
    @JsonProperty(value = "ApkMd5")
    private String ApkMd5;

    @JsonIgnore
    public int getCode() {
        return Code;
    }

    @JsonIgnore
    public void setCode(int code) {
        Code = code;
    }

    @JsonIgnore
    public String getMsg() {
        return Msg;
    }

    @JsonIgnore
    public void setMsg(String msg) {
        Msg = msg;
    }

    public Integer getUpdateStatus() {
        return UpdateStatus;
    }

    @JsonIgnore
    public void setUpdateStatus(Integer updateStatus) {
        UpdateStatus = updateStatus;
    }

    @JsonIgnore
    public Integer getVersionCode() {
        return VersionCode;
    }

    @JsonIgnore
    public void setVersionCode(Integer versionCode) {
        VersionCode = versionCode;
    }

    @JsonIgnore
    public String getVersionName() {
        return VersionName;
    }

    @JsonIgnore
    public void setVersionName(String versionName) {
        VersionName = versionName;
    }

    @JsonIgnore
    public String getModifyContent() {
        return ModifyContent;
    }

    @JsonIgnore
    public void setModifyContent(String modifyContent) {
        ModifyContent = modifyContent;
    }

    @JsonIgnore
    public String getDownloadUrl() {
        return DownloadUrl;
    }

    @JsonIgnore
    public void setDownloadUrl(String downloadUrl) {
        DownloadUrl = downloadUrl;
    }

    @JsonIgnore
    public Integer getApkSize() {
        return ApkSize;
    }

    @JsonIgnore
    public void setApkSize(Integer apkSize) {
        ApkSize = apkSize;
    }

    @JsonIgnore
    public String getApkMd5() {
        return ApkMd5;
    }

    @JsonIgnore
    public void setApkMd5(String apkMd5) {
        ApkMd5 = apkMd5;
    }
}
