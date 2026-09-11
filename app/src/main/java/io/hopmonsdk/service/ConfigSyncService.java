package io.hopmonsdk.service;

import android.app.AlarmManager;
import android.app.IntentService;
import android.content.Intent;
import io.hopmonsdk.Hopmn;
import io.hopmonsdk.receiver.ConfigSyncAlarmTrigger;
import io.hopmonsdk.util.LogUtils;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class ConfigSyncService extends IntentService {
    public static final String TAG = "ConfigSyncService";

    public ConfigSyncService() {
        super(TAG);
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        LogUtils.d(TAG, "cancelAlarm", new Object[0]);
        ConfigSyncAlarmTrigger.cancelAlarm(this, (AlarmManager) getSystemService("alarm"));
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        LogUtils.d(TAG, "scheduleExactAlarm", new Object[0]);
        ConfigSyncAlarmTrigger.scheduleExactAlarm(this, (AlarmManager) getSystemService("alarm"), Hopmn.getInstance(this).getDelayMillis());
    }
}
