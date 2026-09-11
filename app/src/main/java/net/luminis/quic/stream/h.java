package net.luminis.quic.stream;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface h extends Comparable {
    long b();

    byte[] c();

    int getLength();

    long getOffset();

    boolean isFinal();
}
