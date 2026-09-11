package com.google.gson;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends n {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i) {
        this.a = i;
    }

    @Override // com.google.gson.n
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        switch (this.a) {
            case 0:
                if (aVar.n0() != 9) {
                    return Double.valueOf(aVar.e0());
                }
                aVar.j0();
                return null;
            case 1:
                if (aVar.n0() != 9) {
                    return Float.valueOf((float) aVar.e0());
                }
                aVar.j0();
                return null;
            default:
                aVar.t0();
                return null;
        }
    }

    @Override // com.google.gson.n
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        switch (this.a) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    f.a(dDoubleValue);
                    bVar.d0(dDoubleValue);
                } else {
                    bVar.Y();
                }
                break;
            case 1:
                Number numberValueOf = (Number) obj;
                if (numberValueOf != null) {
                    float fFloatValue = numberValueOf.floatValue();
                    f.a(fFloatValue);
                    if (!(numberValueOf instanceof Float)) {
                        numberValueOf = Float.valueOf(fFloatValue);
                    }
                    bVar.g0(numberValueOf);
                } else {
                    bVar.Y();
                }
                break;
            default:
                bVar.Y();
                break;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }
}
