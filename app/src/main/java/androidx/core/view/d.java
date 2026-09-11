package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements c, e {
    public final /* synthetic */ int a = 0;
    public ClipData b;
    public int c;
    public int d;
    public Uri e;
    public Bundle f;

    public d(d dVar) {
        ClipData clipData = dVar.b;
        clipData.getClass();
        this.b = clipData;
        int i = dVar.c;
        if (i < 0) {
            Locale locale = Locale.US;
            net.luminis.tls.engine.impl.c.o("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            net.luminis.tls.engine.impl.c.o("source is out of range of [0, 5] (too high)");
            throw null;
        }
        this.c = i;
        int i2 = dVar.d;
        if ((i2 & 1) == i2) {
            this.d = i2;
            this.e = dVar.e;
            this.f = dVar.f;
            return;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    }

    @Override // androidx.core.view.c
    public void a(Uri uri) {
        this.e = uri;
    }

    @Override // androidx.core.view.c
    public void b(int i) {
        this.d = i;
    }

    @Override // androidx.core.view.c
    public f build() {
        return new f(new d(this));
    }

    @Override // androidx.core.view.e
    public int c() {
        return this.c;
    }

    @Override // androidx.core.view.e
    public ClipData d() {
        return this.b;
    }

    @Override // androidx.core.view.e
    public int e() {
        return this.d;
    }

    @Override // androidx.core.view.e
    public ContentInfo f() {
        return null;
    }

    @Override // androidx.core.view.c
    public void setExtras(Bundle bundle) {
        this.f = bundle;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.a) {
            case 1:
                Uri uri = this.e;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.b.getDescription());
                sb.append(", source=");
                int i = this.c;
                if (i == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i != 4) {
                    strValueOf = i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb.append(strValueOf);
                sb.append(", flags=");
                int i2 = this.d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return androidx.privacysandbox.ads.adservices.java.internal.a.u(sb, this.f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ d() {
    }
}
