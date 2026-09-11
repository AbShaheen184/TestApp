package j$.nio.file.attribute;

import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.UserPrincipal;
import javax.security.auth.Subject;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class x implements z {
    public final /* synthetic */ UserPrincipal a;

    public /* synthetic */ x(UserPrincipal userPrincipal) {
        this.a = userPrincipal;
    }

    public static /* synthetic */ z a(UserPrincipal userPrincipal) {
        if (userPrincipal == null) {
            return null;
        }
        if (userPrincipal instanceof y) {
            return ((y) userPrincipal).a;
        }
        return userPrincipal instanceof GroupPrincipal ? new s((GroupPrincipal) userPrincipal) : new x(userPrincipal);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        UserPrincipal userPrincipal = this.a;
        if (obj instanceof x) {
            obj = ((x) obj).a;
        }
        return userPrincipal.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String getName() {
        return this.a.getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(Subject subject) {
        return this.a.implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String toString() {
        return this.a.toString();
    }
}
