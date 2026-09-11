package androidx.compose.foundation;

import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r0 extends kotlin.jvm.internal.j implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.e = i3;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() throws Exception {
        androidx.compose.ui.node.a1 a1Var;
        char c;
        ContentCaptureSession contentCaptureSessionN;
        switch (this.e) {
            case 0:
                return Boolean.valueOf(((t0) this.receiver).S.S0(7));
            case 1:
                return ((androidx.compose.foundation.text.contextmenu.provider.e) this.receiver).M();
            case 2:
                androidx.compose.ui.focus.i iVar = (androidx.compose.ui.focus.i) this.receiver;
                androidx.collection.p0 p0Var = iVar.c;
                androidx.collection.p0 p0Var2 = iVar.d;
                androidx.compose.ui.focus.p pVar = iVar.a;
                androidx.compose.ui.focus.e0 e0VarF = pVar.f();
                androidx.compose.ui.focus.c0 c0Var = androidx.compose.ui.focus.c0.z;
                if (e0VarF == null) {
                    Object[] objArr = p0Var2.b;
                    long[] jArr = p0Var2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        char c2 = 7;
                        while (true) {
                            long j = jArr[i];
                            if ((((~j) << c2) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                int i3 = 0;
                                while (i3 < i2) {
                                    if ((j & 255) < 128) {
                                        ((androidx.compose.ui.focus.g) objArr[(i << 3) + i3]).X(c0Var);
                                    }
                                    j >>= 8;
                                    i3++;
                                    c2 = c2;
                                }
                                c = c2;
                                if (i2 == 8) {
                                }
                            } else {
                                c = c2;
                            }
                            if (i != length) {
                                i++;
                                c2 = c;
                            }
                        }
                    }
                } else if (e0VarF.K) {
                    if (p0Var.c(e0VarF)) {
                        e0VarF.R0();
                    }
                    androidx.compose.ui.focus.c0 c0VarQ0 = e0VarF.Q0();
                    if (!e0VarF.e.K) {
                        androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
                    }
                    androidx.compose.ui.q qVar = e0VarF.e;
                    androidx.compose.ui.node.f0 f0VarT = androidx.compose.ui.node.k.t(e0VarF);
                    int i4 = 0;
                    while (f0VarT != null) {
                        if ((((androidx.compose.ui.q) f0VarT.d0.g).A & 5120) != 0) {
                            while (qVar != null) {
                                int i5 = qVar.z;
                                if ((i5 & 5120) != 0) {
                                    if ((i5 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                        i4++;
                                    }
                                    if ((qVar instanceof androidx.compose.ui.focus.g) && p0Var2.c(qVar)) {
                                        if (i4 <= 1) {
                                            ((androidx.compose.ui.focus.g) qVar).X(c0VarQ0);
                                        } else {
                                            ((androidx.compose.ui.focus.g) qVar).X(androidx.compose.ui.focus.c0.y);
                                        }
                                        p0Var2.l(qVar);
                                    }
                                }
                                qVar = qVar.B;
                            }
                        }
                        f0VarT = f0VarT.v();
                        qVar = (f0VarT == null || (a1Var = f0VarT.d0) == null) ? null : (androidx.compose.ui.node.w1) a1Var.f;
                    }
                    Object[] objArr2 = p0Var2.b;
                    long[] jArr2 = p0Var2.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j2 = jArr2[i6];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                for (int i8 = 0; i8 < i7; i8++) {
                                    if ((j2 & 255) < 128) {
                                        ((androidx.compose.ui.focus.g) objArr2[(i6 << 3) + i8]).X(c0Var);
                                    }
                                    j2 >>= 8;
                                }
                                if (i7 == 8) {
                                }
                            }
                            if (i6 != length2) {
                                i6++;
                            }
                        }
                    }
                }
                if (pVar.f() == null || pVar.c.Q0() == c0Var) {
                    pVar.c();
                }
                p0Var.b();
                p0Var2.b();
                iVar.e = false;
                return kotlin.y.a;
            case 3:
                View view = (View) this.receiver;
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 30) {
                    androidx.compose.ui.graphics.layer.i.j(view);
                }
                if (i9 < 29 || (contentCaptureSessionN = androidx.compose.ui.platform.coreshims.b.n(view)) == null) {
                    return null;
                }
                return new androidx.compose.ui.platform.coreshims.a(contentCaptureSessionN, view);
            case 4:
                androidx.room.q qVar2 = (androidx.room.q) this.receiver;
                CoroutineScope coroutineScope = qVar2.a;
                if (coroutineScope == null) {
                    kotlin.jvm.internal.l.f("coroutineScope");
                    throw null;
                }
                CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
                qVar2.d();
                androidx.constraintlayout.core.widgets.analyzer.e eVar = qVar2.e;
                if (eVar == null) {
                    kotlin.jvm.internal.l.f("connectionManager");
                    throw null;
                }
                ((androidx.room.coroutines.b) eVar.g).close();
                androidx.sqlite.db.a aVar = (androidx.sqlite.db.a) eVar.h;
                if (aVar != null) {
                    aVar.close();
                }
                return kotlin.y.a;
            case 5:
                ((com.app.mlounge.ui.viewmodel.g) this.receiver).e();
                return kotlin.y.a;
            case 6:
                ((com.app.mlounge.ui.viewmodel.s) this.receiver).f();
                return kotlin.y.a;
            case 7:
                com.app.mlounge.ui.viewmodel.t tVar = (com.app.mlounge.ui.viewmodel.t) this.receiver;
                tVar.getClass();
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(tVar), null, null, new androidx.compose.animation.core.c1(tVar, null, 21), 3, null);
                return kotlin.y.a;
            case 8:
                ((com.app.mlounge.ui.viewmodel.a0) this.receiver).k();
                return kotlin.y.a;
            case 9:
                ((com.app.mlounge.ui.viewmodel.e0) this.receiver).g();
                return kotlin.y.a;
            case 10:
                ((com.app.mlounge.ui.viewmodel.r1) this.receiver).n.setValue(new com.app.mlounge.ui.viewmodel.m(null, null, null, null, 63));
                return kotlin.y.a;
            case 11:
                ((com.app.mlounge.ui.viewmodel.x1) this.receiver).f();
                return kotlin.y.a;
            case 12:
                ((com.google.firebase.crashlytics.internal.concurrency.c) this.receiver).getClass();
                String name = Thread.currentThread().getName();
                name.getClass();
                return Boolean.valueOf(kotlin.text.k.T(name, "Firebase Background Thread #", false));
            case 13:
                ((com.google.firebase.crashlytics.internal.concurrency.c) this.receiver).getClass();
                String name2 = Thread.currentThread().getName();
                name2.getClass();
                return Boolean.valueOf(kotlin.text.k.T(name2, "Firebase Blocking Thread #", false));
            default:
                ((com.google.firebase.crashlytics.internal.concurrency.c) this.receiver).getClass();
                return Boolean.valueOf(!Looper.getMainLooper().isCurrentThread());
        }
    }
}
