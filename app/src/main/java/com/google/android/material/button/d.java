package com.google.android.material.button;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.semantics.y;
import com.app.mlounge.R;
import com.google.android.material.internal.j;
import com.google.android.material.shape.a0;
import com.google.android.material.shape.b0;
import com.google.android.material.shape.c0;
import com.google.android.material.shape.d0;
import com.google.android.material.shape.e0;
import com.google.android.material.shape.o;
import com.google.android.material.shape.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends LinearLayout {
    public final y A;
    public Integer[] B;
    public z C;
    public b0 D;
    public int E;
    public e0 F;
    public boolean G;
    public final ArrayList e;
    public final ArrayList y;
    public final androidx.media3.exoplayer.hls.c z;

    public d(Context context, AttributeSet attributeSet) {
        z zVarB;
        int next;
        e0 e0Var;
        int next2;
        super(com.google.android.material.theme.overlay.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.e = new ArrayList();
        this.y = new ArrayList();
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.z = new androidx.media3.exoplayer.hls.c(materialButtonToggleGroup);
        this.A = new y(materialButtonToggleGroup, 2);
        this.G = true;
        Context context2 = getContext();
        TypedArray typedArrayE = j.e(context2, attributeSet, com.google.android.material.a.j, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (typedArrayE.hasValue(2)) {
            int resourceId = typedArrayE.getResourceId(2, 0);
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    XmlResourceParser xml = context2.getResources().getXml(resourceId);
                    try {
                        e0Var = new e0();
                        e0Var.c = new int[10][];
                        e0Var.d = new c0[10];
                        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                        do {
                            next2 = xml.next();
                            if (next2 == 2) {
                                break;
                            }
                        } while (next2 != 1);
                        if (next2 != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml.getName().equals("selector")) {
                            e0Var.a(context2, xml, attributeSetAsAttributeSet, context2.getTheme());
                        }
                        xml.close();
                    } catch (Throwable th) {
                        if (xml == null) {
                            throw th;
                        }
                        try {
                            xml.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                    e0Var = null;
                }
            } else {
                e0Var = null;
            }
            this.F = e0Var;
        }
        if (typedArrayE.hasValue(4)) {
            b0 b0VarB = b0.b(context2, typedArrayE, 4);
            this.D = b0VarB;
            if (b0VarB == null) {
                a0 a0Var = new a0(o.a(context2, typedArrayE.getResourceId(4, 0), typedArrayE.getResourceId(5, 0), new com.google.android.material.shape.a(0)).a());
                this.D = a0Var.b != 0 ? new b0(a0Var) : null;
            }
        }
        if (typedArrayE.hasValue(3)) {
            com.google.android.material.shape.a aVar = new com.google.android.material.shape.a(0.0f);
            int resourceId2 = typedArrayE.getResourceId(3, 0);
            if (resourceId2 != 0 && context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                try {
                    XmlResourceParser xml2 = context2.getResources().getXml(resourceId2);
                    try {
                        zVarB = new z();
                        AttributeSet attributeSetAsAttributeSet2 = Xml.asAttributeSet(xml2);
                        do {
                            next = xml2.next();
                            if (next == 2) {
                                break;
                            }
                        } while (next != 1);
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml2.getName().equals("selector")) {
                            zVarB.d(context2, xml2, attributeSetAsAttributeSet2, context2.getTheme());
                        }
                        xml2.close();
                    } catch (Throwable th3) {
                        if (xml2 == null) {
                            throw th3;
                        }
                        try {
                            xml2.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    zVarB = z.b(aVar);
                }
            } else {
                zVarB = z.b(o.c(typedArrayE, 3, aVar));
            }
            this.C = zVarB;
        }
        this.E = typedArrayE.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayE.getBoolean(0, true));
        typedArrayE.recycle();
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    public final void a() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            MaterialButton materialButton2 = (MaterialButton) getChildAt(i - 1);
            if (this.E <= 0) {
                iMin = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                materialButton.setShouldDrawSurfaceColorStroke(true);
                materialButton2.setShouldDrawSurfaceColorStroke(true);
            } else {
                materialButton.setShouldDrawSurfaceColorStroke(false);
                materialButton2.setShouldDrawSurfaceColorStroke(false);
                iMin = 0;
            }
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(this.E - iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = this.E - iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        d();
        this.G = true;
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.z);
        this.e.add(materialButton.getShapeAppearanceModel());
        this.y.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        float fMax;
        if (this.F == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int iMin = Integer.MAX_VALUE;
        for (int i = firstVisibleChildIndex; i <= lastVisibleChildIndex; i++) {
            if (c(i)) {
                int iMin2 = 0;
                if (c(i) && this.F != null) {
                    MaterialButton materialButton3 = (MaterialButton) getChildAt(i);
                    e0 e0Var = this.F;
                    int width = materialButton3.getWidth();
                    int i2 = -width;
                    for (int i3 = 0; i3 < e0Var.a; i3++) {
                        d0 d0Var = (d0) e0Var.d[i3].e;
                        int i4 = d0Var.a;
                        float f = d0Var.b;
                        if (i4 == 2) {
                            fMax = Math.max(i2, f);
                        } else {
                            if (i4 == 1) {
                                fMax = Math.max(i2, width * f);
                            }
                        }
                        i2 = (int) fMax;
                    }
                    int iMax = Math.max(0, i2);
                    int i5 = i - 1;
                    while (true) {
                        materialButton = null;
                        if (i5 < 0) {
                            materialButton2 = null;
                            break;
                        } else {
                            if (c(i5)) {
                                materialButton2 = (MaterialButton) getChildAt(i5);
                                break;
                            }
                            i5--;
                        }
                    }
                    int allowedWidthDecrease = materialButton2 == null ? 0 : materialButton2.getAllowedWidthDecrease();
                    int childCount = getChildCount();
                    for (int i6 = i + 1; i6 < childCount; i6++) {
                        if (c(i6)) {
                            materialButton = (MaterialButton) getChildAt(i6);
                            break;
                        }
                    }
                    iMin2 = Math.min(iMax, allowedWidthDecrease + (materialButton != null ? materialButton.getAllowedWidthDecrease() : 0));
                }
                if (i != firstVisibleChildIndex && i != lastVisibleChildIndex) {
                    iMin2 /= 2;
                }
                iMin = Math.min(iMin, iMin2);
            }
        }
        int i7 = firstVisibleChildIndex;
        while (i7 <= lastVisibleChildIndex) {
            if (c(i7)) {
                ((MaterialButton) getChildAt(i7)).setSizeChange(this.F);
                ((MaterialButton) getChildAt(i7)).setWidthChangeMax((i7 == firstVisibleChildIndex || i7 == lastVisibleChildIndex) ? iMin : iMin * 2);
            }
            i7++;
        }
    }

    public final boolean c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void d() {
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            LinearLayout.LayoutParams layoutParams = materialButton.S;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.S = null;
                materialButton.P = -1.0f;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.A);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.B = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [int[][], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.google.android.material.shape.o[], java.io.Serializable] */
    public final void e() {
        a0 a0Var;
        int i;
        if (!(this.C == null && this.D == null) && this.G) {
            this.G = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i2 = 0;
            while (i2 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i2);
                if (materialButton.getVisibility() != 8) {
                    boolean z = i2 == firstVisibleChildIndex;
                    boolean z2 = i2 == lastVisibleChildIndex;
                    b0 b0Var = this.D;
                    if (b0Var == null || (!z && !z2)) {
                        b0Var = (b0) this.y.get(i2);
                    }
                    if (b0Var == null) {
                        a0Var = new a0((o) this.e.get(i2));
                    } else {
                        a0 a0Var2 = new a0(0);
                        int i3 = b0Var.a;
                        a0Var2.b = i3;
                        a0Var2.c = b0Var.b;
                        int[][] iArr = b0Var.c;
                        ?? r14 = new int[iArr.length][];
                        a0Var2.d = r14;
                        o[] oVarArr = b0Var.d;
                        a0Var2.e = new o[oVarArr.length];
                        System.arraycopy(iArr, 0, r14, 0, i3);
                        System.arraycopy(oVarArr, 0, (o[]) a0Var2.e, 0, a0Var2.b);
                        a0Var2.f = b0Var.e;
                        a0Var2.g = b0Var.f;
                        a0Var2.h = b0Var.g;
                        a0Var2.i = b0Var.h;
                        a0Var = a0Var2;
                    }
                    boolean z3 = getOrientation() == 0;
                    boolean z4 = getLayoutDirection() == 1;
                    if (z3) {
                        i = z ? 5 : 0;
                        if (z2) {
                            i |= 10;
                        }
                        if (z4) {
                            i = ((i & 10) >> 1) | ((i & 5) << 1);
                        }
                    } else {
                        i = z ? 3 : 0;
                        if (z2) {
                            i |= 12;
                        }
                    }
                    int i4 = ~i;
                    z zVar = this.C;
                    if ((i4 | 1) == i4) {
                        a0Var.f = zVar;
                    }
                    if ((i4 | 2) == i4) {
                        a0Var.g = zVar;
                    }
                    if ((i4 | 4) == i4) {
                        a0Var.h = zVar;
                    }
                    if ((i4 | 8) == i4) {
                        a0Var.i = zVar;
                    }
                    b0 b0Var2 = a0Var.b == 0 ? null : new b0(a0Var);
                    if (b0Var2.d()) {
                        materialButton.setStateListShapeAppearanceModel(b0Var2);
                    } else {
                        materialButton.setShapeAppearanceModel(b0Var2.c());
                    }
                }
                i2++;
            }
        }
    }

    public e0 getButtonSizeChange() {
        return this.F;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.B;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i2;
    }

    public com.google.android.material.shape.d getInnerCornerSize() {
        return this.C.b;
    }

    public z getInnerCornerSizeStateList() {
        return this.C;
    }

    public o getShapeAppearance() {
        b0 b0Var = this.D;
        if (b0Var == null) {
            return null;
        }
        return b0Var.c();
    }

    public int getSpacing() {
        return this.E;
    }

    public b0 getStateListShapeAppearance() {
        return this.D;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            d();
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        e();
        a();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.e.remove(iIndexOfChild);
            this.y.remove(iIndexOfChild);
        }
        this.G = true;
        e();
        d();
        a();
    }

    public void setButtonSizeChange(e0 e0Var) {
        if (this.F != e0Var) {
            this.F = e0Var;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z);
        }
    }

    public void setInnerCornerSize(com.google.android.material.shape.d dVar) {
        this.C = z.b(dVar);
        this.G = true;
        e();
        invalidate();
    }

    public void setInnerCornerSizeStateList(z zVar) {
        this.C = zVar;
        this.G = true;
        e();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.G = true;
        }
        super.setOrientation(i);
    }

    public void setShapeAppearance(o oVar) {
        a0 a0Var = new a0(oVar);
        this.D = a0Var.b == 0 ? null : new b0(a0Var);
        this.G = true;
        e();
        invalidate();
    }

    public void setSpacing(int i) {
        this.E = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(b0 b0Var) {
        this.D = b0Var;
        this.G = true;
        e();
        invalidate();
    }
}
