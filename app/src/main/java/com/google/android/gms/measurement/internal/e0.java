package com.google.android.gms.measurement.internal;

import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e0 implements y, com.google.firebase.components.e, com.google.android.gms.tasks.h, com.google.firebase.crashlytics.internal.stacktrace.a, androidx.lifecycle.viewmodel.b {
    public final /* synthetic */ int e;
    public static final /* synthetic */ e0 y = new e0(0);
    public static final /* synthetic */ e0 z = new e0(1);
    public static final /* synthetic */ e0 A = new e0(2);
    public static final /* synthetic */ e0 B = new e0(3);
    public static final /* synthetic */ e0 C = new e0(4);
    public static final /* synthetic */ e0 D = new e0(5);
    public static final /* synthetic */ e0 E = new e0(6);
    public static final /* synthetic */ e0 F = new e0(7);
    public static final /* synthetic */ e0 G = new e0(8);

    public /* synthetic */ e0(int i) {
        this.e = i;
    }

    public static final String d(okio.i iVar, okio.i[] iVarArr, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        okio.i iVar2 = okhttp3.internal.publicsuffix.a.b;
        int iF = iVar.f();
        int i5 = 0;
        while (i5 < iF) {
            int i6 = (i5 + iF) / 2;
            while (i6 > -1 && iVar.k(i6) != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (iVar.k(i2) == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z3 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z3) {
                    i3 = 46;
                    z2 = false;
                } else {
                    byte bK = iVarArr[i10].k(i11);
                    byte[] bArr = okhttp3.internal.e.a;
                    int i13 = bK & 255;
                    z2 = z3;
                    i3 = i13;
                }
                byte bK2 = iVar.k(i7 + i12);
                byte[] bArr2 = okhttp3.internal.e.a;
                i4 = i3 - (bK2 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (iVarArr[i10].f() != i11) {
                    z3 = z2;
                } else {
                    if (i10 == iVarArr.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z3 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int iF2 = iVarArr[i10].f() - i11;
                    int length = iVarArr.length;
                    for (int i15 = i10 + 1; i15 < length; i15++) {
                        iF2 += iVarArr[i15].f();
                    }
                    if (iF2 >= i14) {
                        if (iF2 <= i14) {
                            return iVar.q(i7, i9 + i7).p(kotlin.text.a.a);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            iF = i6;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d6 A[RETURN] */
    public static okio.i f(String str) {
        int i;
        char cCharAt;
        str.getClass();
        byte[] bArr = okio.a.a;
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i2 = (int) ((((long) length) * 6) / 8);
        byte[] bArrCopyOf = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i3 >= length) {
                int i7 = i4 % 4;
                if (i7 != 1) {
                    if (i7 == 2) {
                        bArrCopyOf[i6] = (byte) ((i5 << 12) >> 16);
                        i6++;
                    } else if (i7 == 3) {
                        int i8 = i5 << 6;
                        int i9 = i6 + 1;
                        bArrCopyOf[i6] = (byte) (i8 >> 16);
                        i6 += 2;
                        bArrCopyOf[i9] = (byte) (i8 >> 8);
                    }
                    if (i6 != i2) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i6);
                    }
                }
                if (bArrCopyOf != null) {
                    return new okio.i(bArrCopyOf);
                }
                return null;
            }
            char cCharAt2 = str.charAt(i3);
            if ('A' <= cCharAt2 && cCharAt2 < '[') {
                i = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                i = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                i = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i = 62;
            } else {
                if (cCharAt2 != '/' && cCharAt2 != '_') {
                    if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                        break;
                    }
                } else {
                    i = 63;
                }
                i3++;
            }
            i5 = (i5 << 6) | i;
            i4++;
            if (i4 % 4 == 0) {
                bArrCopyOf[i6] = (byte) (i5 >> 16);
                int i10 = i6 + 2;
                bArrCopyOf[i6 + 1] = (byte) (i5 >> 8);
                i6 += 3;
                bArrCopyOf[i10] = (byte) i5;
            }
            i3++;
        }
        bArrCopyOf = null;
        if (bArrCopyOf != null) {
            return new okio.i(bArrCopyOf);
        }
        return null;
    }

    public static okio.i g(String str) {
        if (str.length() % 2 != 0) {
            net.luminis.tls.engine.impl.c.p("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (okio.internal.b.a(str.charAt(i2 + 1)) + (okio.internal.b.a(str.charAt(i2)) << 4));
        }
        return new okio.i(bArr);
    }

    public static okio.i h(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(kotlin.text.a.a);
        bytes.getClass();
        okio.i iVar = new okio.i(bytes);
        iVar.z = str;
        return iVar;
    }

    public static okio.i i(byte[] bArr) {
        okio.i iVar = okio.i.A;
        bArr.getClass();
        int length = bArr.length;
        okio.b.d(bArr.length, 0, length);
        return new okio.i(kotlin.collections.n.I(bArr, 0, length));
    }

    @Override // com.google.android.gms.measurement.internal.y
    public Object a() {
        switch (this.e) {
            case 0:
                List list = h0.a;
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.h3.a.get()).longValue());
            case 1:
                List list2 = h0.a;
                return (Boolean) com.google.android.gms.internal.measurement.p4.a.get();
            case 2:
                List list3 = h0.a;
                com.google.android.gms.internal.measurement.g4.y.get();
                return (Boolean) com.google.android.gms.internal.measurement.h4.a.b(6, "measurement.rb.attribution.service", true).get();
            case 3:
                List list4 = h0.a;
                com.google.android.gms.internal.measurement.g4.y.get();
                return (Boolean) com.google.android.gms.internal.measurement.h4.a.b(7, "measurement.rb.attribution.enable_trigger_redaction", true).get();
            case 4:
                List list5 = h0.a;
                com.google.android.gms.internal.measurement.g4.y.get();
                return (Boolean) com.google.android.gms.internal.measurement.h4.a.b(2, "measurement.rb.attribution.service.trigger_uris_high_priority", true).get();
            case 5:
                List list6 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(71, 100000L, "measurement.upload.max_events_per_day").get()).longValue());
            case 6:
                return new Boolean(((Boolean) com.google.android.gms.internal.measurement.y3.b.get()).booleanValue());
            default:
                return new Boolean(((Boolean) com.google.android.gms.internal.measurement.r4.a.get()).booleanValue());
        }
    }

    @Override // com.google.firebase.components.e
    public /* synthetic */ Object b(com.caverock.androidsvg.y1 y1Var) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(y1Var);
    }

    @Override // com.google.firebase.crashlytics.internal.stacktrace.a
    public StackTraceElement[] c(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // com.google.android.gms.tasks.h
    public com.google.android.gms.tasks.q e(Object obj) {
        return kotlin.math.a.t(Boolean.TRUE);
    }

    public List j(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (com.google.firebase.components.b bVar : componentRegistrar.getComponents()) {
            String str = bVar.a;
            if (str != null) {
                bVar = new com.google.firebase.components.b(str, bVar.b, bVar.c, bVar.d, bVar.e, new androidx.media3.exoplayer.analytics.c(12, str, bVar), bVar.g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }
}
