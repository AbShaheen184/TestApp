package com.appsalt.internal;

import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.SendChannel;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g5 implements r0 {
    public final e1 a;
    public final coil3.memory.c b;
    public final e3 c;
    public final c d;
    public final CoroutineScope e;
    public final g4 f;
    public CoroutineScope g;
    public n4 h;

    public g5(c cVar, g4 g4Var) {
        String[] strArr = m3.c;
        strArr.getClass();
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        e1 e1Var = new e1(listAsList);
        coil3.memory.c cVar2 = a0.a;
        e3 e3Var = new e3(new coil3.memory.c((x) cVar2));
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());
        this.a = e1Var;
        this.b = cVar2;
        this.c = e3Var;
        this.d = cVar;
        this.e = CoroutineScope;
        this.f = g4Var;
        this.g = CoroutineScopeKt.plus(CoroutineScope, JobKt__JobKt.Job$default((Job) null, 1, (Object) null));
    }

    public static final u1 d(String str) {
        int i;
        p0 p0VarA = b0.d.a();
        int iE = androidx.constraintlayout.core.g.e(p0VarA.f);
        if (iE != 0) {
            i = 1;
            if (iE != 1) {
                if (iE == 2) {
                    i = 9;
                } else {
                    if (iE != 3) {
                        coil3.g.a();
                        return null;
                    }
                    i = 255;
                }
            }
        } else {
            i = 0;
        }
        byte b = (byte) i;
        Integer num = p0VarA.g;
        byte bIntValue = (byte) (num != null ? num.intValue() : 0);
        Boolean bool = p0VarA.d;
        Boolean bool2 = Boolean.TRUE;
        boolean zA = kotlin.jvm.internal.l.a(bool, bool2);
        boolean zA2 = kotlin.jvm.internal.l.a(p0VarA.e, bool2);
        Integer num2 = p0VarA.b;
        return new u1(str, b, bIntValue, zA, zA2, num2 != null ? num2.intValue() : -1, p0VarA.a, kotlin.jvm.internal.l.a(p0VarA.c, bool2));
    }

    @Override // com.appsalt.internal.r0
    public final void a() {
        f();
    }

    @Override // com.appsalt.internal.r0
    public final void b(boolean z) {
        if (!z) {
            g4 g4Var = this.f;
            g4Var.getClass();
            if (g4.b) {
                g4Var.a(4, "stop");
            }
        }
        g();
        try {
            CoroutineScopeKt.cancel$default(this.g, null, 1, null);
        } catch (Throwable unused) {
        }
    }

    @Override // com.appsalt.internal.r0
    public final void c(String str, boolean z) {
        x2 x2Var = b0.d;
        x2Var.getClass();
        if (!kotlin.text.k.d0(str)) {
            x2Var.a.E(str);
            x2Var.b.b = str;
        }
        if (!z) {
            g4 g4Var = this.f;
            g4Var.getClass();
            if (g4.b) {
                g4Var.a(4, "Starting session: ".concat(b0.d.b.a));
            }
        }
        try {
            CoroutineScopeKt.cancel$default(this.g, null, 1, null);
        } catch (Throwable unused) {
        }
        this.g = CoroutineScopeKt.plus(this.e, JobKt__JobKt.Job$default((Job) null, 1, (Object) null));
        f();
    }

    public final void e(n4 n4Var) {
        this.f.getClass();
        n4 n4Var2 = this.h;
        if (n4Var2 == null || !n4Var2.equals(n4Var)) {
            return;
        }
        g();
        BuildersKt__BuildersKt.runBlocking$default(null, new androidx.compose.animation.core.c1(this, null, 25), 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004f  */
    public final void f() {
        String str;
        Object lVar;
        com.app.mlounge.ui.screens.player.j0 j0Var = z0.a;
        g4 g4Var = this.f;
        n4 n4Var = (n4) j0Var.invoke(g4Var);
        this.h = n4Var;
        e1 e1Var = this.a;
        coil3.memory.c cVar = e1Var.c;
        if (cVar == null) {
            ArrayList arrayListV = kotlin.collections.o.V(e1Var.a, e1Var.b);
            kotlin.random.a aVar = kotlin.random.d.e;
            str = (String) kotlin.collections.o.Z(arrayListV);
            if (str == null) {
                str = e1Var.b;
            }
        } else if (kotlin.time.a.e(kotlin.time.f.a(((kotlin.time.f) cVar.y).e), e1.d) <= 0) {
            ArrayList arrayListV2 = kotlin.collections.o.V((ArrayList) cVar.z, e1Var.b);
            kotlin.random.a aVar2 = kotlin.random.d.e;
            str = (String) kotlin.collections.o.Z(arrayListV2);
            if (str == null) {
                str = e1Var.b;
            }
        } else {
            e1Var.c = null;
            ArrayList arrayListV3 = kotlin.collections.o.V(e1Var.a, e1Var.b);
            kotlin.random.a aVar3 = kotlin.random.d.e;
            str = (String) kotlin.collections.o.Z(arrayListV3);
            if (str == null) {
                str = e1Var.b;
            }
        }
        e1Var.b = str;
        g4Var.getClass();
        try {
            okhttp3.a0 a0Var = new okhttp3.a0();
            a0Var.d(str);
            n4Var.e = n4Var.g.b(new okhttp3.b0(a0Var), n4Var);
            lVar = kotlin.y.a;
        } catch (Throwable th) {
            lVar = new kotlin.l(th);
        }
        if (kotlin.m.a(lVar) != null) {
            if (g4.b) {
                g4Var.a(1, "Unable to connect to server");
            }
            e(n4Var);
            return;
        }
        if (!(lVar instanceof kotlin.l)) {
        }
        n nVar = b0.d.b;
        nVar.getClass();
        String str2 = nVar.a;
        f1 f1Var = new f1(nVar.d, nVar.e);
        String str3 = Build.VERSION.RELEASE;
        q1 q1Var = new q1(str2, f1Var, new m1(), new j1(nVar.b, nVar.c));
        z0.b.getClass();
        n4Var.i.mo28trySendJP2dKIU(j.a(q1Var));
        BuildersKt__Builders_commonKt.launch$default(this.g, null, null, new androidx.compose.animation.core.z0(this, n4Var, (kotlin.coroutines.d) null), 3, null);
    }

    public final void g() {
        n4 n4Var = this.h;
        if (n4Var != null) {
            n4Var.a();
        }
        kotlin.coroutines.d dVar = null;
        this.h = null;
        try {
            e3 e3Var = this.c;
            SendChannel.DefaultImpls.close$default(e3Var.h, null, 1, null);
            BuildersKt__Builders_commonKt.launch$default(e3Var.c, null, null, new androidx.compose.animation.core.z0(e3Var, dVar, 11), 3, null);
        } catch (Throwable unused) {
        }
    }
}
