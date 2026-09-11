package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.a9;
import com.google.android.gms.internal.measurement.b9;
import com.google.android.gms.internal.measurement.c7;
import com.google.android.gms.internal.measurement.d7;
import com.google.android.gms.internal.measurement.k9;
import com.google.android.gms.internal.measurement.s8;
import com.google.android.gms.internal.measurement.t8;
import com.google.android.gms.internal.measurement.w8;
import com.google.android.gms.internal.measurement.y8;
import com.google.android.gms.internal.measurement.z8;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.mozilla.javascript.ES6Iterator;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends g4 {
    public static final String[] C = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] D = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
    public static final String[] E = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] F = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;", "last_diagnostics_signal_upload_timestamp", "ALTER TABLE apps ADD COLUMN last_diagnostics_signal_upload_timestamp INTEGER;"};
    public static final String[] G = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;", "elapsed_time", "ALTER TABLE raw_events ADD COLUMN elapsed_time INTEGER;"};
    public static final String[] H = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] I = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] J = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] K = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public static final String[] L = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    public static final String[] M = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    public final l A;
    public final androidx.compose.foundation.gestures.y2 B;

    public m(l4 l4Var) {
        super(l4Var);
        this.B = new androidx.compose.foundation.gestures.y2(((s1) this.e).H);
        ((s1) this.e).getClass();
        this.A = new l(this, ((s1) this.e).e);
    }

    public static final String a0(List list) {
        return list.isEmpty() ? "" : androidx.privacysandbox.ads.adservices.java.internal.a.q(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    public static final void i0(ContentValues contentValues, Object obj) {
        com.google.android.gms.common.internal.x.d(ES6Iterator.VALUE_PROPERTY);
        com.google.android.gms.common.internal.x.g(obj);
        if (obj instanceof String) {
            contentValues.put(ES6Iterator.VALUE_PROPERTY, (String) obj);
            return;
        }
        if (obj instanceof Long) {
            contentValues.put(ES6Iterator.VALUE_PROPERTY, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(ES6Iterator.VALUE_PROPERTY, (Double) obj);
        } else {
            net.luminis.tls.engine.impl.c.o("Invalid value type");
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00de  */
    public final List A(String str, e4 e4Var, int i) throws Throwable {
        List list;
        com.google.android.gms.common.internal.x.d(str);
        v();
        w();
        Cursor cursorQuery = null;
        try {
            SQLiteDatabase sQLiteDatabaseM0 = m0();
            String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
            String strA0 = a0(e4Var.e);
            String strZ = Z();
            StringBuilder sb = new StringBuilder(strA0.length() + 17 + strZ.length());
            sb.append("app_id=?");
            sb.append(strA0);
            sb.append(" AND NOT ");
            sb.append(strZ);
            cursorQuery = sQLiteDatabaseM0.query("upload_queue", strArr, sb.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i > 0 ? String.valueOf(i) : null);
            ArrayList arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                m4 m4VarY = Y(str, cursorQuery.getLong(0), cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                if (m4VarY != null) {
                    arrayList.add(m4VarY);
                }
            }
            list = arrayList;
        } catch (SQLiteException e) {
            try {
                x0 x0Var = ((s1) this.e).C;
                s1.m(x0Var);
                x0Var.C.c(str, e, "Error to querying MeasurementBatch from upload_queue. appId");
                list = Collections.EMPTY_LIST;
            } catch (Throwable th) {
                th = th;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return list;
    }

    public final void A0(c1 c1Var, boolean z) {
        s1 s1Var = (s1) this.e;
        s1 s1Var2 = c1Var.a;
        v();
        w();
        String strE = c1Var.E();
        com.google.android.gms.common.internal.x.g(strE);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strE);
        e2 e2Var = e2.ANALYTICS_STORAGE;
        l4 l4Var = this.y;
        if (z) {
            contentValues.put("app_instance_id", (String) null);
        } else if (l4Var.d(strE).i(e2Var)) {
            contentValues.put("app_instance_id", c1Var.F());
        }
        contentValues.put("gmp_app_id", c1Var.H());
        if (l4Var.d(strE).i(e2.AD_STORAGE)) {
            p1 p1Var = s1Var2.D;
            s1.m(p1Var);
            p1Var.v();
            contentValues.put("resettable_device_id_hash", c1Var.e);
        }
        p1 p1Var2 = s1Var2.D;
        s1.m(p1Var2);
        p1Var2.v();
        contentValues.put("last_bundle_index", Long.valueOf(c1Var.g));
        p1 p1Var3 = s1Var2.D;
        s1.m(p1Var3);
        p1Var3.v();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c1Var.h));
        p1 p1Var4 = s1Var2.D;
        s1.m(p1Var4);
        p1Var4.v();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c1Var.i));
        contentValues.put("app_version", c1Var.O());
        p1 p1Var5 = s1Var2.D;
        s1.m(p1Var5);
        p1Var5.v();
        contentValues.put("app_store", c1Var.l);
        p1 p1Var6 = s1Var2.D;
        s1.m(p1Var6);
        p1Var6.v();
        contentValues.put("gmp_version", Long.valueOf(c1Var.m));
        p1 p1Var7 = s1Var2.D;
        s1.m(p1Var7);
        p1Var7.v();
        contentValues.put("dev_cert_hash", Long.valueOf(c1Var.n));
        p1 p1Var8 = s1Var2.D;
        s1.m(p1Var8);
        p1Var8.v();
        contentValues.put("measurement_enabled", Boolean.valueOf(c1Var.o));
        p1 p1Var9 = s1Var2.D;
        p1 p1Var10 = s1Var2.D;
        s1.m(p1Var9);
        p1Var9.v();
        contentValues.put("day", Long.valueOf(c1Var.K));
        s1.m(p1Var10);
        p1Var10.v();
        contentValues.put("daily_public_events_count", Long.valueOf(c1Var.L));
        s1.m(p1Var10);
        p1Var10.v();
        contentValues.put("daily_events_count", Long.valueOf(c1Var.M));
        s1.m(p1Var10);
        p1Var10.v();
        contentValues.put("daily_conversions_count", Long.valueOf(c1Var.N));
        p1 p1Var11 = s1Var2.D;
        s1.m(p1Var11);
        p1Var11.v();
        contentValues.put("config_fetched_time", Long.valueOf(c1Var.S));
        p1 p1Var12 = s1Var2.D;
        s1.m(p1Var12);
        p1Var12.v();
        contentValues.put("failed_config_fetch_time", Long.valueOf(c1Var.T));
        contentValues.put("app_version_int", Long.valueOf(c1Var.Q()));
        contentValues.put("firebase_instance_id", c1Var.K());
        s1.m(p1Var10);
        p1Var10.v();
        contentValues.put("daily_error_events_count", Long.valueOf(c1Var.O));
        s1.m(p1Var10);
        p1Var10.v();
        contentValues.put("daily_realtime_events_count", Long.valueOf(c1Var.P));
        s1.m(p1Var10);
        p1Var10.v();
        contentValues.put("health_monitor_sample", c1Var.Q);
        contentValues.put("android_id", (Long) 0L);
        p1 p1Var13 = s1Var2.D;
        s1.m(p1Var13);
        p1Var13.v();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c1Var.p));
        contentValues.put("dynamite_version", Long.valueOf(c1Var.b()));
        if (l4Var.d(strE).i(e2Var)) {
            p1 p1Var14 = s1Var2.D;
            s1.m(p1Var14);
            p1Var14.v();
            contentValues.put("session_stitching_token", c1Var.t);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(c1Var.z()));
        p1 p1Var15 = s1Var2.D;
        s1.m(p1Var15);
        p1Var15.v();
        contentValues.put("target_os_version", Long.valueOf(c1Var.v));
        p1 p1Var16 = s1Var2.D;
        s1.m(p1Var16);
        p1Var16.v();
        contentValues.put("session_stitching_token_hash", Long.valueOf(c1Var.w));
        com.google.android.gms.internal.measurement.g4.a();
        g gVar = s1Var.A;
        x0 x0Var = s1Var.C;
        if (gVar.G(strE, h0.O0)) {
            p1 p1Var17 = s1Var2.D;
            s1.m(p1Var17);
            p1Var17.v();
            contentValues.put("ad_services_version", Integer.valueOf(c1Var.x));
            p1 p1Var18 = s1Var2.D;
            s1.m(p1Var18);
            p1Var18.v();
            contentValues.put("attribution_eligibility_status", Long.valueOf(c1Var.B));
        }
        p1 p1Var19 = s1Var2.D;
        s1.m(p1Var19);
        p1Var19.v();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(c1Var.y));
        contentValues.put("npa_metadata_value", c1Var.x());
        p1 p1Var20 = s1Var2.D;
        s1.m(p1Var20);
        p1Var20.v();
        contentValues.put("bundle_delivery_index", Long.valueOf(c1Var.F));
        contentValues.put("sgtm_preview_key", c1Var.D());
        s1.m(p1Var10);
        p1Var10.v();
        contentValues.put("dma_consent_state", Integer.valueOf(c1Var.D));
        s1.m(p1Var10);
        p1Var10.v();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(c1Var.E));
        contentValues.put("serialized_npa_metadata", c1Var.s());
        contentValues.put("client_upload_eligibility", Integer.valueOf(c1Var.t()));
        p1 p1Var21 = s1Var2.D;
        s1.m(p1Var21);
        p1Var21.v();
        ArrayList arrayList = c1Var.s;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                s1.m(x0Var);
                x0Var.F.b(strE, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        if (gVar.G(null, h0.K0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        p1 p1Var22 = s1Var2.D;
        s1.m(p1Var22);
        p1Var22.v();
        contentValues.put("unmatched_pfo", c1Var.z);
        p1 p1Var23 = s1Var2.D;
        s1.m(p1Var23);
        p1Var23.v();
        contentValues.put("unmatched_uwa", c1Var.A);
        p1 p1Var24 = s1Var2.D;
        s1.m(p1Var24);
        p1Var24.v();
        contentValues.put("ad_campaign_info", c1Var.H);
        if (gVar.G(strE, h0.j1)) {
            p1 p1Var25 = s1Var2.D;
            s1.m(p1Var25);
            p1Var25.v();
            contentValues.put("last_diagnostics_signal_upload_timestamp", Long.valueOf(c1Var.J));
        }
        try {
            SQLiteDatabase sQLiteDatabaseM0 = m0();
            if (sQLiteDatabaseM0.update("apps", contentValues, "app_id = ?", new String[]{strE}) == 0 && sQLiteDatabaseM0.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                s1.m(x0Var);
                x0Var.C.b(x0.D(strE), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e) {
            s1.m(x0Var);
            x0Var.C.c(x0.D(strE), e, "Error storing app. appId");
        }
    }

    public final boolean B(String str) {
        b3[] b3VarArr = {b3.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(b3VarArr[0].e));
        String strA0 = a0(arrayList);
        String strZ = Z();
        return R(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.l(new StringBuilder((strA0.length() + 61) + strZ.length()), "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?", strA0, " AND NOT ", strZ), new String[]{str}) != 0;
    }

    public final j B0(long j, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        return C0(j, str, 1L, false, false, z, false, z2, z3, z4);
    }

    public final void C(Long l) {
        s1 s1Var = (s1) this.e;
        v();
        w();
        try {
            if (m0().delete("upload_queue", "rowid=?", new String[]{l.toString()}) != 1) {
                x0 x0Var = s1Var.C;
                s1.m(x0Var);
                x0Var.F.a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e) {
            x0 x0Var2 = s1Var.C;
            s1.m(x0Var2);
            x0Var2.C.b(e, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e;
        }
    }

    public final j C0(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        s1 s1Var = (s1) this.e;
        com.google.android.gms.common.internal.x.d(str);
        v();
        w();
        String[] strArr = {str};
        j jVar = new j();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM0 = m0();
                cursorQuery = sQLiteDatabaseM0.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j) {
                        jVar.b = cursorQuery.getLong(1);
                        jVar.a = cursorQuery.getLong(2);
                        jVar.c = cursorQuery.getLong(3);
                        jVar.d = cursorQuery.getLong(4);
                        jVar.e = cursorQuery.getLong(5);
                        jVar.f = cursorQuery.getLong(6);
                        jVar.g = cursorQuery.getLong(7);
                    }
                    if (z) {
                        jVar.b += j2;
                    }
                    if (z2) {
                        jVar.a += j2;
                    }
                    if (z3) {
                        jVar.c += j2;
                    }
                    if (z4) {
                        jVar.d += j2;
                    }
                    if (z5) {
                        jVar.e += j2;
                    }
                    if (z6) {
                        jVar.f += j2;
                    }
                    if (z7) {
                        jVar.g += j2;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(jVar.a));
                    contentValues.put("daily_events_count", Long.valueOf(jVar.b));
                    contentValues.put("daily_conversions_count", Long.valueOf(jVar.c));
                    contentValues.put("daily_error_events_count", Long.valueOf(jVar.d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(jVar.e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(jVar.f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(jVar.g));
                    sQLiteDatabaseM0.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    x0 x0Var = s1Var.C;
                    s1.m(x0Var);
                    x0Var.F.b(x0.D(str), "Not updating daily counts, app is not known. appId");
                }
            } catch (SQLiteException e) {
                x0 x0Var2 = s1Var.C;
                s1.m(x0Var2);
                x0Var2.C.c(x0.D(str), e, "Error updating daily counts. appId");
            }
            return jVar;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final String D() throws Throwable {
        SQLiteException e;
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabaseM0 = m0();
        ?? r1 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseM0.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        String string = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        return string;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    x0 x0Var = ((s1) this.e).C;
                    s1.m(x0Var);
                    x0Var.C.b(e, "Database error getting next bundle app id");
                }
            } catch (SQLiteException e3) {
                e = e3;
                cursorRawQuery = null;
            } catch (Throwable th) {
                th = th;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return null;
        } catch (Throwable th2) {
            r1 = sQLiteDatabaseM0;
            th = th2;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Code duplicated, block: B:35:? A[SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x006c: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:109), block:B:19:0x006c */
    public final com.google.android.datatransport.runtime.scheduling.jobscheduling.c D0(String str) {
        Throwable th;
        Cursor cursorQuery;
        Cursor cursor;
        s1 s1Var = (s1) this.e;
        com.google.android.gms.common.internal.x.d(str);
        v();
        w();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = m0().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        byte[] blob = cursorQuery.getBlob(0);
                        String string = cursorQuery.getString(1);
                        String string2 = cursorQuery.getString(2);
                        if (cursorQuery.moveToNext()) {
                            x0 x0Var = s1Var.C;
                            s1.m(x0Var);
                            x0Var.C.b(x0.D(str), "Got multiple records for app config, expected one. appId");
                        }
                        if (blob != null) {
                            com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar = new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(8, blob, string, string2);
                            cursorQuery.close();
                            return cVar;
                        }
                    }
                } catch (SQLiteException e) {
                    e = e;
                    x0 x0Var2 = s1Var.C;
                    s1.m(x0Var2);
                    x0Var2.C.c(x0.D(str), e, "Error querying remote config. appId");
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursorQuery = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor2 != null) {
                    throw th;
                }
                cursor2.close();
                throw th;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            cursor2 = cursor;
            if (cursor2 != null) {
                throw th;
            }
            cursor2.close();
            throw th;
        }
    }

    public final void E(long j) {
        v();
        w();
        try {
            if (m0().delete("queue", "rowid=?", new String[]{String.valueOf(j)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e) {
            x0 x0Var = ((s1) this.e).C;
            s1.m(x0Var);
            x0Var.C.b(e, "Failed to delete a bundle in a queue table");
            throw e;
        }
    }

    public final void E0(b9 b9Var, boolean z) {
        v();
        w();
        com.google.android.gms.common.internal.x.d(b9Var.u());
        if (!b9Var.h2()) {
            org.mozilla.javascript.c.a();
            return;
        }
        F();
        s1 s1Var = (s1) this.e;
        com.google.android.gms.common.util.a aVar = s1Var.H;
        x0 x0Var = s1Var.C;
        aVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jI2 = b9Var.i2();
        g0 g0Var = h0.R;
        if (jI2 < jCurrentTimeMillis - ((Long) g0Var.a(null)).longValue() || b9Var.i2() > ((Long) g0Var.a(null)).longValue() + jCurrentTimeMillis) {
            s1.m(x0Var);
            x0Var.F.d("Storing bundle outside of the max uploading time span. appId, now, timestamp", x0.D(b9Var.u()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(b9Var.i2()));
        }
        byte[] bArrA = b9Var.a();
        try {
            n4 n4Var = this.y.D;
            l4.U(n4Var);
            byte[] bArrF0 = n4Var.f0(bArrA);
            s1.m(x0Var);
            x0Var.K.b(Integer.valueOf(bArrF0.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", b9Var.u());
            contentValues.put("bundle_end_timestamp", Long.valueOf(b9Var.i2()));
            contentValues.put("data", bArrF0);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (b9Var.u0()) {
                contentValues.put("retry_count", Integer.valueOf(b9Var.v0()));
            }
            try {
                if (m0().insert("queue", null, contentValues) == -1) {
                    s1.m(x0Var);
                    x0Var.C.b(x0.D(b9Var.u()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e) {
                s1.m(x0Var);
                x0Var.C.c(x0.D(b9Var.u()), e, "Error storing bundle. appId");
            }
        } catch (IOException e2) {
            s1.m(x0Var);
            x0Var.C.c(x0.D(b9Var.u()), e2, "Data loss. Failed to serialize bundle. appId");
        }
    }

    public final void F() {
        v();
        w();
        if (g0()) {
            l4 l4Var = this.y;
            long jG = l4Var.F.B.g();
            s1 s1Var = (s1) this.e;
            s1Var.H.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jG) > ((Long) h0.M.a(null)).longValue()) {
                l4Var.F.B.h(jElapsedRealtime);
                v();
                w();
                if (g0()) {
                    SQLiteDatabase sQLiteDatabaseM0 = m0();
                    s1Var.H.getClass();
                    int iDelete = sQLiteDatabaseM0.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) h0.R.a(null)).longValue())});
                    if (iDelete > 0) {
                        x0 x0Var = s1Var.C;
                        s1.m(x0Var);
                        x0Var.K.b(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void G(ArrayList arrayList) {
        s1 s1Var = (s1) this.e;
        v();
        w();
        com.google.android.gms.common.internal.x.g(arrayList);
        if (arrayList.size() == 0) {
            net.luminis.tls.engine.impl.c.o("Given Integer is zero");
            return;
        }
        if (g0()) {
            String strJoin = TextUtils.join(",", arrayList);
            String strK = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.k(new StringBuilder(String.valueOf(strJoin).length() + 2), "(", strJoin, ")");
            if (R(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.k(new StringBuilder(strK.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", strK, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                x0 x0Var = s1Var.C;
                s1.m(x0Var);
                x0Var.F.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseM0 = m0();
                StringBuilder sb = new StringBuilder(strK.length() + 127);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(strK);
                sb.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseM0.execSQL(sb.toString());
            } catch (SQLiteException e) {
                x0 x0Var2 = s1Var.C;
                s1.m(x0Var2);
                x0Var2.C.b(e, "Error incrementing retry count. error");
            }
        }
    }

    public final void H(Long l) {
        s1 s1Var = (s1) this.e;
        v();
        w();
        if (g0()) {
            StringBuilder sb = new StringBuilder(l.toString().length() + 86);
            sb.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb.append(l);
            sb.append(" AND retry_count =  2147483647 LIMIT 1");
            if (R(sb.toString(), null) > 0) {
                x0 x0Var = s1Var.C;
                s1.m(x0Var);
                x0Var.F.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseM0 = m0();
                s1Var.H.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb2 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 60);
                sb2.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb2.append(jCurrentTimeMillis);
                String string = sb2.toString();
                StringBuilder sb3 = new StringBuilder(string.length() + 34 + l.toString().length() + 29);
                sb3.append("UPDATE upload_queue");
                sb3.append(string);
                sb3.append(" WHERE rowid = ");
                sb3.append(l);
                sb3.append(" AND retry_count < 2147483647");
                sQLiteDatabaseM0.execSQL(sb3.toString());
            } catch (SQLiteException e) {
                x0 x0Var2 = s1Var.C;
                s1.m(x0Var2);
                x0Var2.C.b(e, "Error incrementing retry count. error");
            }
        }
    }

    public final Object I(Cursor cursor, int i) {
        s1 s1Var = (s1) this.e;
        int type = cursor.getType(i);
        if (type == 0) {
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.C.a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type != 4) {
            x0 x0Var2 = s1Var.C;
            s1.m(x0Var2);
            x0Var2.C.b(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        x0 x0Var3 = s1Var.C;
        s1.m(x0Var3);
        x0Var3.C.a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0093 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x00a6 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    public final long J(String str) {
        long j;
        ContentValues contentValues;
        s1 s1Var = (s1) this.e;
        com.google.android.gms.common.internal.x.d(str);
        com.google.android.gms.common.internal.x.d("first_open_count");
        v();
        w();
        SQLiteDatabase sQLiteDatabaseM0 = m0();
        sQLiteDatabaseM0.beginTransaction();
        long j2 = 0;
        try {
            try {
                StringBuilder sb = new StringBuilder(48);
                sb.append("select first_open_count from app2 where app_id=?");
                j = -1;
                long jS = S(sb.toString(), new String[]{str}, -1L);
                if (jS == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseM0.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        x0 x0Var = s1Var.C;
                        s1.m(x0Var);
                        x0Var.C.c(x0.D(str), "first_open_count", "Failed to insert column (got -1). appId");
                    } else {
                        jS = 0;
                        try {
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str);
                            contentValues.put("first_open_count", Long.valueOf(1 + jS));
                            if (sQLiteDatabaseM0.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                                x0 x0Var2 = s1Var.C;
                                s1.m(x0Var2);
                                x0Var2.C.c(x0.D(str), "first_open_count", "Failed to update column (got 0). appId");
                            } else {
                                sQLiteDatabaseM0.setTransactionSuccessful();
                                j = jS;
                            }
                        } catch (SQLiteException e) {
                            e = e;
                            j2 = jS;
                            x0 x0Var3 = s1Var.C;
                            s1.m(x0Var3);
                            x0Var3.C.d("Error inserting column. appId", x0.D(str), "first_open_count", e);
                            j = j2;
                        }
                    }
                } else {
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", Long.valueOf(1 + jS));
                    if (sQLiteDatabaseM0.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                        x0 x0Var4 = s1Var.C;
                        s1.m(x0Var4);
                        x0Var4.C.c(x0.D(str), "first_open_count", "Failed to update column (got 0). appId");
                    } else {
                        sQLiteDatabaseM0.setTransactionSuccessful();
                        j = jS;
                    }
                }
            } finally {
                sQLiteDatabaseM0.endTransaction();
            }
        } catch (SQLiteException e2) {
            e = e2;
        }
        return j;
    }

    public final boolean K(String str, String str2) {
        return R("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final void L(List list) {
        com.google.android.gms.common.internal.x.g(list);
        v();
        w();
        StringBuilder sb = new StringBuilder("rowid in (");
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(((Long) list.get(i)).longValue());
        }
        sb.append(")");
        int iDelete = m0().delete("raw_events", sb.toString(), null);
        if (iDelete != list.size()) {
            x0 x0Var = ((s1) this.e).C;
            s1.m(x0Var);
            x0Var.C.c(Integer.valueOf(iDelete), Integer.valueOf(list.size()), "Deleted fewer rows from raw events table than expected");
        }
    }

    public final long M(String str) {
        com.google.android.gms.common.internal.x.d(str);
        return S("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final void N(String str, Long l, long j, t8 t8Var) {
        v();
        w();
        com.google.android.gms.common.internal.x.g(t8Var);
        com.google.android.gms.common.internal.x.d(str);
        s1 s1Var = (s1) this.e;
        byte[] bArrA = t8Var.a();
        x0 x0Var = s1Var.C;
        x0 x0Var2 = s1Var.C;
        s1.m(x0Var);
        x0Var.K.c(s1Var.G.a(str), Integer.valueOf(bArrA.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", bArrA);
        try {
            if (m0().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                s1.m(x0Var2);
                x0Var2.C.b(x0.D(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e) {
            s1.m(x0Var2);
            x0Var2.C.c(x0.D(str), e, "Error storing complex main event. appId");
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[LOOP:2: B:51:0x00fd->B:127:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:53:0x0103  */
    public final void O(String str, Long l, String str2, Bundle bundle) throws Throwable {
        x0 x0Var;
        Bundle bundle2;
        long j;
        String str3;
        ContentValues contentValues;
        x0 x0Var2;
        b9 b9Var;
        Iterator it;
        m mVar = this;
        String str4 = str;
        s1 s1Var = (s1) mVar.e;
        com.google.android.gms.common.internal.x.g(bundle);
        mVar.v();
        mVar.w();
        androidx.compose.ui.input.pointer.util.b bVar = l != null ? new androidx.compose.ui.input.pointer.util.b(mVar, str4, l.longValue()) : new androidx.compose.ui.input.pointer.util.b(mVar, str4);
        List<k> listI = bVar.i();
        while (!listI.isEmpty()) {
            for (k kVar : listI) {
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        Cursor cursor = null;
                        b9 b9Var2 = null;
                        Cursor cursor2 = null;
                        try {
                            try {
                                Cursor cursorQuery = mVar.m0().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str4, Long.toString(kVar.b)}, null, null, "rowid", "2");
                                try {
                                    try {
                                        if (cursorQuery.moveToFirst()) {
                                            try {
                                                b9Var = (b9) ((a9) n4.g0(b9.Z(), cursorQuery.getBlob(0))).d();
                                                try {
                                                    if (cursorQuery.moveToNext()) {
                                                        x0 x0Var3 = s1Var.C;
                                                        s1.m(x0Var3);
                                                        x0Var3.F.b(x0.D(str4), "Get multiple raw event metadata records, expected one. appId");
                                                    }
                                                    cursorQuery.close();
                                                    cursorQuery.close();
                                                } catch (SQLiteException e) {
                                                    e = e;
                                                    cursor = cursorQuery;
                                                    x0 x0Var4 = s1Var.C;
                                                    s1.m(x0Var4);
                                                    x0Var4.C.c(x0.D(str4), e, "Data loss. Error selecting raw event. appId");
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                }
                                                b9Var2 = b9Var;
                                            } catch (IOException e2) {
                                                x0 x0Var5 = s1Var.C;
                                                s1.m(x0Var5);
                                                x0Var5.C.c(x0.D(str4), e2, "Data loss. Failed to merge raw event metadata. appId");
                                                cursorQuery.close();
                                            }
                                            if (b9Var2 != null) {
                                                it = b9Var2.a2().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        if (((k9) it.next()).w().equals(str2)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            x0 x0Var6 = s1Var.C;
                                            s1.m(x0Var6);
                                            x0Var6.C.b(x0.D(str4), "Raw event metadata record is missing. appId");
                                        }
                                        cursorQuery.close();
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor2 = cursorQuery;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteException e3) {
                                    e = e3;
                                    b9Var = null;
                                }
                            } catch (SQLiteException e4) {
                                e = e4;
                                b9Var = null;
                            }
                            if (b9Var2 != null) {
                                it = b9Var2.a2().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((k9) it.next()).w().equals(str2)) {
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    long jUpdate = m0().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j)});
                    if (jUpdate != 1) {
                        s1.m(x0Var);
                        x0Var2 = x0Var;
                        try {
                            x0Var2.C.c(x0.D(str3), Long.valueOf(jUpdate), "Failed to update raw event. appId, updatedRows");
                        } catch (SQLiteException e5) {
                            e = e5;
                            s1.m(x0Var2);
                            x0Var2.C.c(x0.D(str3), e, "Error updating raw event. appId");
                        }
                    }
                } catch (SQLiteException e6) {
                    e = e6;
                    x0Var2 = x0Var;
                }
                l4 l4Var = mVar.y;
                n4 n4Var = l4Var.D;
                l4.U(n4Var);
                t8 t8Var = kVar.d;
                Bundle bundle3 = new Bundle();
                for (w8 w8Var : t8Var.w()) {
                    if (w8Var.C()) {
                        bundle3.putDouble(w8Var.v(), w8Var.D());
                    } else if (w8Var.A()) {
                        bundle3.putFloat(w8Var.v(), w8Var.B());
                    } else if (w8Var.y()) {
                        bundle3.putLong(w8Var.v(), w8Var.z());
                    } else if (w8Var.w()) {
                        bundle3.putString(w8Var.v(), w8Var.x());
                    } else if (w8Var.E().isEmpty()) {
                        x0 x0Var7 = ((s1) n4Var.e).C;
                        s1.m(x0Var7);
                        x0Var7.C.b(w8Var, "Unexpected parameter type for parameter");
                    } else {
                        bundle3.putParcelableArray(w8Var.v(), n4.i0(w8Var.E()));
                    }
                }
                String string = bundle3.getString("_o");
                bundle3.remove("_o");
                String strZ = t8Var.z();
                if (string == null) {
                    string = "";
                }
                r4 r4Var = s1Var.F;
                x0Var = s1Var.C;
                s1.k(r4Var);
                if (strZ.equals("_cmp")) {
                    bundle2 = new Bundle(bundle);
                    for (String str5 : bundle.keySet()) {
                        k kVar2 = kVar;
                        if (str5.startsWith("gad_")) {
                            bundle2.remove(str5);
                        }
                        kVar = kVar2;
                    }
                } else {
                    bundle2 = bundle;
                }
                k kVar3 = kVar;
                r4Var.I(bundle3, bundle2);
                q qVar = new q((s1) mVar.e, string, str4, t8Var.z(), t8Var.B(), t8Var.J(), t8Var.D(), bundle3);
                j = kVar3.a;
                long j2 = kVar3.b;
                boolean z = kVar3.c;
                v();
                w();
                str3 = qVar.a;
                com.google.android.gms.common.internal.x.d(str3);
                n4 n4Var2 = l4Var.D;
                l4.U(n4Var2);
                byte[] bArrA = n4Var2.V(qVar).a();
                contentValues = new ContentValues();
                contentValues.put("app_id", str3);
                contentValues.put("name", qVar.b);
                contentValues.put("timestamp", Long.valueOf(qVar.d));
                contentValues.put("metadata_fingerprint", Long.valueOf(j2));
                contentValues.put("data", bArrA);
                contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
                contentValues.put("elapsed_time", Long.valueOf(qVar.e));
                mVar = this;
                str4 = str;
            }
            listI = bVar.i();
            mVar = this;
            str4 = str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    public final f2 P(String str) throws Throwable {
        Throwable th;
        SQLiteException e;
        s1 s1Var = (s1) this.e;
        com.google.android.gms.common.internal.x.g(str);
        v();
        w();
        ?? RawQuery = {str};
        ?? r2 = 0;
        f2VarC = null;
        f2VarC = null;
        f2 f2VarC = null;
        try {
            try {
                RawQuery = m0().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", RawQuery);
                try {
                    if (RawQuery.moveToFirst()) {
                        f2VarC = f2.c(RawQuery.getInt(1), RawQuery.getString(0));
                    } else {
                        x0 x0Var = s1Var.C;
                        s1.m(x0Var);
                        x0Var.K.a("No data found");
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    x0 x0Var2 = s1Var.C;
                    s1.m(x0Var2);
                    x0Var2.C.b(e, "Error querying database.");
                    if (RawQuery != 0) {
                    }
                    if (f2VarC == null) {
                        return f2.c;
                    }
                    return f2VarC;
                }
            } catch (SQLiteException e3) {
                e = e3;
                RawQuery = 0;
            } catch (Throwable th2) {
                th = th2;
                if (r2 != 0) {
                    r2.close();
                }
                throw th;
            }
            RawQuery.close();
            if (f2VarC == null) {
                return f2.c;
            }
            return f2VarC;
        } catch (Throwable th3) {
            th = th3;
            r2 = RawQuery;
            if (r2 != 0) {
                r2.close();
            }
            throw th;
        }
    }

    public final void Q(String str, a4 a4Var) {
        v();
        w();
        com.google.android.gms.common.internal.x.d(str);
        s1 s1Var = (s1) this.e;
        com.google.android.gms.common.util.a aVar = s1Var.H;
        x0 x0Var = s1Var.C;
        aVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        g0 g0Var = h0.u0;
        long jLongValue = jCurrentTimeMillis - ((Long) g0Var.a(null)).longValue();
        long j = a4Var.y;
        if (j < jLongValue || j > ((Long) g0Var.a(null)).longValue() + jCurrentTimeMillis) {
            s1.m(x0Var);
            x0Var.F.d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", x0.D(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j));
        }
        s1.m(x0Var);
        x0Var.K.a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", a4Var.e);
        contentValues.put("source", Integer.valueOf(a4Var.z));
        contentValues.put("timestamp_millis", Long.valueOf(j));
        try {
            if (m0().insert("trigger_uris", null, contentValues) == -1) {
                s1.m(x0Var);
                x0Var.C.b(x0.D(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e) {
            s1.m(x0Var);
            x0Var.C.c(x0.D(str), e, "Error storing trigger URI. appId");
        }
    }

    public final long R(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = m0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                x0 x0Var = ((s1) this.e).C;
                s1.m(x0Var);
                x0Var.C.c(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long S(String str, String[] strArr, long j) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m0().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                x0 x0Var = ((s1) this.e).C;
                s1.m(x0Var);
                x0Var.C.c(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    public final String T(String str, String[] strArr) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return "";
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e) {
                x0 x0Var = ((s1) this.e).C;
                s1.m(x0Var);
                x0Var.C.c(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th;
    }

    public final void U(ContentValues contentValues) {
        s1 s1Var = (s1) this.e;
        try {
            SQLiteDatabase sQLiteDatabaseM0 = m0();
            String asString = contentValues.getAsString("app_id");
            if (asString == null) {
                x0 x0Var = s1Var.C;
                s1.m(x0Var);
                x0Var.E.b(x0.D("app_id"), "Value of the primary key is not set.");
                return;
            }
            StringBuilder sb = new StringBuilder(10);
            sb.append("app_id = ?");
            if (sQLiteDatabaseM0.update("consent_settings", contentValues, sb.toString(), new String[]{asString}) == 0 && sQLiteDatabaseM0.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                x0 x0Var2 = s1Var.C;
                s1.m(x0Var2);
                x0Var2.C.c(x0.D("consent_settings"), x0.D("app_id"), "Failed to insert/update table (got -1). key");
            }
        } catch (SQLiteException e) {
            x0 x0Var3 = s1Var.C;
            s1.m(x0Var3);
            x0Var3.C.d("Error storing into table. key", x0.D("consent_settings"), x0.D("app_id"), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x012d  */
    public final r V(String str, String str2, String str3) throws Throwable {
        Cursor cursorQuery;
        Boolean boolValueOf;
        s1 s1Var = (s1) this.e;
        com.google.android.gms.common.internal.x.d(str2);
        com.google.android.gms.common.internal.x.d(str3);
        v();
        w();
        Cursor cursor = null;
        try {
            cursorQuery = m0().query(str, (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j = cursorQuery.getLong(0);
                        long j2 = cursorQuery.getLong(1);
                        long j3 = cursorQuery.getLong(2);
                        long j4 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                        Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                        Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                        Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                        if (cursorQuery.isNull(7)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                        }
                        r rVar = new r(str2, str3, j, j2, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j3, j4, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                        if (cursorQuery.moveToNext()) {
                            x0 x0Var = s1Var.C;
                            s1.m(x0Var);
                            x0Var.C.b(x0.D(str2), "Got multiple records for event aggregates, expected one. appId");
                        }
                        cursorQuery.close();
                        return rVar;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e) {
                e = e;
                x0 x0Var2 = s1Var.C;
                s1.m(x0Var2);
                x0Var2.C.d("Error querying events. appId", x0.D(str2), s1Var.G.a(str3), e);
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final void W(String str, r rVar) {
        s1 s1Var = (s1) this.e;
        com.google.android.gms.common.internal.x.g(rVar);
        v();
        w();
        ContentValues contentValues = new ContentValues();
        String str2 = rVar.a;
        contentValues.put("app_id", str2);
        contentValues.put("name", rVar.b);
        contentValues.put("lifetime_count", Long.valueOf(rVar.c));
        contentValues.put("current_bundle_count", Long.valueOf(rVar.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(rVar.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(rVar.g));
        contentValues.put("last_bundled_day", rVar.h);
        contentValues.put("last_sampled_complex_event_id", rVar.i);
        contentValues.put("last_sampling_rate", rVar.j);
        contentValues.put("current_session_count", Long.valueOf(rVar.e));
        Boolean bool = rVar.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (m0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                x0 x0Var = s1Var.C;
                s1.m(x0Var);
                x0Var.C.b(x0.D(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e) {
            x0 x0Var2 = s1Var.C;
            s1.m(x0Var2);
            x0Var2.C.c(x0.D(str2), e, "Error storing event aggregates. appId");
        }
    }

    public final void X(String str, String str2) {
        com.google.android.gms.common.internal.x.d(str2);
        v();
        w();
        try {
            m0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            x0 x0Var = ((s1) this.e).C;
            s1.m(x0Var);
            x0Var.C.c(x0.D(str2), e, "Error deleting snapshot. appId");
        }
    }

    public final m4 Y(String str, long j, byte[] bArr, String str2, String str3, int i, int i2, long j2, long j3, long j4) {
        b3 b3Var;
        s1 s1Var = (s1) this.e;
        if (TextUtils.isEmpty(str2)) {
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.J.a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            y8 y8Var = (y8) n4.g0(z8.B(), bArr);
            b3[] b3VarArrValues = b3.values();
            int length = b3VarArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    b3Var = b3.UNKNOWN;
                    break;
                }
                b3Var = b3VarArrValues[i3];
                if (b3Var.e == i) {
                    break;
                }
                i3++;
            }
            if (b3Var != b3.GOOGLE_SIGNAL && b3Var != b3.GOOGLE_SIGNAL_PENDING && i2 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((z8) y8Var.y).u()).iterator();
                while (it.hasNext()) {
                    a9 a9Var = (a9) ((b9) it.next()).l();
                    a9Var.b();
                    ((b9) a9Var.y).Y0(i2);
                    arrayList.add((b9) a9Var.d());
                }
                y8Var.b();
                ((z8) y8Var.y).G();
                y8Var.b();
                ((z8) y8Var.y).F(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                for (String str4 : str3.split("\r\n")) {
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit = str4.split("=", 2);
                    if (strArrSplit.length != 2) {
                        x0 x0Var2 = s1Var.C;
                        s1.m(x0Var2);
                        x0Var2.C.b(str4, "Invalid upload header: ");
                        break;
                    }
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            return new m4(j, (z8) y8Var.d(), str2, map, b3Var, j2, j3, j4, i2);
        } catch (IOException e) {
            x0 x0Var3 = s1Var.C;
            s1.m(x0Var3);
            x0Var3.C.c(str, e, "Failed to queued MeasurementBatch from upload_queue. appId");
            return null;
        }
    }

    public final String Z() {
        ((s1) this.e).H.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Long l = (Long) h0.S.a(null);
        l.getClass();
        String str = "(upload_type = 1 AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + l + ")";
        String strN = androidx.privacysandbox.ads.adservices.java.internal.a.n(((Long) h0.R.a(null)).longValue(), ")", androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.m(jCurrentTimeMillis, "(upload_type != 1 AND ABS(creation_timestamp - ", ") > "));
        StringBuilder sb = new StringBuilder(str.length() + 5 + strN.length() + 1);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.y(sb, "(", str, " OR ", strN);
        sb.append(")");
        return sb.toString();
    }

    public final void b0(String str, f2 f2Var) {
        com.google.android.gms.common.internal.x.g(str);
        com.google.android.gms.common.internal.x.g(f2Var);
        v();
        w();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", f2Var.g());
        contentValues.put("consent_source", Integer.valueOf(f2Var.b));
        U(contentValues);
    }

    public final List c0(String str) {
        List list;
        String string;
        s1 s1Var = (s1) this.e;
        v();
        w();
        ArrayList arrayList = new ArrayList();
        try {
            SQLiteDatabase sQLiteDatabaseM0 = m0();
            sQLiteDatabaseM0.beginTransaction();
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = sQLiteDatabaseM0.query("diagnostic_signals", new String[]{"signal_name", "metadata", "count"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                    if (cursorQuery.moveToFirst()) {
                        boolean zIsEmpty = str.isEmpty();
                        do {
                            String string2 = cursorQuery.getString(0);
                            if (cursorQuery.isNull(1)) {
                                string = "";
                            } else {
                                string = cursorQuery.getString(1);
                                com.google.android.gms.common.internal.x.g(string);
                            }
                            if (string2 == null) {
                                x0 x0Var = s1Var.C;
                                s1.m(x0Var);
                                x0Var.C.b(x0.D(str), "Read null value from diagnostic signals table, ignoring it. appId");
                            } else {
                                long j = cursorQuery.getLong(2);
                                c7 c7VarU = d7.u();
                                c7VarU.b();
                                ((d7) c7VarU.y).v(string2);
                                c7VarU.b();
                                ((d7) c7VarU.y).y(j);
                                c7VarU.b();
                                ((d7) c7VarU.y).x(string);
                                if (zIsEmpty) {
                                    c7VarU.b();
                                    ((d7) c7VarU.y).w();
                                }
                                arrayList.add((d7) c7VarU.d());
                            }
                        } while (cursorQuery.moveToNext());
                        sQLiteDatabaseM0.delete("diagnostic_signals", "app_id=?", new String[]{str});
                        sQLiteDatabaseM0.setTransactionSuccessful();
                        list = arrayList;
                    } else {
                        sQLiteDatabaseM0.setTransactionSuccessful();
                    }
                } catch (SQLiteException e) {
                    x0 x0Var2 = s1Var.C;
                    s1.m(x0Var2);
                    x0Var2.C.c(x0.D(str), e, "Error querying or deleting diagnostic signals. appId");
                    list = Collections.EMPTY_LIST;
                }
                if (cursorQuery != null) {
                    list = arrayList;
                    cursorQuery.close();
                }
                list = arrayList;
                sQLiteDatabaseM0.endTransaction();
                return list;
            } catch (Throwable th) {
                if (0 != 0) {
                    cursorQuery.close();
                }
                sQLiteDatabaseM0.endTransaction();
                throw th;
            }
        } catch (SQLiteException e2) {
            x0 x0Var3 = s1Var.C;
            s1.m(x0Var3);
            x0Var3.C.c(x0.D(str), e2, "Error opening database for diagnostic signals. appId");
            return Collections.EMPTY_LIST;
        }
    }

    public final void d0(String str, f2 f2Var) {
        com.google.android.gms.common.internal.x.g(str);
        v();
        w();
        b0(str, P(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", f2Var.g());
        U(contentValues);
    }

    public final f2 e0(String str) {
        com.google.android.gms.common.internal.x.g(str);
        v();
        w();
        return f2.c(100, T("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    public final r f0(String str, t8 t8Var, String str2) throws Throwable {
        r rVarV = V("events", str, t8Var.z());
        if (rVarV != null) {
            long j = rVarV.e + 1;
            long j2 = rVarV.d + 1;
            return new r(rVarV.a, rVarV.b, rVarV.c + 1, j2, j, rVarV.f, rVarV.g, rVarV.h, rVarV.i, rVarV.j, rVarV.k);
        }
        s1 s1Var = (s1) this.e;
        x0 x0Var = s1Var.C;
        s1.m(x0Var);
        x0Var.F.c(x0.D(str), s1Var.G.a(str2), "Event aggregate wasn't created during raw event logging. appId, event");
        return new r(str, t8Var.z(), 1L, 1L, 1L, t8Var.B(), 0L, null, null, null, null);
    }

    public final boolean g0() {
        return ((s1) this.e).e.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00f0 A[Catch: all -> 0x007a, SQLiteException -> 0x007d, TryCatch #3 {all -> 0x007a, blocks: (B:3:0x0018, B:8:0x002c, B:14:0x004a, B:15:0x0066, B:18:0x006e, B:19:0x0072, B:40:0x00ca, B:42:0x00f0, B:43:0x0102, B:44:0x0106, B:45:0x0116, B:47:0x011c, B:48:0x012c, B:60:0x015a, B:63:0x0162, B:64:0x016d, B:66:0x018d, B:67:0x019b, B:68:0x01a5, B:73:0x01e3, B:72:0x01d3, B:76:0x01ea, B:53:0x0147, B:78:0x01fc, B:82:0x020f, B:11:0x003e, B:29:0x0089, B:31:0x008f, B:35:0x009e, B:38:0x00c2, B:32:0x0094), top: B:89:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0102 A[Catch: all -> 0x007a, SQLiteException -> 0x007d, TRY_LEAVE, TryCatch #3 {all -> 0x007a, blocks: (B:3:0x0018, B:8:0x002c, B:14:0x004a, B:15:0x0066, B:18:0x006e, B:19:0x0072, B:40:0x00ca, B:42:0x00f0, B:43:0x0102, B:44:0x0106, B:45:0x0116, B:47:0x011c, B:48:0x012c, B:60:0x015a, B:63:0x0162, B:64:0x016d, B:66:0x018d, B:67:0x019b, B:68:0x01a5, B:73:0x01e3, B:72:0x01d3, B:76:0x01ea, B:53:0x0147, B:78:0x01fc, B:82:0x020f, B:11:0x003e, B:29:0x0089, B:31:0x008f, B:35:0x009e, B:38:0x00c2, B:32:0x0094), top: B:89:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x011c A[Catch: all -> 0x007a, SQLiteException -> 0x007d, TryCatch #3 {all -> 0x007a, blocks: (B:3:0x0018, B:8:0x002c, B:14:0x004a, B:15:0x0066, B:18:0x006e, B:19:0x0072, B:40:0x00ca, B:42:0x00f0, B:43:0x0102, B:44:0x0106, B:45:0x0116, B:47:0x011c, B:48:0x012c, B:60:0x015a, B:63:0x0162, B:64:0x016d, B:66:0x018d, B:67:0x019b, B:68:0x01a5, B:73:0x01e3, B:72:0x01d3, B:76:0x01ea, B:53:0x0147, B:78:0x01fc, B:82:0x020f, B:11:0x003e, B:29:0x0089, B:31:0x008f, B:35:0x009e, B:38:0x00c2, B:32:0x0094), top: B:89:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0141  */
    /* JADX WARN: Code duplicated, block: B:52:0x0145  */
    /* JADX WARN: Code duplicated, block: B:53:0x0147 A[Catch: all -> 0x007a, SQLiteException -> 0x007d, TryCatch #3 {all -> 0x007a, blocks: (B:3:0x0018, B:8:0x002c, B:14:0x004a, B:15:0x0066, B:18:0x006e, B:19:0x0072, B:40:0x00ca, B:42:0x00f0, B:43:0x0102, B:44:0x0106, B:45:0x0116, B:47:0x011c, B:48:0x012c, B:60:0x015a, B:63:0x0162, B:64:0x016d, B:66:0x018d, B:67:0x019b, B:68:0x01a5, B:73:0x01e3, B:72:0x01d3, B:76:0x01ea, B:53:0x0147, B:78:0x01fc, B:82:0x020f, B:11:0x003e, B:29:0x0089, B:31:0x008f, B:35:0x009e, B:38:0x00c2, B:32:0x0094), top: B:89:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0150  */
    /* JADX WARN: Code duplicated, block: B:61:0x015f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0161  */
    /* JADX WARN: Code duplicated, block: B:66:0x018d A[Catch: all -> 0x007a, SQLiteException -> 0x007d, LOOP:0: B:66:0x018d->B:101:?, LOOP_START, TRY_LEAVE, TryCatch #3 {all -> 0x007a, blocks: (B:3:0x0018, B:8:0x002c, B:14:0x004a, B:15:0x0066, B:18:0x006e, B:19:0x0072, B:40:0x00ca, B:42:0x00f0, B:43:0x0102, B:44:0x0106, B:45:0x0116, B:47:0x011c, B:48:0x012c, B:60:0x015a, B:63:0x0162, B:64:0x016d, B:66:0x018d, B:67:0x019b, B:68:0x01a5, B:73:0x01e3, B:72:0x01d3, B:76:0x01ea, B:53:0x0147, B:78:0x01fc, B:82:0x020f, B:11:0x003e, B:29:0x0089, B:31:0x008f, B:35:0x009e, B:38:0x00c2, B:32:0x0094), top: B:89:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01e3 A[Catch: all -> 0x007a, SQLiteException -> 0x007d, TryCatch #3 {all -> 0x007a, blocks: (B:3:0x0018, B:8:0x002c, B:14:0x004a, B:15:0x0066, B:18:0x006e, B:19:0x0072, B:40:0x00ca, B:42:0x00f0, B:43:0x0102, B:44:0x0106, B:45:0x0116, B:47:0x011c, B:48:0x012c, B:60:0x015a, B:63:0x0162, B:64:0x016d, B:66:0x018d, B:67:0x019b, B:68:0x01a5, B:73:0x01e3, B:72:0x01d3, B:76:0x01ea, B:53:0x0147, B:78:0x01fc, B:82:0x020f, B:11:0x003e, B:29:0x0089, B:31:0x008f, B:35:0x009e, B:38:0x00c2, B:32:0x0094), top: B:89:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01ea A[Catch: all -> 0x007a, SQLiteException -> 0x007d, TryCatch #3 {all -> 0x007a, blocks: (B:3:0x0018, B:8:0x002c, B:14:0x004a, B:15:0x0066, B:18:0x006e, B:19:0x0072, B:40:0x00ca, B:42:0x00f0, B:43:0x0102, B:44:0x0106, B:45:0x0116, B:47:0x011c, B:48:0x012c, B:60:0x015a, B:63:0x0162, B:64:0x016d, B:66:0x018d, B:67:0x019b, B:68:0x01a5, B:73:0x01e3, B:72:0x01d3, B:76:0x01ea, B:53:0x0147, B:78:0x01fc, B:82:0x020f, B:11:0x003e, B:29:0x0089, B:31:0x008f, B:35:0x009e, B:38:0x00c2, B:32:0x0094), top: B:89:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void h0(String str, long j, long j2, f1 f1Var) {
        ?? IsEmpty;
        ?? string;
        String str2;
        String[] strArr;
        String string2;
        ?? r4;
        long jS;
        long j3;
        String str3;
        String[] strArr2;
        long j4;
        s8 s8Var;
        s1 s1Var = (s1) this.e;
        v();
        w();
        Cursor cursorRawQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM0 = m0();
                IsEmpty = TextUtils.isEmpty(str);
                String str4 = "";
                if (IsEmpty != 0) {
                    String[] strArr3 = j2 != -1 ? new String[]{String.valueOf(j2), String.valueOf(j)} : new String[]{String.valueOf(j)};
                    str4 = j2 != -1 ? "rowid <= ? and " : "";
                    StringBuilder sb = new StringBuilder(str4.length() + Token.EXPR_RESULT);
                    sb.append("select app_id, metadata_fingerprint from raw_events where ");
                    sb.append(str4);
                    sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                    cursorRawQuery = sQLiteDatabaseM0.rawQuery(sb.toString(), strArr3);
                    try {
                        if (cursorRawQuery.moveToFirst()) {
                            string = cursorRawQuery.getString(0);
                            try {
                                string2 = cursorRawQuery.getString(1);
                                cursorRawQuery.close();
                                r4 = string;
                                cursorRawQuery = sQLiteDatabaseM0.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r4, string2}, null, null, "rowid", "2");
                                if (cursorRawQuery.moveToFirst()) {
                                    try {
                                        b9 b9Var = (b9) ((a9) n4.g0(b9.Z(), cursorRawQuery.getBlob(0))).d();
                                        if (cursorRawQuery.moveToNext()) {
                                            x0 x0Var = s1Var.C;
                                            s1.m(x0Var);
                                            x0Var.F.b(x0.D(r4), "Get multiple raw event metadata records, expected one. appId");
                                        }
                                        cursorRawQuery.close();
                                        f1Var.y = b9Var;
                                        jS = S("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r4, string2}, -1L);
                                        if (j2 == -1) {
                                            if (jS != -1) {
                                                j3 = -1;
                                            } else {
                                                strArr2 = new String[]{r4, string2};
                                                str3 = "app_id = ? and metadata_fingerprint = ?";
                                            }
                                            cursorRawQuery = sQLiteDatabaseM0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                            if (cursorRawQuery.moveToFirst()) {
                                                do {
                                                    j4 = cursorRawQuery.getLong(0);
                                                    byte[] blob = cursorRawQuery.getBlob(3);
                                                    long j5 = cursorRawQuery.getLong(4);
                                                    try {
                                                        s8Var = (s8) n4.g0(t8.K(), blob);
                                                        s8Var.n(cursorRawQuery.getString(1));
                                                        long j6 = cursorRawQuery.getLong(2);
                                                        s8Var.b();
                                                        ((t8) s8Var.y).R(j6);
                                                        s8Var.b();
                                                        ((t8) s8Var.y).u(j5);
                                                        if (!f1Var.e(j4, (t8) s8Var.d())) {
                                                            break;
                                                        }
                                                    } catch (IOException e) {
                                                        x0 x0Var2 = s1Var.C;
                                                        s1.m(x0Var2);
                                                        x0Var2.C.c(x0.D(r4), e, "Data loss. Failed to merge raw event. appId");
                                                    }
                                                } while (cursorRawQuery.moveToNext());
                                            } else {
                                                x0 x0Var3 = s1Var.C;
                                                s1.m(x0Var3);
                                                x0Var3.F.b(x0.D(r4), "Raw event data disappeared while in transaction. appId");
                                            }
                                        } else {
                                            j3 = j2;
                                        }
                                        if (j3 == -1 && jS != -1) {
                                            jS = Math.min(j3, jS);
                                        } else if (j3 != -1) {
                                            jS = j3;
                                        }
                                        str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr2 = new String[]{r4, string2, String.valueOf(jS)};
                                        cursorRawQuery = sQLiteDatabaseM0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                        if (cursorRawQuery.moveToFirst()) {
                                            do {
                                                j4 = cursorRawQuery.getLong(0);
                                                byte[] blob2 = cursorRawQuery.getBlob(3);
                                                long j7 = cursorRawQuery.getLong(4);
                                                s8Var = (s8) n4.g0(t8.K(), blob2);
                                                s8Var.n(cursorRawQuery.getString(1));
                                                long j8 = cursorRawQuery.getLong(2);
                                                s8Var.b();
                                                ((t8) s8Var.y).R(j8);
                                                s8Var.b();
                                                ((t8) s8Var.y).u(j7);
                                                if (!f1Var.e(j4, (t8) s8Var.d())) {
                                                    break;
                                                    break;
                                                }
                                            } while (cursorRawQuery.moveToNext());
                                        } else {
                                            x0 x0Var4 = s1Var.C;
                                            s1.m(x0Var4);
                                            x0Var4.F.b(x0.D(r4), "Raw event data disappeared while in transaction. appId");
                                        }
                                    } catch (IOException e2) {
                                        x0 x0Var5 = s1Var.C;
                                        s1.m(x0Var5);
                                        x0Var5.C.c(x0.D(r4), e2, "Data loss. Failed to merge raw event metadata. appId");
                                    }
                                } else {
                                    x0 x0Var6 = s1Var.C;
                                    s1.m(x0Var6);
                                    x0Var6.C.b(x0.D(r4), "Raw event metadata record is missing. appId");
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                x0 x0Var7 = s1Var.C;
                                s1.m(x0Var7);
                                x0Var7.C.c(x0.D(string), e, "Data loss. Error selecting raw event. appId");
                            }
                        }
                    } catch (SQLiteException e4) {
                        e = e4;
                        string = str;
                    }
                } else {
                    try {
                        if (j2 != -1) {
                            String str5 = str;
                            strArr = new String[]{str5, String.valueOf(j2)};
                            IsEmpty = str5;
                        } else {
                            str2 = str;
                            strArr = new String[]{str2};
                        }
                        if (j2 != -1) {
                            IsEmpty = str2;
                            str4 = " and rowid <= ?";
                        }
                        IsEmpty = str2;
                        StringBuilder sb2 = new StringBuilder(str4.length() + 84);
                        sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
                        sb2.append(str4);
                        sb2.append(" order by rowid limit 1;");
                        cursorRawQuery = sQLiteDatabaseM0.rawQuery(sb2.toString(), strArr);
                        if (cursorRawQuery.moveToFirst()) {
                            string2 = cursorRawQuery.getString(0);
                            cursorRawQuery.close();
                            r4 = IsEmpty;
                            cursorRawQuery = sQLiteDatabaseM0.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r4, string2}, null, null, "rowid", "2");
                            if (cursorRawQuery.moveToFirst()) {
                                x0 x0Var8 = s1Var.C;
                                s1.m(x0Var8);
                                x0Var8.C.b(x0.D(r4), "Raw event metadata record is missing. appId");
                            } else {
                                b9 b9Var2 = (b9) ((a9) n4.g0(b9.Z(), cursorRawQuery.getBlob(0))).d();
                                if (cursorRawQuery.moveToNext()) {
                                    x0 x0Var9 = s1Var.C;
                                    s1.m(x0Var9);
                                    x0Var9.F.b(x0.D(r4), "Get multiple raw event metadata records, expected one. appId");
                                }
                                cursorRawQuery.close();
                                f1Var.y = b9Var2;
                                jS = S("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r4, string2}, -1L);
                                if (j2 == -1) {
                                    if (jS != -1) {
                                        j3 = -1;
                                    } else {
                                        strArr2 = new String[]{r4, string2};
                                        str3 = "app_id = ? and metadata_fingerprint = ?";
                                    }
                                    cursorRawQuery = sQLiteDatabaseM0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                    if (cursorRawQuery.moveToFirst()) {
                                        do {
                                            j4 = cursorRawQuery.getLong(0);
                                            byte[] blob3 = cursorRawQuery.getBlob(3);
                                            long j9 = cursorRawQuery.getLong(4);
                                            s8Var = (s8) n4.g0(t8.K(), blob3);
                                            s8Var.n(cursorRawQuery.getString(1));
                                            long j10 = cursorRawQuery.getLong(2);
                                            s8Var.b();
                                            ((t8) s8Var.y).R(j10);
                                            s8Var.b();
                                            ((t8) s8Var.y).u(j9);
                                            if (!f1Var.e(j4, (t8) s8Var.d())) {
                                                break;
                                                break;
                                            }
                                        } while (cursorRawQuery.moveToNext());
                                    } else {
                                        x0 x0Var10 = s1Var.C;
                                        s1.m(x0Var10);
                                        x0Var10.F.b(x0.D(r4), "Raw event data disappeared while in transaction. appId");
                                    }
                                } else {
                                    j3 = j2;
                                }
                                if (j3 == -1) {
                                    if (j3 != -1) {
                                        jS = j3;
                                    }
                                } else if (j3 != -1) {
                                    jS = j3;
                                }
                                str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                strArr2 = new String[]{r4, string2, String.valueOf(jS)};
                                cursorRawQuery = sQLiteDatabaseM0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        j4 = cursorRawQuery.getLong(0);
                                        byte[] blob4 = cursorRawQuery.getBlob(3);
                                        long j11 = cursorRawQuery.getLong(4);
                                        s8Var = (s8) n4.g0(t8.K(), blob4);
                                        s8Var.n(cursorRawQuery.getString(1));
                                        long j12 = cursorRawQuery.getLong(2);
                                        s8Var.b();
                                        ((t8) s8Var.y).R(j12);
                                        s8Var.b();
                                        ((t8) s8Var.y).u(j11);
                                        if (!f1Var.e(j4, (t8) s8Var.d())) {
                                            break;
                                            break;
                                        }
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    x0 x0Var11 = s1Var.C;
                                    s1.m(x0Var11);
                                    x0Var11.F.b(x0.D(r4), "Raw event data disappeared while in transaction. appId");
                                }
                            }
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        string = IsEmpty;
                        x0 x0Var12 = s1Var.C;
                        s1.m(x0Var12);
                        x0Var12.C.c(x0.D(string), e, "Data loss. Error selecting raw event. appId");
                    }
                }
            } finally {
                if (0 != 0) {
                    cursorRawQuery.close();
                }
            }
        } catch (SQLiteException e6) {
            e = e6;
            IsEmpty = str;
        }
    }

    public final void j0() {
        w();
        m0().beginTransaction();
    }

    public final void k0() {
        w();
        m0().setTransactionSuccessful();
    }

    public final void l0() {
        w();
        m0().endTransaction();
    }

    public final SQLiteDatabase m0() {
        v();
        try {
            return this.A.getWritableDatabase();
        } catch (SQLiteException e) {
            x0 x0Var = ((s1) this.e).C;
            s1.m(x0Var);
            x0Var.F.b(e, "Error opening database");
            throw e;
        }
    }

    public final void n0(String str) {
        r rVarV;
        X("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = m0().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (rVarV = V("events", str, string)) != null) {
                            W("events_snapshot", rVarV);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e) {
                x0 x0Var = ((s1) this.e).C;
                s1.m(x0Var);
                x0Var.C.c(x0.D(str), e, "Error creating snapshot. appId");
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0054  */
    /* JADX WARN: Code duplicated, block: B:9:0x005b  */
    public final void o0(String str) throws Throwable {
        boolean z;
        r rVarV;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        r rVarV2 = V("events", str, "_f");
        r rVarV3 = V("events", str, "_v");
        X("events", str);
        Cursor cursorQuery = null;
        boolean z2 = false;
        try {
            cursorQuery = m0().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                boolean z3 = false;
                z = false;
                do {
                    try {
                        String string = cursorQuery.getString(0);
                        if (cursorQuery.getLong(1) >= 1) {
                            if ("_f".equals(string)) {
                                z3 = true;
                            } else if ("_v".equals(string)) {
                                z = true;
                            }
                        }
                        if (string != null && (rVarV = V("events_snapshot", str, string)) != null) {
                            W("events", rVarV);
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        z2 = z3;
                        try {
                            x0 x0Var = ((s1) this.e).C;
                            s1.m(x0Var);
                            x0Var.C.c(x0.D(str), e, "Error querying snapshot. appId");
                            z3 = z2;
                        } catch (Throwable th) {
                            th = th;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (z2 && rVarV2 != null) {
                                W("events", rVarV2);
                            } else if (!z && rVarV3 != null) {
                                W("events", rVarV3);
                            }
                            X("events_snapshot", str);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = z3;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (z2) {
                            if (!z) {
                                W("events", rVarV3);
                            }
                        } else if (!z) {
                            W("events", rVarV3);
                        }
                        X("events_snapshot", str);
                        throw th;
                    }
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (!z3 && rVarV2 != null) {
                    W("events", rVarV2);
                } else if (!z && rVarV3 != null) {
                    W("events", rVarV3);
                }
            } else {
                cursorQuery.close();
                if (rVarV2 != null) {
                    W("events", rVarV2);
                } else if (rVarV3 != null) {
                    W("events", rVarV3);
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            z = false;
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
        X("events_snapshot", str);
    }

    public final void p0(String str, String str2) {
        com.google.android.gms.common.internal.x.d(str);
        com.google.android.gms.common.internal.x.d(str2);
        v();
        w();
        try {
            m0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            s1 s1Var = (s1) this.e;
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.C.d("Error deleting user property. appId", x0.D(str), s1Var.G.c(str2), e);
        }
    }

    public final boolean q0(p4 p4Var) {
        s1 s1Var = (s1) this.e;
        String str = p4Var.b;
        v();
        w();
        String str2 = p4Var.a;
        String str3 = p4Var.c;
        if (r0(str2, str3) == null) {
            if (r4.w0(str3)) {
                if (R("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(s1Var.A.E(str2, h0.V), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long jR = R("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                s1Var.getClass();
                if (jR >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(p4Var.d));
        i0(contentValues, p4Var.e);
        try {
            if (m0().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.C.b(x0.D(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e) {
            x0 x0Var2 = s1Var.C;
            s1.m(x0Var2);
            x0Var2.C.c(x0.D(str2), e, "Error storing user property. appId");
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:? A[SYNTHETIC] */
    public final p4 r0(String str, String str2) throws Throwable {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursorQuery;
        s1 s1Var = (s1) this.e;
        com.google.android.gms.common.internal.x.d(str);
        com.google.android.gms.common.internal.x.d(str2);
        v();
        w();
        Cursor cursor = null;
        try {
            cursorQuery = m0().query("user_attributes", new String[]{"set_timestamp", ES6Iterator.VALUE_PROPERTY, "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j = cursorQuery.getLong(0);
                        Object objI = I(cursorQuery, 1);
                        if (objI != null) {
                            str3 = str;
                            str4 = str2;
                            try {
                                p4 p4Var = new p4(str3, cursorQuery.getString(2), str4, j, objI);
                                if (cursorQuery.moveToNext()) {
                                    x0 x0Var = s1Var.C;
                                    s1.m(x0Var);
                                    x0Var.C.b(x0.D(str3), "Got multiple records for user property, expected one. appId");
                                }
                                cursorQuery.close();
                                return p4Var;
                            } catch (SQLiteException e) {
                                e = e;
                            }
                        }
                        sQLiteException = e;
                        x0 x0Var2 = s1Var.C;
                        s1.m(x0Var2);
                        x0Var2.C.d("Error querying user property. appId", x0.D(str3), s1Var.G.c(str4), sQLiteException);
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    str3 = str;
                    str4 = str2;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    throw th;
                }
                cursor.close();
                throw th;
            }
        } catch (SQLiteException e3) {
            str3 = str;
            str4 = str2;
            sQLiteException = e3;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                throw th;
            }
            cursor.close();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List s0(String str) {
        String str2;
        s1 s1Var = (s1) this.e;
        com.google.android.gms.common.internal.x.d(str);
        v();
        w();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                s1Var.getClass();
                cursorQuery = m0().query("user_attributes", new String[]{"name", "origin", "set_timestamp", ES6Iterator.VALUE_PROPERTY}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                try {
                    if (cursorQuery.moveToFirst()) {
                        while (true) {
                            String string = cursorQuery.getString(0);
                            String string2 = cursorQuery.getString(1);
                            if (string2 == null) {
                                string2 = "";
                            }
                            String str3 = string2;
                            long j = cursorQuery.getLong(2);
                            Object objI = I(cursorQuery, 3);
                            if (objI == null) {
                                x0 x0Var = s1Var.C;
                                s1.m(x0Var);
                                x0Var.C.b(x0.D(str), "Read invalid user property value, ignoring it. appId");
                                str2 = str;
                            } else {
                                str2 = str;
                                arrayList.add(new p4(str2, str3, string, j, objI));
                            }
                            try {
                                if (!cursorQuery.moveToNext()) {
                                    break;
                                }
                                str = str2;
                            } catch (SQLiteException e) {
                                e = e;
                                x0 x0Var2 = s1Var.C;
                                s1.m(x0Var2);
                                x0Var2.C.c(x0.D(str2), e, "Error querying user properties. appId");
                                arrayList = Collections.EMPTY_LIST;
                            }
                        }
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    str2 = str;
                }
            } catch (SQLiteException e3) {
                e = e3;
                str2 = str;
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x012e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0135  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    public final List t0(String str, String str2, String str3) throws Throwable {
        Cursor cursor;
        String str4;
        String str5;
        s1 s1Var = (s1) this.e;
        com.google.android.gms.common.internal.x.d(str);
        v();
        w();
        ?? arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList(3);
            String str6 = str;
            arrayList2.add(str6);
            StringBuilder sb = new StringBuilder("app_id=?");
            if (!TextUtils.isEmpty(str2)) {
                arrayList2.add(str2);
                sb.append(" and origin=?");
            }
            if (!TextUtils.isEmpty(str3)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1);
                sb2.append(str3);
                sb2.append("*");
                arrayList2.add(sb2.toString());
                sb.append(" and name glob ?");
            }
            String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            SQLiteDatabase sQLiteDatabaseM0 = m0();
            String[] strArr2 = {"name", "set_timestamp", ES6Iterator.VALUE_PROPERTY, "origin"};
            String string = sb.toString();
            s1Var.getClass();
            x0 x0Var = s1Var.C;
            Cursor cursorQuery = sQLiteDatabaseM0.query("user_attributes", strArr2, string, strArr, null, null, "rowid", "1001");
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        str4 = str2;
                        while (true) {
                            try {
                                if (arrayList.size() >= 1000) {
                                    s1.m(x0Var);
                                    x0Var.C.b(1000, "Read more than the max allowed user properties, ignoring excess");
                                    break;
                                }
                                String string2 = cursorQuery.getString(0);
                                long j = cursorQuery.getLong(1);
                                Object objI = I(cursorQuery, 2);
                                String string3 = cursorQuery.getString(3);
                                if (objI == null) {
                                    try {
                                        s1.m(x0Var);
                                        x0Var.C.d("(2)Read invalid user property value, ignoring it", x0.D(str6), string3, str3);
                                        str5 = string3;
                                    } catch (SQLiteException e) {
                                        e = e;
                                        str5 = string3;
                                        cursor = cursorQuery;
                                        str4 = str5;
                                        try {
                                            x0 x0Var2 = s1Var.C;
                                            s1.m(x0Var2);
                                            x0Var2.C.d("(2)Error querying user properties", x0.D(str), str4, e);
                                            arrayList = Collections.EMPTY_LIST;
                                            cursorQuery = cursor;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            return arrayList;
                                        } catch (Throwable th) {
                                            th = th;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    str5 = string3;
                                    arrayList.add(new p4(str, str5, string2, j, objI));
                                }
                                try {
                                    if (!cursorQuery.moveToNext()) {
                                        break;
                                    }
                                    str6 = str;
                                    str4 = str5;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    cursor = cursorQuery;
                                    str4 = str5;
                                    x0 x0Var3 = s1Var.C;
                                    s1.m(x0Var3);
                                    x0Var3.C.d("(2)Error querying user properties", x0.D(str), str4, e);
                                    arrayList = Collections.EMPTY_LIST;
                                    cursorQuery = cursor;
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                cursor = cursorQuery;
                                x0 x0Var4 = s1Var.C;
                                s1.m(x0Var4);
                                x0Var4.C.d("(2)Error querying user properties", x0.D(str), str4, e);
                                arrayList = Collections.EMPTY_LIST;
                                cursorQuery = cursor;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                return arrayList;
                            }
                        }
                    }
                } catch (SQLiteException e4) {
                    e = e4;
                    str4 = str2;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e5) {
            e = e5;
            str4 = str2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    public final boolean u0(e eVar) {
        s1 s1Var = (s1) this.e;
        v();
        w();
        String str = eVar.e;
        com.google.android.gms.common.internal.x.g(str);
        if (r0(str, eVar.z.y) == null) {
            long jR = R("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            s1Var.getClass();
            if (jR >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", eVar.y);
        contentValues.put("name", eVar.z.y);
        Object objD = eVar.z.d();
        com.google.android.gms.common.internal.x.g(objD);
        i0(contentValues, objD);
        contentValues.put("active", Boolean.valueOf(eVar.B));
        contentValues.put("trigger_event_name", eVar.C);
        contentValues.put("trigger_timeout", Long.valueOf(eVar.E));
        u uVar = eVar.D;
        r4 r4Var = s1Var.F;
        x0 x0Var = s1Var.C;
        s1.k(r4Var);
        contentValues.put("timed_out_event", r4.f0(uVar));
        contentValues.put("creation_timestamp", Long.valueOf(eVar.A));
        s1.k(r4Var);
        contentValues.put("triggered_event", r4.f0(eVar.F));
        contentValues.put("triggered_timestamp", Long.valueOf(eVar.z.z));
        contentValues.put("time_to_live", Long.valueOf(eVar.G));
        contentValues.put("expired_event", r4.f0(eVar.H));
        try {
            if (m0().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            s1.m(x0Var);
            x0Var.C.b(x0.D(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e) {
            s1.m(x0Var);
            x0Var.C.c(x0.D(str), e, "Error storing conditional user property");
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0116  */
    /* JADX WARN: Code duplicated, block: B:39:0x011c  */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00f6: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:247), block:B:29:0x00f6 */
    public final e v0(String str, String str2) throws Throwable {
        String str3;
        Cursor cursorQuery;
        Cursor cursor;
        s1 s1Var = (s1) this.e;
        com.google.android.gms.common.internal.x.d(str);
        com.google.android.gms.common.internal.x.d(str2);
        v();
        w();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = m0().query("conditional_properties", new String[]{"origin", ES6Iterator.VALUE_PROPERTY, "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str4 = string;
                    Object objI = I(cursorQuery, 1);
                    boolean z = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j = cursorQuery.getLong(4);
                    n4 n4Var = this.y.D;
                    l4.U(n4Var);
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<u> creator = u.CREATOR;
                    u uVar = (u) n4Var.Y(blob, creator);
                    long j2 = cursorQuery.getLong(6);
                    l4.U(n4Var);
                    u uVar2 = (u) n4Var.Y(cursorQuery.getBlob(7), creator);
                    long j3 = cursorQuery.getLong(8);
                    long j4 = cursorQuery.getLong(9);
                    l4.U(n4Var);
                    str3 = str2;
                    try {
                        e eVar = new e(str, str4, new o4(j3, objI, str3, str4), j2, z, string2, uVar, j, uVar2, j4, (u) n4Var.Y(cursorQuery.getBlob(10), creator));
                        if (cursorQuery.moveToNext()) {
                            x0 x0Var = s1Var.C;
                            s1.m(x0Var);
                            x0Var.C.c(x0.D(str), s1Var.G.c(str3), "Got multiple records for conditional property, expected one");
                        }
                        cursorQuery.close();
                        return eVar;
                    } catch (SQLiteException e) {
                        e = e;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    str3 = str2;
                }
            } catch (SQLiteException e3) {
                e = e3;
                str3 = str2;
                cursorQuery = null;
            } catch (Throwable th) {
                th = th;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            cursor2 = cursor;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        x0 x0Var2 = s1Var.C;
        s1.m(x0Var2);
        x0Var2.C.d("Error querying conditional property", x0.D(str), s1Var.G.c(str3), e);
    }

    public final void w0(String str, String str2) {
        com.google.android.gms.common.internal.x.d(str);
        com.google.android.gms.common.internal.x.d(str2);
        v();
        w();
        try {
            m0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            s1 s1Var = (s1) this.e;
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.C.d("Error deleting conditional property", x0.D(str), s1Var.G.c(str2), e);
        }
    }

    public final List x0(String str, String str2, String str3) {
        com.google.android.gms.common.internal.x.d(str);
        v();
        w();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return y0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // com.google.android.gms.measurement.internal.g4
    public final void y() {
        s1 s1Var = (s1) this.e;
        if (s1Var.A.G(null, h0.e1)) {
            p1 p1Var = s1Var.D;
            s1.m(p1Var);
            p1Var.E(new androidx.appcompat.widget.z0(this, 17));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    public final List y0(String str, String[] strArr) {
        s1 s1Var = (s1) this.e;
        v();
        w();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM0 = m0();
                String[] strArr2 = {"app_id", "origin", "name", ES6Iterator.VALUE_PROPERTY, "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"};
                s1Var.getClass();
                cursorQuery = sQLiteDatabaseM0.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
                if (cursorQuery.moveToFirst()) {
                    do {
                        if (arrayList.size() >= 1000) {
                            x0 x0Var = s1Var.C;
                            s1.m(x0Var);
                            x0Var.C.b(1000, "Read more than the max allowed conditional properties, ignoring extra");
                            break;
                        }
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        String string3 = cursorQuery.getString(2);
                        Object objI = I(cursorQuery, 3);
                        boolean z = cursorQuery.getInt(4) != 0;
                        String string4 = cursorQuery.getString(5);
                        long j = cursorQuery.getLong(6);
                        n4 n4Var = this.y.D;
                        l4.U(n4Var);
                        byte[] blob = cursorQuery.getBlob(7);
                        Parcelable.Creator<u> creator = u.CREATOR;
                        u uVar = (u) n4Var.Y(blob, creator);
                        long j2 = cursorQuery.getLong(8);
                        l4.U(n4Var);
                        u uVar2 = (u) n4Var.Y(cursorQuery.getBlob(9), creator);
                        long j3 = cursorQuery.getLong(10);
                        long j4 = cursorQuery.getLong(11);
                        l4.U(n4Var);
                        arrayList.add(new e(string, string2, new o4(j3, objI, string3, string2), j2, z, string4, uVar, j, uVar2, j4, (u) n4Var.Y(cursorQuery.getBlob(12), creator)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e) {
                x0 x0Var2 = s1Var.C;
                s1.m(x0Var2);
                x0Var2.C.b(e, "Error querying conditional user property value");
                arrayList = Collections.EMPTY_LIST;
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public final long z(String str, z8 z8Var, String str2, Map map, b3 b3Var, Long l) {
        int iDelete;
        s1 s1Var = (s1) this.e;
        v();
        w();
        com.google.android.gms.common.internal.x.g(z8Var);
        com.google.android.gms.common.internal.x.d(str);
        v();
        w();
        if (g0()) {
            l4 l4Var = this.y;
            long jG = l4Var.F.C.g();
            com.google.android.gms.common.util.a aVar = s1Var.H;
            x0 x0Var = s1Var.C;
            aVar.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jG) > ((Long) h0.M.a(null)).longValue()) {
                l4Var.F.C.h(jElapsedRealtime);
                v();
                w();
                if (g0() && (iDelete = m0().delete("upload_queue", Z(), new String[0])) > 0) {
                    s1.m(x0Var);
                    x0Var.K.b(Integer.valueOf(iDelete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                com.google.android.gms.common.internal.x.d(str);
                v();
                w();
                try {
                    int iE = s1Var.A.E(str, h0.A);
                    if (iE > 0) {
                        m0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iE)});
                    }
                } catch (SQLiteException e) {
                    s1.m(x0Var);
                    x0Var.C.c(x0.D(str), e, "Error deleting over the limit queued batches. appId");
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append("=");
            sb.append(str4);
            arrayList.add(sb.toString());
        }
        byte[] bArrA = z8Var.a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrA);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", TextUtils.join("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(b3Var.e));
        com.google.android.gms.common.util.a aVar2 = s1Var.H;
        x0 x0Var2 = s1Var.C;
        aVar2.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l != null) {
            contentValues.put("associated_row_id", l);
        }
        try {
            long jInsert = m0().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            s1.m(x0Var2);
            x0Var2.C.b(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1L;
        } catch (SQLiteException e2) {
            s1.m(x0Var2);
            x0Var2.C.c(str, e2, "Error storing MeasurementBatch to upload_queue. appId");
            return -1L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x0408  */
    public final c1 z0(String str) throws Throwable {
        Cursor cursorQuery;
        Boolean boolValueOf;
        String string;
        s1 s1Var = (s1) this.e;
        com.google.android.gms.common.internal.x.d(str);
        v();
        w();
        Cursor cursor = null;
        try {
            cursorQuery = m0().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility", "last_diagnostics_signal_upload_timestamp"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        l4 l4Var = this.y;
                        c1 c1Var = new c1(l4Var.I, str);
                        s1 s1Var2 = c1Var.a;
                        f2 f2VarD = l4Var.d(str);
                        e2 e2Var = e2.ANALYTICS_STORAGE;
                        if (f2VarD.i(e2Var)) {
                            c1Var.G(cursorQuery.getString(0));
                        }
                        boolean z = true;
                        c1Var.I(cursorQuery.getString(1));
                        if (l4Var.d(str).i(e2.AD_STORAGE)) {
                            c1Var.J(cursorQuery.getString(2));
                        }
                        c1Var.e(cursorQuery.getLong(3));
                        c1Var.M(cursorQuery.getLong(4));
                        c1Var.N(cursorQuery.getLong(5));
                        c1Var.P(cursorQuery.getString(6));
                        c1Var.S(cursorQuery.getString(7));
                        c1Var.T(cursorQuery.getLong(8));
                        c1Var.a(cursorQuery.getLong(9));
                        c1Var.d(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                        c1Var.i(cursorQuery.getLong(11));
                        c1Var.j(cursorQuery.getLong(12));
                        c1Var.k(cursorQuery.getLong(13));
                        c1Var.l(cursorQuery.getLong(14));
                        c1Var.f(cursorQuery.getLong(15));
                        c1Var.g(cursorQuery.getLong(16));
                        c1Var.R(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                        c1Var.L(cursorQuery.getString(18));
                        c1Var.n(cursorQuery.getLong(19));
                        c1Var.m(cursorQuery.getLong(20));
                        c1Var.w(cursorQuery.getString(21));
                        boolean z2 = cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0;
                        p1 p1Var = s1Var2.D;
                        s1.m(p1Var);
                        p1Var.v();
                        c1Var.R |= c1Var.p != z2;
                        c1Var.p = z2;
                        c1Var.c(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                        if (!cursorQuery.isNull(26)) {
                            c1Var.y(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                        }
                        if (l4Var.d(str).i(e2Var)) {
                            String string2 = cursorQuery.getString(28);
                            p1 p1Var2 = s1Var2.D;
                            s1.m(p1Var2);
                            p1Var2.v();
                            c1Var.R |= !Objects.equals(c1Var.t, string2);
                            c1Var.t = string2;
                        }
                        boolean z3 = (cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true;
                        p1 p1Var3 = s1Var2.D;
                        s1.m(p1Var3);
                        p1Var3.v();
                        c1Var.R |= c1Var.u != z3;
                        c1Var.u = z3;
                        c1Var.r(cursorQuery.getLong(39));
                        String string3 = cursorQuery.getString(36);
                        p1 p1Var4 = s1Var2.D;
                        s1.m(p1Var4);
                        p1Var4.v();
                        c1Var.R |= c1Var.C != string3;
                        c1Var.C = string3;
                        c1Var.A(cursorQuery.getLong(30));
                        c1Var.B(cursorQuery.getLong(31));
                        com.google.android.gms.internal.measurement.g4.a();
                        if (s1Var.A.G(str, h0.O0)) {
                            int i = cursorQuery.getInt(32);
                            p1 p1Var5 = s1Var2.D;
                            s1.m(p1Var5);
                            p1Var5.v();
                            c1Var.R |= c1Var.x != i;
                            c1Var.x = i;
                            c1Var.C(cursorQuery.getLong(35));
                        }
                        boolean z4 = (cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true;
                        p1 p1Var6 = s1Var2.D;
                        s1.m(p1Var6);
                        p1Var6.v();
                        c1Var.R |= c1Var.y != z4;
                        c1Var.y = z4;
                        if (cursorQuery.isNull(34)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                        }
                        p1 p1Var7 = s1Var2.D;
                        s1.m(p1Var7);
                        p1Var7.v();
                        c1Var.R |= !Objects.equals(c1Var.q, boolValueOf);
                        c1Var.q = boolValueOf;
                        c1Var.p(cursorQuery.getInt(37));
                        c1Var.q(cursorQuery.getInt(38));
                        if (cursorQuery.isNull(40)) {
                            string = "";
                        } else {
                            string = cursorQuery.getString(40);
                            com.google.android.gms.common.internal.x.g(string);
                        }
                        p1 p1Var8 = s1Var2.D;
                        s1.m(p1Var8);
                        p1Var8.v();
                        c1Var.R |= c1Var.G != string;
                        c1Var.G = string;
                        if (!cursorQuery.isNull(41)) {
                            Long lValueOf = Long.valueOf(cursorQuery.getLong(41));
                            p1 p1Var9 = s1Var2.D;
                            s1.m(p1Var9);
                            p1Var9.v();
                            c1Var.R |= !Objects.equals(c1Var.z, lValueOf);
                            c1Var.z = lValueOf;
                        }
                        if (!cursorQuery.isNull(42)) {
                            Long lValueOf2 = Long.valueOf(cursorQuery.getLong(42));
                            p1 p1Var10 = s1Var2.D;
                            s1.m(p1Var10);
                            p1Var10.v();
                            c1Var.R |= !Objects.equals(c1Var.A, lValueOf2);
                            c1Var.A = lValueOf2;
                        }
                        byte[] blob = cursorQuery.getBlob(43);
                        p1 p1Var11 = s1Var2.D;
                        s1.m(p1Var11);
                        p1Var11.v();
                        c1Var.R |= c1Var.H != blob;
                        c1Var.H = blob;
                        if (!cursorQuery.isNull(44)) {
                            int i2 = cursorQuery.getInt(44);
                            p1 p1Var12 = s1Var2.D;
                            s1.m(p1Var12);
                            p1Var12.v();
                            boolean z5 = c1Var.R;
                            if (c1Var.I == i2) {
                                z = false;
                            }
                            c1Var.R = z | z5;
                            c1Var.I = i2;
                        }
                        if (s1Var.A.G(str, h0.j1) && !cursorQuery.isNull(45)) {
                            c1Var.u(cursorQuery.getLong(45));
                        }
                        p1 p1Var13 = s1Var2.D;
                        s1.m(p1Var13);
                        p1Var13.v();
                        c1Var.R = false;
                        if (cursorQuery.moveToNext()) {
                            x0 x0Var = s1Var.C;
                            s1.m(x0Var);
                            x0Var.C.b(x0.D(str), "Got multiple records for app, expected one. appId");
                        }
                        cursorQuery.close();
                        return c1Var;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e) {
                e = e;
                x0 x0Var2 = s1Var.C;
                s1.m(x0Var2);
                x0Var2.C.c(x0.D(str), e, "Error querying app. appId");
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }
}
