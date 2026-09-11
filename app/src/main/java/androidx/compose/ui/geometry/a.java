package androidx.compose.ui.geometry;

import androidx.datastore.preferences.protobuf.h1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final /* synthetic */ int a;
    public float b;
    public float c;
    public float d;
    public float e;

    public a(a aVar) {
        this.a = 1;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
    }

    public void a(float f, float f2, float f3, float f4) {
        this.b = Math.max(f, this.b);
        this.c = Math.max(f2, this.c);
        this.d = Math.min(f3, this.d);
        this.e = Math.min(f4, this.e);
    }

    public boolean b() {
        return (this.b >= this.d) | (this.c >= this.e);
    }

    public float c() {
        return this.b + this.d;
    }

    public float d() {
        return this.c + this.e;
    }

    public void e(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        this.b += fIntBitsToFloat;
        this.c += fIntBitsToFloat2;
        this.d += fIntBitsToFloat;
        this.e += fIntBitsToFloat2;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "MutableRect(" + h1.A(this.b) + ", " + h1.A(this.c) + ", " + h1.A(this.d) + ", " + h1.A(this.e) + ')';
            default:
                return "[" + this.b + " " + this.c + " " + this.d + " " + this.e + "]";
        }
    }

    public a(float f, float f2, float f3, float f4) {
        this.a = 1;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public a() {
        this.a = 0;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
    }
}
