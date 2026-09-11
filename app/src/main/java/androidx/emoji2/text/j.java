package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import androidx.appcompat.widget.c2;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static final Object j = new Object();
    public static volatile j k;
    public final ReentrantReadWriteLock a;
    public final androidx.collection.h b;
    public volatile int c;
    public final Handler d;
    public final f e;
    public final i f;
    public final com.google.firebase.heartbeatinfo.e g;
    public final int h;
    public final d i;

    public j(u uVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        i iVar = (i) uVar.b;
        this.f = iVar;
        int i = uVar.a;
        this.h = i;
        this.i = (d) uVar.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new androidx.collection.h(0);
        this.g = new com.google.firebase.heartbeatinfo.e();
        f fVar = new f();
        fVar.a = this;
        this.e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                iVar.a(new e(fVar));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static j a() {
        j jVar;
        synchronized (j) {
            try {
                jVar = k;
                if (!(jVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    public static boolean d() {
        return k != null;
    }

    public final int b(CharSequence charSequence, int i) {
        if (!(c() == 1)) {
            net.luminis.tls.engine.impl.c.r("Not initialized yet");
            return 0;
        }
        com.google.firebase.b.h(charSequence, "charSequence cannot be null");
        c2 c2Var = (c2) this.e.b;
        c2Var.getClass();
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            z[] zVarArr = (z[]) spanned.getSpans(i, i + 1, z.class);
            if (zVarArr.length > 0) {
                return spanned.getSpanStart(zVarArr[0]);
            }
        }
        return ((q) c2Var.T(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new q(i))).y;
    }

    public final int c() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void e() {
        if (!(this.h == 1)) {
            net.luminis.tls.engine.impl.c.r("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (c() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                this.a.writeLock().unlock();
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            f fVar = this.e;
            j jVar = (j) fVar.a;
            try {
                jVar.f.a(new e(fVar));
            } catch (Throwable th) {
                jVar.f(th);
            }
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new androidx.core.provider.a(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a8 A[Catch: all -> 0x008b, TryCatch #2 {all -> 0x008b, blocks: (B:35:0x0063, B:38:0x0068, B:40:0x006c, B:42:0x0079, B:49:0x0098, B:51:0x00a2, B:53:0x00a5, B:55:0x00a8, B:57:0x00b8, B:58:0x00bb), top: B:96:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b8 A[Catch: all -> 0x008b, TryCatch #2 {all -> 0x008b, blocks: (B:35:0x0063, B:38:0x0068, B:40:0x006c, B:42:0x0079, B:49:0x0098, B:51:0x00a2, B:53:0x00a5, B:55:0x00a8, B:57:0x00b8, B:58:0x00bb), top: B:96:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:83:0x0108  */
    /* JADX WARN: Code duplicated, block: B:99:? A[SYNTHETIC] */
    public final CharSequence g(int i, int i2, int i3, CharSequence charSequence) throws Throwable {
        CharSequence charSequence2;
        Throwable th;
        int i4;
        int i5;
        z[] zVarArr;
        int spanStart;
        if (!(c() == 1)) {
            net.luminis.tls.engine.impl.c.r("Not initialized yet");
            return null;
        }
        if (i < 0) {
            net.luminis.tls.engine.impl.c.o("start cannot be negative");
            return null;
        }
        if (i2 < 0) {
            net.luminis.tls.engine.impl.c.o("end cannot be negative");
            return null;
        }
        com.google.firebase.b.f("start should be <= than end", i <= i2);
        b0 b0Var = null;
        if (charSequence == null) {
            return null;
        }
        com.google.firebase.b.f("start should be < than charSequence length", i <= charSequence.length());
        com.google.firebase.b.f("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        boolean z = i3 == 1;
        c2 c2Var = (c2) this.e.b;
        c2Var.getClass();
        boolean z2 = charSequence instanceof x;
        if (z2) {
            ((x) charSequence).a();
        }
        if (z2) {
            b0Var = new b0((Spannable) charSequence);
            if (b0Var != null) {
                for (z zVar : zVarArr) {
                    spanStart = b0Var.y.getSpanStart(zVar);
                    int spanEnd = b0Var.y.getSpanEnd(zVar);
                    if (spanStart != i2) {
                        b0Var.removeSpan(zVar);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd, i2);
                }
            }
            i4 = i;
            i5 = i2;
            if (i4 != i5) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            }
            ((x) charSequence2).b();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    b0Var = new b0((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((x) charSequence2).b();
                    throw th;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, z.class) <= i2) {
                b0Var = new b0();
                b0Var.e = false;
                b0Var.y = new SpannableString(charSequence);
            }
            if (b0Var != null && (zVarArr = (z[]) b0Var.y.getSpans(i, i2, z.class)) != null && zVarArr.length > 0) {
                while (i < r3) {
                    spanStart = b0Var.y.getSpanStart(zVar);
                    int spanEnd2 = b0Var.y.getSpanEnd(zVar);
                    if (spanStart != i2) {
                        b0Var.removeSpan(zVar);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd2, i2);
                }
            }
            i4 = i;
            i5 = i2;
            if (i4 != i5 || i4 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                try {
                    b0 b0Var2 = (b0) c2Var.T(charSequence2, i4, i5, Integer.MAX_VALUE, z, new androidx.compose.foundation.text.input.internal.o(27, b0Var, (com.google.firebase.heartbeatinfo.e) c2Var.y));
                    if (b0Var2 != null) {
                        Spannable spannable = b0Var2.y;
                        if (z2) {
                            ((x) charSequence2).b();
                        }
                        return spannable;
                    }
                    if (!z2) {
                        return charSequence2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((x) charSequence2).b();
                    throw th;
                }
            }
            ((x) charSequence2).b();
            return charSequence2;
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z2) {
            throw th;
        }
        ((x) charSequence2).b();
        throw th;
    }

    public final void h(h hVar) {
        com.google.firebase.b.h(hVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new androidx.core.provider.a(Arrays.asList(hVar), this.c, (Throwable) null));
            } else {
                this.b.add(hVar);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void i(EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        f fVar = this.e;
        fVar.getClass();
        Bundle bundle = editorInfo.extras;
        androidx.emoji2.text.flatbuffer.b bVar = (androidx.emoji2.text.flatbuffer.b) ((com.google.firebase.messaging.o) fVar.c).y;
        int iB = bVar.b(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iB != 0 ? ((ByteBuffer) bVar.A).getInt(iB + bVar.e) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
