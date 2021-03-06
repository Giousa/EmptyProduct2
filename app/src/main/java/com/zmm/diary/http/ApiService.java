package com.zmm.diary.http;

import com.zmm.diary.bean.BaseBean;
import com.zmm.diary.bean.UserBean;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2018/10/31
 * Email:65489469@qq.com
 */
public interface ApiService {


    /**
     * -----------------------------登录注册界面接口-----------------------------
     */


    /**
     * 获取验证码
     * @param username
     * @return
     */
    @POST("user/getVerifyCode")
    Observable<BaseBean<String>> getVerifyCode(@Query("username") String username);


    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    @POST("user/login")
    Observable<BaseBean<UserBean>> login(@Query("username") String username,
                                         @Query("password") String password);

    /**
     * 注册
     * @param username
     * @param password
     * @return
     */
    @POST("user/register")
    Observable<BaseBean<UserBean>> register(@Query("username") String username,
                                            @Query("password") String password,
                                            @Query("verifyCode") String verifyCode);

    /**
     * 修改密码
     * @param username
     * @param oldPassword
     * @param newPassword
     * @return
     */
    @POST("user/modifyPassword")
    Observable<BaseBean<String>> modifyPassword(@Query("username") String username,
                                                @Query("oldPassword") String oldPassword,
                                                @Query("newPassword") String newPassword);


    /**
     * 重置密码
     * @param username
     * @param newPassword
     * @param verifyCode
     * @return
     */
    @POST("user/resetPassword")
    Observable<BaseBean<String>> resetPassword(@Query("username") String username,
                                                @Query("newPassword") String newPassword,
                                                @Query("verifyCode") String verifyCode);



}
