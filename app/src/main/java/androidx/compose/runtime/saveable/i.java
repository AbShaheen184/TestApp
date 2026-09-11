package androidx.compose.runtime.saveable;

import androidx.appcompat.widget.c2;
import androidx.collection.o0;
import androidx.collection.w0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.v;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements h {
    public final kotlin.jvm.functions.l e;
    public final o0 y;
    public o0 z;

    public i(Map map, kotlin.jvm.functions.l lVar) {
        o0 o0Var;
        this.e = lVar;
        if (map == null || map.isEmpty()) {
            o0Var = null;
        } else {
            o0Var = new o0(map.size());
            for (Map.Entry entry : map.entrySet()) {
                o0Var.m(entry.getKey(), entry.getValue());
            }
        }
        this.y = o0Var;
    }

    @Override // androidx.compose.runtime.saveable.h
    public final boolean a(Object obj) {
        return ((Boolean) this.e.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    @Override // androidx.compose.runtime.saveable.h
    public final Map b() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        o0 o0Var = this.y;
        if (o0Var == null && this.z == null) {
            return v.e;
        }
        int i3 = 0;
        int i4 = o0Var != null ? o0Var.e : 0;
        o0 o0Var2 = this.z;
        HashMap map = new HashMap(i4 + (o0Var2 != null ? o0Var2.e : 0));
        char c2 = 7;
        long j4 = -9187201950435737472L;
        int i5 = 8;
        if (o0Var != null) {
            Object[] objArr = o0Var.b;
            Object[] objArr2 = o0Var.c;
            long[] jArr3 = o0Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j5 = jArr3[i6];
                    j3 = 255;
                    if ((((~j5) << c2) & j5 & j4) != j4) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j5 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                map.put((String) objArr[i9], (List) objArr2[i9]);
                            }
                            j5 >>= 8;
                            i8++;
                            c2 = c2;
                            j4 = j4;
                        }
                        c = c2;
                        j = j4;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c2;
                        j = j4;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c2 = c;
                    j4 = j;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
        }
        o0 o0Var3 = this.z;
        if (o0Var3 != null) {
            Object[] objArr3 = o0Var3.b;
            Object[] objArr4 = o0Var3.c;
            long[] jArr4 = o0Var3.a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i10 = 0;
                while (true) {
                    long j6 = jArr4[i10];
                    if ((((~j6) << c) & j6 & j) != j) {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        int i12 = i3;
                        while (i12 < i11) {
                            if ((j6 & j3) < j2) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr3[i13];
                                List list = (List) objArr4[i13];
                                String str = (String) obj;
                                i2 = i5;
                                if (list.size() == 1) {
                                    Object objInvoke = ((kotlin.jvm.functions.a) list.get(i3)).invoke();
                                    if (objInvoke != null) {
                                        if (!a(objInvoke)) {
                                            net.luminis.tls.engine.impl.c.c(n.a(objInvoke));
                                            return null;
                                        }
                                        map.put(str, com.google.common.base.c.a(objInvoke));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i3 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objInvoke2 = ((kotlin.jvm.functions.a) list.get(i3)).invoke();
                                        if (objInvoke2 != null && !a(objInvoke2)) {
                                            net.luminis.tls.engine.impl.c.c(n.a(objInvoke2));
                                            return null;
                                        }
                                        arrayList.add(objInvoke2);
                                        i3++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i2 = i5;
                            }
                            j6 >>= i2;
                            i12++;
                            i5 = i2;
                            jArr4 = jArr2;
                            i3 = 0;
                        }
                        jArr = jArr4;
                        i = i5;
                        if (i11 == i) {
                        }
                    } else {
                        jArr = jArr4;
                        i = i5;
                    }
                    if (i10 != length2) {
                        i10++;
                        i5 = i;
                        jArr4 = jArr;
                        i3 = 0;
                    }
                }
            }
        }
        return map;
    }

    @Override // androidx.compose.runtime.saveable.h
    public final Object c(String str) {
        o0 o0Var = this.y;
        List list = o0Var != null ? (List) o0Var.k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && o0Var != null) {
            List listSubList = list.subList(1, list.size());
            int iF = o0Var.f(str);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = o0Var.c;
            Object obj = objArr[iF];
            o0Var.b[iF] = str;
            objArr[iF] = listSubList;
        }
        return list.get(0);
    }

    @Override // androidx.compose.runtime.saveable.h
    public final g d(String str, kotlin.jvm.functions.a aVar) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!com.google.android.material.shape.e.i(str.charAt(i))) {
                o0 o0Var = this.z;
                if (o0Var == null) {
                    long[] jArr = w0.a;
                    o0Var = new o0();
                    this.z = o0Var;
                }
                Object objG = o0Var.g(str);
                if (objG == null) {
                    objG = new ArrayList();
                    o0Var.m(str, objG);
                }
                ((List) objG).add(aVar);
                return new c2(4, o0Var, str, aVar);
            }
        }
        net.luminis.tls.engine.impl.c.o("Registered key is empty or blank");
        return null;
    }
}
