package androidx.media3.extractor.text.webvtt;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public CharSequence c;
    public long a = 0;
    public long b = 0;
    public int d = 2;
    public float e = -3.4028235E38f;
    public int f = 1;
    public int g = 0;
    public float h = -3.4028235E38f;
    public int i = Integer.MIN_VALUE;
    public float j = 1.0f;
    public int k = Integer.MIN_VALUE;

    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    public final androidx.media3.common.text.a a() {
        Layout.Alignment alignment;
        float f = this.h;
        float f2 = -3.4028235E38f;
        if (f == -3.4028235E38f) {
            int i = this.d;
            if (i != 4) {
                f = i != 5 ? 0.5f : 1.0f;
            } else {
                f = 0.0f;
            }
        }
        int i2 = this.i;
        if (i2 == Integer.MIN_VALUE) {
            int i3 = this.d;
            if (i3 == 1) {
                i2 = 0;
            } else if (i3 == 3) {
                i2 = 2;
            } else if (i3 == 4) {
                i2 = 0;
            } else if (i3 != 5) {
                i2 = 1;
            } else {
                i2 = 2;
            }
        }
        androidx.media3.common.text.a aVar = new androidx.media3.common.text.a();
        int i4 = this.d;
        if (i4 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i4 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i4 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i4 == 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i4 != 5) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.w("Unknown textAlignment: ", i4, "WebvttCueParser");
            alignment = null;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        aVar.c = alignment;
        float f3 = this.e;
        int i5 = this.f;
        if (f3 != -3.4028235E38f && i5 == 0 && (f3 < 0.0f || f3 > 1.0f)) {
            f2 = 1.0f;
        } else if (f3 != -3.4028235E38f) {
            f2 = f3;
        } else if (i5 == 0) {
            f2 = 1.0f;
        }
        aVar.e = f2;
        aVar.f = i5;
        aVar.g = this.g;
        aVar.h = f;
        aVar.i = i2;
        float f4 = this.j;
        if (i2 == 0) {
            f = 1.0f - f;
        } else if (i2 == 1) {
            f = f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
        } else if (i2 != 2) {
            net.luminis.tls.engine.impl.c.r(String.valueOf(i2));
            return null;
        }
        aVar.l = Math.min(f4, f);
        aVar.p = this.k;
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            aVar.a = charSequence;
            aVar.b = null;
        }
        return aVar;
    }
}
