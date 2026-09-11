package androidx.media3.exoplayer;

import android.view.View;
import java.util.Arrays;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    public final /* synthetic */ int a = 2;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public Object f;

    public h0(int i) {
        this.b = i;
        byte[] bArr = new byte[Token.DO];
        this.f = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i, int i2) {
        if (this.c) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.f;
            int length = bArr2.length;
            int i4 = this.e + i3;
            if (length < i4) {
                this.f = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, (byte[]) this.f, this.e, i3);
            this.e += i3;
        }
    }

    public void b() {
        boolean z = this.c;
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f;
        this.e = z ? gVar.l() : gVar.q();
    }

    public void c(View view, int i) {
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f;
        int iR = Integer.MIN_VALUE == gVar.a ? 0 : gVar.r() - gVar.a;
        if (iR >= 0) {
            boolean z = this.c;
            androidx.emoji2.text.g gVar2 = (androidx.emoji2.text.g) this.f;
            if (z) {
                int iG = gVar2.g(view);
                androidx.emoji2.text.g gVar3 = (androidx.emoji2.text.g) this.f;
                this.e = (Integer.MIN_VALUE != gVar3.a ? gVar3.r() - gVar3.a : 0) + iG;
            } else {
                this.e = gVar2.j(view);
            }
            this.b = i;
            return;
        }
        this.b = i;
        boolean z2 = this.c;
        androidx.emoji2.text.g gVar4 = (androidx.emoji2.text.g) this.f;
        if (!z2) {
            int iJ = gVar4.j(view);
            int iQ = iJ - ((androidx.emoji2.text.g) this.f).q();
            this.e = iJ;
            if (iQ > 0) {
                int iL = (((androidx.emoji2.text.g) this.f).l() - Math.min(0, (((androidx.emoji2.text.g) this.f).l() - iR) - ((androidx.emoji2.text.g) this.f).g(view))) - (((androidx.emoji2.text.g) this.f).h(view) + iJ);
                if (iL < 0) {
                    this.e -= Math.min(iQ, -iL);
                    return;
                }
                return;
            }
            return;
        }
        int iL2 = (gVar4.l() - iR) - ((androidx.emoji2.text.g) this.f).g(view);
        this.e = ((androidx.emoji2.text.g) this.f).l() - iL2;
        if (iL2 > 0) {
            int iH = this.e - ((androidx.emoji2.text.g) this.f).h(view);
            int iQ2 = ((androidx.emoji2.text.g) this.f).q();
            int iMin = iH - (Math.min(((androidx.emoji2.text.g) this.f).j(view) - iQ2, 0) + iQ2);
            if (iMin < 0) {
                this.e = Math.min(iL2, -iMin) + this.e;
            }
        }
    }

    public boolean d(int i) {
        if (!this.c) {
            return false;
        }
        this.e -= i;
        this.c = false;
        this.d = true;
        return true;
    }

    public void e(int i) {
        this.c |= i > 0;
        this.b += i;
    }

    public void f() {
        switch (this.a) {
            case 1:
                this.c = false;
                this.d = false;
                break;
            default:
                this.b = -1;
                this.e = Integer.MIN_VALUE;
                this.c = false;
                this.d = false;
                break;
        }
    }

    public void g(int i) {
        com.google.android.material.motion.a.q(!this.c);
        boolean z = i == this.b;
        this.c = z;
        if (z) {
            this.e = 3;
            this.d = false;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.e + ", mLayoutFromEnd=" + this.c + ", mValid=" + this.d + '}';
            default:
                return super.toString();
        }
    }

    public h0(c1 c1Var) {
        this.f = c1Var;
    }

    public h0() {
        f();
    }
}
