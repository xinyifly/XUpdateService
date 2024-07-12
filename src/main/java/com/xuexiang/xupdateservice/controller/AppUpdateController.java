package com.xuexiang.xupdateservice.controller;

import com.xuexiang.xupdateservice.model.AppVersionCheckDTO;
import com.xuexiang.xupdateservice.model.AppVersionInfo;
import com.xuexiang.xupdateservice.service.UpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wangzhongxing
 * @date: 2022/10/8 15:46
 * @description: Android APP 版本更新请求入口控制器
 */
@RestController
@RequestMapping(value = "/appUpdate")
public class AppUpdateController {

    @Autowired
    private UpdateService updateService;

    @Value("${download.domain}")
    private String domainUrl;

    @ResponseBody
    @RequestMapping(value = "/checkVersion", method = RequestMethod.GET)
    public AppVersionCheckDTO doCheckVersion(int versionCode, String appKey) {
        AppVersionInfo latestAppVersionInfo = updateService.getLatestAppVersionInfo(versionCode, appKey);

        AppVersionCheckDTO appVersionCheckDTO = new AppVersionCheckDTO();
        appVersionCheckDTO.setCode(0);
        appVersionCheckDTO.setMsg("");
        appVersionCheckDTO.setUpdateStatus(latestAppVersionInfo.getUpdateStatus());
        appVersionCheckDTO.setVersionCode(latestAppVersionInfo.getVersionCode());
        appVersionCheckDTO.setVersionName(latestAppVersionInfo.getVersionName());
        appVersionCheckDTO.setModifyContent(latestAppVersionInfo.getModifyContent());
        appVersionCheckDTO.setDownloadUrl(domainUrl + latestAppVersionInfo.getDownloadUrl());
        appVersionCheckDTO.setApkSize(latestAppVersionInfo.getApkSize());
        appVersionCheckDTO.setApkMd5(latestAppVersionInfo.getApkMd5());

        return appVersionCheckDTO;
    }

}
