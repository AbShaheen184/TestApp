package com.google.firebase.messaging.reporting;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public enum b implements com.google.firebase.encoders.proto.c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(0),
    DATA_MESSAGE(1),
    /* JADX INFO: Fake field, exist only in values array */
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);

    public final int e;

    b(int i) {
        this.e = i;
    }

    @Override // com.google.firebase.encoders.proto.c
    public final int getNumber() {
        return this.e;
    }
}
