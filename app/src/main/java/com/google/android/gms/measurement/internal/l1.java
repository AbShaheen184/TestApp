package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.b8;
import com.google.android.gms.internal.measurement.e7;
import com.google.android.gms.internal.measurement.f7;
import com.google.android.gms.internal.measurement.g7;
import com.google.android.gms.internal.measurement.h6;
import com.google.android.gms.internal.measurement.h7;
import com.google.android.gms.internal.measurement.i7;
import com.google.android.gms.internal.measurement.j7;
import com.google.android.gms.internal.measurement.m7;
import com.google.android.gms.internal.measurement.m9;
import com.google.android.gms.internal.measurement.n7;
import com.google.android.gms.internal.measurement.n9;
import com.google.android.gms.internal.measurement.p7;
import com.google.android.gms.internal.measurement.s5;
import com.google.android.gms.internal.measurement.s7;
import com.google.android.gms.internal.measurement.t5;
import com.google.android.gms.internal.measurement.t7;
import com.google.android.gms.internal.measurement.u7;
import com.google.android.gms.internal.measurement.v7;
import com.google.android.gms.internal.measurement.w7;
import com.google.android.gms.internal.measurement.x7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends g4 implements f {
    public final androidx.collection.f A;
    public final androidx.collection.f B;
    public final androidx.collection.f C;
    public final androidx.collection.f D;
    public final androidx.collection.f E;
    public final androidx.collection.f F;
    public final androidx.collection.f G;
    public final androidx.room.coroutines.i H;
    public final androidx.media3.exoplayer.dash.manifest.t I;
    public final androidx.collection.f J;
    public final androidx.collection.f K;
    public final androidx.collection.f L;

    public l1(l4 l4Var) {
        super(l4Var);
        this.A = new androidx.collection.f(0);
        this.B = new androidx.collection.f(0);
        this.C = new androidx.collection.f(0);
        this.D = new androidx.collection.f(0);
        this.E = new androidx.collection.f(0);
        this.F = new androidx.collection.f(0);
        this.J = new androidx.collection.f(0);
        this.K = new androidx.collection.f(0);
        this.L = new androidx.collection.f(0);
        this.G = new androidx.collection.f(0);
        this.H = new androidx.room.coroutines.i(this);
        this.I = new androidx.media3.exoplayer.dash.manifest.t(this, 24);
    }

    public static final androidx.collection.f F(x7 x7Var) {
        androidx.collection.f fVar = new androidx.collection.f(0);
        for (b8 b8Var : x7Var.y()) {
            fVar.put(b8Var.u(), b8Var.v());
        }
        return fVar;
    }

    public static final e2 G(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return e2.AD_STORAGE;
        }
        if (i2 == 2) {
            return e2.ANALYTICS_STORAGE;
        }
        if (i2 == 3) {
            return e2.AD_USER_DATA;
        }
        if (i2 != 4) {
            return null;
        }
        return e2.AD_PERSONALIZATION;
    }

    public final boolean A(String str) {
        v();
        B(str);
        s7 s7VarR = R(str);
        if (s7VarR == null) {
            return false;
        }
        for (p7 p7Var : s7VarR.u()) {
            if (p7Var.u() == 3 && p7Var.w() == 3) {
                return true;
            }
        }
        return false;
    }

    public final void B(String str) {
        w();
        v();
        com.google.android.gms.common.internal.x.d(str);
        androidx.collection.f fVar = this.F;
        if (fVar.get(str) == null) {
            m mVar = this.y.z;
            l4.U(mVar);
            com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVarD0 = mVar.D0(str);
            androidx.collection.f fVar2 = this.L;
            androidx.collection.f fVar3 = this.K;
            androidx.collection.f fVar4 = this.J;
            androidx.collection.f fVar5 = this.A;
            if (cVarD0 != null) {
                w7 w7Var = (w7) E(str, (byte[]) cVarD0.y).l();
                C(str, w7Var);
                fVar5.put(str, F((x7) w7Var.d()));
                fVar.put(str, (x7) w7Var.d());
                D(str, (x7) w7Var.d());
                fVar4.put(str, ((x7) w7Var.y).F());
                fVar3.put(str, (String) cVarD0.z);
                fVar2.put(str, (String) cVarD0.A);
                return;
            }
            fVar5.put(str, null);
            this.C.put(str, null);
            this.B.put(str, null);
            this.D.put(str, null);
            this.E.put(str, null);
            fVar.put(str, null);
            fVar4.put(str, null);
            fVar3.put(str, null);
            fVar2.put(str, null);
            this.G.put(str, null);
        }
    }

    public final void C(String str, w7 w7Var) {
        ArrayList arrayList;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        androidx.collection.f fVar = new androidx.collection.f(0);
        androidx.collection.f fVar2 = new androidx.collection.f(0);
        androidx.collection.f fVar3 = new androidx.collection.f(0);
        Iterator it = Collections.unmodifiableList(((x7) w7Var.y).E()).iterator();
        while (it.hasNext()) {
            hashSet.add(((t7) it.next()).u());
        }
        s1 s1Var = (s1) this.e;
        g gVar = s1Var.A;
        x0 x0Var = s1Var.C;
        g0 g0Var = h0.V0;
        if (gVar.G(null, g0Var)) {
            arrayList2.addAll(Collections.unmodifiableList(((x7) w7Var.y).K()));
        }
        while (i < ((x7) w7Var.y).z()) {
            u7 u7Var = (u7) ((x7) w7Var.y).A(i).l();
            if (u7Var.g().isEmpty()) {
                s1.m(x0Var);
                x0Var.F.a("EventConfig contained null event name");
                arrayList = arrayList2;
            } else {
                String strG = u7Var.g();
                arrayList = arrayList2;
                String strG2 = g2.g(u7Var.g(), g2.a, g2.f);
                if (!TextUtils.isEmpty(strG2)) {
                    u7Var.b();
                    ((v7) u7Var.y).B(strG2);
                    w7Var.b();
                    ((x7) w7Var.y).N(i, (v7) u7Var.d());
                }
                if (((v7) u7Var.y).v() && ((v7) u7Var.y).w()) {
                    fVar.put(strG, Boolean.TRUE);
                }
                if (((v7) u7Var.y).x() && ((v7) u7Var.y).y()) {
                    fVar2.put(u7Var.g(), Boolean.TRUE);
                }
                if (((v7) u7Var.y).z()) {
                    if (((v7) u7Var.y).A() < 2 || ((v7) u7Var.y).A() > 65535) {
                        s1.m(x0Var);
                        x0Var.F.c(u7Var.g(), Integer.valueOf(((v7) u7Var.y).A()), "Invalid sampling rate. Event name, sample rate");
                    } else {
                        fVar3.put(u7Var.g(), Integer.valueOf(((v7) u7Var.y).A()));
                    }
                }
            }
            i++;
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = arrayList2;
        this.B.put(str, hashSet);
        if (s1Var.A.G(null, g0Var)) {
            this.E.put(str, arrayList3);
        }
        this.C.put(str, fVar);
        this.D.put(str, fVar2);
        this.G.put(str, fVar3);
    }

    public final void D(String str, x7 x7Var) {
        s1 s1Var = (s1) this.e;
        int iD = x7Var.D();
        androidx.room.coroutines.i iVar = this.H;
        if (iD == 0) {
            iVar.m(str);
            return;
        }
        x0 x0Var = s1Var.C;
        s1.m(x0Var);
        x0Var.K.b(Integer.valueOf(x7Var.D()), "EES programs found");
        n9 n9Var = (n9) x7Var.C().get(0);
        try {
            t5 t5Var = new t5();
            b7 b7Var = t5Var.a;
            ((HashMap) ((s5) b7Var.B).y).put("internal.remoteConfig", new j1(this, str, 2));
            ((HashMap) ((s5) b7Var.B).y).put("internal.appMetadata", new j1(this, str, 0));
            ((HashMap) ((s5) b7Var.B).y).put("internal.logger", new k1(this));
            t5Var.b(n9Var);
            iVar.l(str, t5Var);
            s1.m(x0Var);
            v0 v0Var = x0Var.K;
            v0Var.c(str, Integer.valueOf(n9Var.v().v()), "EES program loaded for appId, activities");
            for (m9 m9Var : n9Var.v().u()) {
                s1.m(x0Var);
                v0Var.b(m9Var.u(), "EES program activity");
            }
        } catch (h6 unused) {
            x0 x0Var2 = s1Var.C;
            s1.m(x0Var2);
            x0Var2.C.b(str, "Failed to load EES program. appId");
        }
    }

    public final x7 E(String str, byte[] bArr) {
        s1 s1Var = (s1) this.e;
        if (bArr == null) {
            return x7.M();
        }
        try {
            x7 x7Var = (x7) ((w7) n4.g0(x7.L(), bArr)).d();
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.K.c(x7Var.u() ? Long.valueOf(x7Var.v()) : null, x7Var.w() ? x7Var.x() : null, "Parsed config. version, gmp_app_id");
            return x7Var;
        } catch (com.google.android.gms.internal.measurement.t1 e) {
            x0 x0Var2 = s1Var.C;
            s1.m(x0Var2);
            x0Var2.F.c(x0.D(str), e, "Unable to merge remote config. appId");
            return x7.M();
        } catch (RuntimeException e2) {
            x0 x0Var3 = s1Var.C;
            s1.m(x0Var3);
            x0Var3.F.c(x0.D(str), e2, "Unable to merge remote config. appId");
            return x7.M();
        }
    }

    public final x7 H(String str) {
        w();
        v();
        com.google.android.gms.common.internal.x.d(str);
        B(str);
        return (x7) this.F.get(str);
    }

    public final String I(String str) {
        v();
        B(str);
        return (String) this.J.get(str);
    }

    public final void J(String str, String str2, String str3, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        w7 w7Var;
        byte[] bArrA;
        Iterator it;
        int i;
        boolean z;
        w();
        v();
        com.google.android.gms.common.internal.x.d(str);
        w7 w7Var2 = (w7) E(str, bArr).l();
        C(str, w7Var2);
        D(str, (x7) w7Var2.d());
        x7 x7Var = (x7) w7Var2.d();
        androidx.collection.f fVar = this.F;
        fVar.put(str, x7Var);
        this.J.put(str, ((x7) w7Var2.y).F());
        this.K.put(str, str2);
        this.L.put(str, str3);
        this.A.put(str, F((x7) w7Var2.d()));
        l4 l4Var = this.y;
        m mVar = l4Var.z;
        l4.U(mVar);
        ArrayList<f7> arrayList = new ArrayList(Collections.unmodifiableList(((x7) w7Var2.y).B()));
        s1 s1Var = (s1) mVar.e;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            e7 e7Var = (e7) ((f7) arrayList.get(i2)).l();
            androidx.collection.f fVar2 = fVar;
            if (((f7) e7Var.y).A() != 0) {
                int i3 = 0;
                while (i3 < ((f7) e7Var.y).A()) {
                    g7 g7Var = (g7) ((f7) e7Var.y).B(i3).l();
                    g7 g7Var2 = (g7) g7Var.clone();
                    l4 l4Var2 = l4Var;
                    w7 w7Var3 = w7Var2;
                    String strG = g2.g(((h7) g7Var.y).w(), g2.a, g2.f);
                    if (strG != null) {
                        g7Var2.b();
                        ((h7) g7Var2.y).H(strG);
                        z = true;
                    } else {
                        z = false;
                    }
                    int i4 = 0;
                    while (i4 < ((h7) g7Var.y).y()) {
                        j7 j7VarZ = ((h7) g7Var.y).z(i4);
                        boolean z2 = z;
                        g7 g7Var3 = g7Var;
                        String strG2 = g2.g(j7VarZ.B(), g2.h, g2.i);
                        if (strG2 != null) {
                            i7 i7Var = (i7) j7VarZ.l();
                            i7Var.b();
                            ((j7) i7Var.y).D(strG2);
                            j7 j7Var = (j7) i7Var.d();
                            g7Var2.b();
                            ((h7) g7Var2.y).I(i4, j7Var);
                            z = true;
                        } else {
                            z = z2;
                        }
                        i4++;
                        g7Var = g7Var3;
                    }
                    if (z) {
                        e7Var.b();
                        ((f7) e7Var.y).D(i3, (h7) g7Var2.d());
                        arrayList.set(i2, (f7) e7Var.d());
                    }
                    i3++;
                    l4Var = l4Var2;
                    w7Var2 = w7Var3;
                }
            }
            w7 w7Var4 = w7Var2;
            l4 l4Var3 = l4Var;
            if (((f7) e7Var.y).x() != 0) {
                for (int i5 = 0; i5 < ((f7) e7Var.y).x(); i5++) {
                    n7 n7VarY = ((f7) e7Var.y).y(i5);
                    String strG3 = g2.g(n7VarY.w(), g2.l, g2.m);
                    if (strG3 != null) {
                        m7 m7Var = (m7) n7VarY.l();
                        m7Var.b();
                        ((n7) m7Var.y).D(strG3);
                        e7Var.b();
                        ((f7) e7Var.y).C(i5, (n7) m7Var.d());
                        arrayList.set(i2, (f7) e7Var.d());
                    }
                }
            }
            i2++;
            fVar = fVar2;
            l4Var = l4Var3;
            w7Var2 = w7Var4;
        }
        w7 w7Var5 = w7Var2;
        androidx.collection.f fVar3 = fVar;
        l4 l4Var4 = l4Var;
        mVar.w();
        mVar.v();
        com.google.android.gms.common.internal.x.d(str);
        SQLiteDatabase sQLiteDatabaseM0 = mVar.m0();
        sQLiteDatabaseM0.beginTransaction();
        try {
            mVar.w();
            mVar.v();
            com.google.android.gms.common.internal.x.d(str);
            SQLiteDatabase sQLiteDatabaseM1 = mVar.m0();
            sQLiteDatabaseM1.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseM1.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                try {
                    f7 f7Var = (f7) it2.next();
                    mVar.w();
                    mVar.v();
                    com.google.android.gms.common.internal.x.d(str);
                    com.google.android.gms.common.internal.x.g(f7Var);
                    if (f7Var.u()) {
                        int iV = f7Var.v();
                        Iterator it3 = f7Var.z().iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (!((h7) it3.next()).u()) {
                                    x0 x0Var = s1Var.C;
                                    s1.m(x0Var);
                                    x0Var.F.c(x0.D(str), Integer.valueOf(iV), "Event filter with no ID. Audience definition ignored. appId, audienceId");
                                    break;
                                }
                            } else {
                                Iterator it4 = f7Var.w().iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        Iterator it5 = f7Var.z().iterator();
                                        while (true) {
                                            f7 f7Var2 = f7Var;
                                            String str4 = "audience_id";
                                            sQLiteDatabase = sQLiteDatabaseM0;
                                            String str5 = "app_id";
                                            if (!it5.hasNext()) {
                                                it = it2;
                                                i = iV;
                                                for (n7 n7Var : f7Var2.w()) {
                                                    mVar.w();
                                                    mVar.v();
                                                    com.google.android.gms.common.internal.x.d(str);
                                                    com.google.android.gms.common.internal.x.g(n7Var);
                                                    if (n7Var.w().isEmpty()) {
                                                        x0 x0Var2 = s1Var.C;
                                                        s1.m(x0Var2);
                                                        x0Var2.F.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", x0.D(str), Integer.valueOf(i), String.valueOf(n7Var.u() ? Integer.valueOf(n7Var.v()) : null));
                                                    } else {
                                                        byte[] bArrA2 = n7Var.a();
                                                        ContentValues contentValues = new ContentValues();
                                                        contentValues.put(str5, str);
                                                        String str6 = str5;
                                                        contentValues.put(str4, Integer.valueOf(i));
                                                        contentValues.put("filter_id", n7Var.u() ? Integer.valueOf(n7Var.v()) : null);
                                                        String str7 = str4;
                                                        contentValues.put("property_name", n7Var.w());
                                                        contentValues.put("session_scoped", n7Var.A() ? Boolean.valueOf(n7Var.B()) : null);
                                                        contentValues.put("data", bArrA2);
                                                        try {
                                                            if (mVar.m0().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                                x0 x0Var3 = s1Var.C;
                                                                s1.m(x0Var3);
                                                                x0Var3.C.b(x0.D(str), "Failed to insert property filter (got -1). appId");
                                                            } else {
                                                                str5 = str6;
                                                                str4 = str7;
                                                            }
                                                        } catch (SQLiteException e) {
                                                            x0 x0Var4 = s1Var.C;
                                                            s1.m(x0Var4);
                                                            x0Var4.C.c(x0.D(str), e, "Error storing property filter. appId");
                                                        }
                                                    }
                                                }
                                                break;
                                            }
                                            try {
                                                h7 h7Var = (h7) it5.next();
                                                mVar.w();
                                                mVar.v();
                                                com.google.android.gms.common.internal.x.d(str);
                                                com.google.android.gms.common.internal.x.g(h7Var);
                                                if (h7Var.w().isEmpty()) {
                                                    x0 x0Var5 = s1Var.C;
                                                    s1.m(x0Var5);
                                                    x0Var5.F.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", x0.D(str), Integer.valueOf(iV), String.valueOf(h7Var.u() ? Integer.valueOf(h7Var.v()) : null));
                                                    it = it2;
                                                    i = iV;
                                                } else {
                                                    it = it2;
                                                    byte[] bArrA3 = h7Var.a();
                                                    i = iV;
                                                    ContentValues contentValues2 = new ContentValues();
                                                    contentValues2.put("app_id", str);
                                                    contentValues2.put("audience_id", Integer.valueOf(i));
                                                    contentValues2.put("filter_id", h7Var.u() ? Integer.valueOf(h7Var.v()) : null);
                                                    contentValues2.put("event_name", h7Var.w());
                                                    contentValues2.put("session_scoped", h7Var.E() ? Boolean.valueOf(h7Var.F()) : null);
                                                    contentValues2.put("data", bArrA3);
                                                    try {
                                                        if (mVar.m0().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                            x0 x0Var6 = s1Var.C;
                                                            s1.m(x0Var6);
                                                            x0Var6.C.b(x0.D(str), "Failed to insert event filter (got -1). appId");
                                                        }
                                                        f7Var = f7Var2;
                                                        sQLiteDatabaseM0 = sQLiteDatabase;
                                                        it2 = it;
                                                        iV = i;
                                                    } catch (SQLiteException e2) {
                                                        x0 x0Var7 = s1Var.C;
                                                        s1.m(x0Var7);
                                                        x0Var7.C.c(x0.D(str), e2, "Error storing event filter. appId");
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                sQLiteDatabase.endTransaction();
                                                throw th;
                                            }
                                            mVar.w();
                                            mVar.v();
                                            com.google.android.gms.common.internal.x.d(str);
                                            SQLiteDatabase sQLiteDatabaseM2 = mVar.m0();
                                            sQLiteDatabaseM2.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(i)});
                                            sQLiteDatabaseM2.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(i)});
                                            break;
                                        }
                                        sQLiteDatabaseM0 = sQLiteDatabase;
                                        it2 = it;
                                        break;
                                    }
                                    if (!((n7) it4.next()).u()) {
                                        x0 x0Var8 = s1Var.C;
                                        s1.m(x0Var8);
                                        x0Var8.F.c(x0.D(str), Integer.valueOf(iV), "Property filter with no ID. Audience definition ignored. appId, audienceId");
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        x0 x0Var9 = s1Var.C;
                        s1.m(x0Var9);
                        x0Var9.F.b(x0.D(str), "Audience with no ID. appId");
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase = sQLiteDatabaseM0;
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            }
            sQLiteDatabase = sQLiteDatabaseM0;
            ArrayList arrayList2 = new ArrayList();
            for (f7 f7Var3 : arrayList) {
                arrayList2.add(f7Var3.u() ? Integer.valueOf(f7Var3.v()) : null);
            }
            com.google.android.gms.common.internal.x.d(str);
            mVar.w();
            mVar.v();
            SQLiteDatabase sQLiteDatabaseM3 = mVar.m0();
            try {
                long jR = mVar.R("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int iMax = Math.max(0, Math.min(2000, s1Var.A.E(str, h0.U)));
                if (jR > iMax) {
                    ArrayList arrayList3 = new ArrayList();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList2.size()) {
                            String strJoin = TextUtils.join(",", arrayList3);
                            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
                            sb.append("(");
                            sb.append(strJoin);
                            sb.append(")");
                            String string = sb.toString();
                            StringBuilder sb2 = new StringBuilder(string.length() + 140);
                            sb2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb2.append(string);
                            sb2.append(" order by rowid desc limit -1 offset ?)");
                            sQLiteDatabaseM3.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList2.get(i6);
                        if (num == null) {
                            break;
                        }
                        arrayList3.add(Integer.toString(num.intValue()));
                        i6++;
                    }
                }
            } catch (SQLiteException e3) {
                x0 x0Var10 = s1Var.C;
                s1.m(x0Var10);
                x0Var10.C.c(x0.D(str), e3, "Database error querying filters. appId");
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            try {
                w7Var5.b();
                w7Var = w7Var5;
                try {
                    ((x7) w7Var.y).O();
                    bArrA = ((x7) w7Var.d()).a();
                } catch (RuntimeException e4) {
                    e = e4;
                    x0 x0Var11 = ((s1) this.e).C;
                    s1.m(x0Var11);
                    x0Var11.F.c(x0.D(str), e, "Unable to serialize reduced-size config. Storing full config instead. appId");
                    bArrA = bArr;
                }
            } catch (RuntimeException e5) {
                e = e5;
                w7Var = w7Var5;
            }
            m mVar2 = l4Var4.z;
            l4.U(mVar2);
            s1 s1Var2 = (s1) mVar2.e;
            com.google.android.gms.common.internal.x.d(str);
            mVar2.v();
            mVar2.w();
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("remote_config", bArrA);
            contentValues3.put("config_last_modified_time", str2);
            contentValues3.put("e_tag", str3);
            try {
                if (mVar2.m0().update("apps", contentValues3, "app_id = ?", new String[]{str}) == 0) {
                    x0 x0Var12 = s1Var2.C;
                    s1.m(x0Var12);
                    x0Var12.C.b(x0.D(str), "Failed to update remote config (got 0). appId");
                }
            } catch (SQLiteException e6) {
                x0 x0Var13 = s1Var2.C;
                s1.m(x0Var13);
                x0Var13.C.c(x0.D(str), e6, "Error storing remote config. appId");
            }
            w7Var.b();
            ((x7) w7Var.y).P();
            fVar3.put(str, (x7) w7Var.d());
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase = sQLiteDatabaseM0;
        }
    }

    public final boolean K(String str, String str2) {
        Boolean bool;
        v();
        B(str);
        if ("1".equals(d(str, "measurement.upload.blacklist_internal")) && r4.a0(str2)) {
            return true;
        }
        if ("1".equals(d(str, "measurement.upload.blacklist_public")) && r4.w0(str2)) {
            return true;
        }
        Map map = (Map) this.C.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean L(String str, String str2) {
        Boolean bool;
        v();
        B(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.D.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final List M(String str) {
        v();
        B(str);
        return (List) this.E.get(str);
    }

    public final int N(String str, String str2) {
        Integer num;
        v();
        B(str);
        Map map = (Map) this.G.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean O(String str) {
        v();
        B(str);
        androidx.collection.f fVar = this.B;
        if (fVar.get(str) != null) {
            return ((Set) fVar.get(str)).contains("os_version") || ((Set) fVar.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean P(String str) {
        v();
        B(str);
        androidx.collection.f fVar = this.B;
        return fVar.get(str) != null && ((Set) fVar.get(str)).contains("app_instance_id");
    }

    public final boolean Q(String str, e2 e2Var) {
        v();
        B(str);
        s7 s7VarR = R(str);
        if (s7VarR == null) {
            return false;
        }
        for (p7 p7Var : s7VarR.u()) {
            if (e2Var == G(p7Var.u())) {
                return p7Var.v() == 2;
            }
        }
        return false;
    }

    public final s7 R(String str) {
        v();
        B(str);
        x7 x7VarH = H(str);
        if (x7VarH == null || !x7VarH.G()) {
            return null;
        }
        return x7VarH.H();
    }

    @Override // com.google.android.gms.measurement.internal.f
    public final String d(String str, String str2) {
        v();
        B(str);
        Map map = (Map) this.A.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final c2 z(String str, e2 e2Var) {
        v();
        B(str);
        s7 s7VarR = R(str);
        if (s7VarR != null) {
            for (p7 p7Var : s7VarR.z()) {
                if (G(p7Var.u()) == e2Var) {
                    int iV = p7Var.v() - 1;
                    if (iV == 1) {
                        return c2.GRANTED;
                    }
                    if (iV != 2) {
                        break;
                    }
                    return c2.DENIED;
                }
            }
        }
        return c2.UNINITIALIZED;
    }

    @Override // com.google.android.gms.measurement.internal.g4
    public final void y() {
    }
}
