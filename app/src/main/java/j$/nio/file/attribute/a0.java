package j$.nio.file.attribute;

import java.nio.file.attribute.UserPrincipalLookupService;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a0 {
    public final /* synthetic */ UserPrincipalLookupService a;

    public final /* synthetic */ boolean equals(Object obj) {
        UserPrincipalLookupService userPrincipalLookupService = this.a;
        if (obj instanceof a0) {
            obj = ((a0) obj).a;
        }
        return userPrincipalLookupService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    public a0(UserPrincipalLookupService userPrincipalLookupService) {
        this.a = userPrincipalLookupService;
    }
}
