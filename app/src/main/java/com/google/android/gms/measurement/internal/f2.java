package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 {
    public static final f2 c = new f2(100);
    public final EnumMap a;
    public final int b;

    public f2(int i) {
        EnumMap enumMap = new EnumMap(e2.class);
        this.a = enumMap;
        e2 e2Var = e2.AD_STORAGE;
        c2 c2Var = c2.UNINITIALIZED;
        enumMap.put(e2Var, c2Var);
        enumMap.put(e2.ANALYTICS_STORAGE, c2Var);
        this.b = i;
    }

    public static String a(int i) {
        if (i == -30) {
            return "TCF";
        }
        if (i == -20) {
            return "API";
        }
        if (i == -10) {
            return "MANIFEST";
        }
        if (i == 0) {
            return "1P_API";
        }
        if (i == 30) {
            return "1P_INIT";
        }
        if (i != 90) {
            return i != 100 ? "OTHER" : "UNKNOWN";
        }
        return "REMOTE_CONFIG";
    }

    public static f2 b(int i, Bundle bundle) {
        if (bundle == null) {
            return new f2(i);
        }
        EnumMap enumMap = new EnumMap(e2.class);
        for (e2 e2Var : d2.STORAGE.e) {
            enumMap.put(e2Var, d(bundle.getString(e2Var.e)));
        }
        return new f2(enumMap, i);
    }

    public static f2 c(int i, String str) {
        EnumMap enumMap = new EnumMap(e2.class);
        e2[] e2VarArr = d2.STORAGE.e;
        for (int i2 = 0; i2 < e2VarArr.length; i2++) {
            String str2 = str == null ? "" : str;
            e2 e2Var = e2VarArr[i2];
            int i3 = i2 + 2;
            if (i3 < str2.length()) {
                enumMap.put(e2Var, e(str2.charAt(i3)));
            } else {
                enumMap.put(e2Var, c2.UNINITIALIZED);
            }
        }
        return new f2(enumMap, i);
    }

    public static c2 d(String str) {
        c2 c2Var = c2.UNINITIALIZED;
        if (str == null) {
            return c2Var;
        }
        if (str.equals("granted")) {
            return c2.GRANTED;
        }
        return str.equals("denied") ? c2.DENIED : c2Var;
    }

    public static c2 e(char c2) {
        if (c2 == '+') {
            return c2.POLICY;
        }
        if (c2 != '0') {
            return c2 != '1' ? c2.UNINITIALIZED : c2.GRANTED;
        }
        return c2.DENIED;
    }

    public static char h(c2 c2Var) {
        if (c2Var == null) {
            return '-';
        }
        int iOrdinal = c2Var.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean l(int i, int i2) {
        int i3 = -30;
        if (i == -20) {
            if (i2 == -30) {
                return true;
            }
            i = -20;
        }
        if (i != -30) {
            i3 = i;
        } else if (i2 == -20) {
            return true;
        }
        return i3 == i2 || i < i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f2) {
            f2 f2Var = (f2) obj;
            for (e2 e2Var : d2.STORAGE.e) {
                if (this.a.get(e2Var) == f2Var.a.get(e2Var)) {
                }
            }
            if (this.b == f2Var.b) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    public final String f() {
        int iOrdinal;
        StringBuilder sb = new StringBuilder("G1");
        for (e2 e2Var : d2.STORAGE.e) {
            c2 c2Var = (c2) this.a.get(e2Var);
            char c2 = '-';
            if (c2Var != null && (iOrdinal = c2Var.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c2 = '1';
                } else if (iOrdinal == 2) {
                    c2 = '0';
                } else if (iOrdinal == 3) {
                    c2 = '1';
                }
            }
            sb.append(c2);
        }
        return sb.toString();
    }

    public final String g() {
        StringBuilder sb = new StringBuilder("G1");
        for (e2 e2Var : d2.STORAGE.e) {
            sb.append(h((c2) this.a.get(e2Var)));
        }
        return sb.toString();
    }

    public final int hashCode() {
        Iterator it = this.a.values().iterator();
        int iHashCode = this.b * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((c2) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final boolean i(e2 e2Var) {
        return ((c2) this.a.get(e2Var)) != c2.DENIED;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    public final f2 j(f2 f2Var) {
        EnumMap enumMap = new EnumMap(e2.class);
        for (e2 e2Var : d2.STORAGE.e) {
            c2 c2Var = (c2) this.a.get(e2Var);
            c2 c2Var2 = (c2) f2Var.a.get(e2Var);
            if (c2Var == null) {
                c2Var = c2Var2;
            } else if (c2Var2 != null) {
                c2 c2Var3 = c2.UNINITIALIZED;
                if (c2Var == c2Var3) {
                    c2Var = c2Var2;
                } else if (c2Var2 != c2Var3) {
                    c2 c2Var4 = c2.POLICY;
                    if (c2Var == c2Var4) {
                        c2Var = c2Var2;
                    } else if (c2Var2 != c2Var4) {
                        c2 c2Var5 = c2.DENIED;
                        c2Var = (c2Var == c2Var5 || c2Var2 == c2Var5) ? c2Var5 : c2.GRANTED;
                    }
                }
            }
            if (c2Var != null) {
                enumMap.put(e2Var, c2Var);
            }
        }
        return new f2(enumMap, 100);
    }

    public final f2 k(f2 f2Var) {
        EnumMap enumMap = new EnumMap(e2.class);
        for (e2 e2Var : d2.STORAGE.e) {
            c2 c2Var = (c2) this.a.get(e2Var);
            if (c2Var == c2.UNINITIALIZED) {
                c2Var = (c2) f2Var.a.get(e2Var);
            }
            if (c2Var != null) {
                enumMap.put(e2Var, c2Var);
            }
        }
        return new f2(enumMap, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(a(this.b));
        for (e2 e2Var : d2.STORAGE.e) {
            sb.append(",");
            sb.append(e2Var.e);
            sb.append("=");
            c2 c2Var = (c2) this.a.get(e2Var);
            if (c2Var == null) {
                c2Var = c2.UNINITIALIZED;
            }
            sb.append(c2Var);
        }
        return sb.toString();
    }

    public f2(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(e2.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
        this.b = i;
    }
}
