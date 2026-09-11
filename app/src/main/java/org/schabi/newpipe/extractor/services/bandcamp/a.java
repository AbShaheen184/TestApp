package org.schabi.newpipe.extractor.services.bandcamp;

import androidx.core.view.w0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.schabi.newpipe.extractor.f;
import org.schabi.newpipe.extractor.linkhandler.b;
import org.schabi.newpipe.extractor.linkhandler.c;
import org.schabi.newpipe.extractor.services.bandcamp.extractors.d;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends w0 {
    public final /* synthetic */ int A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, int i2, String str) {
        super(i, str);
        this.A = i2;
    }

    @Override // androidx.core.view.w0
    public final c b() {
        switch (this.A) {
            case 0:
                return org.schabi.newpipe.extractor.services.bandcamp.linkHandler.a.c;
            case 1:
                return org.schabi.newpipe.extractor.services.media_ccc.linkHandler.a.b;
            default:
                return org.schabi.newpipe.extractor.services.soundcloud.linkHandler.a.c;
        }
    }

    @Override // androidx.core.view.w0
    public final org.schabi.newpipe.extractor.playlist.a d(b bVar) {
        switch (this.A) {
            case 0:
                return new org.schabi.newpipe.extractor.services.bandcamp.extractors.c(this, bVar);
            case 1:
                return null;
            default:
                return new org.schabi.newpipe.extractor.services.peertube.extractors.b(this, bVar, 1);
        }
    }

    @Override // androidx.core.view.w0
    public final c e() {
        switch (this.A) {
            case 0:
                return org.schabi.newpipe.extractor.services.bandcamp.linkHandler.a.d;
            case 1:
                return null;
            default:
                return org.schabi.newpipe.extractor.services.soundcloud.linkHandler.a.d;
        }
    }

    @Override // androidx.core.view.w0
    public final f f(org.schabi.newpipe.extractor.linkhandler.a aVar) {
        int i = 1;
        switch (this.A) {
            case 0:
                String str = aVar.y;
                List list = org.schabi.newpipe.extractor.services.bandcamp.extractors.b.a;
                int i2 = 0;
                return str.toLowerCase().matches("https?://bandcamp\\.com/\\?show=\\d+") ? new d(this, aVar, i2) : new org.schabi.newpipe.extractor.services.bandcamp.extractors.f(this, aVar, i2);
            case 1:
                if (!org.schabi.newpipe.extractor.services.media_ccc.extractors.b.a.matcher(aVar.z).find()) {
                    return new org.schabi.newpipe.extractor.services.media_ccc.extractors.c(this, aVar);
                }
                org.schabi.newpipe.extractor.services.bandcamp.extractors.f fVar = new org.schabi.newpipe.extractor.services.bandcamp.extractors.f(this, aVar, i);
                fVar.f = null;
                fVar.h = "";
                fVar.g = null;
                return fVar;
            default:
                org.schabi.newpipe.extractor.services.soundcloud.extractors.b bVar = new org.schabi.newpipe.extractor.services.soundcloud.extractors.b(this, aVar);
                bVar.f = true;
                return bVar;
        }
    }

    @Override // androidx.core.view.w0
    public final com.google.common.base.b g() {
        switch (this.A) {
            case 0:
                return org.schabi.newpipe.extractor.services.bandcamp.linkHandler.b.b;
            case 1:
                return org.schabi.newpipe.extractor.services.media_ccc.linkHandler.b.b;
            default:
                return org.schabi.newpipe.extractor.services.soundcloud.linkHandler.b.b;
        }
    }

    @Override // androidx.core.view.w0
    public List h() {
        switch (this.A) {
            case 2:
                String[] strArr = {"AU", "CA", "DE", "FR", "GB", "IE", "NL", "NZ", "US"};
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < 9; i++) {
                    arrayList.add(new org.schabi.newpipe.extractor.localization.a(strArr[i]));
                }
                return Collections.unmodifiableList(arrayList);
            default:
                return super.h();
        }
    }
}
