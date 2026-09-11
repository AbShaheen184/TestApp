package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i implements DialogInterface.OnCancelListener {
    public volatile boolean e;

    public abstract Activity a();

    public abstract void b(Bundle bundle);

    public abstract void c();

    public abstract void d();
}
