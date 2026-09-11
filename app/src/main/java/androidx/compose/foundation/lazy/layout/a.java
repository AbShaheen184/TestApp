package androidx.compose.foundation.lazy.layout;

import com.google.firebase.crashlytics.internal.model.q1;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Comparator {
    public final /* synthetic */ int e;

    public /* synthetic */ a(int i) {
        this.e = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iBitCount;
        int iBitCount2;
        switch (this.e) {
            case 0:
                return kotlin.jvm.internal.l.b(((f1) obj2).a, ((f1) obj).a);
            case 1:
                return kotlin.jvm.internal.l.b(((e0) obj).getIndex(), ((e0) obj2).getIndex());
            case 2:
                return kotlin.jvm.internal.l.b(((androidx.compose.runtime.p0) obj).b, ((androidx.compose.runtime.p0) obj2).b);
            case 3:
                androidx.compose.ui.node.f0 f0Var = (androidx.compose.ui.node.f0) obj;
                androidx.compose.ui.node.f0 f0Var2 = (androidx.compose.ui.node.f0) obj2;
                float f = f0Var.e0.p.a0;
                float f2 = f0Var2.e0.p.a0;
                return f == f2 ? kotlin.jvm.internal.l.b(f0Var.w(), f0Var2.w()) : Float.compare(f, f2);
            case 4:
                kotlin.k kVar = (kotlin.k) obj;
                kotlin.k kVar2 = (kotlin.k) obj2;
                return (((Number) kVar.y).intValue() - ((Number) kVar.e).intValue()) - (((Number) kVar2.y).intValue() - ((Number) kVar2.e).intValue());
            case 5:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 6:
                iBitCount = Integer.bitCount(((Integer) obj2).intValue());
                iBitCount2 = Integer.bitCount(((Integer) obj).intValue());
                break;
            case 7:
                androidx.media3.exoplayer.dash.manifest.b bVar = (androidx.media3.exoplayer.dash.manifest.b) obj;
                androidx.media3.exoplayer.dash.manifest.b bVar2 = (androidx.media3.exoplayer.dash.manifest.b) obj2;
                int iCompare = Integer.compare(bVar.c, bVar2.c);
                return iCompare != 0 ? iCompare : bVar.b.compareTo(bVar2.b);
            case 8:
                return ((androidx.media3.exoplayer.hls.playlist.f) obj).a.compareTo(((androidx.media3.exoplayer.hls.playlist.f) obj2).a);
            case 9:
                iBitCount = ((androidx.media3.common.r) obj2).j;
                iBitCount2 = ((androidx.media3.common.r) obj).j;
                break;
            case 10:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 11:
                return Integer.compare(((androidx.media3.exoplayer.trackselection.g) ((List) obj).get(0)).C, ((androidx.media3.exoplayer.trackselection.g) ((List) obj2).get(0)).C);
            case 12:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i2 = 16;
                return com.google.common.collect.w.f(androidx.media3.exoplayer.trackselection.n.e((androidx.media3.exoplayer.trackselection.n) Collections.max(list, new a(15)), (androidx.media3.exoplayer.trackselection.n) Collections.max(list2, new a(15)))).a(list.size(), list2.size()).b((androidx.media3.exoplayer.trackselection.n) Collections.max(list, new a(i2)), (androidx.media3.exoplayer.trackselection.n) Collections.max(list2, new a(i2)), new a(i2)).e();
            case 13:
                return ((androidx.media3.exoplayer.trackselection.f) Collections.max((List) obj)).compareTo((androidx.media3.exoplayer.trackselection.f) Collections.max((List) obj2));
            case 14:
                return ((androidx.media3.exoplayer.trackselection.k) ((List) obj).get(0)).compareTo((androidx.media3.exoplayer.trackselection.k) ((List) obj2).get(0));
            case 15:
                return androidx.media3.exoplayer.trackselection.n.e((androidx.media3.exoplayer.trackselection.n) obj, (androidx.media3.exoplayer.trackselection.n) obj2);
            case 16:
                androidx.media3.exoplayer.trackselection.n nVar = (androidx.media3.exoplayer.trackselection.n) obj;
                androidx.media3.exoplayer.trackselection.n nVar2 = (androidx.media3.exoplayer.trackselection.n) obj2;
                boolean z = nVar.B;
                int i3 = nVar.G;
                com.google.common.collect.z0 z0VarA = (z && nVar.E) ? androidx.media3.exoplayer.trackselection.o.k : androidx.media3.exoplayer.trackselection.o.k.a();
                nVar.C.getClass();
                com.google.common.collect.y yVarB = com.google.common.collect.y.a.c(nVar.V, nVar2.V).b(Integer.valueOf(nVar.H), Integer.valueOf(nVar2.H), z0VarA);
                if (nVar.R && nVar.T) {
                    yVarB = yVarB.a(nVar.U, nVar2.U);
                }
                return yVarB.c(nVar.S, nVar2.S).b(Integer.valueOf(i3), Integer.valueOf(nVar2.G), z0VarA).e();
            case 17:
                return ((androidx.media3.exoplayer.upstream.r) obj).a - ((androidx.media3.exoplayer.upstream.r) obj2).a;
            case 18:
                return Float.compare(((androidx.media3.exoplayer.upstream.r) obj).c, ((androidx.media3.exoplayer.upstream.r) obj2).c);
            case 19:
                return Integer.compare(((androidx.media3.extractor.text.cea.d) obj2).b, ((androidx.media3.extractor.text.cea.d) obj).b);
            case 20:
                return Integer.compare(((androidx.media3.extractor.text.webvtt.d) obj).a.b, ((androidx.media3.extractor.text.webvtt.d) obj2).a.b);
            case 21:
                return Long.compare(((androidx.media3.extractor.text.webvtt.c) obj).b, ((androidx.media3.extractor.text.webvtt.c) obj2).b);
            case 22:
                androidx.media3.ui.j0 j0Var = (androidx.media3.ui.j0) obj;
                androidx.media3.ui.j0 j0Var2 = (androidx.media3.ui.j0) obj2;
                int iCompare2 = Integer.compare(j0Var2.b, j0Var.b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompareTo = j0Var.c.compareTo(j0Var2.c);
                return iCompareTo != 0 ? iCompareTo : j0Var.d.compareTo(j0Var2.d);
            case 23:
                androidx.media3.ui.j0 j0Var3 = (androidx.media3.ui.j0) obj;
                androidx.media3.ui.j0 j0Var4 = (androidx.media3.ui.j0) obj2;
                int iCompare3 = Integer.compare(j0Var4.a, j0Var3.a);
                if (iCompare3 != 0) {
                    return iCompare3;
                }
                int iCompareTo2 = j0Var4.c.compareTo(j0Var3.c);
                return iCompareTo2 != 0 ? iCompareTo2 : j0Var4.d.compareTo(j0Var3.d);
            case 24:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 25:
                return ((com.google.firebase.crashlytics.internal.model.f0) ((q1) obj)).a.compareTo(((com.google.firebase.crashlytics.internal.model.f0) ((q1) obj2)).a);
            case 26:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 27:
                String name = ((File) obj).getName();
                int i4 = com.google.firebase.crashlytics.internal.persistence.a.f;
                return name.substring(0, i4).compareTo(((File) obj2).getName().substring(0, i4));
            default:
                iBitCount = ((String) obj2).length();
                iBitCount2 = ((String) obj).length();
                break;
        }
        return iBitCount - iBitCount2;
    }
}
