package com.google.firebase.sessions;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public enum n implements com.google.firebase.encoders.json.f {
    /* JADX INFO: Fake field, exist only in values array */
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);

    public final int e;

    n(int i) {
        this.e = i;
    }

    @Override // com.google.firebase.encoders.json.f
    public final int getNumber() {
        return this.e;
    }
}
