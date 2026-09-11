package org.schabi.newpipe.extractor.timeago;

import j$.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.schabi.newpipe.extractor.services.youtube.extractors.z;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public final String a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final EnumMap i;

    public b(String str, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String[] strArr7) {
        List listAsList = Arrays.asList(strArr);
        List listAsList2 = Arrays.asList(strArr2);
        List listAsList3 = Arrays.asList(strArr3);
        List listAsList4 = Arrays.asList(strArr4);
        List listAsList5 = Arrays.asList(strArr5);
        List listAsList6 = Arrays.asList(strArr6);
        List listAsList7 = Arrays.asList(strArr7);
        this.i = new EnumMap(ChronoUnit.class);
        this.a = str;
        this.b = listAsList;
        this.c = listAsList2;
        this.d = listAsList3;
        this.e = listAsList4;
        this.f = listAsList5;
        this.g = listAsList6;
        this.h = listAsList7;
    }

    public final void a(ChronoUnit chronoUnit, String str) {
        ((Map) this.i.computeIfAbsent(chronoUnit, new z(13))).put(str, 2);
    }
}
