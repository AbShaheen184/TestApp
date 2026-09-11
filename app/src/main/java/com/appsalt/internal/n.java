package com.appsalt.internal;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    public final String a;
    public String b;
    public final String c;
    public final String d;
    public final String e;

    public n(String str, String str2, String str3, String str4, String str5) {
        String str6 = Build.VERSION.RELEASE;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!this.a.equals(nVar.a) || !kotlin.jvm.internal.l.a(this.b, nVar.b) || !this.c.equals(nVar.c) || !kotlin.jvm.internal.l.a(this.d, nVar.d) || !kotlin.jvm.internal.l.a(this.e, nVar.e)) {
            return false;
        }
        String str = Build.VERSION.RELEASE;
        if (!kotlin.jvm.internal.l.a(str, str)) {
            return false;
        }
        m mVar = m.a;
        return mVar.equals(mVar);
    }

    public final int hashCode() {
        return ((androidx.constraintlayout.core.g.e(4) + androidx.privacysandbox.ads.adservices.java.internal.a.e((((this.e.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.e((((this.c.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e(-2124253564, 31, this.a), 31, this.b)) * 31) - 1924424521) * 31, 31, this.d)) * 31) - 861391249) * 31, 31, Build.VERSION.RELEASE)) * 31) + 1146009431;
    }

    public final String toString() {
        return "StaticSpecs(cid=HASDKANKTLKTLWQ251023PA, uid=" + this.a + ", aid=" + this.b + ", puid=" + this.c + ", version=1.5.0-SNAPSHOT, appName=" + this.d + ", appPackage=" + this.e + ", osName=android, osVersion=" + Build.VERSION.RELEASE + ", protocol=QUIC_MULTI, features=" + m.a + ')';
    }
}
