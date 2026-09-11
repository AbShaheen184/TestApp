package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.w4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements y {
    public final /* synthetic */ int e;
    public static final /* synthetic */ z y = new z(0);
    public static final /* synthetic */ z z = new z(1);
    public static final /* synthetic */ z A = new z(2);
    public static final /* synthetic */ z B = new z(3);
    public static final /* synthetic */ z C = new z(4);
    public static final /* synthetic */ z D = new z(5);
    public static final /* synthetic */ z E = new z(6);
    public static final /* synthetic */ z F = new z(7);
    public static final /* synthetic */ z G = new z(8);
    public static final /* synthetic */ z H = new z(9);
    public static final /* synthetic */ z I = new z(10);
    public static final /* synthetic */ z J = new z(11);
    public static final /* synthetic */ z K = new z(12);
    public static final /* synthetic */ z L = new z(13);
    public static final /* synthetic */ z M = new z(14);
    public static final /* synthetic */ z N = new z(15);
    public static final /* synthetic */ z O = new z(16);
    public static final /* synthetic */ z P = new z(17);
    public static final /* synthetic */ z Q = new z(18);
    public static final /* synthetic */ z R = new z(19);
    public static final /* synthetic */ z S = new z(20);
    public static final /* synthetic */ z T = new z(21);
    public static final /* synthetic */ z U = new z(22);
    public static final /* synthetic */ z V = new z(23);
    public static final /* synthetic */ z W = new z(24);
    public static final /* synthetic */ z X = new z(25);
    public static final /* synthetic */ z Y = new z(26);
    public static final /* synthetic */ z Z = new z(27);
    public static final /* synthetic */ z a0 = new z(28);
    public static final /* synthetic */ z b0 = new z(29);

    public /* synthetic */ z(int i) {
        this.e = i;
    }

    @Override // com.google.android.gms.measurement.internal.y
    public final Object a() {
        switch (this.e) {
            case 0:
                List list = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(1, 3600000L, "measurement.app_uninstalled_additional_ad_id_cache_time").get();
            case 1:
                List list2 = h0.a;
                return (String) com.google.android.gms.internal.measurement.o3.a.get();
            case 2:
                List list3 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(69, 1000L, "measurement.upload.max_error_events_per_day").get()).longValue());
            case 3:
                List list4 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(74, 10L, "measurement.upload.max_realtime_events_per_day").get()).longValue());
            case 4:
                List list5 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (String) com.google.android.gms.internal.measurement.f3.a.i("measurement.sgtm.google_signal.url", 16, "https://app-measurement.com/s/d").get();
            case 5:
                List list6 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(51, 600000L, "measurement.sgtm.upload.retry_interval").get();
            case 6:
                List list7 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(41, 1800000L, "measurement.sgtm.batch.retry_interval").get();
            case 7:
                List list8 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(47, 5000L, "measurement.sgtm.upload.max_queued_batches").get()).longValue());
            case 8:
                List list9 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(49, 1000L, "measurement.sgtm.upload.min_delay_after_broadcast").get();
            case 9:
                List list10 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(5, 86400000L, "measurement.config.cache_time").get();
            case 10:
                List list11 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(65, 3600000L, "measurement.upload.interval").get();
            case 11:
                List list12 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(28, 500L, "measurement.upload.minimum_delay").get();
            case 12:
                List list13 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(34, 604800000L, "measurement.upload.refresh_blacklisted_config_interval").get();
            case 13:
                List list14 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(77, 1800000L, "measurement.upload.retry_time").get();
            case 14:
                List list15 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(15, 605000L, "measurement.upload.google_signal_max_queue_time").get();
            case 15:
                List list16 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(36, 5000L, "measurement.service_client.idle_disconnect_millis").get();
            case 16:
                List list17 = h0.a;
                com.google.android.gms.internal.measurement.e4.y.get();
                return (String) com.google.android.gms.internal.measurement.f4.a.i("measurement.test.string_flag", 5, "---").get();
            case 17:
                List list18 = h0.a;
                com.google.android.gms.internal.measurement.e4.y.get();
                return (Long) com.google.android.gms.internal.measurement.f4.a.g(1, -1L, "measurement.test.cached_long_flag").get();
            case 18:
                List list19 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(21, 50L, "measurement.experiment.max_ids").get()).longValue());
            case 19:
                List list20 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(3, 100L, "measurement.max_bundles_per_iteration").get()).longValue());
            case 20:
                List list21 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(67, 100L, "measurement.upload.max_bundles").get()).longValue());
            case 21:
                List list22 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (String) com.google.android.gms.internal.measurement.f3.a.i("measurement.rb.attribution.uri_scheme", 60, "https").get();
            case 22:
                List list23 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(12, 3600000L, "measurement.session.engagement_interval").get();
            case 23:
                List list24 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (String) com.google.android.gms.internal.measurement.f3.a.i("measurement.rb.attribution.event_params", 13, "value|currency").get();
            case 24:
                List list25 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(57, 864000000L, "measurement.rb.attribution.max_queue_time").get();
            case 25:
                List list26 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(25, 0L, "measurement.rb.attribution.max_trigger_uris_queried_at_once").get()).longValue());
            case 26:
                List list27 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Boolean) com.google.android.gms.internal.measurement.f3.a.b(31, "measurement.config.notify_trigger_uris_on_backgrounded", true).get();
            case 27:
                List list28 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(11, 3600000L, "45769094").get();
            case 28:
                List list29 = h0.a;
                return (Boolean) com.google.android.gms.internal.measurement.u3.a.get();
            default:
                List list30 = h0.a;
                return (Boolean) w4.a.get();
        }
    }
}
