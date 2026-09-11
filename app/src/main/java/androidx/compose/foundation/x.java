package androidx.compose.foundation;

import android.text.Layout;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements kotlin.jvm.functions.l {
    public final /* synthetic */ Serializable A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ long y;
    public final /* synthetic */ Object z;

    public /* synthetic */ x(long j, float[] fArr, kotlin.jvm.internal.x xVar, kotlin.jvm.internal.w wVar) {
        this.y = j;
        this.z = fArr;
        this.A = xVar;
        this.B = wVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        float[] fArr;
        long j;
        androidx.compose.ui.text.a aVar;
        int i;
        float fA;
        float fA2;
        switch (this.e) {
            case 0:
                androidx.compose.ui.geometry.c cVar = (androidx.compose.ui.geometry.c) this.z;
                kotlin.jvm.internal.z zVar = (kotlin.jvm.internal.z) this.A;
                long j2 = this.y;
                androidx.compose.ui.graphics.m mVar = (androidx.compose.ui.graphics.m) this.B;
                androidx.compose.ui.node.h0 h0Var = (androidx.compose.ui.node.h0) obj;
                h0Var.b();
                float f = cVar.a;
                float f2 = cVar.b;
                androidx.compose.ui.graphics.drawscope.b bVar = h0Var.e;
                ((com.google.firebase.platforminfo.c) bVar.y.y).r(f, f2);
                try {
                    androidx.compose.ui.graphics.drawscope.d.w(h0Var, (androidx.compose.ui.graphics.g) zVar.e, j2, 0L, 0.0f, mVar, 0, 890);
                } finally {
                    ((com.google.firebase.platforminfo.c) bVar.y.y).r(-f, -f2);
                }
                break;
            default:
                float[] fArr2 = (float[]) this.z;
                kotlin.jvm.internal.x xVar = (kotlin.jvm.internal.x) this.A;
                kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) this.B;
                androidx.compose.ui.text.p pVar = (androidx.compose.ui.text.p) obj;
                int i2 = pVar.b;
                androidx.compose.ui.text.a aVar2 = pVar.a;
                int iE = pVar.c;
                long j3 = this.y;
                int iF = i2 > androidx.compose.ui.text.l0.f(j3) ? pVar.b : androidx.compose.ui.text.l0.f(j3);
                if (iE >= androidx.compose.ui.text.l0.e(j3)) {
                    iE = androidx.compose.ui.text.l0.e(j3);
                }
                long jB = androidx.compose.ui.text.d0.b(pVar.d(iF), pVar.d(iE));
                int i3 = xVar.e;
                androidx.compose.ui.text.android.l lVar = aVar2.d;
                int iF2 = androidx.compose.ui.text.l0.f(jB);
                int iE2 = androidx.compose.ui.text.l0.e(jB);
                Layout layout = lVar.f;
                int length = layout.getText().length();
                if (iF2 < 0) {
                    androidx.compose.ui.text.internal.a.a("startOffset must be > 0");
                }
                if (iF2 >= length) {
                    androidx.compose.ui.text.internal.a.a("startOffset must be less than text length");
                }
                if (iE2 <= iF2) {
                    androidx.compose.ui.text.internal.a.a("endOffset must be greater than startOffset");
                }
                if (iE2 > length) {
                    androidx.compose.ui.text.internal.a.a("endOffset must be smaller or equal to text length");
                }
                if (fArr2.length - i3 < (iE2 - iF2) * 4) {
                    androidx.compose.ui.text.internal.a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(iF2);
                int lineForOffset2 = layout.getLineForOffset(iE2 - 1);
                androidx.compose.ui.scrollcapture.g gVar = new androidx.compose.ui.scrollcapture.g(lVar);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        fArr = fArr2;
                        int iF3 = lVar.f(lineForOffset);
                        int iMax = Math.max(iF2, lineStart);
                        int iMin = Math.min(iE2, iF3);
                        float fG = lVar.g(lineForOffset);
                        float fE = lVar.e(lineForOffset);
                        j = jB;
                        aVar = aVar2;
                        boolean z = false;
                        boolean z2 = layout.getParagraphDirection(lineForOffset) == 1;
                        while (iMax < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(iMax);
                            if (!z2 || zIsRtlCharAt) {
                                if (z2 && zIsRtlCharAt) {
                                    z = false;
                                    float fA3 = gVar.a(iMax, false, false, false);
                                    i = iMin;
                                    fA = gVar.a(iMax + 1, true, true, false);
                                    fA2 = fA3;
                                } else {
                                    i = iMin;
                                    z = false;
                                    if (z2 || !zIsRtlCharAt) {
                                        fA = gVar.a(iMax, false, false, false);
                                        fA2 = gVar.a(iMax + 1, true, true, false);
                                    } else {
                                        fA2 = gVar.a(iMax, false, false, true);
                                        fA = gVar.a(iMax + 1, true, true, true);
                                    }
                                }
                                fArr[i3] = fA;
                                fArr[i3 + 1] = fG;
                                fArr[i3 + 2] = fA2;
                                fArr[i3 + 3] = fE;
                                i3 += 4;
                                iMax++;
                                iMin = i;
                            } else {
                                fA = gVar.a(iMax, z, z, true);
                                i = iMin;
                                fA2 = gVar.a(iMax + 1, true, true, true);
                            }
                            z = false;
                            fArr[i3] = fA;
                            fArr[i3 + 1] = fG;
                            fArr[i3 + 2] = fA2;
                            fArr[i3 + 3] = fE;
                            i3 += 4;
                            iMax++;
                            iMin = i;
                        }
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            aVar2 = aVar;
                            fArr2 = fArr;
                            jB = j;
                        }
                    }
                } else {
                    fArr = fArr2;
                    j = jB;
                    aVar = aVar2;
                }
                int iD = (androidx.compose.ui.text.l0.d(j) * 4) + xVar.e;
                for (int i4 = xVar.e; i4 < iD; i4 += 4) {
                    int i5 = i4 + 1;
                    float f3 = fArr[i5];
                    float f4 = wVar.e;
                    fArr[i5] = f3 + f4;
                    int i6 = i4 + 3;
                    fArr[i6] = fArr[i6] + f4;
                }
                xVar.e = iD;
                wVar.e = aVar.b() + wVar.e;
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ x(androidx.compose.ui.geometry.c cVar, kotlin.jvm.internal.z zVar, long j, androidx.compose.ui.graphics.m mVar) {
        this.z = cVar;
        this.A = zVar;
        this.y = j;
        this.B = mVar;
    }
}
