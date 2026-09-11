package androidx.emoji2.text;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements androidx.lifecycle.f {
    public final /* synthetic */ androidx.lifecycle.p e;

    public k(EmojiCompatInitializer emojiCompatInitializer, androidx.lifecycle.p pVar) {
        this.e = pVar;
    }

    @Override // androidx.lifecycle.f
    public final void a(androidx.lifecycle.v vVar) {
        (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new n(0), 500L);
        this.e.b(this);
    }
}
