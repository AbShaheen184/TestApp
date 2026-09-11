package com.caverock.androidsvg;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 {
    public final float a;
    public final float b;
    public float c;
    public float d;
    public boolean e = false;

    public r1(float f, float f2, float f3, float f4) {
        this.c = 0.0f;
        this.d = 0.0f;
        this.a = f;
        this.b = f2;
        double dSqrt = Math.sqrt((f4 * f4) + (f3 * f3));
        if (dSqrt != 0.0d) {
            this.c = (float) (((double) f3) / dSqrt);
            this.d = (float) (((double) f4) / dSqrt);
        }
    }

    public final void a(float f, float f2) {
        float f3 = f - this.a;
        float f4 = f2 - this.b;
        double dSqrt = Math.sqrt((f4 * f4) + (f3 * f3));
        if (dSqrt != 0.0d) {
            f3 = (float) (((double) f3) / dSqrt);
            f4 = (float) (((double) f4) / dSqrt);
        }
        float f5 = this.c;
        if (f3 != (-f5) || f4 != (-this.d)) {
            this.c = f5 + f3;
            this.d += f4;
        } else {
            this.e = true;
            this.c = -f4;
            this.d = f3;
        }
    }

    public final void b(r1 r1Var) {
        float f = r1Var.c;
        float f2 = this.c;
        if (f == (-f2)) {
            float f3 = r1Var.d;
            if (f3 == (-this.d)) {
                this.e = true;
                this.c = -f3;
                this.d = r1Var.c;
                return;
            }
        }
        this.c = f2 + f;
        this.d += r1Var.d;
    }

    public final String toString() {
        return "(" + this.a + "," + this.b + " " + this.c + "," + this.d + ")";
    }
}
