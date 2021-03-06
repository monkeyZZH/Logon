package com.andy.share;

import android.app.Application;

import com.umeng.socialize.Config;
import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.UMShareAPI;

/**
 * 类描述：
 * 创建人：yekh
 * 创建时间：2017/7/7 11:01
 */
public class App extends Application{
    {
        PlatformConfig.setQQZone("1106197903","Vfdwhxp8yhlKPv4h");
    }

    private static  App sApp;
    private UMShareAPI mUMShareAPI;
    @Override
    public void onCreate() {
        super.onCreate();
        sApp=this;
        Config.DEBUG=true;
        mUMShareAPI=UMShareAPI.get(this);
    }

    public UMShareAPI getUMShareAPI() {
        return mUMShareAPI;
    }

    public static App getApp(){
        return sApp;
    }

}
