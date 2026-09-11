package org.mozilla.javascript.regexp;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
class REBackTrackData {
    final int continuationOp;
    final int continuationPc;
    final int cp;
    final int op;
    final long[] parens;
    final int pc;
    final REBackTrackData previous;
    final REProgState stateStackTop;

    public REBackTrackData(REGlobalData rEGlobalData, int i, int i2, int i3, int i4, int i5) {
        this.previous = rEGlobalData.backTrackStackTop;
        this.op = i;
        this.pc = i2;
        this.cp = i3;
        this.continuationOp = i4;
        this.continuationPc = i5;
        this.parens = rEGlobalData.parens;
        this.stateStackTop = rEGlobalData.stateStackTop;
    }
}
