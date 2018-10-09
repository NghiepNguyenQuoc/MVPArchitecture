package com.nghiepnguyen.mvparchitecture;

public interface GetQuoteInteractor {
    interface OnFinishedListener {
        void onFinished(String string);
    }
    void getNextQoute(OnFinishedListener onFinishedListener);
}
