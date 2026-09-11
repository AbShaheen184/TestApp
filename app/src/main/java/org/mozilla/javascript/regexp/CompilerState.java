package org.mozilla.javascript.regexp;

import org.mozilla.javascript.Context;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
class CompilerState {
    char[] cpbegin;
    int cpend;
    Context cx;
    int flags;
    int parenNesting;
    RENode result;
    int cp = 0;
    int backReferenceLimit = Integer.MAX_VALUE;
    int maxBackReference = 0;
    int parenCount = 0;
    int classCount = 0;
    int progLength = 0;

    public CompilerState(Context context, char[] cArr, int i, int i2) {
        this.cx = context;
        this.cpbegin = cArr;
        this.cpend = i;
        this.flags = i2;
    }
}
