package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class we implements qf {
    public final String A;
    public Thread B;
    public final we e;
    public final UUID y;
    public final String z;

    public we(String str, we weVar, pf pfVar) {
        this.A = str;
        this.e = weVar;
        this.y = weVar.y;
        this.z = weVar.z;
        this.B = Thread.currentThread();
    }

    public static String a(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        pf pfVarC = bf.c();
        qf qfVar = pfVarC.b;
        String str = this.A;
        if (qfVar == null) {
            throw new androidx.media3.common.s(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.k(new StringBuilder(str.length() + Token.ASSIGN_LOGICAL_OR), "Tried to end [", str, "], but no trace was active. This is caused by mismatched or missing calls to beginSpan."));
        }
        if (this == qfVar) {
            bf.b(pfVarC, ((we) qfVar).e);
            this.B = null;
            return;
        }
        String str2 = ((we) qfVar).A;
        StringBuilder sb = new StringBuilder(str.length() + 79 + str2.length() + 1);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.y(sb, "Tried to end span ", str, ", but that span is not the current span. The current span is ", str2);
        sb.append(".");
        throw new androidx.media3.common.s(sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:140:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0073  */
    /* JADX WARN: Code duplicated, block: B:76:0x020e  */
    public final String toString() {
        int i;
        int i2;
        androidx.media3.container.j jVar;
        Iterator it;
        nf nfVar;
        int i3;
        of ofVar;
        AtomicReference atomicReference = bf.a;
        we weVar = this;
        int i4 = 0;
        int length = 0;
        while (weVar != null) {
            i4++;
            length += weVar.A.length();
            weVar = weVar.e;
            if (weVar != null) {
                length += 4;
            }
        }
        if (i4 > 250) {
            String[] strArr = new String[i4];
            we weVar2 = this;
            for (int i5 = i4 - 1; i5 >= 0; i5--) {
                strArr[i5] = weVar2.A;
                weVar2 = weVar2.e;
            }
            androidx.appcompat.widget.x xVarA = com.google.common.collect.f1.a();
            int i6 = 1;
            com.google.common.collect.p1 it2 = (i4 != 0 ? i4 != 1 ? com.google.common.collect.k0.k(i4, (Object[]) strArr.clone()) : new com.google.common.collect.n1(strArr[0]) : com.google.common.collect.h1.G).iterator();
            int i7 = 0;
            while (it2.hasNext()) {
                xVarA.q(it2.next(), Integer.valueOf(i7));
                i7++;
            }
            com.google.common.collect.f1 f1VarE = xVarA.e(true);
            int i8 = f1VarE.C;
            int i9 = i4 >> 2;
            if (i8 > i9) {
                jVar = null;
            } else {
                int i10 = i4 + 1;
                int[] iArr = new int[i10];
                for (int i11 = 0; i11 < i4; i11++) {
                    iArr[i11] = ((Integer) f1VarE.get(strArr[i11])).intValue();
                }
                iArr[i4] = i8;
                androidx.emoji2.text.s sVar = new androidx.emoji2.text.s(iArr);
                int i12 = 0;
                while (true) {
                    int i13 = -1;
                    if (i12 >= i10) {
                        break;
                    }
                    sVar.d += i6;
                    int i14 = iArr[i12];
                    while (true) {
                        of ofVar2 = null;
                        while (true) {
                            if (sVar.d <= 0) {
                                i3 = i6;
                                break;
                            }
                            int i15 = sVar.c;
                            ofVar = (of) sVar.g;
                            i3 = i6;
                            if (i15 == 0) {
                                break;
                            }
                            int i16 = ((of) ofVar.d.get(Integer.valueOf(iArr[sVar.b]))).a;
                            int i17 = sVar.c;
                            if (iArr[i16 + i17] == i14) {
                                if (ofVar2 != null) {
                                    ofVar2.c = (of) sVar.g;
                                }
                                sVar.c = i17 + 1;
                                sVar.c();
                                break;
                            }
                            of ofVar3 = (of) ((of) sVar.g).d.get(Integer.valueOf(iArr[sVar.b]));
                            int i18 = ofVar3.a;
                            int i19 = i13;
                            of ofVar4 = new of(i18, (sVar.c + i18) - 1);
                            ((of) sVar.g).d.put(Integer.valueOf(iArr[sVar.b]), ofVar4);
                            int i20 = ofVar4.b + 1;
                            Integer numValueOf = Integer.valueOf(iArr[i20]);
                            HashMap map = ofVar4.d;
                            map.put(numValueOf, ofVar3);
                            ofVar3.a = i20;
                            if (ofVar2 != null) {
                                ofVar2.c = ofVar4;
                            }
                            map.put(Integer.valueOf(i14), new of(i12, 1073741824));
                            sVar.d--;
                            sVar.d();
                            ofVar2 = ofVar4;
                            i6 = i3;
                            i13 = i19;
                        }
                        HashMap map2 = ofVar.d;
                        Integer numValueOf2 = Integer.valueOf(i14);
                        if (map2.containsKey(numValueOf2)) {
                            if (ofVar2 != null) {
                                ofVar2.c = (of) sVar.g;
                            }
                            sVar.b = i12;
                            sVar.c++;
                            sVar.c();
                            break;
                        }
                        ((of) sVar.g).d.put(numValueOf2, new of(i12, 1073741824));
                        if (ofVar2 != null) {
                            ofVar2.c = (of) sVar.g;
                        }
                        sVar.d += i13;
                        sVar.d();
                        i6 = i3;
                    }
                    i12++;
                    i6 = i3;
                }
                int i21 = i6;
                ArrayDeque arrayDeque = new ArrayDeque();
                of ofVar5 = (of) sVar.f;
                nf nfVar2 = new nf(ofVar5, 0, -1, -1);
                arrayDeque.push(nfVar2);
                while (!arrayDeque.isEmpty()) {
                    nf nfVar3 = (nf) arrayDeque.pop();
                    Iterator it3 = nfVar3.d.d.values().iterator();
                    while (it3.hasNext()) {
                        of ofVar6 = (of) it3.next();
                        int i22 = nfVar3.b;
                        int i23 = nfVar3.c;
                        int i24 = ofVar6.a;
                        of ofVar7 = ofVar5;
                        int i25 = ofVar6.b;
                        if (sVar.g(i22, i23, i24, i25)) {
                            it = it3;
                        } else {
                            if (ofVar6.d.isEmpty()) {
                                int i26 = ofVar6.a;
                                it = it3;
                                if (sVar.g(i22, i23, i26, (i26 + i23) - i22)) {
                                }
                                if (nfVar2.a < nfVar.a) {
                                    nfVar2 = nfVar;
                                }
                                arrayDeque.push(nfVar);
                                ofVar5 = ofVar7;
                                it3 = it;
                                i21 = 1;
                            } else {
                                it = it3;
                            }
                            nfVar = new nf(ofVar6, i21, ofVar6.a, i25);
                            if (nfVar2.a < nfVar.a) {
                                nfVar2 = nfVar;
                            }
                            arrayDeque.push(nfVar);
                            ofVar5 = ofVar7;
                            it3 = it;
                            i21 = 1;
                        }
                        nfVar = new nf(ofVar6, nfVar3.a + i21, i22, i23);
                        if (nfVar2.a < nfVar.a) {
                            nfVar2 = nfVar;
                        }
                        arrayDeque.push(nfVar);
                        ofVar5 = ofVar7;
                        it3 = it;
                        i21 = 1;
                    }
                    i21 = 1;
                }
                int iMin = Math.min(iArr.length, nfVar2.c + 1);
                int i27 = 0;
                loop9: while (true) {
                    i = nfVar2.b;
                    i2 = iMin - i;
                    ofVar5 = (of) ofVar5.d.get(Integer.valueOf(iArr[(i27 % i2) + i]));
                    if (ofVar5 == null) {
                        break;
                    }
                    for (int i28 = ofVar5.a; i28 < ofVar5.b + 1 && i28 < iArr.length; i28++) {
                        if (iArr[(i27 % i2) + i] != iArr[i28]) {
                            break loop9;
                        }
                        i27++;
                    }
                }
                int i29 = i27 / i2;
                androidx.media3.container.j jVar2 = new androidx.media3.container.j(i, iMin, i29);
                if (i2 * i29 < i9) {
                    jVar = null;
                } else {
                    jVar = jVar2;
                }
            }
            String strConcat = "";
            if (jVar != null) {
                int i30 = jVar.a;
                String strConcat2 = i30 > 0 ? String.valueOf(TextUtils.join(" -> ", Arrays.copyOf(strArr, i30))).concat(" -> ") : "";
                int i31 = jVar.b;
                int i32 = jVar.c;
                int i33 = ((i31 - i30) * i32) + i30;
                strConcat = i33 < i4 ? " -> ".concat(String.valueOf(TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i33, i4)))) : "";
                String strJoin = TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i30, i31));
                Locale locale = Locale.US;
                strConcat = strConcat2 + "{" + strJoin + "}x" + i32 + strConcat;
            }
            if (!strConcat.isEmpty()) {
                return strConcat;
            }
        }
        char[] cArr = new char[length];
        we weVar3 = this;
        while (weVar3 != null) {
            String str = weVar3.A;
            length -= str.length();
            str.getChars(0, str.length(), cArr, length);
            weVar3 = weVar3.e;
            if (weVar3 != null) {
                length -= 4;
                " -> ".getChars(0, 4, cArr, length);
            }
        }
        return new String(cArr);
    }

    public we(String str, UUID uuid, String str2, pf pfVar) {
        this.A = str;
        this.e = null;
        this.y = uuid;
        this.z = str2;
        pfVar.getClass();
        this.B = Thread.currentThread();
    }
}
