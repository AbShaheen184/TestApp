package androidx.media3.exoplayer.video.spherical;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import androidx.media3.exoplayer.video.u;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends GLSurfaceView {
    public final d A;
    public final Handler B;
    public final i C;
    public SurfaceTexture D;
    public Surface E;
    public boolean F;
    public boolean G;
    public boolean H;
    public final CopyOnWriteArrayList e;
    public final SensorManager y;
    public final Sensor z;

    public k(Context context) {
        super(context, null);
        this.e = new CopyOnWriteArrayList();
        this.B = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.y = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.z = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.C = iVar;
        j jVar = new j(this, iVar);
        View.OnTouchListener lVar = new l(context, jVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.A = new d(windowManager.getDefaultDisplay(), lVar, jVar);
        this.F = true;
        setEGLContextClientVersion(2);
        setRenderer(jVar);
        setOnTouchListener(lVar);
    }

    public final void a() {
        boolean z = this.F && this.G;
        Sensor sensor = this.z;
        if (sensor == null || z == this.H) {
            return;
        }
        d dVar = this.A;
        SensorManager sensorManager = this.y;
        if (z) {
            sensorManager.registerListener(dVar, sensor, 0);
        } else {
            sensorManager.unregisterListener(dVar);
        }
        this.H = z;
    }

    public a getCameraMotionListener() {
        return this.C;
    }

    public u getVideoFrameMetadataListener() {
        return this.C;
    }

    public Surface getVideoSurface() {
        return this.E;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B.post(new androidx.activity.l(this, 26));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.G = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.G = true;
        a();
    }

    public void setDefaultStereoMode(int i) {
        this.C.H = i;
    }

    public void setUseSensorRotation(boolean z) {
        this.F = z;
        a();
    }
}
