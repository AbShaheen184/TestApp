package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends i {
    public int e = 0;
    public final int y;
    public final /* synthetic */ ByteString z;

    public g(ByteString byteString) {
        this.z = byteString;
        this.y = byteString.size();
    }

    @Override // com.google.protobuf.m
    public final byte a() {
        int i = this.e;
        if (i < this.y) {
            this.e = i + 1;
            return this.z.internalByteAt(i);
        }
        org.mozilla.javascript.typedarrays.c.a();
        return (byte) 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.y;
    }
}
