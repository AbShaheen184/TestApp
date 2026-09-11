package org.schabi.newpipe.extractor.services.bandcamp.extractors.streaminfoitem;

import androidx.constraintlayout.core.g;
import androidx.core.view.w0;
import com.grack.nanojson.c;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.schabi.newpipe.extractor.exceptions.d;
import org.schabi.newpipe.extractor.exceptions.f;
import org.schabi.newpipe.extractor.localization.b;
import org.schabi.newpipe.extractor.stream.h;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements h {
    public final String a;
    public final c b;
    public List c = Collections.EMPTY_LIST;
    public final w0 d;

    public a(c cVar, String str, w0 w0Var) {
        this.a = str;
        this.b = cVar;
        this.d = w0Var;
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final String b() {
        return this.a;
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final boolean c() {
        return false;
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final String e() {
        return "";
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final long f() {
        return -1L;
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final boolean g() {
        return false;
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final long getDuration() {
        return this.b.d("duration", 0L);
    }

    @Override // org.schabi.newpipe.extractor.d
    public final String getName() {
        return this.b.f("title", null);
    }

    @Override // org.schabi.newpipe.extractor.d
    public final String getUrl() {
        String strF = this.b.f("title_link", null);
        if (strF != null) {
            return g.c(this.a, strF);
        }
        return null;
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final String m() {
        return null;
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final b n() {
        return null;
    }

    @Override // org.schabi.newpipe.extractor.d
    public final List o() throws f {
        List list = this.c;
        if (!list.isEmpty() || getUrl() == null) {
            return list;
        }
        try {
            w0 w0Var = this.d;
            org.schabi.newpipe.extractor.f fVarF = w0Var.f(w0Var.g().i(getUrl()));
            fVarF.b();
            return fVarF.J();
        } catch (IOException | d e) {
            org.mozilla.javascript.typedarrays.c.d("Could not download cover art location", e);
            return null;
        }
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final int p() {
        return 3;
    }
}
