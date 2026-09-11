package org.schabi.newpipe.extractor.stream;

import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends e {
    public final int B;
    public final int C;
    public final String D;
    public final Locale E;
    public final int F;

    public b(a aVar) {
        super(aVar.b, aVar.c, aVar.e, aVar.d);
        org.schabi.newpipe.extractor.services.youtube.a aVar2 = aVar.j;
        if (aVar2 != null) {
            this.C = aVar2.B;
            aVar2.getClass();
            aVar.j.getClass();
            aVar.j.getClass();
            aVar.j.getClass();
        }
        this.B = aVar.f;
        this.D = aVar.g;
        this.E = aVar.h;
        this.F = aVar.i;
    }

    @Override // org.schabi.newpipe.extractor.stream.e
    public final boolean b(e eVar) {
        if (!super.b(eVar) || !(eVar instanceof b)) {
            return false;
        }
        b bVar = (b) eVar;
        return this.B == bVar.B && Objects.equals(this.D, bVar.D) && this.F == bVar.F && Objects.equals(this.E, bVar.E);
    }
}
