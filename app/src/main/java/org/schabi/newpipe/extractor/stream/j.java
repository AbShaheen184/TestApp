package org.schabi.newpipe.extractor.stream;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends e {
    public final String B;
    public final boolean C;
    public final int D;

    public j(String str, boolean z, org.schabi.newpipe.extractor.i iVar, int i, String str2, boolean z2, org.schabi.newpipe.extractor.services.youtube.a aVar) {
        super(str, z, iVar, i);
        if (aVar != null) {
            this.D = aVar.B;
        }
        this.B = str2;
        this.C = z2;
    }

    @Override // org.schabi.newpipe.extractor.stream.e
    public final boolean b(e eVar) {
        if (!super.b(eVar) || !(eVar instanceof j)) {
            return false;
        }
        j jVar = (j) eVar;
        return this.B.equals(jVar.B) && this.C == jVar.C;
    }
}
