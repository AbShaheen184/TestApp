package androidx.compose.ui.graphics.vector;

import com.app.mlounge.emulator.LibretroCore;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final List i;
    public final ArrayList j;

    public d(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, int i) {
        str = (i & 1) != 0 ? "" : str;
        f = (i & 2) != 0 ? 0.0f : f;
        f2 = (i & 4) != 0 ? 0.0f : f2;
        f3 = (i & 8) != 0 ? 0.0f : f3;
        f4 = (i & 16) != 0 ? 1.0f : f4;
        f5 = (i & 32) != 0 ? 1.0f : f5;
        f6 = (i & 64) != 0 ? 0.0f : f6;
        f7 = (i & 128) != 0 ? 0.0f : f7;
        if ((i & LibretroCore.SCREEN_WIDTH) != 0) {
            int i2 = h0.a;
            list = kotlin.collections.u.e;
        }
        ArrayList arrayList = new ArrayList();
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = list;
        this.j = arrayList;
    }
}
