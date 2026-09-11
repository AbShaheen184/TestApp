package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.google.android.gms.internal.measurement.d9;
import com.google.android.gms.internal.measurement.e9;
import com.google.android.gms.internal.measurement.g7;
import com.google.android.gms.internal.measurement.g9;
import com.google.android.gms.internal.measurement.h7;
import com.google.android.gms.internal.measurement.k9;
import com.google.android.gms.internal.measurement.l8;
import com.google.android.gms.internal.measurement.m7;
import com.google.android.gms.internal.measurement.n7;
import com.google.android.gms.internal.measurement.r8;
import com.google.android.gms.internal.measurement.t8;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends g4 {
    public String A;
    public HashSet B;
    public androidx.collection.f C;
    public Long D;
    public Long E;

    public final u4 A(Integer num) {
        if (this.C.containsKey(num)) {
            return (u4) this.C.get(num);
        }
        u4 u4Var = new u4(this, this.A);
        this.C.put(num, u4Var);
        return u4Var;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0242 A[LOOP:20: B:85:0x01f2->B:102:0x0242, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x0274  */
    /* JADX WARN: Code duplicated, block: B:121:0x027e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0289  */
    /* JADX WARN: Code duplicated, block: B:125:0x0294  */
    /* JADX WARN: Code duplicated, block: B:131:0x02c2 A[Catch: all -> 0x02dd, SQLiteException -> 0x02df, LOOP:11: B:131:0x02c2->B:568:?, LOOP_START, TryCatch #4 {SQLiteException -> 0x02df, blocks: (B:129:0x02bc, B:131:0x02c2, B:133:0x02d3, B:139:0x02e1, B:142:0x02f6), top: B:478:0x02bc }] */
    /* JADX WARN: Code duplicated, block: B:133:0x02d3 A[Catch: all -> 0x02dd, SQLiteException -> 0x02df, TryCatch #4 {SQLiteException -> 0x02df, blocks: (B:129:0x02bc, B:131:0x02c2, B:133:0x02d3, B:139:0x02e1, B:142:0x02f6), top: B:478:0x02bc }] */
    /* JADX WARN: Code duplicated, block: B:142:0x02f6 A[Catch: all -> 0x02dd, SQLiteException -> 0x02df, TRY_ENTER, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x02df, blocks: (B:129:0x02bc, B:131:0x02c2, B:133:0x02d3, B:139:0x02e1, B:142:0x02f6), top: B:478:0x02bc }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0335  */
    /* JADX WARN: Code duplicated, block: B:162:0x0343  */
    /* JADX WARN: Code duplicated, block: B:164:0x035a  */
    /* JADX WARN: Code duplicated, block: B:190:0x0455  */
    /* JADX WARN: Code duplicated, block: B:194:0x0466  */
    /* JADX WARN: Code duplicated, block: B:196:0x0486  */
    /* JADX WARN: Code duplicated, block: B:202:0x049d  */
    /* JADX WARN: Code duplicated, block: B:206:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:207:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:211:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:217:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:223:0x051d  */
    /* JADX WARN: Code duplicated, block: B:226:0x0526  */
    /* JADX WARN: Code duplicated, block: B:228:0x0532  */
    /* JADX WARN: Code duplicated, block: B:230:0x0554  */
    /* JADX WARN: Code duplicated, block: B:231:0x0558  */
    /* JADX WARN: Code duplicated, block: B:236:0x0571 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:247:0x0590  */
    /* JADX WARN: Code duplicated, block: B:249:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:252:0x05be  */
    /* JADX WARN: Code duplicated, block: B:255:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:262:0x060d  */
    /* JADX WARN: Code duplicated, block: B:265:0x0621  */
    /* JADX WARN: Code duplicated, block: B:271:0x0654  */
    /* JADX WARN: Code duplicated, block: B:275:0x0695  */
    /* JADX WARN: Code duplicated, block: B:282:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:288:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:299:0x06f9 A[LOOP:3: B:276:0x0697->B:299:0x06f9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:300:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:315:0x072c  */
    /* JADX WARN: Code duplicated, block: B:320:0x0737  */
    /* JADX WARN: Code duplicated, block: B:322:0x073b  */
    /* JADX WARN: Code duplicated, block: B:326:0x074d  */
    /* JADX WARN: Code duplicated, block: B:332:0x077c  */
    /* JADX WARN: Code duplicated, block: B:334:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:336:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:339:0x07bf A[LOOP:5: B:330:0x0776->B:339:0x07bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:343:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:346:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:349:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:352:0x07fd  */
    /* JADX WARN: Code duplicated, block: B:354:0x0810  */
    /* JADX WARN: Code duplicated, block: B:358:0x084b  */
    /* JADX WARN: Code duplicated, block: B:365:0x0873  */
    /* JADX WARN: Code duplicated, block: B:371:0x0884  */
    /* JADX WARN: Code duplicated, block: B:382:0x08b3 A[LOOP:7: B:359:0x084d->B:382:0x08b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:385:0x08ba  */
    /* JADX WARN: Code duplicated, block: B:400:0x08ee  */
    /* JADX WARN: Code duplicated, block: B:404:0x08f8  */
    /* JADX WARN: Code duplicated, block: B:406:0x08fc  */
    /* JADX WARN: Code duplicated, block: B:410:0x090c  */
    /* JADX WARN: Code duplicated, block: B:414:0x092d  */
    /* JADX WARN: Code duplicated, block: B:417:0x093e  */
    /* JADX WARN: Code duplicated, block: B:419:0x0955  */
    /* JADX WARN: Code duplicated, block: B:421:0x0963  */
    /* JADX WARN: Code duplicated, block: B:423:0x096e  */
    /* JADX WARN: Code duplicated, block: B:425:0x0999  */
    /* JADX WARN: Code duplicated, block: B:428:0x09a3  */
    /* JADX WARN: Code duplicated, block: B:441:0x0a0e  */
    /* JADX WARN: Code duplicated, block: B:442:0x0a17  */
    /* JADX WARN: Code duplicated, block: B:446:0x0a2a A[PHI: r16 r20 r21
  0x0a2a: PHI (r16v2 java.util.Map) = (r16v3 java.util.Map), (r16v4 java.util.Map) binds: [B:445:0x0a28, B:443:0x0a18] A[DONT_GENERATE, DONT_INLINE]
  0x0a2a: PHI (r20v5 androidx.collection.y0) = (r20v6 androidx.collection.y0), (r2v41 androidx.collection.y0) binds: [B:445:0x0a28, B:443:0x0a18] A[DONT_GENERATE, DONT_INLINE]
  0x0a2a: PHI (r21v20 java.util.Iterator) = (r21v21 java.util.Iterator), (r3v56 java.util.Iterator) binds: [B:445:0x0a28, B:443:0x0a18] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:451:0x0a53  */
    /* JADX WARN: Code duplicated, block: B:464:0x0ad9  */
    /* JADX WARN: Code duplicated, block: B:467:0x0ae1  */
    /* JADX WARN: Code duplicated, block: B:536:0x062f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:0x0646 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:0x061b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:0x061b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:0x06f4 A[EDGE_INSN: B:542:0x06f4->B:298:0x06f4 BREAK  A[LOOP:3: B:276:0x0697->B:299:0x06f9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:0x076b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:0x075f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:0x07cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:0x07d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:0x08ae A[EDGE_INSN: B:553:0x08ae->B:381:0x08ae BREAK  A[LOOP:7: B:359:0x084d->B:382:0x08b3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:0x091e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x0a2f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:0x0a22 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:0x09fa A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:0x0aaf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:0x0a4d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:0x04a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:0x0497 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:0x04f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:0x04e1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:0x05d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:590:0x0360 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:0x023e A[EDGE_INSN: B:604:0x023e->B:101:0x023e BREAK  A[LOOP:20: B:85:0x01f2->B:102:0x0242], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x018e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0195  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d1 A[Catch: all -> 0x01dd, SQLiteException -> 0x01e0, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x01e0, blocks: (B:72:0x01cb, B:74:0x01d1, B:83:0x01eb), top: B:476:0x01cb }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01eb A[Catch: all -> 0x01dd, SQLiteException -> 0x01e0, TRY_ENTER, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x01e0, blocks: (B:72:0x01cb, B:74:0x01d1, B:83:0x01eb), top: B:476:0x01cb }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v202 */
    /* JADX WARN: Type inference failed for: r0v203 */
    /* JADX WARN: Type inference failed for: r0v31, types: [androidx.collection.f, androidx.collection.y0] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v20, types: [androidx.collection.f, androidx.collection.y0] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2, types: [com.google.android.gms.measurement.internal.s1] */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v22 */
    /* JADX WARN: Type inference failed for: r17v23 */
    /* JADX WARN: Type inference failed for: r17v24, types: [com.google.android.gms.measurement.internal.s1] */
    /* JADX WARN: Type inference failed for: r17v30 */
    /* JADX WARN: Type inference failed for: r17v31 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v16 */
    /* JADX WARN: Type inference failed for: r18v17 */
    /* JADX WARN: Type inference failed for: r18v18 */
    /* JADX WARN: Type inference failed for: r18v19 */
    /* JADX WARN: Type inference failed for: r18v20, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r18v24 */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v26 */
    /* JADX WARN: Type inference failed for: r18v27 */
    /* JADX WARN: Type inference failed for: r18v28 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v30 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v69, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r3v69, types: [com.google.android.gms.measurement.internal.v0] */
    /* JADX WARN: Type inference failed for: r3v83, types: [com.google.android.gms.measurement.internal.v0] */
    /* JADX WARN: Type inference failed for: r42v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r42v10 */
    /* JADX WARN: Type inference failed for: r42v11, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r42v12 */
    /* JADX WARN: Type inference failed for: r42v13 */
    /* JADX WARN: Type inference failed for: r42v14 */
    /* JADX WARN: Type inference failed for: r42v15 */
    /* JADX WARN: Type inference failed for: r42v16, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r42v17 */
    /* JADX WARN: Type inference failed for: r42v18 */
    /* JADX WARN: Type inference failed for: r42v19 */
    /* JADX WARN: Type inference failed for: r42v2 */
    /* JADX WARN: Type inference failed for: r42v20 */
    /* JADX WARN: Type inference failed for: r42v21 */
    /* JADX WARN: Type inference failed for: r42v22 */
    /* JADX WARN: Type inference failed for: r42v23 */
    /* JADX WARN: Type inference failed for: r42v24 */
    /* JADX WARN: Type inference failed for: r42v25 */
    /* JADX WARN: Type inference failed for: r42v26 */
    /* JADX WARN: Type inference failed for: r42v27 */
    /* JADX WARN: Type inference failed for: r42v28 */
    /* JADX WARN: Type inference failed for: r42v29 */
    /* JADX WARN: Type inference failed for: r42v3 */
    /* JADX WARN: Type inference failed for: r42v30 */
    /* JADX WARN: Type inference failed for: r42v31 */
    /* JADX WARN: Type inference failed for: r42v32 */
    /* JADX WARN: Type inference failed for: r42v33 */
    /* JADX WARN: Type inference failed for: r42v4 */
    /* JADX WARN: Type inference failed for: r42v5 */
    /* JADX WARN: Type inference failed for: r42v6 */
    /* JADX WARN: Type inference failed for: r42v7 */
    /* JADX WARN: Type inference failed for: r42v8 */
    /* JADX WARN: Type inference failed for: r42v9 */
    /* JADX WARN: Type inference failed for: r4v31, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v64 */
    /* JADX WARN: Type inference failed for: r7v65 */
    /* JADX WARN: Type inference failed for: r7v66, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v67, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v68, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v69 */
    /* JADX WARN: Type inference failed for: r7v70 */
    /* JADX WARN: Type inference failed for: r7v71 */
    /* JADX WARN: Type inference failed for: r7v72 */
    /* JADX WARN: Type inference failed for: r7v73, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v75 */
    /* JADX WARN: Type inference failed for: r7v80 */
    /* JADX WARN: Type inference failed for: r7v81 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final ArrayList z(String str, List list, List list2, Long l, Long l2, boolean z) throws Throwable {
        boolean z2;
        boolean z3;
        String str2;
        Map map;
        Object obj;
        ?? r5;
        Cursor cursorQuery;
        ?? r17;
        String str3;
        Object obj2;
        ?? r21;
        Map map2;
        String str4;
        s1 s1Var;
        Map map3;
        Map map4;
        Map map5;
        String str5;
        e9 e9Var;
        BitSet bitSet;
        BitSet bitSet2;
        androidx.collection.f fVar;
        e9 e9Var2;
        androidx.collection.f fVar2;
        List<h7> list3;
        long jLongValue;
        Integer numValueOf;
        int i;
        boolean z4;
        Iterator it;
        g9 g9Var;
        Long lValueOf;
        m mVarH0;
        String str6;
        ?? fVar3;
        ?? r7;
        Cursor cursorRawQuery;
        ?? r0;
        androidx.collection.f fVar4;
        Iterator it2;
        Integer num;
        e9 e9Var3;
        List list4;
        ?? r18;
        Iterator it3;
        s1 s1Var2;
        Integer numValueOf2;
        List arrayList;
        String str7;
        ArrayList arrayList2;
        m mVarH1;
        s1 s1Var3;
        String str8;
        ContentValues contentValues;
        Iterator it4;
        androidx.collection.y0 y0Var;
        String strW;
        Map map6;
        Iterator it5;
        Iterator it6;
        androidx.collection.y0 y0Var2;
        Integer num2;
        int iIntValue;
        Iterator it7;
        boolean zB;
        androidx.collection.y0 y0Var3;
        Map map7;
        n7 n7Var;
        Integer numValueOf3;
        b bVar;
        int i2;
        Integer numValueOf4;
        s1 s1Var4;
        String str9;
        androidx.collection.f fVar5;
        Cursor cursor;
        s1 s1Var5;
        String str10;
        Cursor cursorQuery2;
        Integer numValueOf5;
        List list5;
        List arrayList3;
        v4 v4Var;
        ?? fVar6;
        t8 t8VarA;
        r rVarF0;
        long j;
        String strZ;
        Map map8;
        int iIntValue2;
        Iterator it8;
        boolean zA;
        Map map9;
        v4 v4Var2;
        Integer num3;
        b bVar2;
        int iV;
        u4 u4Var;
        boolean z5;
        String str11;
        androidx.collection.f fVar7;
        ?? r8;
        String str12;
        ?? r2;
        ?? r42;
        ?? r43;
        ?? Query;
        ?? r44;
        ?? r45;
        ?? r46;
        ?? r47;
        Integer numValueOf6;
        List list6;
        ?? r48;
        List arrayList4;
        androidx.collection.f fVar8;
        int i3;
        ?? r6;
        Object obj3;
        ?? r9;
        ?? r19;
        ?? r110;
        List arrayList5;
        s1 s1Var6 = (s1) this.e;
        com.google.android.gms.common.internal.x.d(str);
        com.google.android.gms.common.internal.x.g(list);
        com.google.android.gms.common.internal.x.g(list2);
        this.A = str;
        this.B = new HashSet();
        this.C = new androidx.collection.f();
        this.D = l;
        this.E = l2;
        Iterator it9 = list.iterator();
        while (true) {
            if (!it9.hasNext()) {
                z2 = false;
                break;
            }
            if ("_s".equals(((t8) it9.next()).z())) {
                z2 = true;
                break;
            }
        }
        com.google.android.gms.internal.measurement.t3.a();
        boolean zG = s1Var6.A.G(this.A, h0.F0);
        com.google.android.gms.internal.measurement.t3.a();
        boolean zG2 = s1Var6.A.G(this.A, h0.E0);
        l4 l4Var = this.y;
        if (z2) {
            m mVarH2 = l4Var.h0();
            String str13 = this.A;
            mVarH2.w();
            mVarH2.v();
            com.google.android.gms.common.internal.x.d(str13);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                mVarH2.m0().update("events", contentValues2, "app_id = ?", new String[]{str13});
            } catch (SQLiteException e) {
                ((s1) mVarH2.e).b().z().c(x0.D(str13), e, "Error resetting session-scoped event counts. appId");
            }
        }
        Map map10 = Collections.EMPTY_MAP;
        String str14 = "Failed to merge filter. appId";
        Object objD = "Database error querying filters. appId";
        String str15 = "audience_id";
        try {
            try {
                try {
                    if (zG2 && zG) {
                        m mVarH3 = l4Var.h0();
                        s1 s1Var7 = (s1) mVarH3.e;
                        String str16 = this.A;
                        com.google.android.gms.common.internal.x.d(str16);
                        z3 = z2;
                        androidx.collection.f fVar9 = new androidx.collection.f();
                        try {
                            ?? Query2 = mVarH3.m0().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str16}, null, null, null);
                            try {
                                try {
                                    if (Query2.moveToFirst()) {
                                        str2 = "data";
                                        Query2 = Query2;
                                        ?? r111 = "event_filters";
                                        while (true) {
                                            try {
                                                try {
                                                    h7 h7Var = (h7) ((g7) n4.g0(h7.G(), Query2.getBlob(1))).d();
                                                    if (h7Var.A()) {
                                                        Integer numValueOf7 = Integer.valueOf(Query2.getInt(0));
                                                        List list7 = (List) fVar9.get(numValueOf7);
                                                        if (list7 == null) {
                                                            arrayList5 = new ArrayList();
                                                            fVar9.put(numValueOf7, arrayList5);
                                                        } else {
                                                            arrayList5 = list7;
                                                        }
                                                        arrayList5.add(h7Var);
                                                        r111 = Query2;
                                                    } else {
                                                        r111 = Query2;
                                                    }
                                                } catch (IOException e2) {
                                                    r111 = Query2;
                                                    s1Var7.b().z().c(x0.D(str16), e2, "Failed to merge filter. appId");
                                                }
                                                try {
                                                    if (!r111.moveToNext()) {
                                                        break;
                                                    }
                                                    Query2 = r111;
                                                    r111 = r111;
                                                } catch (SQLiteException e3) {
                                                    e = e3;
                                                    r110 = r111;
                                                    r9 = r110;
                                                    try {
                                                        s1Var7.b().z().c(x0.D(str16), e, "Database error querying filters. appId");
                                                        map10 = Collections.EMPTY_MAP;
                                                        if (r9 != 0) {
                                                            r9.close();
                                                        }
                                                        map = map10;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        if (r9 != 0) {
                                                            r9.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    r19 = r111;
                                                    r9 = r19;
                                                    if (r9 != 0) {
                                                        r9.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (SQLiteException e4) {
                                                e = e4;
                                                r110 = Query2;
                                                r9 = r110;
                                                s1Var7.b().z().c(x0.D(str16), e, "Database error querying filters. appId");
                                                map10 = Collections.EMPTY_MAP;
                                                if (r9 != 0) {
                                                    r9.close();
                                                }
                                                map = map10;
                                                m mVarH4 = l4Var.h0();
                                                obj = (s1) mVarH4.e;
                                                r5 = this.A;
                                                mVarH4.w();
                                                mVarH4.v();
                                                com.google.android.gms.common.internal.x.d(r5);
                                                cursorQuery = mVarH4.m0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
                                                if (cursorQuery.moveToFirst()) {
                                                    fVar8 = new androidx.collection.f();
                                                    r17 = obj;
                                                    r21 = r5;
                                                    while (true) {
                                                        try {
                                                            i3 = cursorQuery.getInt(0);
                                                            try {
                                                                e9 e9Var4 = (e9) ((d9) n4.g0(e9.C(), cursorQuery.getBlob(1))).d();
                                                                Object objValueOf = Integer.valueOf(i3);
                                                                fVar8.put(objValueOf, e9Var4);
                                                                str3 = str14;
                                                                obj2 = objD;
                                                                obj3 = objValueOf;
                                                                r6 = r21;
                                                            } catch (IOException e5) {
                                                                v0 v0VarZ = r17.b().z();
                                                                str3 = str14;
                                                                str14 = "Failed to merge filter results. appId, audienceId, error";
                                                                obj2 = objD;
                                                                try {
                                                                    objD = x0.D(r21);
                                                                    Integer numValueOf8 = Integer.valueOf(i3);
                                                                    v0VarZ.d("Failed to merge filter results. appId, audienceId, error", objD, numValueOf8, e5);
                                                                    obj3 = v0VarZ;
                                                                    r6 = numValueOf8;
                                                                } catch (SQLiteException e6) {
                                                                    e = e6;
                                                                    r21 = r21;
                                                                    r17.b().z().c(x0.D(r21), e, "Database error querying filter results. appId");
                                                                    Map map11 = Collections.EMPTY_MAP;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    map2 = map11;
                                                                    if (map2.isEmpty()) {
                                                                        str5 = "audience_id";
                                                                        s1Var = s1Var6;
                                                                    } else {
                                                                        HashSet<Integer> hashSet = new HashSet(map2.keySet());
                                                                        if (z3) {
                                                                            String str17 = this.A;
                                                                            mVarH0 = l4Var.h0();
                                                                            str6 = this.A;
                                                                            mVarH0.w();
                                                                            mVarH0.v();
                                                                            com.google.android.gms.common.internal.x.d(str6);
                                                                            fVar3 = new androidx.collection.f();
                                                                            try {
                                                                                try {
                                                                                    cursorRawQuery = mVarH0.m0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                                                    try {
                                                                                        if (cursorRawQuery.moveToFirst()) {
                                                                                            do {
                                                                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                                                arrayList = (List) fVar3.get(numValueOf2);
                                                                                                if (arrayList == null) {
                                                                                                    arrayList = new ArrayList();
                                                                                                    fVar3.put(numValueOf2, arrayList);
                                                                                                }
                                                                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                                            } while (cursorRawQuery.moveToNext());
                                                                                        } else {
                                                                                            fVar3 = Collections.EMPTY_MAP;
                                                                                        }
                                                                                    } catch (SQLiteException e7) {
                                                                                        e = e7;
                                                                                        ((s1) mVarH0.e).b().z().c(x0.D(str6), e, "Database error querying scoped filters. appId");
                                                                                        fVar3 = Collections.EMPTY_MAP;
                                                                                        r0 = fVar3;
                                                                                        if (cursorRawQuery != null) {
                                                                                        }
                                                                                        com.google.android.gms.common.internal.x.d(str17);
                                                                                        fVar4 = new androidx.collection.f();
                                                                                        if (!map2.isEmpty()) {
                                                                                            it2 = map2.keySet().iterator();
                                                                                            while (it2.hasNext()) {
                                                                                                num = (Integer) it2.next();
                                                                                                num.getClass();
                                                                                                e9Var3 = (e9) map2.get(num);
                                                                                                list4 = (List) r0.get(num);
                                                                                                if (list4 != null) {
                                                                                                }
                                                                                                r18 = r0;
                                                                                                it3 = it2;
                                                                                                s1Var2 = s1Var6;
                                                                                                fVar4.put(num, e9Var3);
                                                                                                r0 = r18;
                                                                                                str15 = str15;
                                                                                                it2 = it3;
                                                                                                s1Var6 = s1Var2;
                                                                                            }
                                                                                        }
                                                                                        str4 = str15;
                                                                                        s1Var = s1Var6;
                                                                                        map3 = fVar4;
                                                                                        map5 = map3;
                                                                                        map4 = map2;
                                                                                        for (Integer num4 : hashSet) {
                                                                                            num4.getClass();
                                                                                            e9Var = (e9) map5.get(num4);
                                                                                            bitSet = new BitSet();
                                                                                            bitSet2 = new BitSet();
                                                                                            fVar = new androidx.collection.f();
                                                                                            if (e9Var != null) {
                                                                                                for (r8 r8Var : e9Var.y()) {
                                                                                                    if (r8Var.u()) {
                                                                                                        e9 e9Var5 = e9Var;
                                                                                                        Integer numValueOf9 = Integer.valueOf(r8Var.v());
                                                                                                        if (r8Var.w()) {
                                                                                                            lValueOf = Long.valueOf(r8Var.x());
                                                                                                        } else {
                                                                                                            lValueOf = null;
                                                                                                        }
                                                                                                        fVar.put(numValueOf9, lValueOf);
                                                                                                        e9Var = e9Var5;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            e9Var2 = e9Var;
                                                                                            fVar2 = new androidx.collection.f();
                                                                                            if (e9Var2 != null) {
                                                                                                it = e9Var2.A().iterator();
                                                                                                while (it.hasNext()) {
                                                                                                    g9Var = (g9) it.next();
                                                                                                    if (!g9Var.u()) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            Map map12 = map5;
                                                                                            if (e9Var2 != null) {
                                                                                                i = 0;
                                                                                                while (i < e9Var2.v() * 64) {
                                                                                                    if (n4.a0((com.google.android.gms.internal.measurement.q1) e9Var2.u(), i)) {
                                                                                                        z4 = zG;
                                                                                                        s1Var.b().C().c(num4, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                                                                                        bitSet2.set(i);
                                                                                                        if (n4.a0((com.google.android.gms.internal.measurement.q1) e9Var2.w(), i)) {
                                                                                                            bitSet.set(i);
                                                                                                        }
                                                                                                        i++;
                                                                                                        zG = z4;
                                                                                                    } else {
                                                                                                        z4 = zG;
                                                                                                    }
                                                                                                    fVar.remove(Integer.valueOf(i));
                                                                                                    i++;
                                                                                                    zG = z4;
                                                                                                }
                                                                                            }
                                                                                            boolean z6 = zG;
                                                                                            e9 e9Var6 = (e9) map4.get(num4);
                                                                                            if (zG2) {
                                                                                                for (h7 h7Var2 : list3) {
                                                                                                    int iV2 = h7Var2.v();
                                                                                                    Integer num5 = num4;
                                                                                                    jLongValue = this.E.longValue() / 1000;
                                                                                                    if (h7Var2.D()) {
                                                                                                        jLongValue = this.D.longValue() / 1000;
                                                                                                    }
                                                                                                    numValueOf = Integer.valueOf(iV2);
                                                                                                    if (fVar.containsKey(numValueOf)) {
                                                                                                        fVar.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                    }
                                                                                                    if (fVar2.containsKey(numValueOf)) {
                                                                                                        fVar2.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                    }
                                                                                                    num4 = num5;
                                                                                                }
                                                                                            }
                                                                                            this.C.put(num4, new u4(this, this.A, e9Var6, bitSet, bitSet2, fVar, fVar2));
                                                                                            map = map;
                                                                                            zG = z6;
                                                                                            map4 = map4;
                                                                                            zG2 = zG2;
                                                                                            str3 = str3;
                                                                                            map5 = map12;
                                                                                        }
                                                                                        str5 = str4;
                                                                                        str7 = str2;
                                                                                        String str18 = str3;
                                                                                        ?? r10 = obj2;
                                                                                        if (!list.isEmpty()) {
                                                                                            v4Var = new v4(this);
                                                                                            fVar6 = new androidx.collection.f();
                                                                                            for (t8 t8Var : list) {
                                                                                                t8VarA = v4Var.a(t8Var, this.A);
                                                                                                if (t8VarA != null) {
                                                                                                    rVarF0 = l4Var.h0().f0(this.A, t8Var, t8VarA.z());
                                                                                                    l4Var.h0().W("events", rVarF0);
                                                                                                    if (z) {
                                                                                                        continue;
                                                                                                    } else {
                                                                                                        j = rVarF0.c;
                                                                                                        strZ = t8VarA.z();
                                                                                                        map8 = (Map) fVar6.get(strZ);
                                                                                                        if (map8 == null) {
                                                                                                            m mVarH5 = l4Var.h0();
                                                                                                            s1 s1Var8 = (s1) mVarH5.e;
                                                                                                            str11 = this.A;
                                                                                                            mVarH5.w();
                                                                                                            mVarH5.v();
                                                                                                            com.google.android.gms.common.internal.x.d(str11);
                                                                                                            com.google.android.gms.common.internal.x.d(strZ);
                                                                                                            fVar7 = new androidx.collection.f();
                                                                                                            try {
                                                                                                                Query = mVarH5.m0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strZ}, null, null, null);
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (Query.moveToFirst()) {
                                                                                                                            str12 = str11;
                                                                                                                            Query = Query;
                                                                                                                            r46 = list;
                                                                                                                            while (true) {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        h7 h7Var3 = (h7) ((g7) n4.g0(h7.G(), Query.getBlob(1))).d();
                                                                                                                                        numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                                                                        list6 = (List) fVar7.get(numValueOf6);
                                                                                                                                        if (list6 == null) {
                                                                                                                                            r46 = Query;
                                                                                                                                            try {
                                                                                                                                                arrayList4 = new ArrayList();
                                                                                                                                                fVar7.put(numValueOf6, arrayList4);
                                                                                                                                                r48 = r46;
                                                                                                                                            } catch (SQLiteException e8) {
                                                                                                                                                e = e8;
                                                                                                                                                r45 = r46;
                                                                                                                                                r2 = r45;
                                                                                                                                                r42 = r45;
                                                                                                                                                try {
                                                                                                                                                    s1Var8.b().z().c(x0.D(str12), e, r10);
                                                                                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                                                                                    r43 = r42;
                                                                                                                                                    if (r2 != 0) {
                                                                                                                                                        r2.close();
                                                                                                                                                        r43 = r42;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th3) {
                                                                                                                                                    th = th3;
                                                                                                                                                    r8 = r2;
                                                                                                                                                    if (r8 != 0) {
                                                                                                                                                        r8.close();
                                                                                                                                                    }
                                                                                                                                                    throw th;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th4) {
                                                                                                                                                th = th4;
                                                                                                                                                r44 = r46;
                                                                                                                                                r8 = r44;
                                                                                                                                                if (r8 != 0) {
                                                                                                                                                    r8.close();
                                                                                                                                                }
                                                                                                                                                throw th;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            r48 = Query;
                                                                                                                                            arrayList4 = list6;
                                                                                                                                        }
                                                                                                                                        arrayList4.add(h7Var3);
                                                                                                                                        r47 = r48;
                                                                                                                                    } catch (IOException e9) {
                                                                                                                                        r47 = Query;
                                                                                                                                        s1Var8.b().z().c(x0.D(str12), e9, str18);
                                                                                                                                    }
                                                                                                                                    if (!r47.moveToNext()) {
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    Query = r47;
                                                                                                                                    r46 = r47;
                                                                                                                                } catch (SQLiteException e10) {
                                                                                                                                    e = e10;
                                                                                                                                    r45 = Query;
                                                                                                                                    r2 = r45;
                                                                                                                                    r42 = r45;
                                                                                                                                    s1Var8.b().z().c(x0.D(str12), e, r10);
                                                                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                                                                    r43 = r42;
                                                                                                                                    if (r2 != 0) {
                                                                                                                                        r2.close();
                                                                                                                                        r43 = r42;
                                                                                                                                    }
                                                                                                                                    fVar6.put(strZ, map8);
                                                                                                                                    list = r43;
                                                                                                                                    for (Integer num6 : map8.keySet()) {
                                                                                                                                        iIntValue2 = num6.intValue();
                                                                                                                                        if (this.B.contains(num6)) {
                                                                                                                                            s1Var.b().C().b(num6, "Skipping failed audience ID");
                                                                                                                                        } else {
                                                                                                                                            it8 = ((List) map8.get(num6)).iterator();
                                                                                                                                            zA = true;
                                                                                                                                            while (true) {
                                                                                                                                                if (!it8.hasNext()) {
                                                                                                                                                    map9 = map8;
                                                                                                                                                    v4Var2 = v4Var;
                                                                                                                                                    num3 = num6;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                h7 h7Var4 = (h7) it8.next();
                                                                                                                                                v4Var2 = v4Var;
                                                                                                                                                num3 = num6;
                                                                                                                                                map9 = map8;
                                                                                                                                                bVar2 = new b(this, this.A, iIntValue2, h7Var4, 0);
                                                                                                                                                Long l3 = this.D;
                                                                                                                                                Long l4 = this.E;
                                                                                                                                                iV = h7Var4.v();
                                                                                                                                                u4Var = (u4) this.C.get(num3);
                                                                                                                                                if (u4Var == null) {
                                                                                                                                                    z5 = false;
                                                                                                                                                } else {
                                                                                                                                                    z5 = u4Var.d.get(iV);
                                                                                                                                                }
                                                                                                                                                zA = bVar2.a(l3, l4, t8VarA, j, rVarF0, z5);
                                                                                                                                                if (!zA) {
                                                                                                                                                    this.B.add(num3);
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                A(num3).a(bVar2);
                                                                                                                                                num6 = num3;
                                                                                                                                                map8 = map9;
                                                                                                                                                v4Var = v4Var2;
                                                                                                                                            }
                                                                                                                                            if (!zA) {
                                                                                                                                                this.B.add(num3);
                                                                                                                                            }
                                                                                                                                            v4Var = v4Var2;
                                                                                                                                            map8 = map9;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            r47.close();
                                                                                                                            map8 = fVar7;
                                                                                                                            r43 = r47;
                                                                                                                        } else {
                                                                                                                            ?? r49 = Query;
                                                                                                                            map8 = Collections.EMPTY_MAP;
                                                                                                                            r49.close();
                                                                                                                            r43 = r49;
                                                                                                                        }
                                                                                                                    } catch (Throwable th5) {
                                                                                                                        th = th5;
                                                                                                                        r44 = Query;
                                                                                                                    }
                                                                                                                } catch (SQLiteException e11) {
                                                                                                                    e = e11;
                                                                                                                    str12 = str11;
                                                                                                                }
                                                                                                            } catch (SQLiteException e12) {
                                                                                                                e = e12;
                                                                                                                str12 = str11;
                                                                                                                r2 = 0;
                                                                                                                r42 = list;
                                                                                                            } catch (Throwable th6) {
                                                                                                                th = th6;
                                                                                                                r8 = 0;
                                                                                                            }
                                                                                                            fVar6.put(strZ, map8);
                                                                                                            list = r43;
                                                                                                        } else {
                                                                                                            list = list;
                                                                                                        }
                                                                                                        while (r19.hasNext()) {
                                                                                                            iIntValue2 = num6.intValue();
                                                                                                            if (this.B.contains(num6)) {
                                                                                                                s1Var.b().C().b(num6, "Skipping failed audience ID");
                                                                                                            } else {
                                                                                                                it8 = ((List) map8.get(num6)).iterator();
                                                                                                                zA = true;
                                                                                                                while (true) {
                                                                                                                    if (!it8.hasNext()) {
                                                                                                                        map9 = map8;
                                                                                                                        v4Var2 = v4Var;
                                                                                                                        num3 = num6;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    h7 h7Var5 = (h7) it8.next();
                                                                                                                    v4Var2 = v4Var;
                                                                                                                    num3 = num6;
                                                                                                                    map9 = map8;
                                                                                                                    bVar2 = new b(this, this.A, iIntValue2, h7Var5, 0);
                                                                                                                    Long l5 = this.D;
                                                                                                                    Long l6 = this.E;
                                                                                                                    iV = h7Var5.v();
                                                                                                                    u4Var = (u4) this.C.get(num3);
                                                                                                                    if (u4Var == null) {
                                                                                                                        z5 = false;
                                                                                                                    } else {
                                                                                                                        z5 = u4Var.d.get(iV);
                                                                                                                    }
                                                                                                                    zA = bVar2.a(l5, l6, t8VarA, j, rVarF0, z5);
                                                                                                                    if (!zA) {
                                                                                                                        this.B.add(num3);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    A(num3).a(bVar2);
                                                                                                                    num6 = num3;
                                                                                                                    map8 = map9;
                                                                                                                    v4Var = v4Var2;
                                                                                                                }
                                                                                                                if (!zA) {
                                                                                                                    this.B.add(num3);
                                                                                                                }
                                                                                                                v4Var = v4Var2;
                                                                                                                map8 = map9;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if (!z) {
                                                                                            return new ArrayList();
                                                                                        }
                                                                                        if (!list2.isEmpty()) {
                                                                                            androidx.collection.f fVar10 = new androidx.collection.f();
                                                                                            it4 = list2.iterator();
                                                                                            y0Var = fVar10;
                                                                                            while (it4.hasNext()) {
                                                                                                k9 k9Var = (k9) it4.next();
                                                                                                strW = k9Var.w();
                                                                                                map6 = (Map) y0Var.get(strW);
                                                                                                if (map6 == null) {
                                                                                                    m mVarH6 = l4Var.h0();
                                                                                                    s1Var4 = (s1) mVarH6.e;
                                                                                                    str9 = this.A;
                                                                                                    mVarH6.w();
                                                                                                    mVarH6.v();
                                                                                                    com.google.android.gms.common.internal.x.d(str9);
                                                                                                    com.google.android.gms.common.internal.x.d(strW);
                                                                                                    fVar5 = new androidx.collection.f();
                                                                                                    try {
                                                                                                        cursorQuery2 = mVarH6.m0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strW}, null, null, null);
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (cursorQuery2.moveToFirst()) {
                                                                                                                    it5 = it4;
                                                                                                                    while (true) {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                n7 n7Var2 = (n7) ((m7) n4.g0(n7.C(), cursorQuery2.getBlob(1))).d();
                                                                                                                                numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                                                list5 = (List) fVar5.get(numValueOf5);
                                                                                                                                if (list5 == null) {
                                                                                                                                    s1Var5 = s1Var4;
                                                                                                                                    try {
                                                                                                                                        arrayList3 = new ArrayList();
                                                                                                                                        fVar5.put(numValueOf5, arrayList3);
                                                                                                                                    } catch (SQLiteException e13) {
                                                                                                                                        e = e13;
                                                                                                                                        str10 = str9;
                                                                                                                                        cursor = cursorQuery2;
                                                                                                                                        try {
                                                                                                                                            s1Var5.b().z().c(x0.D(str10), e, r10);
                                                                                                                                            map6 = Collections.EMPTY_MAP;
                                                                                                                                            if (cursor != null) {
                                                                                                                                                cursor.close();
                                                                                                                                            }
                                                                                                                                            y0Var.put(strW, map6);
                                                                                                                                            it6 = map6.keySet().iterator();
                                                                                                                                            y0Var2 = y0Var;
                                                                                                                                            while (it6.hasNext()) {
                                                                                                                                                num2 = (Integer) it6.next();
                                                                                                                                                iIntValue = num2.intValue();
                                                                                                                                                if (this.B.contains(num2)) {
                                                                                                                                                    s1Var.b().C().b(num2, "Skipping failed audience ID");
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                it7 = ((List) map6.get(num2)).iterator();
                                                                                                                                                zB = true;
                                                                                                                                                y0Var3 = y0Var2;
                                                                                                                                                while (true) {
                                                                                                                                                    if (it7.hasNext()) {
                                                                                                                                                        n7Var = (n7) it7.next();
                                                                                                                                                        map7 = map6;
                                                                                                                                                        if (Log.isLoggable(s1Var.b().F(), 2)) {
                                                                                                                                                            v0 v0VarC = s1Var.b().C();
                                                                                                                                                            if (n7Var.u()) {
                                                                                                                                                                numValueOf4 = Integer.valueOf(n7Var.v());
                                                                                                                                                            } else {
                                                                                                                                                                numValueOf4 = null;
                                                                                                                                                            }
                                                                                                                                                            v0VarC.d("Evaluating filter. audience, filter, property", num2, numValueOf4, s1Var.n().c(n7Var.w()));
                                                                                                                                                            s1Var.b().C().b(l4Var.k0().X(n7Var), "Filter definition");
                                                                                                                                                        }
                                                                                                                                                        if (n7Var.u()) {
                                                                                                                                                        }
                                                                                                                                                        v0 v0VarA = s1Var.b().A();
                                                                                                                                                        w0 w0VarD = x0.D(this.A);
                                                                                                                                                        if (n7Var.u()) {
                                                                                                                                                            numValueOf3 = Integer.valueOf(n7Var.v());
                                                                                                                                                        } else {
                                                                                                                                                            numValueOf3 = null;
                                                                                                                                                        }
                                                                                                                                                        v0VarA.c(w0VarD, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                                                                                        this.B.add(num2);
                                                                                                                                                        map6 = map7;
                                                                                                                                                        y0Var2 = y0Var3;
                                                                                                                                                        it6 = it6;
                                                                                                                                                    } else {
                                                                                                                                                        map7 = map6;
                                                                                                                                                        y0Var3 = y0Var3;
                                                                                                                                                        it6 = it6;
                                                                                                                                                    }
                                                                                                                                                    if (!zB) {
                                                                                                                                                        this.B.add(num2);
                                                                                                                                                    }
                                                                                                                                                    map6 = map7;
                                                                                                                                                    y0Var2 = y0Var3;
                                                                                                                                                    it6 = it6;
                                                                                                                                                    A(num2).a(bVar);
                                                                                                                                                    iIntValue = i2;
                                                                                                                                                    map6 = map7;
                                                                                                                                                    y0Var3 = y0Var3;
                                                                                                                                                    it6 = it6;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            it4 = it5;
                                                                                                                                            y0Var = y0Var2;
                                                                                                                                        } catch (Throwable th7) {
                                                                                                                                            th = th7;
                                                                                                                                            if (cursor != null) {
                                                                                                                                                cursor.close();
                                                                                                                                            }
                                                                                                                                            throw th;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    s1Var5 = s1Var4;
                                                                                                                                    arrayList3 = list5;
                                                                                                                                }
                                                                                                                                arrayList3.add(n7Var2);
                                                                                                                                str10 = str9;
                                                                                                                            } catch (IOException e14) {
                                                                                                                                s1Var5 = s1Var4;
                                                                                                                                str10 = str9;
                                                                                                                                s1Var5.b().z().c(x0.D(str10), e14, "Failed to merge filter");
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                if (!cursorQuery2.moveToNext()) {
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                s1Var4 = s1Var5;
                                                                                                                                str9 = str10;
                                                                                                                            } catch (SQLiteException e15) {
                                                                                                                                e = e15;
                                                                                                                                cursor = cursorQuery2;
                                                                                                                                s1Var5.b().z().c(x0.D(str10), e, r10);
                                                                                                                                map6 = Collections.EMPTY_MAP;
                                                                                                                                if (cursor != null) {
                                                                                                                                    cursor.close();
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } catch (SQLiteException e16) {
                                                                                                                            e = e16;
                                                                                                                            s1Var5 = s1Var4;
                                                                                                                            str10 = str9;
                                                                                                                            cursor = cursorQuery2;
                                                                                                                            s1Var5.b().z().c(x0.D(str10), e, r10);
                                                                                                                            map6 = Collections.EMPTY_MAP;
                                                                                                                            if (cursor != null) {
                                                                                                                                cursor.close();
                                                                                                                            }
                                                                                                                            y0Var.put(strW, map6);
                                                                                                                            it6 = map6.keySet().iterator();
                                                                                                                            y0Var2 = y0Var;
                                                                                                                            while (it6.hasNext()) {
                                                                                                                                num2 = (Integer) it6.next();
                                                                                                                                iIntValue = num2.intValue();
                                                                                                                                if (this.B.contains(num2)) {
                                                                                                                                    s1Var.b().C().b(num2, "Skipping failed audience ID");
                                                                                                                                    break;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                it7 = ((List) map6.get(num2)).iterator();
                                                                                                                                zB = true;
                                                                                                                                y0Var3 = y0Var2;
                                                                                                                                while (true) {
                                                                                                                                    if (it7.hasNext()) {
                                                                                                                                        n7Var = (n7) it7.next();
                                                                                                                                        map7 = map6;
                                                                                                                                        if (Log.isLoggable(s1Var.b().F(), 2)) {
                                                                                                                                            v0 v0VarC2 = s1Var.b().C();
                                                                                                                                            if (n7Var.u()) {
                                                                                                                                                numValueOf4 = Integer.valueOf(n7Var.v());
                                                                                                                                            } else {
                                                                                                                                                numValueOf4 = null;
                                                                                                                                            }
                                                                                                                                            v0VarC2.d("Evaluating filter. audience, filter, property", num2, numValueOf4, s1Var.n().c(n7Var.w()));
                                                                                                                                            s1Var.b().C().b(l4Var.k0().X(n7Var), "Filter definition");
                                                                                                                                        }
                                                                                                                                        if (n7Var.u()) {
                                                                                                                                        }
                                                                                                                                        v0 v0VarA2 = s1Var.b().A();
                                                                                                                                        w0 w0VarD2 = x0.D(this.A);
                                                                                                                                        if (n7Var.u()) {
                                                                                                                                            numValueOf3 = Integer.valueOf(n7Var.v());
                                                                                                                                        } else {
                                                                                                                                            numValueOf3 = null;
                                                                                                                                        }
                                                                                                                                        v0VarA2.c(w0VarD2, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                                                                        this.B.add(num2);
                                                                                                                                        map6 = map7;
                                                                                                                                        y0Var2 = y0Var3;
                                                                                                                                        it6 = it6;
                                                                                                                                    } else {
                                                                                                                                        map7 = map6;
                                                                                                                                        y0Var3 = y0Var3;
                                                                                                                                        it6 = it6;
                                                                                                                                    }
                                                                                                                                    if (!zB) {
                                                                                                                                        this.B.add(num2);
                                                                                                                                    }
                                                                                                                                    map6 = map7;
                                                                                                                                    y0Var2 = y0Var3;
                                                                                                                                    it6 = it6;
                                                                                                                                    A(num2).a(bVar);
                                                                                                                                    iIntValue = i2;
                                                                                                                                    map6 = map7;
                                                                                                                                    y0Var3 = y0Var3;
                                                                                                                                    it6 = it6;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            it4 = it5;
                                                                                                                            y0Var = y0Var2;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    cursorQuery2.close();
                                                                                                                    map6 = fVar5;
                                                                                                                } else {
                                                                                                                    it5 = it4;
                                                                                                                    map6 = Collections.EMPTY_MAP;
                                                                                                                    cursorQuery2.close();
                                                                                                                }
                                                                                                            } catch (SQLiteException e17) {
                                                                                                                e = e17;
                                                                                                                it5 = it4;
                                                                                                            }
                                                                                                            y0Var.put(strW, map6);
                                                                                                        } catch (Throwable th8) {
                                                                                                            th = th8;
                                                                                                            cursor = cursorQuery2;
                                                                                                            if (cursor != null) {
                                                                                                                cursor.close();
                                                                                                            }
                                                                                                            throw th;
                                                                                                        }
                                                                                                    } catch (SQLiteException e18) {
                                                                                                        e = e18;
                                                                                                        it5 = it4;
                                                                                                        s1Var5 = s1Var4;
                                                                                                        str10 = str9;
                                                                                                        cursor = null;
                                                                                                    } catch (Throwable th9) {
                                                                                                        th = th9;
                                                                                                        cursor = null;
                                                                                                    }
                                                                                                } else {
                                                                                                    it5 = it4;
                                                                                                }
                                                                                                it6 = map6.keySet().iterator();
                                                                                                y0Var2 = y0Var;
                                                                                                while (it6.hasNext()) {
                                                                                                    num2 = (Integer) it6.next();
                                                                                                    iIntValue = num2.intValue();
                                                                                                    if (this.B.contains(num2)) {
                                                                                                        s1Var.b().C().b(num2, "Skipping failed audience ID");
                                                                                                        break;
                                                                                                        break;
                                                                                                    }
                                                                                                    it7 = ((List) map6.get(num2)).iterator();
                                                                                                    zB = true;
                                                                                                    y0Var3 = y0Var2;
                                                                                                    while (true) {
                                                                                                        if (it7.hasNext()) {
                                                                                                            n7Var = (n7) it7.next();
                                                                                                            map7 = map6;
                                                                                                            if (Log.isLoggable(s1Var.b().F(), 2)) {
                                                                                                                v0 v0VarC3 = s1Var.b().C();
                                                                                                                if (n7Var.u()) {
                                                                                                                    numValueOf4 = Integer.valueOf(n7Var.v());
                                                                                                                } else {
                                                                                                                    numValueOf4 = null;
                                                                                                                }
                                                                                                                v0VarC3.d("Evaluating filter. audience, filter, property", num2, numValueOf4, s1Var.n().c(n7Var.w()));
                                                                                                                s1Var.b().C().b(l4Var.k0().X(n7Var), "Filter definition");
                                                                                                            }
                                                                                                            if (n7Var.u()) {
                                                                                                            }
                                                                                                            v0 v0VarA3 = s1Var.b().A();
                                                                                                            w0 w0VarD3 = x0.D(this.A);
                                                                                                            if (n7Var.u()) {
                                                                                                                numValueOf3 = Integer.valueOf(n7Var.v());
                                                                                                            } else {
                                                                                                                numValueOf3 = null;
                                                                                                            }
                                                                                                            v0VarA3.c(w0VarD3, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                                            this.B.add(num2);
                                                                                                            map6 = map7;
                                                                                                            y0Var2 = y0Var3;
                                                                                                            it6 = it6;
                                                                                                        } else {
                                                                                                            map7 = map6;
                                                                                                            y0Var3 = y0Var3;
                                                                                                            it6 = it6;
                                                                                                        }
                                                                                                        if (!zB) {
                                                                                                            this.B.add(num2);
                                                                                                        }
                                                                                                        map6 = map7;
                                                                                                        y0Var2 = y0Var3;
                                                                                                        it6 = it6;
                                                                                                        A(num2).a(bVar);
                                                                                                        iIntValue = i2;
                                                                                                        map6 = map7;
                                                                                                        y0Var3 = y0Var3;
                                                                                                        it6 = it6;
                                                                                                    }
                                                                                                }
                                                                                                it4 = it5;
                                                                                                y0Var = y0Var2;
                                                                                            }
                                                                                        }
                                                                                        arrayList2 = new ArrayList();
                                                                                        androidx.collection.c<Integer> cVar = (androidx.collection.c) this.C.keySet();
                                                                                        cVar.removeAll(this.B);
                                                                                        for (Integer num7 : cVar) {
                                                                                            int iIntValue3 = num7.intValue();
                                                                                            u4 u4Var2 = (u4) this.C.get(num7);
                                                                                            com.google.android.gms.common.internal.x.g(u4Var2);
                                                                                            l8 l8VarB = u4Var2.b(iIntValue3);
                                                                                            arrayList2.add(l8VarB);
                                                                                            mVarH1 = l4Var.h0();
                                                                                            s1Var3 = (s1) mVarH1.e;
                                                                                            str8 = this.A;
                                                                                            e9 e9VarW = l8VarB.w();
                                                                                            mVarH1.w();
                                                                                            mVarH1.v();
                                                                                            com.google.android.gms.common.internal.x.d(str8);
                                                                                            com.google.android.gms.common.internal.x.g(e9VarW);
                                                                                            byte[] bArrA = e9VarW.a();
                                                                                            contentValues = new ContentValues();
                                                                                            contentValues.put("app_id", str8);
                                                                                            contentValues.put(str5, num7);
                                                                                            contentValues.put("current_results", bArrA);
                                                                                            try {
                                                                                                try {
                                                                                                    if (mVarH1.m0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                                                        s1Var3.b().z().b(x0.D(str8), "Failed to insert filter results (got -1). appId");
                                                                                                    }
                                                                                                } catch (SQLiteException e19) {
                                                                                                    e = e19;
                                                                                                    s1Var3.b().z().c(x0.D(str8), e, "Error storing filter results. appId");
                                                                                                }
                                                                                            } catch (SQLiteException e20) {
                                                                                                e = e20;
                                                                                            }
                                                                                        }
                                                                                        return arrayList2;
                                                                                    }
                                                                                } catch (SQLiteException e21) {
                                                                                    e = e21;
                                                                                    cursorRawQuery = null;
                                                                                } catch (Throwable th10) {
                                                                                    th = th10;
                                                                                    r7 = 0;
                                                                                    if (r7 != 0) {
                                                                                        r7.close();
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                                cursorRawQuery.close();
                                                                                r0 = fVar3;
                                                                                com.google.android.gms.common.internal.x.d(str17);
                                                                                fVar4 = new androidx.collection.f();
                                                                                if (!map2.isEmpty()) {
                                                                                    it2 = map2.keySet().iterator();
                                                                                    while (it2.hasNext()) {
                                                                                        num = (Integer) it2.next();
                                                                                        num.getClass();
                                                                                        e9Var3 = (e9) map2.get(num);
                                                                                        list4 = (List) r0.get(num);
                                                                                        if (list4 != null) {
                                                                                        }
                                                                                        r18 = r0;
                                                                                        it3 = it2;
                                                                                        s1Var2 = s1Var6;
                                                                                        fVar4.put(num, e9Var3);
                                                                                        r0 = r18;
                                                                                        str15 = str15;
                                                                                        it2 = it3;
                                                                                        s1Var6 = s1Var2;
                                                                                    }
                                                                                }
                                                                                str4 = str15;
                                                                                s1Var = s1Var6;
                                                                                map3 = fVar4;
                                                                            } catch (Throwable th11) {
                                                                                th = th11;
                                                                                r7 = hashSet;
                                                                            }
                                                                        } else {
                                                                            str4 = "audience_id";
                                                                            s1Var = s1Var6;
                                                                            map3 = map2;
                                                                        }
                                                                        map5 = map3;
                                                                        map4 = map2;
                                                                        while (r17.hasNext()) {
                                                                            num4.getClass();
                                                                            e9Var = (e9) map5.get(num4);
                                                                            bitSet = new BitSet();
                                                                            bitSet2 = new BitSet();
                                                                            fVar = new androidx.collection.f();
                                                                            if (e9Var != null) {
                                                                                while (r3.hasNext()) {
                                                                                    if (r8Var.u()) {
                                                                                        e9 e9Var7 = e9Var;
                                                                                        Integer numValueOf10 = Integer.valueOf(r8Var.v());
                                                                                        if (r8Var.w()) {
                                                                                            lValueOf = Long.valueOf(r8Var.x());
                                                                                        } else {
                                                                                            lValueOf = null;
                                                                                        }
                                                                                        fVar.put(numValueOf10, lValueOf);
                                                                                        e9Var = e9Var7;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9Var2 = e9Var;
                                                                            fVar2 = new androidx.collection.f();
                                                                            if (e9Var2 != null) {
                                                                                it = e9Var2.A().iterator();
                                                                                while (it.hasNext()) {
                                                                                    g9Var = (g9) it.next();
                                                                                    if (!g9Var.u()) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            Map map13 = map5;
                                                                            if (e9Var2 != null) {
                                                                                i = 0;
                                                                                while (i < e9Var2.v() * 64) {
                                                                                    if (n4.a0((com.google.android.gms.internal.measurement.q1) e9Var2.u(), i)) {
                                                                                        z4 = zG;
                                                                                        s1Var.b().C().c(num4, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                                                                        bitSet2.set(i);
                                                                                        if (n4.a0((com.google.android.gms.internal.measurement.q1) e9Var2.w(), i)) {
                                                                                            bitSet.set(i);
                                                                                        }
                                                                                        i++;
                                                                                        zG = z4;
                                                                                    } else {
                                                                                        z4 = zG;
                                                                                    }
                                                                                    fVar.remove(Integer.valueOf(i));
                                                                                    i++;
                                                                                    zG = z4;
                                                                                }
                                                                            }
                                                                            boolean z7 = zG;
                                                                            e9 e9Var8 = (e9) map4.get(num4);
                                                                            if (zG2) {
                                                                                while (r2.hasNext()) {
                                                                                    int iV3 = h7Var2.v();
                                                                                    Integer num8 = num4;
                                                                                    jLongValue = this.E.longValue() / 1000;
                                                                                    if (h7Var2.D()) {
                                                                                        jLongValue = this.D.longValue() / 1000;
                                                                                    }
                                                                                    numValueOf = Integer.valueOf(iV3);
                                                                                    if (fVar.containsKey(numValueOf)) {
                                                                                        fVar.put(numValueOf, Long.valueOf(jLongValue));
                                                                                    }
                                                                                    if (fVar2.containsKey(numValueOf)) {
                                                                                        fVar2.put(numValueOf, Long.valueOf(jLongValue));
                                                                                    }
                                                                                    num4 = num8;
                                                                                }
                                                                            }
                                                                            this.C.put(num4, new u4(this, this.A, e9Var8, bitSet, bitSet2, fVar, fVar2));
                                                                            map = map;
                                                                            zG = z7;
                                                                            map4 = map4;
                                                                            zG2 = zG2;
                                                                            str3 = str3;
                                                                            map5 = map13;
                                                                        }
                                                                        str5 = str4;
                                                                    }
                                                                    str7 = str2;
                                                                    String str19 = str3;
                                                                    ?? r11 = obj2;
                                                                    if (!list.isEmpty()) {
                                                                        v4Var = new v4(this);
                                                                        fVar6 = new androidx.collection.f();
                                                                        while (r17.hasNext()) {
                                                                            t8VarA = v4Var.a(t8Var, this.A);
                                                                            if (t8VarA != null) {
                                                                                rVarF0 = l4Var.h0().f0(this.A, t8Var, t8VarA.z());
                                                                                l4Var.h0().W("events", rVarF0);
                                                                                if (z) {
                                                                                    j = rVarF0.c;
                                                                                    strZ = t8VarA.z();
                                                                                    map8 = (Map) fVar6.get(strZ);
                                                                                    if (map8 == null) {
                                                                                        m mVarH7 = l4Var.h0();
                                                                                        s1 s1Var9 = (s1) mVarH7.e;
                                                                                        str11 = this.A;
                                                                                        mVarH7.w();
                                                                                        mVarH7.v();
                                                                                        com.google.android.gms.common.internal.x.d(str11);
                                                                                        com.google.android.gms.common.internal.x.d(strZ);
                                                                                        fVar7 = new androidx.collection.f();
                                                                                        Query = mVarH7.m0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strZ}, null, null, null);
                                                                                        if (Query.moveToFirst()) {
                                                                                            str12 = str11;
                                                                                            Query = Query;
                                                                                            r46 = list;
                                                                                            while (true) {
                                                                                                h7 h7Var6 = (h7) ((g7) n4.g0(h7.G(), Query.getBlob(1))).d();
                                                                                                numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                                list6 = (List) fVar7.get(numValueOf6);
                                                                                                if (list6 == null) {
                                                                                                    r46 = Query;
                                                                                                    arrayList4 = new ArrayList();
                                                                                                    fVar7.put(numValueOf6, arrayList4);
                                                                                                    r48 = r46;
                                                                                                } else {
                                                                                                    r48 = Query;
                                                                                                    arrayList4 = list6;
                                                                                                }
                                                                                                arrayList4.add(h7Var6);
                                                                                                r47 = r48;
                                                                                                if (!r47.moveToNext()) {
                                                                                                    break;
                                                                                                    break;
                                                                                                }
                                                                                                Query = r47;
                                                                                                r46 = r47;
                                                                                            }
                                                                                            r47.close();
                                                                                            map8 = fVar7;
                                                                                            r43 = r47;
                                                                                        } else {
                                                                                            ?? r410 = Query;
                                                                                            map8 = Collections.EMPTY_MAP;
                                                                                            r410.close();
                                                                                            r43 = r410;
                                                                                        }
                                                                                        fVar6.put(strZ, map8);
                                                                                        list = r43;
                                                                                    } else {
                                                                                        list = list;
                                                                                    }
                                                                                    while (r19.hasNext()) {
                                                                                        iIntValue2 = num6.intValue();
                                                                                        if (this.B.contains(num6)) {
                                                                                            s1Var.b().C().b(num6, "Skipping failed audience ID");
                                                                                        } else {
                                                                                            it8 = ((List) map8.get(num6)).iterator();
                                                                                            zA = true;
                                                                                            while (true) {
                                                                                                if (!it8.hasNext()) {
                                                                                                    map9 = map8;
                                                                                                    v4Var2 = v4Var;
                                                                                                    num3 = num6;
                                                                                                    break;
                                                                                                }
                                                                                                h7 h7Var7 = (h7) it8.next();
                                                                                                v4Var2 = v4Var;
                                                                                                num3 = num6;
                                                                                                map9 = map8;
                                                                                                bVar2 = new b(this, this.A, iIntValue2, h7Var7, 0);
                                                                                                Long l7 = this.D;
                                                                                                Long l8 = this.E;
                                                                                                iV = h7Var7.v();
                                                                                                u4Var = (u4) this.C.get(num3);
                                                                                                if (u4Var == null) {
                                                                                                    z5 = false;
                                                                                                } else {
                                                                                                    z5 = u4Var.d.get(iV);
                                                                                                }
                                                                                                zA = bVar2.a(l7, l8, t8VarA, j, rVarF0, z5);
                                                                                                if (!zA) {
                                                                                                    this.B.add(num3);
                                                                                                    break;
                                                                                                }
                                                                                                A(num3).a(bVar2);
                                                                                                num6 = num3;
                                                                                                map8 = map9;
                                                                                                v4Var = v4Var2;
                                                                                            }
                                                                                            if (!zA) {
                                                                                                this.B.add(num3);
                                                                                            }
                                                                                            v4Var = v4Var2;
                                                                                            map8 = map9;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    continue;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (!z) {
                                                                        return new ArrayList();
                                                                    }
                                                                    if (!list2.isEmpty()) {
                                                                        androidx.collection.f fVar11 = new androidx.collection.f();
                                                                        it4 = list2.iterator();
                                                                        y0Var = fVar11;
                                                                        while (it4.hasNext()) {
                                                                            k9 k9Var2 = (k9) it4.next();
                                                                            strW = k9Var2.w();
                                                                            map6 = (Map) y0Var.get(strW);
                                                                            if (map6 == null) {
                                                                                m mVarH8 = l4Var.h0();
                                                                                s1Var4 = (s1) mVarH8.e;
                                                                                str9 = this.A;
                                                                                mVarH8.w();
                                                                                mVarH8.v();
                                                                                com.google.android.gms.common.internal.x.d(str9);
                                                                                com.google.android.gms.common.internal.x.d(strW);
                                                                                fVar5 = new androidx.collection.f();
                                                                                cursorQuery2 = mVarH8.m0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strW}, null, null, null);
                                                                                if (cursorQuery2.moveToFirst()) {
                                                                                    it5 = it4;
                                                                                    while (true) {
                                                                                        n7 n7Var3 = (n7) ((m7) n4.g0(n7.C(), cursorQuery2.getBlob(1))).d();
                                                                                        numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                        list5 = (List) fVar5.get(numValueOf5);
                                                                                        if (list5 == null) {
                                                                                            s1Var5 = s1Var4;
                                                                                            arrayList3 = new ArrayList();
                                                                                            fVar5.put(numValueOf5, arrayList3);
                                                                                        } else {
                                                                                            s1Var5 = s1Var4;
                                                                                            arrayList3 = list5;
                                                                                        }
                                                                                        arrayList3.add(n7Var3);
                                                                                        str10 = str9;
                                                                                        if (!cursorQuery2.moveToNext()) {
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        s1Var4 = s1Var5;
                                                                                        str9 = str10;
                                                                                    }
                                                                                    cursorQuery2.close();
                                                                                    map6 = fVar5;
                                                                                } else {
                                                                                    it5 = it4;
                                                                                    map6 = Collections.EMPTY_MAP;
                                                                                    cursorQuery2.close();
                                                                                }
                                                                                y0Var.put(strW, map6);
                                                                            } else {
                                                                                it5 = it4;
                                                                            }
                                                                            it6 = map6.keySet().iterator();
                                                                            y0Var2 = y0Var;
                                                                            while (it6.hasNext()) {
                                                                                num2 = (Integer) it6.next();
                                                                                iIntValue = num2.intValue();
                                                                                if (this.B.contains(num2)) {
                                                                                    s1Var.b().C().b(num2, "Skipping failed audience ID");
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                it7 = ((List) map6.get(num2)).iterator();
                                                                                zB = true;
                                                                                y0Var3 = y0Var2;
                                                                                while (true) {
                                                                                    if (it7.hasNext()) {
                                                                                        n7Var = (n7) it7.next();
                                                                                        map7 = map6;
                                                                                        if (Log.isLoggable(s1Var.b().F(), 2)) {
                                                                                            v0 v0VarC4 = s1Var.b().C();
                                                                                            if (n7Var.u()) {
                                                                                                numValueOf4 = Integer.valueOf(n7Var.v());
                                                                                            } else {
                                                                                                numValueOf4 = null;
                                                                                            }
                                                                                            v0VarC4.d("Evaluating filter. audience, filter, property", num2, numValueOf4, s1Var.n().c(n7Var.w()));
                                                                                            s1Var.b().C().b(l4Var.k0().X(n7Var), "Filter definition");
                                                                                        }
                                                                                        if (n7Var.u()) {
                                                                                        }
                                                                                        v0 v0VarA4 = s1Var.b().A();
                                                                                        w0 w0VarD4 = x0.D(this.A);
                                                                                        if (n7Var.u()) {
                                                                                            numValueOf3 = Integer.valueOf(n7Var.v());
                                                                                        } else {
                                                                                            numValueOf3 = null;
                                                                                        }
                                                                                        v0VarA4.c(w0VarD4, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                        this.B.add(num2);
                                                                                        map6 = map7;
                                                                                        y0Var2 = y0Var3;
                                                                                        it6 = it6;
                                                                                    } else {
                                                                                        map7 = map6;
                                                                                        y0Var3 = y0Var3;
                                                                                        it6 = it6;
                                                                                    }
                                                                                    if (!zB) {
                                                                                        this.B.add(num2);
                                                                                    }
                                                                                    map6 = map7;
                                                                                    y0Var2 = y0Var3;
                                                                                    it6 = it6;
                                                                                    A(num2).a(bVar);
                                                                                    iIntValue = i2;
                                                                                    map6 = map7;
                                                                                    y0Var3 = y0Var3;
                                                                                    it6 = it6;
                                                                                }
                                                                            }
                                                                            it4 = it5;
                                                                            y0Var = y0Var2;
                                                                        }
                                                                    }
                                                                    arrayList2 = new ArrayList();
                                                                    androidx.collection.c<Integer> cVar2 = (androidx.collection.c) this.C.keySet();
                                                                    cVar2.removeAll(this.B);
                                                                    while (r3.hasNext()) {
                                                                        int iIntValue4 = num7.intValue();
                                                                        u4 u4Var3 = (u4) this.C.get(num7);
                                                                        com.google.android.gms.common.internal.x.g(u4Var3);
                                                                        l8 l8VarB2 = u4Var3.b(iIntValue4);
                                                                        arrayList2.add(l8VarB2);
                                                                        mVarH1 = l4Var.h0();
                                                                        s1Var3 = (s1) mVarH1.e;
                                                                        str8 = this.A;
                                                                        e9 e9VarW2 = l8VarB2.w();
                                                                        mVarH1.w();
                                                                        mVarH1.v();
                                                                        com.google.android.gms.common.internal.x.d(str8);
                                                                        com.google.android.gms.common.internal.x.g(e9VarW2);
                                                                        byte[] bArrA2 = e9VarW2.a();
                                                                        contentValues = new ContentValues();
                                                                        contentValues.put("app_id", str8);
                                                                        contentValues.put(str5, num7);
                                                                        contentValues.put("current_results", bArrA2);
                                                                        if (mVarH1.m0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                            s1Var3.b().z().b(x0.D(str8), "Failed to insert filter results (got -1). appId");
                                                                        }
                                                                    }
                                                                    return arrayList2;
                                                                }
                                                            }
                                                            try {
                                                                if (!cursorQuery.moveToNext()) {
                                                                    break;
                                                                }
                                                                str14 = str3;
                                                                objD = obj2;
                                                                r21 = r21;
                                                            } catch (SQLiteException e22) {
                                                                e = e22;
                                                                r17.b().z().c(x0.D(r21), e, "Database error querying filter results. appId");
                                                                Map map14 = Collections.EMPTY_MAP;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                map2 = map14;
                                                            }
                                                        } catch (SQLiteException e23) {
                                                            e = e23;
                                                            r21 = r21;
                                                            r17 = r17;
                                                            str3 = str14;
                                                            obj2 = objD;
                                                            r21 = r21;
                                                            r17.b().z().c(x0.D(r21), e, "Database error querying filter results. appId");
                                                            Map map15 = Collections.EMPTY_MAP;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            map2 = map15;
                                                            if (map2.isEmpty()) {
                                                                str5 = "audience_id";
                                                                s1Var = s1Var6;
                                                            } else {
                                                                HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
                                                                if (z3) {
                                                                    String str110 = this.A;
                                                                    mVarH0 = l4Var.h0();
                                                                    str6 = this.A;
                                                                    mVarH0.w();
                                                                    mVarH0.v();
                                                                    com.google.android.gms.common.internal.x.d(str6);
                                                                    fVar3 = new androidx.collection.f();
                                                                    cursorRawQuery = mVarH0.m0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                                    if (cursorRawQuery.moveToFirst()) {
                                                                        do {
                                                                            numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                            arrayList = (List) fVar3.get(numValueOf2);
                                                                            if (arrayList == null) {
                                                                                arrayList = new ArrayList();
                                                                                fVar3.put(numValueOf2, arrayList);
                                                                            }
                                                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                        } while (cursorRawQuery.moveToNext());
                                                                    } else {
                                                                        fVar3 = Collections.EMPTY_MAP;
                                                                    }
                                                                    cursorRawQuery.close();
                                                                    r0 = fVar3;
                                                                    com.google.android.gms.common.internal.x.d(str110);
                                                                    fVar4 = new androidx.collection.f();
                                                                    if (!map2.isEmpty()) {
                                                                        it2 = map2.keySet().iterator();
                                                                        while (it2.hasNext()) {
                                                                            num = (Integer) it2.next();
                                                                            num.getClass();
                                                                            e9Var3 = (e9) map2.get(num);
                                                                            list4 = (List) r0.get(num);
                                                                            if (list4 != null) {
                                                                            }
                                                                            r18 = r0;
                                                                            it3 = it2;
                                                                            s1Var2 = s1Var6;
                                                                            fVar4.put(num, e9Var3);
                                                                            r0 = r18;
                                                                            str15 = str15;
                                                                            it2 = it3;
                                                                            s1Var6 = s1Var2;
                                                                        }
                                                                    }
                                                                    str4 = str15;
                                                                    s1Var = s1Var6;
                                                                    map3 = fVar4;
                                                                } else {
                                                                    str4 = "audience_id";
                                                                    s1Var = s1Var6;
                                                                    map3 = map2;
                                                                }
                                                                map5 = map3;
                                                                map4 = map2;
                                                                while (r17.hasNext()) {
                                                                    num4.getClass();
                                                                    e9Var = (e9) map5.get(num4);
                                                                    bitSet = new BitSet();
                                                                    bitSet2 = new BitSet();
                                                                    fVar = new androidx.collection.f();
                                                                    if (e9Var != null) {
                                                                        while (r3.hasNext()) {
                                                                            if (r8Var.u()) {
                                                                                e9 e9Var9 = e9Var;
                                                                                Integer numValueOf11 = Integer.valueOf(r8Var.v());
                                                                                if (r8Var.w()) {
                                                                                    lValueOf = Long.valueOf(r8Var.x());
                                                                                } else {
                                                                                    lValueOf = null;
                                                                                }
                                                                                fVar.put(numValueOf11, lValueOf);
                                                                                e9Var = e9Var9;
                                                                            }
                                                                        }
                                                                    }
                                                                    e9Var2 = e9Var;
                                                                    fVar2 = new androidx.collection.f();
                                                                    if (e9Var2 != null) {
                                                                        it = e9Var2.A().iterator();
                                                                        while (it.hasNext()) {
                                                                            g9Var = (g9) it.next();
                                                                            if (!g9Var.u()) {
                                                                            }
                                                                        }
                                                                    }
                                                                    Map map16 = map5;
                                                                    if (e9Var2 != null) {
                                                                        i = 0;
                                                                        while (i < e9Var2.v() * 64) {
                                                                            if (n4.a0((com.google.android.gms.internal.measurement.q1) e9Var2.u(), i)) {
                                                                                z4 = zG;
                                                                                s1Var.b().C().c(num4, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                                                                bitSet2.set(i);
                                                                                if (n4.a0((com.google.android.gms.internal.measurement.q1) e9Var2.w(), i)) {
                                                                                    bitSet.set(i);
                                                                                }
                                                                                i++;
                                                                                zG = z4;
                                                                            } else {
                                                                                z4 = zG;
                                                                            }
                                                                            fVar.remove(Integer.valueOf(i));
                                                                            i++;
                                                                            zG = z4;
                                                                        }
                                                                    }
                                                                    boolean z8 = zG;
                                                                    e9 e9Var10 = (e9) map4.get(num4);
                                                                    if (zG2) {
                                                                        while (r2.hasNext()) {
                                                                            int iV4 = h7Var2.v();
                                                                            Integer num9 = num4;
                                                                            jLongValue = this.E.longValue() / 1000;
                                                                            if (h7Var2.D()) {
                                                                                jLongValue = this.D.longValue() / 1000;
                                                                            }
                                                                            numValueOf = Integer.valueOf(iV4);
                                                                            if (fVar.containsKey(numValueOf)) {
                                                                                fVar.put(numValueOf, Long.valueOf(jLongValue));
                                                                            }
                                                                            if (fVar2.containsKey(numValueOf)) {
                                                                                fVar2.put(numValueOf, Long.valueOf(jLongValue));
                                                                            }
                                                                            num4 = num9;
                                                                        }
                                                                    }
                                                                    this.C.put(num4, new u4(this, this.A, e9Var10, bitSet, bitSet2, fVar, fVar2));
                                                                    map = map;
                                                                    zG = z8;
                                                                    map4 = map4;
                                                                    zG2 = zG2;
                                                                    str3 = str3;
                                                                    map5 = map16;
                                                                }
                                                                str5 = str4;
                                                            }
                                                            str7 = str2;
                                                            String str111 = str3;
                                                            ?? r12 = obj2;
                                                            if (!list.isEmpty()) {
                                                                v4Var = new v4(this);
                                                                fVar6 = new androidx.collection.f();
                                                                while (r17.hasNext()) {
                                                                    t8VarA = v4Var.a(t8Var, this.A);
                                                                    if (t8VarA != null) {
                                                                        rVarF0 = l4Var.h0().f0(this.A, t8Var, t8VarA.z());
                                                                        l4Var.h0().W("events", rVarF0);
                                                                        if (z) {
                                                                            j = rVarF0.c;
                                                                            strZ = t8VarA.z();
                                                                            map8 = (Map) fVar6.get(strZ);
                                                                            if (map8 == null) {
                                                                                m mVarH9 = l4Var.h0();
                                                                                s1 s1Var10 = (s1) mVarH9.e;
                                                                                str11 = this.A;
                                                                                mVarH9.w();
                                                                                mVarH9.v();
                                                                                com.google.android.gms.common.internal.x.d(str11);
                                                                                com.google.android.gms.common.internal.x.d(strZ);
                                                                                fVar7 = new androidx.collection.f();
                                                                                Query = mVarH9.m0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strZ}, null, null, null);
                                                                                if (Query.moveToFirst()) {
                                                                                    str12 = str11;
                                                                                    Query = Query;
                                                                                    r46 = list;
                                                                                    while (true) {
                                                                                        h7 h7Var8 = (h7) ((g7) n4.g0(h7.G(), Query.getBlob(1))).d();
                                                                                        numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                        list6 = (List) fVar7.get(numValueOf6);
                                                                                        if (list6 == null) {
                                                                                            r46 = Query;
                                                                                            arrayList4 = new ArrayList();
                                                                                            fVar7.put(numValueOf6, arrayList4);
                                                                                            r48 = r46;
                                                                                        } else {
                                                                                            r48 = Query;
                                                                                            arrayList4 = list6;
                                                                                        }
                                                                                        arrayList4.add(h7Var8);
                                                                                        r47 = r48;
                                                                                        if (!r47.moveToNext()) {
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        Query = r47;
                                                                                        r46 = r47;
                                                                                    }
                                                                                    r47.close();
                                                                                    map8 = fVar7;
                                                                                    r43 = r47;
                                                                                } else {
                                                                                    ?? r411 = Query;
                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                    r411.close();
                                                                                    r43 = r411;
                                                                                }
                                                                                fVar6.put(strZ, map8);
                                                                                list = r43;
                                                                            } else {
                                                                                list = list;
                                                                            }
                                                                            while (r19.hasNext()) {
                                                                                iIntValue2 = num6.intValue();
                                                                                if (this.B.contains(num6)) {
                                                                                    s1Var.b().C().b(num6, "Skipping failed audience ID");
                                                                                } else {
                                                                                    it8 = ((List) map8.get(num6)).iterator();
                                                                                    zA = true;
                                                                                    while (true) {
                                                                                        if (!it8.hasNext()) {
                                                                                            map9 = map8;
                                                                                            v4Var2 = v4Var;
                                                                                            num3 = num6;
                                                                                            break;
                                                                                        }
                                                                                        h7 h7Var9 = (h7) it8.next();
                                                                                        v4Var2 = v4Var;
                                                                                        num3 = num6;
                                                                                        map9 = map8;
                                                                                        bVar2 = new b(this, this.A, iIntValue2, h7Var9, 0);
                                                                                        Long l9 = this.D;
                                                                                        Long l10 = this.E;
                                                                                        iV = h7Var9.v();
                                                                                        u4Var = (u4) this.C.get(num3);
                                                                                        if (u4Var == null) {
                                                                                            z5 = false;
                                                                                        } else {
                                                                                            z5 = u4Var.d.get(iV);
                                                                                        }
                                                                                        zA = bVar2.a(l9, l10, t8VarA, j, rVarF0, z5);
                                                                                        if (!zA) {
                                                                                            this.B.add(num3);
                                                                                            break;
                                                                                        }
                                                                                        A(num3).a(bVar2);
                                                                                        num6 = num3;
                                                                                        map8 = map9;
                                                                                        v4Var = v4Var2;
                                                                                    }
                                                                                    if (!zA) {
                                                                                        this.B.add(num3);
                                                                                    }
                                                                                    v4Var = v4Var2;
                                                                                    map8 = map9;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            continue;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            if (!z) {
                                                                return new ArrayList();
                                                            }
                                                            if (!list2.isEmpty()) {
                                                                androidx.collection.f fVar12 = new androidx.collection.f();
                                                                it4 = list2.iterator();
                                                                y0Var = fVar12;
                                                                while (it4.hasNext()) {
                                                                    k9 k9Var3 = (k9) it4.next();
                                                                    strW = k9Var3.w();
                                                                    map6 = (Map) y0Var.get(strW);
                                                                    if (map6 == null) {
                                                                        m mVarH10 = l4Var.h0();
                                                                        s1Var4 = (s1) mVarH10.e;
                                                                        str9 = this.A;
                                                                        mVarH10.w();
                                                                        mVarH10.v();
                                                                        com.google.android.gms.common.internal.x.d(str9);
                                                                        com.google.android.gms.common.internal.x.d(strW);
                                                                        fVar5 = new androidx.collection.f();
                                                                        cursorQuery2 = mVarH10.m0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strW}, null, null, null);
                                                                        if (cursorQuery2.moveToFirst()) {
                                                                            it5 = it4;
                                                                            while (true) {
                                                                                n7 n7Var4 = (n7) ((m7) n4.g0(n7.C(), cursorQuery2.getBlob(1))).d();
                                                                                numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                list5 = (List) fVar5.get(numValueOf5);
                                                                                if (list5 == null) {
                                                                                    s1Var5 = s1Var4;
                                                                                    arrayList3 = new ArrayList();
                                                                                    fVar5.put(numValueOf5, arrayList3);
                                                                                } else {
                                                                                    s1Var5 = s1Var4;
                                                                                    arrayList3 = list5;
                                                                                }
                                                                                arrayList3.add(n7Var4);
                                                                                str10 = str9;
                                                                                if (!cursorQuery2.moveToNext()) {
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                s1Var4 = s1Var5;
                                                                                str9 = str10;
                                                                            }
                                                                            cursorQuery2.close();
                                                                            map6 = fVar5;
                                                                        } else {
                                                                            it5 = it4;
                                                                            map6 = Collections.EMPTY_MAP;
                                                                            cursorQuery2.close();
                                                                        }
                                                                        y0Var.put(strW, map6);
                                                                    } else {
                                                                        it5 = it4;
                                                                    }
                                                                    it6 = map6.keySet().iterator();
                                                                    y0Var2 = y0Var;
                                                                    while (it6.hasNext()) {
                                                                        num2 = (Integer) it6.next();
                                                                        iIntValue = num2.intValue();
                                                                        if (this.B.contains(num2)) {
                                                                            s1Var.b().C().b(num2, "Skipping failed audience ID");
                                                                            break;
                                                                            break;
                                                                        }
                                                                        it7 = ((List) map6.get(num2)).iterator();
                                                                        zB = true;
                                                                        y0Var3 = y0Var2;
                                                                        while (true) {
                                                                            if (it7.hasNext()) {
                                                                                n7Var = (n7) it7.next();
                                                                                map7 = map6;
                                                                                if (Log.isLoggable(s1Var.b().F(), 2)) {
                                                                                    v0 v0VarC5 = s1Var.b().C();
                                                                                    if (n7Var.u()) {
                                                                                        numValueOf4 = Integer.valueOf(n7Var.v());
                                                                                    } else {
                                                                                        numValueOf4 = null;
                                                                                    }
                                                                                    v0VarC5.d("Evaluating filter. audience, filter, property", num2, numValueOf4, s1Var.n().c(n7Var.w()));
                                                                                    s1Var.b().C().b(l4Var.k0().X(n7Var), "Filter definition");
                                                                                }
                                                                                if (n7Var.u()) {
                                                                                }
                                                                                v0 v0VarA5 = s1Var.b().A();
                                                                                w0 w0VarD5 = x0.D(this.A);
                                                                                if (n7Var.u()) {
                                                                                    numValueOf3 = Integer.valueOf(n7Var.v());
                                                                                } else {
                                                                                    numValueOf3 = null;
                                                                                }
                                                                                v0VarA5.c(w0VarD5, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                this.B.add(num2);
                                                                                map6 = map7;
                                                                                y0Var2 = y0Var3;
                                                                                it6 = it6;
                                                                            } else {
                                                                                map7 = map6;
                                                                                y0Var3 = y0Var3;
                                                                                it6 = it6;
                                                                            }
                                                                            if (!zB) {
                                                                                this.B.add(num2);
                                                                            }
                                                                            map6 = map7;
                                                                            y0Var2 = y0Var3;
                                                                            it6 = it6;
                                                                            A(num2).a(bVar);
                                                                            iIntValue = i2;
                                                                            map6 = map7;
                                                                            y0Var3 = y0Var3;
                                                                            it6 = it6;
                                                                        }
                                                                    }
                                                                    it4 = it5;
                                                                    y0Var = y0Var2;
                                                                }
                                                            }
                                                            arrayList2 = new ArrayList();
                                                            androidx.collection.c<Integer> cVar3 = (androidx.collection.c) this.C.keySet();
                                                            cVar3.removeAll(this.B);
                                                            while (r3.hasNext()) {
                                                                int iIntValue5 = num7.intValue();
                                                                u4 u4Var4 = (u4) this.C.get(num7);
                                                                com.google.android.gms.common.internal.x.g(u4Var4);
                                                                l8 l8VarB3 = u4Var4.b(iIntValue5);
                                                                arrayList2.add(l8VarB3);
                                                                mVarH1 = l4Var.h0();
                                                                s1Var3 = (s1) mVarH1.e;
                                                                str8 = this.A;
                                                                e9 e9VarW3 = l8VarB3.w();
                                                                mVarH1.w();
                                                                mVarH1.v();
                                                                com.google.android.gms.common.internal.x.d(str8);
                                                                com.google.android.gms.common.internal.x.g(e9VarW3);
                                                                byte[] bArrA3 = e9VarW3.a();
                                                                contentValues = new ContentValues();
                                                                contentValues.put("app_id", str8);
                                                                contentValues.put(str5, num7);
                                                                contentValues.put("current_results", bArrA3);
                                                                if (mVarH1.m0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                    s1Var3.b().z().b(x0.D(str8), "Failed to insert filter results (got -1). appId");
                                                                }
                                                            }
                                                            return arrayList2;
                                                        }
                                                    }
                                                    cursorQuery.close();
                                                    obj = obj3;
                                                    r5 = r6;
                                                    map2 = fVar8;
                                                } else {
                                                    Map map17 = Collections.EMPTY_MAP;
                                                    cursorQuery.close();
                                                    map2 = map17;
                                                    str3 = "Failed to merge filter. appId";
                                                    obj2 = "Database error querying filters. appId";
                                                    obj = obj;
                                                    r5 = r5;
                                                }
                                                if (map2.isEmpty()) {
                                                    str5 = "audience_id";
                                                    s1Var = s1Var6;
                                                } else {
                                                    HashSet<Integer> hashSet3 = new HashSet(map2.keySet());
                                                    if (z3) {
                                                        String str112 = this.A;
                                                        mVarH0 = l4Var.h0();
                                                        str6 = this.A;
                                                        mVarH0.w();
                                                        mVarH0.v();
                                                        com.google.android.gms.common.internal.x.d(str6);
                                                        fVar3 = new androidx.collection.f();
                                                        cursorRawQuery = mVarH0.m0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                        if (cursorRawQuery.moveToFirst()) {
                                                            do {
                                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                arrayList = (List) fVar3.get(numValueOf2);
                                                                if (arrayList == null) {
                                                                    arrayList = new ArrayList();
                                                                    fVar3.put(numValueOf2, arrayList);
                                                                }
                                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                            } while (cursorRawQuery.moveToNext());
                                                        } else {
                                                            fVar3 = Collections.EMPTY_MAP;
                                                        }
                                                        cursorRawQuery.close();
                                                        r0 = fVar3;
                                                        com.google.android.gms.common.internal.x.d(str112);
                                                        fVar4 = new androidx.collection.f();
                                                        if (!map2.isEmpty()) {
                                                            it2 = map2.keySet().iterator();
                                                            while (it2.hasNext()) {
                                                                num = (Integer) it2.next();
                                                                num.getClass();
                                                                e9Var3 = (e9) map2.get(num);
                                                                list4 = (List) r0.get(num);
                                                                if (list4 != null) {
                                                                }
                                                                r18 = r0;
                                                                it3 = it2;
                                                                s1Var2 = s1Var6;
                                                                fVar4.put(num, e9Var3);
                                                                r0 = r18;
                                                                str15 = str15;
                                                                it2 = it3;
                                                                s1Var6 = s1Var2;
                                                            }
                                                        }
                                                        str4 = str15;
                                                        s1Var = s1Var6;
                                                        map3 = fVar4;
                                                    } else {
                                                        str4 = "audience_id";
                                                        s1Var = s1Var6;
                                                        map3 = map2;
                                                    }
                                                    map5 = map3;
                                                    map4 = map2;
                                                    while (r17.hasNext()) {
                                                        num4.getClass();
                                                        e9Var = (e9) map5.get(num4);
                                                        bitSet = new BitSet();
                                                        bitSet2 = new BitSet();
                                                        fVar = new androidx.collection.f();
                                                        if (e9Var != null) {
                                                            while (r3.hasNext()) {
                                                                if (r8Var.u()) {
                                                                    e9 e9Var11 = e9Var;
                                                                    Integer numValueOf12 = Integer.valueOf(r8Var.v());
                                                                    if (r8Var.w()) {
                                                                        lValueOf = Long.valueOf(r8Var.x());
                                                                    } else {
                                                                        lValueOf = null;
                                                                    }
                                                                    fVar.put(numValueOf12, lValueOf);
                                                                    e9Var = e9Var11;
                                                                }
                                                            }
                                                        }
                                                        e9Var2 = e9Var;
                                                        fVar2 = new androidx.collection.f();
                                                        if (e9Var2 != null) {
                                                            it = e9Var2.A().iterator();
                                                            while (it.hasNext()) {
                                                                g9Var = (g9) it.next();
                                                                if (!g9Var.u()) {
                                                                }
                                                            }
                                                        }
                                                        Map map18 = map5;
                                                        if (e9Var2 != null) {
                                                            i = 0;
                                                            while (i < e9Var2.v() * 64) {
                                                                if (n4.a0((com.google.android.gms.internal.measurement.q1) e9Var2.u(), i)) {
                                                                    z4 = zG;
                                                                    s1Var.b().C().c(num4, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                                                    bitSet2.set(i);
                                                                    if (n4.a0((com.google.android.gms.internal.measurement.q1) e9Var2.w(), i)) {
                                                                        bitSet.set(i);
                                                                    }
                                                                    i++;
                                                                    zG = z4;
                                                                } else {
                                                                    z4 = zG;
                                                                }
                                                                fVar.remove(Integer.valueOf(i));
                                                                i++;
                                                                zG = z4;
                                                            }
                                                        }
                                                        boolean z9 = zG;
                                                        e9 e9Var12 = (e9) map4.get(num4);
                                                        if (zG2) {
                                                            while (r2.hasNext()) {
                                                                int iV5 = h7Var2.v();
                                                                Integer num10 = num4;
                                                                jLongValue = this.E.longValue() / 1000;
                                                                if (h7Var2.D()) {
                                                                    jLongValue = this.D.longValue() / 1000;
                                                                }
                                                                numValueOf = Integer.valueOf(iV5);
                                                                if (fVar.containsKey(numValueOf)) {
                                                                    fVar.put(numValueOf, Long.valueOf(jLongValue));
                                                                }
                                                                if (fVar2.containsKey(numValueOf)) {
                                                                    fVar2.put(numValueOf, Long.valueOf(jLongValue));
                                                                }
                                                                num4 = num10;
                                                            }
                                                        }
                                                        this.C.put(num4, new u4(this, this.A, e9Var12, bitSet, bitSet2, fVar, fVar2));
                                                        map = map;
                                                        zG = z9;
                                                        map4 = map4;
                                                        zG2 = zG2;
                                                        str3 = str3;
                                                        map5 = map18;
                                                    }
                                                    str5 = str4;
                                                }
                                                str7 = str2;
                                                String str113 = str3;
                                                ?? r13 = obj2;
                                                if (!list.isEmpty()) {
                                                    v4Var = new v4(this);
                                                    fVar6 = new androidx.collection.f();
                                                    while (r17.hasNext()) {
                                                        t8VarA = v4Var.a(t8Var, this.A);
                                                        if (t8VarA != null) {
                                                            rVarF0 = l4Var.h0().f0(this.A, t8Var, t8VarA.z());
                                                            l4Var.h0().W("events", rVarF0);
                                                            if (z) {
                                                                j = rVarF0.c;
                                                                strZ = t8VarA.z();
                                                                map8 = (Map) fVar6.get(strZ);
                                                                if (map8 == null) {
                                                                    m mVarH11 = l4Var.h0();
                                                                    s1 s1Var11 = (s1) mVarH11.e;
                                                                    str11 = this.A;
                                                                    mVarH11.w();
                                                                    mVarH11.v();
                                                                    com.google.android.gms.common.internal.x.d(str11);
                                                                    com.google.android.gms.common.internal.x.d(strZ);
                                                                    fVar7 = new androidx.collection.f();
                                                                    Query = mVarH11.m0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strZ}, null, null, null);
                                                                    if (Query.moveToFirst()) {
                                                                        str12 = str11;
                                                                        Query = Query;
                                                                        r46 = list;
                                                                        while (true) {
                                                                            h7 h7Var10 = (h7) ((g7) n4.g0(h7.G(), Query.getBlob(1))).d();
                                                                            numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                            list6 = (List) fVar7.get(numValueOf6);
                                                                            if (list6 == null) {
                                                                                r46 = Query;
                                                                                arrayList4 = new ArrayList();
                                                                                fVar7.put(numValueOf6, arrayList4);
                                                                                r48 = r46;
                                                                            } else {
                                                                                r48 = Query;
                                                                                arrayList4 = list6;
                                                                            }
                                                                            arrayList4.add(h7Var10);
                                                                            r47 = r48;
                                                                            if (!r47.moveToNext()) {
                                                                                break;
                                                                                break;
                                                                            }
                                                                            Query = r47;
                                                                            r46 = r47;
                                                                        }
                                                                        r47.close();
                                                                        map8 = fVar7;
                                                                        r43 = r47;
                                                                    } else {
                                                                        ?? r412 = Query;
                                                                        map8 = Collections.EMPTY_MAP;
                                                                        r412.close();
                                                                        r43 = r412;
                                                                    }
                                                                    fVar6.put(strZ, map8);
                                                                    list = r43;
                                                                } else {
                                                                    list = list;
                                                                }
                                                                while (r19.hasNext()) {
                                                                    iIntValue2 = num6.intValue();
                                                                    if (this.B.contains(num6)) {
                                                                        s1Var.b().C().b(num6, "Skipping failed audience ID");
                                                                    } else {
                                                                        it8 = ((List) map8.get(num6)).iterator();
                                                                        zA = true;
                                                                        while (true) {
                                                                            if (!it8.hasNext()) {
                                                                                map9 = map8;
                                                                                v4Var2 = v4Var;
                                                                                num3 = num6;
                                                                                break;
                                                                            }
                                                                            h7 h7Var11 = (h7) it8.next();
                                                                            v4Var2 = v4Var;
                                                                            num3 = num6;
                                                                            map9 = map8;
                                                                            bVar2 = new b(this, this.A, iIntValue2, h7Var11, 0);
                                                                            Long l11 = this.D;
                                                                            Long l12 = this.E;
                                                                            iV = h7Var11.v();
                                                                            u4Var = (u4) this.C.get(num3);
                                                                            if (u4Var == null) {
                                                                                z5 = false;
                                                                            } else {
                                                                                z5 = u4Var.d.get(iV);
                                                                            }
                                                                            zA = bVar2.a(l11, l12, t8VarA, j, rVarF0, z5);
                                                                            if (!zA) {
                                                                                this.B.add(num3);
                                                                                break;
                                                                            }
                                                                            A(num3).a(bVar2);
                                                                            num6 = num3;
                                                                            map8 = map9;
                                                                            v4Var = v4Var2;
                                                                        }
                                                                        if (!zA) {
                                                                            this.B.add(num3);
                                                                        }
                                                                        v4Var = v4Var2;
                                                                        map8 = map9;
                                                                    }
                                                                }
                                                            } else {
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (!z) {
                                                    return new ArrayList();
                                                }
                                                if (!list2.isEmpty()) {
                                                    androidx.collection.f fVar13 = new androidx.collection.f();
                                                    it4 = list2.iterator();
                                                    y0Var = fVar13;
                                                    while (it4.hasNext()) {
                                                        k9 k9Var4 = (k9) it4.next();
                                                        strW = k9Var4.w();
                                                        map6 = (Map) y0Var.get(strW);
                                                        if (map6 == null) {
                                                            m mVarH12 = l4Var.h0();
                                                            s1Var4 = (s1) mVarH12.e;
                                                            str9 = this.A;
                                                            mVarH12.w();
                                                            mVarH12.v();
                                                            com.google.android.gms.common.internal.x.d(str9);
                                                            com.google.android.gms.common.internal.x.d(strW);
                                                            fVar5 = new androidx.collection.f();
                                                            cursorQuery2 = mVarH12.m0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strW}, null, null, null);
                                                            if (cursorQuery2.moveToFirst()) {
                                                                it5 = it4;
                                                                while (true) {
                                                                    n7 n7Var5 = (n7) ((m7) n4.g0(n7.C(), cursorQuery2.getBlob(1))).d();
                                                                    numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                    list5 = (List) fVar5.get(numValueOf5);
                                                                    if (list5 == null) {
                                                                        s1Var5 = s1Var4;
                                                                        arrayList3 = new ArrayList();
                                                                        fVar5.put(numValueOf5, arrayList3);
                                                                    } else {
                                                                        s1Var5 = s1Var4;
                                                                        arrayList3 = list5;
                                                                    }
                                                                    arrayList3.add(n7Var5);
                                                                    str10 = str9;
                                                                    if (!cursorQuery2.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    s1Var4 = s1Var5;
                                                                    str9 = str10;
                                                                }
                                                                cursorQuery2.close();
                                                                map6 = fVar5;
                                                            } else {
                                                                it5 = it4;
                                                                map6 = Collections.EMPTY_MAP;
                                                                cursorQuery2.close();
                                                            }
                                                            y0Var.put(strW, map6);
                                                        } else {
                                                            it5 = it4;
                                                        }
                                                        it6 = map6.keySet().iterator();
                                                        y0Var2 = y0Var;
                                                        while (it6.hasNext()) {
                                                            num2 = (Integer) it6.next();
                                                            iIntValue = num2.intValue();
                                                            if (this.B.contains(num2)) {
                                                                s1Var.b().C().b(num2, "Skipping failed audience ID");
                                                                break;
                                                                break;
                                                            }
                                                            it7 = ((List) map6.get(num2)).iterator();
                                                            zB = true;
                                                            y0Var3 = y0Var2;
                                                            while (true) {
                                                                if (it7.hasNext()) {
                                                                    n7Var = (n7) it7.next();
                                                                    map7 = map6;
                                                                    if (Log.isLoggable(s1Var.b().F(), 2)) {
                                                                        v0 v0VarC6 = s1Var.b().C();
                                                                        if (n7Var.u()) {
                                                                            numValueOf4 = Integer.valueOf(n7Var.v());
                                                                        } else {
                                                                            numValueOf4 = null;
                                                                        }
                                                                        v0VarC6.d("Evaluating filter. audience, filter, property", num2, numValueOf4, s1Var.n().c(n7Var.w()));
                                                                        s1Var.b().C().b(l4Var.k0().X(n7Var), "Filter definition");
                                                                    }
                                                                    if (n7Var.u()) {
                                                                    }
                                                                    v0 v0VarA6 = s1Var.b().A();
                                                                    w0 w0VarD6 = x0.D(this.A);
                                                                    if (n7Var.u()) {
                                                                        numValueOf3 = Integer.valueOf(n7Var.v());
                                                                    } else {
                                                                        numValueOf3 = null;
                                                                    }
                                                                    v0VarA6.c(w0VarD6, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                    this.B.add(num2);
                                                                    map6 = map7;
                                                                    y0Var2 = y0Var3;
                                                                    it6 = it6;
                                                                } else {
                                                                    map7 = map6;
                                                                    y0Var3 = y0Var3;
                                                                    it6 = it6;
                                                                }
                                                                if (!zB) {
                                                                    this.B.add(num2);
                                                                }
                                                                map6 = map7;
                                                                y0Var2 = y0Var3;
                                                                it6 = it6;
                                                                A(num2).a(bVar);
                                                                iIntValue = i2;
                                                                map6 = map7;
                                                                y0Var3 = y0Var3;
                                                                it6 = it6;
                                                            }
                                                        }
                                                        it4 = it5;
                                                        y0Var = y0Var2;
                                                    }
                                                }
                                                arrayList2 = new ArrayList();
                                                androidx.collection.c<Integer> cVar4 = (androidx.collection.c) this.C.keySet();
                                                cVar4.removeAll(this.B);
                                                while (r3.hasNext()) {
                                                    int iIntValue6 = num7.intValue();
                                                    u4 u4Var5 = (u4) this.C.get(num7);
                                                    com.google.android.gms.common.internal.x.g(u4Var5);
                                                    l8 l8VarB4 = u4Var5.b(iIntValue6);
                                                    arrayList2.add(l8VarB4);
                                                    mVarH1 = l4Var.h0();
                                                    s1Var3 = (s1) mVarH1.e;
                                                    str8 = this.A;
                                                    e9 e9VarW4 = l8VarB4.w();
                                                    mVarH1.w();
                                                    mVarH1.v();
                                                    com.google.android.gms.common.internal.x.d(str8);
                                                    com.google.android.gms.common.internal.x.g(e9VarW4);
                                                    byte[] bArrA4 = e9VarW4.a();
                                                    contentValues = new ContentValues();
                                                    contentValues.put("app_id", str8);
                                                    contentValues.put(str5, num7);
                                                    contentValues.put("current_results", bArrA4);
                                                    if (mVarH1.m0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                        s1Var3.b().z().b(x0.D(str8), "Failed to insert filter results (got -1). appId");
                                                    }
                                                }
                                                return arrayList2;
                                            }
                                        }
                                        r111.close();
                                        map = fVar9;
                                    } else {
                                        str2 = "data";
                                        Query2.close();
                                    }
                                } catch (SQLiteException e24) {
                                    e = e24;
                                    str2 = "data";
                                }
                                m mVarH13 = l4Var.h0();
                                obj = (s1) mVarH13.e;
                                r5 = this.A;
                                mVarH13.w();
                                mVarH13.v();
                                com.google.android.gms.common.internal.x.d(r5);
                                cursorQuery = mVarH13.m0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
                                if (cursorQuery.moveToFirst()) {
                                    Map map19 = Collections.EMPTY_MAP;
                                    cursorQuery.close();
                                    map2 = map19;
                                    str3 = "Failed to merge filter. appId";
                                    obj2 = "Database error querying filters. appId";
                                    obj = obj;
                                    r5 = r5;
                                } else {
                                    fVar8 = new androidx.collection.f();
                                    r17 = obj;
                                    r21 = r5;
                                    while (true) {
                                        i3 = cursorQuery.getInt(0);
                                        e9 e9Var13 = (e9) ((d9) n4.g0(e9.C(), cursorQuery.getBlob(1))).d();
                                        Object objValueOf2 = Integer.valueOf(i3);
                                        fVar8.put(objValueOf2, e9Var13);
                                        str3 = str14;
                                        obj2 = objD;
                                        obj3 = objValueOf2;
                                        r6 = r21;
                                        if (!cursorQuery.moveToNext()) {
                                            break;
                                            break;
                                        }
                                        str14 = str3;
                                        objD = obj2;
                                        r21 = r21;
                                    }
                                    cursorQuery.close();
                                    obj = obj3;
                                    r5 = r6;
                                    map2 = fVar8;
                                }
                                if (map2.isEmpty()) {
                                    str5 = "audience_id";
                                    s1Var = s1Var6;
                                } else {
                                    HashSet<Integer> hashSet4 = new HashSet(map2.keySet());
                                    if (z3) {
                                        String str114 = this.A;
                                        mVarH0 = l4Var.h0();
                                        str6 = this.A;
                                        mVarH0.w();
                                        mVarH0.v();
                                        com.google.android.gms.common.internal.x.d(str6);
                                        fVar3 = new androidx.collection.f();
                                        cursorRawQuery = mVarH0.m0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                        if (cursorRawQuery.moveToFirst()) {
                                            do {
                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                arrayList = (List) fVar3.get(numValueOf2);
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                    fVar3.put(numValueOf2, arrayList);
                                                }
                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                            } while (cursorRawQuery.moveToNext());
                                        } else {
                                            fVar3 = Collections.EMPTY_MAP;
                                        }
                                        cursorRawQuery.close();
                                        r0 = fVar3;
                                        com.google.android.gms.common.internal.x.d(str114);
                                        fVar4 = new androidx.collection.f();
                                        if (!map2.isEmpty()) {
                                            it2 = map2.keySet().iterator();
                                            while (it2.hasNext()) {
                                                num = (Integer) it2.next();
                                                num.getClass();
                                                e9Var3 = (e9) map2.get(num);
                                                list4 = (List) r0.get(num);
                                                if (list4 != null || list4.isEmpty()) {
                                                    r18 = r0;
                                                    it3 = it2;
                                                    s1Var2 = s1Var6;
                                                    fVar4.put(num, e9Var3);
                                                    r0 = r18;
                                                    str15 = str15;
                                                    it2 = it3;
                                                    s1Var6 = s1Var2;
                                                } else {
                                                    ?? r112 = r0;
                                                    it3 = it2;
                                                    List listC0 = l4Var.k0().c0((com.google.android.gms.internal.measurement.q1) e9Var3.w(), list4);
                                                    if (listC0.isEmpty()) {
                                                        r0 = r112;
                                                        it2 = it3;
                                                    } else {
                                                        d9 d9Var = (d9) e9Var3.l();
                                                        d9Var.h();
                                                        d9Var.b();
                                                        ((e9) d9Var.y).G(listC0);
                                                        List listC1 = l4Var.k0().c0((com.google.android.gms.internal.measurement.q1) e9Var3.u(), list4);
                                                        d9Var.g();
                                                        d9Var.b();
                                                        ((e9) d9Var.y).E(listC1);
                                                        ArrayList arrayList6 = new ArrayList();
                                                        Iterator it10 = e9Var3.y().iterator();
                                                        while (it10.hasNext()) {
                                                            Iterator it11 = it10;
                                                            r8 r8Var2 = (r8) it10.next();
                                                            s1 s1Var12 = s1Var6;
                                                            if (!list4.contains(Integer.valueOf(r8Var2.v()))) {
                                                                arrayList6.add(r8Var2);
                                                            }
                                                            it10 = it11;
                                                            s1Var6 = s1Var12;
                                                        }
                                                        s1Var2 = s1Var6;
                                                        d9Var.i();
                                                        d9Var.b();
                                                        ((e9) d9Var.y).I(arrayList6);
                                                        ArrayList arrayList7 = new ArrayList();
                                                        for (g9 g9Var2 : e9Var3.A()) {
                                                            if (!list4.contains(Integer.valueOf(g9Var2.v()))) {
                                                                arrayList7.add(g9Var2);
                                                            }
                                                        }
                                                        d9Var.j();
                                                        d9Var.b();
                                                        ((e9) d9Var.y).K(arrayList7);
                                                        fVar4.put(num, (e9) d9Var.d());
                                                        r18 = r112;
                                                        r0 = r18;
                                                        str15 = str15;
                                                        it2 = it3;
                                                        s1Var6 = s1Var2;
                                                    }
                                                }
                                            }
                                        }
                                        str4 = str15;
                                        s1Var = s1Var6;
                                        map3 = fVar4;
                                    } else {
                                        str4 = "audience_id";
                                        s1Var = s1Var6;
                                        map3 = map2;
                                    }
                                    map5 = map3;
                                    map4 = map2;
                                    while (r17.hasNext()) {
                                        num4.getClass();
                                        e9Var = (e9) map5.get(num4);
                                        bitSet = new BitSet();
                                        bitSet2 = new BitSet();
                                        fVar = new androidx.collection.f();
                                        if (e9Var != null && e9Var.z() != 0) {
                                            while (r3.hasNext()) {
                                                if (r8Var.u()) {
                                                    e9 e9Var14 = e9Var;
                                                    Integer numValueOf13 = Integer.valueOf(r8Var.v());
                                                    if (r8Var.w()) {
                                                        lValueOf = Long.valueOf(r8Var.x());
                                                    } else {
                                                        lValueOf = null;
                                                    }
                                                    fVar.put(numValueOf13, lValueOf);
                                                    e9Var = e9Var14;
                                                }
                                            }
                                        }
                                        e9Var2 = e9Var;
                                        fVar2 = new androidx.collection.f();
                                        if (e9Var2 != null && e9Var2.B() != 0) {
                                            it = e9Var2.A().iterator();
                                            while (it.hasNext()) {
                                                g9Var = (g9) it.next();
                                                if (!g9Var.u() && g9Var.x() > 0) {
                                                    fVar2.put(Integer.valueOf(g9Var.v()), Long.valueOf(g9Var.y(g9Var.x() - 1)));
                                                    it = it;
                                                    map5 = map5;
                                                }
                                            }
                                        }
                                        Map map110 = map5;
                                        if (e9Var2 != null) {
                                            i = 0;
                                            while (i < e9Var2.v() * 64) {
                                                if (n4.a0((com.google.android.gms.internal.measurement.q1) e9Var2.u(), i)) {
                                                    z4 = zG;
                                                    s1Var.b().C().c(num4, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                                    bitSet2.set(i);
                                                    if (n4.a0((com.google.android.gms.internal.measurement.q1) e9Var2.w(), i)) {
                                                        bitSet.set(i);
                                                    }
                                                    i++;
                                                    zG = z4;
                                                } else {
                                                    z4 = zG;
                                                }
                                                fVar.remove(Integer.valueOf(i));
                                                i++;
                                                zG = z4;
                                            }
                                        }
                                        boolean z10 = zG;
                                        e9 e9Var15 = (e9) map4.get(num4);
                                        if (zG2 && z10 && (list3 = (List) map.get(num4)) != null && this.E != null && this.D != null) {
                                            while (r2.hasNext()) {
                                                int iV6 = h7Var2.v();
                                                Integer num11 = num4;
                                                jLongValue = this.E.longValue() / 1000;
                                                if (h7Var2.D()) {
                                                    jLongValue = this.D.longValue() / 1000;
                                                }
                                                numValueOf = Integer.valueOf(iV6);
                                                if (fVar.containsKey(numValueOf)) {
                                                    fVar.put(numValueOf, Long.valueOf(jLongValue));
                                                }
                                                if (fVar2.containsKey(numValueOf)) {
                                                    fVar2.put(numValueOf, Long.valueOf(jLongValue));
                                                }
                                                num4 = num11;
                                            }
                                        }
                                        this.C.put(num4, new u4(this, this.A, e9Var15, bitSet, bitSet2, fVar, fVar2));
                                        map = map;
                                        zG = z10;
                                        map4 = map4;
                                        zG2 = zG2;
                                        str3 = str3;
                                        map5 = map110;
                                    }
                                    str5 = str4;
                                }
                                str7 = str2;
                                String str115 = str3;
                                ?? r14 = obj2;
                                if (!list.isEmpty()) {
                                    v4Var = new v4(this);
                                    fVar6 = new androidx.collection.f();
                                    while (r17.hasNext()) {
                                        t8VarA = v4Var.a(t8Var, this.A);
                                        if (t8VarA != null) {
                                            rVarF0 = l4Var.h0().f0(this.A, t8Var, t8VarA.z());
                                            l4Var.h0().W("events", rVarF0);
                                            if (z) {
                                                j = rVarF0.c;
                                                strZ = t8VarA.z();
                                                map8 = (Map) fVar6.get(strZ);
                                                if (map8 == null) {
                                                    m mVarH14 = l4Var.h0();
                                                    s1 s1Var13 = (s1) mVarH14.e;
                                                    str11 = this.A;
                                                    mVarH14.w();
                                                    mVarH14.v();
                                                    com.google.android.gms.common.internal.x.d(str11);
                                                    com.google.android.gms.common.internal.x.d(strZ);
                                                    fVar7 = new androidx.collection.f();
                                                    Query = mVarH14.m0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strZ}, null, null, null);
                                                    if (Query.moveToFirst()) {
                                                        str12 = str11;
                                                        Query = Query;
                                                        r46 = list;
                                                        while (true) {
                                                            h7 h7Var12 = (h7) ((g7) n4.g0(h7.G(), Query.getBlob(1))).d();
                                                            numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                            list6 = (List) fVar7.get(numValueOf6);
                                                            if (list6 == null) {
                                                                r46 = Query;
                                                                arrayList4 = new ArrayList();
                                                                fVar7.put(numValueOf6, arrayList4);
                                                                r48 = r46;
                                                            } else {
                                                                r48 = Query;
                                                                arrayList4 = list6;
                                                            }
                                                            arrayList4.add(h7Var12);
                                                            r47 = r48;
                                                            if (!r47.moveToNext()) {
                                                                break;
                                                                break;
                                                            }
                                                            Query = r47;
                                                            r46 = r47;
                                                        }
                                                        r47.close();
                                                        map8 = fVar7;
                                                        r43 = r47;
                                                    } else {
                                                        ?? r413 = Query;
                                                        map8 = Collections.EMPTY_MAP;
                                                        r413.close();
                                                        r43 = r413;
                                                    }
                                                    fVar6.put(strZ, map8);
                                                    list = r43;
                                                } else {
                                                    list = list;
                                                }
                                                while (r19.hasNext()) {
                                                    iIntValue2 = num6.intValue();
                                                    if (this.B.contains(num6)) {
                                                        s1Var.b().C().b(num6, "Skipping failed audience ID");
                                                    } else {
                                                        it8 = ((List) map8.get(num6)).iterator();
                                                        zA = true;
                                                        while (true) {
                                                            if (!it8.hasNext()) {
                                                                map9 = map8;
                                                                v4Var2 = v4Var;
                                                                num3 = num6;
                                                                break;
                                                            }
                                                            h7 h7Var13 = (h7) it8.next();
                                                            v4Var2 = v4Var;
                                                            num3 = num6;
                                                            map9 = map8;
                                                            bVar2 = new b(this, this.A, iIntValue2, h7Var13, 0);
                                                            Long l13 = this.D;
                                                            Long l14 = this.E;
                                                            iV = h7Var13.v();
                                                            u4Var = (u4) this.C.get(num3);
                                                            if (u4Var == null) {
                                                                z5 = false;
                                                            } else {
                                                                z5 = u4Var.d.get(iV);
                                                            }
                                                            zA = bVar2.a(l13, l14, t8VarA, j, rVarF0, z5);
                                                            if (!zA) {
                                                                this.B.add(num3);
                                                                break;
                                                            }
                                                            A(num3).a(bVar2);
                                                            num6 = num3;
                                                            map8 = map9;
                                                            v4Var = v4Var2;
                                                        }
                                                        if (!zA) {
                                                            this.B.add(num3);
                                                        }
                                                        v4Var = v4Var2;
                                                        map8 = map9;
                                                    }
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                if (!z) {
                                    return new ArrayList();
                                }
                                if (!list2.isEmpty()) {
                                    androidx.collection.f fVar14 = new androidx.collection.f();
                                    it4 = list2.iterator();
                                    y0Var = fVar14;
                                    while (it4.hasNext()) {
                                        k9 k9Var5 = (k9) it4.next();
                                        strW = k9Var5.w();
                                        map6 = (Map) y0Var.get(strW);
                                        if (map6 == null) {
                                            m mVarH15 = l4Var.h0();
                                            s1Var4 = (s1) mVarH15.e;
                                            str9 = this.A;
                                            mVarH15.w();
                                            mVarH15.v();
                                            com.google.android.gms.common.internal.x.d(str9);
                                            com.google.android.gms.common.internal.x.d(strW);
                                            fVar5 = new androidx.collection.f();
                                            cursorQuery2 = mVarH15.m0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strW}, null, null, null);
                                            if (cursorQuery2.moveToFirst()) {
                                                it5 = it4;
                                                while (true) {
                                                    n7 n7Var6 = (n7) ((m7) n4.g0(n7.C(), cursorQuery2.getBlob(1))).d();
                                                    numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                    list5 = (List) fVar5.get(numValueOf5);
                                                    if (list5 == null) {
                                                        s1Var5 = s1Var4;
                                                        arrayList3 = new ArrayList();
                                                        fVar5.put(numValueOf5, arrayList3);
                                                    } else {
                                                        s1Var5 = s1Var4;
                                                        arrayList3 = list5;
                                                    }
                                                    arrayList3.add(n7Var6);
                                                    str10 = str9;
                                                    if (!cursorQuery2.moveToNext()) {
                                                        break;
                                                        break;
                                                    }
                                                    s1Var4 = s1Var5;
                                                    str9 = str10;
                                                }
                                                cursorQuery2.close();
                                                map6 = fVar5;
                                            } else {
                                                it5 = it4;
                                                map6 = Collections.EMPTY_MAP;
                                                cursorQuery2.close();
                                            }
                                            y0Var.put(strW, map6);
                                        } else {
                                            it5 = it4;
                                        }
                                        it6 = map6.keySet().iterator();
                                        y0Var2 = y0Var;
                                        while (it6.hasNext()) {
                                            num2 = (Integer) it6.next();
                                            iIntValue = num2.intValue();
                                            if (this.B.contains(num2)) {
                                                s1Var.b().C().b(num2, "Skipping failed audience ID");
                                                break;
                                                break;
                                            }
                                            it7 = ((List) map6.get(num2)).iterator();
                                            zB = true;
                                            y0Var3 = y0Var2;
                                            while (true) {
                                                if (it7.hasNext()) {
                                                    n7Var = (n7) it7.next();
                                                    map7 = map6;
                                                    if (Log.isLoggable(s1Var.b().F(), 2)) {
                                                        v0 v0VarC7 = s1Var.b().C();
                                                        if (n7Var.u()) {
                                                            numValueOf4 = Integer.valueOf(n7Var.v());
                                                        } else {
                                                            numValueOf4 = null;
                                                        }
                                                        v0VarC7.d("Evaluating filter. audience, filter, property", num2, numValueOf4, s1Var.n().c(n7Var.w()));
                                                        s1Var.b().C().b(l4Var.k0().X(n7Var), "Filter definition");
                                                    }
                                                    if (n7Var.u() || n7Var.v() > 256) {
                                                        v0 v0VarA7 = s1Var.b().A();
                                                        w0 w0VarD7 = x0.D(this.A);
                                                        if (n7Var.u()) {
                                                            numValueOf3 = Integer.valueOf(n7Var.v());
                                                        } else {
                                                            numValueOf3 = null;
                                                        }
                                                        v0VarA7.c(w0VarD7, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                        this.B.add(num2);
                                                        map6 = map7;
                                                        y0Var2 = y0Var3;
                                                        it6 = it6;
                                                    } else {
                                                        i2 = iIntValue;
                                                        bVar = new b(this, this.A, i2, n7Var, 1);
                                                        Long l15 = this.D;
                                                        Long l16 = this.E;
                                                        int iV7 = n7Var.v();
                                                        u4 u4Var6 = (u4) this.C.get(num2);
                                                        zB = bVar.b(l15, l16, k9Var5, u4Var6 == null ? false : u4Var6.d.get(iV7));
                                                        if (zB) {
                                                            A(num2).a(bVar);
                                                            iIntValue = i2;
                                                            map6 = map7;
                                                            y0Var3 = y0Var3;
                                                            it6 = it6;
                                                        } else {
                                                            this.B.add(num2);
                                                            y0Var3 = y0Var3;
                                                        }
                                                    }
                                                } else {
                                                    map7 = map6;
                                                    y0Var3 = y0Var3;
                                                    it6 = it6;
                                                }
                                                if (!zB) {
                                                    this.B.add(num2);
                                                }
                                                map6 = map7;
                                                y0Var2 = y0Var3;
                                                it6 = it6;
                                            }
                                        }
                                        it4 = it5;
                                        y0Var = y0Var2;
                                    }
                                }
                                arrayList2 = new ArrayList();
                                androidx.collection.c<Integer> cVar5 = (androidx.collection.c) this.C.keySet();
                                cVar5.removeAll(this.B);
                                while (r3.hasNext()) {
                                    int iIntValue7 = num7.intValue();
                                    u4 u4Var7 = (u4) this.C.get(num7);
                                    com.google.android.gms.common.internal.x.g(u4Var7);
                                    l8 l8VarB5 = u4Var7.b(iIntValue7);
                                    arrayList2.add(l8VarB5);
                                    mVarH1 = l4Var.h0();
                                    s1Var3 = (s1) mVarH1.e;
                                    str8 = this.A;
                                    e9 e9VarW5 = l8VarB5.w();
                                    mVarH1.w();
                                    mVarH1.v();
                                    com.google.android.gms.common.internal.x.d(str8);
                                    com.google.android.gms.common.internal.x.g(e9VarW5);
                                    byte[] bArrA5 = e9VarW5.a();
                                    contentValues = new ContentValues();
                                    contentValues.put("app_id", str8);
                                    contentValues.put(str5, num7);
                                    contentValues.put("current_results", bArrA5);
                                    if (mVarH1.m0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                        s1Var3.b().z().b(x0.D(str8), "Failed to insert filter results (got -1). appId");
                                    }
                                }
                                return arrayList2;
                            } catch (Throwable th12) {
                                th = th12;
                                r19 = Query2;
                            }
                        } catch (SQLiteException e25) {
                            e = e25;
                            str2 = "data";
                            r9 = 0;
                        } catch (Throwable th13) {
                            th = th13;
                            r9 = 0;
                        }
                    } else {
                        z3 = z2;
                        str2 = "data";
                    }
                    if (cursorQuery.moveToFirst()) {
                        Map map111 = Collections.EMPTY_MAP;
                        cursorQuery.close();
                        map2 = map111;
                        str3 = "Failed to merge filter. appId";
                        obj2 = "Database error querying filters. appId";
                        obj = obj;
                        r5 = r5;
                    } else {
                        fVar8 = new androidx.collection.f();
                        r17 = obj;
                        r21 = r5;
                        while (true) {
                            i3 = cursorQuery.getInt(0);
                            e9 e9Var16 = (e9) ((d9) n4.g0(e9.C(), cursorQuery.getBlob(1))).d();
                            Object objValueOf3 = Integer.valueOf(i3);
                            fVar8.put(objValueOf3, e9Var16);
                            str3 = str14;
                            obj2 = objD;
                            obj3 = objValueOf3;
                            r6 = r21;
                            if (!cursorQuery.moveToNext()) {
                                break;
                                break;
                            }
                            str14 = str3;
                            objD = obj2;
                            r21 = r21;
                        }
                        cursorQuery.close();
                        obj = obj3;
                        r5 = r6;
                        map2 = fVar8;
                    }
                } catch (Throwable th14) {
                    th = th14;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e26) {
                e = e26;
                r17 = obj;
                r21 = r5;
            }
            cursorQuery = mVarH13.m0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
        } catch (SQLiteException e27) {
            e = e27;
            r17 = obj;
            str3 = "Failed to merge filter. appId";
            obj2 = "Database error querying filters. appId";
            r21 = r5;
            cursorQuery = null;
        } catch (Throwable th15) {
            th = th15;
            cursorQuery = null;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
        map = map10;
        m mVarH16 = l4Var.h0();
        obj = (s1) mVarH16.e;
        r5 = this.A;
        mVarH16.w();
        mVarH16.v();
        com.google.android.gms.common.internal.x.d(r5);
        if (map2.isEmpty()) {
            str5 = "audience_id";
            s1Var = s1Var6;
        } else {
            HashSet<Integer> hashSet5 = new HashSet(map2.keySet());
            if (z3) {
                String str116 = this.A;
                mVarH0 = l4Var.h0();
                str6 = this.A;
                mVarH0.w();
                mVarH0.v();
                com.google.android.gms.common.internal.x.d(str6);
                fVar3 = new androidx.collection.f();
                cursorRawQuery = mVarH0.m0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                        arrayList = (List) fVar3.get(numValueOf2);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            fVar3.put(numValueOf2, arrayList);
                        }
                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                } else {
                    fVar3 = Collections.EMPTY_MAP;
                }
                cursorRawQuery.close();
                r0 = fVar3;
                com.google.android.gms.common.internal.x.d(str116);
                fVar4 = new androidx.collection.f();
                if (!map2.isEmpty()) {
                    it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        num = (Integer) it2.next();
                        num.getClass();
                        e9Var3 = (e9) map2.get(num);
                        list4 = (List) r0.get(num);
                        if (list4 != null) {
                        }
                        r18 = r0;
                        it3 = it2;
                        s1Var2 = s1Var6;
                        fVar4.put(num, e9Var3);
                        r0 = r18;
                        str15 = str15;
                        it2 = it3;
                        s1Var6 = s1Var2;
                    }
                }
                str4 = str15;
                s1Var = s1Var6;
                map3 = fVar4;
            } else {
                str4 = "audience_id";
                s1Var = s1Var6;
                map3 = map2;
            }
            map5 = map3;
            map4 = map2;
            while (r17.hasNext()) {
                num4.getClass();
                e9Var = (e9) map5.get(num4);
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                fVar = new androidx.collection.f();
                if (e9Var != null) {
                    while (r3.hasNext()) {
                        if (r8Var.u()) {
                            e9 e9Var17 = e9Var;
                            Integer numValueOf14 = Integer.valueOf(r8Var.v());
                            if (r8Var.w()) {
                                lValueOf = Long.valueOf(r8Var.x());
                            } else {
                                lValueOf = null;
                            }
                            fVar.put(numValueOf14, lValueOf);
                            e9Var = e9Var17;
                        }
                    }
                }
                e9Var2 = e9Var;
                fVar2 = new androidx.collection.f();
                if (e9Var2 != null) {
                    it = e9Var2.A().iterator();
                    while (it.hasNext()) {
                        g9Var = (g9) it.next();
                        if (!g9Var.u()) {
                        }
                    }
                }
                Map map112 = map5;
                if (e9Var2 != null) {
                    i = 0;
                    while (i < e9Var2.v() * 64) {
                        if (n4.a0((com.google.android.gms.internal.measurement.q1) e9Var2.u(), i)) {
                            z4 = zG;
                            s1Var.b().C().c(num4, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                            bitSet2.set(i);
                            if (n4.a0((com.google.android.gms.internal.measurement.q1) e9Var2.w(), i)) {
                                bitSet.set(i);
                            }
                            i++;
                            zG = z4;
                        } else {
                            z4 = zG;
                        }
                        fVar.remove(Integer.valueOf(i));
                        i++;
                        zG = z4;
                    }
                }
                boolean z11 = zG;
                e9 e9Var18 = (e9) map4.get(num4);
                if (zG2) {
                    while (r2.hasNext()) {
                        int iV8 = h7Var2.v();
                        Integer num12 = num4;
                        jLongValue = this.E.longValue() / 1000;
                        if (h7Var2.D()) {
                            jLongValue = this.D.longValue() / 1000;
                        }
                        numValueOf = Integer.valueOf(iV8);
                        if (fVar.containsKey(numValueOf)) {
                            fVar.put(numValueOf, Long.valueOf(jLongValue));
                        }
                        if (fVar2.containsKey(numValueOf)) {
                            fVar2.put(numValueOf, Long.valueOf(jLongValue));
                        }
                        num4 = num12;
                    }
                }
                this.C.put(num4, new u4(this, this.A, e9Var18, bitSet, bitSet2, fVar, fVar2));
                map = map;
                zG = z11;
                map4 = map4;
                zG2 = zG2;
                str3 = str3;
                map5 = map112;
            }
            str5 = str4;
        }
        str7 = str2;
        String str117 = str3;
        ?? r15 = obj2;
        if (!list.isEmpty()) {
            v4Var = new v4(this);
            fVar6 = new androidx.collection.f();
            while (r17.hasNext()) {
                t8VarA = v4Var.a(t8Var, this.A);
                if (t8VarA != null) {
                    rVarF0 = l4Var.h0().f0(this.A, t8Var, t8VarA.z());
                    l4Var.h0().W("events", rVarF0);
                    if (z) {
                        j = rVarF0.c;
                        strZ = t8VarA.z();
                        map8 = (Map) fVar6.get(strZ);
                        if (map8 == null) {
                            m mVarH17 = l4Var.h0();
                            s1 s1Var14 = (s1) mVarH17.e;
                            str11 = this.A;
                            mVarH17.w();
                            mVarH17.v();
                            com.google.android.gms.common.internal.x.d(str11);
                            com.google.android.gms.common.internal.x.d(strZ);
                            fVar7 = new androidx.collection.f();
                            Query = mVarH17.m0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strZ}, null, null, null);
                            if (Query.moveToFirst()) {
                                str12 = str11;
                                Query = Query;
                                r46 = list;
                                while (true) {
                                    h7 h7Var14 = (h7) ((g7) n4.g0(h7.G(), Query.getBlob(1))).d();
                                    numValueOf6 = Integer.valueOf(Query.getInt(0));
                                    list6 = (List) fVar7.get(numValueOf6);
                                    if (list6 == null) {
                                        r46 = Query;
                                        arrayList4 = new ArrayList();
                                        fVar7.put(numValueOf6, arrayList4);
                                        r48 = r46;
                                    } else {
                                        r48 = Query;
                                        arrayList4 = list6;
                                    }
                                    arrayList4.add(h7Var14);
                                    r47 = r48;
                                    if (!r47.moveToNext()) {
                                        break;
                                        break;
                                    }
                                    Query = r47;
                                    r46 = r47;
                                }
                                r47.close();
                                map8 = fVar7;
                                r43 = r47;
                            } else {
                                ?? r414 = Query;
                                map8 = Collections.EMPTY_MAP;
                                r414.close();
                                r43 = r414;
                            }
                            fVar6.put(strZ, map8);
                            list = r43;
                        } else {
                            list = list;
                        }
                        while (r19.hasNext()) {
                            iIntValue2 = num6.intValue();
                            if (this.B.contains(num6)) {
                                s1Var.b().C().b(num6, "Skipping failed audience ID");
                            } else {
                                it8 = ((List) map8.get(num6)).iterator();
                                zA = true;
                                while (true) {
                                    if (!it8.hasNext()) {
                                        map9 = map8;
                                        v4Var2 = v4Var;
                                        num3 = num6;
                                        break;
                                    }
                                    h7 h7Var15 = (h7) it8.next();
                                    v4Var2 = v4Var;
                                    num3 = num6;
                                    map9 = map8;
                                    bVar2 = new b(this, this.A, iIntValue2, h7Var15, 0);
                                    Long l17 = this.D;
                                    Long l18 = this.E;
                                    iV = h7Var15.v();
                                    u4Var = (u4) this.C.get(num3);
                                    if (u4Var == null) {
                                        z5 = false;
                                    } else {
                                        z5 = u4Var.d.get(iV);
                                    }
                                    zA = bVar2.a(l17, l18, t8VarA, j, rVarF0, z5);
                                    if (!zA) {
                                        this.B.add(num3);
                                        break;
                                    }
                                    A(num3).a(bVar2);
                                    num6 = num3;
                                    map8 = map9;
                                    v4Var = v4Var2;
                                }
                                if (!zA) {
                                    this.B.add(num3);
                                }
                                v4Var = v4Var2;
                                map8 = map9;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        if (!z) {
            return new ArrayList();
        }
        if (!list2.isEmpty()) {
            androidx.collection.f fVar15 = new androidx.collection.f();
            it4 = list2.iterator();
            y0Var = fVar15;
            while (it4.hasNext()) {
                k9 k9Var6 = (k9) it4.next();
                strW = k9Var6.w();
                map6 = (Map) y0Var.get(strW);
                if (map6 == null) {
                    m mVarH18 = l4Var.h0();
                    s1Var4 = (s1) mVarH18.e;
                    str9 = this.A;
                    mVarH18.w();
                    mVarH18.v();
                    com.google.android.gms.common.internal.x.d(str9);
                    com.google.android.gms.common.internal.x.d(strW);
                    fVar5 = new androidx.collection.f();
                    cursorQuery2 = mVarH18.m0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strW}, null, null, null);
                    if (cursorQuery2.moveToFirst()) {
                        it5 = it4;
                        while (true) {
                            n7 n7Var7 = (n7) ((m7) n4.g0(n7.C(), cursorQuery2.getBlob(1))).d();
                            numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                            list5 = (List) fVar5.get(numValueOf5);
                            if (list5 == null) {
                                s1Var5 = s1Var4;
                                arrayList3 = new ArrayList();
                                fVar5.put(numValueOf5, arrayList3);
                            } else {
                                s1Var5 = s1Var4;
                                arrayList3 = list5;
                            }
                            arrayList3.add(n7Var7);
                            str10 = str9;
                            if (!cursorQuery2.moveToNext()) {
                                break;
                                break;
                            }
                            s1Var4 = s1Var5;
                            str9 = str10;
                        }
                        cursorQuery2.close();
                        map6 = fVar5;
                    } else {
                        it5 = it4;
                        map6 = Collections.EMPTY_MAP;
                        cursorQuery2.close();
                    }
                    y0Var.put(strW, map6);
                } else {
                    it5 = it4;
                }
                it6 = map6.keySet().iterator();
                y0Var2 = y0Var;
                while (it6.hasNext()) {
                    num2 = (Integer) it6.next();
                    iIntValue = num2.intValue();
                    if (this.B.contains(num2)) {
                        s1Var.b().C().b(num2, "Skipping failed audience ID");
                        break;
                        break;
                    }
                    it7 = ((List) map6.get(num2)).iterator();
                    zB = true;
                    y0Var3 = y0Var2;
                    while (true) {
                        if (it7.hasNext()) {
                            n7Var = (n7) it7.next();
                            map7 = map6;
                            if (Log.isLoggable(s1Var.b().F(), 2)) {
                                v0 v0VarC8 = s1Var.b().C();
                                if (n7Var.u()) {
                                    numValueOf4 = Integer.valueOf(n7Var.v());
                                } else {
                                    numValueOf4 = null;
                                }
                                v0VarC8.d("Evaluating filter. audience, filter, property", num2, numValueOf4, s1Var.n().c(n7Var.w()));
                                s1Var.b().C().b(l4Var.k0().X(n7Var), "Filter definition");
                            }
                            if (n7Var.u()) {
                            }
                            v0 v0VarA8 = s1Var.b().A();
                            w0 w0VarD8 = x0.D(this.A);
                            if (n7Var.u()) {
                                numValueOf3 = Integer.valueOf(n7Var.v());
                            } else {
                                numValueOf3 = null;
                            }
                            v0VarA8.c(w0VarD8, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                            this.B.add(num2);
                            map6 = map7;
                            y0Var2 = y0Var3;
                            it6 = it6;
                        } else {
                            map7 = map6;
                            y0Var3 = y0Var3;
                            it6 = it6;
                        }
                        if (!zB) {
                            this.B.add(num2);
                        }
                        map6 = map7;
                        y0Var2 = y0Var3;
                        it6 = it6;
                        A(num2).a(bVar);
                        iIntValue = i2;
                        map6 = map7;
                        y0Var3 = y0Var3;
                        it6 = it6;
                    }
                }
                it4 = it5;
                y0Var = y0Var2;
            }
        }
        arrayList2 = new ArrayList();
        androidx.collection.c<Integer> cVar6 = (androidx.collection.c) this.C.keySet();
        cVar6.removeAll(this.B);
        while (r3.hasNext()) {
            int iIntValue8 = num7.intValue();
            u4 u4Var8 = (u4) this.C.get(num7);
            com.google.android.gms.common.internal.x.g(u4Var8);
            l8 l8VarB6 = u4Var8.b(iIntValue8);
            arrayList2.add(l8VarB6);
            mVarH1 = l4Var.h0();
            s1Var3 = (s1) mVarH1.e;
            str8 = this.A;
            e9 e9VarW6 = l8VarB6.w();
            mVarH1.w();
            mVarH1.v();
            com.google.android.gms.common.internal.x.d(str8);
            com.google.android.gms.common.internal.x.g(e9VarW6);
            byte[] bArrA6 = e9VarW6.a();
            contentValues = new ContentValues();
            contentValues.put("app_id", str8);
            contentValues.put(str5, num7);
            contentValues.put("current_results", bArrA6);
            if (mVarH1.m0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                s1Var3.b().z().b(x0.D(str8), "Failed to insert filter results (got -1). appId");
            }
        }
        return arrayList2;
    }

    @Override // com.google.android.gms.measurement.internal.g4
    public final void y() {
    }
}
