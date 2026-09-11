package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends kotlin.coroutines.jvm.internal.h implements kotlin.jvm.functions.p {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public final /* synthetic */ Iterator F;
    public Object e;
    public Iterator y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(int i, int i2, Iterator it, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.D = i;
        this.E = i2;
        this.F = it;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        e0 e0Var = new e0(this.D, this.E, this.F, dVar);
        e0Var.C = obj;
        return e0Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((kotlin.sequences.j) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:49:0x0102  */
    /* JADX WARN: Code duplicated, block: B:52:0x0107  */
    /* JADX WARN: Code duplicated, block: B:53:0x010c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0140  */
    /* JADX WARN: Code duplicated, block: B:64:0x0155  */
    /* JADX WARN: Code duplicated, block: B:66:0x015b  */
    /* JADX WARN: Code duplicated, block: B:70:0x013a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x011a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0083 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        int i3;
        Iterator it;
        d0 d0Var;
        ArrayList arrayList;
        int i4;
        Iterator it2;
        int i5;
        Object next;
        int i6;
        Object[] objArr;
        int i7;
        d0 d0Var2;
        Object next2;
        boolean z;
        int i8;
        Object[] array;
        kotlin.sequences.j jVar = (kotlin.sequences.j) this.C;
        int i9 = this.B;
        int i10 = this.E;
        boolean z2 = true;
        int i11 = this.D;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (i9 == 0) {
            kotlin.a.e(obj);
            int i12 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            if (i11 <= 1024) {
                i12 = i11;
            }
            i = i10 - i11;
            Iterator it3 = this.F;
            if (i >= 0) {
                arrayList = new ArrayList(i12);
                i4 = i12;
                it2 = it3;
                i5 = 0;
                while (it2.hasNext()) {
                    next = it2.next();
                    if (i5 > 0) {
                        i5--;
                    } else {
                        arrayList.add(next);
                        if (arrayList.size() == i11) {
                            this.C = jVar;
                            this.e = arrayList;
                            this.y = it2;
                            this.z = i4;
                            this.A = i;
                            this.B = 1;
                            jVar.b(arrayList, this);
                            return aVar;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.C = null;
                    this.e = null;
                    this.y = null;
                    this.z = i4;
                    this.A = i;
                    this.B = 2;
                    jVar.b(arrayList, this);
                    return aVar;
                }
            } else {
                d0 d0Var3 = new d0(new Object[i12], 0);
                i2 = i12;
                i3 = i;
                it = it3;
                d0Var = d0Var3;
                while (true) {
                    i6 = d0Var.y;
                    objArr = d0Var.e;
                    if (it.hasNext()) {
                        i7 = i2;
                        d0Var2 = d0Var;
                        break;
                    }
                    next2 = it.next();
                    z = z2;
                    if (d0Var.b() != i6) {
                        net.luminis.tls.engine.impl.c.r("ring buffer is full");
                        return null;
                    }
                    int i13 = d0Var.z;
                    int i14 = d0Var.A;
                    objArr[(i13 + i14) % i6] = next2;
                    d0Var.A = i14 + 1;
                    if (d0Var.b() != i6) {
                        if (d0Var.A < i11) {
                            ArrayList arrayList2 = new ArrayList(d0Var);
                            this.C = jVar;
                            this.e = d0Var;
                            this.y = it;
                            this.z = i2;
                            this.A = i3;
                            this.B = 3;
                            jVar.b(arrayList2, this);
                            return aVar;
                        }
                        i8 = i6 + (i6 >> 1) + 1;
                        if (i8 > i11) {
                            i8 = i11;
                        }
                        if (d0Var.z == 0) {
                            array = Arrays.copyOf(objArr, i8);
                        } else {
                            array = d0Var.toArray(new Object[i8]);
                        }
                        d0Var = new d0(array, d0Var.A);
                    }
                    z2 = z;
                }
                if (d0Var2.A > i10) {
                    ArrayList arrayList3 = new ArrayList(d0Var2);
                    this.C = jVar;
                    this.e = d0Var2;
                    this.y = null;
                    this.z = i7;
                    this.A = i3;
                    this.B = 4;
                    jVar.b(arrayList3, this);
                    return aVar;
                }
                if (!d0Var2.isEmpty()) {
                    this.C = null;
                    this.e = null;
                    this.y = null;
                    this.z = i7;
                    this.A = i3;
                    this.B = 5;
                    jVar.b(d0Var2, this);
                    return aVar;
                }
            }
        } else if (i9 != 1) {
            if (i9 != 2) {
                if (i9 == 3) {
                    i3 = this.A;
                    i2 = this.z;
                    it = this.y;
                    d0Var = (d0) this.e;
                    kotlin.a.e(obj);
                    d0Var.c(i10);
                    while (true) {
                        i6 = d0Var.y;
                        objArr = d0Var.e;
                        if (it.hasNext()) {
                            i7 = i2;
                            d0Var2 = d0Var;
                            break;
                        }
                        next2 = it.next();
                        z = z2;
                        if (d0Var.b() != i6) {
                            net.luminis.tls.engine.impl.c.r("ring buffer is full");
                            return null;
                        }
                        int i15 = d0Var.z;
                        int i16 = d0Var.A;
                        objArr[(i15 + i16) % i6] = next2;
                        d0Var.A = i16 + 1;
                        if (d0Var.b() != i6) {
                            if (d0Var.A < i11) {
                                ArrayList arrayList4 = new ArrayList(d0Var);
                                this.C = jVar;
                                this.e = d0Var;
                                this.y = it;
                                this.z = i2;
                                this.A = i3;
                                this.B = 3;
                                jVar.b(arrayList4, this);
                                return aVar;
                            }
                            i8 = i6 + (i6 >> 1) + 1;
                            if (i8 > i11) {
                                i8 = i11;
                            }
                            if (d0Var.z == 0) {
                                array = Arrays.copyOf(objArr, i8);
                            } else {
                                array = d0Var.toArray(new Object[i8]);
                            }
                            d0Var = new d0(array, d0Var.A);
                        }
                        z2 = z;
                    }
                } else if (i9 == 4) {
                    i3 = this.A;
                    i7 = this.z;
                    d0Var2 = (d0) this.e;
                    kotlin.a.e(obj);
                    d0Var2.c(i10);
                } else {
                    if (i9 != 5) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                if (d0Var2.A > i10) {
                    ArrayList arrayList5 = new ArrayList(d0Var2);
                    this.C = jVar;
                    this.e = d0Var2;
                    this.y = null;
                    this.z = i7;
                    this.A = i3;
                    this.B = 4;
                    jVar.b(arrayList5, this);
                    return aVar;
                }
                if (!d0Var2.isEmpty()) {
                    this.C = null;
                    this.e = null;
                    this.y = null;
                    this.z = i7;
                    this.A = i3;
                    this.B = 5;
                    jVar.b(d0Var2, this);
                    return aVar;
                }
            }
            kotlin.a.e(obj);
        } else {
            i5 = this.A;
            i4 = this.z;
            it2 = this.y;
            kotlin.a.e(obj);
            arrayList = new ArrayList(i11);
            i = i5;
            while (it2.hasNext()) {
                next = it2.next();
                if (i5 > 0) {
                    i5--;
                } else {
                    arrayList.add(next);
                    if (arrayList.size() == i11) {
                        this.C = jVar;
                        this.e = arrayList;
                        this.y = it2;
                        this.z = i4;
                        this.A = i;
                        this.B = 1;
                        jVar.b(arrayList, this);
                        return aVar;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.C = null;
                this.e = null;
                this.y = null;
                this.z = i4;
                this.A = i;
                this.B = 2;
                jVar.b(arrayList, this);
                return aVar;
            }
        }
        return kotlin.y.a;
    }
}
