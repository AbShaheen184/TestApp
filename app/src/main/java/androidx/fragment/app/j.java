package androidx.fragment.app;

import android.util.Log;
import com.google.gson.internal.p;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends Writer {
    public final /* synthetic */ int e;
    public final Object y;
    public final CharSequence z;

    public j() {
        this.e = 0;
        this.z = new StringBuilder(128);
        this.y = "FragmentManager";
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) throws IOException {
        switch (this.e) {
            case 1:
                ((Appendable) this.y).append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.e) {
            case 0:
                m();
                break;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        switch (this.e) {
            case 0:
                m();
                break;
        }
    }

    public void m() {
        StringBuilder sb = (StringBuilder) this.z;
        if (sb.length() > 0) {
            Log.d((String) this.y, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) throws IOException {
        switch (this.e) {
            case 0:
                for (int i3 = 0; i3 < i2; i3++) {
                    char c = cArr[i + i3];
                    if (c == '\n') {
                        m();
                    } else {
                        ((StringBuilder) this.z).append(c);
                    }
                }
                break;
            default:
                p pVar = (p) this.z;
                pVar.e = cArr;
                pVar.y = null;
                ((Appendable) this.y).append(pVar, i, i2 + i);
                break;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Appendable append(CharSequence charSequence) throws IOException {
        switch (this.e) {
            case 1:
                ((Appendable) this.y).append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) throws IOException {
        switch (this.e) {
            case 1:
                ((Appendable) this.y).append(charSequence, i, i2);
                return this;
            default:
                return super.append(charSequence, i, i2);
        }
    }

    public j(Appendable appendable) {
        this.e = 1;
        this.z = new p();
        this.y = appendable;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        switch (this.e) {
            case 1:
                ((Appendable) this.y).append(charSequence, i, i2);
                return this;
            default:
                return super.append(charSequence, i, i2);
        }
    }

    private final void a() {
    }

    private final void g() {
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        switch (this.e) {
            case 1:
                ((Appendable) this.y).append((char) i);
                break;
            default:
                super.write(i);
                break;
        }
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        switch (this.e) {
            case 1:
                Objects.requireNonNull(str);
                ((Appendable) this.y).append(str, i, i2 + i);
                break;
            default:
                super.write(str, i, i2);
                break;
        }
    }
}
