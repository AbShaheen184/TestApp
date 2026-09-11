package org.schabi.newpipe.extractor.localization;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.OffsetDateTime;
import j$.time.ZoneId;
import j$.time.format.DateTimeParseException;
import java.io.Serializable;
import org.schabi.newpipe.extractor.exceptions.f;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Serializable {
    public final Instant e;
    public final boolean y;

    public b(LocalDateTime localDateTime, boolean z) {
        this(localDateTime.N(ZoneId.systemDefault()).toInstant(), z);
    }

    public static b a(String str) throws f {
        if (str == null) {
            return null;
        }
        try {
            return new b(Instant.parse(str), false);
        } catch (DateTimeParseException e) {
            throw new f(androidx.privacysandbox.ads.adservices.java.internal.a.q("Could not parse date: \"", str, "\""), e);
        }
    }

    public static b b(String str) throws f {
        if (str == null) {
            return null;
        }
        try {
            return new b(OffsetDateTime.parse(str));
        } catch (DateTimeParseException e) {
            throw new f(androidx.privacysandbox.ads.adservices.java.internal.a.q("Could not parse date: \"", str, "\""), e);
        }
    }

    public final String toString() {
        return "DateWrapper{instant=" + this.e + ", isApproximation=" + this.y + "}";
    }

    public b(Instant instant, boolean z) {
        this.e = instant;
        this.y = z;
    }

    public b(OffsetDateTime offsetDateTime) {
        this(offsetDateTime.toInstant(), false);
    }
}
