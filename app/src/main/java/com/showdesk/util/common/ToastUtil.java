package com.showdesk.util.common;

import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

import com.showdesk.java.ShowDeskApplication;

public class ToastUtil {

    private static Handler sToastHandler;

    public static void show(String message) {
        showToast(message, Toast.LENGTH_SHORT);
    }

    public static void show(int messageId) {
        show(ShowDeskApplication.getContext().getString(messageId));
    }

    private static void showToast(final String message, final int duration) {
        Runnable showToast = new Runnable() {

            @Override
            public void run() {
                Toast.makeText(ShowDeskApplication.getContext(), message, duration).show();
//                Toast toast = new Toast(ShowDeskApplication.getContext());
//                View view = LayoutInflater.from(ShowDeskApplication.getContext()).inflate(R.layout.toast, null);
//                TextView messageTv = (TextView) view.findViewById(R.id.toast_message);
//                messageTv.setText(message);
//                toast.setView(view);
//                toast.setGravity(gravity, 0, 80);
//                toast.setDuration(duration);
//                toast.show();

            }
        };

        if (sToastHandler == null) {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == null) {
                return;
            }
            sToastHandler = new Handler(mainLooper);
        }
        sToastHandler.post(showToast);
    }

}