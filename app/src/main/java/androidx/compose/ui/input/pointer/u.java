package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    public static final a a = new a(1000);
    public static final a b;
    public static final StackTraceElement[] c;

    static {
        new a(1007);
        b = new a(1008);
        new a(1002);
        c = new StackTraceElement[0];
    }

    public static final boolean a(v vVar) {
        return (vVar.b() || vVar.h || !vVar.d) ? false : true;
    }

    public static final boolean b(v vVar) {
        return !vVar.h && vVar.d;
    }

    public static final boolean c(v vVar) {
        return (vVar.b() || !vVar.h || vVar.d) ? false : true;
    }

    public static final boolean d(v vVar) {
        return vVar.h && !vVar.d;
    }

    public static final boolean e(long j, long j2) {
        return j == j2;
    }

    public static final boolean f(v vVar, long j, long j2) {
        int i = vVar.i == 1 ? 1 : 0;
        long j3 = vVar.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = i;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (fIntBitsToFloat > f2) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4);
    }

    public static final long g(v vVar, boolean z) {
        long jD = androidx.compose.ui.geometry.b.d(vVar.c, vVar.g);
        if (z || !vVar.b()) {
            return jD;
        }
        return 0L;
    }

    public static final void h(m mVar, long j, kotlin.jvm.functions.l lVar, boolean z) {
        MotionEvent motionEventA = mVar.a();
        if (motionEventA == null) {
            net.luminis.tls.engine.impl.c.o("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = motionEventA.getAction();
        if (z) {
            motionEventA.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        motionEventA.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        lVar.invoke(motionEventA);
        motionEventA.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        motionEventA.setAction(action);
    }

    public static String i(long j) {
        return "PointerId(value=" + j + ')';
    }
}
