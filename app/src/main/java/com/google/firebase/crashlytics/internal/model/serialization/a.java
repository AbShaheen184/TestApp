package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.Base64;
import android.util.JsonReader;
import com.google.android.material.internal.b;
import com.google.firebase.crashlytics.internal.model.a0;
import com.google.firebase.crashlytics.internal.model.a1;
import com.google.firebase.crashlytics.internal.model.a2;
import com.google.firebase.crashlytics.internal.model.b0;
import com.google.firebase.crashlytics.internal.model.b1;
import com.google.firebase.crashlytics.internal.model.b2;
import com.google.firebase.crashlytics.internal.model.c;
import com.google.firebase.crashlytics.internal.model.c0;
import com.google.firebase.crashlytics.internal.model.c1;
import com.google.firebase.crashlytics.internal.model.c2;
import com.google.firebase.crashlytics.internal.model.d0;
import com.google.firebase.crashlytics.internal.model.d1;
import com.google.firebase.crashlytics.internal.model.d2;
import com.google.firebase.crashlytics.internal.model.e;
import com.google.firebase.crashlytics.internal.model.e0;
import com.google.firebase.crashlytics.internal.model.e1;
import com.google.firebase.crashlytics.internal.model.e2;
import com.google.firebase.crashlytics.internal.model.f;
import com.google.firebase.crashlytics.internal.model.f0;
import com.google.firebase.crashlytics.internal.model.f1;
import com.google.firebase.crashlytics.internal.model.f2;
import com.google.firebase.crashlytics.internal.model.g;
import com.google.firebase.crashlytics.internal.model.g0;
import com.google.firebase.crashlytics.internal.model.g1;
import com.google.firebase.crashlytics.internal.model.g2;
import com.google.firebase.crashlytics.internal.model.h;
import com.google.firebase.crashlytics.internal.model.h0;
import com.google.firebase.crashlytics.internal.model.h1;
import com.google.firebase.crashlytics.internal.model.h2;
import com.google.firebase.crashlytics.internal.model.i;
import com.google.firebase.crashlytics.internal.model.i0;
import com.google.firebase.crashlytics.internal.model.i1;
import com.google.firebase.crashlytics.internal.model.i2;
import com.google.firebase.crashlytics.internal.model.j;
import com.google.firebase.crashlytics.internal.model.j0;
import com.google.firebase.crashlytics.internal.model.j1;
import com.google.firebase.crashlytics.internal.model.j2;
import com.google.firebase.crashlytics.internal.model.k;
import com.google.firebase.crashlytics.internal.model.k0;
import com.google.firebase.crashlytics.internal.model.k2;
import com.google.firebase.crashlytics.internal.model.l;
import com.google.firebase.crashlytics.internal.model.l0;
import com.google.firebase.crashlytics.internal.model.l2;
import com.google.firebase.crashlytics.internal.model.m;
import com.google.firebase.crashlytics.internal.model.m0;
import com.google.firebase.crashlytics.internal.model.m2;
import com.google.firebase.crashlytics.internal.model.n;
import com.google.firebase.crashlytics.internal.model.n0;
import com.google.firebase.crashlytics.internal.model.n2;
import com.google.firebase.crashlytics.internal.model.o;
import com.google.firebase.crashlytics.internal.model.o0;
import com.google.firebase.crashlytics.internal.model.o1;
import com.google.firebase.crashlytics.internal.model.p;
import com.google.firebase.crashlytics.internal.model.p0;
import com.google.firebase.crashlytics.internal.model.p1;
import com.google.firebase.crashlytics.internal.model.q;
import com.google.firebase.crashlytics.internal.model.q0;
import com.google.firebase.crashlytics.internal.model.q1;
import com.google.firebase.crashlytics.internal.model.r;
import com.google.firebase.crashlytics.internal.model.r0;
import com.google.firebase.crashlytics.internal.model.r1;
import com.google.firebase.crashlytics.internal.model.s;
import com.google.firebase.crashlytics.internal.model.s0;
import com.google.firebase.crashlytics.internal.model.s1;
import com.google.firebase.crashlytics.internal.model.t;
import com.google.firebase.crashlytics.internal.model.t0;
import com.google.firebase.crashlytics.internal.model.t1;
import com.google.firebase.crashlytics.internal.model.u;
import com.google.firebase.crashlytics.internal.model.u0;
import com.google.firebase.crashlytics.internal.model.u1;
import com.google.firebase.crashlytics.internal.model.v;
import com.google.firebase.crashlytics.internal.model.v0;
import com.google.firebase.crashlytics.internal.model.v1;
import com.google.firebase.crashlytics.internal.model.w;
import com.google.firebase.crashlytics.internal.model.w0;
import com.google.firebase.crashlytics.internal.model.w1;
import com.google.firebase.crashlytics.internal.model.x;
import com.google.firebase.crashlytics.internal.model.x0;
import com.google.firebase.crashlytics.internal.model.x1;
import com.google.firebase.crashlytics.internal.model.y;
import com.google.firebase.crashlytics.internal.model.y0;
import com.google.firebase.crashlytics.internal.model.y1;
import com.google.firebase.crashlytics.internal.model.z;
import com.google.firebase.crashlytics.internal.model.z0;
import com.google.firebase.crashlytics.internal.model.z1;
import com.google.firebase.encoders.json.d;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.mozilla.javascript.ES6Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final b a;

    static {
        d dVar = new d();
        com.google.firebase.crashlytics.internal.model.d dVar2 = com.google.firebase.crashlytics.internal.model.d.a;
        dVar.a(n2.class, dVar2);
        dVar.a(b0.class, dVar2);
        j jVar = j.a;
        dVar.a(m2.class, jVar);
        dVar.a(j0.class, jVar);
        g gVar = g.a;
        dVar.a(u1.class, gVar);
        dVar.a(k0.class, gVar);
        h hVar = h.a;
        dVar.a(t1.class, hVar);
        dVar.a(l0.class, hVar);
        z zVar = z.a;
        dVar.a(l2.class, zVar);
        dVar.a(j1.class, zVar);
        y yVar = y.a;
        dVar.a(k2.class, yVar);
        dVar.a(i1.class, yVar);
        i iVar = i.a;
        dVar.a(v1.class, iVar);
        dVar.a(n0.class, iVar);
        t tVar = t.a;
        dVar.a(j2.class, tVar);
        dVar.a(p0.class, tVar);
        k kVar = k.a;
        dVar.a(d2.class, kVar);
        dVar.a(q0.class, kVar);
        m mVar = m.a;
        dVar.a(b2.class, mVar);
        dVar.a(r0.class, mVar);
        p pVar = p.a;
        dVar.a(a2.class, pVar);
        dVar.a(v0.class, pVar);
        q qVar = q.a;
        dVar.a(z1.class, qVar);
        dVar.a(x0.class, qVar);
        n nVar = n.a;
        dVar.a(x1.class, nVar);
        dVar.a(t0.class, nVar);
        com.google.firebase.crashlytics.internal.model.b bVar = com.google.firebase.crashlytics.internal.model.b.a;
        dVar.a(p1.class, bVar);
        dVar.a(d0.class, bVar);
        com.google.firebase.crashlytics.internal.model.a aVar = com.google.firebase.crashlytics.internal.model.a.a;
        dVar.a(o1.class, aVar);
        dVar.a(e0.class, aVar);
        o oVar = o.a;
        dVar.a(y1.class, oVar);
        dVar.a(u0.class, oVar);
        l lVar = l.a;
        dVar.a(w1.class, lVar);
        dVar.a(s0.class, lVar);
        c cVar = c.a;
        dVar.a(q1.class, cVar);
        dVar.a(f0.class, cVar);
        r rVar = r.a;
        dVar.a(c2.class, rVar);
        dVar.a(z0.class, rVar);
        s sVar = s.a;
        dVar.a(e2.class, sVar);
        dVar.a(b1.class, sVar);
        u uVar = u.a;
        dVar.a(f2.class, uVar);
        dVar.a(c1.class, uVar);
        x xVar = x.a;
        dVar.a(i2.class, xVar);
        dVar.a(g1.class, xVar);
        v vVar = v.a;
        dVar.a(h2.class, vVar);
        dVar.a(e1.class, vVar);
        w wVar = w.a;
        dVar.a(g2.class, wVar);
        dVar.a(f1.class, wVar);
        e eVar = e.a;
        dVar.a(s1.class, eVar);
        dVar.a(g0.class, eVar);
        f fVar = f.a;
        dVar.a(r1.class, fVar);
        dVar.a(h0.class, fVar);
        dVar.d = true;
        a = new b(dVar);
    }

    public static x0 a(JsonReader jsonReader) throws IOException {
        w0 w0Var = new w0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    w0Var.d = jsonReader.nextLong();
                    w0Var.f = (byte) (w0Var.f | 2);
                    break;
                case "symbol":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        com.google.gson.b.h("Null symbol");
                        return null;
                    }
                    w0Var.b = strNextString;
                    break;
                    break;
                case "pc":
                    w0Var.a = jsonReader.nextLong();
                    w0Var.f = (byte) (w0Var.f | 1);
                    break;
                case "file":
                    w0Var.c = jsonReader.nextString();
                    break;
                case "importance":
                    w0Var.e = jsonReader.nextInt();
                    w0Var.f = (byte) (w0Var.f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return w0Var.a();
    }

    public static f0 b(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    com.google.gson.b.h("Null key");
                    return null;
                }
            } else if (strNextName.equals(ES6Iterator.VALUE_PROPERTY)) {
                strNextString2 = jsonReader.nextString();
                if (strNextString2 == null) {
                    com.google.gson.b.h("Null value");
                    return null;
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (strNextString != null && strNextString2 != null) {
            return new f0(strNextString, strNextString2);
        }
        StringBuilder sb = new StringBuilder();
        if (strNextString == null) {
            sb.append(" key");
        }
        if (strNextString2 == null) {
            sb.append(" value");
        }
        net.luminis.tls.engine.impl.c.r(com.google.android.datatransport.runtime.backends.c.s("Missing required properties:", sb));
        return null;
    }

    public static d0 c(JsonReader jsonReader) throws IOException {
        c0 c0Var = new c0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            int i = 8;
            switch (strNextName) {
                case "buildIdMappingForArch":
                    c0Var.i = d(jsonReader, new com.google.firebase.components.s(i));
                    break;
                case "pid":
                    c0Var.a = jsonReader.nextInt();
                    c0Var.j = (byte) (c0Var.j | 1);
                    break;
                case "pss":
                    c0Var.e = jsonReader.nextLong();
                    c0Var.j = (byte) (c0Var.j | 8);
                    break;
                case "rss":
                    c0Var.f = jsonReader.nextLong();
                    c0Var.j = (byte) (c0Var.j | 16);
                    break;
                case "timestamp":
                    c0Var.g = jsonReader.nextLong();
                    c0Var.j = (byte) (c0Var.j | 32);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        com.google.gson.b.h("Null processName");
                        return null;
                    }
                    c0Var.b = strNextString;
                    break;
                    break;
                case "reasonCode":
                    c0Var.c = jsonReader.nextInt();
                    c0Var.j = (byte) (c0Var.j | 2);
                    break;
                case "traceFile":
                    c0Var.h = jsonReader.nextString();
                    break;
                case "importance":
                    c0Var.d = jsonReader.nextInt();
                    c0Var.j = (byte) (c0Var.j | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c0Var.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:105:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:13:0x004c  */
    /* JADX WARN: Code duplicated, block: B:193:0x0311  */
    /* JADX WARN: Code duplicated, block: B:60:0x0101  */
    public static List d(JsonReader jsonReader, com.google.firebase.components.s sVar) throws IOException {
        Object objA;
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            Object e0Var = null;
            switch (sVar.e) {
                case 8:
                    jsonReader.beginObject();
                    String strNextString = null;
                    String strNextString2 = null;
                    String strNextString3 = null;
                    while (true) {
                        if (jsonReader.hasNext()) {
                            String strNextName = jsonReader.nextName();
                            strNextName.getClass();
                            switch (strNextName) {
                                case "libraryName":
                                    strNextString2 = jsonReader.nextString();
                                    if (strNextString2 != null) {
                                        break;
                                    } else {
                                        com.google.gson.b.h("Null libraryName");
                                        break;
                                    }
                                    break;
                                case "arch":
                                    strNextString = jsonReader.nextString();
                                    if (strNextString != null) {
                                        break;
                                    } else {
                                        com.google.gson.b.h("Null arch");
                                        break;
                                    }
                                    break;
                                case "buildId":
                                    strNextString3 = jsonReader.nextString();
                                    if (strNextString3 != null) {
                                        break;
                                    } else {
                                        com.google.gson.b.h("Null buildId");
                                        break;
                                    }
                                    break;
                                default:
                                    jsonReader.skipValue();
                                    break;
                            }
                        } else {
                            jsonReader.endObject();
                            if (strNextString == null || strNextString2 == null || strNextString3 == null) {
                                StringBuilder sb = new StringBuilder();
                                if (strNextString == null) {
                                    sb.append(" arch");
                                }
                                if (strNextString2 == null) {
                                    sb.append(" libraryName");
                                }
                                if (strNextString3 == null) {
                                    sb.append(" buildId");
                                }
                                net.luminis.tls.engine.impl.c.r(com.google.android.datatransport.runtime.backends.c.s("Missing required properties:", sb));
                            } else {
                                e0Var = new e0(strNextString, strNextString2, strNextString3);
                            }
                        }
                    }
                    objA = e0Var;
                    break;
                case 9:
                    jsonReader.beginObject();
                    String strNextString4 = null;
                    byte[] bArrDecode = null;
                    while (true) {
                        if (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            strNextName2.getClass();
                            if (strNextName2.equals("filename")) {
                                strNextString4 = jsonReader.nextString();
                                if (strNextString4 == null) {
                                    com.google.gson.b.h("Null filename");
                                }
                            } else if (strNextName2.equals("contents")) {
                                bArrDecode = Base64.decode(jsonReader.nextString(), 2);
                                if (bArrDecode == null) {
                                    com.google.gson.b.h("Null contents");
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        } else {
                            jsonReader.endObject();
                            if (strNextString4 == null || bArrDecode == null) {
                                StringBuilder sb2 = new StringBuilder();
                                if (strNextString4 == null) {
                                    sb2.append(" filename");
                                }
                                if (bArrDecode == null) {
                                    sb2.append(" contents");
                                }
                                net.luminis.tls.engine.impl.c.r(com.google.android.datatransport.runtime.backends.c.s("Missing required properties:", sb2));
                            } else {
                                e0Var = new h0(strNextString4, bArrDecode);
                            }
                        }
                    }
                    objA = e0Var;
                    break;
                case 10:
                    d1 d1Var = new d1();
                    jsonReader.beginObject();
                    while (true) {
                        if (jsonReader.hasNext()) {
                            String strNextName3 = jsonReader.nextName();
                            strNextName3.getClass();
                            switch (strNextName3) {
                                case "parameterKey":
                                    String strNextString5 = jsonReader.nextString();
                                    if (strNextString5 != null) {
                                        d1Var.b = strNextString5;
                                        break;
                                    } else {
                                        com.google.gson.b.h("Null parameterKey");
                                        break;
                                    }
                                    break;
                                case "templateVersion":
                                    d1Var.d = jsonReader.nextLong();
                                    d1Var.e = (byte) (d1Var.e | 1);
                                    break;
                                case "rolloutVariant":
                                    jsonReader.beginObject();
                                    String strNextString6 = null;
                                    String strNextString7 = null;
                                    while (true) {
                                        if (!jsonReader.hasNext()) {
                                            jsonReader.endObject();
                                            if (strNextString6 == null || strNextString7 == null) {
                                                StringBuilder sb3 = new StringBuilder();
                                                if (strNextString6 == null) {
                                                    sb3.append(" rolloutId");
                                                }
                                                if (strNextString7 == null) {
                                                    sb3.append(" variantId");
                                                }
                                                net.luminis.tls.engine.impl.c.r(com.google.android.datatransport.runtime.backends.c.s("Missing required properties:", sb3));
                                            } else {
                                                d1Var.a = new f1(strNextString6, strNextString7);
                                            }
                                            break;
                                        } else {
                                            String strNextName4 = jsonReader.nextName();
                                            strNextName4.getClass();
                                            if (strNextName4.equals("variantId")) {
                                                strNextString7 = jsonReader.nextString();
                                                if (strNextString7 == null) {
                                                    com.google.gson.b.h("Null variantId");
                                                    break;
                                                }
                                            } else if (strNextName4.equals("rolloutId")) {
                                                strNextString6 = jsonReader.nextString();
                                                if (strNextString6 == null) {
                                                    com.google.gson.b.h("Null rolloutId");
                                                    break;
                                                }
                                            } else {
                                                jsonReader.skipValue();
                                            }
                                        }
                                    }
                                    break;
                                case "parameterValue":
                                    String strNextString8 = jsonReader.nextString();
                                    if (strNextString8 != null) {
                                        d1Var.c = strNextString8;
                                        break;
                                    } else {
                                        com.google.gson.b.h("Null parameterValue");
                                        break;
                                    }
                                    break;
                                default:
                                    jsonReader.skipValue();
                                    break;
                            }
                        } else {
                            jsonReader.endObject();
                            e0Var = d1Var.a();
                        }
                    }
                    objA = e0Var;
                    break;
                case 11:
                    jsonReader.beginObject();
                    byte b = 0;
                    int iNextInt = 0;
                    String strNextString9 = null;
                    List listD = null;
                    while (true) {
                        if (jsonReader.hasNext()) {
                            String strNextName5 = jsonReader.nextName();
                            strNextName5.getClass();
                            switch (strNextName5) {
                                case "frames":
                                    listD = d(jsonReader, new com.google.firebase.components.s(13));
                                    if (listD != null) {
                                        break;
                                    } else {
                                        com.google.gson.b.h("Null frames");
                                        break;
                                    }
                                    break;
                                case "name":
                                    strNextString9 = jsonReader.nextString();
                                    if (strNextString9 == null) {
                                        com.google.gson.b.h("Null name");
                                        break;
                                    }
                                    break;
                                case "importance":
                                    iNextInt = jsonReader.nextInt();
                                    b = (byte) (b | 1);
                                    break;
                                default:
                                    jsonReader.skipValue();
                                    break;
                            }
                        } else {
                            jsonReader.endObject();
                            if (b != 1 || strNextString9 == null || listD == null) {
                                StringBuilder sb4 = new StringBuilder();
                                if (strNextString9 == null) {
                                    sb4.append(" name");
                                }
                                if ((b & 1) == 0) {
                                    sb4.append(" importance");
                                }
                                if (listD == null) {
                                    sb4.append(" frames");
                                }
                                net.luminis.tls.engine.impl.c.r(com.google.android.datatransport.runtime.backends.c.s("Missing required properties:", sb4));
                            } else {
                                e0Var = new v0(strNextString9, iNextInt, listD);
                            }
                        }
                    }
                    objA = e0Var;
                    break;
                case 12:
                    jsonReader.beginObject();
                    byte b2 = 0;
                    String strNextString10 = null;
                    String str = null;
                    long jNextLong = 0;
                    long jNextLong2 = 0;
                    while (true) {
                        if (jsonReader.hasNext()) {
                            String strNextName6 = jsonReader.nextName();
                            strNextName6.getClass();
                            switch (strNextName6) {
                                case "name":
                                    strNextString10 = jsonReader.nextString();
                                    if (strNextString10 != null) {
                                        break;
                                    } else {
                                        com.google.gson.b.h("Null name");
                                        break;
                                    }
                                    break;
                                case "size":
                                    b2 = (byte) (b2 | 2);
                                    jNextLong2 = jsonReader.nextLong();
                                    break;
                                case "uuid":
                                    str = new String(Base64.decode(jsonReader.nextString(), 2), n2.a);
                                    break;
                                case "baseAddress":
                                    b2 = (byte) (b2 | 1);
                                    jNextLong = jsonReader.nextLong();
                                    break;
                                default:
                                    jsonReader.skipValue();
                                    break;
                            }
                        } else {
                            jsonReader.endObject();
                            if (b2 != 3 || strNextString10 == null) {
                                StringBuilder sb5 = new StringBuilder();
                                if ((b2 & 1) == 0) {
                                    sb5.append(" baseAddress");
                                }
                                if ((b2 & 2) == 0) {
                                    sb5.append(" size");
                                }
                                if (strNextString10 == null) {
                                    sb5.append(" name");
                                }
                                net.luminis.tls.engine.impl.c.r(com.google.android.datatransport.runtime.backends.c.s("Missing required properties:", sb5));
                            } else {
                                e0Var = new s0(jNextLong, jNextLong2, strNextString10, str);
                            }
                        }
                    }
                    objA = e0Var;
                    break;
                default:
                    objA = a(jsonReader);
                    break;
            }
            arrayList.add(objA);
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:111:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:157:0x024e  */
    /* JADX WARN: Code duplicated, block: B:242:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [com.google.firebase.crashlytics.internal.model.t0] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [com.google.firebase.crashlytics.internal.model.p1] */
    /* JADX WARN: Type inference failed for: r24v2, types: [com.google.firebase.crashlytics.internal.model.d0] */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [com.google.firebase.crashlytics.internal.model.u0] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public static p0 e(JsonReader jsonReader) throws IOException {
        byte b;
        o0 o0Var = new o0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "device":
                    b = 0;
                    break;
                case "rollouts":
                    b = 1;
                    break;
                case "app":
                    b = 2;
                    break;
                case "log":
                    b = 3;
                    break;
                case "type":
                    b = 4;
                    break;
                case "timestamp":
                    b = 5;
                    break;
                default:
                    b = -1;
                    break;
            }
            p0 p0Var = null;
            switch (b) {
                case 0:
                    a1 a1Var = new a1();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        switch (strNextName2) {
                            case "batteryLevel":
                                a1Var.a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case "batteryVelocity":
                                a1Var.b = jsonReader.nextInt();
                                a1Var.g = (byte) (a1Var.g | 1);
                                break;
                            case "orientation":
                                a1Var.d = jsonReader.nextInt();
                                a1Var.g = (byte) (a1Var.g | 4);
                                break;
                            case "diskUsed":
                                a1Var.f = jsonReader.nextLong();
                                a1Var.g = (byte) (a1Var.g | 16);
                                break;
                            case "ramUsed":
                                a1Var.e = jsonReader.nextLong();
                                a1Var.g = (byte) (a1Var.g | 8);
                                break;
                            case "proximityOn":
                                a1Var.c = jsonReader.nextBoolean();
                                a1Var.g = (byte) (a1Var.g | 2);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    o0Var.d = a1Var.a();
                    break;
                case 1:
                    jsonReader.beginObject();
                    List listD = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        if (strNextName3.equals("assignments")) {
                            listD = d(jsonReader, new com.google.firebase.components.s(10));
                            if (listD == null) {
                                com.google.gson.b.h("Null rolloutAssignments");
                                return null;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (listD == null) {
                        net.luminis.tls.engine.impl.c.r("Missing required properties: rolloutAssignments");
                        return null;
                    }
                    o0Var.f = new g1(listD);
                    break;
                    break;
                case 2:
                    jsonReader.beginObject();
                    r0 r0Var = null;
                    List listUnmodifiableList = null;
                    List listUnmodifiableList2 = null;
                    Boolean boolValueOf = null;
                    z0 z0VarG = null;
                    List listUnmodifiableList3 = null;
                    byte b2 = 0;
                    int iNextInt = 0;
                    while (true) {
                        p0 p0Var2 = p0Var;
                        if (!jsonReader.hasNext()) {
                            jsonReader.endObject();
                            if (b2 == 1 && r0Var != null) {
                                o0Var.c = new q0(r0Var, listUnmodifiableList, listUnmodifiableList2, boolValueOf, z0VarG, listUnmodifiableList3, iNextInt);
                                break;
                            }
                            StringBuilder sb = new StringBuilder();
                            if (r0Var == null) {
                                sb.append(" execution");
                            }
                            if (b2 == 0) {
                                sb.append(" uiOrientation");
                            }
                            net.luminis.tls.engine.impl.c.r(com.google.android.datatransport.runtime.backends.c.s("Missing required properties:", sb));
                            return p0Var2;
                        }
                        String strNextName4 = jsonReader.nextName();
                        strNextName4.getClass();
                        switch (strNextName4) {
                            case "appProcessDetails":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(g(jsonReader));
                                }
                                jsonReader.endArray();
                                listUnmodifiableList3 = Collections.unmodifiableList(arrayList);
                                p0Var = p0Var2;
                                break;
                            case "background":
                                boolValueOf = Boolean.valueOf(jsonReader.nextBoolean());
                                p0Var = p0Var2;
                                break;
                            case "execution":
                                jsonReader.beginObject();
                                ?? D = p0Var2;
                                ?? F = D;
                                ?? C = F;
                                ?? u0Var = C;
                                ?? r26 = u0Var;
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "appExitInfo":
                                            C = c(jsonReader);
                                            break;
                                        case "threads":
                                            D = d(jsonReader, new com.google.firebase.components.s(11));
                                            break;
                                        case "signal":
                                            jsonReader.beginObject();
                                            long jNextLong = 0;
                                            byte b3 = 0;
                                            ?? NextString = p0Var2;
                                            ?? NextString2 = NextString;
                                            while (jsonReader.hasNext()) {
                                                String strNextName6 = jsonReader.nextName();
                                                strNextName6.getClass();
                                                switch (strNextName6) {
                                                    case "address":
                                                        b3 = (byte) (b3 | 1);
                                                        jNextLong = jsonReader.nextLong();
                                                        break;
                                                    case "code":
                                                        NextString2 = jsonReader.nextString();
                                                        if (NextString2 == 0) {
                                                            com.google.gson.b.h("Null code");
                                                            return p0Var2;
                                                        }
                                                        break;
                                                        break;
                                                    case "name":
                                                        NextString = jsonReader.nextString();
                                                        if (NextString == 0) {
                                                            com.google.gson.b.h("Null name");
                                                            return p0Var2;
                                                        }
                                                        break;
                                                        break;
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            if (b3 == 1 && NextString != 0 && NextString2 != 0) {
                                                u0Var = new u0(jNextLong, NextString, NextString2);
                                                break;
                                            } else {
                                                StringBuilder sb2 = new StringBuilder();
                                                if (NextString == 0) {
                                                    sb2.append(" name");
                                                }
                                                if (NextString2 == 0) {
                                                    sb2.append(" code");
                                                }
                                                if ((b3 & 1) == 0) {
                                                    sb2.append(" address");
                                                }
                                                net.luminis.tls.engine.impl.c.r(com.google.android.datatransport.runtime.backends.c.s("Missing required properties:", sb2));
                                                return p0Var2;
                                            }
                                            break;
                                        case "binaries":
                                            List listD2 = d(jsonReader, new com.google.firebase.components.s(12));
                                            F = F;
                                            r26 = listD2;
                                            if (listD2 == null) {
                                                com.google.gson.b.h("Null binaries");
                                                return p0Var2;
                                            }
                                            break;
                                        case "exception":
                                            F = f(jsonReader);
                                            r26 = r26;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            F = F;
                                            r26 = r26;
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (u0Var != 0 && r26 != 0) {
                                    r0Var = new r0(D, F, C, u0Var, r26);
                                    p0Var = p0Var2;
                                    break;
                                } else {
                                    StringBuilder sb3 = new StringBuilder();
                                    if (u0Var == 0) {
                                        sb3.append(" signal");
                                    }
                                    if (r26 == 0) {
                                        sb3.append(" binaries");
                                    }
                                    net.luminis.tls.engine.impl.c.r(com.google.android.datatransport.runtime.backends.c.s("Missing required properties:", sb3));
                                    return p0Var2;
                                }
                                break;
                            case "internalKeys":
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                listUnmodifiableList2 = Collections.unmodifiableList(arrayList2);
                                p0Var = p0Var2;
                                break;
                            case "customAttributes":
                                ArrayList arrayList3 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList3.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                listUnmodifiableList = Collections.unmodifiableList(arrayList3);
                                p0Var = p0Var2;
                                break;
                            case "uiOrientation":
                                iNextInt = jsonReader.nextInt();
                                b2 = (byte) 1;
                                p0Var = p0Var2;
                                break;
                            case "currentProcessDetails":
                                z0VarG = g(jsonReader);
                                p0Var = p0Var2;
                                break;
                            default:
                                jsonReader.skipValue();
                                p0Var = p0Var2;
                                break;
                        }
                    }
                    break;
                case 3:
                    jsonReader.beginObject();
                    String strNextString = null;
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("content")) {
                            strNextString = jsonReader.nextString();
                            if (strNextString == null) {
                                com.google.gson.b.h("Null content");
                                return null;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (strNextString == null) {
                        net.luminis.tls.engine.impl.c.r("Missing required properties: content");
                        return null;
                    }
                    o0Var.e = new c1(strNextString);
                    break;
                    break;
                case 4:
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        com.google.gson.b.h("Null type");
                        return null;
                    }
                    o0Var.b = strNextString2;
                    break;
                    break;
                case 5:
                    o0Var.a = jsonReader.nextLong();
                    o0Var.g = (byte) (o0Var.g | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return o0Var.a();
    }

    public static t0 f(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        byte b = 0;
        int iNextInt = 0;
        String strNextString = null;
        String strNextString2 = null;
        List listD = null;
        t0 t0VarF = null;
        while (true) {
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (b == 1 && strNextString != null && listD != null) {
                    return new t0(strNextString, strNextString2, listD, t0VarF, iNextInt);
                }
                StringBuilder sb = new StringBuilder();
                if (strNextString == null) {
                    sb.append(" type");
                }
                if (listD == null) {
                    sb.append(" frames");
                }
                if ((b & 1) == 0) {
                    sb.append(" overflowCount");
                }
                net.luminis.tls.engine.impl.c.r(com.google.android.datatransport.runtime.backends.c.s("Missing required properties:", sb));
                return null;
            }
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    listD = d(jsonReader, new com.google.firebase.components.s(13));
                    if (listD == null) {
                        com.google.gson.b.h("Null frames");
                        return null;
                    }
                    break;
                    break;
                case "reason":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "type":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        com.google.gson.b.h("Null type");
                        return null;
                    }
                    break;
                    break;
                case "causedBy":
                    t0VarF = f(jsonReader);
                    break;
                case "overflowCount":
                    iNextInt = jsonReader.nextInt();
                    b = (byte) (b | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }

    public static z0 g(JsonReader jsonReader) throws IOException {
        y0 y0Var = new y0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    y0Var.b = jsonReader.nextInt();
                    y0Var.e = (byte) (y0Var.e | 1);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        com.google.gson.b.h("Null processName");
                        return null;
                    }
                    y0Var.a = strNextString;
                    break;
                    break;
                case "defaultProcess":
                    y0Var.d = jsonReader.nextBoolean();
                    y0Var.e = (byte) (y0Var.e | 4);
                    break;
                case "importance":
                    y0Var.c = jsonReader.nextInt();
                    y0Var.e = (byte) (y0Var.e | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return y0Var.a();
    }

    public static b0 h(JsonReader jsonReader) throws IOException {
        Charset charset = n2.a;
        a0 a0Var = new a0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            int i = 9;
            switch (strNextName) {
                case "ndkPayload":
                    jsonReader.beginObject();
                    List listD = null;
                    String strNextString = null;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("files")) {
                            listD = d(jsonReader, new com.google.firebase.components.s(i));
                            if (listD == null) {
                                com.google.gson.b.h("Null files");
                                return null;
                            }
                        } else if (strNextName2.equals("orgId")) {
                            strNextString = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (listD == null) {
                        net.luminis.tls.engine.impl.c.r("Missing required properties: files");
                        return null;
                    }
                    a0Var.k = new g0(listD, strNextString);
                    continue;
                    break;
                    break;
                case "sdkVersion":
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        com.google.gson.b.h("Null sdkVersion");
                        return null;
                    }
                    a0Var.a = strNextString2;
                    break;
                    break;
                case "appQualitySessionId":
                    a0Var.g = jsonReader.nextString();
                    break;
                case "appExitInfo":
                    a0Var.l = c(jsonReader);
                    break;
                case "buildVersion":
                    String strNextString3 = jsonReader.nextString();
                    if (strNextString3 == null) {
                        com.google.gson.b.h("Null buildVersion");
                        return null;
                    }
                    a0Var.h = strNextString3;
                    break;
                    break;
                case "firebaseAuthenticationToken":
                    a0Var.f = jsonReader.nextString();
                    break;
                case "gmpAppId":
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        com.google.gson.b.h("Null gmpAppId");
                        return null;
                    }
                    a0Var.b = strNextString4;
                    break;
                    break;
                case "installationUuid":
                    String strNextString5 = jsonReader.nextString();
                    if (strNextString5 == null) {
                        com.google.gson.b.h("Null installationUuid");
                        return null;
                    }
                    a0Var.d = strNextString5;
                    break;
                    break;
                case "firebaseInstallationId":
                    a0Var.e = jsonReader.nextString();
                    break;
                case "platform":
                    a0Var.c = jsonReader.nextInt();
                    a0Var.m = (byte) (a0Var.m | 1);
                    break;
                case "displayVersion":
                    String strNextString6 = jsonReader.nextString();
                    if (strNextString6 == null) {
                        com.google.gson.b.h("Null displayVersion");
                        return null;
                    }
                    a0Var.i = strNextString6;
                    break;
                    break;
                case "session":
                    i0 i0Var = new i0();
                    i0Var.f = false;
                    i0Var.m = (byte) (i0Var.m | 2);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        switch (strNextName3) {
                            case "startedAt":
                                i0Var.d = jsonReader.nextLong();
                                i0Var.m = (byte) (i0Var.m | 1);
                                break;
                            case "appQualitySessionId":
                                i0Var.c = jsonReader.nextString();
                                break;
                            case "identifier":
                                i0Var.b = new String(Base64.decode(jsonReader.nextString(), 2), n2.a);
                                break;
                            case "endedAt":
                                i0Var.e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "device":
                                m0 m0Var = new m0();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.getClass();
                                    switch (strNextName4) {
                                        case "simulator":
                                            m0Var.f = jsonReader.nextBoolean();
                                            m0Var.j = (byte) (m0Var.j | 16);
                                            break;
                                        case "manufacturer":
                                            String strNextString7 = jsonReader.nextString();
                                            if (strNextString7 == null) {
                                                com.google.gson.b.h("Null manufacturer");
                                                return null;
                                            }
                                            m0Var.h = strNextString7;
                                            break;
                                            break;
                                        case "ram":
                                            m0Var.d = jsonReader.nextLong();
                                            m0Var.j = (byte) (m0Var.j | 4);
                                            break;
                                        case "arch":
                                            m0Var.a = jsonReader.nextInt();
                                            m0Var.j = (byte) (m0Var.j | 1);
                                            break;
                                        case "diskSpace":
                                            m0Var.e = jsonReader.nextLong();
                                            m0Var.j = (byte) (m0Var.j | 8);
                                            break;
                                        case "cores":
                                            m0Var.c = jsonReader.nextInt();
                                            m0Var.j = (byte) (m0Var.j | 2);
                                            break;
                                        case "model":
                                            String strNextString8 = jsonReader.nextString();
                                            if (strNextString8 == null) {
                                                com.google.gson.b.h("Null model");
                                                return null;
                                            }
                                            m0Var.b = strNextString8;
                                            break;
                                            break;
                                        case "state":
                                            m0Var.g = jsonReader.nextInt();
                                            m0Var.j = (byte) (m0Var.j | 32);
                                            break;
                                        case "modelClass":
                                            String strNextString9 = jsonReader.nextString();
                                            if (strNextString9 == null) {
                                                com.google.gson.b.h("Null modelClass");
                                                return null;
                                            }
                                            m0Var.i = strNextString9;
                                            break;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                i0Var.j = m0Var.a();
                                break;
                            case "events":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(e(jsonReader));
                                }
                                jsonReader.endArray();
                                i0Var.k = Collections.unmodifiableList(arrayList);
                                break;
                            case "os":
                                h1 h1Var = new h1();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "buildVersion":
                                            String strNextString10 = jsonReader.nextString();
                                            if (strNextString10 == null) {
                                                com.google.gson.b.h("Null buildVersion");
                                                return null;
                                            }
                                            h1Var.c = strNextString10;
                                            break;
                                            break;
                                        case "jailbroken":
                                            h1Var.d = jsonReader.nextBoolean();
                                            h1Var.e = (byte) (h1Var.e | 2);
                                            break;
                                        case "version":
                                            String strNextString11 = jsonReader.nextString();
                                            if (strNextString11 == null) {
                                                com.google.gson.b.h("Null version");
                                                return null;
                                            }
                                            h1Var.b = strNextString11;
                                            break;
                                            break;
                                        case "platform":
                                            h1Var.a = jsonReader.nextInt();
                                            h1Var.e = (byte) (h1Var.e | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                i0Var.i = h1Var.a();
                                break;
                            case "app":
                                jsonReader.beginObject();
                                String strNextString12 = null;
                                String strNextString13 = null;
                                String strNextString14 = null;
                                String strNextString15 = null;
                                String strNextString16 = null;
                                String strNextString17 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName6 = jsonReader.nextName();
                                    strNextName6.getClass();
                                    switch (strNextName6) {
                                        case "identifier":
                                            strNextString17 = jsonReader.nextString();
                                            if (strNextString17 == null) {
                                                com.google.gson.b.h("Null identifier");
                                                return null;
                                            }
                                            break;
                                            break;
                                        case "developmentPlatform":
                                            strNextString15 = jsonReader.nextString();
                                            break;
                                        case "developmentPlatformVersion":
                                            strNextString16 = jsonReader.nextString();
                                            break;
                                        case "version":
                                            strNextString12 = jsonReader.nextString();
                                            if (strNextString12 == null) {
                                                com.google.gson.b.h("Null version");
                                                return null;
                                            }
                                            break;
                                            break;
                                        case "installationUuid":
                                            strNextString14 = jsonReader.nextString();
                                            break;
                                        case "displayVersion":
                                            strNextString13 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (strNextString17 != null && strNextString12 != null) {
                                    i0Var.g = new k0(strNextString17, strNextString12, strNextString13, strNextString14, strNextString15, strNextString16);
                                    break;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    if (strNextString17 == null) {
                                        sb.append(" identifier");
                                    }
                                    if (strNextString12 == null) {
                                        sb.append(" version");
                                    }
                                    net.luminis.tls.engine.impl.c.r(com.google.android.datatransport.runtime.backends.c.s("Missing required properties:", sb));
                                    return null;
                                }
                                break;
                            case "user":
                                jsonReader.beginObject();
                                String strNextString18 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        strNextString18 = jsonReader.nextString();
                                        if (strNextString18 == null) {
                                            com.google.gson.b.h("Null identifier");
                                            return null;
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (strNextString18 == null) {
                                    net.luminis.tls.engine.impl.c.r("Missing required properties: identifier");
                                    return null;
                                }
                                i0Var.h = new j1(strNextString18);
                                break;
                                break;
                            case "generator":
                                String strNextString19 = jsonReader.nextString();
                                if (strNextString19 == null) {
                                    com.google.gson.b.h("Null generator");
                                    return null;
                                }
                                i0Var.a = strNextString19;
                                break;
                                break;
                            case "crashed":
                                i0Var.f = jsonReader.nextBoolean();
                                i0Var.m = (byte) (i0Var.m | 2);
                                break;
                            case "generatorType":
                                i0Var.l = jsonReader.nextInt();
                                i0Var.m = (byte) (i0Var.m | 4);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    a0Var.j = i0Var.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a0Var.a();
    }

    public static b0 i(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                b0 b0VarH = h(jsonReader);
                jsonReader.close();
                return b0VarH;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
