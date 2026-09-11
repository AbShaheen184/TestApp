package androidx.compose.foundation;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import com.app.mlounge.data.remote.model.MusicGenre;
import com.app.mlounge.data.remote.model.TmdbGenre;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.j implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Object obj, int i) {
        super(1, 0, com.app.mlounge.ui.viewmodel.k.class, obj, "setXtreamUseBuiltinEpg", "setXtreamUseBuiltinEpg(Z)V");
        this.e = i;
        switch (i) {
            case 19:
                super(1, 0, com.app.mlounge.ui.viewmodel.k.class, obj, "setXtreamUsername", "setXtreamUsername(Ljava/lang/String;)V");
                break;
            case 20:
                super(1, 0, com.app.mlounge.ui.viewmodel.k.class, obj, "setXtreamPort", "setXtreamPort(Ljava/lang/String;)V");
                break;
            case 21:
                super(1, 0, com.app.mlounge.ui.viewmodel.k.class, obj, "setXtreamPassword", "setXtreamPassword(Ljava/lang/String;)V");
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0444 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x0446 A[LOOP:0: B:118:0x03f2->B:130:0x0446, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:140:0x0449 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0358  */
    /* JADX WARN: Code duplicated, block: B:90:0x0368  */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) throws Throwable {
        androidx.compose.ui.text.input.a aVar;
        androidx.compose.foundation.text.j0 j0VarA;
        Integer numValueOf;
        switch (this.e) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                j jVar = (j) this.receiver;
                androidx.collection.c0 c0Var = jVar.a0;
                if (zBooleanValue) {
                    jVar.V0();
                } else {
                    kotlin.coroutines.d dVar = null;
                    if (jVar.N != null) {
                        Object[] objArr = c0Var.c;
                        long[] jArr = c0Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8;
                                    int i3 = 8 - ((~(i - length)) >>> 31);
                                    int i4 = 0;
                                    while (i4 < i3) {
                                        if ((255 & j) < 128) {
                                            BuildersKt__Builders_commonKt.launch$default(jVar.z0(), null, null, new h(jVar, (androidx.compose.foundation.interaction.m) objArr[(i << 3) + i4], dVar, 0), 3, null);
                                        }
                                        j >>= i2;
                                        i4++;
                                        i2 = i2;
                                    }
                                    if (i3 == i2) {
                                        if (i != length) {
                                            i++;
                                        }
                                    }
                                } else if (i != length) {
                                    i++;
                                }
                            }
                        }
                        androidx.compose.foundation.interaction.m mVar = jVar.c0;
                        if (mVar != null) {
                            BuildersKt__Builders_commonKt.launch$default(jVar.z0(), null, null, new h(jVar, mVar, dVar, 1), 3, null);
                        }
                    }
                    c0Var.a();
                    jVar.c0 = null;
                    jVar.W0();
                }
                return kotlin.y.a;
            case 1:
                KeyEvent keyEvent = ((androidx.compose.ui.input.key.b) obj).a;
                androidx.compose.foundation.text.b1 b1Var = (androidx.compose.foundation.text.b1) this.receiver;
                androidx.compose.foundation.text.selection.i1 i1Var = b1Var.f;
                boolean z = b1Var.d;
                boolean z2 = true;
                if (keyEvent.getAction() != 0 || Character.isISOControl(keyEvent.getUnicodeChar())) {
                    aVar = null;
                } else {
                    androidx.compose.foundation.text.d0 d0Var = b1Var.i;
                    d0Var.getClass();
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                        d0Var.a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                        numValueOf = null;
                    } else {
                        Integer num = d0Var.a;
                        if (num != null) {
                            d0Var.a = null;
                            int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                            Integer numValueOf2 = Integer.valueOf(deadChar);
                            if (deadChar == 0) {
                                numValueOf2 = null;
                            }
                            if (numValueOf2 != null) {
                                unicodeChar = numValueOf2.intValue();
                            }
                            numValueOf = Integer.valueOf(unicodeChar);
                        } else {
                            numValueOf = Integer.valueOf(unicodeChar);
                        }
                    }
                    if (numValueOf != null) {
                        aVar = new androidx.compose.ui.text.input.a(new StringBuilder().appendCodePoint(numValueOf.intValue()).toString(), 1);
                    } else {
                        aVar = null;
                    }
                }
                if (aVar != null) {
                    if (z) {
                        b1Var.a(com.google.common.base.c.p(aVar));
                        i1Var.a = null;
                    } else {
                        z2 = false;
                    }
                } else if (androidx.compose.ui.input.key.c.c(keyEvent) != 2 || (j0VarA = b1Var.j.a(keyEvent)) == null || (j0VarA.e && !z)) {
                    z2 = false;
                } else {
                    kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
                    vVar.e = true;
                    androidx.compose.animation.core.a aVar2 = new androidx.compose.animation.core.a(5, j0VarA, b1Var, vVar);
                    androidx.compose.ui.text.input.x xVar = b1Var.c;
                    androidx.compose.foundation.text.selection.t0 t0Var = new androidx.compose.foundation.text.selection.t0(xVar, b1Var.g, b1Var.a.d(), i1Var);
                    aVar2.invoke(t0Var);
                    if (!androidx.compose.ui.text.l0.b(t0Var.f, xVar.b) || !kotlin.jvm.internal.l.a(t0Var.g, xVar.a)) {
                        b1Var.k.invoke(androidx.compose.ui.text.input.x.a(xVar, t0Var.g, t0Var.f, 4));
                    }
                    androidx.compose.foundation.text.l1 l1Var = b1Var.h;
                    if (l1Var != null) {
                        l1Var.e = true;
                    }
                    z2 = vVar.e;
                }
                return Boolean.valueOf(z2);
            case 2:
                long j2 = ((androidx.compose.ui.geometry.b) obj).a;
                androidx.compose.foundation.text.contextmenu.modifier.g gVar = (androidx.compose.foundation.text.contextmenu.modifier.g) this.receiver;
                gVar.getClass();
                androidx.compose.foundation.text.contextmenu.provider.f fVar = (androidx.compose.foundation.text.contextmenu.provider.f) androidx.compose.ui.node.k.h(gVar, androidx.compose.foundation.text.contextmenu.provider.g.a);
                if (fVar != null) {
                    BuildersKt__Builders_commonKt.launch$default(gVar.z0(), null, null, new d(gVar, j2, fVar, new androidx.compose.foundation.text.contextmenu.modifier.f(gVar, j2), null, 4), 3, null);
                }
                return kotlin.y.a;
            case 3:
                ((androidx.compose.foundation.text.contextmenu.builder.a) this.receiver).b.a((kotlin.jvm.functions.l) obj);
                return kotlin.y.a;
            case 4:
                ((Set) obj).getClass();
                androidx.room.f fVar2 = (androidx.room.f) this.receiver;
                ReentrantLock reentrantLock = fVar2.d;
                reentrantLock.lock();
                try {
                    List listK0 = kotlin.collections.o.k0(fVar2.c.values());
                    reentrantLock.unlock();
                    Iterator it = listK0.iterator();
                    if (!it.hasNext()) {
                        return kotlin.y.a;
                    }
                    ((androidx.room.l) it.next()).getClass();
                    throw null;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 5:
                return coil3.network.n.b((coil3.network.n) this.receiver, (kotlin.coroutines.d) obj);
            case 6:
                String str = (String) obj;
                str.getClass();
                com.app.mlounge.ui.viewmodel.g gVar2 = (com.app.mlounge.ui.viewmodel.g) this.receiver;
                gVar2.getClass();
                gVar2.p.setValue(str);
                gVar2.e();
                return kotlin.y.a;
            case 7:
                com.app.mlounge.ui.viewmodel.e0 e0Var = (com.app.mlounge.ui.viewmodel.e0) this.receiver;
                e0Var.q.setValue((TmdbGenre) obj);
                e0Var.g();
                return kotlin.y.a;
            case 8:
                com.app.mlounge.ui.viewmodel.e0 e0Var2 = (com.app.mlounge.ui.viewmodel.e0) this.receiver;
                e0Var2.s.setValue((String) obj);
                e0Var2.g();
                return kotlin.y.a;
            case 9:
                com.app.mlounge.ui.viewmodel.e0 e0Var3 = (com.app.mlounge.ui.viewmodel.e0) this.receiver;
                e0Var3.u.setValue((Integer) obj);
                e0Var3.g();
                return kotlin.y.a;
            case 10:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                com.app.mlounge.ui.viewmodel.e0 e0Var4 = (com.app.mlounge.ui.viewmodel.e0) this.receiver;
                e0Var4.w.setValue(bool);
                e0Var4.g();
                return kotlin.y.a;
            case 11:
                String str2 = (String) obj;
                str2.getClass();
                com.app.mlounge.ui.viewmodel.h0 h0Var = (com.app.mlounge.ui.viewmodel.h0) this.receiver;
                h0Var.getClass();
                h0Var.r.setValue(str2);
                h0Var.c.b(str2);
                h0Var.g();
                h0Var.f();
                return kotlin.y.a;
            case 12:
                MusicGenre musicGenre = (MusicGenre) obj;
                musicGenre.getClass();
                com.app.mlounge.ui.viewmodel.h0 h0Var2 = (com.app.mlounge.ui.viewmodel.h0) this.receiver;
                h0Var2.getClass();
                h0Var2.n.setValue(musicGenre);
                h0Var2.g();
                h0Var2.f();
                return kotlin.y.a;
            case 13:
                String str3 = (String) obj;
                str3.getClass();
                com.app.mlounge.ui.viewmodel.h0 h0Var3 = (com.app.mlounge.ui.viewmodel.h0) this.receiver;
                h0Var3.getClass();
                h0Var3.p.setValue(str3);
                h0Var3.g();
                h0Var3.f();
                return kotlin.y.a;
            case 14:
                String str4 = (String) obj;
                str4.getClass();
                ((com.app.mlounge.ui.viewmodel.y0) this.receiver).n(str4);
                return kotlin.y.a;
            case 15:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                com.app.mlounge.ui.viewmodel.k kVar = (com.app.mlounge.ui.viewmodel.k) this.receiver;
                kVar.getClass();
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(kVar), null, null, new androidx.compose.foundation.text.selection.x0(kVar, zBooleanValue2, null, 1), 3, null);
                return kotlin.y.a;
            case 16:
                String str5 = (String) obj;
                str5.getClass();
                com.app.mlounge.ui.viewmodel.k kVar2 = (com.app.mlounge.ui.viewmodel.k) this.receiver;
                kVar2.getClass();
                kVar2.e.setValue(str5);
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(kVar2), null, null, new com.app.mlounge.ui.viewmodel.j(kVar2, str5, null, 3), 3, null);
                return kotlin.y.a;
            case 17:
                String str6 = (String) obj;
                str6.getClass();
                com.app.mlounge.ui.viewmodel.k kVar3 = (com.app.mlounge.ui.viewmodel.k) this.receiver;
                kVar3.getClass();
                kVar3.g.setValue(str6);
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(kVar3), null, null, new com.app.mlounge.ui.viewmodel.j(kVar3, str6, null, 0), 3, null);
                return kotlin.y.a;
            case 18:
                String str7 = (String) obj;
                str7.getClass();
                com.app.mlounge.ui.viewmodel.k kVar4 = (com.app.mlounge.ui.viewmodel.k) this.receiver;
                kVar4.getClass();
                kVar4.i.setValue(str7);
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(kVar4), null, null, new com.app.mlounge.ui.viewmodel.j(kVar4, str7, null, 5), 3, null);
                return kotlin.y.a;
            case 19:
                String str8 = (String) obj;
                str8.getClass();
                com.app.mlounge.ui.viewmodel.k kVar5 = (com.app.mlounge.ui.viewmodel.k) this.receiver;
                kVar5.getClass();
                kVar5.m.setValue(str8);
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(kVar5), null, null, new com.app.mlounge.ui.viewmodel.j(kVar5, str8, null, 8), 3, null);
                return kotlin.y.a;
            case 20:
                String str9 = (String) obj;
                str9.getClass();
                com.app.mlounge.ui.viewmodel.k kVar6 = (com.app.mlounge.ui.viewmodel.k) this.receiver;
                kVar6.getClass();
                kVar6.k.setValue(str9);
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(kVar6), null, null, new com.app.mlounge.ui.viewmodel.j(kVar6, str9, null, 7), 3, null);
                return kotlin.y.a;
            case 21:
                String str10 = (String) obj;
                str10.getClass();
                com.app.mlounge.ui.viewmodel.k kVar7 = (com.app.mlounge.ui.viewmodel.k) this.receiver;
                kVar7.getClass();
                kVar7.o.setValue(str10);
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(kVar7), null, null, new com.app.mlounge.ui.viewmodel.j(kVar7, str10, null, 6), 3, null);
                return kotlin.y.a;
            case 22:
                com.app.mlounge.ui.viewmodel.x1 x1Var = (com.app.mlounge.ui.viewmodel.x1) this.receiver;
                x1Var.w.setValue((TmdbGenre) obj);
                x1Var.f();
                return kotlin.y.a;
            case 23:
                com.app.mlounge.ui.viewmodel.x1 x1Var2 = (com.app.mlounge.ui.viewmodel.x1) this.receiver;
                x1Var2.y.setValue((String) obj);
                x1Var2.f();
                return kotlin.y.a;
            case 24:
                com.app.mlounge.ui.viewmodel.x1 x1Var3 = (com.app.mlounge.ui.viewmodel.x1) this.receiver;
                x1Var3.A.setValue((Integer) obj);
                x1Var3.f();
                return kotlin.y.a;
            case 25:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                com.app.mlounge.ui.viewmodel.x1 x1Var4 = (com.app.mlounge.ui.viewmodel.x1) this.receiver;
                x1Var4.C.setValue(bool2);
                x1Var4.f();
                return kotlin.y.a;
            default:
                com.app.mlounge.ui.viewmodel.y1 y1Var = (com.app.mlounge.ui.viewmodel.y1) obj;
                y1Var.getClass();
                com.app.mlounge.ui.viewmodel.z1 z1Var = (com.app.mlounge.ui.viewmodel.z1) this.receiver;
                z1Var.getClass();
                z1Var.n.setValue(y1Var);
                return kotlin.y.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.e = i3;
    }
}
