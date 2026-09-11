package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import android.os.SystemClock;
import androidx.compose.animation.core.t2;
import androidx.media3.common.util.j0;
import androidx.media3.datasource.y;
import com.google.common.collect.h0;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements androidx.media3.exoplayer.upstream.i {
    public final androidx.media3.datasource.h A;
    public n B;
    public long C;
    public long D;
    public long E;
    public long F;
    public boolean G;
    public IOException H;
    public boolean I;
    public final /* synthetic */ e J;
    public final Uri e;
    public final String y;
    public final androidx.media3.exoplayer.upstream.n z = new androidx.media3.exoplayer.upstream.n("DefaultHlsPlaylistTracker:MediaPlaylist");

    public c(e eVar, Uri uri, String str) {
        this.J = eVar;
        this.e = uri;
        this.y = str;
        this.A = ((androidx.media3.datasource.g) eVar.e.e).f();
    }

    public final Uri a() {
        n nVar = this.B;
        Uri uri = this.e;
        if (nVar != null) {
            m mVar = nVar.v;
            if (mVar.a != -9223372036854775807L || mVar.e) {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                n nVar2 = this.B;
                if (nVar2.v.e) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(nVar2.k + ((long) nVar2.r.size())));
                    n nVar3 = this.B;
                    if (nVar3.n != -9223372036854775807L) {
                        h0 h0Var = nVar3.s;
                        int size = h0Var.size();
                        if (!h0Var.isEmpty() && ((i) com.google.common.collect.q.k(h0Var)).J) {
                            size--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                m mVar2 = this.B.v;
                if (mVar2.a != -9223372036854775807L) {
                    builderBuildUpon.appendQueryParameter("_HLS_skip", mVar2.b ? "v2" : "YES");
                }
                return builderBuildUpon.build();
            }
        }
        return uri;
    }

    public final void b(Uri uri) {
        e eVar = this.J;
        androidx.media3.exoplayer.upstream.p pVarB = eVar.y.b(eVar.G, this.B);
        Map map = Collections.EMPTY_MAP;
        com.google.android.material.motion.a.m(uri, "The uri must be set.");
        androidx.media3.exoplayer.upstream.q qVar = new androidx.media3.exoplayer.upstream.q(this.A, new androidx.media3.datasource.l(uri, 0L, 1, null, map, 0L, -1L, null, 1), 4, pVarB);
        this.z.f(qVar, this, eVar.z.f(qVar.z));
    }

    public final void c(Uri uri) {
        this.F = 0L;
        if (this.G) {
            return;
        }
        androidx.media3.exoplayer.upstream.n nVar = this.z;
        if (nVar.d() || nVar.c()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.E;
        if (jElapsedRealtime >= j) {
            b(uri);
        } else {
            this.G = true;
            this.J.E.postDelayed(new androidx.activity.c(20, this, uri), j - jElapsedRealtime);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0260  */
    /* JADX WARN: Code duplicated, block: B:101:0x0262 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0264  */
    /* JADX WARN: Code duplicated, block: B:104:0x026f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0273  */
    /* JADX WARN: Code duplicated, block: B:108:0x0287  */
    /* JADX WARN: Code duplicated, block: B:110:0x028f  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:44:0x0104  */
    /* JADX WARN: Code duplicated, block: B:45:0x010b  */
    /* JADX WARN: Code duplicated, block: B:47:0x010e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0113  */
    /* JADX WARN: Code duplicated, block: B:51:0x011a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0121  */
    /* JADX WARN: Code duplicated, block: B:55:0x0129  */
    /* JADX WARN: Code duplicated, block: B:57:0x012d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0130  */
    /* JADX WARN: Code duplicated, block: B:60:0x0133  */
    /* JADX WARN: Code duplicated, block: B:61:0x0135  */
    /* JADX WARN: Code duplicated, block: B:63:0x0142  */
    /* JADX WARN: Code duplicated, block: B:64:0x0149  */
    /* JADX WARN: Code duplicated, block: B:66:0x014c  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ec A[LOOP:0: B:78:0x01e6->B:80:0x01ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:85:0x020b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0213  */
    /* JADX WARN: Code duplicated, block: B:88:0x0226  */
    /* JADX WARN: Code duplicated, block: B:90:0x022d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0231  */
    /* JADX WARN: Code duplicated, block: B:95:0x0245 A[LOOP:1: B:93:0x023f->B:95:0x0245, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x025b A[DONT_INVERT] */
    public final void d(n nVar, androidx.media3.exoplayer.source.n nVar2) {
        boolean z;
        h0 h0Var;
        long j;
        long j2;
        boolean z2;
        n nVar3;
        long j3;
        long j4;
        h0 h0Var2;
        long j5;
        int size;
        int i;
        k kVar;
        long j6;
        n nVar4;
        int i2;
        int i3;
        h0 h0Var3;
        k kVar2;
        int i4;
        n nVar5;
        androidx.datastore.preferences.protobuf.i iVar;
        Uri uri;
        long size2;
        n nVar6;
        androidx.datastore.preferences.protobuf.i iVar2;
        boolean z3;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar;
        Iterator it;
        n nVar7;
        m mVar;
        long j7;
        long j8;
        Iterator it2;
        int size3;
        int size4;
        int size5;
        n nVar8 = this.B;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.C = jElapsedRealtime;
        e eVar = this.J;
        CopyOnWriteArrayList copyOnWriteArrayList = eVar.B;
        if (nVar8 != null) {
            long j9 = nVar.k;
            long j10 = nVar8.k;
            z = j9 > j10 || (j9 >= j10 && ((size3 = nVar.r.size() - nVar8.r.size()) == 0 ? (size4 = nVar.s.size()) > (size5 = nVar8.s.size()) || (size4 == size5 && nVar.o && !nVar8.o) : size3 > 0));
            h0Var = nVar.r;
            j = nVar.k;
            j2 = 0;
            if (z) {
                copyOnWriteArrayList = copyOnWriteArrayList;
                z2 = true;
                if (nVar.p) {
                    j3 = nVar.h;
                } else {
                    nVar3 = eVar.N;
                    if (nVar3 != null) {
                        j3 = nVar3.h;
                    } else {
                        j3 = 0;
                    }
                    if (nVar8 == null) {
                        long j11 = nVar8.h;
                        j4 = nVar8.k;
                        h0Var2 = nVar8.r;
                        j5 = j3;
                        size = h0Var2.size();
                        i = (int) (j - j4);
                        if (i < h0Var2.size()) {
                            kVar = (k) h0Var2.get(i);
                        } else {
                            kVar = null;
                        }
                        if (kVar != null) {
                            j6 = kVar.B;
                        } else if (size == j - j4) {
                            j6 = nVar8.u;
                        }
                        j3 = j11 + j6;
                    }
                    if (nVar.i) {
                        i4 = nVar.j;
                    } else {
                        nVar4 = eVar.N;
                        if (nVar4 != null) {
                            i2 = nVar4.j;
                        } else {
                            i2 = 0;
                        }
                        if (nVar8 == null) {
                            i3 = (int) (j - nVar8.k);
                            h0Var3 = nVar8.r;
                            if (i3 < h0Var3.size()) {
                                kVar2 = (k) h0Var3.get(i3);
                            } else {
                                kVar2 = null;
                            }
                            if (kVar2 != null) {
                                i2 = (nVar8.j + kVar2.A) - ((k) h0Var.get(0)).A;
                            }
                        }
                        i4 = i2;
                    }
                    iVar = null;
                    j = j;
                    nVar5 = new n(nVar.d, nVar.a, nVar.b, nVar.e, nVar.g, j5, true, i4, nVar.k, nVar.l, nVar.m, nVar.n, nVar.c, nVar.o, nVar.p, nVar.q, h0Var, nVar.s, nVar.v, nVar.t, nVar.w, nVar.x);
                }
                j5 = j3;
                if (nVar.i) {
                    i4 = nVar.j;
                } else {
                    nVar4 = eVar.N;
                    if (nVar4 != null) {
                        i2 = nVar4.j;
                    } else {
                        i2 = 0;
                    }
                    if (nVar8 == null) {
                        i3 = (int) (j - nVar8.k);
                        h0Var3 = nVar8.r;
                        if (i3 < h0Var3.size()) {
                            kVar2 = (k) h0Var3.get(i3);
                        } else {
                            kVar2 = null;
                        }
                        if (kVar2 != null) {
                            i2 = (nVar8.j + kVar2.A) - ((k) h0Var.get(0)).A;
                        }
                    }
                    i4 = i2;
                }
                iVar = null;
                j = j;
                nVar5 = new n(nVar.d, nVar.a, nVar.b, nVar.e, nVar.g, j5, true, i4, nVar.k, nVar.l, nVar.m, nVar.n, nVar.c, nVar.o, nVar.p, nVar.q, h0Var, nVar.s, nVar.v, nVar.t, nVar.w, nVar.x);
            } else {
                if (nVar.o) {
                    z2 = true;
                    nVar5 = nVar8;
                } else if (nVar8.o) {
                    nVar5 = nVar8;
                    copyOnWriteArrayList = copyOnWriteArrayList;
                    j = j;
                    iVar = null;
                    z2 = true;
                } else {
                    z2 = true;
                    nVar5 = new n(nVar8.d, nVar8.a, nVar8.b, nVar8.e, nVar8.g, nVar8.h, nVar8.i, nVar8.j, nVar8.k, nVar8.l, nVar8.m, nVar8.n, nVar8.c, true, nVar8.p, nVar8.q, nVar8.r, nVar8.s, nVar8.v, nVar8.t, nVar8.w, nVar8.x);
                }
                iVar = null;
            }
            this.B = nVar5;
            uri = this.e;
            if (nVar5 != nVar8) {
                this.H = iVar;
                this.D = jElapsedRealtime;
                if (uri.equals(eVar.M)) {
                    if (eVar.N == null) {
                        eVar.O = !nVar5.o;
                        eVar.P = nVar5.h;
                    }
                    eVar.N = nVar5;
                    eVar.F.u(nVar5);
                }
                it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    ((v) it2.next()).a();
                }
            } else if (!nVar5.o) {
                size2 = j + ((long) nVar.r.size());
                nVar6 = this.B;
                if (size2 < nVar6.k) {
                    iVar2 = new androidx.datastore.preferences.protobuf.i();
                    z3 = z2;
                } else {
                    if (jElapsedRealtime - this.D > j0.d0(nVar6.m) * 3.5d) {
                        iVar2 = new androidx.datastore.preferences.protobuf.i();
                    } else {
                        iVar2 = iVar;
                    }
                    z3 = false;
                }
                if (iVar2 != null) {
                    this.H = iVar2;
                    lVar = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l(iVar2, z2 ? 1 : 0, 3);
                    it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((v) it.next()).b(uri, lVar, z3);
                    }
                }
            }
            nVar7 = this.B;
            mVar = nVar7.v;
            j7 = nVar7.m;
            if (!mVar.e) {
                if (nVar7 == nVar8) {
                    j8 = nVar7.n;
                    if (j8 != -9223372036854775807L) {
                        j2 = j8 / 2;
                    } else {
                        j7 /= 2;
                    }
                }
                this.E = (j0.d0(j2) + jElapsedRealtime) - nVar2.a;
                if (this.B.o) {
                }
                if (!uri.equals(eVar.M) || this.I) {
                    c(a());
                }
                return;
            }
            if (nVar7 == nVar8) {
                j7 /= 2;
            }
            j2 = j7;
            this.E = (j0.d0(j2) + jElapsedRealtime) - nVar2.a;
            if (this.B.o) {
                if (uri.equals(eVar.M)) {
                }
                c(a());
            }
        }
        nVar.getClass();
        h0Var = nVar.r;
        j = nVar.k;
        j2 = 0;
        if (z) {
            if (nVar.o) {
                z2 = true;
                nVar5 = nVar8;
            } else if (nVar8.o) {
                nVar5 = nVar8;
                copyOnWriteArrayList = copyOnWriteArrayList;
                j = j;
                iVar = null;
                z2 = true;
            } else {
                z2 = true;
                nVar5 = new n(nVar8.d, nVar8.a, nVar8.b, nVar8.e, nVar8.g, nVar8.h, nVar8.i, nVar8.j, nVar8.k, nVar8.l, nVar8.m, nVar8.n, nVar8.c, true, nVar8.p, nVar8.q, nVar8.r, nVar8.s, nVar8.v, nVar8.t, nVar8.w, nVar8.x);
            }
            iVar = null;
        } else {
            copyOnWriteArrayList = copyOnWriteArrayList;
            z2 = true;
            if (nVar.p) {
                j3 = nVar.h;
            } else {
                nVar3 = eVar.N;
                if (nVar3 != null) {
                    j3 = nVar3.h;
                } else {
                    j3 = 0;
                }
                if (nVar8 == null) {
                    long j12 = nVar8.h;
                    j4 = nVar8.k;
                    h0Var2 = nVar8.r;
                    j5 = j3;
                    size = h0Var2.size();
                    i = (int) (j - j4);
                    if (i < h0Var2.size()) {
                        kVar = (k) h0Var2.get(i);
                    } else {
                        kVar = null;
                    }
                    if (kVar != null) {
                        j6 = kVar.B;
                    } else if (size == j - j4) {
                        j6 = nVar8.u;
                    }
                    j3 = j12 + j6;
                }
                if (nVar.i) {
                    i4 = nVar.j;
                } else {
                    nVar4 = eVar.N;
                    if (nVar4 != null) {
                        i2 = nVar4.j;
                    } else {
                        i2 = 0;
                    }
                    if (nVar8 == null) {
                        i3 = (int) (j - nVar8.k);
                        h0Var3 = nVar8.r;
                        if (i3 < h0Var3.size()) {
                            kVar2 = (k) h0Var3.get(i3);
                        } else {
                            kVar2 = null;
                        }
                        if (kVar2 != null) {
                            i2 = (nVar8.j + kVar2.A) - ((k) h0Var.get(0)).A;
                        }
                    }
                    i4 = i2;
                }
                iVar = null;
                j = j;
                nVar5 = new n(nVar.d, nVar.a, nVar.b, nVar.e, nVar.g, j5, true, i4, nVar.k, nVar.l, nVar.m, nVar.n, nVar.c, nVar.o, nVar.p, nVar.q, h0Var, nVar.s, nVar.v, nVar.t, nVar.w, nVar.x);
            }
            j5 = j3;
            if (nVar.i) {
                i4 = nVar.j;
            } else {
                nVar4 = eVar.N;
                if (nVar4 != null) {
                    i2 = nVar4.j;
                } else {
                    i2 = 0;
                }
                if (nVar8 == null) {
                    i3 = (int) (j - nVar8.k);
                    h0Var3 = nVar8.r;
                    if (i3 < h0Var3.size()) {
                        kVar2 = (k) h0Var3.get(i3);
                    } else {
                        kVar2 = null;
                    }
                    if (kVar2 != null) {
                        i2 = (nVar8.j + kVar2.A) - ((k) h0Var.get(0)).A;
                    }
                }
                i4 = i2;
            }
            iVar = null;
            j = j;
            nVar5 = new n(nVar.d, nVar.a, nVar.b, nVar.e, nVar.g, j5, true, i4, nVar.k, nVar.l, nVar.m, nVar.n, nVar.c, nVar.o, nVar.p, nVar.q, h0Var, nVar.s, nVar.v, nVar.t, nVar.w, nVar.x);
        }
        this.B = nVar5;
        uri = this.e;
        if (nVar5 != nVar8) {
            this.H = iVar;
            this.D = jElapsedRealtime;
            if (uri.equals(eVar.M)) {
                if (eVar.N == null) {
                    eVar.O = !nVar5.o;
                    eVar.P = nVar5.h;
                }
                eVar.N = nVar5;
                eVar.F.u(nVar5);
            }
            it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                ((v) it2.next()).a();
            }
        } else if (!nVar5.o) {
            size2 = j + ((long) nVar.r.size());
            nVar6 = this.B;
            if (size2 < nVar6.k) {
                iVar2 = new androidx.datastore.preferences.protobuf.i();
                z3 = z2;
            } else {
                if (jElapsedRealtime - this.D > j0.d0(nVar6.m) * 3.5d) {
                    iVar2 = new androidx.datastore.preferences.protobuf.i();
                } else {
                    iVar2 = iVar;
                }
                z3 = false;
            }
            if (iVar2 != null) {
                this.H = iVar2;
                lVar = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l(iVar2, z2 ? 1 : 0, 3);
                it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((v) it.next()).b(uri, lVar, z3);
                }
            }
        }
        nVar7 = this.B;
        mVar = nVar7.v;
        j7 = nVar7.m;
        if (!mVar.e) {
            if (nVar7 == nVar8) {
                j8 = nVar7.n;
                if (j8 != -9223372036854775807L) {
                    j2 = j8 / 2;
                } else {
                    j7 /= 2;
                }
            }
            this.E = (j0.d0(j2) + jElapsedRealtime) - nVar2.a;
            if (this.B.o) {
                if (uri.equals(eVar.M)) {
                }
                c(a());
            }
        }
        if (nVar7 == nVar8) {
            j7 /= 2;
        }
        j2 = j7;
        this.E = (j0.d0(j2) + jElapsedRealtime) - nVar2.a;
        if (this.B.o) {
            if (uri.equals(eVar.M)) {
            }
            c(a());
        }
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public final androidx.media3.exoplayer.upstream.h e(androidx.media3.exoplayer.upstream.k kVar, long j, long j2, IOException iOException, int i) {
        androidx.media3.exoplayer.upstream.q qVar = (androidx.media3.exoplayer.upstream.q) kVar;
        long j3 = qVar.e;
        int i2 = qVar.z;
        androidx.media3.datasource.l lVar = qVar.y;
        y yVar = qVar.A;
        Uri uri = yVar.z;
        androidx.media3.exoplayer.source.n nVar = new androidx.media3.exoplayer.source.n(lVar, uri, yVar.A, j, j2, yVar.y);
        boolean z = uri.getQueryParameter("_HLS_msn") != null;
        boolean z2 = iOException instanceof s;
        androidx.media3.exoplayer.upstream.h hVar = androidx.media3.exoplayer.upstream.n.e;
        Uri uri2 = this.e;
        e eVar = this.J;
        if (z || z2) {
            int i3 = iOException instanceof androidx.media3.datasource.t ? ((androidx.media3.datasource.t) iOException).z : Integer.MAX_VALUE;
            if (z2 || i3 == 400 || i3 == 503) {
                this.E = SystemClock.elapsedRealtime();
                c(uri2);
                androidx.media3.exoplayer.drm.d dVar = eVar.C;
                String str = j0.a;
                dVar.f(nVar, i2, iOException, true);
                return hVar;
            }
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar2 = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l(iOException, i, 3);
        Iterator it = eVar.B.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= !((v) it.next()).b(uri2, lVar2, false);
        }
        t2 t2Var = eVar.z;
        if (z3) {
            t2Var.getClass();
            long jG = t2.g(lVar2);
            hVar = jG != -9223372036854775807L ? new androidx.media3.exoplayer.upstream.h(jG, 0, false) : androidx.media3.exoplayer.upstream.n.f;
        }
        boolean zA = hVar.a();
        eVar.C.f(nVar, i2, iOException, !zA);
        if (!zA) {
            t2Var.getClass();
        }
        return hVar;
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public final void m(androidx.media3.exoplayer.upstream.k kVar, long j, long j2, int i) {
        androidx.media3.exoplayer.source.n nVar;
        androidx.media3.exoplayer.upstream.q qVar = (androidx.media3.exoplayer.upstream.q) kVar;
        if (i == 0) {
            long j3 = qVar.e;
            nVar = new androidx.media3.exoplayer.source.n(qVar.y, j);
        } else {
            long j4 = qVar.e;
            androidx.media3.datasource.l lVar = qVar.y;
            y yVar = qVar.A;
            nVar = new androidx.media3.exoplayer.source.n(lVar, yVar.z, yVar.A, j, j2, yVar.y);
        }
        this.J.C.g(nVar, qVar.z, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public final void s(androidx.media3.exoplayer.upstream.k kVar, long j, long j2) {
        androidx.media3.exoplayer.upstream.q qVar = (androidx.media3.exoplayer.upstream.q) kVar;
        r rVar = (r) qVar.C;
        androidx.media3.datasource.l lVar = qVar.y;
        y yVar = qVar.A;
        androidx.media3.exoplayer.source.n nVar = new androidx.media3.exoplayer.source.n(lVar, yVar.z, yVar.A, j, j2, yVar.y);
        if (rVar instanceof n) {
            d((n) rVar, nVar);
            this.J.C.d(nVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            androidx.media3.common.j0 j0VarB = androidx.media3.common.j0.b(null, "Loaded playlist has unexpected type.");
            this.H = j0VarB;
            this.J.C.f(nVar, 4, j0VarB, true);
        }
        this.J.z.getClass();
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public final void w(androidx.media3.exoplayer.upstream.k kVar, long j, long j2, boolean z) {
        androidx.media3.exoplayer.upstream.q qVar = (androidx.media3.exoplayer.upstream.q) kVar;
        long j3 = qVar.e;
        androidx.media3.datasource.l lVar = qVar.y;
        y yVar = qVar.A;
        androidx.media3.exoplayer.source.n nVar = new androidx.media3.exoplayer.source.n(lVar, yVar.z, yVar.A, j, j2, yVar.y);
        e eVar = this.J;
        eVar.z.getClass();
        eVar.C.c(nVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
