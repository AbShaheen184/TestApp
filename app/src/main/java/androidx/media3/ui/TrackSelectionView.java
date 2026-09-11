package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.e2;
import androidx.media3.common.b1;
import androidx.media3.common.w0;
import androidx.media3.common.x0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {
    public final CheckedTextView A;
    public final e2 B;
    public final ArrayList C;
    public final HashMap D;
    public boolean E;
    public boolean F;
    public p0 G;
    public CheckedTextView[][] H;
    public boolean I;
    public final int e;
    public final LayoutInflater y;
    public final CheckedTextView z;

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.e = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.y = layoutInflaterFrom;
        e2 e2Var = new e2(this, 1);
        this.B = e2Var;
        this.G = new androidx.media3.exoplayer.hls.c(getResources());
        this.C = new ArrayList();
        this.D = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.z = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(com.app.mlounge.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(e2Var);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(com.app.mlounge.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.A = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(com.app.mlounge.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(e2Var);
        addView(checkedTextView2);
    }

    public final void a() {
        this.z.setChecked(this.I);
        boolean z = this.I;
        HashMap map = this.D;
        this.A.setChecked(!z && map.isEmpty());
        for (int i = 0; i < this.H.length; i++) {
            x0 x0Var = (x0) map.get(((b1) this.C.get(i)).b);
            int i2 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.H[i];
                if (i2 < checkedTextViewArr.length) {
                    if (x0Var != null) {
                        Object tag = checkedTextViewArr[i2].getTag();
                        tag.getClass();
                        this.H[i][i2].setChecked(x0Var.b.contains(Integer.valueOf(((q0) tag).b)));
                    } else {
                        checkedTextViewArr[i2].setChecked(false);
                    }
                    i2++;
                }
            }
        }
    }

    public final void b() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.C;
        boolean zIsEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.A;
        CheckedTextView checkedTextView2 = this.z;
        if (zIsEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.H = new CheckedTextView[arrayList.size()][];
        boolean z = this.F && arrayList.size() > 1;
        for (int i = 0; i < arrayList.size(); i++) {
            b1 b1Var = (b1) arrayList.get(i);
            boolean z2 = this.E && b1Var.c;
            CheckedTextView[][] checkedTextViewArr = this.H;
            int i2 = b1Var.a;
            checkedTextViewArr[i] = new CheckedTextView[i2];
            q0[] q0VarArr = new q0[i2];
            for (int i3 = 0; i3 < b1Var.a; i3++) {
                q0VarArr[i3] = new q0(b1Var, i3);
            }
            for (int i4 = 0; i4 < i2; i4++) {
                LayoutInflater layoutInflater = this.y;
                if (i4 == 0) {
                    addView(layoutInflater.inflate(com.app.mlounge.R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate((z2 || z) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.e);
                p0 p0Var = this.G;
                q0 q0Var = q0VarArr[i4];
                checkedTextView3.setText(((androidx.media3.exoplayer.hls.c) p0Var).v(q0Var.a.a(q0Var.b)));
                checkedTextView3.setTag(q0VarArr[i4]);
                if (b1Var.b(i4)) {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.B);
                } else {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                }
                this.H[i][i4] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        a();
    }

    public boolean getIsDisabled() {
        return this.I;
    }

    public Map<w0, x0> getOverrides() {
        return this.D;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.E != z) {
            this.E = z;
            b();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.F != z) {
            this.F = z;
            if (!z) {
                HashMap map = this.D;
                if (map.size() > 1) {
                    HashMap map2 = new HashMap();
                    int i = 0;
                    while (true) {
                        ArrayList arrayList = this.C;
                        if (i >= arrayList.size()) {
                            break;
                        }
                        x0 x0Var = (x0) map.get(((b1) arrayList.get(i)).b);
                        if (x0Var != null && map2.isEmpty()) {
                            map2.put(x0Var.a, x0Var);
                        }
                        i++;
                    }
                    map.clear();
                    map.putAll(map2);
                }
            }
            b();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.z.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(p0 p0Var) {
        p0Var.getClass();
        this.G = p0Var;
        b();
    }
}
