package com.app.mlounge.ui.components;

import android.media.audiofx.Visualizer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Visualizer.OnDataCaptureListener {
    public final /* synthetic */ androidx.compose.runtime.snapshots.q a;

    public n(androidx.compose.runtime.snapshots.q qVar) {
        this.a = qVar;
    }

    @Override // android.media.audiofx.Visualizer.OnDataCaptureListener
    public final void onFftDataCapture(Visualizer visualizer, byte[] bArr, int i) {
        if (bArr != null) {
            int length = bArr.length / 2;
            double dLog10 = Math.log10(length);
            int i2 = 0;
            while (i2 < 48) {
                double d = 48;
                int i3 = length - 1;
                int iC = com.google.android.material.resources.c.c((int) Math.pow(10.0d, (((double) i2) * dLog10) / d), 0, i3);
                int i4 = i2 + 1;
                int iC2 = com.google.android.material.resources.c.c((int) Math.pow(10.0d, (((double) i4) * dLog10) / d), 0, i3);
                int i5 = 0;
                float fSqrt = 0.0f;
                if (iC <= iC2) {
                    while (true) {
                        int i6 = iC * 2;
                        byte b = bArr[i6];
                        byte b2 = bArr[i6 + 1];
                        fSqrt += (float) Math.sqrt((b2 * b2) + (b * b));
                        i5++;
                        if (iC == iC2) {
                            break;
                        } else {
                            iC++;
                        }
                    }
                }
                float fB = com.google.android.material.resources.c.b(((((i2 / 48) * 2.0f) + 1.0f) * (i5 > 0 ? fSqrt / i5 : 0.0f)) / 128.0f, 0.0f, 1.0f);
                androidx.compose.runtime.snapshots.q qVar = this.a;
                float fFloatValue = ((Number) qVar.get(i2)).floatValue();
                if (fB >= fFloatValue) {
                    qVar.set(i2, Float.valueOf(fB));
                } else {
                    qVar.set(i2, Float.valueOf(fFloatValue * 0.85f));
                }
                i2 = i4;
            }
        }
    }

    @Override // android.media.audiofx.Visualizer.OnDataCaptureListener
    public final void onWaveFormDataCapture(Visualizer visualizer, byte[] bArr, int i) {
    }
}
