package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.emoji2.text.m;
import androidx.media3.common.r;
import androidx.media3.exoplayer.e0;
import androidx.media3.exoplayer.j;
import androidx.media3.exoplayer.k0;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends androidx.media3.exoplayer.a {
    public final m P;
    public final androidx.media3.decoder.e Q;
    public final ArrayDeque R;
    public boolean S;
    public boolean T;
    public e U;
    public long V;
    public long W;
    public int X;
    public int Y;
    public r Z;
    public b a0;
    public androidx.media3.decoder.e b0;
    public ImageOutput c0;
    public e0 d0;
    public Bitmap e0;
    public boolean f0;
    public f g0;
    public f h0;
    public int i0;
    public boolean j0;

    public g(m mVar) {
        super(4);
        this.P = mVar;
        this.c0 = ImageOutput.a;
        this.Q = new androidx.media3.decoder.e(0);
        this.U = e.c;
        this.R = new ArrayDeque();
        this.W = -9223372036854775807L;
        this.V = -9223372036854775807L;
        this.X = 0;
        this.Y = 1;
    }

    @Override // androidx.media3.exoplayer.a
    public final int D(r rVar) {
        this.P.getClass();
        return m.c(rVar);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00db  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:70:0x010a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0123  */
    /* JADX WARN: Code duplicated, block: B:82:0x014c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0165  */
    public final boolean G(long j) throws j {
        boolean z;
        f fVar;
        Bitmap bitmap;
        long j2;
        boolean z2;
        int i;
        e0 e0Var;
        boolean z3;
        k0 k0Var;
        int i2;
        int i3;
        r rVar;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmap2 = this.e0;
        if ((bitmap2 == null || this.g0 != null) && (this.Y != 0 || this.E == 2)) {
            ArrayDeque arrayDeque = this.R;
            if (bitmap2 == null) {
                this.a0.getClass();
                a aVar = (a) this.a0.c();
                if (aVar != null) {
                    if (!aVar.g(4)) {
                        com.google.android.material.motion.a.m(aVar.B, "Non-EOS buffer came back from the decoder without bitmap.");
                        this.e0 = aVar.B;
                        aVar.p();
                        if (this.f0 && this.e0 != null && this.g0 != null) {
                            this.Z.getClass();
                            r rVar2 = this.Z;
                            int i4 = rVar2.N;
                            int i5 = rVar2.O;
                            z = ((i4 != 1 && i5 == 1) || i4 == -1 || i5 == -1) ? false : true;
                            fVar = this.g0;
                            if (((Bitmap) fVar.d) == null) {
                                if (z) {
                                    int i6 = fVar.b;
                                    this.e0.getClass();
                                    int width = this.e0.getWidth();
                                    r rVar3 = this.Z;
                                    rVar3.getClass();
                                    int i7 = width / rVar3.N;
                                    int height = this.e0.getHeight();
                                    r rVar4 = this.Z;
                                    rVar4.getClass();
                                    int i8 = height / rVar4.O;
                                    int i9 = this.Z.N;
                                    bitmapCreateBitmap = Bitmap.createBitmap(this.e0, (i6 % i9) * i7, (i6 / i9) * i8, i7, i8);
                                } else {
                                    bitmapCreateBitmap = this.e0;
                                    bitmapCreateBitmap.getClass();
                                }
                                fVar.d = bitmapCreateBitmap;
                            }
                            bitmap = (Bitmap) this.g0.d;
                            bitmap.getClass();
                            j2 = this.g0.c;
                            long j3 = j2 - j;
                            if (this.E == 2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            i = this.Y;
                            if (i != 0) {
                                if (i != 1) {
                                    z2 = true;
                                } else {
                                    if (i == 3) {
                                        org.mozilla.javascript.c.a();
                                        return false;
                                    }
                                    z2 = false;
                                }
                            }
                            if (!z2 || j3 < 30000) {
                                e0Var = this.d0;
                                if (e0Var != null) {
                                    long j4 = this.U.b;
                                    this.Z.getClass();
                                    k0Var = e0Var.a;
                                    if (k0Var.b0) {
                                        k0Var.E.a(37).b();
                                    }
                                }
                                this.c0.onImageAvailable(j2 - this.U.b, bitmap);
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                f fVar2 = this.g0;
                                fVar2.getClass();
                                long j5 = fVar2.c;
                                this.V = j5;
                                while (!arrayDeque.isEmpty() && j5 >= ((e) arrayDeque.peek()).a) {
                                    this.U = (e) arrayDeque.removeFirst();
                                }
                                this.Y = 3;
                                if (z) {
                                    f fVar3 = this.g0;
                                    fVar3.getClass();
                                    i2 = fVar3.b;
                                    r rVar5 = this.Z;
                                    rVar5.getClass();
                                    i3 = rVar5.O;
                                    rVar = this.Z;
                                    rVar.getClass();
                                    if (i2 == (i3 * rVar.N) - 1) {
                                        this.e0 = null;
                                    }
                                } else {
                                    this.e0 = null;
                                }
                                this.g0 = this.h0;
                                this.h0 = null;
                                return true;
                            }
                        }
                    } else {
                        if (this.X == 3) {
                            J();
                            this.Z.getClass();
                            I();
                            return false;
                        }
                        aVar.p();
                        if (arrayDeque.isEmpty()) {
                            this.T = true;
                            return false;
                        }
                    }
                }
            } else if (this.f0) {
                this.Z.getClass();
                r rVar6 = this.Z;
                int i10 = rVar6.N;
                int i11 = rVar6.O;
                if (i10 != 1) {
                }
                fVar = this.g0;
                if (((Bitmap) fVar.d) == null) {
                    if (z) {
                        int i12 = fVar.b;
                        this.e0.getClass();
                        int width2 = this.e0.getWidth();
                        r rVar7 = this.Z;
                        rVar7.getClass();
                        int i13 = width2 / rVar7.N;
                        int height2 = this.e0.getHeight();
                        r rVar8 = this.Z;
                        rVar8.getClass();
                        int i14 = height2 / rVar8.O;
                        int i15 = this.Z.N;
                        bitmapCreateBitmap = Bitmap.createBitmap(this.e0, (i12 % i15) * i13, (i12 / i15) * i14, i13, i14);
                    } else {
                        bitmapCreateBitmap = this.e0;
                        bitmapCreateBitmap.getClass();
                    }
                    fVar.d = bitmapCreateBitmap;
                }
                bitmap = (Bitmap) this.g0.d;
                bitmap.getClass();
                j2 = this.g0.c;
                long j6 = j2 - j;
                if (this.E == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i = this.Y;
                if (i != 0) {
                    if (i != 1) {
                        z2 = true;
                    } else {
                        if (i == 3) {
                            org.mozilla.javascript.c.a();
                            return false;
                        }
                        z2 = false;
                    }
                }
                if (z2) {
                    e0Var = this.d0;
                    if (e0Var != null) {
                        long j7 = this.U.b;
                        this.Z.getClass();
                        k0Var = e0Var.a;
                        if (k0Var.b0) {
                            k0Var.E.a(37).b();
                        }
                    }
                    this.c0.onImageAvailable(j2 - this.U.b, bitmap);
                    z3 = true;
                } else {
                    e0Var = this.d0;
                    if (e0Var != null) {
                        long j8 = this.U.b;
                        this.Z.getClass();
                        k0Var = e0Var.a;
                        if (k0Var.b0) {
                            k0Var.E.a(37).b();
                        }
                    }
                    this.c0.onImageAvailable(j2 - this.U.b, bitmap);
                    z3 = true;
                }
                if (z3) {
                    f fVar4 = this.g0;
                    fVar4.getClass();
                    long j9 = fVar4.c;
                    this.V = j9;
                    while (!arrayDeque.isEmpty()) {
                        this.U = (e) arrayDeque.removeFirst();
                    }
                    this.Y = 3;
                    if (z) {
                        f fVar5 = this.g0;
                        fVar5.getClass();
                        i2 = fVar5.b;
                        r rVar9 = this.Z;
                        rVar9.getClass();
                        i3 = rVar9.O;
                        rVar = this.Z;
                        rVar.getClass();
                        if (i2 == (i3 * rVar.N) - 1) {
                            this.e0 = null;
                        }
                    } else {
                        this.e0 = null;
                    }
                    this.g0 = this.h0;
                    this.h0 = null;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0038  */
    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074  */
    /* JADX WARN: Code duplicated, block: B:38:0x007f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0081  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:47:0x00be  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:60:0x00de  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:75:0x0102  */
    /* JADX WARN: Code duplicated, block: B:80:0x010a  */
    /* JADX WARN: Code duplicated, block: B:83:0x011b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0120  */
    /* JADX WARN: Code duplicated, block: B:87:0x0131  */
    /* JADX WARN: Code duplicated, block: B:88:0x0134  */
    /* JADX WARN: Code duplicated, block: B:91:0x0140  */
    public final boolean H(long j) {
        int i;
        androidx.media3.decoder.e eVar;
        int iY;
        ByteBuffer byteBuffer;
        androidx.media3.decoder.e eVar2;
        boolean z;
        androidx.media3.decoder.e eVar3;
        long j2;
        boolean z2;
        f fVar;
        boolean z3;
        r rVar;
        boolean z4;
        boolean z5;
        r rVar2;
        int i2;
        androidx.media3.decoder.e eVar4;
        if (!this.f0 || this.g0 == null) {
            androidx.media3.common.util.b bVar = this.z;
            bVar.o();
            b bVar2 = this.a0;
            if (bVar2 != null && this.X != 3 && !this.S) {
                if (this.b0 == null) {
                    androidx.media3.decoder.e eVar5 = (androidx.media3.decoder.e) bVar2.d();
                    this.b0 = eVar5;
                    if (eVar5 != null) {
                        i = this.X;
                        eVar = this.b0;
                        if (i == 2) {
                            eVar.getClass();
                            this.b0.y = 4;
                            b bVar3 = this.a0;
                            bVar3.getClass();
                            bVar3.e(this.b0);
                            this.b0 = null;
                            this.X = 3;
                            return false;
                        }
                        iY = y(bVar, eVar, 0);
                        if (iY != -5) {
                            r rVar3 = (r) bVar.z;
                            rVar3.getClass();
                            this.Z = rVar3;
                            this.j0 = true;
                            this.X = 2;
                            return true;
                        }
                        if (iY != -4) {
                            this.b0.r();
                            byteBuffer = this.b0.B;
                            if (byteBuffer != null || byteBuffer.remaining() <= 0) {
                                eVar2 = this.b0;
                                eVar2.getClass();
                                if (eVar2.g(4)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = true;
                            }
                            if (z) {
                                androidx.media3.decoder.e eVar6 = this.b0;
                                eVar6.getClass();
                                eVar6.z = this.Z;
                                b bVar4 = this.a0;
                                bVar4.getClass();
                                androidx.media3.decoder.e eVar7 = this.b0;
                                eVar7.getClass();
                                bVar4.e(eVar7);
                                this.i0 = 0;
                            }
                            eVar3 = this.b0;
                            eVar3.getClass();
                            if (eVar3.g(4)) {
                                this.f0 = true;
                            } else {
                                int i3 = this.i0;
                                j2 = eVar3.D;
                                this.h0 = new f(i3, j2);
                                this.i0 = i3 + 1;
                                if (this.f0) {
                                    this.g0 = this.h0;
                                    this.h0 = null;
                                } else {
                                    if (j2 - 30000 <= j || j > 30000 + j2) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    fVar = this.g0;
                                    if (fVar != null || fVar.c > j || j >= j2) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    rVar = this.Z;
                                    rVar.getClass();
                                    if (rVar.N != -1 || (i2 = (rVar2 = this.Z).O) == -1 || i3 == (i2 * rVar2.N) - 1) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (!z2 || z3 || z4) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    this.f0 = z5;
                                    if (z3 || z2) {
                                        this.g0 = this.h0;
                                        this.h0 = null;
                                    }
                                }
                            }
                            eVar4 = this.b0;
                            eVar4.getClass();
                            if (eVar4.g(4)) {
                                this.S = true;
                                this.b0 = null;
                                return false;
                            }
                            long j3 = this.W;
                            androidx.media3.decoder.e eVar8 = this.b0;
                            eVar8.getClass();
                            this.W = Math.max(j3, eVar8.D);
                            if (z) {
                                this.b0 = null;
                            } else {
                                androidx.media3.decoder.e eVar9 = this.b0;
                                eVar9.getClass();
                                eVar9.o();
                            }
                            return !this.f0;
                        }
                        if (iY != -3) {
                            org.mozilla.javascript.c.a();
                            return false;
                        }
                    }
                } else {
                    i = this.X;
                    eVar = this.b0;
                    if (i == 2) {
                        eVar.getClass();
                        this.b0.y = 4;
                        b bVar5 = this.a0;
                        bVar5.getClass();
                        bVar5.e(this.b0);
                        this.b0 = null;
                        this.X = 3;
                        return false;
                    }
                    iY = y(bVar, eVar, 0);
                    if (iY != -5) {
                        r rVar4 = (r) bVar.z;
                        rVar4.getClass();
                        this.Z = rVar4;
                        this.j0 = true;
                        this.X = 2;
                        return true;
                    }
                    if (iY != -4) {
                        this.b0.r();
                        byteBuffer = this.b0.B;
                        if (byteBuffer != null) {
                            eVar2 = this.b0;
                            eVar2.getClass();
                            if (eVar2.g(4)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            eVar2 = this.b0;
                            eVar2.getClass();
                            if (eVar2.g(4)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            androidx.media3.decoder.e eVar10 = this.b0;
                            eVar10.getClass();
                            eVar10.z = this.Z;
                            b bVar6 = this.a0;
                            bVar6.getClass();
                            androidx.media3.decoder.e eVar11 = this.b0;
                            eVar11.getClass();
                            bVar6.e(eVar11);
                            this.i0 = 0;
                        }
                        eVar3 = this.b0;
                        eVar3.getClass();
                        if (eVar3.g(4)) {
                            this.f0 = true;
                        } else {
                            int i4 = this.i0;
                            j2 = eVar3.D;
                            this.h0 = new f(i4, j2);
                            this.i0 = i4 + 1;
                            if (this.f0) {
                                this.g0 = this.h0;
                                this.h0 = null;
                            } else {
                                if (j2 - 30000 <= j) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                fVar = this.g0;
                                if (fVar != null) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                rVar = this.Z;
                                rVar.getClass();
                                if (rVar.N != -1) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                if (z2) {
                                    z5 = true;
                                } else {
                                    z5 = true;
                                }
                                this.f0 = z5;
                                if (z3) {
                                    this.g0 = this.h0;
                                    this.h0 = null;
                                } else {
                                    this.g0 = this.h0;
                                    this.h0 = null;
                                }
                            }
                        }
                        eVar4 = this.b0;
                        eVar4.getClass();
                        if (eVar4.g(4)) {
                            this.S = true;
                            this.b0 = null;
                            return false;
                        }
                        long j4 = this.W;
                        androidx.media3.decoder.e eVar12 = this.b0;
                        eVar12.getClass();
                        this.W = Math.max(j4, eVar12.D);
                        if (z) {
                            this.b0 = null;
                        } else {
                            androidx.media3.decoder.e eVar13 = this.b0;
                            eVar13.getClass();
                            eVar13.o();
                        }
                        return !this.f0;
                    }
                    if (iY != -3) {
                        org.mozilla.javascript.c.a();
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final void I() throws j {
        if (this.j0) {
            r rVar = this.Z;
            rVar.getClass();
            m mVar = this.P;
            mVar.getClass();
            int iC = m.c(rVar);
            if (iC != androidx.media3.exoplayer.a.f(4, 0, 0, 0) && iC != androidx.media3.exoplayer.a.f(3, 0, 0, 0)) {
                throw g(new c("Provided decoder factory can't create decoder for format."), this.Z, false, 4005);
            }
            b bVar = this.a0;
            if (bVar != null) {
                bVar.release();
            }
            this.a0 = new b(mVar.a);
            this.j0 = false;
        }
    }

    public final void J() {
        this.b0 = null;
        this.X = 0;
        this.W = -9223372036854775807L;
        b bVar = this.a0;
        if (bVar != null) {
            bVar.release();
            this.a0 = null;
        }
    }

    @Override // androidx.media3.exoplayer.a, androidx.media3.exoplayer.d1
    public final void d(int i, Object obj) {
        if (i != 15) {
            if (i != 23) {
                return;
            }
            this.d0 = (e0) obj;
        } else {
            ImageOutput imageOutput = obj instanceof ImageOutput ? (ImageOutput) obj : null;
            if (imageOutput == null) {
                imageOutput = ImageOutput.a;
            }
            this.c0 = imageOutput;
        }
    }

    @Override // androidx.media3.exoplayer.a
    public final String k() {
        return "ImageRenderer";
    }

    @Override // androidx.media3.exoplayer.a
    public final boolean m() {
        return this.T;
    }

    @Override // androidx.media3.exoplayer.a
    public final boolean o() {
        int i = this.Y;
        if (i != 3) {
            return i == 0 && this.f0;
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.a
    public final void p() {
        this.Z = null;
        this.U = e.c;
        this.R.clear();
        J();
        this.c0.a();
    }

    @Override // androidx.media3.exoplayer.a
    public final void q(boolean z, boolean z2) {
        this.Y = z2 ? 1 : 0;
    }

    @Override // androidx.media3.exoplayer.a
    public final void r(long j, boolean z, boolean z2) {
        this.Y = Math.min(this.Y, 1);
        this.T = false;
        this.S = false;
        this.e0 = null;
        this.g0 = null;
        this.h0 = null;
        this.f0 = false;
        this.b0 = null;
        b bVar = this.a0;
        if (bVar != null) {
            bVar.flush();
        }
        this.R.clear();
    }

    @Override // androidx.media3.exoplayer.a
    public final void s() {
        J();
    }

    @Override // androidx.media3.exoplayer.a
    public final void t() {
        J();
        this.Y = Math.min(this.Y, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // androidx.media3.exoplayer.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(androidx.media3.common.r[] r5, long r6, long r8, androidx.media3.exoplayer.source.v r10) {
        /*
            r4 = this;
            androidx.media3.exoplayer.image.e r5 = r4.U
            long r5 = r5.b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            java.util.ArrayDeque r5 = r4.R
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.W
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.V
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L26
            goto L31
        L26:
            androidx.media3.exoplayer.image.e r6 = new androidx.media3.exoplayer.image.e
            long r0 = r4.W
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L31:
            androidx.media3.exoplayer.image.e r5 = new androidx.media3.exoplayer.image.e
            r5.<init>(r0, r8)
            r4.U = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.image.g.w(androidx.media3.common.r[], long, long, androidx.media3.exoplayer.source.v):void");
    }

    @Override // androidx.media3.exoplayer.a
    public final void z(long j, long j2) throws j {
        if (this.T) {
            return;
        }
        if (this.Z == null) {
            androidx.media3.common.util.b bVar = this.z;
            bVar.o();
            androidx.media3.decoder.e eVar = this.Q;
            eVar.o();
            int iY = y(bVar, eVar, 2);
            if (iY != -5) {
                if (iY == -4) {
                    com.google.android.material.motion.a.q(eVar.g(4));
                    this.S = true;
                    this.T = true;
                    return;
                }
                return;
            }
            r rVar = (r) bVar.z;
            rVar.getClass();
            this.Z = rVar;
            this.j0 = true;
        }
        if (this.a0 == null) {
            I();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (G(j)) {
            }
            while (H(j)) {
            }
            Trace.endSection();
        } catch (c e) {
            throw g(e, null, false, 4003);
        }
    }
}
