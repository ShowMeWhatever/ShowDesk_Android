package com.showdesk.util.net;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ladmusician.kim on 01/08/2017.
 */

public class ShowDeskRetrofit {

    public static final String BASE_URL = "https://boiling-eyrie-21355.herokuapp.com/";
    public static Retrofit sRetrofit;

    private ShowDeskRetrofit() {
    }

    private static class ShowDeskRetrofitLazyHolder {
        static final ShowDeskRetrofit INSTANCE = new ShowDeskRetrofit();
    }

    public static ShowDeskRetrofit getInstance() {
        return ShowDeskRetrofitLazyHolder.INSTANCE;
    }

    public static void init() {
        OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();

        logging.setLevel(HttpLoggingInterceptor.Level.BASIC);
        httpClientBuilder.addInterceptor(logging);
        OkHttpClient client = httpClientBuilder.build();

        if (sRetrofit == null) {
            sRetrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .client(client)
                    .build();
        }
    }
}
