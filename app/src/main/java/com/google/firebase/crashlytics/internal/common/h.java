package com.google.firebase.crashlytics.internal.common;

import io.hopmonsdk.Hopmn;
import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements FilenameFilter {
    public final /* synthetic */ int a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.a) {
            case 0:
                return str.startsWith("aqs.");
            case 1:
                return str.startsWith(".ae");
            case 2:
                return str.startsWith(Hopmn.EVENT);
            default:
                return str.startsWith(Hopmn.EVENT) && !str.endsWith("_");
        }
    }
}
