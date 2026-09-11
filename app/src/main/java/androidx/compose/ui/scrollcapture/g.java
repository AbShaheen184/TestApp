package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.text.android.l;
import androidx.datastore.preferences.protobuf.h1;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public int a;
    public float b;
    public final Object c;

    public g(l lVar) {
        this.c = lVar;
        this.a = -1;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public float a(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        l lVar = (l) this.c;
        int i2 = 1;
        if (z) {
            int iO = h1.o(lVar.f, i, z);
            int lineStart = lVar.f.getLineStart(iO);
            int iF = lVar.f(iO);
            if (i == lineStart || i == iF) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        int i3 = i * 4;
        if (!z3) {
            i2 = z4 ? 2 : 3;
        } else if (z4) {
            i2 = 0;
        }
        int i4 = i3 + i2;
        if (this.a == i4) {
            return this.b;
        }
        float fH = z3 ? lVar.h(i, z) : lVar.i(i, z);
        if (z2) {
            this.a = i4;
            this.b = fH;
        }
        return fH;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(float f, kotlin.coroutines.jvm.internal.c cVar) {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i = fVar.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.z = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objInvoke = fVar.e;
        int i2 = fVar.z;
        if (i2 == 0) {
            kotlin.a.e(objInvoke);
            c cVar2 = (c) this.c;
            Float f2 = new Float(f);
            fVar.z = 1;
            objInvoke = cVar2.invoke(f2, fVar);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objInvoke == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(objInvoke);
        }
        this.b += ((Number) objInvoke).floatValue();
        return y.a;
    }

    public g(int i, c cVar) {
        this.a = i;
        this.c = cVar;
    }
}
