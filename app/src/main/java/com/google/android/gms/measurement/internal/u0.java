package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.IOException;
import java.util.Map;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements Runnable {
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final /* synthetic */ int e = 0;
    public final int y;
    public final String z;

    public /* synthetic */ u0(String str, z0 z0Var, int i, IOException iOException, byte[] bArr, Map map) {
        com.google.android.gms.common.internal.x.g(z0Var);
        this.A = z0Var;
        this.y = i;
        this.B = iOException;
        this.C = bArr;
        this.z = str;
        this.D = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                x0 x0Var = (x0) this.D;
                g1 g1Var = ((s1) x0Var.e).B;
                s1.k(g1Var);
                if (!g1Var.y) {
                    Log.println(6, x0Var.F(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                if (x0Var.z == 0) {
                    g gVar = ((s1) x0Var.e).A;
                    if (gVar.B == null) {
                        synchronized (gVar) {
                            try {
                                if (gVar.B == null) {
                                    s1 s1Var = (s1) gVar.e;
                                    ApplicationInfo applicationInfo = s1Var.e.getApplicationInfo();
                                    String strA = com.google.android.gms.common.util.c.a();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        gVar.B = Boolean.valueOf(str != null && str.equals(strA));
                                    }
                                    if (gVar.B == null) {
                                        gVar.B = Boolean.TRUE;
                                        x0 x0Var2 = s1Var.C;
                                        s1.m(x0Var2);
                                        x0Var2.C.a("My process not in the list of running processes");
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (gVar.B.booleanValue()) {
                        x0Var.z = 'C';
                    } else {
                        x0Var.z = 'c';
                    }
                    break;
                }
                if (x0Var.A < 0) {
                    ((s1) x0Var.e).A.B();
                    x0Var.A = 161000L;
                }
                int i = this.y;
                char c = x0Var.z;
                long j = x0Var.A;
                String str2 = this.z;
                Object obj = this.A;
                Object obj2 = this.B;
                Object obj3 = this.C;
                char cCharAt = "01VDIWEA?".charAt(i);
                String strG = x0.G(true, str2, obj, obj2, obj3);
                StringBuilder sb = new StringBuilder(String.valueOf(cCharAt).length() + 1 + String.valueOf(c).length() + String.valueOf(j).length() + 1 + strG.length());
                sb.append("2");
                sb.append(cCharAt);
                sb.append(c);
                sb.append(j);
                sb.append(":");
                sb.append(strG);
                String string = sb.toString();
                if (string.length() > 1024) {
                    string = str2.substring(0, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                }
                f1 f1Var = g1Var.B;
                if (f1Var != null) {
                    String str3 = (String) f1Var.A;
                    g1 g1Var2 = (g1) f1Var.B;
                    g1Var2.v();
                    if (((g1) f1Var.B).z().getLong((String) f1Var.y, 0L) == 0) {
                        f1Var.f();
                    }
                    SharedPreferences sharedPreferencesZ = g1Var2.z();
                    String str4 = (String) f1Var.z;
                    long j2 = sharedPreferencesZ.getLong(str4, 0L);
                    if (j2 <= 0) {
                        SharedPreferences.Editor editorEdit = g1Var2.z().edit();
                        editorEdit.putString(str3, string);
                        editorEdit.putLong(str4, 1L);
                        editorEdit.apply();
                        return;
                    }
                    r4 r4Var = ((s1) g1Var2.e).F;
                    s1.k(r4Var);
                    long jNextLong = r4Var.v0().nextLong() & Long.MAX_VALUE;
                    long j3 = j2 + 1;
                    long j4 = Long.MAX_VALUE / j3;
                    SharedPreferences.Editor editorEdit2 = g1Var2.z().edit();
                    if (jNextLong < j4) {
                        editorEdit2.putString(str3, string);
                    }
                    editorEdit2.putLong(str4, j3);
                    editorEdit2.apply();
                    return;
                }
                return;
            default:
                ((z0) this.A).a(this.z, this.y, (Throwable) this.B, (byte[]) this.C, (Map) this.D);
                return;
        }
    }

    public u0(x0 x0Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.y = i;
        this.z = str;
        this.A = obj;
        this.B = obj2;
        this.C = obj3;
        this.D = x0Var;
    }
}
