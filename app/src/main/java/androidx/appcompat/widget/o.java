package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public o() {
        this.b = new androidx.compose.ui.layout.p[32];
        this.c = new float[32];
        this.d = new byte[32];
        androidx.collection.p0 p0Var = androidx.collection.x0.a;
        this.e = new androidx.collection.p0();
        this.f = new androidx.collection.p0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r10 < r3.y) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(long r10, androidx.media3.common.util.w r12) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.d
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            java.lang.Object r1 = r9.e
            java.util.PriorityQueue r1 = (java.util.PriorityQueue) r1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 == 0) goto L9f
            int r3 = r9.a
            if (r3 == 0) goto L9f
            r4 = -1
            if (r3 == r4) goto L2f
            int r3 = r1.size()
            int r5 = r9.a
            if (r3 < r5) goto L2f
            java.lang.Object r3 = r1.peek()
            androidx.media3.container.w r3 = (androidx.media3.container.w) r3
            java.lang.String r5 = androidx.media3.common.util.j0.a
            long r5 = r3.y
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 >= 0) goto L2f
            goto L9f
        L2f:
            java.lang.Object r3 = r9.c
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L3f
            androidx.media3.common.util.w r3 = new androidx.media3.common.util.w
            r3.<init>()
            goto L45
        L3f:
            java.lang.Object r3 = r3.pop()
            androidx.media3.common.util.w r3 = (androidx.media3.common.util.w) r3
        L45:
            int r5 = r12.a()
            r3.J(r5)
            byte[] r5 = r12.a
            int r12 = r12.b
            byte[] r6 = r3.a
            int r7 = r3.a()
            r8 = 0
            java.lang.System.arraycopy(r5, r12, r6, r8, r7)
            java.lang.Object r12 = r9.f
            androidx.media3.container.w r12 = (androidx.media3.container.w) r12
            if (r12 == 0) goto L6c
            long r5 = r12.y
            int r5 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r5 != 0) goto L6c
            java.util.ArrayList r10 = r12.e
            r10.add(r3)
            return
        L6c:
            boolean r12 = r0.isEmpty()
            if (r12 == 0) goto L78
            androidx.media3.container.w r12 = new androidx.media3.container.w
            r12.<init>()
            goto L7e
        L78:
            java.lang.Object r12 = r0.pop()
            androidx.media3.container.w r12 = (androidx.media3.container.w) r12
        L7e:
            java.util.ArrayList r0 = r12.e
            if (r2 == 0) goto L83
            r8 = 1
        L83:
            com.google.android.material.motion.a.f(r8)
            boolean r2 = r0.isEmpty()
            com.google.android.material.motion.a.q(r2)
            r12.y = r10
            r0.add(r3)
            r1.add(r12)
            r9.f = r12
            int r10 = r9.a
            if (r10 == r4) goto L9e
            r9.c(r10)
        L9e:
            return
        L9f:
            java.lang.Object r0 = r9.b
            androidx.activity.y r0 = (androidx.activity.y) r0
            r0.e(r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o.a(long, androidx.media3.common.util.w):void");
    }

    public void b() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((a2) this.d) != null) {
                if (((a2) this.f) == null) {
                    this.f = new a2();
                }
                a2 a2Var = (a2) this.f;
                a2Var.c = null;
                a2Var.b = false;
                a2Var.d = null;
                a2Var.a = false;
                Field field = androidx.core.view.s0.a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    a2Var.b = true;
                    a2Var.c = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    a2Var.a = true;
                    a2Var.d = backgroundTintMode;
                }
                if (a2Var.b || a2Var.a) {
                    s.d(background, a2Var, view.getDrawableState());
                    return;
                }
            }
            a2 a2Var2 = (a2) this.e;
            if (a2Var2 != null) {
                s.d(background, a2Var2, view.getDrawableState());
                return;
            }
            a2 a2Var3 = (a2) this.d;
            if (a2Var3 != null) {
                s.d(background, a2Var3, view.getDrawableState());
            }
        }
    }

    public void c(int i) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.e;
        while (priorityQueue.size() > i) {
            androidx.media3.container.w wVar = (androidx.media3.container.w) priorityQueue.poll();
            String str = androidx.media3.common.util.j0.a;
            int i2 = 0;
            while (true) {
                arrayList = wVar.e;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((androidx.activity.y) this.b).e(wVar.y, (androidx.media3.common.util.w) arrayList.get(i2));
                ((ArrayDeque) this.c).push((androidx.media3.common.util.w) arrayList.get(i2));
                i2++;
            }
            arrayList.clear();
            androidx.media3.container.w wVar2 = (androidx.media3.container.w) this.f;
            if (wVar2 != null && wVar2.y == wVar.y) {
                this.f = null;
            }
            ((ArrayDeque) this.d).push(wVar);
        }
    }

    public ColorStateList d() {
        a2 a2Var = (a2) this.e;
        if (a2Var != null) {
            return (ColorStateList) a2Var.c;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        a2 a2Var = (a2) this.e;
        if (a2Var != null) {
            return (PorterDuff.Mode) a2Var.d;
        }
        return null;
    }

    public void f(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListF;
        View view = (View) this.b;
        Context context = view.getContext();
        int[] iArr = androidx.appcompat.a.t;
        c2 c2VarS = c2.S(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c2VarS.z;
        View view2 = (View) this.b;
        androidx.core.view.s0.l(view2, view2.getContext(), iArr, attributeSet, (TypedArray) c2VarS.z, i);
        try {
            if (typedArray.hasValue(0)) {
                this.a = typedArray.getResourceId(0, -1);
                s sVar = (s) this.c;
                Context context2 = view.getContext();
                int i2 = this.a;
                synchronized (sVar) {
                    colorStateListF = sVar.a.f(context2, i2);
                }
                if (colorStateListF != null) {
                    k(colorStateListF);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(c2VarS.z(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(t0.b(typedArray.getInt(2, -1), null));
            }
            c2VarS.U();
        } catch (Throwable th) {
            c2VarS.U();
            throw th;
        }
    }

    public androidx.navigation.s g(String str) {
        androidx.navigation.r rVar;
        str.getClass();
        kotlin.o oVar = (kotlin.o) this.f;
        if (oVar == null || (rVar = (androidx.navigation.r) oVar.getValue()) == null) {
            return null;
        }
        int i = androidx.navigation.t.B;
        Uri uri = Uri.parse("android-app://androidx.navigation/".concat(str));
        uri.getClass();
        Bundle bundleD = rVar.d(uri, (LinkedHashMap) this.d);
        if (bundleD == null) {
            return null;
        }
        return new androidx.navigation.s((androidx.navigation.t) this.b, bundleD, rVar.l, rVar.b(uri), false);
    }

    public void h() {
        this.a = -1;
        k(null);
        b();
    }

    public void i(int i) {
        ColorStateList colorStateListF;
        this.a = i;
        s sVar = (s) this.c;
        if (sVar != null) {
            Context context = ((View) this.b).getContext();
            synchronized (sVar) {
                colorStateListF = sVar.a.f(context, i);
            }
        } else {
            colorStateListF = null;
        }
        k(colorStateListF);
        b();
    }

    public void j(Runnable runnable) {
        androidx.media3.common.util.g0 g0Var = (androidx.media3.common.util.g0) this.b;
        if (g0Var.a.getLooper().getThread().isAlive()) {
            g0Var.d(runnable);
        }
    }

    public void k(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((a2) this.d) == null) {
                this.d = new a2();
            }
            a2 a2Var = (a2) this.d;
            a2Var.c = colorStateList;
            a2Var.b = true;
        } else {
            this.d = null;
        }
        b();
    }

    public void l(int i) {
        com.google.android.material.motion.a.q(i >= 0);
        this.a = i;
        c(i);
    }

    public void m(ColorStateList colorStateList) {
        if (((a2) this.e) == null) {
            this.e = new a2();
        }
        a2 a2Var = (a2) this.e;
        a2Var.c = colorStateList;
        a2Var.b = true;
        b();
    }

    public void n(PorterDuff.Mode mode) {
        if (((a2) this.e) == null) {
            this.e = new a2();
        }
        a2 a2Var = (a2) this.e;
        a2Var.d = mode;
        a2Var.a = true;
        b();
    }

    public void o(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        if (obj2.equals(obj)) {
            return;
        }
        androidx.media3.exoplayer.c0 c0Var = ((androidx.media3.exoplayer.q) this.d).e;
        ((Integer) obj2).getClass();
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        c0Var.V();
        c0Var.J(1, 10, num);
        c0Var.J(2, 10, num);
        c0Var.m.e(21, new androidx.media3.exoplayer.r(iIntValue, 1));
    }

    public o(androidx.activity.y yVar) {
        this.b = yVar;
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = new PriorityQueue();
        this.a = -1;
    }

    public o(int i, String str, String str2, String str3, String str4, String str5) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.a = i;
    }

    public o(View view) {
        s sVar;
        this.a = -1;
        this.b = view;
        PorterDuff.Mode mode = s.b;
        synchronized (s.class) {
            try {
                if (s.c == null) {
                    s.c();
                }
                sVar = s.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c = sVar;
    }
}
