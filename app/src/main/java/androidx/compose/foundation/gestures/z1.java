package androidx.compose.foundation.gestures;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class z1 implements androidx.compose.ui.input.nestedscroll.a, com.google.firebase.crashlytics.internal.metadata.k {
    public boolean e;
    public Object y;

    public z1() {
        this.y = new SparseBooleanArray();
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.k
    public void a(com.google.firebase.crashlytics.internal.metadata.j jVar, int i) {
        StringBuilder sb = (StringBuilder) this.y;
        if (this.e) {
            this.e = false;
        } else {
            sb.append(", ");
        }
        sb.append(i);
    }

    public void b(int i) {
        com.google.android.material.motion.a.q(!this.e);
        ((SparseBooleanArray) this.y).append(i, true);
    }

    public androidx.media3.common.o c() {
        com.google.android.material.motion.a.q(!this.e);
        this.e = true;
        return new androidx.media3.common.o((SparseBooleanArray) this.y);
    }

    public boolean d() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0039  */
    public boolean e(CharSequence charSequence, int i) {
        char c = 0;
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            net.luminis.tls.engine.impl.c.a();
            return false;
        }
        androidx.core.text.e eVar = (androidx.core.text.e) this.y;
        if (eVar == null) {
            return d();
        }
        eVar.getClass();
        c = 2;
        for (int i2 = 0; i2 < i && c == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            z1 z1Var = androidx.core.text.f.a;
            if (directionality == 0) {
                c = 1;
                continue;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case 14:
                    case 15:
                        c = 1;
                        continue;
                    case 16:
                    case 17:
                        break;
                    default:
                        c = 2;
                        continue;
                }
            }
        }
        if (c == 0) {
            return true;
        }
        if (c != 1) {
            return d();
        }
        return false;
    }

    public void f() {
        this.e = false;
    }

    public void g(byte b) {
        ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l) this.y).p(String.valueOf(b));
    }

    public void h(char c) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l) this.y;
        lVar.e(lVar.y, 1);
        char[] cArr = (char[]) lVar.z;
        int i = lVar.y;
        lVar.y = i + 1;
        cArr[i] = c;
    }

    public void i(int i) {
        ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l) this.y).p(String.valueOf(i));
    }

    public void j(long j) {
        ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l) this.y).p(String.valueOf(j));
    }

    public void k(short s) {
        ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l) this.y).p(String.valueOf(s));
    }

    public void l(String str) {
        byte b;
        str.getClass();
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l) this.y;
        lVar.e(lVar.y, str.length() + 2);
        char[] cArr = (char[]) lVar.z;
        int i = lVar.y;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = kotlinx.serialization.json.internal.p.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    lVar.e(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr2 = kotlinx.serialization.json.internal.p.b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ((char[]) lVar.z)[i4] = cCharAt;
                        i4 = i6;
                    } else if (b == 1) {
                        String str2 = kotlinx.serialization.json.internal.p.a[cCharAt];
                        str2.getClass();
                        lVar.e(i4, str2.length());
                        str2.getChars(0, str2.length(), (char[]) lVar.z, i4);
                        int length3 = str2.length() + i4;
                        lVar.y = length3;
                        i4 = length3;
                    } else {
                        char[] cArr2 = (char[]) lVar.z;
                        cArr2[i4] = '\\';
                        cArr2[i4 + 1] = (char) b;
                        i4 += 2;
                        lVar.y = i4;
                    }
                }
                lVar.e(i4, 1);
                ((char[]) lVar.z)[i4] = '\"';
                lVar.y = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        lVar.y = i3 + 1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.a
    public Object m(long j, long j2, kotlin.coroutines.d dVar) throws Throwable {
        y1 y1Var;
        long jD;
        if (dVar instanceof y1) {
            y1Var = (y1) dVar;
            int i = y1Var.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                y1Var.A = i - Integer.MIN_VALUE;
            } else {
                y1Var = new y1(this, (kotlin.coroutines.jvm.internal.c) dVar);
            }
        } else {
            y1Var = new y1(this, (kotlin.coroutines.jvm.internal.c) dVar);
        }
        Object objA = y1Var.y;
        int i2 = y1Var.A;
        if (i2 == 0) {
            kotlin.a.e(objA);
            jD = 0;
            if (this.e) {
                m2 m2Var = (m2) this.y;
                if (!m2Var.i) {
                    y1Var.e = j2;
                    y1Var.A = 1;
                    objA = m2Var.a(j2, y1Var);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objA == aVar) {
                        return aVar;
                    }
                }
                jD = androidx.compose.ui.unit.q.d(j2, jD);
            }
            return new androidx.compose.ui.unit.q(jD);
        }
        if (i2 != 1) {
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = y1Var.e;
        kotlin.a.e(objA);
        jD = ((androidx.compose.ui.unit.q) objA).a;
        jD = androidx.compose.ui.unit.q.d(j2, jD);
        return new androidx.compose.ui.unit.q(jD);
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public long n0(long j, long j2, int i) {
        if (!this.e) {
            return 0L;
        }
        m2 m2Var = (m2) this.y;
        if (m2Var.a.a()) {
            return 0L;
        }
        return m2Var.h(m2Var.d(m2Var.a.e(m2Var.d(m2Var.g(j2)))));
    }

    public /* synthetic */ z1(Object obj, boolean z) {
        this.y = obj;
        this.e = z;
    }

    public /* synthetic */ z1(Object obj) {
        this.y = obj;
        this.e = true;
    }

    public z1(androidx.core.text.e eVar, boolean z) {
        this.y = eVar;
        this.e = z;
    }

    public void n() {
    }

    public void o() {
    }
}
