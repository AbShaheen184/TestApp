package com.app.mlounge.ui.screens.player;

import androidx.media3.common.c1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 implements androidx.media3.common.o0 {
    public final /* synthetic */ z0 e;

    public y0(z0 z0Var) {
        this.e = z0Var;
    }

    @Override // androidx.media3.common.o0
    public final void B(androidx.media3.common.k0 k0Var) {
        Object value;
        Object value2;
        k0Var.getClass();
        MutableStateFlow mutableStateFlow = this.e.e;
        if (!((o0) mutableStateFlow.getValue()).B) {
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, o0.a((o0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Playback error: ", k0Var.getMessage()), null, false, false, null, null, false, false, false, 0, -8388609, 3)));
            return;
        }
        kotlin.o oVar = com.app.mlounge.util.a.a;
        com.app.mlounge.util.a.f("CinemaHQ-Player", "Auto-play source failed during playback: " + k0Var.getMessage());
        do {
            value2 = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value2, o0.a((o0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, "Playback failed for auto-play source.", null, false, false, null, null, false, false, false, 0, -142606337, 3)));
    }

    @Override // androidx.media3.common.o0
    public final void G(boolean z) {
        Object value;
        z0 z0Var = this.e;
        MutableStateFlow mutableStateFlow = z0Var.e;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, o0.a((o0) value, z, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, -2, 3)));
        if (z && ((o0) mutableStateFlow.getValue()).c) {
            z0Var.g();
        }
    }

    @Override // androidx.media3.common.o0
    public final void h(int i) {
        Object value;
        MutableStateFlow mutableStateFlow = this.e.e;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, o0.a((o0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, i, -1, 1)));
    }

    @Override // androidx.media3.common.o0
    public final void i(int i) {
        Object value;
        o0 o0Var;
        boolean z;
        Object value2;
        Object value3;
        z0 z0Var = this.e;
        MutableStateFlow mutableStateFlow = z0Var.e;
        do {
            value = mutableStateFlow.getValue();
            o0Var = (o0) value;
            z = false;
            if (i == 2) {
                z = true;
            }
        } while (!mutableStateFlow.compareAndSet(value, o0.a(o0Var, false, z, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, i == 3 || i == 4, false, null, null, null, false, false, null, null, false, false, false, 0, -1048579, 3)));
        if (i == 3) {
            Job job = z0Var.j;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value2, o0.a((o0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, -67108865, 3)));
            if (((o0) mutableStateFlow.getValue()).B) {
                do {
                    value3 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value3, o0.a((o0) value3, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, -402653185, 3)));
            }
            if (((o0) mutableStateFlow.getValue()).c) {
                z0Var.g();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00ee  */
    @Override // androidx.media3.common.o0
    public final void v(c1 c1Var) {
        String strF;
        String upperCase;
        c1Var.getClass();
        ArrayList arrayList = new ArrayList();
        com.google.common.collect.h0 h0Var = c1Var.a;
        h0Var.getClass();
        int i = 0;
        for (Object obj : h0Var) {
            int i2 = i + 1;
            if (i < 0) {
                com.google.common.base.c.w();
                throw null;
            }
            androidx.media3.common.b1 b1Var = (androidx.media3.common.b1) obj;
            if (b1Var.b.c == 1) {
                int i3 = b1Var.a;
                for (int i4 = 0; i4 < i3; i4++) {
                    androidx.media3.common.r rVarA = b1Var.a(i4);
                    rVarA.getClass();
                    String str = rVarA.b;
                    String str2 = rVarA.d;
                    String strD = "UNK";
                    if (str2 != null) {
                        upperCase = str2.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                    } else {
                        upperCase = "UNK";
                    }
                    int i5 = rVarA.G;
                    if (i5 == 1) {
                        strD = "Mono";
                    } else if (i5 == 2) {
                        strD = "Stereo";
                    } else if (i5 == 6) {
                        strD = "5.1";
                    } else if (i5 == 8) {
                        strD = "7.1";
                    } else if (i5 > 0) {
                        strD = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.d(i5, " Ch");
                    }
                    if (str == null || !kotlin.text.k.T(str, upperCase, true)) {
                        str = upperCase + " (" + strD + ")";
                    }
                    arrayList.add(new a(i, i4, str, b1Var.e[i4]));
                }
            }
            i = i2;
        }
        ArrayList arrayList2 = new ArrayList();
        int i6 = 0;
        for (Object obj2 : h0Var) {
            int i7 = i6 + 1;
            if (i6 < 0) {
                com.google.common.base.c.w();
                throw null;
            }
            androidx.media3.common.b1 b1Var2 = (androidx.media3.common.b1) obj2;
            if (b1Var2.b.c == 3) {
                int i8 = 0;
                for (int i9 = b1Var2.a; i8 < i9; i9 = i9) {
                    androidx.media3.common.r rVarA2 = b1Var2.a(i8);
                    rVarA2.getClass();
                    String str3 = rVarA2.b;
                    String str4 = rVarA2.d;
                    if (str4 != null) {
                        strF = str4.toLowerCase(Locale.ROOT);
                        strF.getClass();
                        if (kotlin.text.k.d0(strF)) {
                            strF = null;
                        }
                        if (strF == null) {
                            strF = n0.f(str3);
                        }
                    } else {
                        strF = n0.f(str3);
                    }
                    String str5 = strF;
                    if (str3 == null) {
                        String upperCase2 = str5.toUpperCase(Locale.ROOT);
                        upperCase2.getClass();
                        str3 = upperCase2 + " Track " + (i8 + 1);
                    }
                    arrayList2.add(new b1(str3, "", str5, false, i6, i8, null, 296));
                    i8++;
                }
            }
            i6 = i7;
        }
        MutableStateFlow mutableStateFlow = this.e.e;
        while (true) {
            Object value = mutableStateFlow.getValue();
            o0 o0Var = (o0) value;
            List list = o0Var.m;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list) {
                if (!((b1) obj3).e) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList arrayList4 = new ArrayList(kotlin.collections.p.y(arrayList3, 10));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                String lowerCase = ((b1) it.next()).a.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                arrayList4.add(lowerCase);
            }
            Set setO0 = kotlin.collections.o.o0(arrayList4);
            ArrayList arrayList5 = new ArrayList();
            for (Object obj4 : arrayList2) {
                String lowerCase2 = ((b1) obj4).a.toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                if (!setO0.contains(lowerCase2)) {
                    arrayList5.add(obj4);
                }
            }
            List list2 = o0Var.m;
            ArrayList arrayList6 = new ArrayList();
            for (Object obj5 : list2) {
                if (!((b1) obj5).e) {
                    arrayList6.add(obj5);
                }
            }
            ArrayList arrayListX = kotlin.collections.o.X(arrayList6, arrayList5);
            ArrayList arrayList7 = arrayList2;
            MutableStateFlow mutableStateFlow2 = mutableStateFlow;
            ArrayList arrayList8 = arrayList;
            if (mutableStateFlow2.compareAndSet(value, o0.a(o0Var, false, false, false, false, false, false, false, false, 0L, 0L, 0L, arrayList8, arrayListX, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, -6145, 3))) {
                return;
            }
            mutableStateFlow = mutableStateFlow2;
            arrayList = arrayList8;
            arrayList2 = arrayList7;
        }
    }
}
