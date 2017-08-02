package com.showdesk.java.data.datasource;

import com.showdesk.util.net.ShowDeskRetrofit;

/**
 * Created by ladmusician.kim on 2017. 8. 3..
 */

public class RemoteDatasource {

    protected static <T> T createRequest(Class<T> service) {
        return ShowDeskRetrofit.getInstance().sRetrofit.create(service);
    }
}
