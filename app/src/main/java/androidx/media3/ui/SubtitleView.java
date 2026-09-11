package androidx.media3.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {
    public float A;
    public float B;
    public boolean C;
    public boolean D;
    public int E;
    public n0 F;
    public View G;
    public List e;
    public e y;
    public int z;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = Collections.EMPTY_LIST;
        this.y = e.g;
        this.z = 0;
        this.A = 0.0533f;
        this.B = 0.08f;
        this.C = true;
        this.D = true;
        d dVar = new d(context, 0);
        this.F = dVar;
        this.G = dVar;
        addView(dVar);
        this.E = 1;
    }

    private List<androidx.media3.common.text.b> getCuesWithStylingPreferencesApplied() {
        if (this.C && this.D) {
            return this.e;
        }
        ArrayList arrayList = new ArrayList(this.e.size());
        for (int i = 0; i < this.e.size(); i++) {
            androidx.media3.common.text.a aVarA = ((androidx.media3.common.text.b) this.e.get(i)).a();
            if (!this.C) {
                aVarA.n = false;
                CharSequence charSequence = aVarA.a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        aVarA.a = SpannableString.valueOf(charSequence);
                        aVarA.b = null;
                    }
                    CharSequence charSequence2 = aVarA.a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof androidx.media3.common.text.f)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                _COROUTINE.a.G(aVarA);
            } else if (!this.D) {
                _COROUTINE.a.G(aVarA);
            }
            arrayList.add(aVarA.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private e getUserCaptionStyle() {
        boolean zIsInEditMode = isInEditMode();
        e eVar = e.g;
        if (zIsInEditMode) {
            return eVar;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager != null && captioningManager.isEnabled()) {
            CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
            eVar = new e(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        }
        return eVar;
    }

    private <T extends View & n0> void setView(T t) {
        removeView(this.G);
        View view = this.G;
        if (view instanceof t0) {
            ((t0) view).y.destroy();
        }
        this.G = t;
        this.F = t;
        addView(t);
    }

    public final void a() {
        setStyle(getUserCaptionStyle());
    }

    public final void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.F.a(getCuesWithStylingPreferencesApplied(), this.y, this.A, this.z, this.B);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.D = z;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.C = z;
        c();
    }

    public void setBottomPaddingFraction(float f) {
        this.B = f;
        c();
    }

    public void setCues(List<androidx.media3.common.text.b> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.e = list;
        c();
    }

    public void setFractionalTextSize(float f) {
        this.z = 0;
        this.A = f;
        c();
    }

    public void setStyle(e eVar) {
        this.y = eVar;
        c();
    }

    public void setViewType(int i) {
        if (this.E == i) {
            return;
        }
        if (i == 1) {
            setView(new d(getContext(), 0));
        } else {
            if (i != 2) {
                net.luminis.tls.engine.impl.c.a();
                return;
            }
            setView(new t0(getContext()));
        }
        this.E = i;
    }
}
