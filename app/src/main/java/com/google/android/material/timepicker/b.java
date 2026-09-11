package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView e;

    public b(ClockFaceView clockFaceView) {
        this.e = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.e;
        ClockHandView clockHandView = clockFaceView.S;
        if (clockFaceView.isShown()) {
            clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
            int height = ((clockFaceView.getHeight() / 2) - clockHandView.A) - clockFaceView.d0;
            if (height != clockFaceView.Q) {
                clockFaceView.Q = height;
                clockFaceView.m();
                clockHandView.I = clockFaceView.Q;
                clockHandView.invalidate();
            }
        }
        return true;
    }
}
