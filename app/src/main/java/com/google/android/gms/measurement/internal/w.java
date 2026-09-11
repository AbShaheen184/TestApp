package com.google.android.gms.measurement.internal;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements y {
    public final /* synthetic */ int e;
    public static final /* synthetic */ w y = new w(0);
    public static final /* synthetic */ w z = new w(1);
    public static final /* synthetic */ w A = new w(2);
    public static final /* synthetic */ w B = new w(3);
    public static final /* synthetic */ w C = new w(4);
    public static final /* synthetic */ w D = new w(5);
    public static final /* synthetic */ w E = new w(6);
    public static final /* synthetic */ w F = new w(7);
    public static final /* synthetic */ w G = new w(8);
    public static final /* synthetic */ w H = new w(9);
    public static final /* synthetic */ w I = new w(10);
    public static final /* synthetic */ w J = new w(11);
    public static final /* synthetic */ w K = new w(12);
    public static final /* synthetic */ w L = new w(13);
    public static final /* synthetic */ w M = new w(14);
    public static final /* synthetic */ w N = new w(15);
    public static final /* synthetic */ w O = new w(16);
    public static final /* synthetic */ w P = new w(17);
    public static final /* synthetic */ w Q = new w(18);
    public static final /* synthetic */ w R = new w(19);
    public static final /* synthetic */ w S = new w(20);
    public static final /* synthetic */ w T = new w(21);
    public static final /* synthetic */ w U = new w(22);
    public static final /* synthetic */ w V = new w(23);
    public static final /* synthetic */ w W = new w(24);
    public static final /* synthetic */ w X = new w(25);
    public static final /* synthetic */ w Y = new w(26);
    public static final /* synthetic */ w Z = new w(27);
    public static final /* synthetic */ w a0 = new w(28);
    public static final /* synthetic */ w b0 = new w(29);

    public /* synthetic */ w(int i) {
        this.e = i;
    }

    @Override // com.google.android.gms.measurement.internal.y
    public final Object a() {
        switch (this.e) {
            case 0:
                return new Boolean(((Boolean) com.google.android.gms.internal.measurement.q3.a.get()).booleanValue());
            case 1:
                List list = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (String) com.google.android.gms.internal.measurement.f3.a.i("measurement.gbraid_campaign.campaign_params_triggering_info_update", 4, "gclid,gbraid,gad_campaignid").get();
            case 2:
                List list2 = h0.a;
                return (String) com.google.android.gms.internal.measurement.o3.b.get();
            case 3:
                List list3 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(72, 50000L, "measurement.upload.max_public_events_per_day").get()).longValue());
            case 4:
                List list4 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(20, 100000L, "measurement.store.max_stored_events_per_app").get()).longValue());
            case 5:
                List list5 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (String) com.google.android.gms.internal.measurement.f3.a.i("measurement.sgtm.service_upload_apps_list", 44, "").get();
            case 6:
                List list6 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(29, 86400000L, "measurement.monitoring.sample_period_millis").get();
            case 7:
                List list7 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(43, 21600000L, "measurement.sgtm.batch.retry_max_wait").get();
            case 8:
                List list8 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(46, 5L, "measurement.sgtm.upload.batches_retrieval_limit").get()).longValue());
            case 9:
                List list9 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(48, 600000L, "measurement.sgtm.upload.min_delay_after_background").get();
            case 10:
                List list10 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(63, 43200000L, "measurement.upload.backoff_period").get();
            case 11:
                List list11 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(33, 10000L, "measurement.upload.realtime_upload_interval").get();
            case 12:
                List list12 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(27, 60000L, "measurement.alarm_manager.minimum_interval").get();
            case 13:
                List list13 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(64, 15000L, "measurement.upload.initial_upload_delay_time").get();
            case 14:
                List list14 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(76, 6L, "measurement.upload.retry_count").get()).longValue());
            case 15:
                List list15 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(17, 4L, "measurement.lifetimevalue.max_currency_tracked").get()).longValue());
            case 16:
                List list16 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(38, 1000L, "measurement.service_client.reconnect_millis").get();
            case 17:
                List list17 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (String) com.google.android.gms.internal.measurement.f3.a.i("measurement.config.url_authority", 7, "app-measurement.com").get();
            case 18:
                List list18 = h0.a;
                com.google.android.gms.internal.measurement.e4.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f4.a.g(3, -2L, "measurement.test.int_flag").get()).longValue());
            case 19:
                List list19 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(23, 27L, "measurement.upload.max_item_scoped_custom_parameters").get()).longValue());
            case 20:
                List list20 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(61, 604800000L, "measurement.sdk.attribution.cache.ttl").get();
            case 21:
                List list21 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(26, 7L, "measurement.rb.attribution.client.min_ad_services_version").get()).longValue());
            case 22:
                List list22 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (String) com.google.android.gms.internal.measurement.f3.a.i("measurement.rb.attribution.uri_authority", 56, "google-analytics.com").get();
            case 23:
                List list23 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (String) com.google.android.gms.internal.measurement.f3.a.i("measurement.rb.attribution.app_allowlist", 32, "").get();
            case 24:
                List list24 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (String) com.google.android.gms.internal.measurement.f3.a.i("measurement.rb.attribution.query_parameters_to_remove", 59, "").get();
            case 25:
                List list25 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(54, 16L, "measurement.rb.attribution.max_retry_delay_seconds").get()).longValue());
            case 26:
                List list26 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(24, 1000L, "measurement.rb.max_trigger_registrations_per_day").get()).longValue());
            case 27:
                List list27 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(30, 3000L, "measurement.rb.attribution.notify_app_delay_millis").get()).longValue());
            case 28:
                List list28 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(66, 65536L, "measurement.upload.max_bundle_size").get()).longValue());
            default:
                List list29 = h0.a;
                return (Boolean) com.google.android.gms.internal.measurement.u3.c.get();
        }
    }
}
