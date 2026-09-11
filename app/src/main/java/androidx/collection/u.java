package androidx.collection;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class u {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final Object f;
    public final Object g;

    public u(int i) {
        this.a = 0;
        this.b = i;
        if (i <= 0) {
            net.luminis.tls.engine.impl.c.o("maxSize <= 0");
            throw null;
        }
        this.f = new androidx.collection.internal.b(0);
        this.g = new com.google.android.material.shape.g();
    }

    public void a() {
        View view = (View) androidx.privacysandbox.ads.adservices.java.internal.a.j(1, (ArrayList) this.f);
        androidx.recyclerview.widget.t0 t0Var = (androidx.recyclerview.widget.t0) view.getLayoutParams();
        this.c = ((StaggeredGridLayoutManager) this.g).q.g(view);
        t0Var.getClass();
    }

    public void b() {
        ((ArrayList) this.f).clear();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public Object c(Object obj) {
        obj.getClass();
        return null;
    }

    public void d(Object obj, Object obj2, Object obj3) {
        obj.getClass();
    }

    public int e() {
        boolean z = ((StaggeredGridLayoutManager) this.g).v;
        ArrayList arrayList = (ArrayList) this.f;
        return z ? g(arrayList.size() - 1, -1) : g(0, arrayList.size());
    }

    public int f() {
        boolean z = ((StaggeredGridLayoutManager) this.g).v;
        ArrayList arrayList = (ArrayList) this.f;
        return z ? g(0, arrayList.size()) : g(arrayList.size() - 1, -1);
    }

    public int g(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.g;
        int iQ = staggeredGridLayoutManager.q.q();
        int iL = staggeredGridLayoutManager.q.l();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) ((ArrayList) this.f).get(i);
            int iJ = staggeredGridLayoutManager.q.j(view);
            int iG = staggeredGridLayoutManager.q.g(view);
            boolean z = iJ <= iL;
            boolean z2 = iG >= iQ;
            if (z && z2 && (iJ < iQ || iG > iL)) {
                return androidx.recyclerview.widget.c0.G(view);
            }
            i += i3;
        }
        return -1;
    }

    public Object h(Object obj) {
        Object objPut;
        obj.getClass();
        synchronized (((com.google.android.material.shape.g) this.g)) {
            androidx.collection.internal.b bVar = (androidx.collection.internal.b) this.f;
            bVar.getClass();
            Object obj2 = bVar.a.get(obj);
            if (obj2 != null) {
                this.d++;
                return obj2;
            }
            this.e++;
            Object objC = c(obj);
            if (objC == null) {
                return null;
            }
            synchronized (((com.google.android.material.shape.g) this.g)) {
                androidx.collection.internal.b bVar2 = (androidx.collection.internal.b) this.f;
                bVar2.getClass();
                objPut = bVar2.a.put(obj, objC);
                if (objPut != null) {
                    androidx.collection.internal.b bVar3 = (androidx.collection.internal.b) this.f;
                    bVar3.getClass();
                    bVar3.a.put(obj, objPut);
                } else {
                    this.c++;
                }
            }
            if (objPut != null) {
                d(obj, objC, objPut);
                return objPut;
            }
            n(this.b);
            return objC;
        }
    }

    public int i(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.f).size() == 0) {
            return i;
        }
        a();
        return this.c;
    }

    public View j(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.g;
        ArrayList arrayList = (ArrayList) this.f;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.v && androidx.recyclerview.widget.c0.G(view2) >= i) || ((!staggeredGridLayoutManager.v && androidx.recyclerview.widget.c0.G(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            View view3 = (View) arrayList.get(i3);
            if ((staggeredGridLayoutManager.v && androidx.recyclerview.widget.c0.G(view3) <= i) || ((!staggeredGridLayoutManager.v && androidx.recyclerview.widget.c0.G(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    public int k(int i) {
        ArrayList arrayList = (ArrayList) this.f;
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        androidx.recyclerview.widget.t0 t0Var = (androidx.recyclerview.widget.t0) view.getLayoutParams();
        this.b = ((StaggeredGridLayoutManager) this.g).q.j(view);
        t0Var.getClass();
        return this.b;
    }

    public Object l(Object obj, Object obj2) {
        Object objPut;
        obj.getClass();
        synchronized (((com.google.android.material.shape.g) this.g)) {
            this.c++;
            androidx.collection.internal.b bVar = (androidx.collection.internal.b) this.f;
            bVar.getClass();
            objPut = bVar.a.put(obj, obj2);
            if (objPut != null) {
                this.c--;
            }
        }
        if (objPut != null) {
            d(obj, objPut, obj2);
        }
        n(this.b);
        return objPut;
    }

    public Object m(Object obj) {
        Object objRemove;
        obj.getClass();
        synchronized (((com.google.android.material.shape.g) this.g)) {
            androidx.collection.internal.b bVar = (androidx.collection.internal.b) this.f;
            bVar.getClass();
            objRemove = bVar.a.remove(obj);
            if (objRemove != null) {
                this.c--;
            }
        }
        if (objRemove != null) {
            d(obj, objRemove, null);
        }
        return objRemove;
    }

    public void n(int i) {
        Object key;
        Object value;
        while (true) {
            synchronized (((com.google.android.material.shape.g) this.g)) {
                try {
                    if (this.c < 0 || (((androidx.collection.internal.b) this.f).a.isEmpty() && this.c != 0)) {
                        break;
                    }
                    if (this.c > i && !((androidx.collection.internal.b) this.f).a.isEmpty()) {
                        Set setEntrySet = ((androidx.collection.internal.b) this.f).a.entrySet();
                        setEntrySet.getClass();
                        Map.Entry entry = (Map.Entry) kotlin.collections.o.L(setEntrySet);
                        if (entry == null) {
                            return;
                        }
                        key = entry.getKey();
                        value = entry.getValue();
                        androidx.collection.internal.b bVar = (androidx.collection.internal.b) this.f;
                        bVar.getClass();
                        key.getClass();
                        bVar.a.remove(key);
                        int i2 = this.c;
                        value.getClass();
                        this.c = i2 - 1;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
            d(key, value, null);
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 0:
                synchronized (((com.google.android.material.shape.g) this.g)) {
                    try {
                        int i = this.d;
                        int i2 = this.e + i;
                        str = "LruCache[maxSize=" + this.b + ",hits=" + this.d + ",misses=" + this.e + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public u(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.a = 1;
        this.g = staggeredGridLayoutManager;
        this.f = new ArrayList();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
        this.e = i;
    }
}
