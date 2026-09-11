package com.google.firebase.encoders.proto;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements com.google.firebase.encoders.g {
    public boolean a = false;
    public boolean b = false;
    public com.google.firebase.encoders.c c;
    public final f d;

    public h(f fVar) {
        this.d = fVar;
    }

    @Override // com.google.firebase.encoders.g
    public final com.google.firebase.encoders.g e(String str) {
        if (this.a) {
            throw new com.google.firebase.encoders.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.i(this.c, str, this.b);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    public final com.google.firebase.encoders.g f(boolean z) {
        if (this.a) {
            throw new com.google.firebase.encoders.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.f(this.c, z ? 1 : 0, this.b);
        return this;
    }
}
