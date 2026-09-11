package com.google.android.gms.internal.measurement;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class vd implements ie {
    public final Context a;
    public String d;
    public final Object c = new Object();
    public final yd b = new yd();

    public vd(oa oaVar) {
        this.a = oaVar.y;
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final be a(Uri uri) throws androidx.datastore.preferences.protobuf.i, ae {
        if (i(uri)) {
            throw new ae("Android backend cannot perform remote operations without a remote backend");
        }
        File fileB = ea.b(h(uri));
        return new be(new FileInputStream(fileB), fileB);
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final boolean b(Uri uri) throws ae {
        if (i(uri)) {
            throw new ae("Android backend cannot perform remote operations without a remote backend");
        }
        return ea.b(h(uri)).exists();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:54:0x0110  */
    /* JADX WARN: Code duplicated, block: B:58:0x0117 A[Catch: all -> 0x012a, TryCatch #1 {all -> 0x012a, blocks: (B:56:0x0113, B:58:0x0117, B:61:0x012c, B:62:0x012e), top: B:82:0x0113 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x013a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0113 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.measurement.ie
    public final File c(Uri uri) throws IOException {
        File externalFilesDir;
        Account account;
        File file;
        String str;
        if (i(uri)) {
            net.luminis.tls.engine.impl.c.t("operation is not permitted in other authorities.");
            return null;
        }
        Context context = this.a;
        if (!uri.getScheme().equals("android")) {
            throw new androidx.datastore.preferences.protobuf.i("Scheme must be 'android'");
        }
        if (uri.getPathSegments().isEmpty()) {
            throw new androidx.datastore.preferences.protobuf.i(String.format("Path must start with a valid logical location: %s", uri));
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new androidx.datastore.preferences.protobuf.i("Did not expect uri to have query");
        }
        ArrayList arrayList = new ArrayList(uri.getPathSegments());
        String str2 = (String) arrayList.get(0);
        switch (str2.hashCode()) {
            case -1820761141:
                if (str2.equals("external")) {
                    externalFilesDir = context.getExternalFilesDir(null);
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!ea.s(context)) {
                        synchronized (this.c) {
                            try {
                                if (this.d == null) {
                                    this.d = e1.b(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                }
                                str = this.d;
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                        if (!file.getAbsolutePath().startsWith(str)) {
                            throw new ae("Cannot access credential-protected data from direct boot");
                        }
                    }
                    return file;
                }
                throw new androidx.datastore.preferences.protobuf.i(String.format("Path must start with a valid logical location: %s", uri));
            case 94416770:
                if (str2.equals("cache")) {
                    externalFilesDir = context.getCacheDir();
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!ea.s(context)) {
                        synchronized (this.c) {
                            if (this.d == null) {
                                this.d = e1.b(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.d;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new ae("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new androidx.datastore.preferences.protobuf.i(String.format("Path must start with a valid logical location: %s", uri));
            case 97434231:
                if (str2.equals("files")) {
                    externalFilesDir = e1.b(context);
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!ea.s(context)) {
                        synchronized (this.c) {
                            if (this.d == null) {
                                this.d = e1.b(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.d;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new ae("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new androidx.datastore.preferences.protobuf.i(String.format("Path must start with a valid logical location: %s", uri));
            case 835260319:
                if (str2.equals("managed")) {
                    File file2 = new File(e1.b(context), "managed");
                    if (arrayList.size() >= 3) {
                        try {
                            String str3 = (String) arrayList.get(2);
                            Account account2 = ud.a;
                            if ("shared".equals(str3)) {
                                account = ud.a;
                            } else {
                                int iIndexOf = str3.indexOf(58);
                                ka.e(iIndexOf >= 0, "Malformed account", new Object[0]);
                                account = new Account(str3.substring(iIndexOf + 1), str3.substring(0, iIndexOf));
                            }
                            if (!ud.a.equals(account)) {
                                throw new androidx.datastore.preferences.protobuf.i("AccountManager cannot be null");
                            }
                        } catch (IllegalArgumentException e) {
                            throw new androidx.datastore.preferences.protobuf.i(e);
                        }
                    }
                    externalFilesDir = file2;
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!ea.s(context)) {
                        synchronized (this.c) {
                            if (this.d == null) {
                                this.d = e1.b(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.d;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new ae("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new androidx.datastore.preferences.protobuf.i(String.format("Path must start with a valid logical location: %s", uri));
            case 988548496:
                if (str2.equals("directboot-cache")) {
                    externalFilesDir = context.createDeviceProtectedStorageContext().getCacheDir();
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!ea.s(context)) {
                        synchronized (this.c) {
                            if (this.d == null) {
                                this.d = e1.b(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.d;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new ae("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new androidx.datastore.preferences.protobuf.i(String.format("Path must start with a valid logical location: %s", uri));
            case 991565957:
                if (str2.equals("directboot-files")) {
                    externalFilesDir = context.createDeviceProtectedStorageContext().getFilesDir();
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!ea.s(context)) {
                        synchronized (this.c) {
                            if (this.d == null) {
                                this.d = e1.b(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.d;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new ae("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new androidx.datastore.preferences.protobuf.i(String.format("Path must start with a valid logical location: %s", uri));
            default:
                throw new androidx.datastore.preferences.protobuf.i(String.format("Path must start with a valid logical location: %s", uri));
        }
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final String d() {
        return "android";
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final OutputStream e(Uri uri) {
        return this.b.e(h(uri));
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void f(Uri uri) throws IOException {
        this.b.f(h(uri));
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void g(Uri uri, Uri uri2) throws IOException {
        this.b.g(h(uri), h(uri2));
    }

    public final Uri h(Uri uri) throws IOException {
        if (i(uri)) {
            throw new androidx.datastore.preferences.protobuf.i("Operation across authorities is not allowed.");
        }
        File fileC = c(uri);
        Uri.Builder builderPath = new Uri.Builder().scheme("file").authority("").path("/");
        com.google.common.collect.d0 d0VarK = com.google.common.collect.h0.k();
        builderPath.path(fileC.getAbsolutePath());
        com.google.common.collect.a1 a1VarG = d0VarK.g();
        Pattern pattern = fe.a;
        return builderPath.encodedFragment(a1VarG.isEmpty() ? null : "transform=".concat(new androidx.media3.container.a("+").d(a1VarG))).build();
    }

    public final boolean i(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.a.getPackageName().equals(uri.getAuthority())) ? false : true;
    }
}
