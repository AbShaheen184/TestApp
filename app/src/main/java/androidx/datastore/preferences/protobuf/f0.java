package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {
    public final e0 a;

    public f0(o1 o1Var, o1 o1Var2, androidx.datastore.preferences.h hVar) {
        this.a = new e0(o1Var, o1Var2, hVar);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0105  */
    /* JADX WARN: Code duplicated, block: B:41:0x010e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0112  */
    /* JADX WARN: Code duplicated, block: B:44:0x0124  */
    /* JADX WARN: Code duplicated, block: B:45:0x0136  */
    /* JADX WARN: Code duplicated, block: B:47:0x013f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0148  */
    /* JADX WARN: Code duplicated, block: B:50:0x0156  */
    /* JADX WARN: Code duplicated, block: B:51:0x0163  */
    /* JADX WARN: Code duplicated, block: B:53:0x0167  */
    /* JADX WARN: Code duplicated, block: B:55:0x0176  */
    /* JADX WARN: Code duplicated, block: B:56:0x017f  */
    /* JADX WARN: Code duplicated, block: B:57:0x018d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0197  */
    /* JADX WARN: Code duplicated, block: B:60:0x019b  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x01af  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:67:0x01de  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f2  */
    public static int a(e0 e0Var, Object obj, Object obj2) {
        int iJ;
        int size;
        int i;
        int i2;
        o1 o1Var;
        int iH;
        int size2;
        int i3;
        o1 o1Var2 = e0Var.a;
        int i4 = o.c;
        int iJ2 = 1;
        int iH2 = j.h(1);
        l1 l1Var = o1.A;
        if (o1Var2 == l1Var) {
            iH2 *= 2;
        }
        switch (o1Var2.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iJ = 8;
                i2 = iJ + iH2;
                o1Var = e0Var.b;
                iH = j.h(2);
                if (o1Var == l1Var) {
                    iH *= 2;
                }
                switch (o1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = j.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((t) ((a) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((t) ((a) obj2)).a(null);
                        i3 = j.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = j.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = j.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue = ((Integer) obj2).intValue();
                        iJ2 = j.i((iIntValue >> 31) ^ (iIntValue << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue = ((Long) obj2).longValue();
                        iJ2 = j.j((jLongValue >> 63) ^ (jLongValue << 1));
                        return iJ2 + iH + i2;
                    default:
                        org.mozilla.javascript.c.b("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 1:
                ((Float) obj).getClass();
                iJ = 4;
                i2 = iJ + iH2;
                o1Var = e0Var.b;
                iH = j.h(2);
                if (o1Var == l1Var) {
                    iH *= 2;
                }
                switch (o1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = j.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((t) ((a) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((t) ((a) obj2)).a(null);
                        i3 = j.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = j.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = j.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue2 = ((Integer) obj2).intValue();
                        iJ2 = j.i((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue2 = ((Long) obj2).longValue();
                        iJ2 = j.j((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                        return iJ2 + iH + i2;
                    default:
                        org.mozilla.javascript.c.b("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 2:
                iJ = j.j(((Long) obj).longValue());
                i2 = iJ + iH2;
                o1Var = e0Var.b;
                iH = j.h(2);
                if (o1Var == l1Var) {
                    iH *= 2;
                }
                switch (o1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = j.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((t) ((a) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((t) ((a) obj2)).a(null);
                        i3 = j.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = j.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = j.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue3 = ((Integer) obj2).intValue();
                        iJ2 = j.i((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue3 = ((Long) obj2).longValue();
                        iJ2 = j.j((jLongValue3 >> 63) ^ (jLongValue3 << 1));
                        return iJ2 + iH + i2;
                    default:
                        org.mozilla.javascript.c.b("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 3:
                iJ = j.j(((Long) obj).longValue());
                i2 = iJ + iH2;
                o1Var = e0Var.b;
                iH = j.h(2);
                if (o1Var == l1Var) {
                    iH *= 2;
                }
                switch (o1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = j.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((t) ((a) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((t) ((a) obj2)).a(null);
                        i3 = j.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = j.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = j.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue4 = ((Integer) obj2).intValue();
                        iJ2 = j.i((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue4 = ((Long) obj2).longValue();
                        iJ2 = j.j((jLongValue4 >> 63) ^ (jLongValue4 << 1));
                        return iJ2 + iH + i2;
                    default:
                        org.mozilla.javascript.c.b("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 4:
                iJ = j.j(((Integer) obj).intValue());
                i2 = iJ + iH2;
                o1Var = e0Var.b;
                iH = j.h(2);
                if (o1Var == l1Var) {
                    iH *= 2;
                }
                switch (o1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = j.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((t) ((a) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((t) ((a) obj2)).a(null);
                        i3 = j.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = j.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = j.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue5 = ((Integer) obj2).intValue();
                        iJ2 = j.i((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue5 = ((Long) obj2).longValue();
                        iJ2 = j.j((jLongValue5 >> 63) ^ (jLongValue5 << 1));
                        return iJ2 + iH + i2;
                    default:
                        org.mozilla.javascript.c.b("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 5:
                ((Long) obj).getClass();
                iJ = 8;
                i2 = iJ + iH2;
                o1Var = e0Var.b;
                iH = j.h(2);
                if (o1Var == l1Var) {
                    iH *= 2;
                }
                switch (o1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = j.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((t) ((a) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((t) ((a) obj2)).a(null);
                        i3 = j.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = j.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = j.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue6 = ((Integer) obj2).intValue();
                        iJ2 = j.i((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue6 = ((Long) obj2).longValue();
                        iJ2 = j.j((jLongValue6 >> 63) ^ (jLongValue6 << 1));
                        return iJ2 + iH + i2;
                    default:
                        org.mozilla.javascript.c.b("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 6:
                ((Integer) obj).getClass();
                iJ = 4;
                i2 = iJ + iH2;
                o1Var = e0Var.b;
                iH = j.h(2);
                if (o1Var == l1Var) {
                    iH *= 2;
                }
                switch (o1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = j.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((t) ((a) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((t) ((a) obj2)).a(null);
                        i3 = j.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = j.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = j.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue7 = ((Integer) obj2).intValue();
                        iJ2 = j.i((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue7 = ((Long) obj2).longValue();
                        iJ2 = j.j((jLongValue7 >> 63) ^ (jLongValue7 << 1));
                        return iJ2 + iH + i2;
                    default:
                        org.mozilla.javascript.c.b("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 7:
                ((Boolean) obj).getClass();
                iJ = 1;
                i2 = iJ + iH2;
                o1Var = e0Var.b;
                iH = j.h(2);
                if (o1Var == l1Var) {
                    iH *= 2;
                }
                switch (o1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = j.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((t) ((a) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((t) ((a) obj2)).a(null);
                        i3 = j.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = j.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = j.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue8 = ((Integer) obj2).intValue();
                        iJ2 = j.i((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue8 = ((Long) obj2).longValue();
                        iJ2 = j.j((jLongValue8 >> 63) ^ (jLongValue8 << 1));
                        return iJ2 + iH + i2;
                    default:
                        org.mozilla.javascript.c.b("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 8:
                if (obj instanceof f) {
                    size = ((f) obj).size();
                    i = j.i(size);
                    iJ = size + i;
                } else {
                    iJ = j.g((String) obj);
                }
                i2 = iJ + iH2;
                o1Var = e0Var.b;
                iH = j.h(2);
                if (o1Var == l1Var) {
                    iH *= 2;
                }
                switch (o1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = j.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((t) ((a) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((t) ((a) obj2)).a(null);
                        i3 = j.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = j.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = j.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue9 = ((Integer) obj2).intValue();
                        iJ2 = j.i((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue9 = ((Long) obj2).longValue();
                        iJ2 = j.j((jLongValue9 >> 63) ^ (jLongValue9 << 1));
                        return iJ2 + iH + i2;
                    default:
                        org.mozilla.javascript.c.b("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 9:
                iJ = ((t) ((a) obj)).a(null);
                i2 = iJ + iH2;
                o1Var = e0Var.b;
                iH = j.h(2);
                if (o1Var == l1Var) {
                    iH *= 2;
                }
                switch (o1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = j.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((t) ((a) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((t) ((a) obj2)).a(null);
                        i3 = j.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = j.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = j.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue10 = ((Integer) obj2).intValue();
                        iJ2 = j.i((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue10 = ((Long) obj2).longValue();
                        iJ2 = j.j((jLongValue10 >> 63) ^ (jLongValue10 << 1));
                        return iJ2 + iH + i2;
                    default:
                        org.mozilla.javascript.c.b("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 10:
                size = ((t) ((a) obj)).a(null);
                i = j.i(size);
                iJ = size + i;
                i2 = iJ + iH2;
                o1Var = e0Var.b;
                iH = j.h(2);
                if (o1Var == l1Var) {
                    iH *= 2;
                }
                switch (o1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = j.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((t) ((a) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((t) ((a) obj2)).a(null);
                        i3 = j.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = j.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = j.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue11 = ((Integer) obj2).intValue();
                        iJ2 = j.i((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue11 = ((Long) obj2).longValue();
                        iJ2 = j.j((jLongValue11 >> 63) ^ (jLongValue11 << 1));
                        return iJ2 + iH + i2;
                    default:
                        org.mozilla.javascript.c.b("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 11:
                if (obj instanceof f) {
                    size = ((f) obj).size();
                    i = j.i(size);
                } else {
                    size = ((byte[]) obj).length;
                    i = j.i(size);
                }
                iJ = size + i;
                i2 = iJ + iH2;
                o1Var = e0Var.b;
                iH = j.h(2);
                if (o1Var == l1Var) {
                    iH *= 2;
                }
                switch (o1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = j.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((t) ((a) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((t) ((a) obj2)).a(null);
                        i3 = j.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = j.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = j.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue12 = ((Integer) obj2).intValue();
                        iJ2 = j.i((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue12 = ((Long) obj2).longValue();
                        iJ2 = j.j((jLongValue12 >> 63) ^ (jLongValue12 << 1));
                        return iJ2 + iH + i2;
                    default:
                        org.mozilla.javascript.c.b("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 12:
                iJ = j.i(((Integer) obj).intValue());
                i2 = iJ + iH2;
                o1Var = e0Var.b;
                iH = j.h(2);
                if (o1Var == l1Var) {
                    iH *= 2;
                }
                switch (o1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = j.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((t) ((a) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((t) ((a) obj2)).a(null);
                        i3 = j.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = j.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = j.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue13 = ((Integer) obj2).intValue();
                        iJ2 = j.i((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue13 = ((Long) obj2).longValue();
                        iJ2 = j.j((jLongValue13 >> 63) ^ (jLongValue13 << 1));
                        return iJ2 + iH + i2;
                    default:
                        org.mozilla.javascript.c.b("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 13:
                iJ = j.j(((Integer) obj).intValue());
                i2 = iJ + iH2;
                o1Var = e0Var.b;
                iH = j.h(2);
                if (o1Var == l1Var) {
                    iH *= 2;
                }
                switch (o1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = j.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((t) ((a) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((t) ((a) obj2)).a(null);
                        i3 = j.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = j.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = j.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue14 = ((Integer) obj2).intValue();
                        iJ2 = j.i((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue14 = ((Long) obj2).longValue();
                        iJ2 = j.j((jLongValue14 >> 63) ^ (jLongValue14 << 1));
                        return iJ2 + iH + i2;
                    default:
                        org.mozilla.javascript.c.b("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 14:
                ((Integer) obj).getClass();
                iJ = 4;
                i2 = iJ + iH2;
                o1Var = e0Var.b;
                iH = j.h(2);
                if (o1Var == l1Var) {
                    iH *= 2;
                }
                switch (o1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = j.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((t) ((a) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((t) ((a) obj2)).a(null);
                        i3 = j.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = j.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = j.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue15 = ((Integer) obj2).intValue();
                        iJ2 = j.i((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue15 = ((Long) obj2).longValue();
                        iJ2 = j.j((jLongValue15 >> 63) ^ (jLongValue15 << 1));
                        return iJ2 + iH + i2;
                    default:
                        org.mozilla.javascript.c.b("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 15:
                ((Long) obj).getClass();
                iJ = 8;
                i2 = iJ + iH2;
                o1Var = e0Var.b;
                iH = j.h(2);
                if (o1Var == l1Var) {
                    iH *= 2;
                }
                switch (o1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = j.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((t) ((a) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((t) ((a) obj2)).a(null);
                        i3 = j.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = j.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = j.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue16 = ((Integer) obj2).intValue();
                        iJ2 = j.i((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue16 = ((Long) obj2).longValue();
                        iJ2 = j.j((jLongValue16 >> 63) ^ (jLongValue16 << 1));
                        return iJ2 + iH + i2;
                    default:
                        org.mozilla.javascript.c.b("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 16:
                int iIntValue17 = ((Integer) obj).intValue();
                iJ = j.i((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                i2 = iJ + iH2;
                o1Var = e0Var.b;
                iH = j.h(2);
                if (o1Var == l1Var) {
                    iH *= 2;
                }
                switch (o1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = j.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((t) ((a) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((t) ((a) obj2)).a(null);
                        i3 = j.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = j.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = j.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue18 = ((Integer) obj2).intValue();
                        iJ2 = j.i((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue17 = ((Long) obj2).longValue();
                        iJ2 = j.j((jLongValue17 >> 63) ^ (jLongValue17 << 1));
                        return iJ2 + iH + i2;
                    default:
                        org.mozilla.javascript.c.b("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 17:
                long jLongValue18 = ((Long) obj).longValue();
                iJ = j.j((jLongValue18 >> 63) ^ (jLongValue18 << 1));
                i2 = iJ + iH2;
                o1Var = e0Var.b;
                iH = j.h(2);
                if (o1Var == l1Var) {
                    iH *= 2;
                }
                switch (o1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = j.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = j.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((t) ((a) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((t) ((a) obj2)).a(null);
                        i3 = j.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i3 = j.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = j.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = j.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = j.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue19 = ((Integer) obj2).intValue();
                        iJ2 = j.i((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue19 = ((Long) obj2).longValue();
                        iJ2 = j.j((jLongValue19 >> 63) ^ (jLongValue19 << 1));
                        return iJ2 + iH + i2;
                    default:
                        org.mozilla.javascript.c.b("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            default:
                org.mozilla.javascript.c.b("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }
}
