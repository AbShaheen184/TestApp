package org.mozilla.javascript.regexp;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
class RENode {
    int bmsize;
    char chr;
    int flatIndex;
    boolean greedy;
    int index;
    RENode kid;
    RENode kid2;
    int kidlen;
    int length;
    int max;
    int min;
    RENode next;
    byte op;
    int parenCount;
    int parenIndex;
    boolean sense;
    int startIndex;

    public RENode(byte b) {
        this.op = b;
    }
}
