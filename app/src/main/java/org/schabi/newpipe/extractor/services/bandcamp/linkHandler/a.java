package org.schabi.newpipe.extractor.services.bandcamp.linkHandler;

import com.google.android.material.textfield.p;
import com.grack.nanojson.d;
import java.io.IOException;
import java.util.List;
import org.schabi.newpipe.extractor.exceptions.f;
import org.schabi.newpipe.extractor.linkhandler.c;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {
    public static final a c = new a(0);
    public static final a d = new a(1);
    public final /* synthetic */ int b;

    public /* synthetic */ a(int i) {
        this.b = i;
    }

    @Override // org.schabi.newpipe.extractor.linkhandler.c
    public final String B(String str, List list) throws f {
        switch (this.b) {
            case 0:
                com.grack.nanojson.c cVarA = org.schabi.newpipe.extractor.services.bandcamp.extractors.b.a(str);
                if (!cVarA.b("error")) {
                    return org.schabi.newpipe.extractor.utils.f.l(cVarA.f("bandcamp_url", null));
                }
                org.mozilla.javascript.typedarrays.c.b("JSON does not contain a channel URL (invalid id?) or is otherwise invalid");
                return null;
            default:
                return org.schabi.newpipe.extractor.utils.f.l(str);
        }
    }

    @Override // org.schabi.newpipe.extractor.linkhandler.c, com.google.common.base.b
    public String l(String str) throws f {
        switch (this.b) {
            case 0:
                try {
                    return String.valueOf(org.schabi.newpipe.extractor.utils.a.f((String) p.a.r(org.schabi.newpipe.extractor.utils.f.l(str)).B, "data-band").d("id", 0L));
                } catch (d | IOException | ArrayIndexOutOfBoundsException e) {
                    org.mozilla.javascript.typedarrays.c.d("Download failed", e);
                    return null;
                }
            default:
                return super.l(str);
        }
    }

    @Override // com.google.common.base.b
    public final boolean r(String str) {
        switch (this.b) {
            case 0:
                String lowerCase = str.toLowerCase();
                String[] strArrSplit = lowerCase.split("/");
                if (strArrSplit.length != 3 && strArrSplit.length != 4) {
                    return false;
                }
                if ((strArrSplit.length != 4 || strArrSplit[3].equals("releases") || strArrSplit[3].equals("music") || strArrSplit[3].equals("album") || strArrSplit[3].equals("track")) && !strArrSplit[2].equals("daily.bandcamp.com")) {
                    return org.schabi.newpipe.extractor.services.bandcamp.extractors.b.d(lowerCase);
                }
                return false;
            default:
                if (str.toLowerCase().matches("https?://.+\\..+/album/.+")) {
                    return org.schabi.newpipe.extractor.services.bandcamp.extractors.b.d(str);
                }
                return false;
        }
    }
}
