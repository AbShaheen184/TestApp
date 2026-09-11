package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends SQLiteOpenHelper {
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.compose.animation.core.j2 y;

    public l(Context context, String str) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        switch (this.e) {
            case 0:
                m mVar = (m) this.y;
                s1 s1Var = (s1) mVar.e;
                s1 s1Var2 = (s1) mVar.e;
                s1Var.getClass();
                androidx.compose.foundation.gestures.y2 y2Var = mVar.B;
                if (y2Var.y != 0) {
                    ((com.google.android.gms.common.util.a) y2Var.z).getClass();
                    if (SystemClock.elapsedRealtime() - y2Var.y < 3600000) {
                        throw new SQLiteException("Database open failed");
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    ((com.google.android.gms.common.util.a) y2Var.z).getClass();
                    y2Var.y = SystemClock.elapsedRealtime();
                    x0 x0Var = s1Var2.C;
                    s1.m(x0Var);
                    x0Var.C.a("Opening the database failed, dropping and recreating it");
                    if (!s1Var2.e.getDatabasePath("google_app_measurement.db").delete()) {
                        x0 x0Var2 = s1Var2.C;
                        s1.m(x0Var2);
                        x0Var2.C.b("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        y2Var.y = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e) {
                        x0 x0Var3 = s1Var2.C;
                        s1.m(x0Var3);
                        x0Var3.C.b(e, "Failed to open freshly created database");
                        throw e;
                    }
                }
            default:
                r0 r0Var = (r0) this.y;
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e2) {
                    throw e2;
                } catch (SQLiteException unused2) {
                    s1 s1Var3 = (s1) r0Var.e;
                    x0 x0Var4 = s1Var3.C;
                    s1.m(x0Var4);
                    x0Var4.C.a("Opening the local database failed, dropping and recreating it");
                    if (!s1Var3.e.getDatabasePath("google_app_measurement_local.db").delete()) {
                        x0 x0Var5 = s1Var3.C;
                        s1.m(x0Var5);
                        x0Var5.C.b("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e3) {
                        x0 x0Var6 = ((s1) r0Var.e).C;
                        s1.m(x0Var6);
                        x0Var6.C.b(e3, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        switch (this.e) {
            case 0:
                x0 x0Var = ((s1) ((m) this.y).e).C;
                s1.m(x0Var);
                g2.f(x0Var, sQLiteDatabase);
                break;
            default:
                x0 x0Var2 = ((s1) ((r0) this.y).e).C;
                s1.m(x0Var2);
                g2.f(x0Var2, sQLiteDatabase);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.e;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        switch (this.e) {
            case 0:
                s1 s1Var = (s1) ((m) this.y).e;
                x0 x0Var = s1Var.C;
                s1.m(x0Var);
                g2.d(x0Var, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", m.C);
                x0 x0Var2 = s1Var.C;
                s1.m(x0Var2);
                g2.d(x0Var2, sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                s1.m(x0Var2);
                g2.d(x0Var2, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                s1.m(x0Var2);
                g2.d(x0Var2, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", m.E);
                s1.m(x0Var2);
                g2.d(x0Var2, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", m.F);
                s1.m(x0Var2);
                g2.d(x0Var2, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", m.H);
                s1.m(x0Var2);
                g2.d(x0Var2, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                s1.m(x0Var2);
                g2.d(x0Var2, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", m.G);
                s1.m(x0Var2);
                g2.d(x0Var2, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", m.I);
                s1.m(x0Var2);
                g2.d(x0Var2, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", m.J);
                s1.m(x0Var2);
                g2.d(x0Var2, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                s1.m(x0Var2);
                g2.d(x0Var2, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", m.K);
                s1.m(x0Var2);
                g2.d(x0Var2, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                s1.m(x0Var2);
                g2.d(x0Var2, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                s1.m(x0Var2);
                g2.d(x0Var2, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", m.L);
                com.google.android.gms.internal.measurement.g4.a();
                s1.m(x0Var2);
                g2.d(x0Var2, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", m.M);
                s1.m(x0Var2);
                g2.d(x0Var2, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", m.D);
                s1.m(x0Var2);
                g2.d(x0Var2, sQLiteDatabase, "diagnostic_signals", "CREATE TABLE IF NOT EXISTS diagnostic_signals ( app_id TEXT NOT NULL, signal_name TEXT NOT NULL, metadata TEXT NOT NULL, count INTEGER NOT NULL, last_increment_timestamp INTEGER NOT NULL);", "app_id,signal_name,metadata,count,last_increment_timestamp", null);
                s1.m(x0Var2);
                g2.d(x0Var2, sQLiteDatabase, "no_data_mode_events", "CREATE TABLE IF NOT EXISTS no_data_mode_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, data BLOB NOT NULL, timestamp_millis INTEGER NOT NULL);", "app_id,name,data,timestamp_millis", null);
                break;
            default:
                x0 x0Var3 = ((s1) ((r0) this.y).e).C;
                s1.m(x0Var3);
                g2.d(x0Var3, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", r0.B);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(r0 r0Var, Context context) {
        this(context, "google_app_measurement_local.db");
        this.e = 1;
        this.y = r0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Context context) {
        this(context, "google_app_measurement.db");
        this.e = 0;
        this.y = mVar;
    }

    private final void a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void g(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void m(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void w(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
