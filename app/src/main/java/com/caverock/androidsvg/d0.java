package com.caverock.androidsvg;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements Cloneable {
    public final float e;
    public final int y;

    public d0(float f) {
        this.e = f;
        this.y = 1;
    }

    public final float a(y1 y1Var) {
        float fSqrt;
        if (this.y != 9) {
            return d(y1Var);
        }
        w1 w1Var = (w1) y1Var.c;
        androidx.compose.ui.geometry.a aVar = w1Var.g;
        if (aVar == null) {
            aVar = w1Var.f;
        }
        float f = this.e;
        if (aVar == null) {
            return f;
        }
        float f2 = aVar.d;
        float f3 = aVar.e;
        if (f2 == f3) {
            fSqrt = f * f2;
        } else {
            fSqrt = f * ((float) (Math.sqrt((f3 * f3) + (f2 * f2)) / 1.414213562373095d));
        }
        return fSqrt / 100.0f;
    }

    public final float b(y1 y1Var, float f) {
        return this.y == 9 ? (this.e * f) / 100.0f : d(y1Var);
    }

    public final float c() {
        float f;
        float f2;
        int iE = androidx.constraintlayout.core.g.e(this.y);
        float f3 = this.e;
        if (iE == 0) {
            return f3;
        }
        if (iE == 3) {
            return f3 * 96.0f;
        }
        if (iE == 4) {
            f = f3 * 96.0f;
            f2 = 2.54f;
        } else if (iE == 5) {
            f = f3 * 96.0f;
            f2 = 25.4f;
        } else if (iE == 6) {
            f = f3 * 96.0f;
            f2 = 72.0f;
        } else {
            if (iE != 7) {
                return f3;
            }
            f = f3 * 96.0f;
            f2 = 6.0f;
        }
        return f / f2;
    }

    public final float d(y1 y1Var) {
        float textSize;
        int iE = androidx.constraintlayout.core.g.e(this.y);
        float f = this.e;
        switch (iE) {
            case 1:
                textSize = ((w1) y1Var.c).d.getTextSize();
                break;
            case 2:
                textSize = ((w1) y1Var.c).d.getTextSize() / 2.0f;
                break;
            case 3:
                y1Var.getClass();
                return f * 96.0f;
            case 4:
                y1Var.getClass();
                return (f * 96.0f) / 2.54f;
            case 5:
                y1Var.getClass();
                return (f * 96.0f) / 25.4f;
            case 6:
                y1Var.getClass();
                return (f * 96.0f) / 72.0f;
            case 7:
                y1Var.getClass();
                return (f * 96.0f) / 6.0f;
            case 8:
                w1 w1Var = (w1) y1Var.c;
                androidx.compose.ui.geometry.a aVar = w1Var.g;
                if (aVar == null) {
                    aVar = w1Var.f;
                }
                if (aVar != null) {
                    return (f * aVar.d) / 100.0f;
                }
            default:
                return f;
        }
        return textSize * f;
    }

    public final float e(y1 y1Var) {
        if (this.y != 9) {
            return d(y1Var);
        }
        w1 w1Var = (w1) y1Var.c;
        androidx.compose.ui.geometry.a aVar = w1Var.g;
        if (aVar == null) {
            aVar = w1Var.f;
        }
        float f = this.e;
        return aVar == null ? f : (f * aVar.e) / 100.0f;
    }

    public final boolean f() {
        return this.e < 0.0f;
    }

    public final boolean g() {
        return this.e == 0.0f;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.e));
        switch (this.y) {
            case 1:
                str = "px";
                break;
            case 2:
                str = "em";
                break;
            case 3:
                str = "ex";
                break;
            case 4:
                str = "in";
                break;
            case 5:
                str = "cm";
                break;
            case 6:
                str = "mm";
                break;
            case 7:
                str = "pt";
                break;
            case 8:
                str = "pc";
                break;
            case 9:
                str = "percent";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        return sb.toString();
    }

    public d0(int i, float f) {
        this.e = f;
        this.y = i;
    }
}
