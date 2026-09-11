package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.bc;
import com.google.android.gms.internal.measurement.ec;
import com.google.android.gms.internal.measurement.j5;
import com.google.android.gms.internal.measurement.s5;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements y {
    public final /* synthetic */ int e;
    public static final /* synthetic */ x y = new x(0);
    public static final /* synthetic */ x z = new x(1);
    public static final /* synthetic */ x A = new x(2);
    public static final /* synthetic */ x B = new x(3);
    public static final /* synthetic */ x C = new x(4);
    public static final /* synthetic */ x D = new x(5);
    public static final /* synthetic */ x E = new x(6);
    public static final /* synthetic */ x F = new x(7);
    public static final /* synthetic */ x G = new x(8);
    public static final /* synthetic */ x H = new x(9);
    public static final /* synthetic */ x I = new x(10);
    public static final /* synthetic */ x J = new x(11);
    public static final /* synthetic */ x K = new x(12);
    public static final /* synthetic */ x L = new x(13);
    public static final /* synthetic */ x M = new x(14);
    public static final /* synthetic */ x N = new x(15);
    public static final /* synthetic */ x O = new x(16);
    public static final /* synthetic */ x P = new x(17);
    public static final /* synthetic */ x Q = new x(18);
    public static final /* synthetic */ x R = new x(19);
    public static final /* synthetic */ x S = new x(20);
    public static final /* synthetic */ x T = new x(21);
    public static final /* synthetic */ x U = new x(22);
    public static final /* synthetic */ x V = new x(23);
    public static final /* synthetic */ x W = new x(24);
    public static final /* synthetic */ x X = new x(25);
    public static final /* synthetic */ x Y = new x(26);
    public static final /* synthetic */ x Z = new x(27);
    public static final /* synthetic */ x a0 = new x(28);
    public static final /* synthetic */ x b0 = new x(29);

    public /* synthetic */ x(int i) {
        this.e = i;
    }

    @Override // com.google.android.gms.measurement.internal.y
    public final Object a() {
        switch (this.e) {
            case 0:
                return new Boolean(((Boolean) com.google.android.gms.internal.measurement.w3.a.get()).booleanValue());
            case 1:
                List list = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (String) com.google.android.gms.internal.measurement.f3.a.i("measurement.edpb.events_cached_in_no_data_mode", 14, "_f,_v,_cmp").get();
            case 2:
                List list2 = h0.a;
                return (String) com.google.android.gms.internal.measurement.o3.c.get();
            case 3:
                List list3 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(68, 10000L, "measurement.upload.max_conversions_per_day").get()).longValue());
            case 4:
                List list4 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (String) com.google.android.gms.internal.measurement.f3.a.i("measurement.upload.url", 78, "https://app-measurement.com/a").get();
            case 5:
                List list5 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (String) com.google.android.gms.internal.measurement.f3.a.i("measurement.sgtm.upload.backoff_http_codes", 45, "404,429,503,504").get();
            case 6:
                List list6 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(52, 21600000L, "measurement.sgtm.upload.retry_max_wait").get();
            case 7:
                List list7 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(42, 10L, "measurement.sgtm.batch.retry_max_count").get()).longValue());
            case 8:
                List list8 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(50, 5000L, "measurement.sgtm.upload.min_delay_after_startup").get();
            case 9:
                List list9 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(40, 240000L, "measurement.sgtm.batch.long_queuing_threshold").get();
            case 10:
                List list10 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(79, 3600000L, "measurement.upload.window_interval").get();
            case 11:
                List list11 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(9, 1000L, "measurement.upload.debug_upload_interval").get();
            case 12:
                List list12 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(53, 86400000L, "measurement.upload.stale_data_deletion_interval").get();
            case 13:
                List list13 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (String) com.google.android.gms.internal.measurement.f3.a.i("measurement.config.url_scheme", 8, "https").get();
            case 14:
                List list14 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(73, 518400000L, "measurement.upload.max_queue_time").get();
            case 15:
                List list15 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(22, 200L, "measurement.audience.filter_result_max_count").get()).longValue());
            case 16:
                List list16 = h0.a;
                com.google.android.gms.internal.measurement.e4.y.get();
                return (Boolean) com.google.android.gms.internal.measurement.f4.a.b(0, "measurement.test.boolean_flag", false).get();
            case 17:
                List list17 = h0.a;
                com.google.android.gms.internal.measurement.e4.y.get();
                return (Long) com.google.android.gms.internal.measurement.f4.a.g(4, -1L, "measurement.test.long_flag").get();
            case 18:
                List list18 = h0.a;
                com.google.android.gms.internal.measurement.e4.y.get();
                j5 j5Var = com.google.android.gms.internal.measurement.f4.a;
                AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) j5Var.y;
                ec ecVar = (ec) atomicReferenceArray.get(2);
                if (ecVar == null) {
                    bc bcVar = new bc("measurement.test.double_flag", (com.appsalt.internal.q0) ((s5) j5Var.z).y);
                    while (!atomicReferenceArray.compareAndSet(2, null, bcVar)) {
                        if (atomicReferenceArray.get(2) != null) {
                            ecVar = (ec) atomicReferenceArray.get(2);
                            ecVar.getClass();
                        }
                    }
                    ecVar = bcVar;
                }
                return (Double) ecVar.get();
            case 19:
                List list19 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(19, 500L, "measurement.upload.max_event_parameter_value_length").get()).longValue());
            case 20:
                List list20 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(62, 7200000L, "measurement.redaction.app_instance_id.ttl").get();
            case 21:
                List list21 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(18, 1L, "measurement.dma_consent.max_daily_dcu_realtime_events").get()).longValue());
            case 22:
                List list22 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (String) com.google.android.gms.internal.measurement.f3.a.i("measurement.rb.attribution.uri_path", 58, "privacy-sandbox/register-app-conversion").get();
            case 23:
                List list23 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (String) com.google.android.gms.internal.measurement.f3.a.i("measurement.rb.attribution.user_properties", 80, "_npa,npa|_fot,fot").get();
            case 24:
                List list24 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(75, 65536L, "measurement.upload.max_batch_size").get()).longValue());
            case 25:
                List list25 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(55, 90L, "measurement.rb.attribution.client.min_time_after_boot_seconds").get()).longValue());
            case 26:
                List list26 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Boolean) com.google.android.gms.internal.measurement.f3.a.b(2, "measurement.config.bundle_for_all_apps_on_backgrounded", true).get();
            case 27:
                List list27 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Boolean) com.google.android.gms.internal.measurement.f3.a.b(10, "measurement.config.default_flag_values", true).get();
            case 28:
                List list28 = h0.a;
                return (Boolean) com.google.android.gms.internal.measurement.u3.b.get();
            default:
                List list29 = h0.a;
                return (Boolean) com.google.android.gms.internal.measurement.a4.a.get();
        }
    }
}
