package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends n2 {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final m2 k;
    public final s1 l;
    public final p1 m;

    public b0(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, m2 m2Var, s1 s1Var, p1 p1Var) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = m2Var;
        this.l = s1Var;
        this.m = p1Var;
    }

    public final a0 a() {
        a0 a0Var = new a0();
        a0Var.a = this.b;
        a0Var.b = this.c;
        a0Var.c = this.d;
        a0Var.d = this.e;
        a0Var.e = this.f;
        a0Var.f = this.g;
        a0Var.g = this.h;
        a0Var.h = this.i;
        a0Var.i = this.j;
        a0Var.j = this.k;
        a0Var.k = this.l;
        a0Var.l = this.m;
        a0Var.m = (byte) 1;
        return a0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n2) {
            b0 b0Var = (b0) ((n2) obj);
            if (this.b.equals(b0Var.b) && this.c.equals(b0Var.c) && this.d == b0Var.d && this.e.equals(b0Var.e)) {
                String str = b0Var.f;
                String str2 = this.f;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = b0Var.g;
                    String str4 = this.g;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = b0Var.h;
                        String str6 = this.h;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            if (this.i.equals(b0Var.i) && this.j.equals(b0Var.j)) {
                                m2 m2Var = b0Var.k;
                                m2 m2Var2 = this.k;
                                if (m2Var2 != null ? m2Var2.equals(m2Var) : m2Var == null) {
                                    s1 s1Var = b0Var.l;
                                    s1 s1Var2 = this.l;
                                    if (s1Var2 != null ? s1Var2.equals(s1Var) : s1Var == null) {
                                        p1 p1Var = b0Var.m;
                                        p1 p1Var2 = this.m;
                                        if (p1Var2 != null ? p1Var2.equals(p1Var) : p1Var == null) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str = this.f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        m2 m2Var = this.k;
        int iHashCode5 = (iHashCode4 ^ (m2Var == null ? 0 : m2Var.hashCode())) * 1000003;
        s1 s1Var = this.l;
        int iHashCode6 = (iHashCode5 ^ (s1Var == null ? 0 : s1Var.hashCode())) * 1000003;
        p1 p1Var = this.m;
        return iHashCode6 ^ (p1Var != null ? p1Var.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.i + ", displayVersion=" + this.j + ", session=" + this.k + ", ndkPayload=" + this.l + ", appExitInfo=" + this.m + "}";
    }
}
