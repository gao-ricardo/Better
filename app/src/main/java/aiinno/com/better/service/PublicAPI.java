package aiinno.com.better.service;

import aiinno.com.better.model.Ret;
import aiinno.com.better.model.User;
import aiinno.com.better.model.WechatUser;

import aiinno.com.better.service.JsonConverters.Json;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Field;
import okhttp3.ResponseBody;

/**
 * Created by lbk on 2016/10/28.
 */
public interface PublicAPI {
    @POST("/weibosign/")
    Call<ResponseBody> sendWeibo(@Body User user);

    @POST("/wechatsign/")
    Call<ResponseBody> sendWechat(@Body WechatUser wechatUser);

    @FormUrlEncoded
    @POST("/wechatsign/") @Json
    Call<Ret> WechatAuth(@Field("wechatid") String wechatid);

    @FormUrlEncoded
    @POST("/getQiNiuToken/") @Json
    Call<Ret> QiNiuAuth(@Field("pname") String pname);
}
