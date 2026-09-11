package androidx.emoji2.viewsintegration;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends androidx.emoji2.text.h implements Runnable {
    public final WeakReference e;

    public h(EditText editText) {
        this.e = new WeakReference(editText);
    }

    @Override // androidx.emoji2.text.h
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.e.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        i.a((EditText) this.e.get(), 1);
    }
}
