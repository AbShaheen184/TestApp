package androidx.media3.extractor;

import androidx.media3.common.util.j0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = j0.a;
            int i = Integer.parseInt(strGroup, 16);
            int i2 = Integer.parseInt(matcher.group(2), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.a = i;
            this.b = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    public final void b(androidx.media3.common.h0 h0Var) {
        androidx.media3.common.g0 g0Var;
        h0Var.getClass();
        com.google.common.collect.d0 d0VarK = com.google.common.collect.h0.k();
        androidx.media3.common.g0[] g0VarArr = h0Var.a;
        int length = g0VarArr.length;
        int i = 0;
        while (true) {
            androidx.media3.common.g0 g0Var2 = null;
            if (i >= length) {
                break;
            }
            androidx.media3.common.g0 g0Var3 = g0VarArr[i];
            if (androidx.media3.extractor.metadata.id3.e.class.isAssignableFrom(g0Var3.getClass())) {
                androidx.media3.common.g0 g0Var4 = (androidx.media3.common.g0) androidx.media3.extractor.metadata.id3.e.class.cast(g0Var3);
                if (((androidx.media3.extractor.metadata.id3.e) g0Var4).c.equals("iTunSMPB")) {
                    g0Var2 = g0Var4;
                }
            }
            if (g0Var2 != null) {
                d0VarK.b(g0Var2);
            }
            i++;
        }
        com.google.common.collect.e0 e0VarListIterator = d0VarK.g().listIterator(0);
        while (e0VarListIterator.hasNext()) {
            if (a(((androidx.media3.extractor.metadata.id3.e) e0VarListIterator.next()).d)) {
                return;
            }
        }
        com.google.common.collect.d0 d0VarK2 = com.google.common.collect.h0.k();
        for (androidx.media3.common.g0 g0Var5 : g0VarArr) {
            if (androidx.media3.extractor.metadata.id3.k.class.isAssignableFrom(g0Var5.getClass())) {
                g0Var = (androidx.media3.common.g0) androidx.media3.extractor.metadata.id3.k.class.cast(g0Var5);
                androidx.media3.extractor.metadata.id3.k kVar = (androidx.media3.extractor.metadata.id3.k) g0Var;
                if (!(kVar.b.equals("com.apple.iTunes") && kVar.c.equals("iTunSMPB"))) {
                    g0Var = null;
                }
            } else {
                g0Var = null;
            }
            if (g0Var != null) {
                d0VarK2.b(g0Var);
            }
        }
        com.google.common.collect.e0 e0VarListIterator2 = d0VarK2.g().listIterator(0);
        while (e0VarListIterator2.hasNext() && !a(((androidx.media3.extractor.metadata.id3.k) e0VarListIterator2.next()).d)) {
        }
    }
}
