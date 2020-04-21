package com.mudule.mumzonemarketcal.utils;

import com.alibaba.fastjson.JSONObject;
import okhttp3.*;

import java.io.IOException;

/**
 * @author qi_grui
 */
public class OkHttpUtil {

    private static final OkHttpClient mOkHttpClient = new OkHttpClient();

    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    /**
     * 通过POST方式，发送JSON数据
     *
     * @param url
     * @param json
     * @return
     * @throws IOException
     */
    public static String fireInfoByPost(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        Response response = mOkHttpClient.newCall(request).execute();
        if(response.isSuccessful()) {
            return response.body().string();
        } else {
            JSONObject jsonStr = null;
            try {
                jsonStr = JSONObject.parseObject(response.body().string());
            } catch (IOException e) {
                throw new IOException("操作失败");
            }
            throw new IOException(jsonStr.getString("msg"));
        }
    }
    /**
     * 通过POST方式，发送JSON数据(中金支付) hk
     *
     * @param url
     * @param json
     * @return
     * @throws IOException
     */
    public static String payFireInfoByPost(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        Response response = mOkHttpClient.newCall(request).execute();
        if(response.isSuccessful()) {
            return response.body().string();
        } else {
            JSONObject jsonStr = null;
            try {
                jsonStr = JSONObject.parseObject(response.body().string());
            } catch (IOException e) {
                throw new IOException("操作失败");
            }
            throw new IOException(jsonStr.getString("message"));
        }
    }

    /**
     * okhttpclient get请求
     * @param url
     * @return
     * @throws IOException
     */
    public static String payFireInfoByGet(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = mOkHttpClient.newCall(request).execute();
        if(response.isSuccessful()) {
            return response.body().string();
        } else {
            JSONObject jsonStr = null;
            try {
                jsonStr = JSONObject.parseObject(response.body().string());
            } catch (Exception e) {
                throw new IOException("操作失败");
            }
            throw new IOException(jsonStr.getString("msg"));
        }
    }
}
