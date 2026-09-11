package com.google.firebase.sessions;

import android.content.Context;
import android.os.Process;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {
    public final Context a;
    public final kotlin.o b;
    public final int c;
    public final kotlin.o d;
    public final kotlin.o e;
    public boolean f;

    public f0(Context context, k1 k1Var) {
        context.getClass();
        k1Var.getClass();
        this.a = context;
        final int i = 0;
        this.b = new kotlin.o(new kotlin.jvm.functions.a(this) { // from class: com.google.firebase.sessions.e0
            public final /* synthetic */ f0 y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ((g0) this.y.e.getValue()).a;
                    default:
                        return h0.b(this.y.a);
                }
            }
        });
        this.c = Process.myPid();
        this.d = new kotlin.o(new androidx.room.coroutines.d(k1Var, 19));
        final int i2 = 1;
        this.e = new kotlin.o(new kotlin.jvm.functions.a(this) { // from class: com.google.firebase.sessions.e0
            public final /* synthetic */ f0 y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ((g0) this.y.e.getValue()).a;
                    default:
                        return h0.b(this.y.a);
                }
            }
        });
    }

    public final String a() {
        return (String) this.b.getValue();
    }

    public final Map b(Map map) {
        kotlin.o oVar = this.d;
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put(a(), new d0(Process.myPid(), (String) oVar.getValue()));
            return kotlin.collections.a0.H(linkedHashMap);
        }
        Map mapSingletonMap = Collections.singletonMap(a(), new d0(Process.myPid(), (String) oVar.getValue()));
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }
}
