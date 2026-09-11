package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.compose.animation.b1;
import androidx.media3.container.f;
import androidx.media3.ui.i;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.d0;
import androidx.recyclerview.widget.i0;
import androidx.recyclerview.widget.l0;
import com.app.mlounge.R;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends c0 {
    public final b1 o;
    public f p;
    public final View.OnLayoutChangeListener q;

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new a();
        this.q = new i(this, 2);
        this.o = new b1();
        m0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.a.b);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            m0();
            B0(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final boolean A0() {
        return z0() && B() == 1;
    }

    public final void B0(int i) {
        b bVar;
        if (i != 0 && i != 1) {
            net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "invalid orientation:"));
            return;
        }
        b(null);
        f fVar = this.p;
        if (fVar == null || i != fVar.y) {
            if (i == 0) {
                bVar = new b(this, 1);
            } else {
                if (i != 1) {
                    net.luminis.tls.engine.impl.c.o("invalid orientation");
                    return;
                }
                bVar = new b(this, 0);
            }
            this.p = bVar;
            m0();
        }
    }

    @Override // androidx.recyclerview.widget.c0
    public final boolean K() {
        return true;
    }

    @Override // androidx.recyclerview.widget.c0
    public final void Q(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        b1 b1Var = this.o;
        float dimension = b1Var.a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        b1Var.a = dimension;
        float dimension2 = b1Var.b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        b1Var.b = dimension2;
        m0();
        recyclerView.addOnLayoutChangeListener(this.q);
    }

    @Override // androidx.recyclerview.widget.c0
    public final void R(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.q);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    @Override // androidx.recyclerview.widget.c0
    public final View S(View view, int i, i0 i0Var, l0 l0Var) {
        byte b;
        if (u() == 0) {
            return null;
        }
        int i2 = this.p.y;
        if (i == 1) {
            b = -1;
        } else if (i == 2) {
            b = 1;
        } else if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        Log.d("CarouselLayoutManager", "Unknown focus request:" + i);
                    } else if (i2 == 1) {
                        b = 1;
                    }
                    b = -2147483648;
                } else if (i2 != 0) {
                    b = -2147483648;
                } else if (A0()) {
                    b = -1;
                } else {
                    b = 1;
                }
            } else if (i2 == 1) {
                b = -1;
            } else {
                b = -2147483648;
            }
        } else if (i2 != 0) {
            b = -2147483648;
        } else if (A0()) {
            b = 1;
        } else {
            b = -1;
        }
        if (b == -2147483648) {
            return null;
        }
        if (b == -1) {
            if (c0.G(view) == 0) {
                return null;
            }
            int iG = c0.G(t(0)) - 1;
            if (iG < 0 || iG >= A()) {
                return t(A0() ? u() - 1 : 0);
            }
            this.p.m();
            throw null;
        }
        if (c0.G(view) == A() - 1) {
            return null;
        }
        int iG2 = c0.G(t(u() - 1)) + 1;
        if (iG2 < 0 || iG2 >= A()) {
            return t(A0() ? 0 : u() - 1);
        }
        this.p.m();
        throw null;
    }

    @Override // androidx.recyclerview.widget.c0
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (u() > 0) {
            accessibilityEvent.setFromIndex(c0.G(t(0)));
            accessibilityEvent.setToIndex(c0.G(t(u() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.c0
    public final void X(int i, int i2) {
        A();
    }

    @Override // androidx.recyclerview.widget.c0
    public final void Y() {
        A();
    }

    @Override // androidx.recyclerview.widget.c0
    public final void a0(int i, int i2) {
        A();
    }

    @Override // androidx.recyclerview.widget.c0
    public final boolean c() {
        return z0();
    }

    @Override // androidx.recyclerview.widget.c0
    public final void c0(i0 i0Var, l0 l0Var) {
        if (l0Var.b() > 0) {
            if ((z0() ? this.m : this.n) > 0.0f) {
                A0();
                i0Var.d(0);
                net.luminis.tls.engine.impl.c.r("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
                return;
            }
        }
        h0(i0Var);
    }

    @Override // androidx.recyclerview.widget.c0
    public final boolean d() {
        return !z0();
    }

    @Override // androidx.recyclerview.widget.c0
    public final void d0(l0 l0Var) {
        if (u() == 0) {
            return;
        }
        c0.G(t(0));
    }

    @Override // androidx.recyclerview.widget.c0
    public final int i(l0 l0Var) {
        u();
        return 0;
    }

    @Override // androidx.recyclerview.widget.c0
    public final int j(l0 l0Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.c0
    public final int k(l0 l0Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.c0
    public final int l(l0 l0Var) {
        u();
        return 0;
    }

    @Override // androidx.recyclerview.widget.c0
    public final boolean l0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.c0
    public final int m(l0 l0Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.c0
    public final int n(l0 l0Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.c0
    public final int n0(int i, i0 i0Var, l0 l0Var) {
        if (!z0() || u() == 0 || i == 0) {
            return 0;
        }
        i0Var.d(0);
        net.luminis.tls.engine.impl.c.r("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // androidx.recyclerview.widget.c0
    public final int o0(int i, i0 i0Var, l0 l0Var) {
        if (!d() || u() == 0 || i == 0) {
            return 0;
        }
        i0Var.d(0);
        net.luminis.tls.engine.impl.c.r("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // androidx.recyclerview.widget.c0
    public final d0 q() {
        return new d0(-2, -2);
    }

    @Override // androidx.recyclerview.widget.c0
    public final void x(View view, Rect rect) {
        super.x(view, rect);
        rect.centerY();
        if (z0()) {
            rect.centerX();
        }
        throw null;
    }

    public final float y0(float f, float f2) {
        return A0() ? f - f2 : f + f2;
    }

    public final boolean z0() {
        return this.p.y == 0;
    }

    public CarouselLayoutManager() {
        b1 b1Var = new b1();
        new a();
        this.q = new i(this, 2);
        this.o = b1Var;
        m0();
        B0(0);
    }
}
