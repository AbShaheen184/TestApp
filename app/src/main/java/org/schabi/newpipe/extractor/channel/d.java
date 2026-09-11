package org.schabi.newpipe.extractor.channel;

import androidx.emoji2.text.g;
import java.util.ArrayList;
import org.schabi.newpipe.extractor.exceptions.e;
import org.schabi.newpipe.extractor.exceptions.f;
import org.schabi.newpipe.extractor.stream.h;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends g {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, int i2) {
        super(i);
        this.d = i2;
    }

    public void A(h hVar) {
        try {
            ((ArrayList) this.b).add(D(hVar));
        } catch (e unused) {
        } catch (Exception e) {
            a(e);
        }
    }

    public b B(c cVar) {
        b bVar = new b(cVar.getUrl(), 3, cVar.getName(), this.a);
        try {
            cVar.q();
        } catch (Exception e) {
            a(e);
        }
        try {
            cVar.d();
        } catch (Exception e2) {
            a(e2);
        }
        try {
            bVar.B = cVar.o();
        } catch (Exception e3) {
            a(e3);
        }
        try {
            cVar.a();
        } catch (Exception e4) {
            a(e4);
        }
        try {
            cVar.i();
        } catch (Exception e5) {
            a(e5);
        }
        return bVar;
    }

    public org.schabi.newpipe.extractor.playlist.c C(org.schabi.newpipe.extractor.playlist.d dVar) {
        org.schabi.newpipe.extractor.playlist.c cVar = new org.schabi.newpipe.extractor.playlist.c(dVar.getUrl(), 2, dVar.getName(), this.a);
        try {
            cVar.C = dVar.e();
        } catch (Exception e) {
            a(e);
        }
        try {
            dVar.b();
        } catch (Exception e2) {
            a(e2);
        }
        try {
            dVar.c();
        } catch (Exception e3) {
            a(e3);
        }
        try {
            cVar.B = dVar.o();
        } catch (Exception e4) {
            a(e4);
        }
        try {
            dVar.d();
        } catch (Exception e5) {
            a(e5);
        }
        try {
            dVar.a();
        } catch (Exception e6) {
            a(e6);
        }
        try {
            dVar.j();
        } catch (Exception e7) {
            a(e7);
        }
        return cVar;
    }

    public org.schabi.newpipe.extractor.stream.g D(h hVar) throws e {
        if (hVar.g()) {
            throw new e("Found ad");
        }
        org.schabi.newpipe.extractor.stream.g gVar = new org.schabi.newpipe.extractor.stream.g(hVar.getUrl(), this.a, hVar.getName(), hVar.p());
        try {
            gVar.G = hVar.getDuration();
        } catch (Exception e) {
            a(e);
        }
        try {
            gVar.D = hVar.e();
        } catch (Exception e2) {
            a(e2);
        }
        try {
            gVar.E = hVar.m();
        } catch (Exception e3) {
            a(e3);
        }
        try {
            hVar.n();
        } catch (f e4) {
            a(e4);
        }
        try {
            gVar.F = hVar.f();
        } catch (Exception e5) {
            a(e5);
        }
        try {
            gVar.B = hVar.o();
        } catch (Exception e6) {
            a(e6);
        }
        try {
            gVar.H = hVar.b();
        } catch (Exception e7) {
            a(e7);
        }
        try {
            hVar.h();
        } catch (Exception e8) {
            a(e8);
        }
        try {
            gVar.I = hVar.c();
        } catch (Exception e9) {
            a(e9);
        }
        try {
            hVar.r();
        } catch (Exception e10) {
            a(e10);
        }
        try {
            hVar.l();
        } catch (Exception e11) {
            a(e11);
        }
        try {
            hVar.k();
        } catch (Exception e12) {
            a(e12);
        }
        return gVar;
    }

    @Override // androidx.emoji2.text.g
    public /* bridge */ /* synthetic */ void b(org.schabi.newpipe.extractor.d dVar) {
        switch (this.d) {
            case 2:
                A((h) dVar);
                break;
            default:
                super.b(dVar);
                break;
        }
    }

    @Override // androidx.emoji2.text.g
    public final /* bridge */ /* synthetic */ Object f(org.schabi.newpipe.extractor.d dVar) {
        switch (this.d) {
            case 0:
                return B((c) dVar);
            case 1:
                return C((org.schabi.newpipe.extractor.playlist.d) dVar);
            default:
                return D((h) dVar);
        }
    }
}
