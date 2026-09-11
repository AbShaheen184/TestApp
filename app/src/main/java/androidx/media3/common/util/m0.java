package androidx.media3.common.util;

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public final Object d;
    public final Object e;
    public final Object f;

    public m0(Context context, Looper looper, e0 e0Var) {
        this.a = 0;
        this.d = new b(context.getApplicationContext());
        this.e = e0Var.a(looper, null);
        this.f = e0Var.a(Looper.getMainLooper(), null);
    }

    public void a(final boolean z, final boolean z2) {
        g0 g0Var = (g0) this.e;
        if (z && z2) {
            g0Var.d(new Runnable() { // from class: androidx.media3.common.util.k0
                @Override // java.lang.Runnable
                public final void run() {
                    b.i((b) this.e.d, z, z2);
                }
            });
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        g0 g0Var2 = (g0) this.f;
        g0Var2.a.postDelayed(new androidx.activity.c(7, this, atomicBoolean), 1000L);
        g0Var.d(new Runnable() { // from class: androidx.media3.common.util.l0
            @Override // java.lang.Runnable
            public final void run() {
                atomicBoolean.set(false);
                b.i((b) this.e.d, z, z2);
            }
        });
    }

    public void b(boolean z) {
        if (this.c == z) {
            return;
        }
        this.c = z;
        if (this.b) {
            a(true, z);
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=false, isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.b + ", prettyPrintIndent='" + ((String) this.d) + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + ((String) this.e) + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.c + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + ((kotlinx.serialization.json.a) this.f) + ')';
            default:
                return super.toString();
        }
    }

    public m0() {
        this.a = 1;
        this.b = true;
        this.d = "    ";
        this.e = "type";
        this.c = true;
        this.f = kotlinx.serialization.json.a.y;
    }
}
