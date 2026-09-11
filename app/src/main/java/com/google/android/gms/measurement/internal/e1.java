package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 {
    public final String a;
    public final boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ g1 e;

    public e1(g1 g1Var, String str, boolean z) {
        this.e = g1Var;
        com.google.android.gms.common.internal.x.d(str);
        this.a = str;
        this.b = z;
    }

    public final boolean a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.z().getBoolean(this.a, this.b);
        }
        return this.d;
    }

    public final void b(boolean z) {
        SharedPreferences.Editor editorEdit = this.e.z().edit();
        editorEdit.putBoolean(this.a, z);
        editorEdit.apply();
        this.d = z;
    }
}
