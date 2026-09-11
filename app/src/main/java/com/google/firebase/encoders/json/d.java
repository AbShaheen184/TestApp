package com.google.firebase.encoders.json;

import com.google.firebase.encoders.g;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements com.google.firebase.encoders.config.a {
    public static final b f;
    public static final b g;
    public final HashMap a;
    public final HashMap b;
    public final a c;
    public boolean d;
    public static final a e = new a(0);
    public static final c h = new c();

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.firebase.encoders.json.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.firebase.encoders.json.b] */
    static {
        final int i = 0;
        f = new com.google.firebase.encoders.f() { // from class: com.google.firebase.encoders.json.b
            @Override // com.google.firebase.encoders.a
            public final void a(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((g) obj2).e((String) obj);
                        break;
                    default:
                        ((g) obj2).f(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i2 = 1;
        g = new com.google.firebase.encoders.f() { // from class: com.google.firebase.encoders.json.b
            @Override // com.google.firebase.encoders.a
            public final void a(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((g) obj2).e((String) obj);
                        break;
                    default:
                        ((g) obj2).f(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public d() {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        this.c = e;
        this.d = false;
        map2.put(String.class, f);
        map.remove(String.class);
        map2.put(Boolean.class, g);
        map.remove(Boolean.class);
        map2.put(Date.class, h);
        map.remove(Date.class);
    }

    public final com.google.firebase.encoders.config.a a(Class cls, com.google.firebase.encoders.d dVar) {
        this.a.put(cls, dVar);
        this.b.remove(cls);
        return this;
    }
}
