package androidx.media3.exoplayer.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import androidx.compose.foundation.lazy.layout.b1;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements SensorEventListener {
    public final float[] a = new float[16];
    public final float[] b = new float[16];
    public final float[] c = new float[16];
    public final float[] d = new float[3];
    public final Display e;
    public final c[] f;
    public boolean g;

    public d(Display display, c... cVarArr) {
        this.e = display;
        this.f = cVarArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.a;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.e.getRotation();
        float[] fArr3 = this.b;
        if (rotation != 0) {
            int i2 = Token.DEFAULT;
            if (rotation != 1) {
                i = 130;
                if (rotation != 2) {
                    if (rotation != 3) {
                        org.mozilla.javascript.c.a();
                        return;
                    } else {
                        i2 = 130;
                        i = 1;
                    }
                }
            } else {
                i = 129;
                i2 = 2;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i2, i, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, Token.DO, fArr3);
        float[] fArr4 = this.d;
        SensorManager.getOrientation(fArr3, fArr4);
        float f = fArr4[2];
        Matrix.rotateM(fArr2, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        boolean z = this.g;
        float[] fArr5 = this.c;
        if (!z) {
            b1.e(fArr5, fArr2);
            this.g = true;
        }
        System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr5, 0);
        for (int i3 = 0; i3 < 2; i3++) {
            this.f[i3].a(fArr2, f);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
