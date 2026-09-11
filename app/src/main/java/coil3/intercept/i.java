package coil3.intercept;

import androidx.transition.k;
import coil3.request.l;
import java.util.ArrayList;
import java.util.List;
import org.schabi.newpipe.extractor.stream.j;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public boolean a;
    public Object b;
    public int c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public i(coil3.request.g gVar, List list, int i, coil3.request.g gVar2, coil3.size.h hVar, coil3.f fVar, boolean z) {
        this.d = gVar;
        this.b = list;
        this.c = i;
        this.e = gVar2;
        this.f = hVar;
        this.g = fVar;
        this.a = z;
    }

    public j a() {
        if (((String) this.d) == null) {
            net.luminis.tls.engine.impl.c.r("The identifier of the video stream has been not set or is null. If you are not able to get an identifier, use the static constant ID_UNKNOWN of the Stream class.");
            return null;
        }
        String str = (String) this.e;
        if (str == null) {
            net.luminis.tls.engine.impl.c.r("The content of the video stream has been not set or is null. Please specify a non-null one with setContent.");
            return null;
        }
        int i = this.c;
        if (i == 0) {
            net.luminis.tls.engine.impl.c.r("The delivery method of the video stream has been set as null, which is not allowed. Pass a valid one instead with setDeliveryMethod.");
            return null;
        }
        Boolean bool = (Boolean) this.f;
        if (bool == null) {
            net.luminis.tls.engine.impl.c.r("The video stream has been not set as a video-only stream or as a video stream with embedded audio. Please specify this information with setIsVideoOnly.");
            return null;
        }
        String str2 = (String) this.g;
        if (str2 != null) {
            return new j(str, this.a, (org.schabi.newpipe.extractor.i) this.b, i, str2, bool.booleanValue(), null);
        }
        net.luminis.tls.engine.impl.c.r("The resolution of the video stream has been not set. Please specify it with setResolution (use an empty string if you are not able to get it).");
        return null;
    }

    public boolean b() {
        return this.c < ((List) this.b).size() || !((ArrayList) this.g).isEmpty();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    public Object c(kotlin.coroutines.jvm.internal.c cVar) throws Throwable {
        h hVar;
        f fVar;
        coil3.request.g gVar = (coil3.request.g) this.d;
        int i = this.c;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i2 = hVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.A = i2 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        h hVar2 = hVar;
        Object objD = hVar2.y;
        int i3 = hVar2.A;
        if (i3 == 0) {
            kotlin.a.e(objD);
            f fVar2 = (f) ((List) this.b).get(i);
            i iVar = new i(gVar, (List) this.b, i + 1, (coil3.request.g) this.e, (coil3.size.h) this.f, (coil3.f) this.g, this.a);
            hVar2.e = fVar2;
            hVar2.A = 1;
            objD = fVar2.d(iVar, hVar2);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objD == aVar) {
                return aVar;
            }
            fVar = fVar2;
        } else {
            if (i3 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fVar = hVar2.e;
            kotlin.a.e(objD);
        }
        coil3.request.j jVar = (coil3.request.j) objD;
        coil3.request.g gVarB = jVar.b();
        if (gVarB.a != gVar.a) {
            k.l(fVar, "' cannot modify the request's context.", "Interceptor '");
            return null;
        }
        if (gVarB.b == l.a) {
            k.l(fVar, "' cannot set the request's data to null.", "Interceptor '");
            return null;
        }
        if (gVarB.c != gVar.c) {
            k.l(fVar, "' cannot modify the request's target.", "Interceptor '");
            return null;
        }
        if (gVarB.o == gVar.o) {
            return jVar;
        }
        k.l(fVar, "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.", "Interceptor '");
        return null;
    }
}
