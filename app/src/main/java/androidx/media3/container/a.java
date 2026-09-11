package androidx.media3.container;

import androidx.compose.ui.platform.t1;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.crypto.Mac;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class a implements com.google.common.base.s {
    public final String e;

    public a(String str) {
        str.getClass();
        this.e = str;
    }

    public static a e(androidx.media3.common.util.w wVar) {
        String str;
        wVar.N(2);
        int iZ = wVar.z();
        int i = iZ >> 1;
        int iZ2 = ((wVar.z() >> 3) & 31) | ((iZ & 1) << 5);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sbN = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.n(str);
        sbN.append(i < 10 ? ".0" : ".");
        sbN.append(i);
        return new a(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.e(iZ2, iZ2 < 10 ? ".0" : ".", sbN), false);
    }

    public static CharSequence f(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    @Override // com.google.common.base.s
    public Iterator a(t1 t1Var, CharSequence charSequence) {
        return new com.google.common.base.q(this, t1Var, charSequence, 1);
    }

    public void b(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(f(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.e);
                    sb.append(f(it.next()));
                }
            }
        } catch (IOException e) {
            net.luminis.tls.engine.impl.c.m(e);
        }
    }

    public Mac c() {
        try {
            return Mac.getInstance(this.e);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("defined mac algorithm was not found", e);
        } catch (Exception e2) {
            throw new IllegalStateException("could not create mac instance in hkdf", e2);
        }
    }

    public String d(List list) {
        Iterator it = list.iterator();
        StringBuilder sb = new StringBuilder();
        b(sb, it);
        return sb.toString();
    }

    public /* synthetic */ a(String str, boolean z) {
        this.e = str;
    }
}
