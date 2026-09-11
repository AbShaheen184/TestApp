package com.google.android.gms.dynamite;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.provider.DocumentsContract;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.n2;
import androidx.appcompat.widget.p2;
import androidx.compose.foundation.layout.m0;
import androidx.compose.foundation.lazy.grid.x;
import androidx.compose.foundation.lazy.grid.z;
import androidx.compose.foundation.n;
import androidx.compose.runtime.m;
import androidx.compose.runtime.q1;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.graphics.vector.h0;
import androidx.compose.ui.r;
import androidx.compose.ui.text.i0;
import androidx.compose.ui.text.j0;
import androidx.lifecycle.q0;
import androidx.room.q;
import com.app.mlounge.emulator.LibretroCore;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.o;
import kotlin.collections.u;
import kotlin.collections.v;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static ClassLoader a;
    public static Thread b;
    public static androidx.compose.ui.graphics.vector.f c;
    public static androidx.compose.ui.graphics.vector.f d;
    public static androidx.compose.ui.graphics.vector.f e;
    public static androidx.compose.ui.graphics.vector.f f;
    public static androidx.compose.ui.graphics.vector.f g;
    public static androidx.compose.ui.graphics.vector.f h;
    public static androidx.compose.ui.graphics.vector.f i;
    public static androidx.compose.ui.graphics.vector.f j;
    public static long k;
    public static Method l;
    public static final /* synthetic */ int m = 0;
    public static final /* synthetic */ int n = 0;
    public static final /* synthetic */ int o = 0;

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Object A(q qVar, kotlin.coroutines.d dVar, l lVar, boolean z, boolean z2) {
        androidx.room.util.b bVar;
        q qVar2;
        l lVar2;
        boolean z3;
        boolean z4;
        if (dVar instanceof androidx.room.util.b) {
            bVar = (androidx.room.util.b) dVar;
            int i2 = bVar.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.C = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new androidx.room.util.b(dVar);
            }
        } else {
            bVar = new androidx.room.util.b(dVar);
        }
        androidx.room.util.b bVar2 = bVar;
        Object obj = bVar2.B;
        int i3 = bVar2.C;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (i3 == 0) {
            kotlin.a.e(obj);
            if (qVar.g() && qVar.i() && qVar.h()) {
                androidx.room.util.d dVar2 = new androidx.room.util.d(qVar, null, lVar, z2, z);
                bVar2.C = 1;
                Object objJ = qVar.j(z, dVar2, bVar2);
                if (objJ != aVar) {
                    return objJ;
                }
            } else {
                bVar2.e = qVar;
                bVar2.y = lVar;
                bVar2.z = z;
                bVar2.A = z2;
                bVar2.C = 2;
                kotlin.coroutines.i iVarN = n(qVar, z2, bVar2);
                if (iVarN != aVar) {
                    qVar2 = qVar;
                    lVar2 = lVar;
                    obj = iVarN;
                    z3 = z2;
                    z4 = z;
                }
            }
        }
        if (i3 == 1) {
            kotlin.a.e(obj);
            return obj;
        }
        if (i3 != 2) {
            if (i3 == 3) {
                kotlin.a.e(obj);
                return obj;
            }
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        boolean z5 = bVar2.A;
        boolean z6 = bVar2.z;
        l lVar3 = bVar2.y;
        q qVar3 = bVar2.e;
        kotlin.a.e(obj);
        z3 = z5;
        z4 = z6;
        lVar2 = lVar3;
        qVar2 = qVar3;
        androidx.room.util.a aVar2 = new androidx.room.util.a(qVar2, null, lVar2, z4, z3);
        bVar2.e = null;
        bVar2.y = null;
        bVar2.C = 3;
        Object objWithContext = BuildersKt.withContext((kotlin.coroutines.i) obj, aVar2, bVar2);
        return objWithContext == aVar ? aVar : objWithContext;
    }

    public static void B(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            n2.a(view, charSequence);
            return;
        }
        p2 p2Var = p2.H;
        if (p2Var != null && p2Var.e == view) {
            p2.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new p2(view, charSequence);
            return;
        }
        p2 p2Var2 = p2.I;
        if (p2Var2 != null && p2Var2.e == view) {
            p2Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static final List C(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(o.K(list));
        }
        return u.e;
    }

    public static final Map D(Map map) {
        int size = map.size();
        if (size == 0) {
            return v.e;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) o.J(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00b7 A[Catch: all -> 0x00b3, PHI: r2
  0x00b7: PHI (r2v1 java.lang.Thread) = (r2v0 java.lang.Thread), (r2v11 java.lang.Thread) binds: [B:7:0x000c, B:47:0x00b0] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000e, B:46:0x00ae, B:61:0x00e5, B:12:0x0023, B:52:0x00b6, B:53:0x00b7, B:64:0x00e9, B:65:0x00ea, B:13:0x0024, B:15:0x0031, B:25:0x004b, B:26:0x0052, B:28:0x005d, B:34:0x0072, B:35:0x0079, B:43:0x008a, B:44:0x00ac, B:18:0x0040, B:54:0x00b8, B:60:0x00e4, B:59:0x00c2), top: B:76:0x0003, inners: #2, #6 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static synchronized ClassLoader E() {
        SecurityException e2;
        Thread thread;
        ThreadGroup threadGroup;
        if (a == null) {
            Thread thread2 = b;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = b.getContextClassLoader();
                    } catch (SecurityException e3) {
                        String message = e3.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 41);
                        sb.append("Failed to get thread context classloader ");
                        sb.append(message);
                        Log.w("DynamiteLoaderV2CL", sb.toString());
                    }
                }
                a = contextClassLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i2 = 0;
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i3];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i3++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i2 >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i2];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i2++;
                                }
                                if (thread == null) {
                                    try {
                                        f fVar = new f(threadGroup, "GmsDynamite");
                                        try {
                                            fVar.setContextClassLoader(null);
                                            fVar.start();
                                            thread = fVar;
                                        } catch (SecurityException e4) {
                                            e2 = e4;
                                            thread = fVar;
                                            String message2 = e2.getMessage();
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(message2).length() + 39);
                                            sb2.append("Failed to enumerate thread/threadgroup ");
                                            sb2.append(message2);
                                            Log.w("DynamiteLoaderV2CL", sb2.toString());
                                        }
                                    } catch (SecurityException e5) {
                                        e2 = e5;
                                    }
                                }
                            } catch (SecurityException e6) {
                                e2 = e6;
                                thread = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    thread2 = thread;
                }
                b = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = b.getContextClassLoader();
                    }
                }
                a = contextClassLoader;
            }
        }
        return a;
    }

    public static void F(int i2, Object[] objArr) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (objArr[i3] == null) {
                com.google.gson.b.h(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.e(i3, "at index ", new StringBuilder(String.valueOf(i3).length() + 9)));
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014c  */
    /* JADX WARN: Code duplicated, block: B:102:0x0150  */
    /* JADX WARN: Code duplicated, block: B:104:0x018d  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:84:0x011f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0125  */
    /* JADX WARN: Code duplicated, block: B:92:0x0137  */
    /* JADX WARN: Code duplicated, block: B:94:0x013d  */
    public static final void a(androidx.compose.foundation.lazy.grid.a aVar, r rVar, x xVar, m0 m0Var, androidx.compose.foundation.layout.g gVar, androidx.compose.foundation.layout.e eVar, androidx.compose.foundation.gestures.l lVar, boolean z, n nVar, l lVar2, androidx.compose.runtime.r rVar2, int i2, int i3) {
        r rVar3;
        x xVarA;
        int i4;
        androidx.compose.foundation.layout.g gVar2;
        int i5;
        androidx.compose.foundation.layout.e eVar2;
        int i6;
        int i7;
        int i8;
        boolean z2;
        boolean z3;
        boolean z4;
        r rVar4;
        x xVar2;
        androidx.compose.foundation.layout.g gVar3;
        androidx.compose.foundation.layout.e eVar3;
        androidx.compose.foundation.gestures.l lVar3;
        n nVar2;
        q1 q1VarT;
        androidx.compose.foundation.gestures.l lVarS;
        androidx.compose.foundation.layout.e eVar4;
        n nVarA;
        int i9;
        boolean z5;
        int i10;
        boolean z6;
        Object objQ;
        int i11;
        rVar2.c0(-2072102870);
        int i12 = i2 | (rVar2.f(aVar) ? 4 : 2);
        int i13 = i3 & 2;
        if (i13 == 0) {
            if ((i2 & 48) == 0) {
                rVar3 = rVar;
                i12 |= rVar2.f(rVar3) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                xVarA = xVar;
                int i14 = rVar2.f(xVarA) ? LibretroCore.SCREEN_WIDTH : 128;
                i4 = i12 | i14 | 24576;
                if ((i2 & 196608) == 0) {
                    if ((i3 & 32) == 0) {
                        gVar2 = gVar;
                        if (rVar2.f(gVar2)) {
                            i11 = 131072;
                        }
                        i4 |= i11;
                    } else {
                        gVar2 = gVar;
                    }
                    i11 = Parser.ARGC_LIMIT;
                    i4 |= i11;
                } else {
                    gVar2 = gVar;
                }
                i5 = i3 & 64;
                if (i5 != 0) {
                    if ((i2 & 1572864) == 0) {
                        eVar2 = eVar;
                        if (rVar2.f(eVar2)) {
                            i6 = 1048576;
                        } else {
                            i6 = 524288;
                        }
                        i4 |= i6;
                    }
                    i7 = i4 | 373293056;
                    if (rVar2.h(lVar2)) {
                        i8 = 4;
                    } else {
                        i8 = 2;
                    }
                    z2 = true;
                    if ((306783379 & i7) == 306783378 || (i8 & 3) != 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (rVar2.T(i7 & 1, z3)) {
                        rVar2.Y();
                        if ((i2 & 1) != 0 || rVar2.C()) {
                            if (i13 != 0) {
                                rVar3 = androidx.compose.ui.o.b;
                            }
                            if ((i3 & 4) != 0) {
                                i7 &= -897;
                                xVarA = z.a(0, 0, rVar2, 3);
                            }
                            if ((i3 & 32) != 0) {
                                i7 &= -458753;
                                gVar2 = androidx.compose.foundation.layout.h.c;
                            }
                            if (i5 != 0) {
                                eVar2 = androidx.compose.foundation.layout.h.a;
                            }
                            r rVar5 = rVar3;
                            lVarS = _COROUTINE.a.s(rVar2);
                            rVar4 = rVar5;
                            eVar4 = eVar2;
                            nVarA = androidx.compose.foundation.q1.a(rVar2);
                            i9 = i7 & (-1908408321);
                            z5 = true;
                        } else {
                            rVar2.W();
                            if ((i3 & 4) != 0) {
                                i7 &= -897;
                            }
                            if ((i3 & 32) != 0) {
                                i7 &= -458753;
                            }
                            i9 = i7 & (-1908408321);
                            rVar4 = rVar3;
                            eVar4 = eVar2;
                            lVarS = lVar;
                            z5 = z;
                            nVarA = nVar;
                        }
                        rVar2.q();
                        i10 = (i9 & 14) | ((i9 >> 15) & Token.ASSIGN_MOD);
                        boolean z7 = (((i10 & 14) ^ 6) <= 4 && rVar2.f(aVar)) || (i10 & 6) == 4;
                        if ((((i10 & Token.ASSIGN_MOD) ^ 48) > 32 || !rVar2.f(eVar4)) && (i10 & 48) != 32) {
                        }
                        z6 = z7 | z2;
                        objQ = rVar2.Q();
                        if (z6 || objQ == m.a) {
                            objQ = new androidx.compose.foundation.lazy.grid.c(new androidx.compose.foundation.contextmenu.f(1, aVar, eVar4));
                            rVar2.l0(objQ);
                        }
                        int i15 = i9 >> 3;
                        int i16 = (i15 & 14) | 196608;
                        xVar2 = xVarA;
                        boolean z8 = z5;
                        com.google.firebase.b.a(rVar4, xVar2, (androidx.compose.foundation.lazy.grid.c) objQ, m0Var, lVarS, z8, nVarA, gVar2, eVar4, lVar2, rVar2, (i15 & Token.ASSIGN_MOD) | i16 | 12610560 | ((i9 << 12) & 1879048192), ((i9 >> 18) & 14) | ((i8 << 3) & Token.ASSIGN_MOD));
                        gVar3 = gVar2;
                        nVar2 = nVarA;
                        z4 = z8;
                        lVar3 = lVarS;
                        eVar3 = eVar4;
                    } else {
                        rVar2.W();
                        z4 = z;
                        rVar4 = rVar3;
                        xVar2 = xVarA;
                        gVar3 = gVar2;
                        eVar3 = eVar2;
                        lVar3 = lVar;
                        nVar2 = nVar;
                    }
                    q1VarT = rVar2.t();
                    if (q1VarT != null) {
                        q1VarT.d = new androidx.compose.foundation.lazy.grid.e(aVar, rVar4, xVar2, m0Var, gVar3, eVar3, lVar3, z4, nVar2, lVar2, i2, i3);
                    }
                }
                i4 |= 1572864;
                eVar2 = eVar;
                i7 = i4 | 373293056;
                if (rVar2.h(lVar2)) {
                    i8 = 4;
                } else {
                    i8 = 2;
                }
                z2 = true;
                if ((306783379 & i7) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (rVar2.T(i7 & 1, z3)) {
                    rVar2.Y();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            rVar3 = androidx.compose.ui.o.b;
                        }
                        if ((i3 & 4) != 0) {
                            i7 &= -897;
                            xVarA = z.a(0, 0, rVar2, 3);
                        }
                        if ((i3 & 32) != 0) {
                            i7 &= -458753;
                            gVar2 = androidx.compose.foundation.layout.h.c;
                        }
                        if (i5 != 0) {
                            eVar2 = androidx.compose.foundation.layout.h.a;
                        }
                        r rVar6 = rVar3;
                        lVarS = _COROUTINE.a.s(rVar2);
                        rVar4 = rVar6;
                        eVar4 = eVar2;
                        nVarA = androidx.compose.foundation.q1.a(rVar2);
                        i9 = i7 & (-1908408321);
                        z5 = true;
                    } else {
                        if (i13 != 0) {
                            rVar3 = androidx.compose.ui.o.b;
                        }
                        if ((i3 & 4) != 0) {
                            i7 &= -897;
                            xVarA = z.a(0, 0, rVar2, 3);
                        }
                        if ((i3 & 32) != 0) {
                            i7 &= -458753;
                            gVar2 = androidx.compose.foundation.layout.h.c;
                        }
                        if (i5 != 0) {
                            eVar2 = androidx.compose.foundation.layout.h.a;
                        }
                        r rVar7 = rVar3;
                        lVarS = _COROUTINE.a.s(rVar2);
                        rVar4 = rVar7;
                        eVar4 = eVar2;
                        nVarA = androidx.compose.foundation.q1.a(rVar2);
                        i9 = i7 & (-1908408321);
                        z5 = true;
                    }
                    rVar2.q();
                    i10 = (i9 & 14) | ((i9 >> 15) & Token.ASSIGN_MOD);
                    if (((i10 & 14) ^ 6) <= 4) {
                    }
                    z2 = ((i10 & Token.ASSIGN_MOD) ^ 48) > 32 ? false : false;
                    z6 = z7 | z2;
                    objQ = rVar2.Q();
                    if (z6) {
                        objQ = new androidx.compose.foundation.lazy.grid.c(new androidx.compose.foundation.contextmenu.f(1, aVar, eVar4));
                        rVar2.l0(objQ);
                    } else {
                        objQ = new androidx.compose.foundation.lazy.grid.c(new androidx.compose.foundation.contextmenu.f(1, aVar, eVar4));
                        rVar2.l0(objQ);
                    }
                    int i17 = i9 >> 3;
                    int i18 = (i17 & 14) | 196608;
                    xVar2 = xVarA;
                    boolean z9 = z5;
                    com.google.firebase.b.a(rVar4, xVar2, (androidx.compose.foundation.lazy.grid.c) objQ, m0Var, lVarS, z9, nVarA, gVar2, eVar4, lVar2, rVar2, (i17 & Token.ASSIGN_MOD) | i18 | 12610560 | ((i9 << 12) & 1879048192), ((i9 >> 18) & 14) | ((i8 << 3) & Token.ASSIGN_MOD));
                    gVar3 = gVar2;
                    nVar2 = nVarA;
                    z4 = z9;
                    lVar3 = lVarS;
                    eVar3 = eVar4;
                } else {
                    rVar2.W();
                    z4 = z;
                    rVar4 = rVar3;
                    xVar2 = xVarA;
                    gVar3 = gVar2;
                    eVar3 = eVar2;
                    lVar3 = lVar;
                    nVar2 = nVar;
                }
                q1VarT = rVar2.t();
                if (q1VarT != null) {
                    q1VarT.d = new androidx.compose.foundation.lazy.grid.e(aVar, rVar4, xVar2, m0Var, gVar3, eVar3, lVar3, z4, nVar2, lVar2, i2, i3);
                }
            }
            xVarA = xVar;
            i4 = i12 | i14 | 24576;
            if ((i2 & 196608) == 0) {
                if ((i3 & 32) == 0) {
                    gVar2 = gVar;
                    if (rVar2.f(gVar2)) {
                        i11 = 131072;
                    }
                    i4 |= i11;
                } else {
                    gVar2 = gVar;
                }
                i11 = Parser.ARGC_LIMIT;
                i4 |= i11;
            } else {
                gVar2 = gVar;
            }
            i5 = i3 & 64;
            if (i5 != 0) {
                if ((i2 & 1572864) == 0) {
                    eVar2 = eVar;
                    if (rVar2.f(eVar2)) {
                        i6 = 1048576;
                    } else {
                        i6 = 524288;
                    }
                    i4 |= i6;
                }
                i7 = i4 | 373293056;
                if (rVar2.h(lVar2)) {
                    i8 = 4;
                } else {
                    i8 = 2;
                }
                z2 = true;
                if ((306783379 & i7) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (rVar2.T(i7 & 1, z3)) {
                    rVar2.Y();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            rVar3 = androidx.compose.ui.o.b;
                        }
                        if ((i3 & 4) != 0) {
                            i7 &= -897;
                            xVarA = z.a(0, 0, rVar2, 3);
                        }
                        if ((i3 & 32) != 0) {
                            i7 &= -458753;
                            gVar2 = androidx.compose.foundation.layout.h.c;
                        }
                        if (i5 != 0) {
                            eVar2 = androidx.compose.foundation.layout.h.a;
                        }
                        r rVar8 = rVar3;
                        lVarS = _COROUTINE.a.s(rVar2);
                        rVar4 = rVar8;
                        eVar4 = eVar2;
                        nVarA = androidx.compose.foundation.q1.a(rVar2);
                        i9 = i7 & (-1908408321);
                        z5 = true;
                    } else {
                        if (i13 != 0) {
                            rVar3 = androidx.compose.ui.o.b;
                        }
                        if ((i3 & 4) != 0) {
                            i7 &= -897;
                            xVarA = z.a(0, 0, rVar2, 3);
                        }
                        if ((i3 & 32) != 0) {
                            i7 &= -458753;
                            gVar2 = androidx.compose.foundation.layout.h.c;
                        }
                        if (i5 != 0) {
                            eVar2 = androidx.compose.foundation.layout.h.a;
                        }
                        r rVar9 = rVar3;
                        lVarS = _COROUTINE.a.s(rVar2);
                        rVar4 = rVar9;
                        eVar4 = eVar2;
                        nVarA = androidx.compose.foundation.q1.a(rVar2);
                        i9 = i7 & (-1908408321);
                        z5 = true;
                    }
                    rVar2.q();
                    i10 = (i9 & 14) | ((i9 >> 15) & Token.ASSIGN_MOD);
                    if (((i10 & 14) ^ 6) <= 4) {
                    }
                    if (((i10 & Token.ASSIGN_MOD) ^ 48) > 32) {
                    }
                    z6 = z7 | z2;
                    objQ = rVar2.Q();
                    if (z6) {
                        objQ = new androidx.compose.foundation.lazy.grid.c(new androidx.compose.foundation.contextmenu.f(1, aVar, eVar4));
                        rVar2.l0(objQ);
                    } else {
                        objQ = new androidx.compose.foundation.lazy.grid.c(new androidx.compose.foundation.contextmenu.f(1, aVar, eVar4));
                        rVar2.l0(objQ);
                    }
                    int i19 = i9 >> 3;
                    int i110 = (i19 & 14) | 196608;
                    xVar2 = xVarA;
                    boolean z10 = z5;
                    com.google.firebase.b.a(rVar4, xVar2, (androidx.compose.foundation.lazy.grid.c) objQ, m0Var, lVarS, z10, nVarA, gVar2, eVar4, lVar2, rVar2, (i19 & Token.ASSIGN_MOD) | i110 | 12610560 | ((i9 << 12) & 1879048192), ((i9 >> 18) & 14) | ((i8 << 3) & Token.ASSIGN_MOD));
                    gVar3 = gVar2;
                    nVar2 = nVarA;
                    z4 = z10;
                    lVar3 = lVarS;
                    eVar3 = eVar4;
                } else {
                    rVar2.W();
                    z4 = z;
                    rVar4 = rVar3;
                    xVar2 = xVarA;
                    gVar3 = gVar2;
                    eVar3 = eVar2;
                    lVar3 = lVar;
                    nVar2 = nVar;
                }
                q1VarT = rVar2.t();
                if (q1VarT != null) {
                    q1VarT.d = new androidx.compose.foundation.lazy.grid.e(aVar, rVar4, xVar2, m0Var, gVar3, eVar3, lVar3, z4, nVar2, lVar2, i2, i3);
                }
            }
            i4 |= 1572864;
            eVar2 = eVar;
            i7 = i4 | 373293056;
            if (rVar2.h(lVar2)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            z2 = true;
            if ((306783379 & i7) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (rVar2.T(i7 & 1, z3)) {
                rVar2.Y();
                if ((i2 & 1) != 0) {
                    if (i13 != 0) {
                        rVar3 = androidx.compose.ui.o.b;
                    }
                    if ((i3 & 4) != 0) {
                        i7 &= -897;
                        xVarA = z.a(0, 0, rVar2, 3);
                    }
                    if ((i3 & 32) != 0) {
                        i7 &= -458753;
                        gVar2 = androidx.compose.foundation.layout.h.c;
                    }
                    if (i5 != 0) {
                        eVar2 = androidx.compose.foundation.layout.h.a;
                    }
                    r rVar10 = rVar3;
                    lVarS = _COROUTINE.a.s(rVar2);
                    rVar4 = rVar10;
                    eVar4 = eVar2;
                    nVarA = androidx.compose.foundation.q1.a(rVar2);
                    i9 = i7 & (-1908408321);
                    z5 = true;
                } else {
                    if (i13 != 0) {
                        rVar3 = androidx.compose.ui.o.b;
                    }
                    if ((i3 & 4) != 0) {
                        i7 &= -897;
                        xVarA = z.a(0, 0, rVar2, 3);
                    }
                    if ((i3 & 32) != 0) {
                        i7 &= -458753;
                        gVar2 = androidx.compose.foundation.layout.h.c;
                    }
                    if (i5 != 0) {
                        eVar2 = androidx.compose.foundation.layout.h.a;
                    }
                    r rVar11 = rVar3;
                    lVarS = _COROUTINE.a.s(rVar2);
                    rVar4 = rVar11;
                    eVar4 = eVar2;
                    nVarA = androidx.compose.foundation.q1.a(rVar2);
                    i9 = i7 & (-1908408321);
                    z5 = true;
                }
                rVar2.q();
                i10 = (i9 & 14) | ((i9 >> 15) & Token.ASSIGN_MOD);
                if (((i10 & 14) ^ 6) <= 4) {
                }
                if (((i10 & Token.ASSIGN_MOD) ^ 48) > 32) {
                }
                z6 = z7 | z2;
                objQ = rVar2.Q();
                if (z6) {
                    objQ = new androidx.compose.foundation.lazy.grid.c(new androidx.compose.foundation.contextmenu.f(1, aVar, eVar4));
                    rVar2.l0(objQ);
                } else {
                    objQ = new androidx.compose.foundation.lazy.grid.c(new androidx.compose.foundation.contextmenu.f(1, aVar, eVar4));
                    rVar2.l0(objQ);
                }
                int i111 = i9 >> 3;
                int i112 = (i111 & 14) | 196608;
                xVar2 = xVarA;
                boolean z11 = z5;
                com.google.firebase.b.a(rVar4, xVar2, (androidx.compose.foundation.lazy.grid.c) objQ, m0Var, lVarS, z11, nVarA, gVar2, eVar4, lVar2, rVar2, (i111 & Token.ASSIGN_MOD) | i112 | 12610560 | ((i9 << 12) & 1879048192), ((i9 >> 18) & 14) | ((i8 << 3) & Token.ASSIGN_MOD));
                gVar3 = gVar2;
                nVar2 = nVarA;
                z4 = z11;
                lVar3 = lVarS;
                eVar3 = eVar4;
            } else {
                rVar2.W();
                z4 = z;
                rVar4 = rVar3;
                xVar2 = xVarA;
                gVar3 = gVar2;
                eVar3 = eVar2;
                lVar3 = lVar;
                nVar2 = nVar;
            }
            q1VarT = rVar2.t();
            if (q1VarT != null) {
                q1VarT.d = new androidx.compose.foundation.lazy.grid.e(aVar, rVar4, xVar2, m0Var, gVar3, eVar3, lVar3, z4, nVar2, lVar2, i2, i3);
            }
        }
        i12 |= 48;
        rVar3 = rVar;
        if ((i3 & 4) == 0) {
            xVarA = xVar;
            if (rVar2.f(xVarA)) {
            }
            i4 = i12 | i14 | 24576;
            if ((i2 & 196608) == 0) {
                if ((i3 & 32) == 0) {
                    gVar2 = gVar;
                    if (rVar2.f(gVar2)) {
                        i11 = 131072;
                    }
                    i4 |= i11;
                } else {
                    gVar2 = gVar;
                }
                i11 = Parser.ARGC_LIMIT;
                i4 |= i11;
            } else {
                gVar2 = gVar;
            }
            i5 = i3 & 64;
            if (i5 != 0) {
                if ((i2 & 1572864) == 0) {
                    eVar2 = eVar;
                    if (rVar2.f(eVar2)) {
                        i6 = 1048576;
                    } else {
                        i6 = 524288;
                    }
                    i4 |= i6;
                }
                i7 = i4 | 373293056;
                if (rVar2.h(lVar2)) {
                    i8 = 4;
                } else {
                    i8 = 2;
                }
                z2 = true;
                if ((306783379 & i7) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (rVar2.T(i7 & 1, z3)) {
                    rVar2.Y();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            rVar3 = androidx.compose.ui.o.b;
                        }
                        if ((i3 & 4) != 0) {
                            i7 &= -897;
                            xVarA = z.a(0, 0, rVar2, 3);
                        }
                        if ((i3 & 32) != 0) {
                            i7 &= -458753;
                            gVar2 = androidx.compose.foundation.layout.h.c;
                        }
                        if (i5 != 0) {
                            eVar2 = androidx.compose.foundation.layout.h.a;
                        }
                        r rVar12 = rVar3;
                        lVarS = _COROUTINE.a.s(rVar2);
                        rVar4 = rVar12;
                        eVar4 = eVar2;
                        nVarA = androidx.compose.foundation.q1.a(rVar2);
                        i9 = i7 & (-1908408321);
                        z5 = true;
                    } else {
                        if (i13 != 0) {
                            rVar3 = androidx.compose.ui.o.b;
                        }
                        if ((i3 & 4) != 0) {
                            i7 &= -897;
                            xVarA = z.a(0, 0, rVar2, 3);
                        }
                        if ((i3 & 32) != 0) {
                            i7 &= -458753;
                            gVar2 = androidx.compose.foundation.layout.h.c;
                        }
                        if (i5 != 0) {
                            eVar2 = androidx.compose.foundation.layout.h.a;
                        }
                        r rVar13 = rVar3;
                        lVarS = _COROUTINE.a.s(rVar2);
                        rVar4 = rVar13;
                        eVar4 = eVar2;
                        nVarA = androidx.compose.foundation.q1.a(rVar2);
                        i9 = i7 & (-1908408321);
                        z5 = true;
                    }
                    rVar2.q();
                    i10 = (i9 & 14) | ((i9 >> 15) & Token.ASSIGN_MOD);
                    if (((i10 & 14) ^ 6) <= 4) {
                    }
                    if (((i10 & Token.ASSIGN_MOD) ^ 48) > 32) {
                    }
                    z6 = z7 | z2;
                    objQ = rVar2.Q();
                    if (z6) {
                        objQ = new androidx.compose.foundation.lazy.grid.c(new androidx.compose.foundation.contextmenu.f(1, aVar, eVar4));
                        rVar2.l0(objQ);
                    } else {
                        objQ = new androidx.compose.foundation.lazy.grid.c(new androidx.compose.foundation.contextmenu.f(1, aVar, eVar4));
                        rVar2.l0(objQ);
                    }
                    int i113 = i9 >> 3;
                    int i114 = (i113 & 14) | 196608;
                    xVar2 = xVarA;
                    boolean z12 = z5;
                    com.google.firebase.b.a(rVar4, xVar2, (androidx.compose.foundation.lazy.grid.c) objQ, m0Var, lVarS, z12, nVarA, gVar2, eVar4, lVar2, rVar2, (i113 & Token.ASSIGN_MOD) | i114 | 12610560 | ((i9 << 12) & 1879048192), ((i9 >> 18) & 14) | ((i8 << 3) & Token.ASSIGN_MOD));
                    gVar3 = gVar2;
                    nVar2 = nVarA;
                    z4 = z12;
                    lVar3 = lVarS;
                    eVar3 = eVar4;
                } else {
                    rVar2.W();
                    z4 = z;
                    rVar4 = rVar3;
                    xVar2 = xVarA;
                    gVar3 = gVar2;
                    eVar3 = eVar2;
                    lVar3 = lVar;
                    nVar2 = nVar;
                }
                q1VarT = rVar2.t();
                if (q1VarT != null) {
                    q1VarT.d = new androidx.compose.foundation.lazy.grid.e(aVar, rVar4, xVar2, m0Var, gVar3, eVar3, lVar3, z4, nVar2, lVar2, i2, i3);
                }
            }
            i4 |= 1572864;
            eVar2 = eVar;
            i7 = i4 | 373293056;
            if (rVar2.h(lVar2)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            z2 = true;
            if ((306783379 & i7) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (rVar2.T(i7 & 1, z3)) {
                rVar2.Y();
                if ((i2 & 1) != 0) {
                    if (i13 != 0) {
                        rVar3 = androidx.compose.ui.o.b;
                    }
                    if ((i3 & 4) != 0) {
                        i7 &= -897;
                        xVarA = z.a(0, 0, rVar2, 3);
                    }
                    if ((i3 & 32) != 0) {
                        i7 &= -458753;
                        gVar2 = androidx.compose.foundation.layout.h.c;
                    }
                    if (i5 != 0) {
                        eVar2 = androidx.compose.foundation.layout.h.a;
                    }
                    r rVar14 = rVar3;
                    lVarS = _COROUTINE.a.s(rVar2);
                    rVar4 = rVar14;
                    eVar4 = eVar2;
                    nVarA = androidx.compose.foundation.q1.a(rVar2);
                    i9 = i7 & (-1908408321);
                    z5 = true;
                } else {
                    if (i13 != 0) {
                        rVar3 = androidx.compose.ui.o.b;
                    }
                    if ((i3 & 4) != 0) {
                        i7 &= -897;
                        xVarA = z.a(0, 0, rVar2, 3);
                    }
                    if ((i3 & 32) != 0) {
                        i7 &= -458753;
                        gVar2 = androidx.compose.foundation.layout.h.c;
                    }
                    if (i5 != 0) {
                        eVar2 = androidx.compose.foundation.layout.h.a;
                    }
                    r rVar15 = rVar3;
                    lVarS = _COROUTINE.a.s(rVar2);
                    rVar4 = rVar15;
                    eVar4 = eVar2;
                    nVarA = androidx.compose.foundation.q1.a(rVar2);
                    i9 = i7 & (-1908408321);
                    z5 = true;
                }
                rVar2.q();
                i10 = (i9 & 14) | ((i9 >> 15) & Token.ASSIGN_MOD);
                if (((i10 & 14) ^ 6) <= 4) {
                }
                if (((i10 & Token.ASSIGN_MOD) ^ 48) > 32) {
                }
                z6 = z7 | z2;
                objQ = rVar2.Q();
                if (z6) {
                    objQ = new androidx.compose.foundation.lazy.grid.c(new androidx.compose.foundation.contextmenu.f(1, aVar, eVar4));
                    rVar2.l0(objQ);
                } else {
                    objQ = new androidx.compose.foundation.lazy.grid.c(new androidx.compose.foundation.contextmenu.f(1, aVar, eVar4));
                    rVar2.l0(objQ);
                }
                int i115 = i9 >> 3;
                int i116 = (i115 & 14) | 196608;
                xVar2 = xVarA;
                boolean z13 = z5;
                com.google.firebase.b.a(rVar4, xVar2, (androidx.compose.foundation.lazy.grid.c) objQ, m0Var, lVarS, z13, nVarA, gVar2, eVar4, lVar2, rVar2, (i115 & Token.ASSIGN_MOD) | i116 | 12610560 | ((i9 << 12) & 1879048192), ((i9 >> 18) & 14) | ((i8 << 3) & Token.ASSIGN_MOD));
                gVar3 = gVar2;
                nVar2 = nVarA;
                z4 = z13;
                lVar3 = lVarS;
                eVar3 = eVar4;
            } else {
                rVar2.W();
                z4 = z;
                rVar4 = rVar3;
                xVar2 = xVarA;
                gVar3 = gVar2;
                eVar3 = eVar2;
                lVar3 = lVar;
                nVar2 = nVar;
            }
            q1VarT = rVar2.t();
            if (q1VarT != null) {
                q1VarT.d = new androidx.compose.foundation.lazy.grid.e(aVar, rVar4, xVar2, m0Var, gVar3, eVar3, lVar3, z4, nVar2, lVar2, i2, i3);
            }
        }
        xVarA = xVar;
        i4 = i12 | i14 | 24576;
        if ((i2 & 196608) == 0) {
            if ((i3 & 32) == 0) {
                gVar2 = gVar;
                if (rVar2.f(gVar2)) {
                    i11 = 131072;
                }
                i4 |= i11;
            } else {
                gVar2 = gVar;
            }
            i11 = Parser.ARGC_LIMIT;
            i4 |= i11;
        } else {
            gVar2 = gVar;
        }
        i5 = i3 & 64;
        if (i5 != 0) {
            if ((i2 & 1572864) == 0) {
                eVar2 = eVar;
                if (rVar2.f(eVar2)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i4 |= i6;
            }
            i7 = i4 | 373293056;
            if (rVar2.h(lVar2)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            z2 = true;
            if ((306783379 & i7) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (rVar2.T(i7 & 1, z3)) {
                rVar2.Y();
                if ((i2 & 1) != 0) {
                    if (i13 != 0) {
                        rVar3 = androidx.compose.ui.o.b;
                    }
                    if ((i3 & 4) != 0) {
                        i7 &= -897;
                        xVarA = z.a(0, 0, rVar2, 3);
                    }
                    if ((i3 & 32) != 0) {
                        i7 &= -458753;
                        gVar2 = androidx.compose.foundation.layout.h.c;
                    }
                    if (i5 != 0) {
                        eVar2 = androidx.compose.foundation.layout.h.a;
                    }
                    r rVar16 = rVar3;
                    lVarS = _COROUTINE.a.s(rVar2);
                    rVar4 = rVar16;
                    eVar4 = eVar2;
                    nVarA = androidx.compose.foundation.q1.a(rVar2);
                    i9 = i7 & (-1908408321);
                    z5 = true;
                } else {
                    if (i13 != 0) {
                        rVar3 = androidx.compose.ui.o.b;
                    }
                    if ((i3 & 4) != 0) {
                        i7 &= -897;
                        xVarA = z.a(0, 0, rVar2, 3);
                    }
                    if ((i3 & 32) != 0) {
                        i7 &= -458753;
                        gVar2 = androidx.compose.foundation.layout.h.c;
                    }
                    if (i5 != 0) {
                        eVar2 = androidx.compose.foundation.layout.h.a;
                    }
                    r rVar17 = rVar3;
                    lVarS = _COROUTINE.a.s(rVar2);
                    rVar4 = rVar17;
                    eVar4 = eVar2;
                    nVarA = androidx.compose.foundation.q1.a(rVar2);
                    i9 = i7 & (-1908408321);
                    z5 = true;
                }
                rVar2.q();
                i10 = (i9 & 14) | ((i9 >> 15) & Token.ASSIGN_MOD);
                if (((i10 & 14) ^ 6) <= 4) {
                }
                if (((i10 & Token.ASSIGN_MOD) ^ 48) > 32) {
                }
                z6 = z7 | z2;
                objQ = rVar2.Q();
                if (z6) {
                    objQ = new androidx.compose.foundation.lazy.grid.c(new androidx.compose.foundation.contextmenu.f(1, aVar, eVar4));
                    rVar2.l0(objQ);
                } else {
                    objQ = new androidx.compose.foundation.lazy.grid.c(new androidx.compose.foundation.contextmenu.f(1, aVar, eVar4));
                    rVar2.l0(objQ);
                }
                int i117 = i9 >> 3;
                int i118 = (i117 & 14) | 196608;
                xVar2 = xVarA;
                boolean z14 = z5;
                com.google.firebase.b.a(rVar4, xVar2, (androidx.compose.foundation.lazy.grid.c) objQ, m0Var, lVarS, z14, nVarA, gVar2, eVar4, lVar2, rVar2, (i117 & Token.ASSIGN_MOD) | i118 | 12610560 | ((i9 << 12) & 1879048192), ((i9 >> 18) & 14) | ((i8 << 3) & Token.ASSIGN_MOD));
                gVar3 = gVar2;
                nVar2 = nVarA;
                z4 = z14;
                lVar3 = lVarS;
                eVar3 = eVar4;
            } else {
                rVar2.W();
                z4 = z;
                rVar4 = rVar3;
                xVar2 = xVarA;
                gVar3 = gVar2;
                eVar3 = eVar2;
                lVar3 = lVar;
                nVar2 = nVar;
            }
            q1VarT = rVar2.t();
            if (q1VarT != null) {
                q1VarT.d = new androidx.compose.foundation.lazy.grid.e(aVar, rVar4, xVar2, m0Var, gVar3, eVar3, lVar3, z4, nVar2, lVar2, i2, i3);
            }
        }
        i4 |= 1572864;
        eVar2 = eVar;
        i7 = i4 | 373293056;
        if (rVar2.h(lVar2)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        z2 = true;
        if ((306783379 & i7) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (rVar2.T(i7 & 1, z3)) {
            rVar2.Y();
            if ((i2 & 1) != 0) {
                if (i13 != 0) {
                    rVar3 = androidx.compose.ui.o.b;
                }
                if ((i3 & 4) != 0) {
                    i7 &= -897;
                    xVarA = z.a(0, 0, rVar2, 3);
                }
                if ((i3 & 32) != 0) {
                    i7 &= -458753;
                    gVar2 = androidx.compose.foundation.layout.h.c;
                }
                if (i5 != 0) {
                    eVar2 = androidx.compose.foundation.layout.h.a;
                }
                r rVar18 = rVar3;
                lVarS = _COROUTINE.a.s(rVar2);
                rVar4 = rVar18;
                eVar4 = eVar2;
                nVarA = androidx.compose.foundation.q1.a(rVar2);
                i9 = i7 & (-1908408321);
                z5 = true;
            } else {
                if (i13 != 0) {
                    rVar3 = androidx.compose.ui.o.b;
                }
                if ((i3 & 4) != 0) {
                    i7 &= -897;
                    xVarA = z.a(0, 0, rVar2, 3);
                }
                if ((i3 & 32) != 0) {
                    i7 &= -458753;
                    gVar2 = androidx.compose.foundation.layout.h.c;
                }
                if (i5 != 0) {
                    eVar2 = androidx.compose.foundation.layout.h.a;
                }
                r rVar19 = rVar3;
                lVarS = _COROUTINE.a.s(rVar2);
                rVar4 = rVar19;
                eVar4 = eVar2;
                nVarA = androidx.compose.foundation.q1.a(rVar2);
                i9 = i7 & (-1908408321);
                z5 = true;
            }
            rVar2.q();
            i10 = (i9 & 14) | ((i9 >> 15) & Token.ASSIGN_MOD);
            if (((i10 & 14) ^ 6) <= 4) {
            }
            if (((i10 & Token.ASSIGN_MOD) ^ 48) > 32) {
            }
            z6 = z7 | z2;
            objQ = rVar2.Q();
            if (z6) {
                objQ = new androidx.compose.foundation.lazy.grid.c(new androidx.compose.foundation.contextmenu.f(1, aVar, eVar4));
                rVar2.l0(objQ);
            } else {
                objQ = new androidx.compose.foundation.lazy.grid.c(new androidx.compose.foundation.contextmenu.f(1, aVar, eVar4));
                rVar2.l0(objQ);
            }
            int i119 = i9 >> 3;
            int i1110 = (i119 & 14) | 196608;
            xVar2 = xVarA;
            boolean z15 = z5;
            com.google.firebase.b.a(rVar4, xVar2, (androidx.compose.foundation.lazy.grid.c) objQ, m0Var, lVarS, z15, nVarA, gVar2, eVar4, lVar2, rVar2, (i119 & Token.ASSIGN_MOD) | i1110 | 12610560 | ((i9 << 12) & 1879048192), ((i9 >> 18) & 14) | ((i8 << 3) & Token.ASSIGN_MOD));
            gVar3 = gVar2;
            nVar2 = nVarA;
            z4 = z15;
            lVar3 = lVarS;
            eVar3 = eVar4;
        } else {
            rVar2.W();
            z4 = z;
            rVar4 = rVar3;
            xVar2 = xVarA;
            gVar3 = gVar2;
            eVar3 = eVar2;
            lVar3 = lVar;
            nVar2 = nVar;
        }
        q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.lazy.grid.e(aVar, rVar4, xVar2, m0Var, gVar3, eVar3, lVar3, z4, nVar2, lVar2, i2, i3);
        }
    }

    public static final void b(boolean z, p pVar, androidx.compose.runtime.r rVar, int i2) {
        rVar.c0(1818896922);
        int i3 = (rVar.g(z) ? 4 : 2) | i2 | (rVar.h(pVar) ? 32 : 16);
        if ((i3 & 19) == 18 && rVar.F()) {
            rVar.W();
        } else {
            androidx.room.r.b(z, pVar, rVar, i3 & Token.ELSE);
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.activity.compose.i(z, pVar, i2, 2);
        }
    }

    public static final androidx.compose.ui.geometry.c c(long j2, long j3) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return new androidx.compose.ui.geometry.c(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3));
    }

    public static final long d(float f2, float f3) {
        return (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0043 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:30:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0052  */
    /* JADX WARN: Code duplicated, block: B:35:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    public static boolean e(int i2, Rect rect, Rect rect2, Rect rect3) {
        int iY;
        int i3;
        int i4;
        boolean zF = f(i2, rect, rect2);
        if (f(i2, rect, rect3) || !zF) {
            return false;
        }
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        net.luminis.tls.engine.impl.c.o("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                    if (rect.bottom <= rect3.top) {
                        if (i2 != 17 && i2 != 66) {
                            iY = y(i2, rect, rect2);
                            if (i2 != 17) {
                                i3 = rect.left;
                                i4 = rect3.left;
                            } else if (i2 != 33) {
                                i3 = rect.top;
                                i4 = rect3.top;
                            } else if (i2 != 66) {
                                i3 = rect3.right;
                                i4 = rect.right;
                            } else {
                                if (i2 == 130) {
                                    net.luminis.tls.engine.impl.c.o("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                    return false;
                                }
                                i3 = rect3.bottom;
                                i4 = rect.bottom;
                            }
                            if (iY < Math.max(1, i3 - i4)) {
                                return false;
                            }
                        }
                    }
                } else if (rect.right <= rect3.left) {
                    if (i2 != 17) {
                        iY = y(i2, rect, rect2);
                        if (i2 != 17) {
                            i3 = rect.left;
                            i4 = rect3.left;
                        } else if (i2 != 33) {
                            i3 = rect.top;
                            i4 = rect3.top;
                        } else if (i2 != 66) {
                            i3 = rect3.right;
                            i4 = rect.right;
                        } else {
                            if (i2 == 130) {
                                net.luminis.tls.engine.impl.c.o("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                return false;
                            }
                            i3 = rect3.bottom;
                            i4 = rect.bottom;
                        }
                        if (iY < Math.max(1, i3 - i4)) {
                            return false;
                        }
                    }
                }
            } else if (rect.top >= rect3.bottom) {
                if (i2 != 17) {
                    iY = y(i2, rect, rect2);
                    if (i2 != 17) {
                        i3 = rect.left;
                        i4 = rect3.left;
                    } else if (i2 != 33) {
                        i3 = rect.top;
                        i4 = rect3.top;
                    } else if (i2 != 66) {
                        i3 = rect3.right;
                        i4 = rect.right;
                    } else {
                        if (i2 == 130) {
                            net.luminis.tls.engine.impl.c.o("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                        i3 = rect3.bottom;
                        i4 = rect.bottom;
                    }
                    if (iY < Math.max(1, i3 - i4)) {
                        return false;
                    }
                }
            }
        } else if (rect.left >= rect3.right) {
            if (i2 != 17) {
                iY = y(i2, rect, rect2);
                if (i2 != 17) {
                    i3 = rect.left;
                    i4 = rect3.left;
                } else if (i2 != 33) {
                    i3 = rect.top;
                    i4 = rect3.top;
                } else if (i2 != 66) {
                    i3 = rect3.right;
                    i4 = rect.right;
                } else {
                    if (i2 == 130) {
                        net.luminis.tls.engine.impl.c.o("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                    i3 = rect3.bottom;
                    i4 = rect.bottom;
                }
                if (iY < Math.max(1, i3 - i4)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean f(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        net.luminis.tls.engine.impl.c.o("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static void g(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static q0 h(Class cls) throws InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                com.google.gson.b.t(cls, "Cannot create an instance of ");
                return null;
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                objNewInstance.getClass();
                return (q0) objNewInstance;
            } catch (IllegalAccessException e2) {
                androidx.core.graphics.b.d("Cannot create an instance of ", cls, e2);
                return null;
            } catch (InstantiationException e3) {
                androidx.core.graphics.b.d("Cannot create an instance of ", cls, e3);
                return null;
            }
        } catch (NoSuchMethodException e4) {
            androidx.core.graphics.b.d("Cannot create an instance of ", cls, e4);
            return null;
        }
    }

    public static androidx.documentfile.provider.a l(Context context, Uri uri) {
        String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
        if (DocumentsContract.isDocumentUri(context, uri)) {
            treeDocumentId = DocumentsContract.getDocumentId(uri);
        }
        if (treeDocumentId == null) {
            com.google.gson.b.g(uri, "Could not get document ID from Uri: ");
            return null;
        }
        Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uri, treeDocumentId);
        if (uriBuildDocumentUriUsingTree != null) {
            return new androidx.documentfile.provider.a(context, uriBuildDocumentUriUsingTree);
        }
        throw new NullPointerException("Failed to build documentUri from a tree: " + uri);
    }

    public static final Rect m(TextPaint textPaint, CharSequence charSequence, int i2, int i3) {
        int i4 = i2;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i4 - 1, i3, MetricAffectingSpan.class) != i3) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i4 < i3) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i4, i3, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i4, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        androidx.compose.ui.platform.coreshims.b.q(textPaint2, charSequence, i4, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i4, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i4 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            androidx.compose.ui.platform.coreshims.b.q(textPaint, charSequence, i4, i3, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i4, i3, rect3);
        return rect3;
    }

    public static final kotlin.coroutines.i n(q qVar, boolean z, kotlin.coroutines.jvm.internal.c cVar) {
        androidx.room.v vVar = (androidx.room.v) cVar.getContext().get(androidx.room.v.y);
        kotlin.coroutines.i iVar = vVar != null ? vVar.e : null;
        if (!qVar.g()) {
            CoroutineScope coroutineScope = qVar.a;
            if (coroutineScope == null) {
                kotlin.jvm.internal.l.f("coroutineScope");
                throw null;
            }
            kotlin.coroutines.i coroutineContext = coroutineScope.getCoroutineContext();
            if (iVar == null) {
                iVar = kotlin.coroutines.j.e;
            }
            return coroutineContext.plus(iVar);
        }
        if (iVar != null) {
            CoroutineScope coroutineScope2 = qVar.a;
            if (coroutineScope2 != null) {
                return coroutineScope2.getCoroutineContext().plus(iVar);
            }
            kotlin.jvm.internal.l.f("coroutineScope");
            throw null;
        }
        if (z) {
            kotlin.coroutines.i iVar2 = qVar.b;
            if (iVar2 != null) {
                return iVar2;
            }
            kotlin.jvm.internal.l.f("transactionContext");
            throw null;
        }
        CoroutineScope coroutineScope3 = qVar.a;
        if (coroutineScope3 != null) {
            return coroutineScope3.getCoroutineContext();
        }
        kotlin.jvm.internal.l.f("coroutineScope");
        throw null;
    }

    public static final androidx.compose.ui.graphics.vector.f o() {
        androidx.compose.ui.graphics.vector.f fVar = d;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Delete", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(t.b);
        androidx.compose.ui.graphics.vector.g gVarH = androidx.privacysandbox.ads.adservices.java.internal.a.h(6.0f, 19.0f);
        gVarH.h(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        gVarH.l(8.0f);
        gVarH.h(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        gVarH.r(7.0f);
        gVarH.k(6.0f);
        gVarH.s(12.0f);
        gVarH.f();
        gVarH.o(19.0f, 4.0f);
        gVarH.l(-3.5f);
        gVarH.n(-1.0f, -1.0f);
        gVarH.l(-5.0f);
        gVarH.n(-1.0f, 1.0f);
        gVarH.k(5.0f);
        gVarH.s(2.0f);
        gVarH.l(14.0f);
        gVarH.r(4.0f);
        gVarH.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVarH.a, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        d = fVarB;
        return fVarB;
    }

    public static final androidx.compose.ui.graphics.vector.f p() {
        androidx.compose.ui.graphics.vector.f fVar = e;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Favorite", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.o(12.0f, 21.35f);
        gVar.n(-1.45f, -1.32f);
        gVar.g(5.4f, 15.36f, 2.0f, 12.28f, 2.0f, 8.5f);
        gVar.g(2.0f, 5.42f, 4.42f, 3.0f, 7.5f, 3.0f);
        gVar.h(1.74f, 0.0f, 3.41f, 0.81f, 4.5f, 2.09f);
        gVar.g(13.09f, 3.81f, 14.76f, 3.0f, 16.5f, 3.0f);
        gVar.g(19.58f, 3.0f, 22.0f, 5.42f, 22.0f, 8.5f);
        gVar.h(0.0f, 3.78f, -3.4f, 6.86f, -8.55f, 11.54f);
        gVar.m(12.0f, 21.35f);
        gVar.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.a, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        e = fVarB;
        return fVarB;
    }

    public static final androidx.compose.ui.graphics.vector.f r() {
        androidx.compose.ui.graphics.vector.f fVar = h;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Search", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.o(15.5f, 14.0f);
        gVar.l(-0.79f);
        gVar.n(-0.28f, -0.27f);
        gVar.g(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
        gVar.g(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
        gVar.p(3.0f, 5.91f, 3.0f, 9.5f);
        gVar.p(5.91f, 16.0f, 9.5f, 16.0f);
        gVar.h(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
        gVar.n(0.27f, 0.28f);
        gVar.s(0.79f);
        gVar.n(5.0f, 4.99f);
        gVar.m(20.49f, 19.0f);
        gVar.n(-4.99f, -5.0f);
        gVar.f();
        gVar.o(9.5f, 14.0f);
        gVar.g(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
        gVar.p(7.01f, 5.0f, 9.5f, 5.0f);
        gVar.p(14.0f, 7.01f, 14.0f, 9.5f);
        gVar.p(11.99f, 14.0f, 9.5f, 14.0f);
        gVar.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.a, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        h = fVarB;
        return fVarB;
    }

    public static final androidx.compose.ui.text.style.j s(j0 j0Var, int i2) {
        i0 i0Var = j0Var.a;
        androidx.compose.ui.text.n nVar = j0Var.b;
        if (i0Var.a.y.length() != 0) {
            int iD = nVar.d(i2);
            if ((i2 != 0 && iD == nVar.d(i2 - 1)) || (i2 != i0Var.a.y.length() && iD == nVar.d(i2 + 1))) {
                return j0Var.a(i2);
            }
        }
        return j0Var.g(i2);
    }

    public static final int u(int i2, int i3) {
        return (i2 >> i3) & 31;
    }

    public static boolean v(int i2, Rect rect, Rect rect2) {
        if (i2 == 17) {
            int i3 = rect.right;
            int i4 = rect2.right;
            return (i3 > i4 || rect.left >= i4) && rect.left > rect2.left;
        }
        if (i2 == 33) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            return (i5 > i6 || rect.top >= i6) && rect.top > rect2.top;
        }
        if (i2 == 66) {
            int i7 = rect.left;
            int i8 = rect2.left;
            return (i7 < i8 || rect.right <= i8) && rect.right < rect2.right;
        }
        if (i2 != 130) {
            net.luminis.tls.engine.impl.c.o("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            return false;
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        return (i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom;
    }

    public static boolean w() {
        if (Build.VERSION.SDK_INT >= 29) {
            return androidx.tracing.a.a();
        }
        try {
            if (l == null) {
                k = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                l = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) l.invoke(null, Long.valueOf(k))).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
                return false;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            net.luminis.tls.engine.impl.c.k(cause);
            return false;
        }
    }

    public static int y(int i2, Rect rect, Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.right;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.bottom;
        } else if (i2 == 66) {
            i3 = rect2.left;
            i4 = rect.right;
        } else {
            if (i2 != 130) {
                net.luminis.tls.engine.impl.c.o("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return 0;
            }
            i3 = rect2.top;
            i4 = rect.bottom;
        }
        return Math.max(0, i3 - i4);
    }

    public static int z(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        net.luminis.tls.engine.impl.c.o("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public androidx.media3.common.h0 i(androidx.media3.extractor.metadata.a aVar) {
        ByteBuffer byteBuffer = aVar.B;
        byteBuffer.getClass();
        com.google.android.material.motion.a.f(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return j(aVar, byteBuffer);
    }

    public abstract androidx.media3.common.h0 j(androidx.media3.extractor.metadata.a aVar, ByteBuffer byteBuffer);

    public abstract boolean k();

    public abstract String q();

    public abstract Uri t();

    public abstract boolean x();
}
