package org.schabi.newpipe.extractor.downloader;

import com.google.android.gms.common.api.internal.m;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import org.schabi.newpipe.extractor.localization.c;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final String a;
    public final String b;
    public final Map c;
    public final byte[] d;
    public final c e;

    public a(m mVar) {
        String str = (String) mVar.y;
        String str2 = (String) mVar.z;
        LinkedHashMap linkedHashMap = (LinkedHashMap) mVar.A;
        byte[] bArr = (byte[]) mVar.B;
        c cVar = (c) mVar.C;
        boolean z = mVar.e;
        Objects.requireNonNull(str, "Request's httpMethod is null");
        this.a = str;
        Objects.requireNonNull(str2, "Request's url is null");
        this.b = str2;
        this.d = bArr;
        this.e = cVar;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (linkedHashMap != null) {
            linkedHashMap2.putAll(linkedHashMap);
        }
        if (z && cVar != null) {
            String str3 = cVar.e;
            if (!cVar.a().isEmpty()) {
                str3 = cVar.b() + ", " + str3 + ";q=0.9";
            }
            linkedHashMap2.putAll(Collections.singletonMap("Accept-Language", Collections.singletonList(str3)));
        }
        this.c = Collections.unmodifiableMap(linkedHashMap2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c) && Arrays.equals(this.d, aVar.d) && Objects.equals(this.e, aVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.d) + (Objects.hash(this.a, this.b, this.c, this.e) * 31);
    }
}
