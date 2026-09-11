package com.google.android.material.timepicker;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.app.mlounge.R;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends androidx.core.view.b {
    public final /* synthetic */ ClockFaceView A;

    public c(ClockFaceView clockFaceView) {
        this.A = clockFaceView;
    }

    @Override // androidx.core.view.b
    public final void d(View view, androidx.core.view.accessibility.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
        this.e.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.A.W.get(iIntValue - 1));
        }
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, iIntValue, 1, false, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        dVar.b(androidx.core.view.accessibility.b.e);
    }

    @Override // androidx.core.view.b
    public final boolean g(View view, int i, Bundle bundle) {
        ClockFaceView clockFaceView = this.A;
        ClockHandView clockHandView = clockFaceView.S;
        Rect rect = clockFaceView.T;
        if (i != 16) {
            return super.g(view, i, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        view.getHitRect(rect);
        float fCenterX = rect.centerX();
        float fCenterY = rect.centerY();
        clockHandView.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockHandView.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
