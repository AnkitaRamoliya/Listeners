package com.oozeetech.bizdesk.listener;

/**
 * Created by android-pc on 11-07-2017.
 */

public interface MyBizListener {
    void onEditClickListener(String masterId);

    void onConfirmClickListener(String masterId);

    void onDeleteClickListener(String masterId);
}
