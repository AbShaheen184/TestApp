package com.appsalt.internal;

import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final Channel a;
    public final Channel b;
    public final f5 c;
    public final coil3.memory.c d;
    public final o0 e;
    public final x f;
    public final n0 g;
    public final CoroutineScope h;
    public final LinkedHashMap i = new LinkedHashMap();
    public final Channel j = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);

    public f(Channel channel, Channel channel2, f5 f5Var, coil3.memory.c cVar, o0 o0Var, x xVar, n0 n0Var, CoroutineDispatcher coroutineDispatcher) {
        this.a = channel;
        this.b = channel2;
        this.c = f5Var;
        this.d = cVar;
        this.e = o0Var;
        this.f = xVar;
        this.g = n0Var;
        this.h = CoroutineScopeKt.CoroutineScope(coroutineDispatcher);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00eb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static final Object a(f fVar, g2 g2Var, kotlin.coroutines.jvm.internal.c cVar) {
        m5 m5Var;
        Object objSend;
        LinkedHashMap linkedHashMap = fVar.i;
        if (cVar instanceof m5) {
            m5Var = (m5) cVar;
            int i = m5Var.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                m5Var.z = i - Integer.MIN_VALUE;
            } else {
                m5Var = new m5(fVar, cVar);
            }
        } else {
            m5Var = new m5(fVar, cVar);
        }
        Object obj = m5Var.e;
        int i2 = m5Var.z;
        kotlin.y yVar = kotlin.y.a;
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                kotlin.a.e(obj);
                return yVar;
            }
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(obj);
        Channel channel = fVar.b;
        String str = g2Var.a;
        p3 p3Var = g2Var.c;
        SendChannel sendChannel = (SendChannel) linkedHashMap.get(new f4(str));
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (sendChannel != null) {
            m5Var.z = 1;
            if (!(p3Var instanceof s1) || (objSend = sendChannel.send(g2Var, m5Var)) != aVar) {
                objSend = yVar;
            }
            if (objSend == aVar) {
                return aVar;
            }
            return yVar;
        }
        if (p3Var instanceof d1) {
            String str2 = g2Var.a;
            int i3 = g2Var.b;
            d1 d1Var = (d1) p3Var;
            Channel channelChannel$default = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
            linkedHashMap.put(new f4(str2), channelChannel$default);
            BuildersKt__Builders_commonKt.launch$default(fVar.h, null, null, new androidx.compose.animation.core.f(fVar, str2, new a(str2, d1Var.a, i3, channelChannel$default, channel, fVar.d), d1Var, null, 21), 3, null);
            return yVar;
        }
        if (!(p3Var instanceof w0)) {
            if (p3Var instanceof t0) {
                m5Var.z = 2;
                Object objSend2 = channel.send(new g2(str, g2Var.b, new w0(8)), m5Var);
                if (objSend2 != aVar) {
                    objSend2 = yVar;
                }
                if (objSend2 == aVar) {
                    return aVar;
                }
            } else if (p3Var instanceof o1) {
                m5Var.z = 3;
                Object objSend3 = channel.send(new g2(str, g2Var.b, new w0(7)), m5Var);
                if (objSend3 != aVar) {
                    objSend3 = yVar;
                }
                if (objSend3 == aVar) {
                    return aVar;
                }
            } else {
                fVar.e.a.getClass();
            }
        }
        return yVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r5.send(r7, r0) == r4) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.appsalt.internal.f r5, java.lang.String r6, com.appsalt.internal.a r7, com.appsalt.internal.d1 r8, kotlin.coroutines.jvm.internal.c r9) {
        /*
            boolean r0 = r9 instanceof com.appsalt.internal.x5
            if (r0 == 0) goto L13
            r0 = r9
            com.appsalt.internal.x5 r0 = (com.appsalt.internal.x5) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            com.appsalt.internal.x5 r0 = new com.appsalt.internal.x5
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.z
            int r1 = r0.B
            r2 = 2
            r3 = 1
            kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            kotlin.a.e(r9)
            goto L63
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r5)
            r5 = 0
            return r5
        L31:
            java.lang.String r6 = r0.y
            com.appsalt.internal.f r5 = r0.e
            kotlin.a.e(r9)
            kotlin.m r9 = (kotlin.m) r9
            r9.getClass()
            goto L4e
        L3e:
            kotlin.a.e(r9)
            r0.e = r5
            r0.y = r6
            r0.B = r3
            java.lang.Object r7 = r7.c(r8, r0)
            if (r7 != r4) goto L4e
            goto L62
        L4e:
            kotlinx.coroutines.channels.Channel r5 = r5.j
            com.appsalt.internal.f4 r7 = new com.appsalt.internal.f4
            r7.<init>(r6)
            r6 = 0
            r0.e = r6
            r0.y = r6
            r0.B = r2
            java.lang.Object r5 = r5.send(r7, r0)
            if (r5 != r4) goto L63
        L62:
            return r4
        L63:
            kotlin.y r5 = kotlin.y.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsalt.internal.f.b(com.appsalt.internal.f, java.lang.String, com.appsalt.internal.a, com.appsalt.internal.d1, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object f(f fVar, g2 g2Var, kotlin.coroutines.jvm.internal.c cVar) {
        q5 q5Var;
        int i;
        if (cVar instanceof q5) {
            q5Var = (q5) cVar;
            int i2 = q5Var.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q5Var.z = i2 - Integer.MIN_VALUE;
            } else {
                q5Var = new q5(fVar, cVar);
            }
        } else {
            q5Var = new q5(fVar, cVar);
        }
        Object obj = q5Var.e;
        int i3 = q5Var.z;
        kotlin.y yVar = kotlin.y.a;
        int i4 = 1;
        if (i3 != 0) {
            if (i3 == 1) {
                kotlin.a.e(obj);
                return yVar;
            }
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(obj);
        p3 p3Var = g2Var.c;
        if (p3Var.equals(b2.a)) {
            q5Var.z = 1;
            p0 p0VarA = ((x2) fVar.c).a();
            String str = g2Var.a;
            int i5 = g2Var.b;
            int iE = androidx.constraintlayout.core.g.e(p0VarA.f);
            if (iE == 0) {
                i = 2;
            } else if (iE != 1) {
                if (iE == 2) {
                    i4 = 4;
                } else if (iE != 3) {
                    coil3.g.a();
                    return null;
                }
                i = i4;
            } else {
                i = 3;
            }
            Object objSend = fVar.b.send(new g2(str, i5, new y2(i, p0VarA.g, b0.a(p0VarA.d), p0VarA.b, b0.a(p0VarA.e), b0.a(p0VarA.a), b0.a(p0VarA.c))), q5Var);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objSend != aVar) {
                objSend = yVar;
            }
            return objSend == aVar ? aVar : yVar;
        }
        if (p3Var instanceof x1) {
            fVar.f.e(((x1) p3Var).a);
            return yVar;
        }
        if (!(p3Var instanceof b3)) {
            fVar.e.a.getClass();
            return yVar;
        }
        n0 n0Var = fVar.g;
        b3 b3Var = (b3) p3Var;
        com.google.protobuf.t0 t0Var = b3Var.a;
        com.google.protobuf.t0<String> t0Var2 = b3Var.b;
        int i6 = n0Var.d;
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = t0Var.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            m0 m0Var = kotlin.text.k.d0(str2) ? null : new m0(str2, i6);
            if (m0Var != null) {
                arrayList.add(m0Var);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str3 : t0Var2) {
            m0 m0Var2 = kotlin.text.k.d0(str3) ? null : new m0(str3, i6);
            if (m0Var2 != null) {
                arrayList2.add(m0Var2);
            }
        }
        n0Var.g = new androidx.appcompat.widget.c2(25, new kotlin.time.f(kotlin.time.e.b()), arrayList, arrayList2);
        return new kotlin.l(new androidx.compose.runtime.snapshots.g(2));
    }

    public final Object c(String str, t5 t5Var) {
        n nVar = ((x2) this.c).b;
        String str2 = nVar.a;
        f2 f2Var = new f2(nVar.d, nVar.e);
        String str3 = Build.VERSION.RELEASE;
        String str4 = Build.VERSION.RELEASE;
        Object objSend = this.b.send(new g2("", -1, new p2(str2, f2Var, new l2(), kotlin.collections.a0.v(new kotlin.k("aid", nVar.b), new kotlin.k("puid", nVar.c)), str)), t5Var);
        return objSend == kotlin.coroutines.intrinsics.a.e ? objSend : kotlin.y.a;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0091  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object d(String str, kotlin.coroutines.jvm.internal.c cVar) {
        t5 t5Var;
        f fVar;
        Object objE;
        Object objWithContext;
        if (cVar instanceof t5) {
            t5Var = (t5) cVar;
            int i = t5Var.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                t5Var.A = i - Integer.MIN_VALUE;
            } else {
                t5Var = new t5(this, cVar);
            }
        } else {
            t5Var = new t5(this, cVar);
        }
        Object obj = t5Var.y;
        int i2 = t5Var.A;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        Object obj2 = kotlin.y.a;
        kotlin.coroutines.d dVar = null;
        try {
            try {
                if (i2 == 0) {
                    kotlin.a.e(obj);
                    try {
                        t5Var.e = this;
                        t5Var.A = 1;
                        try {
                            if (c(str, t5Var) != aVar) {
                                fVar = this;
                            }
                        } catch (Throwable th) {
                            th = th;
                            str = this;
                            t5Var.e = th;
                            t5Var.A = 4;
                            str.getClass();
                            Object objWithContext2 = BuildersKt.withContext(NonCancellable.INSTANCE, new androidx.compose.animation.core.c1(str, dVar, 22), t5Var);
                            if (objWithContext2 == aVar) {
                                obj2 = objWithContext2;
                            }
                            if (obj2 != aVar) {
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    return aVar;
                }
                if (i2 == 1) {
                    fVar = (f) t5Var.e;
                    kotlin.a.e(obj);
                } else {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            Object obj3 = t5Var.e;
                            kotlin.a.e(obj);
                            return obj3;
                        }
                        if (i2 != 4) {
                            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Throwable th3 = (Throwable) t5Var.e;
                        kotlin.a.e(obj);
                        throw th3;
                    }
                    fVar = (f) t5Var.e;
                    kotlin.a.e(obj);
                    objE = ((kotlin.m) obj).e;
                }
                t5Var.e = objE;
                t5Var.A = 3;
                fVar.getClass();
                objWithContext = BuildersKt.withContext(NonCancellable.INSTANCE, new androidx.compose.animation.core.c1(fVar, dVar, 22), t5Var);
                if (objWithContext == aVar) {
                    obj2 = objWithContext;
                }
                if (obj2 != aVar) {
                    return aVar;
                }
                return objE;
                t5Var.e = fVar;
                t5Var.A = 2;
                objE = fVar.e(t5Var);
                if (objE != aVar) {
                    t5Var.e = objE;
                    t5Var.A = 3;
                    fVar.getClass();
                    objWithContext = BuildersKt.withContext(NonCancellable.INSTANCE, new androidx.compose.animation.core.c1(fVar, dVar, 22), t5Var);
                    if (objWithContext == aVar) {
                        obj2 = objWithContext;
                    }
                    if (obj2 != aVar) {
                        return objE;
                    }
                }
            } catch (Throwable th4) {
                return new kotlin.l(th4);
            }
        } catch (Throwable th5) {
            th = th5;
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
    /* JADX WARN: Code duplicated, block: B:19:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x008e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0081 -> B:20:0x0084). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(kotlin.coroutines.jvm.internal.c r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.appsalt.internal.a5
            if (r0 == 0) goto L13
            r0 = r13
            com.appsalt.internal.a5 r0 = (com.appsalt.internal.a5) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            com.appsalt.internal.a5 r0 = new com.appsalt.internal.a5
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.z
            int r1 = r0.B
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L2a
            kotlin.jvm.internal.v r1 = r0.y
            com.appsalt.internal.f r3 = r0.e
            kotlin.a.e(r13)
            r5 = r3
            goto L84
        L2a:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r13)
            r13 = 0
            return r13
        L31:
            kotlin.a.e(r13)
            kotlin.jvm.internal.v r13 = new kotlin.jvm.internal.v
            r13.<init>()
            r13.e = r2
            kotlin.y r1 = kotlin.y.a
            r5 = r1
            r1 = r13
            r13 = r5
            r5 = r12
        L41:
            boolean r3 = r1.e
            if (r3 == 0) goto L92
            kotlinx.coroutines.selects.SelectImplementation r13 = new kotlinx.coroutines.selects.SelectImplementation
            kotlin.coroutines.i r3 = r0.getContext()
            r13.<init>(r3)
            kotlinx.coroutines.channels.Channel r3 = r5.a
            kotlinx.coroutines.selects.SelectClause1 r3 = r3.getOnReceive()
            com.app.mlounge.ui.viewmodel.w1 r4 = new com.app.mlounge.ui.viewmodel.w1
            r6 = 0
            r7 = 7
            r4.<init>(r5, r6, r7)
            r13.invoke(r3, r4)
            kotlinx.coroutines.channels.Channel r3 = r5.j
            kotlinx.coroutines.selects.SelectClause1 r11 = r3.getOnReceive()
            androidx.compose.foundation.gestures.b2 r3 = new androidx.compose.foundation.gestures.b2
            r9 = 4
            r10 = 2
            r4 = 2
            java.lang.Class<com.appsalt.internal.f> r6 = com.appsalt.internal.f.class
            java.lang.String r7 = "clean"
            java.lang.String r8 = "clean-iX-rlTc(Ljava/lang/String;)Ljava/lang/Object;"
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r13.invoke(r11, r3)
            r0.e = r5
            r0.y = r1
            r0.B = r2
            java.lang.Object r13 = r13.doSelect(r0)
            kotlin.coroutines.intrinsics.a r3 = kotlin.coroutines.intrinsics.a.e
            if (r13 != r3) goto L84
            return r3
        L84:
            kotlin.m r13 = (kotlin.m) r13
            java.lang.Object r13 = r13.e
            java.lang.Throwable r3 = kotlin.m.a(r13)
            if (r3 == 0) goto L41
            r3 = 0
            r1.e = r3
            goto L41
        L92:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsalt.internal.f.e(kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }
}
