package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.os.Parcel;
import android.os.Process;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j5 implements com.google.android.gms.tasks.b, com.google.android.gms.common.api.internal.h, com.google.common.base.t, sd, com.google.common.util.concurrent.y {
    public final /* synthetic */ int e;
    public Object y;
    public Object z;

    public j5(int i) {
        this.e = i;
        switch (i) {
            case 7:
                break;
            case 11:
                this.y = new TreeMap();
                this.z = new TreeMap();
                break;
            default:
                this.y = new HashMap();
                this.z = new i5(6);
                i5 i5Var = new i5(0);
                m5 m5Var = m5.BITWISE_AND;
                ArrayList arrayList = i5Var.a;
                arrayList.add(m5Var);
                arrayList.add(m5.BITWISE_LEFT_SHIFT);
                arrayList.add(m5.BITWISE_NOT);
                arrayList.add(m5.BITWISE_OR);
                arrayList.add(m5.BITWISE_RIGHT_SHIFT);
                arrayList.add(m5.BITWISE_UNSIGNED_RIGHT_SHIFT);
                arrayList.add(m5.BITWISE_XOR);
                c(i5Var);
                i5 i5Var2 = new i5(1);
                m5 m5Var2 = m5.EQUALS;
                ArrayList arrayList2 = i5Var2.a;
                arrayList2.add(m5Var2);
                arrayList2.add(m5.GREATER_THAN);
                arrayList2.add(m5.GREATER_THAN_EQUALS);
                arrayList2.add(m5.IDENTITY_EQUALS);
                arrayList2.add(m5.IDENTITY_NOT_EQUALS);
                arrayList2.add(m5.LESS_THAN);
                arrayList2.add(m5.LESS_THAN_EQUALS);
                arrayList2.add(m5.NOT_EQUALS);
                c(i5Var2);
                i5 i5Var3 = new i5(2);
                m5 m5Var3 = m5.APPLY;
                ArrayList arrayList3 = i5Var3.a;
                arrayList3.add(m5Var3);
                arrayList3.add(m5.BLOCK);
                arrayList3.add(m5.BREAK);
                arrayList3.add(m5.CASE);
                arrayList3.add(m5.DEFAULT);
                arrayList3.add(m5.CONTINUE);
                arrayList3.add(m5.DEFINE_FUNCTION);
                arrayList3.add(m5.FN);
                arrayList3.add(m5.IF);
                arrayList3.add(m5.QUOTE);
                arrayList3.add(m5.RETURN);
                arrayList3.add(m5.SWITCH);
                arrayList3.add(m5.TERNARY);
                c(i5Var3);
                i5 i5Var4 = new i5(3);
                m5 m5Var4 = m5.AND;
                ArrayList arrayList4 = i5Var4.a;
                arrayList4.add(m5Var4);
                arrayList4.add(m5.NOT);
                arrayList4.add(m5.OR);
                c(i5Var4);
                i5 i5Var5 = new i5(4);
                m5 m5Var5 = m5.FOR_IN;
                ArrayList arrayList5 = i5Var5.a;
                arrayList5.add(m5Var5);
                arrayList5.add(m5.FOR_IN_CONST);
                arrayList5.add(m5.FOR_IN_LET);
                arrayList5.add(m5.FOR_LET);
                arrayList5.add(m5.FOR_OF);
                arrayList5.add(m5.FOR_OF_CONST);
                arrayList5.add(m5.FOR_OF_LET);
                arrayList5.add(m5.WHILE);
                c(i5Var5);
                i5 i5Var6 = new i5(5);
                m5 m5Var6 = m5.ADD;
                ArrayList arrayList6 = i5Var6.a;
                arrayList6.add(m5Var6);
                arrayList6.add(m5.DIVIDE);
                arrayList6.add(m5.MODULUS);
                arrayList6.add(m5.MULTIPLY);
                arrayList6.add(m5.NEGATE);
                arrayList6.add(m5.POST_DECREMENT);
                arrayList6.add(m5.POST_INCREMENT);
                arrayList6.add(m5.PRE_DECREMENT);
                arrayList6.add(m5.PRE_INCREMENT);
                arrayList6.add(m5.SUBTRACT);
                c(i5Var6);
                i5 i5Var7 = new i5(7);
                m5 m5Var7 = m5.ASSIGN;
                ArrayList arrayList7 = i5Var7.a;
                arrayList7.add(m5Var7);
                arrayList7.add(m5.CONST);
                arrayList7.add(m5.CREATE_ARRAY);
                arrayList7.add(m5.CREATE_OBJECT);
                arrayList7.add(m5.EXPRESSION_LIST);
                arrayList7.add(m5.GET);
                arrayList7.add(m5.GET_INDEX);
                arrayList7.add(m5.GET_PROPERTY);
                arrayList7.add(m5.NULL);
                arrayList7.add(m5.SET_PROPERTY);
                arrayList7.add(m5.TYPEOF);
                arrayList7.add(m5.UNDEFINED);
                arrayList7.add(m5.VAR);
                c(i5Var7);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.sd
    public Object a(rd rdVar) throws IOException {
        Uri uri = rdVar.d;
        AtomicLong atomicLong = he.a;
        int iMyPid = Process.myPid();
        long id = Thread.currentThread().getId();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long andIncrement = he.a.getAndIncrement();
        int length = String.valueOf(iMyPid).length();
        int length2 = String.valueOf(id).length();
        StringBuilder sb = new StringBuilder(length + 15 + length2 + 1 + String.valueOf(jCurrentTimeMillis).length() + 1 + String.valueOf(andIncrement).length());
        sb.append(".mobstore_tmp-");
        sb.append(iMyPid);
        sb.append("-");
        sb.append(id);
        sb.append("-");
        sb.append(jCurrentTimeMillis);
        sb.append("-");
        sb.append(andIncrement);
        Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(sb.toString())).build();
        ie ieVar = rdVar.a;
        ArrayList arrayListA = rdVar.a(ieVar.e(uriBuild));
        j5[] j5VarArr = (j5[]) this.z;
        if (j5VarArr != null) {
            j5VarArr[0].e(arrayListA);
        }
        try {
            OutputStream outputStream = (OutputStream) arrayListA.get(0);
            try {
                ((m0) this.y).b(outputStream);
                j5[] j5VarArr2 = (j5[]) this.z;
                if (j5VarArr2 != null) {
                    j5 j5Var = j5VarArr2[0];
                    if (((ce) j5Var.z) == null) {
                        throw new androidx.datastore.preferences.protobuf.i("Cannot sync underlying stream");
                    }
                    ((OutputStream) j5Var.y).flush();
                    ((ce) j5Var.z).e.getFD().sync();
                }
                outputStream.close();
                ieVar.g(uriBuild, uri);
                return null;
            } catch (Throwable th) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            try {
                ieVar.f(uriBuild);
            } catch (FileNotFoundException unused) {
            }
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            throw new IOException(e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.h
    public void accept(Object obj, Object obj2) {
        int i = z9.j;
        x9 x9Var = new x9((com.google.android.gms.tasks.j) obj2);
        aa aaVar = (aa) ((ba) obj).t();
        String[] strArr = (String[]) this.z;
        String str = (String) this.y;
        Parcel parcelH = aaVar.h();
        o5.c(parcelH, x9Var);
        parcelH.writeString(str);
        parcelH.writeInt(0);
        parcelH.writeStringArray(strArr);
        parcelH.writeByteArray(null);
        aaVar.G(parcelH, 1);
    }

    public ec b(int i, String str, boolean z) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.y;
        ec ecVar = (ec) atomicReferenceArray.get(i);
        if (ecVar != null) {
            return ecVar;
        }
        ac acVarC = ((s5) this.z).c(str, z);
        while (!atomicReferenceArray.compareAndSet(i, null, acVarC)) {
            if (atomicReferenceArray.get(i) != null) {
                ec ecVar2 = (ec) atomicReferenceArray.get(i);
                ecVar2.getClass();
                return ecVar2;
            }
        }
        return acVarC;
    }

    public void c(i5 i5Var) {
        Iterator it = i5Var.a.iterator();
        while (it.hasNext()) {
            ((HashMap) this.y).put(Integer.valueOf(((m5) it.next()).e).toString(), i5Var);
        }
    }

    @Override // com.google.common.util.concurrent.y
    public ListenableFuture call() {
        switch (this.e) {
            case 9:
                le leVar = (le) this.z;
                String strValueOf = String.valueOf(leVar.a);
                f1 f1Var = leVar.h;
                String strConcat = "Initialize ".concat(strValueOf);
                f1Var.getClass();
                jf jfVarE = f1.e(strConcat);
                try {
                    synchronized (leVar.g) {
                        try {
                            if (((List) this.y) == null) {
                                this.y = leVar.i;
                                leVar.i = Collections.EMPTY_LIST;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    ArrayList arrayList = new ArrayList(((List) this.y).size());
                    qe qeVar = new qe((le) this.z);
                    Iterator it = ((List) this.y).iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList.add(((com.google.common.util.concurrent.z) it.next()).apply(qeVar));
                        } catch (Exception e) {
                            arrayList.add(com.google.common.util.concurrent.n0.c(e));
                        }
                    }
                    com.google.common.collect.h0 h0VarN = com.google.common.collect.h0.n(arrayList);
                    a aVar = new a(this, 2);
                    com.google.common.util.concurrent.c0 c0Var = new com.google.common.util.concurrent.c0(h0VarN, true);
                    c0Var.K = new com.google.common.util.concurrent.b0(c0Var, aVar);
                    c0Var.s();
                    jfVarE.a(c0Var);
                    jfVarE.close();
                    return c0Var;
                } catch (Throwable th2) {
                    try {
                        jfVarE.close();
                        break;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            default:
                qf qfVar = (qf) this.y;
                pf pfVarC = bf.c();
                qf qfVarB = bf.b(pfVarC, qfVar);
                try {
                    ListenableFuture listenableFutureCall = ((com.google.common.util.concurrent.y) this.z).call();
                    bf.b(pfVarC, qfVarB);
                    listenableFutureCall.getClass();
                    return listenableFutureCall;
                } catch (Throwable th4) {
                    try {
                        af.a(th4);
                        throw th4;
                    } catch (Throwable th5) {
                        bf.b(pfVarC, qfVarB);
                        throw th5;
                    }
                }
        }
    }

    @Override // com.google.android.gms.tasks.b
    public Object d(com.google.android.gms.tasks.i iVar) {
        boolean z = iVar.e() instanceof com.google.android.gms.common.api.k;
        xa xaVar = (xa) this.z;
        z9 z9Var = (z9) this.y;
        if (z) {
            return z9Var.c(xaVar.u());
        }
        if (!(iVar.e() instanceof com.google.android.gms.common.api.d)) {
            return iVar;
        }
        com.google.android.gms.common.api.d dVar = (com.google.android.gms.common.api.d) iVar.e();
        dVar.getClass();
        return dVar.e.e == 29514 ? z9Var.c(xaVar.u()) : iVar;
    }

    public void e(ArrayList arrayList) {
        OutputStream outputStream = (OutputStream) com.google.common.collect.q.k(arrayList);
        if (outputStream instanceof ce) {
            this.z = (ce) outputStream;
            this.y = (OutputStream) arrayList.get(0);
        }
    }

    public d5 f(b7 b7Var, d5 d5Var) {
        ea.y(b7Var);
        if (!(d5Var instanceof e5)) {
            return d5Var;
        }
        e5 e5Var = (e5) d5Var;
        ArrayList arrayList = e5Var.y;
        String str = e5Var.e;
        HashMap map = (HashMap) this.y;
        return (map.containsKey(str) ? (i5) map.get(str) : (i5) this.z).a(str, b7Var, arrayList);
    }

    public ec g(int i, long j, String str) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.y;
        ec ecVar = (ec) atomicReferenceArray.get(i);
        if (ecVar != null) {
            return ecVar;
        }
        cc ccVar = new cc(str, (com.appsalt.internal.q0) ((s5) this.z).y, j);
        while (!atomicReferenceArray.compareAndSet(i, null, ccVar)) {
            if (atomicReferenceArray.get(i) != null) {
                ec ecVar2 = (ec) atomicReferenceArray.get(i);
                ecVar2.getClass();
                return ecVar2;
            }
        }
        return ccVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.common.base.t
    public Object get() {
        long j;
        long j2;
        long j3;
        char c;
        long j4;
        char c2;
        long j5;
        char c3;
        long j6;
        long j7;
        char c4;
        char c5;
        switch (this.e) {
            case 3:
                com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar = (com.google.android.datatransport.runtime.scheduling.jobscheduling.c) this.y;
                String str = (String) this.z;
                int i = com.google.common.hash.c.a;
                int i2 = com.google.common.hash.e.y;
                com.google.common.hash.d dVarC = new com.google.common.hash.d().c(str.getBytes());
                ByteBuffer byteBuffer = dVarC.a;
                byteBuffer.put((byte) 0);
                char c6 = '\b';
                if (byteBuffer.remaining() < 8) {
                    dVarC.a();
                }
                com.google.common.hash.d dVarC2 = dVarC.c("".getBytes());
                dVarC2.a();
                ByteBuffer byteBuffer2 = dVarC2.a;
                byteBuffer2.flip();
                if (byteBuffer2.remaining() > 0) {
                    dVarC2.f = byteBuffer2.remaining() + dVarC2.f;
                    long j8 = 0;
                    switch (byteBuffer2.remaining()) {
                        case 1:
                            j = 0;
                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                            dVarC2.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dVarC2.d;
                            dVarC2.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 2:
                            c6 = '\b';
                            j2 = 0;
                            j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c6);
                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                            dVarC2.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dVarC2.d;
                            dVarC2.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 3:
                            c6 = '\b';
                            j3 = 0;
                            j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                            j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c6);
                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                            dVarC2.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dVarC2.d;
                            dVarC2.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 4:
                            c6 = '\b';
                            c = 24;
                            j4 = 0;
                            j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << c);
                            j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                            j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c6);
                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                            dVarC2.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dVarC2.d;
                            dVarC2.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 5:
                            c2 = ' ';
                            c = 24;
                            j5 = 0;
                            j4 = j5 ^ (((long) (byteBuffer2.get(4) & 255)) << c2);
                            j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << c);
                            j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                            j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c6);
                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                            dVarC2.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dVarC2.d;
                            dVarC2.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 6:
                            c3 = 24;
                            c2 = ' ';
                            j6 = 0;
                            c = c3;
                            j5 = (((long) (byteBuffer2.get(5) & 255)) << 40) ^ j6;
                            j4 = j5 ^ (((long) (byteBuffer2.get(4) & 255)) << c2);
                            j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << c);
                            j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                            j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c6);
                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                            dVarC2.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dVarC2.d;
                            dVarC2.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 7:
                            c3 = 24;
                            c2 = ' ';
                            j6 = ((long) (byteBuffer2.get(6) & 255)) << 48;
                            c = c3;
                            j5 = (((long) (byteBuffer2.get(5) & 255)) << 40) ^ j6;
                            j4 = j5 ^ (((long) (byteBuffer2.get(4) & 255)) << c2);
                            j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << c);
                            j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                            j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c6);
                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                            dVarC2.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dVarC2.d;
                            dVarC2.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 8:
                            j7 = byteBuffer2.getLong();
                            dVarC2.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dVarC2.d;
                            dVarC2.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 9:
                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                            j7 = byteBuffer2.getLong();
                            dVarC2.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dVarC2.d;
                            dVarC2.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 10:
                            j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                            j7 = byteBuffer2.getLong();
                            dVarC2.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dVarC2.d;
                            dVarC2.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 11:
                            j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                            j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                            j7 = byteBuffer2.getLong();
                            dVarC2.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dVarC2.d;
                            dVarC2.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 12:
                            c4 = 24;
                            j8 ^= ((long) (byteBuffer2.get(11) & 255)) << c4;
                            j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                            j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                            j7 = byteBuffer2.getLong();
                            dVarC2.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dVarC2.d;
                            dVarC2.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 13:
                            c4 = 24;
                            c5 = ' ';
                            j8 ^= ((long) (byteBuffer2.get(12) & 255)) << c5;
                            j8 ^= ((long) (byteBuffer2.get(11) & 255)) << c4;
                            j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                            j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                            j7 = byteBuffer2.getLong();
                            dVarC2.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dVarC2.d;
                            dVarC2.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 14:
                            c4 = 24;
                            c5 = ' ';
                            j8 ^= ((long) (byteBuffer2.get(13) & 255)) << 40;
                            j8 ^= ((long) (byteBuffer2.get(12) & 255)) << c5;
                            j8 ^= ((long) (byteBuffer2.get(11) & 255)) << c4;
                            j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                            j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                            j7 = byteBuffer2.getLong();
                            dVarC2.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dVarC2.d;
                            dVarC2.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 15:
                            j8 = ((long) (byteBuffer2.get(14) & 255)) << 48;
                            c4 = 24;
                            c5 = ' ';
                            j8 ^= ((long) (byteBuffer2.get(13) & 255)) << 40;
                            j8 ^= ((long) (byteBuffer2.get(12) & 255)) << c5;
                            j8 ^= ((long) (byteBuffer2.get(11) & 255)) << c4;
                            j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                            j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                            j7 = byteBuffer2.getLong();
                            dVarC2.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dVarC2.d;
                            dVarC2.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        default:
                            net.luminis.tls.engine.impl.c.m("Should never get here.");
                            return null;
                    }
                }
                long j9 = dVarC2.d;
                long j10 = dVarC2.f;
                long j11 = j9 ^ j10;
                long j12 = j10 ^ dVarC2.e;
                long j13 = j11 + j12;
                long j14 = j12 + j13;
                long j15 = (j13 ^ (j13 >>> 33)) * (-49064778989728563L);
                long j16 = (j15 ^ (j15 >>> 33)) * (-4265267296055464877L);
                long j17 = (j14 ^ (j14 >>> 33)) * (-49064778989728563L);
                long j18 = (j17 ^ (j17 >>> 33)) * (-4265267296055464877L);
                long j19 = j18 ^ (j18 >>> 33);
                long j20 = (j16 ^ (j16 >>> 33)) + j19;
                dVarC2.d = j20;
                dVarC2.e = j19 + j20;
                byte[] bArrArray = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(dVarC2.d).putLong(dVarC2.e).array();
                char[] cArr = com.google.common.hash.b.e;
                new com.google.common.hash.a(bArrArray);
                return ((com.google.common.io.c) cVar.y).a((byte[]) bArrArray.clone());
            default:
                return ((com.google.common.io.c) ((com.google.android.datatransport.runtime.scheduling.jobscheduling.c) this.y).y).a(((t0) this.z).l());
        }
    }

    public void h(b7 b7Var, com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar) {
        ga gaVar = new ga(cVar);
        TreeMap treeMap = (TreeMap) this.y;
        for (Integer num : treeMap.keySet()) {
            b bVarA = ((b) cVar.z).clone();
            d5 d5VarA = ((c5) treeMap.get(num)).a(b7Var, Collections.singletonList(gaVar));
            int iP = d5VarA instanceof j3 ? ea.p(((j3) d5VarA).e.doubleValue()) : -1;
            if (iP == 2 || iP == -1) {
                cVar.z = bVarA;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.z;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            d5 d5VarA2 = ((c5) treeMap2.get((Integer) it.next())).a(b7Var, Collections.singletonList(gaVar));
            if (d5VarA2 instanceof j3) {
                ea.p(((j3) d5VarA2).e.doubleValue());
            }
        }
    }

    public ec i(String str, int i, String str2) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.y;
        ec ecVar = (ec) atomicReferenceArray.get(i);
        if (ecVar != null) {
            return ecVar;
        }
        dc dcVar = new dc(str, (com.appsalt.internal.q0) ((s5) this.z).y, str2);
        while (!atomicReferenceArray.compareAndSet(i, null, dcVar)) {
            if (atomicReferenceArray.get(i) != null) {
                ec ecVar2 = (ec) atomicReferenceArray.get(i);
                ecVar2.getClass();
                return ecVar2;
            }
        }
        return dcVar;
    }

    public String toString() {
        switch (this.e) {
            case 10:
                com.google.common.util.concurrent.y yVar = (com.google.common.util.concurrent.y) this.z;
                StringBuilder sb = new StringBuilder(yVar.toString().length() + 14);
                sb.append("propagating=[");
                sb.append(yVar);
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public j5(m0 m0Var) {
        this.e = 8;
        this.y = m0Var;
    }

    public /* synthetic */ j5(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }

    public j5(s5 s5Var, int i) {
        this.e = 5;
        this.z = s5Var;
        this.y = new AtomicReferenceArray(i);
    }

    public j5(zc zcVar, dd ddVar) {
        this.e = 6;
        Objects.requireNonNull(zcVar);
        this.z = zcVar;
        this.y = ddVar;
    }

    public /* synthetic */ j5(le leVar) {
        this.e = 9;
        this.z = leVar;
    }
}
