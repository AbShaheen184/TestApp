package androidx.compose.ui.focus;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import androidx.collection.j0;
import androidx.collection.w0;
import androidx.compose.ui.node.a1;
import androidx.compose.ui.node.w1;
import java.util.ArrayList;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements l {
    public final androidx.compose.ui.platform.u a;
    public final androidx.compose.ui.platform.u b;
    public final i d;
    public androidx.collection.d0 f;
    public e0 h;
    public final e0 c = new e0(2, null, 14);
    public final m e = new m(this);
    public final j0 g = new j0(1);

    public p(androidx.compose.ui.platform.u uVar, androidx.compose.ui.platform.u uVar2) {
        this.a = uVar;
        this.b = uVar2;
        this.d = new i(this, uVar2);
    }

    public final boolean a(boolean z) {
        a1 a1Var;
        if (f() != null) {
            e0 e0VarF = f();
            i(null);
            if (e0VarF != null) {
                c0 c0Var = c0.e;
                c0 c0Var2 = c0.z;
                e0VarF.M0(c0Var, c0Var2);
                if (!e0VarF.e.K) {
                    androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
                }
                androidx.compose.ui.q qVar = e0VarF.e.B;
                androidx.compose.ui.node.f0 f0VarT = androidx.compose.ui.node.k.t(e0VarF);
                while (f0VarT != null) {
                    if ((((androidx.compose.ui.q) f0VarT.d0.g).A & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        while (qVar != null) {
                            if ((qVar.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                androidx.compose.runtime.collection.b bVar = null;
                                androidx.compose.ui.q qVarE = qVar;
                                while (qVarE != null) {
                                    if (qVarE instanceof e0) {
                                        ((e0) qVarE).M0(c0.y, c0Var2);
                                    } else if ((qVarE.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (qVarE instanceof androidx.compose.ui.node.j)) {
                                        int i = 0;
                                        for (androidx.compose.ui.q qVar2 = ((androidx.compose.ui.node.j) qVarE).M; qVar2 != null; qVar2 = qVar2.C) {
                                            if ((qVar2.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    qVarE = qVar2;
                                                } else {
                                                    if (bVar == null) {
                                                        bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                    }
                                                    if (qVarE != null) {
                                                        bVar.b(qVarE);
                                                        qVarE = null;
                                                    }
                                                    bVar.b(qVar2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    qVarE = androidx.compose.ui.node.k.e(bVar);
                                }
                            }
                            qVar = qVar.B;
                        }
                    }
                    f0VarT = f0VarT.v();
                    qVar = (f0VarT == null || (a1Var = f0VarT.d0) == null) ? null : (w1) a1Var.f;
                }
            }
        }
        return true;
    }

    public final boolean b(int i, boolean z, boolean z2) {
        int iOrdinal;
        boolean z3 = true;
        if (z || (iOrdinal = d.u(this.c, i).ordinal()) == 0) {
            a(z);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                coil3.g.a();
                return false;
            }
            z3 = false;
        }
        if (z3 && z2) {
            c();
        }
        return z3;
    }

    public final void c() {
        androidx.compose.ui.platform.u uVar = this.a;
        if (uVar.isFocused() || uVar.hasFocus()) {
            uVar.clearFocus();
        } else if (uVar.hasFocus()) {
            View viewFindFocus = uVar.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            uVar.clearFocus();
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x015a A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x016a A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x016f  */
    /* JADX WARN: Code duplicated, block: B:315:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x0163 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:344:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x014c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x005e A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0064 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x006f A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x007b A[ADDED_TO_REGION, LOOP:12: B:41:0x007b->B:69:0x00c7, LOOP_START, PHI: r7
  0x007b: PHI (r7v29 androidx.compose.ui.q) = (r7v23 androidx.compose.ui.q), (r7v30 androidx.compose.ui.q) binds: [B:40:0x0079, B:69:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x007d A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x008c A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e0 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ec A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x00f9 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0105 A[ADDED_TO_REGION, LOOP:16: B:87:0x0105->B:115:0x0151, LOOP_START, PHI: r1
  0x0105: PHI (r1v15 androidx.compose.ui.q) = (r1v9 androidx.compose.ui.q), (r1v16 androidx.compose.ui.q) binds: [B:86:0x0103, B:115:0x0151] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0107 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x010d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0111 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0116 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x011c A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r0v24, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r15v5, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r15v9, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v36, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r7v39 */
    public final boolean d(KeyEvent keyEvent, kotlin.jvm.functions.a aVar) {
        androidx.compose.ui.q qVar;
        androidx.compose.ui.node.f0 f0VarT;
        androidx.compose.ui.node.i iVar;
        androidx.compose.ui.node.i iVar2;
        androidx.compose.ui.q qVar2;
        a1 a1Var;
        androidx.compose.ui.q qVarE;
        androidx.compose.runtime.collection.b bVar;
        androidx.compose.ui.q qVar3;
        androidx.compose.ui.node.f0 f0VarT2;
        androidx.compose.ui.node.i iVar3;
        androidx.compose.ui.node.i iVar4;
        a1 a1Var2;
        androidx.compose.runtime.collection.b bVar2;
        androidx.compose.ui.q qVarE2;
        int size;
        a1 a1Var3;
        e0 e0Var = this.c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                Trace.endSection();
                return false;
            }
            if (!j(keyEvent)) {
                Trace.endSection();
                return false;
            }
            e0 e0VarF = d.f(e0Var);
            if (e0VarF != null) {
                if (!e0VarF.e.K) {
                    androidx.compose.ui.internal.a.b("visitLocalDescendants called on an unattached node");
                }
                androidx.compose.ui.q qVar4 = e0VarF.e;
                if ((qVar4.A & 9216) != 0) {
                    qVar2 = null;
                    for (androidx.compose.ui.q qVar5 = qVar4.C; qVar5 != null; qVar5 = qVar5.C) {
                        int i = qVar5.z;
                        if ((i & 9216) != 0) {
                            if ((i & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                break;
                            }
                            qVar2 = qVar5;
                        }
                    }
                } else {
                    qVar2 = null;
                }
                if (qVar2 == null) {
                    if (e0VarF == null) {
                        if (!e0Var.e.K) {
                            androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
                        }
                        qVar = e0Var.e.B;
                        f0VarT = androidx.compose.ui.node.k.t(e0Var);
                        loop15: while (true) {
                            if (f0VarT != null) {
                                iVar = null;
                                break;
                            }
                            if ((((androidx.compose.ui.q) f0VarT.d0.g).A & 8192) != 0) {
                                while (qVar != null) {
                                    if ((qVar.z & 8192) != 0) {
                                        qVarE = qVar;
                                        bVar = null;
                                        while (qVarE != null) {
                                            if (qVarE instanceof androidx.compose.ui.input.key.e) {
                                                iVar = qVarE;
                                                break loop15;
                                            }
                                            if ((qVarE.z & 8192) == 0) {
                                            }
                                            qVarE = androidx.compose.ui.node.k.e(bVar);
                                        }
                                    }
                                    qVar = qVar.B;
                                }
                            }
                            f0VarT = f0VarT.v();
                            if (f0VarT != null) {
                            }
                        }
                        iVar2 = (androidx.compose.ui.input.key.e) iVar;
                        if (iVar2 != null) {
                            qVar2 = ((androidx.compose.ui.q) iVar2).e;
                        } else {
                            qVar2 = null;
                        }
                    } else {
                        if (!e0VarF.e.K) {
                            androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
                        }
                        qVar3 = e0VarF.e;
                        f0VarT2 = androidx.compose.ui.node.k.t(e0VarF);
                        loop11: while (true) {
                            if (f0VarT2 != null) {
                                iVar3 = null;
                                break;
                            }
                            if ((((androidx.compose.ui.q) f0VarT2.d0.g).A & 8192) != 0) {
                                while (qVar3 != null) {
                                    if ((qVar3.z & 8192) != 0) {
                                        bVar2 = null;
                                        qVarE2 = qVar3;
                                        while (qVarE2 != null) {
                                            if (qVarE2 instanceof androidx.compose.ui.input.key.e) {
                                                iVar3 = qVarE2;
                                                break loop11;
                                            }
                                            if ((qVarE2.z & 8192) == 0) {
                                            }
                                            qVarE2 = androidx.compose.ui.node.k.e(bVar2);
                                        }
                                    }
                                    qVar3 = qVar3.B;
                                }
                            }
                            f0VarT2 = f0VarT2.v();
                            if (f0VarT2 != null) {
                            }
                        }
                        iVar4 = (androidx.compose.ui.input.key.e) iVar3;
                        if (iVar4 != null) {
                            qVar2 = ((androidx.compose.ui.q) iVar4).e;
                        } else {
                            if (!e0Var.e.K) {
                                androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
                            }
                            qVar = e0Var.e.B;
                            f0VarT = androidx.compose.ui.node.k.t(e0Var);
                            loop15: while (true) {
                                if (f0VarT != null) {
                                    iVar = null;
                                    break;
                                }
                                if ((((androidx.compose.ui.q) f0VarT.d0.g).A & 8192) != 0) {
                                    while (qVar != null) {
                                        if ((qVar.z & 8192) != 0) {
                                            qVarE = qVar;
                                            bVar = null;
                                            while (qVarE != null) {
                                                if (qVarE instanceof androidx.compose.ui.input.key.e) {
                                                    iVar = qVarE;
                                                    break loop15;
                                                }
                                                if ((qVarE.z & 8192) == 0) {
                                                }
                                                qVarE = androidx.compose.ui.node.k.e(bVar);
                                            }
                                        }
                                        qVar = qVar.B;
                                    }
                                }
                                f0VarT = f0VarT.v();
                                if (f0VarT != null) {
                                }
                            }
                            iVar2 = (androidx.compose.ui.input.key.e) iVar;
                            if (iVar2 != null) {
                                qVar2 = ((androidx.compose.ui.q) iVar2).e;
                            } else {
                                qVar2 = null;
                            }
                        }
                    }
                }
            } else if (e0VarF == null) {
                if (!e0Var.e.K) {
                    androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
                }
                qVar = e0Var.e.B;
                f0VarT = androidx.compose.ui.node.k.t(e0Var);
                loop15: while (true) {
                    if (f0VarT != null) {
                        iVar = null;
                        break;
                    }
                    if ((((androidx.compose.ui.q) f0VarT.d0.g).A & 8192) != 0) {
                        while (qVar != null) {
                            if ((qVar.z & 8192) != 0) {
                                qVarE = qVar;
                                bVar = null;
                                while (qVarE != null) {
                                    if (qVarE instanceof androidx.compose.ui.input.key.e) {
                                        iVar = qVarE;
                                        break loop15;
                                    }
                                    if ((qVarE.z & 8192) == 0 && (qVarE instanceof androidx.compose.ui.node.j)) {
                                        androidx.compose.ui.q qVar6 = ((androidx.compose.ui.node.j) qVarE).M;
                                        int i2 = 0;
                                        while (qVar6 != null) {
                                            if ((qVar6.z & 8192) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    qVarE = qVarE;
                                                    bVar = bVar;
                                                    bVar = bVar;
                                                    qVarE = qVar6;
                                                } else {
                                                    if (bVar == null) {
                                                        bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                    }
                                                    if (qVarE != null) {
                                                        bVar.b(qVarE);
                                                        qVarE = null;
                                                    }
                                                    bVar.b(qVar6);
                                                }
                                            } else {
                                                qVarE = qVarE;
                                                bVar = bVar;
                                            }
                                            qVar6 = qVar6.C;
                                            qVarE = qVarE;
                                            bVar = bVar;
                                        }
                                        if (i2 == 1) {
                                            qVarE = qVarE;
                                            bVar = bVar;
                                        } else {
                                            qVarE = qVarE;
                                            bVar = bVar;
                                        }
                                    }
                                    qVarE = androidx.compose.ui.node.k.e(bVar);
                                }
                            }
                            qVar = qVar.B;
                        }
                    }
                    f0VarT = f0VarT.v();
                    qVar = (f0VarT != null || (a1Var = f0VarT.d0) == null) ? null : (w1) a1Var.f;
                }
                iVar2 = (androidx.compose.ui.input.key.e) iVar;
                if (iVar2 != null) {
                    qVar2 = ((androidx.compose.ui.q) iVar2).e;
                } else {
                    qVar2 = null;
                }
            } else {
                if (!e0VarF.e.K) {
                    androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
                }
                qVar3 = e0VarF.e;
                f0VarT2 = androidx.compose.ui.node.k.t(e0VarF);
                loop11: while (true) {
                    if (f0VarT2 != null) {
                        iVar3 = null;
                        break;
                    }
                    if ((((androidx.compose.ui.q) f0VarT2.d0.g).A & 8192) != 0) {
                        while (qVar3 != null) {
                            if ((qVar3.z & 8192) != 0) {
                                bVar2 = null;
                                qVarE2 = qVar3;
                                while (qVarE2 != null) {
                                    if (qVarE2 instanceof androidx.compose.ui.input.key.e) {
                                        iVar3 = qVarE2;
                                        break loop11;
                                    }
                                    if ((qVarE2.z & 8192) == 0 && (qVarE2 instanceof androidx.compose.ui.node.j)) {
                                        androidx.compose.ui.q qVar7 = ((androidx.compose.ui.node.j) qVarE2).M;
                                        int i3 = 0;
                                        while (qVar7 != null) {
                                            if ((qVar7.z & 8192) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    qVarE2 = qVarE2;
                                                    bVar2 = bVar2;
                                                    bVar2 = bVar2;
                                                    qVarE2 = qVar7;
                                                } else {
                                                    if (bVar2 == null) {
                                                        bVar2 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                    }
                                                    if (qVarE2 != null) {
                                                        bVar2.b(qVarE2);
                                                        qVarE2 = null;
                                                    }
                                                    bVar2.b(qVar7);
                                                }
                                            } else {
                                                qVarE2 = qVarE2;
                                                bVar2 = bVar2;
                                            }
                                            qVar7 = qVar7.C;
                                            qVarE2 = qVarE2;
                                            bVar2 = bVar2;
                                        }
                                        if (i3 == 1) {
                                            qVarE2 = qVarE2;
                                            bVar2 = bVar2;
                                        } else {
                                            qVarE2 = qVarE2;
                                            bVar2 = bVar2;
                                        }
                                    }
                                    qVarE2 = androidx.compose.ui.node.k.e(bVar2);
                                }
                            }
                            qVar3 = qVar3.B;
                        }
                    }
                    f0VarT2 = f0VarT2.v();
                    qVar3 = (f0VarT2 != null || (a1Var2 = f0VarT2.d0) == null) ? null : (w1) a1Var2.f;
                }
                iVar4 = (androidx.compose.ui.input.key.e) iVar3;
                if (iVar4 != null) {
                    qVar2 = ((androidx.compose.ui.q) iVar4).e;
                } else {
                    if (!e0Var.e.K) {
                        androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
                    }
                    qVar = e0Var.e.B;
                    f0VarT = androidx.compose.ui.node.k.t(e0Var);
                    loop15: while (true) {
                        if (f0VarT != null) {
                            iVar = null;
                            break;
                        }
                        if ((((androidx.compose.ui.q) f0VarT.d0.g).A & 8192) != 0) {
                            while (qVar != null) {
                                if ((qVar.z & 8192) != 0) {
                                    qVarE = qVar;
                                    bVar = null;
                                    while (qVarE != null) {
                                        if (qVarE instanceof androidx.compose.ui.input.key.e) {
                                            iVar = qVarE;
                                            break loop15;
                                        }
                                        if ((qVarE.z & 8192) == 0) {
                                        }
                                        qVarE = androidx.compose.ui.node.k.e(bVar);
                                    }
                                }
                                qVar = qVar.B;
                            }
                        }
                        f0VarT = f0VarT.v();
                        if (f0VarT != null) {
                        }
                    }
                    iVar2 = (androidx.compose.ui.input.key.e) iVar;
                    if (iVar2 != null) {
                        qVar2 = ((androidx.compose.ui.q) iVar2).e;
                    } else {
                        qVar2 = null;
                    }
                }
            }
            if (qVar2 != null) {
                if (!qVar2.e.K) {
                    androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
                }
                androidx.compose.ui.q qVar8 = qVar2.e.B;
                androidx.compose.ui.node.f0 f0VarT3 = androidx.compose.ui.node.k.t(qVar2);
                ArrayList arrayList = null;
                while (f0VarT3 != null) {
                    if ((((androidx.compose.ui.q) f0VarT3.d0.g).A & 8192) != 0) {
                        while (qVar8 != null) {
                            if ((qVar8.z & 8192) != 0) {
                                androidx.compose.ui.q qVarE3 = qVar8;
                                androidx.compose.runtime.collection.b bVar3 = null;
                                while (qVarE3 != null) {
                                    if (qVarE3 instanceof androidx.compose.ui.input.key.e) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(qVarE3);
                                    } else if ((qVarE3.z & 8192) != 0 && (qVarE3 instanceof androidx.compose.ui.node.j)) {
                                        int i4 = 0;
                                        for (androidx.compose.ui.q qVar9 = ((androidx.compose.ui.node.j) qVarE3).M; qVar9 != null; qVar9 = qVar9.C) {
                                            if ((qVar9.z & 8192) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    qVarE3 = qVar9;
                                                } else {
                                                    if (bVar3 == null) {
                                                        bVar3 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                    }
                                                    if (qVarE3 != null) {
                                                        bVar3.b(qVarE3);
                                                        qVarE3 = null;
                                                    }
                                                    bVar3.b(qVar9);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    qVarE3 = androidx.compose.ui.node.k.e(bVar3);
                                }
                            }
                            qVar8 = qVar8.B;
                        }
                    }
                    f0VarT3 = f0VarT3.v();
                    qVar8 = (f0VarT3 == null || (a1Var3 = f0VarT3.d0) == null) ? null : (w1) a1Var3.f;
                }
                if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                    while (true) {
                        int i5 = size - 1;
                        if (((androidx.compose.ui.input.key.e) arrayList.get(size)).g(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                        if (i5 < 0) {
                            break;
                        }
                        size = i5;
                    }
                }
                ?? E = qVar2.e;
                ?? bVar4 = 0;
                while (E != 0) {
                    if (E instanceof androidx.compose.ui.input.key.e) {
                        if (((androidx.compose.ui.input.key.e) E).g(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((E.z & 8192) != 0 && (E instanceof androidx.compose.ui.node.j)) {
                        androidx.compose.ui.q qVar10 = ((androidx.compose.ui.node.j) E).M;
                        int i6 = 0;
                        while (qVar10 != null) {
                            if ((qVar10.z & 8192) != 0) {
                                i6++;
                                if (i6 == 1) {
                                    E = E;
                                    bVar4 = bVar4;
                                    bVar4 = bVar4;
                                    E = qVar10;
                                } else {
                                    if (bVar4 == 0) {
                                        bVar4 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                    }
                                    if (E != 0) {
                                        bVar4.b(E);
                                        E = 0;
                                    }
                                    bVar4.b(qVar10);
                                }
                            } else {
                                E = E;
                                bVar4 = bVar4;
                            }
                            qVar10 = qVar10.C;
                            E = E;
                            bVar4 = bVar4;
                        }
                        if (i6 == 1) {
                            E = E;
                            bVar4 = bVar4;
                        } else {
                            E = E;
                            bVar4 = bVar4;
                        }
                    }
                    E = androidx.compose.ui.node.k.e(bVar4);
                }
                if (((Boolean) aVar.invoke()).booleanValue()) {
                    Trace.endSection();
                    return true;
                }
                ?? E2 = qVar2.e;
                ?? bVar5 = 0;
                while (E2 != 0) {
                    if (E2 instanceof androidx.compose.ui.input.key.e) {
                        if (((androidx.compose.ui.input.key.e) E2).x(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((E2.z & 8192) != 0 && (E2 instanceof androidx.compose.ui.node.j)) {
                        androidx.compose.ui.q qVar11 = ((androidx.compose.ui.node.j) E2).M;
                        int i7 = 0;
                        while (qVar11 != null) {
                            if ((qVar11.z & 8192) != 0) {
                                i7++;
                                if (i7 == 1) {
                                    bVar5 = bVar5;
                                    E2 = E2;
                                    bVar5 = bVar5;
                                    E2 = qVar11;
                                } else {
                                    if (bVar5 == 0) {
                                        bVar5 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                    }
                                    if (E2 != 0) {
                                        bVar5.b(E2);
                                        E2 = 0;
                                    }
                                    bVar5.b(qVar11);
                                }
                            } else {
                                bVar5 = bVar5;
                                E2 = E2;
                            }
                            qVar11 = qVar11.C;
                            bVar5 = bVar5;
                            E2 = E2;
                        }
                        if (i7 == 1) {
                            bVar5 = bVar5;
                            E2 = E2;
                        } else {
                            bVar5 = bVar5;
                            E2 = E2;
                        }
                    }
                    E2 = androidx.compose.ui.node.k.e(bVar5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        if (((androidx.compose.ui.input.key.e) arrayList.get(i8)).x(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    }
                }
            }
            Trace.endSection();
            return false;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r6v14, types: [kotlin.jvm.functions.l, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r6v20, types: [kotlin.jvm.functions.l, kotlin.jvm.internal.m] */
    public final Boolean e(int i, androidx.compose.ui.geometry.c cVar, kotlin.jvm.functions.l lVar) {
        boolean zA;
        e0 e0Var;
        a1 a1Var;
        e0 e0Var2 = this.c;
        e0 e0VarF = d.f(e0Var2);
        int i2 = 4;
        androidx.compose.ui.platform.u uVar = this.b;
        boolean zBooleanValue = false;
        if (e0VarF != null) {
            androidx.compose.ui.unit.m layoutDirection = uVar.getLayoutDirection();
            u uVarN0 = e0VarF.N0();
            y yVar = uVarN0.h;
            y yVar2 = uVarN0.i;
            if (i == 1) {
                yVar = uVarN0.b;
            } else if (i == 2) {
                yVar = uVarN0.c;
            } else if (i == 5) {
                yVar = uVarN0.d;
            } else if (i == 6) {
                yVar = uVarN0.e;
            } else if (i == 3) {
                int iOrdinal = layoutDirection.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        coil3.g.a();
                        return null;
                    }
                    yVar = yVar2;
                }
                if (yVar == y.b) {
                    yVar = null;
                }
                if (yVar == null) {
                    yVar = uVarN0.f;
                }
            } else if (i == 4) {
                int iOrdinal2 = layoutDirection.ordinal();
                if (iOrdinal2 == 0) {
                    yVar = yVar2;
                } else if (iOrdinal2 != 1) {
                    coil3.g.a();
                    return null;
                }
                if (yVar == y.b) {
                    yVar = null;
                }
                if (yVar == null) {
                    yVar = uVarN0.g;
                }
            } else {
                if (i != 7 && i != 8) {
                    net.luminis.tls.engine.impl.c.r("invalid FocusDirection");
                    return null;
                }
                a aVar = new a(i);
                p pVar = (p) ((androidx.compose.ui.platform.u) androidx.compose.ui.node.k.u(e0VarF)).getFocusOwner();
                e0 e0VarF2 = pVar.f();
                if (i == 7) {
                    uVarN0.j.invoke(aVar);
                } else {
                    uVarN0.k.invoke(aVar);
                }
                yVar = aVar.b ? y.c : e0VarF2 != pVar.f() ? y.d : y.b;
            }
            y yVar3 = y.c;
            if (!kotlin.jvm.internal.l.a(yVar, yVar3)) {
                if (kotlin.jvm.internal.l.a(yVar, y.d)) {
                    e0 e0VarF3 = d.f(e0Var2);
                    if (e0VarF3 != null) {
                        return (Boolean) lVar.invoke(e0VarF3);
                    }
                } else {
                    y yVar4 = y.b;
                    if (!kotlin.jvm.internal.l.a(yVar, yVar4)) {
                        if (yVar == yVar4) {
                            net.luminis.tls.engine.impl.c.r("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        if (yVar == yVar3) {
                            net.luminis.tls.engine.impl.c.r("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        androidx.compose.runtime.collection.b bVar = yVar.a;
                        int i3 = bVar.z;
                        if (i3 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                        } else {
                            Object[] objArr = bVar.e;
                            boolean z = false;
                            for (int i4 = 0; i4 < i3; i4++) {
                                androidx.compose.ui.q qVar = (androidx.compose.ui.q) ((a0) objArr[i4]);
                                if (!qVar.e.K) {
                                    androidx.compose.ui.internal.a.b("visitChildren called on an unattached node");
                                }
                                androidx.compose.runtime.collection.b bVar2 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                androidx.compose.ui.q qVar2 = qVar.e;
                                androidx.compose.ui.q qVar3 = qVar2.C;
                                if (qVar3 == null) {
                                    androidx.compose.ui.node.k.b(bVar2, qVar2);
                                } else {
                                    bVar2.b(qVar3);
                                }
                                while (true) {
                                    int i5 = bVar2.z;
                                    if (i5 == 0) {
                                        break;
                                    }
                                    androidx.compose.ui.q qVarE = (androidx.compose.ui.q) bVar2.k(i5 - 1);
                                    if ((qVarE.A & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0) {
                                        androidx.compose.ui.node.k.b(bVar2, qVarE);
                                    } else {
                                        while (qVarE != null) {
                                            if ((qVarE.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                                androidx.compose.runtime.collection.b bVar3 = null;
                                                while (qVarE != null) {
                                                    if (qVarE instanceof e0) {
                                                        if (((Boolean) lVar.invoke((e0) qVarE)).booleanValue()) {
                                                            z = true;
                                                            break;
                                                        }
                                                    } else if ((qVarE.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (qVarE instanceof androidx.compose.ui.node.j)) {
                                                        int i6 = 0;
                                                        for (androidx.compose.ui.q qVar4 = ((androidx.compose.ui.node.j) qVarE).M; qVar4 != null; qVar4 = qVar4.C) {
                                                            if ((qVar4.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                                                i6++;
                                                                if (i6 == 1) {
                                                                    qVarE = qVar4;
                                                                } else {
                                                                    if (bVar3 == null) {
                                                                        bVar3 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                                    }
                                                                    if (qVarE != null) {
                                                                        bVar3.b(qVarE);
                                                                        qVarE = null;
                                                                    }
                                                                    bVar3.b(qVar4);
                                                                }
                                                            }
                                                        }
                                                        if (i6 == 1) {
                                                        }
                                                    }
                                                    qVarE = androidx.compose.ui.node.k.e(bVar3);
                                                }
                                                break;
                                            }
                                            qVarE = qVarE.C;
                                        }
                                    }
                                }
                            }
                            zBooleanValue = z;
                        }
                        return Boolean.valueOf(zBooleanValue);
                    }
                }
            }
            return null;
        }
        e0VarF = null;
        androidx.compose.ui.unit.m layoutDirection2 = uVar.getLayoutDirection();
        androidx.compose.animation.h hVar = new androidx.compose.animation.h(e0VarF, this, lVar);
        if (i == 1 || i == 2) {
            if (i == 1) {
                zA = d.l(e0Var2, hVar);
            } else {
                if (i != 2) {
                    net.luminis.tls.engine.impl.c.r("This function should only be used for 1-D focus search");
                    return null;
                }
                zA = d.a(e0Var2, hVar);
            }
            return Boolean.valueOf(zA);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return d.D(i, hVar, e0Var2, cVar);
        }
        if (i == 7) {
            int iOrdinal3 = layoutDirection2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    coil3.g.a();
                    return null;
                }
                i2 = 3;
            }
            e0 e0VarF4 = d.f(e0Var2);
            if (e0VarF4 != null) {
                return d.D(i2, hVar, e0VarF4, cVar);
            }
            return null;
        }
        if (i != 8) {
            androidx.media3.exoplayer.hls.playlist.a.h(f.a(i), "Focus search invoked with invalid FocusDirection ");
            return null;
        }
        e0 e0VarF5 = d.f(e0Var2);
        if (e0VarF5 == null) {
            e0Var = null;
            break;
        }
        if (!e0VarF5.e.K) {
            androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.q qVar5 = e0VarF5.e.B;
        androidx.compose.ui.node.f0 f0VarT = androidx.compose.ui.node.k.t(e0VarF5);
        loop5: while (true) {
            if (f0VarT == null) {
                e0Var = null;
                break;
            }
            if ((((androidx.compose.ui.q) f0VarT.d0.g).A & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                while (qVar5 != null) {
                    if ((qVar5.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        androidx.compose.ui.q qVarE2 = qVar5;
                        androidx.compose.runtime.collection.b bVar4 = null;
                        while (qVarE2 != null) {
                            if (qVarE2 instanceof e0) {
                                e0 e0Var3 = (e0) qVarE2;
                                if (e0Var3.N0().a) {
                                    e0Var = e0Var3;
                                    break loop5;
                                }
                            } else if ((qVarE2.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (qVarE2 instanceof androidx.compose.ui.node.j)) {
                                int i7 = 0;
                                for (androidx.compose.ui.q qVar6 = ((androidx.compose.ui.node.j) qVarE2).M; qVar6 != null; qVar6 = qVar6.C) {
                                    if ((qVar6.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                        i7++;
                                        if (i7 == 1) {
                                            qVarE2 = qVar6;
                                        } else {
                                            if (bVar4 == null) {
                                                bVar4 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                            }
                                            if (qVarE2 != null) {
                                                bVar4.b(qVarE2);
                                                qVarE2 = null;
                                            }
                                            bVar4.b(qVar6);
                                        }
                                    }
                                }
                                if (i7 != 1) {
                                    qVarE2 = androidx.compose.ui.node.k.e(bVar4);
                                }
                            }
                            qVarE2 = androidx.compose.ui.node.k.e(bVar4);
                        }
                    }
                    qVar5 = qVar5.B;
                }
            }
            f0VarT = f0VarT.v();
            qVar5 = (f0VarT == null || (a1Var = f0VarT.d0) == null) ? null : (w1) a1Var.f;
        }
        if (e0Var != null && !e0Var.equals(e0Var2)) {
            zBooleanValue = ((Boolean) hVar.invoke(e0Var)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public final e0 f() {
        e0 e0Var = this.h;
        if (e0Var == null || !e0Var.K) {
            return null;
        }
        return e0Var;
    }

    public final boolean g(int i, boolean z) {
        e0 e0VarF = f();
        androidx.compose.ui.platform.u uVar = this.a;
        if (e0VarF == null || !e0VarF.L || !uVar.x(i)) {
            kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
            zVar.e = Boolean.FALSE;
            e0 e0VarF2 = f();
            Boolean boolE = e(i, uVar.getEmbeddedViewFocusRect(), new n(i, zVar));
            if (!kotlin.jvm.internal.l.a(boolE, Boolean.TRUE) || e0VarF2 == f()) {
                if (boolE != null && zVar.e != null) {
                    if (!boolE.booleanValue() || !((Boolean) zVar.e).booleanValue()) {
                        if ((i == 1 || i == 2) && z && b(i, false, false)) {
                            Boolean boolE2 = e(i, null, new o(i, 1));
                            if (boolE2 != null ? boolE2.booleanValue() : false) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean h(int i) {
        if (!b(i, false, false)) {
            return false;
        }
        Boolean boolE = e(i, null, new o(i, 0));
        boolean zBooleanValue = boolE != null ? boolE.booleanValue() : false;
        if (!zBooleanValue) {
            c();
        }
        return zBooleanValue;
    }

    public final void i(e0 e0Var) {
        e0 e0Var2 = this.h;
        this.h = e0Var;
        j0 j0Var = this.g;
        Object[] objArr = j0Var.a;
        int i = j0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((j) objArr[i2]).b(e0Var2, e0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v3, types: [int] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r3v18, types: [int] */
    public final boolean j(KeyEvent keyEvent) {
        int iNumberOfTrailingZeros;
        boolean z;
        long j;
        int iNumberOfTrailingZeros2;
        int i;
        long[] jArr;
        int i2;
        long jB = androidx.compose.ui.input.key.c.b(keyEvent);
        int iC = androidx.compose.ui.input.key.c.c(keyEvent);
        int i3 = -862048943;
        long j2 = 0;
        int i4 = 8;
        int i5 = 0;
        boolean z2 = true;
        if (iC != 2) {
            if (iC != 1) {
                return true;
            }
            androidx.collection.d0 d0Var = this.f;
            if (d0Var == null || !d0Var.a(jB)) {
                return false;
            }
            androidx.collection.d0 d0Var2 = this.f;
            if (d0Var2 != null) {
                int iHashCode = Long.hashCode(jB) * (-862048943);
                int i6 = iHashCode ^ (iHashCode << 16);
                int i7 = i6 & 127;
                int i8 = d0Var2.c;
                int i9 = i6 >>> 7;
                loop5: while (true) {
                    int i10 = i9 & i8;
                    long[] jArr2 = d0Var2.a;
                    int i11 = i10 >> 3;
                    int i12 = (i10 & 7) << 3;
                    long j3 = ((jArr2[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr2[i11] >>> i12);
                    long j4 = (((long) i7) * 72340172838076673L) ^ j3;
                    for (long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                        iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i10) & i8;
                        if (d0Var2.b[iNumberOfTrailingZeros] == jB) {
                            break loop5;
                        }
                    }
                    if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                        iNumberOfTrailingZeros = -1;
                        break;
                    }
                    i5 += 8;
                    i9 = i10 + i5;
                }
                if (iNumberOfTrailingZeros >= 0) {
                    d0Var2.d--;
                    long[] jArr3 = d0Var2.a;
                    int i13 = d0Var2.c;
                    int i14 = iNumberOfTrailingZeros >> 3;
                    int i15 = (iNumberOfTrailingZeros & 7) << 3;
                    long j6 = (jArr3[i14] & (~(255 << i15))) | (254 << i15);
                    jArr3[i14] = j6;
                    jArr3[(((iNumberOfTrailingZeros - 7) & i13) + (i13 & 7)) >> 3] = j6;
                    return true;
                }
            }
            return true;
        }
        androidx.collection.d0 d0Var3 = this.f;
        if (d0Var3 == null) {
            d0Var3 = new androidx.collection.d0(3);
            this.f = d0Var3;
        }
        androidx.collection.d0 d0Var4 = d0Var3;
        int iHashCode2 = Long.hashCode(jB) * (-862048943);
        int i16 = iHashCode2 ^ (iHashCode2 << 16);
        int i17 = i16 >>> 7;
        int i18 = i16 & 127;
        int i19 = d0Var4.c;
        int i20 = i17 & i19;
        int i21 = 0;
        loop0: while (true) {
            long[] jArr4 = d0Var4.a;
            int i22 = i20 >> 3;
            int i23 = i3;
            int i24 = (i20 & 7) << 3;
            long j7 = (jArr4[i22] >>> i24) | ((jArr4[i22 + 1] << (64 - i24)) & ((-i24) >> 63));
            long j8 = i18;
            long j9 = j7 ^ (j8 * 72340172838076673L);
            long j10 = (j9 - 72340172838076673L) & (~j9) & (-9187201950435737472L);
            while (j10 != j2) {
                iNumberOfTrailingZeros2 = (i20 + (Long.numberOfTrailingZeros(j10) >> 3)) & i19;
                long j11 = j2;
                if (d0Var4.b[iNumberOfTrailingZeros2] == jB) {
                    z = true;
                    break loop0;
                }
                j10 &= j10 - 1;
                j2 = j11;
            }
            long j12 = j2;
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != j12) {
                int iB = d0Var4.b(i17);
                if (d0Var4.e != 0 || ((d0Var4.a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    z = true;
                    j = 128;
                } else {
                    int i25 = d0Var4.c;
                    if (i25 > i4) {
                        long j13 = 128;
                        if (Long.compare((((long) d0Var4.d) * 32) ^ Long.MIN_VALUE, (((long) i25) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr5 = d0Var4.a;
                            int i26 = d0Var4.c;
                            long[] jArr6 = d0Var4.b;
                            int i27 = (i26 + 7) >> 3;
                            int i28 = 0;
                            while (i28 < i27) {
                                int i29 = i4;
                                long j14 = jArr5[i28] & (-9187201950435737472L);
                                jArr5[i28] = (-72340172838076674L) & ((~j14) + (j14 >>> 7));
                                i28++;
                                i4 = i29;
                                j13 = j13;
                                i17 = i17;
                            }
                            i = i17;
                            j = j13;
                            int iP = kotlin.collections.n.P(jArr5);
                            int i30 = iP - 1;
                            jArr5[i30] = (jArr5[i30] & 72057594037927935L) | (-72057594037927936L);
                            jArr5[iP] = jArr5[0];
                            int i31 = 0;
                            while (i31 != i26) {
                                int i32 = i31 >> 3;
                                int i33 = (i31 & 7) << 3;
                                long j15 = (jArr5[i32] >> i33) & 255;
                                if (j15 != j && j15 == 254) {
                                    int iHashCode3 = Long.hashCode(jArr6[i31]) * i23;
                                    int i34 = iHashCode3 ^ (iHashCode3 << 16);
                                    int i35 = i34 >>> 7;
                                    int iB2 = d0Var4.b(i35);
                                    int i36 = i35 & i26;
                                    boolean z3 = z2;
                                    if (((iB2 - i36) & i26) / 8 == ((i31 - i36) & i26) / 8) {
                                        jArr5[i32] = (jArr5[i32] & (~(255 << i33))) | (((long) (i34 & 127)) << i33);
                                        jArr5[jArr5.length - 1] = (jArr5[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i31++;
                                    } else {
                                        int i37 = i31;
                                        int i38 = iB2 >> 3;
                                        long j16 = jArr5[i38];
                                        int i39 = (iB2 & 7) << 3;
                                        if (((j16 >> i39) & 255) == j) {
                                            jArr5[i38] = (j16 & (~(255 << i39))) | (((long) (i34 & 127)) << i39);
                                            jArr5[i32] = (jArr5[i32] & (~(255 << i33))) | (j << i33);
                                            jArr6[iB2] = jArr6[i37];
                                            jArr6[i37] = j12;
                                            i2 = i37;
                                        } else {
                                            jArr5[i38] = (((long) (i34 & 127)) << i39) | (j16 & (~(255 << i39)));
                                            long j17 = jArr6[iB2];
                                            jArr6[iB2] = jArr6[i37];
                                            jArr6[i37] = j17;
                                            i2 = i37 - 1;
                                        }
                                        jArr5[jArr5.length - 1] = (jArr5[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i31 = i2 + 1;
                                    }
                                    z2 = z3;
                                } else {
                                    i31++;
                                }
                            }
                            z = z2;
                            d0Var4.e = w0.a(d0Var4.c) - d0Var4.d;
                        } else {
                            j = 128;
                        }
                        iB = d0Var4.b(i);
                    } else {
                        j = 128;
                    }
                    i = i17;
                    z = true;
                    int iB3 = w0.b(d0Var4.c);
                    long[] jArr7 = d0Var4.a;
                    long[] jArr8 = d0Var4.b;
                    int i40 = d0Var4.c;
                    d0Var4.c(iB3);
                    long[] jArr9 = d0Var4.a;
                    long[] jArr10 = d0Var4.b;
                    int i41 = d0Var4.c;
                    int i42 = 0;
                    while (i42 < i40) {
                        if (((jArr7[i42 >> 3] >> ((i42 & 7) << 3)) & 255) < j) {
                            long j18 = jArr8[i42];
                            int iHashCode4 = Long.hashCode(j18) * i23;
                            int i43 = iHashCode4 ^ (iHashCode4 << 16);
                            jArr = jArr9;
                            int iB4 = d0Var4.b(i43 >>> 7);
                            long j19 = i43 & 127;
                            int i44 = iB4 >> 3;
                            int i45 = (iB4 & 7) << 3;
                            long j20 = (jArr[i44] & (~(255 << i45))) | (j19 << i45);
                            jArr[i44] = j20;
                            jArr[(((iB4 - 7) & i41) + (i41 & 7)) >> 3] = j20;
                            jArr10[iB4] = j18;
                        } else {
                            jArr = jArr9;
                        }
                        i42++;
                        jArr9 = jArr;
                        jArr7 = jArr7;
                        jArr8 = jArr8;
                    }
                    iB = d0Var4.b(i);
                }
                iNumberOfTrailingZeros2 = iB;
                d0Var4.d++;
                int i46 = d0Var4.e;
                long[] jArr11 = d0Var4.a;
                int i47 = iNumberOfTrailingZeros2 >> 3;
                long j21 = jArr11[i47];
                int i48 = (iNumberOfTrailingZeros2 & 7) << 3;
                d0Var4.e = i46 - (((j21 >> i48) & 255) == j ? z : 0);
                int i49 = d0Var4.c;
                long j22 = (j21 & (~(255 << i48))) | (j8 << i48);
                jArr11[i47] = j22;
                jArr11[(((iNumberOfTrailingZeros2 - 7) & i49) + (i49 & 7)) >> 3] = j22;
                break;
            }
            i21 += 8;
            i20 = (i20 + i21) & i19;
            i4 = i4;
            i3 = i23;
            j2 = j12;
        }
        d0Var4.b[iNumberOfTrailingZeros2] = jB;
        return z;
    }
}
