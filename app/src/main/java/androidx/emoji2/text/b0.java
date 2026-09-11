package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Spannable {
    public boolean e = false;
    public Spannable y;

    public b0(Spannable spannable) {
        this.y = spannable;
    }

    public final void a() {
        Spannable spannable = this.y;
        if (!this.e) {
            if ((Build.VERSION.SDK_INT < 28 ? new com.google.android.material.shape.g() : new a0()).k(spannable)) {
                this.y = new SpannableString(spannable);
            }
        }
        this.e = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.y.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.y.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.y.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.y.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.y.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.y.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.y.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.y.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.y.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.y.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.y.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.y.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.y.toString();
    }
}
