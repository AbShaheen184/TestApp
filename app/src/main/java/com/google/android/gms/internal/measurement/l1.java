package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements Iterable, d5, z4 {
    public final TreeMap e;
    public final TreeMap y;

    public l1(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                r(i, (d5) list.get(i));
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final Iterator b() {
        return new l0(this, this.e.keySet().iterator(), this.y.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final Boolean c() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final String d() {
        return u(",");
    }

    @Override // com.google.android.gms.internal.measurement.z4
    public final d5 e(String str) {
        d5 d5Var;
        if ("length".equals(str)) {
            return new j3(Double.valueOf(p()));
        }
        return (!i(str) || (d5Var = (d5) this.y.get(str)) == null) ? d5.m : d5Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        if (p() != l1Var.p()) {
            return false;
        }
        TreeMap treeMap = this.e;
        if (treeMap.isEmpty()) {
            return l1Var.e.isEmpty();
        }
        for (int iIntValue = ((Integer) treeMap.firstKey()).intValue(); iIntValue <= ((Integer) treeMap.lastKey()).intValue(); iIntValue++) {
            if (!q(iIntValue).equals(l1Var.q(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.z4
    public final void f(String str, d5 d5Var) {
        TreeMap treeMap = this.y;
        if (d5Var == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, d5Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final Double h() {
        TreeMap treeMap = this.e;
        if (treeMap.size() == 1) {
            return q(0).h();
        }
        return treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        return this.e.hashCode() * 31;
    }

    @Override // com.google.android.gms.internal.measurement.z4
    public final boolean i(String str) {
        return "length".equals(str) || this.y.containsKey(str);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new f5(this, 2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0204  */
    /* JADX WARN: Code duplicated, block: B:102:0x020e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0213  */
    /* JADX WARN: Code duplicated, block: B:106:0x0237  */
    /* JADX WARN: Code duplicated, block: B:107:0x023d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0248  */
    /* JADX WARN: Code duplicated, block: B:112:0x0267  */
    /* JADX WARN: Code duplicated, block: B:113:0x026d  */
    /* JADX WARN: Code duplicated, block: B:117:0x027c A[LOOP:2: B:115:0x0277->B:117:0x027c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:119:0x028b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0291  */
    /* JADX WARN: Code duplicated, block: B:124:0x029d  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:128:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:133:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:136:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:139:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:143:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:145:0x0301  */
    /* JADX WARN: Code duplicated, block: B:147:0x0314  */
    /* JADX WARN: Code duplicated, block: B:148:0x0318  */
    /* JADX WARN: Code duplicated, block: B:149:0x031e  */
    /* JADX WARN: Code duplicated, block: B:153:0x0337 A[LOOP:3: B:151:0x0331->B:153:0x0337, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:155:0x0345  */
    /* JADX WARN: Code duplicated, block: B:157:0x034b  */
    /* JADX WARN: Code duplicated, block: B:159:0x0362  */
    /* JADX WARN: Code duplicated, block: B:162:0x0369  */
    /* JADX WARN: Code duplicated, block: B:165:0x0375  */
    /* JADX WARN: Code duplicated, block: B:173:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:174:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:176:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:178:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:181:0x03d5 A[LOOP:5: B:179:0x03cf->B:181:0x03d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:184:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:186:0x0402  */
    /* JADX WARN: Code duplicated, block: B:188:0x040c  */
    /* JADX WARN: Code duplicated, block: B:190:0x040f  */
    /* JADX WARN: Code duplicated, block: B:192:0x0415  */
    /* JADX WARN: Code duplicated, block: B:198:0x0432  */
    /* JADX WARN: Code duplicated, block: B:199:0x0435  */
    /* JADX WARN: Code duplicated, block: B:202:0x0441  */
    /* JADX WARN: Code duplicated, block: B:204:0x0449  */
    /* JADX WARN: Code duplicated, block: B:207:0x0455  */
    /* JADX WARN: Code duplicated, block: B:209:0x045f  */
    /* JADX WARN: Code duplicated, block: B:211:0x0467  */
    /* JADX WARN: Code duplicated, block: B:213:0x047e  */
    /* JADX WARN: Code duplicated, block: B:215:0x0484  */
    /* JADX WARN: Code duplicated, block: B:217:0x048a  */
    /* JADX WARN: Code duplicated, block: B:219:0x0492  */
    /* JADX WARN: Code duplicated, block: B:221:0x0497  */
    /* JADX WARN: Code duplicated, block: B:223:0x049f  */
    /* JADX WARN: Code duplicated, block: B:225:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:228:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:230:0x04c6 A[LOOP:6: B:226:0x04ae->B:230:0x04c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:235:0x04e3 A[LOOP:7: B:233:0x04dd->B:235:0x04e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:239:0x0507 A[LOOP:8: B:237:0x0501->B:239:0x0507, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:242:0x052c  */
    /* JADX WARN: Code duplicated, block: B:244:0x0534  */
    /* JADX WARN: Code duplicated, block: B:246:0x053e  */
    /* JADX WARN: Code duplicated, block: B:249:0x055c  */
    /* JADX WARN: Code duplicated, block: B:251:0x0578  */
    /* JADX WARN: Code duplicated, block: B:252:0x0580  */
    /* JADX WARN: Code duplicated, block: B:255:0x0590  */
    /* JADX WARN: Code duplicated, block: B:256:0x0597  */
    /* JADX WARN: Code duplicated, block: B:259:0x059c  */
    /* JADX WARN: Code duplicated, block: B:261:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:263:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:272:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:274:0x05da  */
    /* JADX WARN: Code duplicated, block: B:276:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:279:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:281:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:283:0x0604  */
    /* JADX WARN: Code duplicated, block: B:285:0x060c  */
    /* JADX WARN: Code duplicated, block: B:287:0x0612  */
    /* JADX WARN: Code duplicated, block: B:289:0x0618  */
    /* JADX WARN: Code duplicated, block: B:291:0x063a  */
    /* JADX WARN: Code duplicated, block: B:292:0x0645  */
    /* JADX WARN: Code duplicated, block: B:294:0x064b  */
    /* JADX WARN: Code duplicated, block: B:297:0x065f  */
    /* JADX WARN: Code duplicated, block: B:299:0x067d  */
    /* JADX WARN: Code duplicated, block: B:302:0x0686 A[LOOP:10: B:300:0x067e->B:302:0x0686, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:305:0x069e A[LOOP:11: B:305:0x069e->B:321:0x06f0, LOOP_START, PHI: r9 r35
  0x069e: PHI (r9v3 int) = (r9v2 int), (r9v4 int) binds: [B:304:0x069c, B:321:0x06f0] A[DONT_GENERATE, DONT_INLINE]
  0x069e: PHI (r35v1 java.util.TreeMap) = (r35v0 java.util.TreeMap), (r35v4 java.util.TreeMap) binds: [B:304:0x069c, B:321:0x06f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:307:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:309:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:311:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:313:0x06be  */
    /* JADX WARN: Code duplicated, block: B:314:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:316:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:318:0x06de  */
    /* JADX WARN: Code duplicated, block: B:326:0x0716 A[LOOP:13: B:326:0x0716->B:328:0x0719, LOOP_START, PHI: r0
  0x0716: PHI (r0v33 int) = (r0v32 int), (r0v34 int) binds: [B:296:0x065d, B:328:0x0719] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:328:0x0719 A[LOOP:13: B:326:0x0716->B:328:0x0719, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:330:0x072b  */
    /* JADX WARN: Code duplicated, block: B:332:0x0733  */
    /* JADX WARN: Code duplicated, block: B:334:0x0739  */
    /* JADX WARN: Code duplicated, block: B:336:0x0744  */
    /* JADX WARN: Code duplicated, block: B:338:0x075a  */
    /* JADX WARN: Code duplicated, block: B:340:0x0760  */
    /* JADX WARN: Code duplicated, block: B:342:0x0766  */
    /* JADX WARN: Code duplicated, block: B:345:0x0784 A[LOOP:14: B:343:0x077e->B:345:0x0784, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:347:0x079b  */
    /* JADX WARN: Code duplicated, block: B:348:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:350:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:352:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:355:0x07be  */
    /* JADX WARN: Code duplicated, block: B:357:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:362:0x07e4 A[LOOP:16: B:360:0x07de->B:362:0x07e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:366:0x0807  */
    /* JADX WARN: Code duplicated, block: B:368:0x080f  */
    /* JADX WARN: Code duplicated, block: B:370:0x081f  */
    /* JADX WARN: Code duplicated, block: B:379:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:0x04ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x070f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:400:0x06f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:0x06e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:409:0x07ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x07fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:411:0x07d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0128  */
    /* JADX WARN: Code duplicated, block: B:56:0x012e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0138  */
    /* JADX WARN: Code duplicated, block: B:61:0x0150  */
    /* JADX WARN: Code duplicated, block: B:63:0x0173  */
    /* JADX WARN: Code duplicated, block: B:65:0x0179  */
    /* JADX WARN: Code duplicated, block: B:67:0x017d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0185  */
    /* JADX WARN: Code duplicated, block: B:72:0x0190  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:82:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:98:0x01fe  */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02dc, code lost:
    
        if (com.google.android.gms.internal.measurement.h.f(r7, r2, (com.google.android.gms.internal.measurement.c5) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).p() != r7.p()) goto L171;
     */
    @Override // com.google.android.gms.internal.measurement.d5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.d5 j(java.lang.String r37, com.google.android.gms.internal.measurement.b7 r38, java.util.ArrayList r39) {
        /*
            Method dump skipped, instruction units count: 2168
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.l1.j(java.lang.String, com.google.android.gms.internal.measurement.b7, java.util.ArrayList):com.google.android.gms.internal.measurement.d5");
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final d5 l() {
        l1 l1Var = new l1();
        for (Map.Entry entry : this.e.entrySet()) {
            boolean z = entry.getValue() instanceof z4;
            TreeMap treeMap = l1Var.e;
            if (z) {
                treeMap.put((Integer) entry.getKey(), (d5) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((d5) entry.getValue()).l());
            }
        }
        return l1Var;
    }

    public final List n() {
        ArrayList arrayList = new ArrayList(p());
        for (int i = 0; i < p(); i++) {
            arrayList.add(q(i));
        }
        return arrayList;
    }

    public final Iterator o() {
        return this.e.keySet().iterator();
    }

    public final int p() {
        TreeMap treeMap = this.e;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final d5 q(int i) {
        d5 d5Var;
        if (i < p()) {
            return (!s(i) || (d5Var = (d5) this.e.get(Integer.valueOf(i))) == null) ? d5.m : d5Var;
        }
        com.google.gson.b.n("Attempting to get element outside of current array");
        return null;
    }

    public final void r(int i, d5 d5Var) {
        if (i > 32468) {
            net.luminis.tls.engine.impl.c.r("Array too large");
            return;
        }
        if (i < 0) {
            com.google.gson.b.n(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.e(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
            return;
        }
        TreeMap treeMap = this.e;
        if (d5Var == null) {
            treeMap.remove(Integer.valueOf(i));
        } else {
            treeMap.put(Integer.valueOf(i), d5Var);
        }
    }

    public final boolean s(int i) {
        if (i >= 0) {
            TreeMap treeMap = this.e;
            if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i));
            }
        }
        com.google.gson.b.n(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.e(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
        return false;
    }

    public final void t(int i) {
        TreeMap treeMap = this.e;
        int iIntValue = ((Integer) treeMap.lastKey()).intValue();
        if (i > iIntValue || i < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i));
        if (i == iIntValue) {
            int i2 = i - 1;
            Integer numValueOf = Integer.valueOf(i2);
            if (treeMap.containsKey(numValueOf) || i2 < 0) {
                return;
            }
            treeMap.put(numValueOf, d5.m);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i);
            d5 d5Var = (d5) treeMap.get(numValueOf2);
            if (d5Var != null) {
                treeMap.put(Integer.valueOf(i - 1), d5Var);
                treeMap.remove(numValueOf2);
            }
        }
    }

    public final String toString() {
        return u(",");
    }

    public final String u(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.e.isEmpty()) {
            int i = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i >= p()) {
                    break;
                }
                d5 d5VarQ = q(i);
                sb.append(str2);
                if (!(d5VarQ instanceof h5) && !(d5VarQ instanceof b5)) {
                    sb.append(d5VarQ.d());
                }
                i++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public l1() {
        this.e = new TreeMap();
        this.y = new TreeMap();
    }
}
