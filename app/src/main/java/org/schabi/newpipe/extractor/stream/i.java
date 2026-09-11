package org.schabi.newpipe.extractor.stream;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends e {
    public final boolean B;
    public final String C;

    public i(String str, boolean z, org.schabi.newpipe.extractor.i iVar, String str2, boolean z2) {
        super(str, z, iVar, 1);
        this.C = str2;
        this.B = z2;
    }

    @Override // org.schabi.newpipe.extractor.stream.e
    public final boolean b(e eVar) {
        if (!super.b(eVar) || !(eVar instanceof i)) {
            return false;
        }
        i iVar = (i) eVar;
        return this.C.equals(iVar.C) && this.B == iVar.B;
    }
}
