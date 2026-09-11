package net.luminis.quic.stream;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements h {
    public final long e;
    public final byte[] y;
    public final boolean z;

    public f(long j, byte[] bArr, boolean z) {
        this.e = j;
        this.y = bArr;
        this.z = z;
    }

    @Override // net.luminis.quic.stream.h
    public final long b() {
        return this.e + ((long) this.y.length);
    }

    @Override // net.luminis.quic.stream.h
    public final byte[] c() {
        return this.y;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        long offset = hVar.getOffset();
        long j = this.e;
        return j != offset ? Long.compare(j, hVar.getOffset()) : Integer.compare(this.y.length, hVar.getLength());
    }

    @Override // net.luminis.quic.stream.h
    public final int getLength() {
        return this.y.length;
    }

    @Override // net.luminis.quic.stream.h
    public final long getOffset() {
        return this.e;
    }

    @Override // net.luminis.quic.stream.h
    public final boolean isFinal() {
        return this.z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("");
        long j = this.e;
        sb.append(j);
        sb.append("..");
        sb.append((j + ((long) this.y.length)) - 1);
        return sb.toString();
    }
}
