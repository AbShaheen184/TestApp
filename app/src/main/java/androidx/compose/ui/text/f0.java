package androidx.compose.ui.text;

import androidx.compose.ui.graphics.p0;
import androidx.datastore.preferences.protobuf.h1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {
    public static final long a = h1.r(14);
    public static final long b = h1.r(0);
    public static final long c = androidx.compose.ui.graphics.t.h;
    public static final androidx.compose.ui.text.style.o d;

    static {
        long j = androidx.compose.ui.graphics.t.b;
        d = j != 16 ? new androidx.compose.ui.text.style.c(j) : androidx.compose.ui.text.style.n.a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x016f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x0171  */
    /* JADX WARN: Code duplicated, block: B:106:0x0176 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x0186  */
    /* JADX WARN: Code duplicated, block: B:115:0x018b  */
    /* JADX WARN: Code duplicated, block: B:116:0x018e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0192  */
    /* JADX WARN: Code duplicated, block: B:119:0x0195  */
    /* JADX WARN: Code duplicated, block: B:121:0x0199  */
    /* JADX WARN: Code duplicated, block: B:122:0x019c  */
    /* JADX WARN: Code duplicated, block: B:124:0x019f  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:133:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:134:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:137:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:138:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:141:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:142:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:145:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:146:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:148:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:149:0x01df  */
    /* JADX WARN: Code duplicated, block: B:152:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:154:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:80:0x0112  */
    /* JADX WARN: Code duplicated, block: B:82:0x0116  */
    /* JADX WARN: Code duplicated, block: B:84:0x0125  */
    /* JADX WARN: Code duplicated, block: B:85:0x012b  */
    /* JADX WARN: Code duplicated, block: B:86:0x012d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0133  */
    /* JADX WARN: Code duplicated, block: B:89:0x013d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0142  */
    /* JADX WARN: Code duplicated, block: B:93:0x0146  */
    /* JADX WARN: Code duplicated, block: B:96:0x0154  */
    public static final e0 a(e0 e0Var, long j, androidx.compose.ui.graphics.p pVar, float f, long j2, androidx.compose.ui.text.font.l lVar, androidx.compose.ui.text.font.j jVar, androidx.compose.ui.text.font.k kVar, androidx.compose.ui.text.font.s sVar, String str, long j3, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.p pVar2, androidx.compose.ui.text.intl.b bVar, long j4, androidx.compose.ui.text.style.l lVar2, androidx.compose.ui.graphics.m0 m0Var, v vVar, androidx.compose.ui.graphics.drawscope.e eVar) {
        androidx.compose.ui.text.style.a aVar2;
        androidx.compose.ui.graphics.m0 m0Var2;
        v vVar2;
        androidx.compose.ui.graphics.drawscope.e eVar2;
        androidx.compose.ui.text.style.n nVar;
        androidx.compose.ui.text.style.o cVar;
        androidx.compose.ui.text.style.o oVar;
        boolean z;
        long j5;
        androidx.compose.ui.text.font.l lVar3;
        androidx.compose.ui.text.font.j jVar2;
        androidx.compose.ui.text.style.p pVar3;
        androidx.compose.ui.text.intl.b bVar2;
        long j6;
        androidx.compose.ui.text.style.l lVar4;
        androidx.compose.ui.graphics.m0 m0Var3;
        v vVar3;
        long jZ;
        androidx.compose.ui.text.font.k kVar2 = kVar;
        androidx.compose.ui.text.font.s sVar2 = sVar;
        String str2 = str;
        long j7 = j3;
        androidx.compose.ui.unit.p[] pVarArr = androidx.compose.ui.unit.o.b;
        long j8 = j2 & 1095216660480L;
        if ((j8 == 0 || androidx.compose.ui.unit.o.a(j2, e0Var.b)) && ((pVar != null || j == 16 || androidx.compose.ui.graphics.t.c(j, e0Var.a.b())) && ((jVar == null || jVar.equals(e0Var.d)) && ((lVar == null || lVar.equals(e0Var.c)) && ((sVar2 == null || sVar2 == e0Var.f) && (((j7 & 1095216660480L) == 0 || androidx.compose.ui.unit.o.a(j7, e0Var.h)) && ((lVar2 == null || lVar2.equals(e0Var.m)) && kotlin.jvm.internal.l.a(pVar, e0Var.a.c()) && ((pVar == null || f == e0Var.a.a()) && ((kVar2 == null || kVar2.equals(e0Var.e)) && (str2 == null || str2.equals(e0Var.g))))))))))) {
            if (aVar != null) {
                aVar2 = aVar;
                if (aVar2.equals(e0Var.i)) {
                }
                nVar = androidx.compose.ui.text.style.n.a;
                if (pVar != null) {
                    if (pVar instanceof p0) {
                        jZ = kotlin.math.a.z(f, ((p0) pVar).a);
                        if (jZ != 16) {
                            cVar = new androidx.compose.ui.text.style.c(jZ);
                        } else {
                            cVar = nVar;
                        }
                    } else {
                        if (!(pVar instanceof androidx.compose.ui.graphics.l0)) {
                            coil3.g.a();
                            return null;
                        }
                        cVar = new androidx.compose.ui.text.style.b((androidx.compose.ui.graphics.l0) pVar, f);
                    }
                } else if (j != 16) {
                    cVar = new androidx.compose.ui.text.style.c(j);
                } else {
                    cVar = nVar;
                }
                oVar = e0Var.a;
                oVar.getClass();
                z = cVar instanceof androidx.compose.ui.text.style.b;
                if (!z && (oVar instanceof androidx.compose.ui.text.style.b)) {
                    androidx.compose.ui.text.style.b bVar3 = (androidx.compose.ui.text.style.b) cVar;
                    androidx.compose.ui.graphics.l0 l0Var = bVar3.a;
                    float f2 = bVar3.b;
                    if (Float.isNaN(f2)) {
                        f2 = ((androidx.compose.ui.text.style.b) oVar).b;
                    }
                    cVar = new androidx.compose.ui.text.style.b(l0Var, f2);
                } else if ((z || (oVar instanceof androidx.compose.ui.text.style.b)) && ((!z && (oVar instanceof androidx.compose.ui.text.style.b)) || cVar.equals(nVar))) {
                }
                if (sVar2 == null) {
                    sVar2 = e0Var.f;
                }
                if (j8 == 0) {
                    j5 = e0Var.b;
                } else {
                    j5 = j2;
                }
                if (lVar == null) {
                    lVar3 = e0Var.c;
                } else {
                    lVar3 = lVar;
                }
                if (jVar == null) {
                    jVar2 = e0Var.d;
                } else {
                    jVar2 = jVar;
                }
                if (kVar2 == null) {
                    kVar2 = e0Var.e;
                }
                if (str2 == null) {
                    str2 = e0Var.g;
                }
                if ((j7 & 1095216660480L) == 0) {
                    j7 = e0Var.h;
                }
                if (aVar2 == null) {
                    aVar2 = e0Var.i;
                }
                if (pVar2 == null) {
                    pVar3 = e0Var.j;
                } else {
                    pVar3 = pVar2;
                }
                long j9 = j5;
                if (bVar == null) {
                    bVar2 = e0Var.k;
                } else {
                    bVar2 = bVar;
                }
                if (j4 != 16) {
                    j6 = j4;
                } else {
                    j6 = e0Var.l;
                }
                long j10 = j6;
                if (lVar2 == null) {
                    lVar4 = e0Var.m;
                } else {
                    lVar4 = lVar2;
                }
                if (m0Var2 == null) {
                    m0Var3 = e0Var.n;
                } else {
                    m0Var3 = m0Var2;
                }
                vVar3 = e0Var.o;
                if (vVar3 == null) {
                    vVar3 = vVar2;
                }
                if (eVar2 == null) {
                    eVar2 = e0Var.p;
                }
                return new e0(cVar, j9, lVar3, jVar2, kVar2, sVar2, str2, j7, aVar2, pVar3, bVar2, j10, lVar4, m0Var3, vVar3, eVar2);
            }
            aVar2 = aVar;
            if (pVar2 == null || pVar2.equals(e0Var.j)) {
                if (bVar == null || bVar.equals(e0Var.k)) {
                    if (j4 == 16 || androidx.compose.ui.graphics.t.c(j4, e0Var.l)) {
                        m0Var2 = m0Var;
                        if (m0Var2 == null || m0Var2.equals(e0Var.n)) {
                            vVar2 = vVar;
                            if (vVar2 == null || vVar2.equals(e0Var.o)) {
                                eVar2 = eVar;
                                if (eVar2 == null || eVar2.equals(e0Var.p)) {
                                    return e0Var;
                                }
                            }
                        }
                        eVar2 = eVar;
                    }
                    vVar2 = vVar;
                    eVar2 = eVar;
                }
            }
            nVar = androidx.compose.ui.text.style.n.a;
            if (pVar != null) {
                if (pVar instanceof p0) {
                    jZ = kotlin.math.a.z(f, ((p0) pVar).a);
                    if (jZ != 16) {
                        cVar = new androidx.compose.ui.text.style.c(jZ);
                    } else {
                        cVar = nVar;
                    }
                } else {
                    if (!(pVar instanceof androidx.compose.ui.graphics.l0)) {
                        coil3.g.a();
                        return null;
                    }
                    cVar = new androidx.compose.ui.text.style.b((androidx.compose.ui.graphics.l0) pVar, f);
                }
            } else if (j != 16) {
                cVar = new androidx.compose.ui.text.style.c(j);
            } else {
                cVar = nVar;
            }
            oVar = e0Var.a;
            oVar.getClass();
            z = cVar instanceof androidx.compose.ui.text.style.b;
            if (!z) {
                cVar = z ? oVar : oVar;
            } else if (z) {
            }
            if (sVar2 == null) {
                sVar2 = e0Var.f;
            }
            if (j8 == 0) {
                j5 = e0Var.b;
            } else {
                j5 = j2;
            }
            if (lVar == null) {
                lVar3 = e0Var.c;
            } else {
                lVar3 = lVar;
            }
            if (jVar == null) {
                jVar2 = e0Var.d;
            } else {
                jVar2 = jVar;
            }
            if (kVar2 == null) {
                kVar2 = e0Var.e;
            }
            if (str2 == null) {
                str2 = e0Var.g;
            }
            if ((j7 & 1095216660480L) == 0) {
                j7 = e0Var.h;
            }
            if (aVar2 == null) {
                aVar2 = e0Var.i;
            }
            if (pVar2 == null) {
                pVar3 = e0Var.j;
            } else {
                pVar3 = pVar2;
            }
            long j11 = j5;
            if (bVar == null) {
                bVar2 = e0Var.k;
            } else {
                bVar2 = bVar;
            }
            if (j4 != 16) {
                j6 = j4;
            } else {
                j6 = e0Var.l;
            }
            long j12 = j6;
            if (lVar2 == null) {
                lVar4 = e0Var.m;
            } else {
                lVar4 = lVar2;
            }
            if (m0Var2 == null) {
                m0Var3 = e0Var.n;
            } else {
                m0Var3 = m0Var2;
            }
            vVar3 = e0Var.o;
            if (vVar3 == null) {
                vVar3 = vVar2;
            }
            if (eVar2 == null) {
                eVar2 = e0Var.p;
            }
            return new e0(cVar, j11, lVar3, jVar2, kVar2, sVar2, str2, j7, aVar2, pVar3, bVar2, j12, lVar4, m0Var3, vVar3, eVar2);
        }
        aVar2 = aVar;
        m0Var2 = m0Var;
        vVar2 = vVar;
        eVar2 = eVar;
        nVar = androidx.compose.ui.text.style.n.a;
        if (pVar != null) {
            if (pVar instanceof p0) {
                jZ = kotlin.math.a.z(f, ((p0) pVar).a);
                if (jZ != 16) {
                    cVar = new androidx.compose.ui.text.style.c(jZ);
                } else {
                    cVar = nVar;
                }
            } else {
                if (!(pVar instanceof androidx.compose.ui.graphics.l0)) {
                    coil3.g.a();
                    return null;
                }
                cVar = new androidx.compose.ui.text.style.b((androidx.compose.ui.graphics.l0) pVar, f);
            }
        } else if (j != 16) {
            cVar = new androidx.compose.ui.text.style.c(j);
        } else {
            cVar = nVar;
        }
        oVar = e0Var.a;
        oVar.getClass();
        z = cVar instanceof androidx.compose.ui.text.style.b;
        if (!z) {
            if (z) {
            }
        } else if (z) {
        }
        if (sVar2 == null) {
            sVar2 = e0Var.f;
        }
        if (j8 == 0) {
            j5 = e0Var.b;
        } else {
            j5 = j2;
        }
        if (lVar == null) {
            lVar3 = e0Var.c;
        } else {
            lVar3 = lVar;
        }
        if (jVar == null) {
            jVar2 = e0Var.d;
        } else {
            jVar2 = jVar;
        }
        if (kVar2 == null) {
            kVar2 = e0Var.e;
        }
        if (str2 == null) {
            str2 = e0Var.g;
        }
        if ((j7 & 1095216660480L) == 0) {
            j7 = e0Var.h;
        }
        if (aVar2 == null) {
            aVar2 = e0Var.i;
        }
        if (pVar2 == null) {
            pVar3 = e0Var.j;
        } else {
            pVar3 = pVar2;
        }
        long j13 = j5;
        if (bVar == null) {
            bVar2 = e0Var.k;
        } else {
            bVar2 = bVar;
        }
        if (j4 != 16) {
            j6 = j4;
        } else {
            j6 = e0Var.l;
        }
        long j14 = j6;
        if (lVar2 == null) {
            lVar4 = e0Var.m;
        } else {
            lVar4 = lVar2;
        }
        if (m0Var2 == null) {
            m0Var3 = e0Var.n;
        } else {
            m0Var3 = m0Var2;
        }
        vVar3 = e0Var.o;
        if (vVar3 == null) {
            vVar3 = vVar2;
        }
        if (eVar2 == null) {
            eVar2 = e0Var.p;
        }
        return new e0(cVar, j13, lVar3, jVar2, kVar2, sVar2, str2, j7, aVar2, pVar3, bVar2, j14, lVar4, m0Var3, vVar3, eVar2);
    }

    public static final Object b(Object obj, Object obj2, float f) {
        return ((double) f) < 0.5d ? obj : obj2;
    }

    public static final long c(long j, long j2, float f) {
        androidx.compose.ui.unit.p[] pVarArr = androidx.compose.ui.unit.o.b;
        long j3 = j & 1095216660480L;
        if (j3 != 0) {
            long j4 = 1095216660480L & j2;
            if (j4 != 0) {
                if (j3 == 0 || j4 == 0) {
                    androidx.compose.ui.unit.i.a("Cannot perform operation for Unspecified type.");
                }
                if (!androidx.compose.ui.unit.p.a(androidx.compose.ui.unit.o.b(j), androidx.compose.ui.unit.o.b(j2))) {
                    androidx.compose.ui.unit.i.a("Cannot perform operation for " + ((Object) androidx.compose.ui.unit.p.b(androidx.compose.ui.unit.o.b(j))) + " and " + ((Object) androidx.compose.ui.unit.p.b(androidx.compose.ui.unit.o.b(j2))));
                }
                return h1.u(com.google.firebase.b.A(androidx.compose.ui.unit.o.c(j), androidx.compose.ui.unit.o.c(j2), f), j3);
            }
        }
        return ((androidx.compose.ui.unit.o) b(new androidx.compose.ui.unit.o(j), new androidx.compose.ui.unit.o(j2), f)).a;
    }
}
